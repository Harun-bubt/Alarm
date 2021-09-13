package com.example.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import java.util.Calendar;

import static android.content.Context.ALARM_SERVICE;

public class AlarmSet {

    public static void setAllAlarm(int day,boolean isAlarm)
    {
        MainActivity.switch0.setChecked(true);
        MainActivity.switch1.setChecked(true);
        MainActivity.switch2.setChecked(true);
        MainActivity.switch3.setChecked(true);
        MainActivity.switch4.setChecked(true);
        MainActivity.switch5.setChecked(true);
        MainActivity.switch6.setChecked(true);
        MainActivity.switch7.setChecked(true);
        MainActivity.switch8.setChecked(true);
        MainActivity.switch9.setChecked(true);
        MainActivity.switch10.setChecked(true);
        MainActivity.switch11.setChecked(true);
        MainActivity.switch12.setChecked(true);
        MainActivity.switch13.setChecked(true);
        MainActivity.switch14.setChecked(true);
        MainActivity.switch15.setChecked(true);
        MainActivity.switch16.setChecked(true);
        MainActivity.switch17.setChecked(true);
        MainActivity.switch18.setChecked(true);
        MainActivity.switch19.setChecked(true);
        MainActivity.switch20.setChecked(true);
        MainActivity.switch21.setChecked(true);
        MainActivity.switch22.setChecked(true);
        MainActivity.switch23.setChecked(true);

        if(isAlarm)
        {
            setAlarm(0,0,day,getRequestCode(day,0));
            setAlarm(1,0,day,getRequestCode(day,1));
            setAlarm(2,0,day,getRequestCode(day,2));
            setAlarm(3,0,day,getRequestCode(day,3));
            setAlarm(4,0,day,getRequestCode(day,4));
            setAlarm(5,0,day,getRequestCode(day,5));
            setAlarm(6,0,day,getRequestCode(day,6));
            setAlarm(7,0,day,getRequestCode(day,7));
            setAlarm(8,0,day,getRequestCode(day,8));
            setAlarm(9,0,day,getRequestCode(day,9));
            setAlarm(10,0,day,getRequestCode(day,10));
            setAlarm(11,0,day,getRequestCode(day,11));
            setAlarm(12,0,day,getRequestCode(day,12));
            setAlarm(13,0,day,getRequestCode(day,13));
            setAlarm(14,0,day,getRequestCode(day,14));
            setAlarm(15,0,day,getRequestCode(day,15));
            setAlarm(16,0,day,getRequestCode(day,16));
            setAlarm(17,0,day,getRequestCode(day,17));
            setAlarm(18,0,day,getRequestCode(day,18));
            setAlarm(19,0,day,getRequestCode(day,19));
            setAlarm(20,0,day,getRequestCode(day,20));
            setAlarm(21,0,day,getRequestCode(day,21));
            setAlarm(22,0,day,getRequestCode(day,22));
            setAlarm(23,0,day,getRequestCode(day,23));
        }


    }

    public static void cancelAllAlarm(int day)
    {
        MainActivity.switch0.setChecked(false);
        MainActivity.switch1.setChecked(false);
        MainActivity.switch2.setChecked(false);
        MainActivity.switch3.setChecked(false);
        MainActivity.switch4.setChecked(false);
        MainActivity.switch5.setChecked(false);
        MainActivity.switch6.setChecked(false);
        MainActivity.switch7.setChecked(false);
        MainActivity.switch8.setChecked(false);
        MainActivity.switch9.setChecked(false);
        MainActivity.switch10.setChecked(false);
        MainActivity.switch11.setChecked(false);
        MainActivity.switch12.setChecked(false);
        MainActivity.switch13.setChecked(false);
        MainActivity.switch14.setChecked(false);
        MainActivity.switch15.setChecked(false);
        MainActivity.switch16.setChecked(false);
        MainActivity.switch17.setChecked(false);
        MainActivity.switch18.setChecked(false);
        MainActivity.switch19.setChecked(false);
        MainActivity.switch20.setChecked(false);
        MainActivity.switch21.setChecked(false);
        MainActivity.switch22.setChecked(false);
        MainActivity.switch23.setChecked(false);

        cancelAlarm(getRequestCode(day,0));
        cancelAlarm(getRequestCode(day,1));
        cancelAlarm(getRequestCode(day,2));
        cancelAlarm(getRequestCode(day,3));
        cancelAlarm(getRequestCode(day,4));
        cancelAlarm(getRequestCode(day,5));
        cancelAlarm(getRequestCode(day,6));
        cancelAlarm(getRequestCode(day,7));
        cancelAlarm(getRequestCode(day,8));
        cancelAlarm(getRequestCode(day,9));
        cancelAlarm(getRequestCode(day,10));
        cancelAlarm(getRequestCode(day,11));
        cancelAlarm(getRequestCode(day,12));
        cancelAlarm(getRequestCode(day,13));
        cancelAlarm(getRequestCode(day,14));
        cancelAlarm(getRequestCode(day,15));
        cancelAlarm(getRequestCode(day,16));
        cancelAlarm(getRequestCode(day,17));
        cancelAlarm(getRequestCode(day,19));
        cancelAlarm(getRequestCode(day,20));
        cancelAlarm(getRequestCode(day,21));
        cancelAlarm(getRequestCode(day,22));
        cancelAlarm(getRequestCode(day,23));
    }

    
    
    public static void setAlarm(int hour,int minute,int dayOfWeek,int requestCode)
    {
        Intent intent=new Intent(GlobalContext.getAppContext(), AlarmReceiver.class);
        PendingIntent p1=PendingIntent.getBroadcast(GlobalContext.getAppContext(),requestCode, intent,0);
        AlarmManager a=(AlarmManager)GlobalContext.getAppContext().getSystemService(ALARM_SERVICE);

        Calendar myCalendar = Calendar.getInstance();
        Calendar calendar = (Calendar) myCalendar.clone();
        // set current hour for calendar
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        // set current minute
        calendar.set(Calendar.MINUTE, minute);
        // set current second for calendar
        calendar.set(Calendar.SECOND, 0);
        // plus one day if the time set less than the the Calendar current time
        if (calendar.compareTo(myCalendar) <= 0) {
            calendar.add(Calendar.DATE, 7);
        }
        long add=0;
        if(Calendar.getInstance().get(Calendar.DAY_OF_WEEK) < dayOfWeek)
        {
            add = (dayOfWeek-Calendar.getInstance().get(Calendar.DAY_OF_WEEK) );

        }else if(Calendar.getInstance().get(Calendar.DAY_OF_WEEK) > dayOfWeek)
        {
            add = 7 - Calendar.getInstance().get(Calendar.DAY_OF_WEEK) + dayOfWeek;
        }
        Log.d("Time","add"+add);
        Log.d("Time","SystemWeek"+Calendar.getInstance().get(Calendar.DAY_OF_WEEK));

        add = calendar.getTimeInMillis()+add*24*60*60*1000;

        Log.d("Time","Time"+(add - System.currentTimeMillis()));
        if(Build.VERSION.SDK_INT < 23){
            if(Build.VERSION.SDK_INT >= 19){
                a.setExact(AlarmManager.RTC_WAKEUP, add, p1);
            }
            else{
                a.set(AlarmManager.RTC_WAKEUP, add, p1);
            }
        }
        else{
            a.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, add, p1);
        }

    }

    public static void cancelAlarm(int requestCode) {
        AlarmManager manager = (AlarmManager) GlobalContext.getAppContext().getSystemService(ALARM_SERVICE);
        Intent alarmIntent = new Intent(GlobalContext.getAppContext(), AlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(GlobalContext.getAppContext(), requestCode, alarmIntent, 0);
        manager.cancel(pendingIntent);
    }

    public static void controlDaysSelection(int dayNo)
    {
        switch (dayNo)
        {
            case 1:
                ControlSwitch.ControlDay(1);
                MainActivity.btnDay1.setBackgroundResource(R.drawable.selected_day_circle);
                MainActivity.btnDay2.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay3.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay4.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay5.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay6.setBackgroundResource(R.drawable.day_circle_black);
                MainActivity.btnDay7.setBackgroundResource(R.drawable.day_circle_black);
                break;
            case 2:
                ControlSwitch.ControlDay(2);
                MainActivity.btnDay1.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay2.setBackgroundResource(R.drawable.selected_day_circle);
                MainActivity.btnDay3.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay4.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay5.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay6.setBackgroundResource(R.drawable.day_circle_black);
                MainActivity.btnDay7.setBackgroundResource(R.drawable.day_circle_black);
                break;
            case 3:
                ControlSwitch.ControlDay(3);
                MainActivity.btnDay1.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay2.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay3.setBackgroundResource(R.drawable.selected_day_circle);
                MainActivity.btnDay4.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay5.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay6.setBackgroundResource(R.drawable.day_circle_black);
                MainActivity.btnDay7.setBackgroundResource(R.drawable.day_circle_black);
                break;
            case 4:
                ControlSwitch.ControlDay(4);
                MainActivity.btnDay1.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay2.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay3.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay4.setBackgroundResource(R.drawable.selected_day_circle);
                MainActivity.btnDay5.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay6.setBackgroundResource(R.drawable.day_circle_black);
                MainActivity.btnDay7.setBackgroundResource(R.drawable.day_circle_black);
                break;
            case 5:
                ControlSwitch.ControlDay(5);
                MainActivity.btnDay1.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay2.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay3.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay4.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay5.setBackgroundResource(R.drawable.selected_day_circle);
                MainActivity.btnDay6.setBackgroundResource(R.drawable.day_circle_black);
                MainActivity.btnDay7.setBackgroundResource(R.drawable.day_circle_black);
                break;
            case 6:
                ControlSwitch.ControlDay(6);
                MainActivity.btnDay1.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay2.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay3.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay4.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay5.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay6.setBackgroundResource(R.drawable.selected_day_circle);
                MainActivity.btnDay7.setBackgroundResource(R.drawable.day_circle_black);
                break;
            case 7:
                ControlSwitch.ControlDay(7);
                MainActivity.btnDay1.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay2.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay3.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay4.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay5.setBackgroundResource(R.drawable.day_circle);
                MainActivity.btnDay6.setBackgroundResource(R.drawable.day_circle_black);
                MainActivity.btnDay7.setBackgroundResource(R.drawable.selected_day_circle);
                break;



        }
    }
    public static int getRequestCode(int dayNo,int hour)
    {
        String day = Integer.toString(dayNo);
        String time = Integer.toString(hour);
        String req = day.concat(time);
        return Integer.valueOf(req);
    }

}
