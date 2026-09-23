package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.appcompat.widget.c2;
import androidx.work.h;
import androidx.work.impl.d;
import androidx.work.impl.k;
import androidx.work.impl.model.j;
import androidx.work.impl.t;
import androidx.work.y;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements androidx.work.impl.a {
    public static final String B = y.g("SystemJobService");
    public k A;
    public t e;
    public final HashMap y = new HashMap();
    public final h z = new h(1);

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        kotlinx.coroutines.future.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.r("Cannot invoke ", str, " on a background thread"));
    }

    public static j c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.a
    public final void b(j jVar, boolean z) {
        a("onExecuted");
        y.e().a(B, jVar.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.y.remove(jVar);
        this.z.b(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            t tVarB = t.b(getApplicationContext());
            this.e = tVarB;
            d dVar = tVarB.f;
            this.A = new k(dVar, tVarB.d);
            dVar.a(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            y.e().h(B, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        t tVar = this.e;
        if (tVar != null) {
            d dVar = tVar.f;
            synchronized (dVar.k) {
                dVar.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        t tVar = this.e;
        String str = B;
        if (tVar == null) {
            y.e().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j jVarC = c(jobParameters);
        if (jVarC == null) {
            y.e().c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.y;
        if (map.containsKey(jVarC)) {
            y.e().a(str, "Job is already being executed by SystemJobService: " + jVarC);
            return false;
        }
        y.e().a(str, "onStartJob for " + jVarC);
        map.put(jVarC, jobParameters);
        c2 c2Var = new c2(26);
        if (jobParameters.getTriggeredContentUris() != null) {
            c2Var.z = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            c2Var.y = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            c2Var.A = androidx.arch.core.executor.d.h(jobParameters);
        }
        this.A.s(this.z.e(jVarC), c2Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.e == null) {
            y.e().a(B, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j jVarC = c(jobParameters);
        if (jVarC == null) {
            y.e().c(B, "WorkSpec id not found!");
            return false;
        }
        y.e().a(B, "onStopJob for " + jVarC);
        this.y.remove(jVarC);
        androidx.work.impl.j jVarB = this.z.b(jVarC);
        if (jVarB != null) {
            int iH = Build.VERSION.SDK_INT >= 31 ? androidx.compose.ui.contentcapture.b.h(jobParameters) : -512;
            k kVar = this.A;
            kVar.getClass();
            kVar.t(jVarB, iH);
        }
        d dVar = this.e.f;
        String str = jVarC.a;
        synchronized (dVar.k) {
            zContains = dVar.i.contains(str);
        }
        return !zContains;
    }
}
