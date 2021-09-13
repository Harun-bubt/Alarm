package com.example.alarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;

import java.util.Set;

public class Settings extends AppCompatActivity {

    ImageView backArrow,playImageView;
    boolean isPause = false;
    SeekBar seekBar;
    public static int volume;
    DBHelper mydb;
    AudioManager myAudioManager;
    MediaPlayer mp = null;
    Switch sNotification,sVibration,sSound;
    String sound = "1",vibration ="0",notification = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        backArrow = findViewById(R.id.backArrowImageView);
        playImageView = findViewById(R.id.playImageView);
        seekBar = findViewById(R.id.seek);
        sNotification = findViewById(R.id.switchNotification);
        sVibration = findViewById(R.id.switchVibration);
        sSound = findViewById(R.id.switchSound);
        mydb = new DBHelper(this);


        //set all the previous data from database
        String v = GetStatus.getStatus(Constants.VOLUME);
        seekBar.setProgress(Integer.valueOf(v));
        if(GetStatus.getStatus(Constants.SOUND).equals("1"))
        {
            sSound.setChecked(true);
        }else {
            sSound.setChecked(false);
        }
        if(GetStatus.getStatus(Constants.NOTIFICATION).equals("1")){
            sNotification.setChecked(true);
        }else
        {
            sNotification.setChecked(false);
        }
        if(GetStatus.getStatus(Constants.VIBRATION).equals("1"))
        {
            sVibration.setChecked(true);
        }
        else
        {
            sVibration.setChecked(false);
        }
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.this,MainActivity.class));
            }
        });
        playImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPause)
                {
                    playImageView.setImageDrawable(getDrawable(R.drawable.ic_baseline_pause_24));
                    mp = MediaPlayer.create(Settings.this, R.raw.test);
                    mp.start();
                    isPause = true;


                }else
                {
                    isPause = false;
                    playImageView.setImageDrawable(getDrawable(R.drawable.ic_baseline_play_24));
                    /*myAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                    myAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, Settings.volume, AudioManager.ADJUST_SAME);*/
                    if(mp != null && mp.isPlaying())
                    {
                        mp.stop();
                    }

                }

            }
        });
        seekBar.setMax(30);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                volume = progress;
                String v = String.valueOf(volume);
                mydb.insertTime(Constants.VOLUME,v);
                AudioManager myAudioManager;
                myAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
                myAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, Integer.valueOf(v), AudioManager.ADJUST_SAME);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sSound.isChecked())
                {
                    sound = "1";
                    mydb.insertTime(Constants.SOUND,sound);
                }else
                {
                    sound = "0";
                    mydb.insertTime(Constants.SOUND,sound);
                }
            }
        });
        sNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sNotification.isChecked())
                {
                    notification = "1";
                    mydb.insertTime(Constants.NOTIFICATION,notification);
                }else
                {
                    notification = "0";
                    mydb.insertTime(Constants.NOTIFICATION,notification);
                }
            }
        });
        sVibration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sVibration.isChecked())
                {
                    vibration = "1";
                    mydb.insertTime(Constants.VIBRATION,vibration);
                }else
                {
                    vibration = "0";
                    mydb.insertTime(Constants.VIBRATION,vibration);
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Settings.this,MainActivity.class));
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(mp != null && mp.isPlaying())
        {
            mp.stop();
        }
    }
}