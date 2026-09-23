package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.a0;
import androidx.work.d;
import androidx.work.e;
import androidx.work.impl.model.p;
import androidx.work.y;
import androidx.work.z;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String d = y.g("SystemJobInfoConverter");
    public final ComponentName a;
    public final a0 b;
    public final boolean c;

    public b(Context context, a0 a0Var, boolean z) {
        this.b = a0Var;
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(p pVar, int i) {
        int i2;
        String str;
        e eVar = pVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.a);
        boolean z = eVar.c;
        Set<d> set = eVar.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = eVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestA = eVar.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || networkRequestA == null) {
            z zVar = eVar.a;
            if (i3 < 30 || zVar != z.C) {
                int iOrdinal = zVar.ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        i2 = 3;
                        if (iOrdinal != 3) {
                            i2 = 4;
                            if (iOrdinal != 4 || i3 < 26) {
                                y.e().a(d, "API version too low. Cannot convert network type value " + zVar);
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z2) {
            extras.setBackoffCriteria(pVar.m, pVar.l == androidx.work.a.y ? 0 : 1);
        }
        long jA = pVar.a();
        this.b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!pVar.q && this.c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (d dVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.a, dVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(eVar.g);
            extras.setTriggerContentMaxDelay(eVar.h);
        }
        extras.setPersisted(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            extras.setRequiresBatteryNotLow(eVar.e);
            extras.setRequiresStorageNotLow(eVar.f);
        }
        byte b = pVar.k > 0;
        boolean z3 = jMax > 0;
        if (i4 >= 31 && pVar.q && b == false && !z3) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = pVar.x) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
