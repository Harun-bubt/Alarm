package com.example.alarm;

import android.database.Cursor;
import android.widget.Toast;

public class GetStatus {
   public static DBHelper mydb;
   public static String status;

    public static String getStatus(String day)
    {
        mydb = new DBHelper(GlobalContext.getAppContext());
        Cursor rs = mydb.getData(day);

        if(rs!=null && rs.getCount()>0)
        {
            rs.moveToFirst();

            status = rs.getString(rs.getColumnIndex(DBHelper.alarmtime_COLUMN_STATUS));


            if (!rs.isClosed())  {
                rs.close();
            }

        }else
        {
            if(day.equals(Constants.SOUND) || day.equals(Constants.ALARM_ON))
            {
                status = "1";
            }else
            {
                status = "0";
            }

        }

        return status;

    }
    public static void removePrevious(int dayNo)
    {
        mydb.insertTime(Constants.DAY+dayNo+0,"0");
        mydb.insertTime(Constants.DAY+dayNo+1,"0");
        mydb.insertTime(Constants.DAY+dayNo+2,"0");
        mydb.insertTime(Constants.DAY+dayNo+3,"0");
        mydb.insertTime(Constants.DAY+dayNo+4,"0");
        mydb.insertTime(Constants.DAY+dayNo+5,"0");
        mydb.insertTime(Constants.DAY+dayNo+6,"0");
        mydb.insertTime(Constants.DAY+dayNo+7,"0");
        mydb.insertTime(Constants.DAY+dayNo+8,"0");
        mydb.insertTime(Constants.DAY+dayNo+9,"0");
        mydb.insertTime(Constants.DAY+dayNo+10,"0");
        mydb.insertTime(Constants.DAY+dayNo+11,"0");
        mydb.insertTime(Constants.DAY+dayNo+12,"0");
        mydb.insertTime(Constants.DAY+dayNo+13,"0");
        mydb.insertTime(Constants.DAY+dayNo+14,"0");
        mydb.insertTime(Constants.DAY+dayNo+15,"0");
        mydb.insertTime(Constants.DAY+dayNo+16,"0");
        mydb.insertTime(Constants.DAY+dayNo+17,"0");
        mydb.insertTime(Constants.DAY+dayNo+18,"0");
        mydb.insertTime(Constants.DAY+dayNo+19,"0");
        mydb.insertTime(Constants.DAY+dayNo+20,"0");
        mydb.insertTime(Constants.DAY+dayNo+21,"0");
        mydb.insertTime(Constants.DAY+dayNo+22,"0");
        mydb.insertTime(Constants.DAY+dayNo+23,"0");

    }



}
