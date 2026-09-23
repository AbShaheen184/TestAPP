package io.hopmonsdk.receiver;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class ConfigSyncAlarmTrigger extends BroadcastReceiver {
    public static final String TAG = "ConfigSyncAlarmTrigger";

    public static void cancelAlarm(Context context, AlarmManager alarmManager) {
        alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) ConfigSyncAlarmTrigger.class), 67108864));
    }

    public static void scheduleExactAlarm(Context context, AlarmManager alarmManager, long j) {
        alarmManager.setExact(2, (SystemClock.elapsedRealtime() + j) - (SystemClock.elapsedRealtime() % 1000), PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) ConfigSyncAlarmTrigger.class), 67108864));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        scheduleExactAlarm(context, (AlarmManager) context.getSystemService("alarm"), 300000L);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, TAG);
        wakeLockNewWakeLock.acquire();
        new Handler().post(new Runnable() { // from class: io.hopmonsdk.receiver.ConfigSyncAlarmTrigger.1
            @Override // java.lang.Runnable
            public void run() {
            }
        });
        wakeLockNewWakeLock.release();
    }
}
