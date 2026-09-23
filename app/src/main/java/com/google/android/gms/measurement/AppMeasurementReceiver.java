package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.manifest.t;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.u0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends androidx.legacy.content.a {
    public t c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new t(this);
        }
        t tVar = this.c;
        tVar.getClass();
        u0 u0Var = p1.s(context, null, null, null).C;
        p1.m(u0Var);
        if (intent == null) {
            u0Var.F.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        u0Var.K.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                u0Var.F.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        u0Var.K.a("Starting wakeful intent.");
        ((AppMeasurementReceiver) tVar.e).getClass();
        SparseArray sparseArray = androidx.legacy.content.a.a;
        synchronized (sparseArray) {
            try {
                int i = androidx.legacy.content.a.b;
                int i2 = i + 1;
                androidx.legacy.content.a.b = i2;
                if (i2 <= 0) {
                    androidx.legacy.content.a.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
