package com.example.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;
import androidx.legacy.content.WakefulBroadcastReceiver;

import static android.content.Context.VIBRATOR_SERVICE;

/**
 * Created by shiva on 8/4/17.
 */

public class AlarmReceiver extends WakefulBroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {


        if(GetStatus.getStatus(Constants.ALARM_ON).equals("1"))
        {
            Log.d("wakeUp", "WakeUp");

            if(GetStatus.getStatus(Constants.NOTIFICATION).equals("1"))
            {
                NotificationHelper notificationHelper = new NotificationHelper(context);
                NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
                notificationHelper.getManager().notify(1, nb.build());
            }


            AudioManager myAudioManager;
            myAudioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
            if(GetStatus.getStatus(Constants.VIBRATION).equals("1"))
            {
                myAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                Vibrator vibrator =(Vibrator)context.getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(4000);
            }

            if(GetStatus.getStatus(Constants.SOUND).equals("1"))
            {
                myAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
            }else
            {
                myAudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
            }

            String v = GetStatus.getStatus(Constants.VOLUME);
            myAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, Integer.valueOf(v), AudioManager.ADJUST_SAME);

            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone r = RingtoneManager.getRingtone(context, notification);
            r.play();


        }else {
            Log.d("wakeUp", "off");
        }

    }
}