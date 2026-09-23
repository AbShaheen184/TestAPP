package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static void a(Context context) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (u.e(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT < 29) {
            org.jsoup.helper.n.o(null);
            return;
        }
        com.google.android.gms.tasks.s sVar = new com.google.android.gms.tasks.s();
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                SharedPreferences.Editor editorEdit = u.e(context).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            }
        } finally {
            sVar.l(null);
        }
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return true;
                }
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }
}
