package com.njucm.cmdh.app.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.njucm.cmdh.app.domain.IdentificationIssuess;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table IDENTIFICATION_ISSUESS.
*/
public class IdentificationIssuessDao extends AbstractDao<IdentificationIssuess, Long> {

    public static final String TABLENAME = "IDENTIFICATION_ISSUESS";

    /**
     * Properties of entity IdentificationIssuess.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Identifyissueid = new Property(1, Integer.class, "identifyissueid", false, "IDENTIFYISSUEID");
        public final static Property Temp_physiqueinfoid = new Property(2, Integer.class, "temp_physiqueinfoid", false, "TEMP_PHYSIQUEINFOID");
        public final static Property Identifyissuecontent = new Property(3, String.class, "identifyissuecontent", false, "IDENTIFYISSUECONTENT");
        public final static Property Identifyissueremarks = new Property(4, String.class, "identifyissueremarks", false, "IDENTIFYISSUEREMARKS");
    };


    public IdentificationIssuessDao(DaoConfig config) {
        super(config);
    }
    
    public IdentificationIssuessDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'IDENTIFICATION_ISSUESS' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'IDENTIFYISSUEID' INTEGER," + // 1: identifyissueid
                "'TEMP_PHYSIQUEINFOID' INTEGER," + // 2: temp_physiqueinfoid
                "'IDENTIFYISSUECONTENT' TEXT," + // 3: identifyissuecontent
                "'IDENTIFYISSUEREMARKS' TEXT);"); // 4: identifyissueremarks
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'IDENTIFICATION_ISSUESS'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, IdentificationIssuess entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer identifyissueid = entity.getIdentifyissueid();
        if (identifyissueid != null) {
            stmt.bindLong(2, identifyissueid);
        }
 
        Integer temp_physiqueinfoid = entity.getTemp_physiqueinfoid();
        if (temp_physiqueinfoid != null) {
            stmt.bindLong(3, temp_physiqueinfoid);
        }
 
        String identifyissuecontent = entity.getIdentifyissuecontent();
        if (identifyissuecontent != null) {
            stmt.bindString(4, identifyissuecontent);
        }
 
        String identifyissueremarks = entity.getIdentifyissueremarks();
        if (identifyissueremarks != null) {
            stmt.bindString(5, identifyissueremarks);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public IdentificationIssuess readEntity(Cursor cursor, int offset) {
        IdentificationIssuess entity = new IdentificationIssuess( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // identifyissueid
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // temp_physiqueinfoid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // identifyissuecontent
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // identifyissueremarks
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, IdentificationIssuess entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIdentifyissueid(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setTemp_physiqueinfoid(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setIdentifyissuecontent(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIdentifyissueremarks(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(IdentificationIssuess entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(IdentificationIssuess entity) {
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
