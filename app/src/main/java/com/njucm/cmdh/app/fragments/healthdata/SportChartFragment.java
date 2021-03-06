package com.njucm.cmdh.app.fragments.healthdata;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.beardedhen.androidbootstrap.FontAwesomeText;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.njucm.cmdh.app.MyApplication;
import com.njucm.cmdh.app.R;
import com.njucm.cmdh.app.activitys.SportRecordEnteringActivity;
import com.njucm.cmdh.app.fragments.BaseFragment;
import com.njucm.cmdh.app.service.ServiceGenerator;
import com.njucm.cmdh.app.utils.RequestClient;
import com.njucm.cmdh.app.widgetlibrary.CustomFAB;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import butterknife.ButterKnife;
import butterknife.InjectView;
import in.srain.cube.request.JsonData;
import lecho.lib.hellocharts.listener.ColumnChartOnValueSelectListener;
import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.Column;
import lecho.lib.hellocharts.model.ColumnChartData;
import lecho.lib.hellocharts.model.SubcolumnValue;
import lecho.lib.hellocharts.util.ChartUtils;
import lecho.lib.hellocharts.view.ColumnChartView;
public class SportChartFragment extends BaseFragment {
    MyApplication myApplication;
    private static final String TAG = "sportfragmentTest";
    private FontAwesomeText fontAwesomeTextleft;
    private FontAwesomeText fontAwesomeTextright;
    private TextView textViewDatechange;
    private TextView testViewBegin;
    private TextView testViewFinish;
    private TextView textViewStempnumber;
    private TextView textViewMoveDistance;
    private TextView textViewTotalcalorieConsume;
    @InjectView(R.id.tv_crawedfloor_value)
    TextView textViewCrawFloor;
    @InjectView(R.id.tv_fallitems_value)
    TextView textViewFallItems;
    @InjectView(R.id.tv_movecolorieconsume_value)
    TextView textViewMoveCalorieConsume;
    @InjectView(R.id.tv_staticcolorieconsume_value)
    TextView textViewStaticCaloriConsume;
    @InjectView(R.id.tv_longestactivetime_value)
    TextView textViewLongsetActive;
    @InjectView(R.id.tv_longestidletime_value)
    TextView textViewLongestIdle;
    @InjectView(R.id.tv_sport_analysis_content)
    TextView textViewSportAnalysis;
    @InjectView(R.id.btv_thumbs_icon)
    FontAwesomeText fontAwesomeTextThumbs;
    @InjectView(R.id.btv_share_icon)
    FontAwesomeText fontAwesomeTextShare;
    @InjectView(R.id.fab_sportrecords_add)
    CustomFAB customFABAdd;
    private Calendar calendar;
    private SimpleDateFormat simpleDateFormat;
    private int userid = 11;
    private static JsonData sportJsondata = null;
    private RequestClient requestClient;
    private SimpleDateFormat simpleDateFormatTime;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreateView(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_sport_data);
        ButterKnife.inject(this, getContentView());
        myApplication = (MyApplication)getApplicationContext();
        fontAwesomeTextleft = (FontAwesomeText) findViewById(R.id.btv_leftarrow);
        fontAwesomeTextright = (FontAwesomeText) findViewById(R.id.btv_rightarrow);
        textViewDatechange = (TextView) findViewById(R.id.tv_datachange);
        calendar = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormatTime = new SimpleDateFormat("HH:mm");
        calendar.setTime(new Date());
        textViewDatechange.setText(DateToString(calendar.getTime()));
        testViewBegin = (TextView) findViewById(R.id.tv_sport_begin);
        testViewFinish = (TextView) findViewById(R.id.tv_sport_finish);
        textViewMoveDistance = (TextView) findViewById(R.id.tv_movedistance_value);
        textViewStempnumber = (TextView) findViewById(R.id.tv_stepnumber_value);
        textViewTotalcalorieConsume = (TextView) findViewById(R.id.tv_calorieconsume_value);
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle(getResources().getString(R.string.loadingtitle));
        progressDialog.setMessage(getResources().getString(R.string.loadingtext));
        progressDialog.setCancelable(false);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();//获取屏幕尺寸
        int w_screen = displayMetrics.widthPixels;
        int h_screen = displayMetrics.heightPixels;
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        try {
            requestClient = ServiceGenerator.createService(RequestClient.class, MyApplication.myUrl, gson, getApplicationContext());
        } catch (Exception e) {
            Log.d("errorinfo", e.getMessage());
        }
        new MyAsyncTask().execute("sportsingle", String.valueOf(userid), simpleDateFormat.format(new Date()));
        fontAwesomeTextleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Date date = simpleDateFormat.parse(textViewDatechange.getText().toString().trim());
                    calendar.setTime(date);
                    calendar.add(Calendar.DAY_OF_MONTH, -1);
                } catch (ParseException e) {
                    Log.d("datachangeerror", e.getMessage());
                }
                textViewDatechange.setText(DateToString(calendar.getTime()).trim());
                new MyAsyncTask().execute("sportsingle", String.valueOf(userid), DateToString(calendar.getTime()));
            }
        });
        fontAwesomeTextright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewDatechange.getText().toString().compareTo(simpleDateFormat.format(new Date())) >= 0) {
                    calendar.setTime(new Date());
                } else {
                    try {
                        Date date = simpleDateFormat.parse(textViewDatechange.getText().toString().trim());
                        calendar.setTime(date);
                        calendar.add(Calendar.DAY_OF_MONTH, 1);
                    } catch (ParseException e) {
                        Log.d("datachangeerror", e.getMessage());
                    }
                }
                textViewDatechange.setText(DateToString(calendar.getTime()).trim());
                new MyAsyncTask().execute("sportsingle", String.valueOf(userid), DateToString(calendar.getTime()).trim());
            }
        });
        fontAwesomeTextThumbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fontAwesomeTextThumbs.setTextColor(Color.RED);
            }
        });
        fontAwesomeTextShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        customFABAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), SportRecordEnteringActivity.class);
                getActivity().startActivity(intent);
            }
        });
//        getChildFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
    }
    private String DateToString(Date date) {

        return simpleDateFormat.format(date);
    }

    /**
     * A fragment containing a line chart.
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
    public class MyAsyncTask extends AsyncTask<String, Integer, JsonData> {
        @Override
        protected JsonData doInBackground(String... params) {
            try {
                sportJsondata = JsonData.create(requestClient.getOneSportData(params[0], params[1], params[2]));
            } catch (Exception e) {
                sportJsondata = JsonData.create(null);
                e.printStackTrace();
            }
            return sportJsondata;
        }
        @Override
        protected void onPostExecute(JsonData jsonData) {
            super.onPostExecute(jsonData);
            getChildFragmentManager().beginTransaction().replace(R.id.container, new PlaceholderFragment(jsonData.optJson("alldata"))).commit();
            if (jsonData.optString("sportbegintime") != "" && jsonData.optString("sportbegintime") != null) {
                try {
                    calendar.setTime(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(jsonData.optString("sportbegintime")));
                    testViewBegin.setText(simpleDateFormatTime.format(calendar.getTime()));
                    calendar.setTime(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(jsonData.optString("sportovertime")));
                    testViewFinish.setText(simpleDateFormatTime.format(calendar.getTime()));
                    Log.d("time", simpleDateFormatTime.format(calendar.getTime()));
                } catch (Exception e) {
                    testViewBegin.setText("00:00");
                    testViewFinish.setText("00:00");
                    Log.d("dateerror", e.getMessage());
                }
            } else {

                testViewBegin.setText("00:00");
                testViewFinish.setText("00:00");
            }
            textViewTotalcalorieConsume.setText((jsonData.optDouble("calorieconsumption") > 0 ? String.format("%.2f", jsonData.optDouble("calorieconsumption")) : "0.00").trim());
            textViewStempnumber.setText(String.valueOf(jsonData.optInt("walkstepnumber")).trim());
            textViewMoveDistance.setText(String.format("%.2f", jsonData.optInt("walkdistance") / 1000.0).trim());
            textViewMoveCalorieConsume.setText((jsonData.optDouble("movecalorieconsume") > 0 ? String.format("%.2f", jsonData.optDouble("movecalorieconsume")) : "0.00").trim());
            textViewStaticCaloriConsume.setText((jsonData.optDouble("restingcalorieconsume") > 0 ? String.format("%.2f", jsonData.optDouble("restingcalorieconsume")) : "0.00").trim());
            textViewFallItems.setText(String.valueOf(jsonData.optInt("fallitems")));
            textViewCrawFloor.setText(String.valueOf(jsonData.optInt("crawledfloor")));
            textViewLongsetActive.setText((jsonData.optDouble("longestactiveduration") > 0 ? String.format("%.1f", jsonData.optDouble("longestactiveduration")) : "0.0").trim());
            textViewLongestIdle.setText((jsonData.optDouble("longestidleduration") > 0 ? String.format("%.1f", jsonData.optDouble("longestidleduration")) : "0.0").trim());
            textViewSportAnalysis.setText(jsonData.optJson("alldata").optJson(1).optString("sportanalysis"));
            progressDialog.dismiss();
        }
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }
    }
    /**
     * A fragment containing a column chart.
     */
    public static class PlaceholderFragment extends Fragment {
        private static final int DEFAULT_DATA = 0;
        private static final int SUBCOLUMNS_DATA = 1;
        private static final int STACKED_DATA = 2;
        private static final int NEGATIVE_SUBCOLUMNS_DATA = 3;
        private static final int NEGATIVE_STACKED_DATA = 4;
        private ColumnChartView SportColumnChart;
        private ColumnChartData data;
        private boolean hasAxes = true;
        private boolean hasAxesNames = true;
        private boolean hasLabels = false;
        private boolean hasLabelForSelected = false;
        private int dataType = DEFAULT_DATA;
        private JsonData sportjsondata = null;
        public PlaceholderFragment() {
            this.sportjsondata = sportJsondata;
        }
        public PlaceholderFragment(JsonData sportjsondata) {
            super();
            this.sportjsondata = sportjsondata;
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            setHasOptionsMenu(true);
            View rootView = inflater.inflate(R.layout.fragment_sport_column_chart, container, false);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();//获取屏幕尺寸
            RelativeLayout.LayoutParams layoutParams =
                    new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, displayMetrics.heightPixels / 3);
            SportColumnChart = (ColumnChartView) rootView.findViewById(R.id.sport_column_chart);
            SportColumnChart.setLayoutParams(layoutParams);
            SportColumnChart.setOnValueTouchListener(new ValueTouchListener());
            toggleAxes();
            return rootView;
        }
        // MENU
        @Override
        public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
            inflater.inflate(R.menu.column_chart, menu);
        }
        private void generateDefaultData() {
            int numSubcolumns = 1;
            int numColumns = sportjsondata.length();
            List<Column> columns = new ArrayList<Column>();
            List<SubcolumnValue> values;
            for (int i = 0; i < numColumns; ++i) {
                values = new ArrayList<SubcolumnValue>();
                for (int j = 0; j < numSubcolumns; ++j) {
                    values.add(new SubcolumnValue((float) sportjsondata.optJson(i).optInt("walkstepnumber"), getResources().getColor(R.color.graphcontentcolor)));
                }
                Column column = new Column(values);
                column.setHasLabels(hasLabels);
                column.setHasLabelsOnlyForSelected(hasLabelForSelected);
                columns.add(column);
            }
            data = new ColumnChartData(columns);
            if (hasAxes) {
                Axis axisX = new Axis();
                Axis axisY = new Axis().setHasLines(true);
                if (hasAxesNames) {
                    axisX.setName("Axis X");
                    axisY.setName("Axis Y");
                }
                data.setAxisXBottom(axisX);
                data.setAxisYLeft(axisY);
            } else {
                data.setAxisXBottom(null);
                data.setAxisYLeft(null);
            }
            SportColumnChart.setColumnChartData(data);
        }
        /**
         * Generates columns with subcolumns, columns have larger separation than subcolumns.
         */
        private void generateSubcolumnsData() {
            int numSubcolumns = 61;
            int numColumns = 1;
            // Column can have many subcolumns, here I use 4 subcolumn in each of 8 columns.
            List<Column> columns = new ArrayList<Column>();
            List<SubcolumnValue> values;
            for (int i = 0; i < numColumns; ++i) {
                values = new ArrayList<SubcolumnValue>();
                for (int j = 0; j < numSubcolumns; ++j) {
                    values.add(new SubcolumnValue((float) Math.random() * 50f + 5, ChartUtils.pickColor()));
                }
                Column column = new Column(values);
                column.setHasLabels(hasLabels);
                column.setHasLabelsOnlyForSelected(hasLabelForSelected);
                columns.add(column);
            }
            data = new ColumnChartData(columns);
            if (hasAxes) {
                Axis axisX = new Axis();
                Axis axisY = new Axis().setHasLines(true);
                if (hasAxesNames) {
                    axisX.setName("Axis X");
                    axisY.setName("Axis Y");
                }
                data.setAxisXBottom(axisX);
                data.setAxisYLeft(axisY);
            } else {
                data.setAxisXBottom(null);
                data.setAxisYLeft(null);
            }
            SportColumnChart.setColumnChartData(data);
        }
        private void generateData() {
            switch (dataType) {
                case DEFAULT_DATA:
                    generateDefaultData();
                    break;
                case SUBCOLUMNS_DATA:
                    generateSubcolumnsData();
                    break;
                default:
                    generateDefaultData();
                    break;
            }
        }
        private void toggleAxes() {
            hasAxes = !hasAxes;
            generateData();
        }
        /**
         * To animate values you have to change targets values and then call {@link lecho.lib.hellocharts.view.Chart#startDataAnimation()}
         * method(don't confuse with View.animate()).
         */
        private class ValueTouchListener implements ColumnChartOnValueSelectListener {
            @Override
            public void onValueSelected(int columnIndex, int subcolumnIndex, SubcolumnValue value) {
                Toast.makeText(getActivity(), "步数: " + value.getValue(), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onValueDeselected() {
                // TODO Auto-generated method stub
            }
        }
    }
}
