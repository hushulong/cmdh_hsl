package UserInfoDAO;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import UserInfoDAO.User;
import UserInfoDAO.UserExerciseFeature;
import UserInfoDAO.UserSleepFeature;
import UserInfoDAO.FoodFeature;
import UserInfoDAO.DietaryRecords;
import UserInfoDAO.EatingAnalysis;
import UserInfoDAO.SportInfoRecords;
import UserInfoDAO.SleepInfoRecords;
import UserInfoDAO.EatingPreferRecords;
import UserInfoDAO.SleepPreferRecords;
import UserInfoDAO.ExercisePreferRecords;
import UserInfoDAO.AverageAmountStd;

import UserInfoDAO.UserDao;
import UserInfoDAO.UserExerciseFeatureDao;
import UserInfoDAO.UserSleepFeatureDao;
import UserInfoDAO.FoodFeatureDao;
import UserInfoDAO.DietaryRecordsDao;
import UserInfoDAO.EatingAnalysisDao;
import UserInfoDAO.SportInfoRecordsDao;
import UserInfoDAO.SleepInfoRecordsDao;
import UserInfoDAO.EatingPreferRecordsDao;
import UserInfoDAO.SleepPreferRecordsDao;
import UserInfoDAO.ExercisePreferRecordsDao;
import UserInfoDAO.AverageAmountStdDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userDaoConfig;
    private final DaoConfig userExerciseFeatureDaoConfig;
    private final DaoConfig userSleepFeatureDaoConfig;
    private final DaoConfig foodFeatureDaoConfig;
    private final DaoConfig dietaryRecordsDaoConfig;
    private final DaoConfig eatingAnalysisDaoConfig;
    private final DaoConfig sportInfoRecordsDaoConfig;
    private final DaoConfig sleepInfoRecordsDaoConfig;
    private final DaoConfig eatingPreferRecordsDaoConfig;
    private final DaoConfig sleepPreferRecordsDaoConfig;
    private final DaoConfig exercisePreferRecordsDaoConfig;
    private final DaoConfig averageAmountStdDaoConfig;

    private final UserDao userDao;
    private final UserExerciseFeatureDao userExerciseFeatureDao;
    private final UserSleepFeatureDao userSleepFeatureDao;
    private final FoodFeatureDao foodFeatureDao;
    private final DietaryRecordsDao dietaryRecordsDao;
    private final EatingAnalysisDao eatingAnalysisDao;
    private final SportInfoRecordsDao sportInfoRecordsDao;
    private final SleepInfoRecordsDao sleepInfoRecordsDao;
    private final EatingPreferRecordsDao eatingPreferRecordsDao;
    private final SleepPreferRecordsDao sleepPreferRecordsDao;
    private final ExercisePreferRecordsDao exercisePreferRecordsDao;
    private final AverageAmountStdDao averageAmountStdDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        userExerciseFeatureDaoConfig = daoConfigMap.get(UserExerciseFeatureDao.class).clone();
        userExerciseFeatureDaoConfig.initIdentityScope(type);

        userSleepFeatureDaoConfig = daoConfigMap.get(UserSleepFeatureDao.class).clone();
        userSleepFeatureDaoConfig.initIdentityScope(type);

        foodFeatureDaoConfig = daoConfigMap.get(FoodFeatureDao.class).clone();
        foodFeatureDaoConfig.initIdentityScope(type);

        dietaryRecordsDaoConfig = daoConfigMap.get(DietaryRecordsDao.class).clone();
        dietaryRecordsDaoConfig.initIdentityScope(type);

        eatingAnalysisDaoConfig = daoConfigMap.get(EatingAnalysisDao.class).clone();
        eatingAnalysisDaoConfig.initIdentityScope(type);

        sportInfoRecordsDaoConfig = daoConfigMap.get(SportInfoRecordsDao.class).clone();
        sportInfoRecordsDaoConfig.initIdentityScope(type);

        sleepInfoRecordsDaoConfig = daoConfigMap.get(SleepInfoRecordsDao.class).clone();
        sleepInfoRecordsDaoConfig.initIdentityScope(type);

        eatingPreferRecordsDaoConfig = daoConfigMap.get(EatingPreferRecordsDao.class).clone();
        eatingPreferRecordsDaoConfig.initIdentityScope(type);

        sleepPreferRecordsDaoConfig = daoConfigMap.get(SleepPreferRecordsDao.class).clone();
        sleepPreferRecordsDaoConfig.initIdentityScope(type);

        exercisePreferRecordsDaoConfig = daoConfigMap.get(ExercisePreferRecordsDao.class).clone();
        exercisePreferRecordsDaoConfig.initIdentityScope(type);

        averageAmountStdDaoConfig = daoConfigMap.get(AverageAmountStdDao.class).clone();
        averageAmountStdDaoConfig.initIdentityScope(type);

        userDao = new UserDao(userDaoConfig, this);
        userExerciseFeatureDao = new UserExerciseFeatureDao(userExerciseFeatureDaoConfig, this);
        userSleepFeatureDao = new UserSleepFeatureDao(userSleepFeatureDaoConfig, this);
        foodFeatureDao = new FoodFeatureDao(foodFeatureDaoConfig, this);
        dietaryRecordsDao = new DietaryRecordsDao(dietaryRecordsDaoConfig, this);
        eatingAnalysisDao = new EatingAnalysisDao(eatingAnalysisDaoConfig, this);
        sportInfoRecordsDao = new SportInfoRecordsDao(sportInfoRecordsDaoConfig, this);
        sleepInfoRecordsDao = new SleepInfoRecordsDao(sleepInfoRecordsDaoConfig, this);
        eatingPreferRecordsDao = new EatingPreferRecordsDao(eatingPreferRecordsDaoConfig, this);
        sleepPreferRecordsDao = new SleepPreferRecordsDao(sleepPreferRecordsDaoConfig, this);
        exercisePreferRecordsDao = new ExercisePreferRecordsDao(exercisePreferRecordsDaoConfig, this);
        averageAmountStdDao = new AverageAmountStdDao(averageAmountStdDaoConfig, this);

        registerDao(User.class, userDao);
        registerDao(UserExerciseFeature.class, userExerciseFeatureDao);
        registerDao(UserSleepFeature.class, userSleepFeatureDao);
        registerDao(FoodFeature.class, foodFeatureDao);
        registerDao(DietaryRecords.class, dietaryRecordsDao);
        registerDao(EatingAnalysis.class, eatingAnalysisDao);
        registerDao(SportInfoRecords.class, sportInfoRecordsDao);
        registerDao(SleepInfoRecords.class, sleepInfoRecordsDao);
        registerDao(EatingPreferRecords.class, eatingPreferRecordsDao);
        registerDao(SleepPreferRecords.class, sleepPreferRecordsDao);
        registerDao(ExercisePreferRecords.class, exercisePreferRecordsDao);
        registerDao(AverageAmountStd.class, averageAmountStdDao);
    }
    
    public void clear() {
        userDaoConfig.getIdentityScope().clear();
        userExerciseFeatureDaoConfig.getIdentityScope().clear();
        userSleepFeatureDaoConfig.getIdentityScope().clear();
        foodFeatureDaoConfig.getIdentityScope().clear();
        dietaryRecordsDaoConfig.getIdentityScope().clear();
        eatingAnalysisDaoConfig.getIdentityScope().clear();
        sportInfoRecordsDaoConfig.getIdentityScope().clear();
        sleepInfoRecordsDaoConfig.getIdentityScope().clear();
        eatingPreferRecordsDaoConfig.getIdentityScope().clear();
        sleepPreferRecordsDaoConfig.getIdentityScope().clear();
        exercisePreferRecordsDaoConfig.getIdentityScope().clear();
        averageAmountStdDaoConfig.getIdentityScope().clear();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public UserExerciseFeatureDao getUserExerciseFeatureDao() {
        return userExerciseFeatureDao;
    }

    public UserSleepFeatureDao getUserSleepFeatureDao() {
        return userSleepFeatureDao;
    }

    public FoodFeatureDao getFoodFeatureDao() {
        return foodFeatureDao;
    }

    public DietaryRecordsDao getDietaryRecordsDao() {
        return dietaryRecordsDao;
    }

    public EatingAnalysisDao getEatingAnalysisDao() {
        return eatingAnalysisDao;
    }

    public SportInfoRecordsDao getSportInfoRecordsDao() {
        return sportInfoRecordsDao;
    }

    public SleepInfoRecordsDao getSleepInfoRecordsDao() {
        return sleepInfoRecordsDao;
    }

    public EatingPreferRecordsDao getEatingPreferRecordsDao() {
        return eatingPreferRecordsDao;
    }

    public SleepPreferRecordsDao getSleepPreferRecordsDao() {
        return sleepPreferRecordsDao;
    }

    public ExercisePreferRecordsDao getExercisePreferRecordsDao() {
        return exercisePreferRecordsDao;
    }

    public AverageAmountStdDao getAverageAmountStdDao() {
        return averageAmountStdDao;
    }

}
