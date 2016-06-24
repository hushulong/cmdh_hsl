package com.njucm.cmdh.app.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.njucm.cmdh.app.domain.UserKnowledgeMapp;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table USER_KNOWLEDGE_MAPP.
*/
public class UserKnowledgeMappDao extends AbstractDao<UserKnowledgeMapp, Long> {

    public static final String TABLENAME = "USER_KNOWLEDGE_MAPP";

    /**
     * Properties of entity UserKnowledgeMapp.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Userknowledgemappid = new Property(1, Integer.class, "userknowledgemappid", false, "USERKNOWLEDGEMAPPID");
        public final static Property Temp_userid = new Property(2, Integer.class, "temp_userid", false, "TEMP_USERID");
        public final static Property Healthknowledgecontent = new Property(3, String.class, "healthknowledgecontent", false, "HEALTHKNOWLEDGECONTENT");
        public final static Property Temp_healthknowledgeid = new Property(4, Integer.class, "temp_healthknowledgeid", false, "TEMP_HEALTHKNOWLEDGEID");
        public final static Property Healthknowledgereason = new Property(5, String.class, "healthknowledgereason", false, "HEALTHKNOWLEDGEREASON");
        public final static Property Healthknowledgetime = new Property(6, java.util.Date.class, "healthknowledgetime", false, "HEALTHKNOWLEDGETIME");
        public final static Property Healthknowledgeremarks = new Property(7, String.class, "healthknowledgeremarks", false, "HEALTHKNOWLEDGEREMARKS");
    };


    public UserKnowledgeMappDao(DaoConfig config) {
        super(config);
    }
    
    public UserKnowledgeMappDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'USER_KNOWLEDGE_MAPP' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'USERKNOWLEDGEMAPPID' INTEGER," + // 1: userknowledgemappid
                "'TEMP_USERID' INTEGER," + // 2: temp_userid
                "'HEALTHKNOWLEDGECONTENT' TEXT," + // 3: healthknowledgecontent
                "'TEMP_HEALTHKNOWLEDGEID' INTEGER," + // 4: temp_healthknowledgeid
                "'HEALTHKNOWLEDGEREASON' TEXT," + // 5: healthknowledgereason
                "'HEALTHKNOWLEDGETIME' INTEGER," + // 6: healthknowledgetime
                "'HEALTHKNOWLEDGEREMARKS' TEXT);"); // 7: healthknowledgeremarks
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'USER_KNOWLEDGE_MAPP'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, UserKnowledgeMapp entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer userknowledgemappid = entity.getUserknowledgemappid();
        if (userknowledgemappid != null) {
            stmt.bindLong(2, userknowledgemappid);
        }
 
        Integer temp_userid = entity.getTemp_userid();
        if (temp_userid != null) {
            stmt.bindLong(3, temp_userid);
        }
 
        String healthknowledgecontent = entity.getHealthknowledgecontent();
        if (healthknowledgecontent != null) {
            stmt.bindString(4, healthknowledgecontent);
        }
 
        Integer temp_healthknowledgeid = entity.getTemp_healthknowledgeid();
        if (temp_healthknowledgeid != null) {
            stmt.bindLong(5, temp_healthknowledgeid);
        }
 
        String healthknowledgereason = entity.getHealthknowledgereason();
        if (healthknowledgereason != null) {
            stmt.bindString(6, healthknowledgereason);
        }
 
        java.util.Date healthknowledgetime = entity.getHealthknowledgetime();
        if (healthknowledgetime != null) {
            stmt.bindLong(7, healthknowledgetime.getTime());
        }
 
        String healthknowledgeremarks = entity.getHealthknowledgeremarks();
        if (healthknowledgeremarks != null) {
            stmt.bindString(8, healthknowledgeremarks);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public UserKnowledgeMapp readEntity(Cursor cursor, int offset) {
        UserKnowledgeMapp entity = new UserKnowledgeMapp( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // userknowledgemappid
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // temp_userid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // healthknowledgecontent
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // temp_healthknowledgeid
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // healthknowledgereason
            cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)), // healthknowledgetime
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // healthknowledgeremarks
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, UserKnowledgeMapp entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserknowledgemappid(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setTemp_userid(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setHealthknowledgecontent(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTemp_healthknowledgeid(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setHealthknowledgereason(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setHealthknowledgetime(cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)));
        entity.setHealthknowledgeremarks(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(UserKnowledgeMapp entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(UserKnowledgeMapp entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}