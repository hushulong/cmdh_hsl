package com.njucm.cmdh.app.domain;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table EXERCISE_PREFER_RECORDS.
 */
public class ExercisePreferRecords {

    private Long id;
    private Integer exercisepreferenceid;
    private String exercisetype;
    private String exercisename;
    private String exercisedescribe;
    private Integer temp_exerciseid;
    private Integer temp_userid;
    private Integer temp_locationinfoid;

    public ExercisePreferRecords() {
    }

    public ExercisePreferRecords(Long id) {
        this.id = id;
    }

    public ExercisePreferRecords(Long id, Integer exercisepreferenceid, String exercisetype, String exercisename, String exercisedescribe, Integer temp_exerciseid, Integer temp_userid, Integer temp_locationinfoid) {
        this.id = id;
        this.exercisepreferenceid = exercisepreferenceid;
        this.exercisetype = exercisetype;
        this.exercisename = exercisename;
        this.exercisedescribe = exercisedescribe;
        this.temp_exerciseid = temp_exerciseid;
        this.temp_userid = temp_userid;
        this.temp_locationinfoid = temp_locationinfoid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getExercisepreferenceid() {
        return exercisepreferenceid;
    }

    public void setExercisepreferenceid(Integer exercisepreferenceid) {
        this.exercisepreferenceid = exercisepreferenceid;
    }

    public String getExercisetype() {
        return exercisetype;
    }

    public void setExercisetype(String exercisetype) {
        this.exercisetype = exercisetype;
    }

    public String getExercisename() {
        return exercisename;
    }

    public void setExercisename(String exercisename) {
        this.exercisename = exercisename;
    }

    public String getExercisedescribe() {
        return exercisedescribe;
    }

    public void setExercisedescribe(String exercisedescribe) {
        this.exercisedescribe = exercisedescribe;
    }

    public Integer getTemp_exerciseid() {
        return temp_exerciseid;
    }

    public void setTemp_exerciseid(Integer temp_exerciseid) {
        this.temp_exerciseid = temp_exerciseid;
    }

    public Integer getTemp_userid() {
        return temp_userid;
    }

    public void setTemp_userid(Integer temp_userid) {
        this.temp_userid = temp_userid;
    }

    public Integer getTemp_locationinfoid() {
        return temp_locationinfoid;
    }

    public void setTemp_locationinfoid(Integer temp_locationinfoid) {
        this.temp_locationinfoid = temp_locationinfoid;
    }

}
