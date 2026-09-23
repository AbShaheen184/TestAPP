package androidx.work.impl.utils;

import androidx.work.impl.h0;
import androidx.work.y;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {
    public final int A;
    public final androidx.work.impl.d e;
    public final androidx.work.impl.j y;
    public final boolean z;

    public j(androidx.work.impl.d dVar, androidx.work.impl.j jVar, boolean z, int i) {
        dVar.getClass();
        jVar.getClass();
        this.e = dVar;
        this.y = jVar;
        this.z = z;
        this.A = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        h0 h0VarB;
        boolean z = this.z;
        androidx.work.impl.d dVar = this.e;
        androidx.work.impl.j jVar = this.y;
        if (z) {
            int i = this.A;
            dVar.getClass();
            String str = jVar.a.a;
            synchronized (dVar.k) {
                h0VarB = dVar.b(str);
            }
            zD = androidx.work.impl.d.d(str, h0VarB, i);
        } else {
            int i2 = this.A;
            dVar.getClass();
            String str2 = jVar.a.a;
            synchronized (dVar.k) {
                try {
                    if (dVar.f.get(str2) != null) {
                        y.e().a(androidx.work.impl.d.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) dVar.h.get(str2);
                        if (set != null && set.contains(jVar)) {
                            zD = androidx.work.impl.d.d(str2, dVar.b(str2), i2);
                        }
                    }
                    zD = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        y.e().a(y.g("StopWorkRunnable"), "StopWorkRunnable for " + this.y.a.a + "; Processor.stopWork = " + zD);
    }
}
