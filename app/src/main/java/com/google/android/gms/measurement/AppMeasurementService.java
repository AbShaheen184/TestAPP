package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.j4;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.p3;
import com.google.android.gms.measurement.internal.u0;
import com.google.android.gms.measurement.internal.w1;
import com.google.common.util.concurrent.k0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements p3 {
    public androidx.media3.exoplayer.hls.c e;

    @Override // com.google.android.gms.measurement.internal.p3
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // com.google.android.gms.measurement.internal.p3
    public final void b(Intent intent) {
        SparseArray sparseArray = androidx.legacy.content.a.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = androidx.legacy.content.a.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.p3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final androidx.media3.exoplayer.hls.c d() {
        if (this.e == null) {
            this.e = new androidx.media3.exoplayer.hls.c(this, 26);
        }
        return this.e;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        androidx.media3.exoplayer.hls.c cVarD = d();
        cVarD.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new w1(j4.C((Service) cVarD.y));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().y).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().y).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final androidx.media3.exoplayer.hls.c cVarD = d();
        if (intent == null) {
            cVarD.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) cVarD.y;
        final u0 u0Var = p1.s(service, null, null, null).C;
        p1.m(u0Var);
        String action = intent.getAction();
        u0Var.K.c(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.measurement.internal.q3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) cVarD.y;
                p3 p3Var = (p3) service2;
                int i3 = i2;
                if (p3Var.a(i3)) {
                    u0Var.K.b(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    u0 u0Var2 = p1.s(service2, null, null, null).C;
                    p1.m(u0Var2);
                    u0Var2.K.a("Completed wakeful intent.");
                    p3Var.b(intent);
                }
            }
        };
        j4 j4VarC = j4.C(service);
        j4VarC.e().E(new k0(cVarD, j4VarC, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
