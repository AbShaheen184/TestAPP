package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.media3.ui.c0;
import com.appsalt.internal.k0;
import com.google.android.datatransport.runtime.s;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int e = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        com.google.android.datatransport.runtime.j jVarA = com.google.android.datatransport.runtime.k.a();
        jVarA.v(string);
        jVarA.A = com.google.android.datatransport.runtime.util.a.b(i);
        if (string2 != null) {
            jVarA.z = Base64.decode(string2, 0);
        }
        k0 k0Var = s.a().d;
        ((Executor) k0Var.e).execute(new d(k0Var, jVarA.n(), i2, new c0(9, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
