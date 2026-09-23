package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.u5;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 extends e4 {
    public final AlarmManager A;
    public t3 B;
    public Integer C;

    public z3(j4 j4Var) {
        super(j4Var);
        this.A = (AlarmManager) ((p1) this.e).e.getSystemService("alarm");
    }

    public final void A() {
        w();
        p1 p1Var = (p1) this.e;
        u0 u0Var = p1Var.C;
        p1.m(u0Var);
        u0Var.K.a("Unscheduling upload");
        AlarmManager alarmManager = this.A;
        if (alarmManager != null) {
            Context context = p1Var.e;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), u5.a));
        }
        z().c();
        B();
    }

    public final void B() {
        JobScheduler jobScheduler = (JobScheduler) ((p1) this.e).e.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(C());
        }
    }

    public final int C() {
        if (this.C == null) {
            this.C = Integer.valueOf("measurement".concat(String.valueOf(((p1) this.e).e.getPackageName())).hashCode());
        }
        return this.C.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.e4
    public final void y() {
        AlarmManager alarmManager = this.A;
        if (alarmManager != null) {
            Context context = ((p1) this.e).e;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), u5.a));
        }
        B();
    }

    public final n z() {
        if (this.B == null) {
            this.B = new t3(this, this.y.I, 1);
        }
        return this.B;
    }
}
