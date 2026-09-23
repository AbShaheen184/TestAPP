package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.compose.material3.internal.r0;
import androidx.room.r;
import androidx.work.f0;
import androidx.work.i0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.f;
import androidx.work.impl.model.g;
import androidx.work.impl.model.h;
import androidx.work.impl.model.i;
import androidx.work.impl.model.j;
import androidx.work.impl.model.p;
import androidx.work.impl.model.t;
import androidx.work.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.collections.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {
    public static final String C = y.g("SystemJobScheduler");
    public final WorkDatabase A;
    public final androidx.work.b B;
    public final Context e;
    public final JobScheduler y;
    public final b z;

    public c(Context context, WorkDatabase workDatabase, androidx.work.b bVar) {
        JobScheduler jobSchedulerA = a.a(context);
        b bVar2 = new b(context, bVar.d, bVar.l);
        this.e = context;
        this.y = jobSchedulerA;
        this.z = bVar2;
        this.A = workDatabase;
        this.B = bVar;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            y.e().d(C, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = a.a;
        jobScheduler.getClass();
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
        } catch (Throwable th) {
            y.e().d(a.a, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.f
    public final void a(p... pVarArr) {
        int iIntValue;
        androidx.work.b bVar = this.B;
        WorkDatabase workDatabase = this.A;
        final androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c(workDatabase);
        boolean z = false;
        for (p pVar : pVarArr) {
            workDatabase.b();
            try {
                t tVarW = workDatabase.w();
                String str = pVar.a;
                p pVarC = tVarW.c(str);
                String str2 = C;
                if (pVarC == null) {
                    y.e().h(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (pVarC.b != i0.e) {
                    y.e().h(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    j jVarQ = coil3.svg.internal.a.q(pVar);
                    int i = jVarQ.b;
                    String str3 = jVarQ.a;
                    i iVarT = workDatabase.t();
                    iVarT.getClass();
                    str3.getClass();
                    g gVar = (g) okhttp3.internal.platform.android.g.t(iVarT.a, true, z, new h(str3, i, 0));
                    if (gVar != null) {
                        iIntValue = gVar.c;
                    } else {
                        bVar.getClass();
                        final int i2 = bVar.i;
                        WorkDatabase workDatabase2 = (WorkDatabase) cVar.y;
                        Callable callable = new Callable() { // from class: androidx.work.impl.utils.d
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase3 = (WorkDatabase) cVar.y;
                                Long lA = workDatabase3.s().a("next_job_scheduler_id");
                                int i3 = 0;
                                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                int i4 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                                androidx.work.impl.model.e eVarS = workDatabase3.s();
                                okhttp3.internal.platform.android.g.t(eVarS.a, false, true, new r0(11, eVarS, new androidx.work.impl.model.d("next_job_scheduler_id", Long.valueOf(i4))));
                                if (iLongValue < 0 || iLongValue > i2) {
                                    androidx.work.impl.model.e eVarS2 = workDatabase3.s();
                                    okhttp3.internal.platform.android.g.t(eVarS2.a, false, true, new r0(11, eVarS2, new androidx.work.impl.model.d("next_job_scheduler_id", Long.valueOf(1))));
                                } else {
                                    i3 = iLongValue;
                                }
                                return Integer.valueOf(i3);
                            }
                        };
                        workDatabase2.getClass();
                        Object objO = workDatabase2.o(new androidx.navigation.internal.h(callable, 2));
                        objO.getClass();
                        iIntValue = ((Number) objO).intValue();
                    }
                    if (gVar == null) {
                        g gVar2 = new g(str3, i, iIntValue);
                        i iVarT2 = workDatabase.t();
                        iVarT2.getClass();
                        r rVar = iVarT2.a;
                        r0 r0Var = new r0(12, iVarT2, gVar2);
                        z = false;
                        okhttp3.internal.platform.android.g.t(rVar, false, true, r0Var);
                    } else {
                        z = false;
                    }
                    g(pVar, iIntValue);
                    workDatabase.p();
                }
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.f
    public final boolean c() {
        return true;
    }

    @Override // androidx.work.impl.f
    public final void e(String str) {
        ArrayList arrayList;
        Context context = this.e;
        JobScheduler jobScheduler = this.y;
        ArrayList<JobInfo> arrayListD = d(context, jobScheduler);
        if (arrayListD == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListD) {
                j jVarF = f(jobInfo);
                if (jVarF != null && str.equals(jVarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b(jobScheduler, ((Integer) it.next()).intValue());
        }
        i iVarT = this.A.t();
        iVarT.getClass();
        str.getClass();
        okhttp3.internal.platform.android.g.t(iVarT.a, false, true, new androidx.compose.material3.r(str, 9));
    }

    public final void g(p pVar, int i) {
        List<JobInfo> allPendingJobs;
        JobInfo jobInfoA = this.z.a(pVar, i);
        y yVarE = y.e();
        StringBuilder sb = new StringBuilder("Scheduling work ID ");
        String str = pVar.a;
        sb.append(str);
        sb.append("Job ID ");
        sb.append(i);
        String string = sb.toString();
        String str2 = C;
        yVarE.a(str2, string);
        try {
            if (this.y.schedule(jobInfoA) == 0) {
                y.e().h(str2, "Unable to schedule work ID " + str);
                if (pVar.q && pVar.r == f0.e) {
                    pVar.q = false;
                    y.e().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(pVar, i);
                }
            }
        } catch (IllegalStateException e) {
            String str3 = a.a;
            Context context = this.e;
            context.getClass();
            WorkDatabase workDatabase = this.A;
            workDatabase.getClass();
            androidx.work.b bVar = this.B;
            bVar.getClass();
            int i2 = Build.VERSION.SDK_INT;
            int i3 = i2 >= 31 ? 150 : 100;
            int size = ((List) okhttp3.internal.platform.android.g.t(workDatabase.w().a, true, false, new androidx.navigation.compose.r(13))).size();
            String strI = "<faulty JobScheduler failed to getPendingJobs>";
            if (i2 >= 34) {
                JobScheduler jobSchedulerA = a.a(context);
                try {
                    allPendingJobs = jobSchedulerA.getAllPendingJobs();
                    allPendingJobs.getClass();
                } catch (Throwable th) {
                    y.e().d(a.a, "getAllPendingJobs() is not reliable on this device.", th);
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListD = d(context, jobSchedulerA);
                    int size2 = arrayListD != null ? allPendingJobs.size() - arrayListD.size() : 0;
                    String strD = size2 == 0 ? null : androidx.compose.runtime.j.d(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayListD2 = d(context, (JobScheduler) systemService);
                    int size3 = arrayListD2 != null ? arrayListD2.size() : 0;
                    strI = kotlin.collections.p.I(o.q(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", strD, size3 != 0 ? androidx.compose.runtime.j.d(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListD3 = d(context, a.a(context));
                if (arrayListD3 != null) {
                    strI = arrayListD3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb2 = new StringBuilder("JobScheduler ");
            sb2.append(i3);
            sb2.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb2.append(strI);
            sb2.append(".\nThere are ");
            sb2.append(size);
            sb2.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strT = androidx.privacysandbox.ads.adservices.java.internal.a.t(sb2, bVar.k, '.');
            y.e().c(str2, strT);
            throw new IllegalStateException(strT, e);
        } catch (Throwable th2) {
            y.e().d(str2, "Unable to schedule " + pVar, th2);
        }
    }
}
