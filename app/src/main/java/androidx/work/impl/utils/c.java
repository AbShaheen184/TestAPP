package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.material3.internal.r0;
import androidx.navigation.compose.r;
import androidx.work.i0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.p;
import androidx.work.impl.t;
import androidx.work.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public static final String B = y.g("ForceStopRunnable");
    public static final long C = 315360000000L;
    public int A = 0;
    public final Context e;
    public final t y;
    public final androidx.media3.exoplayer.dash.manifest.t z;

    public c(Context context, t tVar) {
        this.e = context.getApplicationContext();
        this.y = tVar;
        this.z = tVar.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + C;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0213  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01fb  */
    public final void a() {
        boolean z;
        androidx.media3.exoplayer.dash.manifest.t tVar = this.z;
        t tVar2 = this.y;
        WorkDatabase workDatabase = tVar2.c;
        androidx.work.b bVar = tVar2.b;
        androidx.media3.exoplayer.dash.manifest.t tVar3 = tVar2.g;
        WorkDatabase workDatabase2 = tVar2.c;
        String str = androidx.work.impl.background.systemjob.c.C;
        Context context = this.e;
        JobScheduler jobSchedulerA = androidx.work.impl.background.systemjob.a.a(context);
        ArrayList<JobInfo> arrayListD = androidx.work.impl.background.systemjob.c.d(context, jobSchedulerA);
        List list = (List) okhttp3.internal.platform.android.g.t(workDatabase.t().a, true, false, new r(11));
        HashSet hashSet = new HashSet(arrayListD != null ? arrayListD.size() : 0);
        if (arrayListD != null && !arrayListD.isEmpty()) {
            for (JobInfo jobInfo : arrayListD) {
                androidx.work.impl.model.j jVarF = androidx.work.impl.background.systemjob.c.f(jobInfo);
                if (jVarF != null) {
                    hashSet.add(jVarF.a);
                } else {
                    androidx.work.impl.background.systemjob.c.b(jobSchedulerA, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    y.e().a(androidx.work.impl.background.systemjob.c.C, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.b();
            try {
                androidx.work.impl.model.t tVarW = workDatabase.w();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    tVarW.e((String) it2.next(), -1L);
                }
                workDatabase.p();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        androidx.work.impl.model.t tVarW2 = workDatabase2.w();
        androidx.work.impl.model.n nVarV = workDatabase2.v();
        workDatabase2.b();
        try {
            List list2 = (List) okhttp3.internal.platform.android.g.t(tVarW2.a, true, false, new r(14));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (Iterator it3 = list2.iterator(); it3.hasNext(); it3 = it3) {
                    p pVar = (p) it3.next();
                    i0 i0Var = i0.e;
                    String str2 = pVar.a;
                    tVarW2.h(i0Var, str2);
                    tVarW2.i(-512, str2);
                    tVarW2.e(str2, -1L);
                    z2 = z2;
                }
            }
            boolean z3 = z2;
            okhttp3.internal.platform.android.g.t(nVarV.a, false, true, new r(12));
            workDatabase2.p();
            workDatabase2.f();
            boolean z4 = z3 || z;
            Long lA = ((WorkDatabase) tVar3.e).s().a("reschedule_needed");
            String str3 = B;
            if (lA != null && lA.longValue() == 1) {
                y.e().a(str3, "Rescheduling Workers.");
                tVar2.d();
                tVar3.getClass();
                androidx.work.impl.model.d dVar = new androidx.work.impl.model.d("reschedule_needed", 0L);
                androidx.work.impl.model.e eVarS = ((WorkDatabase) tVar3.e).s();
                okhttp3.internal.platform.android.g.t(eVarS.a, false, true, new r0(11, eVarS, dVar));
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                int i2 = i >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
                if (i < 30) {
                    if (broadcast == null) {
                        c(context);
                        y.e().a(str3, "Application was force-stopped, rescheduling.");
                        tVar2.d();
                        bVar.d.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        tVar.getClass();
                        androidx.work.impl.model.d dVar2 = new androidx.work.impl.model.d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis));
                        androidx.work.impl.model.e eVarS2 = ((WorkDatabase) tVar.e).s();
                        okhttp3.internal.platform.android.g.t(eVarS2.a, false, true, new r0(11, eVarS2, dVar2));
                        return;
                    }
                    if (z4) {
                        y.e().a(str3, "Found unfinished work, scheduling it.");
                        androidx.work.impl.i.b(bVar, workDatabase2, tVar2.e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = ((WorkDatabase) tVar.e).s().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i3 = 0; i3 < historicalProcessExitReasons.size(); i3++) {
                        ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i3);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jLongValue) {
                            y.e().a(str3, "Application was force-stopped, rescheduling.");
                            tVar2.d();
                            bVar.d.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            tVar.getClass();
                            androidx.work.impl.model.d dVar3 = new androidx.work.impl.model.d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2));
                            androidx.work.impl.model.e eVarS3 = ((WorkDatabase) tVar.e).s();
                            okhttp3.internal.platform.android.g.t(eVarS3.a, false, true, new r0(11, eVarS3, dVar3));
                            return;
                        }
                    }
                }
                if (z4) {
                    y.e().a(str3, "Found unfinished work, scheduling it.");
                    androidx.work.impl.i.b(bVar, workDatabase2, tVar2.e);
                }
            } catch (IllegalArgumentException e) {
                e = e;
                if (y.e().a <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            } catch (SecurityException e2) {
                e = e2;
                if (y.e().a <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            }
        } catch (Throwable th2) {
            workDatabase2.f();
            throw th2;
        }
    }

    public final boolean b() {
        androidx.work.b bVar = this.y.b;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = B;
        if (zIsEmpty) {
            y.e().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = i.a(this.e, bVar);
        y.e().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.e;
        String str = B;
        t tVar = this.y;
        try {
            if (!b()) {
                tVar.c();
                return;
            }
            while (true) {
                try {
                    coil3.network.g.x(context);
                    y.e().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        tVar.c();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.A + 1;
                        this.A = i;
                        if (i >= 3) {
                            String str2 = com.google.firebase.b.L(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            y.e().d(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            tVar.b.getClass();
                            throw illegalStateException;
                        }
                        y.e().b(str, "Retrying after " + (((long) i) * 300), e);
                        try {
                            Thread.sleep(((long) this.A) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    y.e().c(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    tVar.b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            tVar.c();
            throw th;
        }
    }
}
