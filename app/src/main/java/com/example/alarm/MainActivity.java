package com.example.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    public static  Switch switch0,switch1,switch2,switch3,switch4,switch5,switch6,
            switch7,switch8,switch9,switch10,switch11,switch12,switch13,switch14,switch15,
            switch16,switch17,switch18,switch19,switch20,switch21,switch22,switch23,switchAlarmOn;
    public static Button btnDay1,btnDay2,btnDay3,btnDay4,btnDay5,btnDay6,btnDay7;
    LinearLayout alarmDetails;
    public static CheckBox selectCheckBox;
    Calendar alarmCalendar;
    int dayNo=1;
    public static SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    DBHelper mydb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeAllViews();

        AlarmSet.controlDaysSelection(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
        dayNo = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        mydb = new DBHelper(this);



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Intent intent = new Intent();
            String packageName = getPackageName();
            PowerManager pm = (PowerManager) getSystemService(POWER_SERVICE);
            if (!pm.isIgnoringBatteryOptimizations(packageName)) {
                intent.setAction(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS);
                intent.setData(Uri.parse("package:" + packageName));
                startActivity(intent);
            }
        }

        AlarmReceiver mScreenStateReceiver = new AlarmReceiver();
        IntentFilter screenStateFilter = new IntentFilter();
        screenStateFilter.addAction("alarm.running");
        registerReceiver(mScreenStateReceiver, screenStateFilter);

        if(GetStatus.getStatus(Constants.ALARM_ON).equals("1"))
        {
            switchAlarmOn.setChecked(true);
            alarmDetails.setVisibility(View.VISIBLE);
        }else
        {
            switchAlarmOn.setChecked(false);
            alarmDetails.setVisibility(View.GONE);
        }
        switchAlarmOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchAlarmOn.isChecked())
                {
                    mydb.insertTime(Constants.ALARM_ON,"1");
                    alarmDetails.setVisibility(View.VISIBLE);
                }else{
                    mydb.insertTime(Constants.ALARM_ON,"0");
                    alarmDetails.setVisibility(View.GONE);
                }
            }
        });


        if(GetStatus.getStatus(Constants.SELECTALL+ Integer.toString(dayNo)).equals(Integer.toString(dayNo)))
        {
            AlarmSet.setAllAlarm(dayNo,false);
            selectCheckBox.setChecked(true);
        }else
        {
            selectCheckBox.setChecked(false);
        }

        //control days
        btnDay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AlarmSet. controlDaysSelection(1);
                dayNo = 1;
                if(GetStatus.getStatus(Constants.SELECTALL+Integer.toString(dayNo)).equals(Integer.toString(dayNo)))
                {
                    AlarmSet.setAllAlarm(dayNo,false);
                    selectCheckBox.setChecked(true);
                }else
                {
                    selectCheckBox.setChecked(false);
                }
            }
        });
        btnDay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AlarmSet. controlDaysSelection(2);
                dayNo = 2;
                if(GetStatus.getStatus(Constants.SELECTALL+Integer.toString(dayNo)).equals(Integer.toString(dayNo)))
                {
                    AlarmSet.setAllAlarm(dayNo,false);
                    selectCheckBox.setChecked(true);
                }else
                {
                    selectCheckBox.setChecked(false);
                }
            }
        });
        btnDay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AlarmSet. controlDaysSelection(3);
                dayNo = 3;
                if(GetStatus.getStatus(Constants.SELECTALL+Integer.toString(dayNo)).equals(Integer.toString(dayNo)))
                {
                    AlarmSet.setAllAlarm(dayNo,false);
                    selectCheckBox.setChecked(true);
                }else
                {
                    selectCheckBox.setChecked(false);
                }
            }
        });
        btnDay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AlarmSet. controlDaysSelection(4);
                dayNo = 4;
                if(GetStatus.getStatus(Constants.SELECTALL+Integer.toString(dayNo)).equals(Integer.toString(dayNo)))
                {
                    AlarmSet.setAllAlarm(dayNo,false);
                    selectCheckBox.setChecked(true);
                }else
                {
                    selectCheckBox.setChecked(false);
                }
            }
        });
        btnDay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AlarmSet. controlDaysSelection(5);
                dayNo = 5;
                if(GetStatus.getStatus(Constants.SELECTALL+Integer.toString(dayNo)).equals(Integer.toString(dayNo)))
                {
                    AlarmSet.setAllAlarm(dayNo,false);
                    selectCheckBox.setChecked(true);
                }else
                {
                    selectCheckBox.setChecked(false);
                }
            }
        });
        btnDay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AlarmSet. controlDaysSelection(6);
                dayNo = 6;
                if(GetStatus.getStatus(Constants.SELECTALL+Integer.toString(dayNo)).equals(Integer.toString(dayNo)))
                {
                    AlarmSet.setAllAlarm(dayNo,false);
                    selectCheckBox.setChecked(true);
                }else
                {
                    selectCheckBox.setChecked(false);
                }
            }
        });
        btnDay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AlarmSet. controlDaysSelection(7);
                dayNo = 7;
                if(GetStatus.getStatus(Constants.SELECTALL+Integer.toString(dayNo)).equals(Integer.toString(dayNo)))
                {
                    AlarmSet.setAllAlarm(dayNo,false);
                    selectCheckBox.setChecked(true);
                }else
                {
                    selectCheckBox.setChecked(false);
                }
            }
        });

        selectCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    String day = Integer.toString(dayNo);
                    mydb.insertTime(Constants.SELECTALL+day,day);
                    GetStatus.removePrevious(dayNo);
                    AlarmSet.setAllAlarm(dayNo,true);
                }else
                {
                    String day = Integer.toString(dayNo);
                    mydb.insertTime(Constants.SELECTALL+day,"0");
                    AlarmSet.cancelAllAlarm(dayNo);
                }
            }
        });

        switch0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(0);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch0.isChecked()) {
                    boolean status = mydb.insertTime("DAY"+dayNo+0,"1");
                    AlarmSet.setAlarm(0,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+0,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(1);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch1.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+1,"1");
                    AlarmSet.setAlarm(1,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+1,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(2);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch2.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+2,"1");
                    AlarmSet.setAlarm(2,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+2,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(3);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch3.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+3,"1");
                    AlarmSet.setAlarm(3,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+3,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(4);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch4.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+4,"1");
                    AlarmSet.setAlarm(4,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+4,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(5);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch5.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+5,"1");
                    AlarmSet.setAlarm(5,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+5,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(6);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch6.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+6,"1");
                    AlarmSet.setAlarm(6,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+6,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(7);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch7.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+7,"1");
                    AlarmSet.setAlarm(7,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+7,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(8);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch8.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+8,"1");
                    AlarmSet.setAlarm(8,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+8,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(9);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch9.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+9,"1");
                    AlarmSet.setAlarm(9,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+9,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(10);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch10.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+10,"1");
                    AlarmSet.setAlarm(10,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+10,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(11);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch11.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+11,"1");
                    AlarmSet.setAlarm(11,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+11,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(12);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch12.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+12,"1");
                    AlarmSet.setAlarm(12,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+12,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(13);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch13.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+13,"1");
                    AlarmSet.setAlarm(13,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+13,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(14);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch14.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+14,"1");
                    AlarmSet.setAlarm(14,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+14,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(15);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch15.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+15,"1");
                    AlarmSet.setAlarm(15,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+15,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(16);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch16.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+16,"1");
                    AlarmSet.setAlarm(16,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+16,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(17);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch17.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+17,"1");
                    AlarmSet.setAlarm(17,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+17,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(18);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch18.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+18,"1");
                    AlarmSet.setAlarm(18,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+18,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(19);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch19.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+19,"1");
                    AlarmSet.setAlarm(19,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+19,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(20);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch20.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+20,"1");
                    AlarmSet.setAlarm(20,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+20,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(21);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch21.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+21,"1");
                    AlarmSet.setAlarm(21,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+21,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(22);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch22.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+22,"1");
                    AlarmSet.setAlarm(22,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+22,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });
        switch23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = Integer.toString(dayNo);
                String time = Integer.toString(23);
                String req = day.concat(time);
                int requestCode = Integer.valueOf(req);
                if (switch23.isChecked()) {
                    mydb.insertTime("DAY"+dayNo+23,"1");
                    AlarmSet.setAlarm(23,0,dayNo,requestCode);
                }else
                {
                    mydb.insertTime("DAY"+dayNo+23,"0");
                    AlarmSet.cancelAlarm(requestCode);
                }
            }
        });





    }
    public void initializeAllViews()
    {
        Toolbar toolbar = findViewById(R.id.toolBar);
        //setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId()==R.id.settings)
                {
                    startActivity(new Intent(MainActivity.this, com.example.alarm.Settings.class));
                }
                else if(item.getItemId()== R.id.about)
                {
                    // do something
                }
                else{
                    // do something
                }

                return false;
            }
        });

        switch0 = findViewById(R.id.btnTime0);
        switch1 = findViewById(R.id.btnTime1);
        switch2  = findViewById(R.id.btnTime2);
        switch3 = findViewById(R.id.btnTime3);
        switch4 = findViewById(R.id.btnTime4);
        switch5 = findViewById(R.id.btnTime5);
        switch6 = findViewById(R.id.btnTime6);
        switch7 = findViewById(R.id.btnTime7);
        switch8 = findViewById(R.id.btnTime8);
        switch9 = findViewById(R.id.btnTime9);
        switch10 = findViewById(R.id.btnTime10);
        switch11 = findViewById(R.id.btnTime11);
        switch12 = findViewById(R.id.btnTime12);
        switch13 = findViewById(R.id.btnTime13);
        switch14 = findViewById(R.id.btnTime14);
        switch15 = findViewById(R.id.btnTime15);
        switch16 = findViewById(R.id.btnTime16);
        switch17 = findViewById(R.id.btnTime17);
        switch18 = findViewById(R.id.btnTime18);
        switch19 = findViewById(R.id.btnTime19);
        switch20 = findViewById(R.id.btnTime20);
        switch21 = findViewById(R.id.btnTime21);
        switch22 = findViewById(R.id.btnTime22);
        switch23 = findViewById(R.id.btnTime23);
        switchAlarmOn = findViewById(R.id.alarmOnSwitch);
        alarmDetails = findViewById(R.id.alarmDetailsLayout);


        btnDay1 = findViewById(R.id.btnDay1);
        btnDay2 = findViewById(R.id.btnDay2);
        btnDay3 = findViewById(R.id.btnDay3);
        btnDay4 = findViewById(R.id.btnDay4);
        btnDay5 = findViewById(R.id.btnDay5);
        btnDay6 = findViewById(R.id.btnDay6);
        btnDay7 = findViewById(R.id.btnDay7);
        selectCheckBox = findViewById(R.id.selectAllCheckBox);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}