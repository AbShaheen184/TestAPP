package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import androidx.core.provider.m;
import androidx.work.impl.model.f;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.measurement.internal.j4;
import com.google.android.gms.measurement.internal.p3;
import com.google.android.gms.measurement.internal.u0;
import com.google.common.util.concurrent.k0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements p3 {
    public androidx.media3.exoplayer.hls.c e;

    @Override // com.google.android.gms.measurement.internal.p3
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.p3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final androidx.media3.exoplayer.hls.c d() {
        if (this.e == null) {
            this.e = new androidx.media3.exoplayer.hls.c(this, 26);
        }
        return this.e;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        androidx.media3.exoplayer.hls.c cVarD = d();
        Service service = (Service) cVarD.y;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            x.g(string);
            j4 j4VarC = j4.C(service);
            u0 u0VarB = j4VarC.b();
            f fVar = j4VarC.I.z;
            u0VarB.K.b(string, "Local AppMeasurementJobService called. action");
            j4VarC.e().E(new k0(cVarD, j4VarC, new m(13, cVarD, u0VarB, jobParameters)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        x.g(string);
        a7 a7VarC = a7.c(service, null);
        k0 k0Var = new k0(25, cVarD, jobParameters);
        a7VarC.getClass();
        a7VarC.a(new m6(a7VarC, k0Var, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    @Override // com.google.android.gms.measurement.internal.p3
    public final void b(Intent intent) {
    }
}
