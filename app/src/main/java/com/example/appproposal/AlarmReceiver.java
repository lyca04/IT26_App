package com.example.appproposal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import java.util.Calendar;

public class AlarmReceiver extends BroadcastReceiver {

    private static final String CHANNEL_ID = "prayer_alarm_channel";
    private static final String[] MORNING_MESSAGES = {
            "Good morning! Time for your morning prayer.",
            "Rise and shine! It's time for prayer.",
            "Start your day with a prayer.",
            "Morning prayer time! Blessings await.",
            "A new day, a new prayer. Good morning!"
    };

    private static final String[] EVENING_MESSAGES = {
            "Good evening! Time for your night prayer.",
            "Wind down with your evening prayer.",
            "Reflect and pray before you rest.",
            "Evening prayer time! Peace and calm.",
            "End your day with a prayer. Good night!"
    };

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("AlarmReceiver", "Alarm received");

        createNotificationChannel(context);

        String title = intent.getStringExtra("title");
        String message = getMessage(intent.getStringExtra("time"));

        Intent notificationIntent = new Intent(context, TodayFragment.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addNextIntentWithParentStack(notificationIntent);
        PendingIntent pendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(100, builder.build());
    }

    private void createNotificationChannel(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Prayer Alarm Channel";
            String description = "Channel for Prayer Alarms";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    private String getMessage(String time) {
        Calendar calendar = Calendar.getInstance();
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

        if ("morning".equals(time)) {
            return MORNING_MESSAGES[dayOfYear % MORNING_MESSAGES.length];
        } else {
            return EVENING_MESSAGES[dayOfYear % EVENING_MESSAGES.length];
        }
    }
}
