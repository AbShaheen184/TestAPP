package com.app.mlounge;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.y;
import androidx.collection.y0;
import androidx.media3.ui.c0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ChqMessagingService extends FirebaseMessagingService {
    public static final /* synthetic */ int E = 0;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(com.google.firebase.messaging.m mVar) {
        Context context = com.app.mlounge.util.a.a;
        Bundle bundle = mVar.e;
        com.app.mlounge.util.a.a("D", "ChqFCM", "FCM from: " + bundle.getString("from"));
        Object objD = mVar.d();
        objD.getClass();
        if (!((y0) objD).isEmpty()) {
            com.app.mlounge.util.a.a("D", "ChqFCM", "FCM data: " + mVar.d());
        }
        if (mVar.z == null && com.google.android.material.behavior.d.x(bundle)) {
            mVar.z = new com.google.firebase.messaging.f(new com.google.android.material.behavior.d(bundle));
        }
        com.google.firebase.messaging.f fVar = mVar.z;
        if (fVar != null) {
            String string = (String) fVar.a;
            if (string == null) {
                string = getString(R.string.app_name);
                string.getClass();
            }
            String str = (String) fVar.b;
            if (str == null) {
                return;
            }
            Object systemService = getSystemService("notification");
            systemService.getClass();
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel("chq_general", "General", 3));
            }
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.setFlags(335544320);
            PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
            androidx.core.app.h hVar = new androidx.core.app.h(this, "chq_general");
            hVar.s.icon = R.drawable.favicon;
            hVar.d(bitmapDecodeResource);
            hVar.e = androidx.core.app.h.b(string);
            hVar.f = androidx.core.app.h.b(str);
            hVar.c(16, true);
            hVar.g = activity;
            Notification notificationA = hVar.a();
            notificationA.getClass();
            notificationManager.notify((int) System.currentTimeMillis(), notificationA);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        str.getClass();
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", "ChqFCM", "FCM token refreshed: ".concat(str));
    }

    @Override // android.app.Service
    public final void onCreate() {
        FirebaseMessaging firebaseMessaging;
        super.onCreate();
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(com.google.firebase.g.c());
        }
        firebaseMessaging.getClass();
        com.google.android.gms.tasks.j jVar = new com.google.android.gms.tasks.j();
        firebaseMessaging.f.execute(new c0(20, firebaseMessaging, jVar));
        com.google.android.gms.tasks.s sVar = jVar.a;
        y yVar = new y(new androidx.navigation.compose.r(23), 26);
        sVar.getClass();
        sVar.c(com.google.android.gms.tasks.k.a, yVar);
    }
}
