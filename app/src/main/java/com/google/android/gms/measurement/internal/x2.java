package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends h0 {
    public JobScheduler z;

    public final int A() {
        p1 p1Var = (p1) this.e;
        w();
        v();
        if (this.z == null) {
            return 7;
        }
        Boolean boolI = p1Var.A.I("google_analytics_sgtm_upload_enabled");
        if (!(boolI == null ? false : boolI.booleanValue())) {
            return 8;
        }
        if (p1Var.r().G < 119000) {
            return 6;
        }
        if (p4.Q(p1Var.e)) {
            return !p1Var.p().C() ? 5 : 2;
        }
        return 3;
    }

    @Override // com.google.android.gms.measurement.internal.h0
    public final boolean y() {
        return true;
    }

    public final void z(long j) {
        p1 p1Var = (p1) this.e;
        w();
        v();
        JobScheduler jobScheduler = this.z;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(p1Var.e.getPackageName())).hashCode()) != null) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.K.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iA = A();
        if (iA != 2) {
            u0 u0Var2 = p1Var.C;
            p1.m(u0Var2);
            u0Var2.K.b(com.google.android.datatransport.runtime.a.v(iA), "[sgtm] Not eligible for Scion upload");
            return;
        }
        u0 u0Var3 = p1Var.C;
        p1.m(u0Var3);
        u0Var3.K.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(p1Var.e.getPackageName())).hashCode(), new ComponentName(p1Var.e, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.z;
        com.google.android.gms.common.internal.x.g(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        u0 u0Var4 = p1Var.C;
        p1.m(u0Var4);
        u0Var4.K.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }
}
