package com.example.alarm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.HashMap;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "alarm.db";
    public static final String alarmtime_TABLE_NAME = "alarmtime";
    public static final String alarmtime_COLUMN_ID = "id";
    public static final String alarmtime_COLUMN_TIME= "time";
    public static final String alarmtime_COLUMN_STATUS = "status";

    private HashMap hp;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME , null, 103);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table alarmtime " +
                        "(id integer primary key, time text,status text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS alarmtime");
        onCreate(db);
    }

    public boolean insertTime (String time, String status) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("time", time);
        contentValues.put("status", status);
       //

        Cursor cursor;
        SQLiteDatabase db2 = this.getReadableDatabase();
        cursor = db2.rawQuery("select * from alarmtime where time = '" + time + "'", null);
        if (cursor == null || !cursor.moveToFirst()) {
            //Insert new
            db.insert("alarmtime", null, contentValues);
        }else
        {
            cursor = db2.rawQuery("select * from alarmtime where time = '" + time + "'", null);
            cursor.moveToFirst();

            int intId = cursor.getInt(cursor.getColumnIndex(DBHelper.alarmtime_COLUMN_ID));
            String id = Integer.toString(intId);
            String strSQL = "UPDATE alarmtime SET status = "+status+ " WHERE id = "+ intId;

            db.execSQL(strSQL);
        }

        return true;
    }

    public Cursor getData(String time) {
        Cursor res;
      SQLiteDatabase db = this.getReadableDatabase();
      res = db.rawQuery("select * from alarmtime where time = '" + time + "'", null);
        return res;
    }





}