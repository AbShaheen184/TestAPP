package androidx.work.impl.background.greedy;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.work.e;
import androidx.work.i0;
import androidx.work.impl.constraints.h;
import androidx.work.impl.constraints.trackers.i;
import androidx.work.impl.d;
import androidx.work.impl.f;
import androidx.work.impl.k;
import androidx.work.impl.model.j;
import androidx.work.impl.model.p;
import androidx.work.y;
import com.google.common.util.concurrent.k0;
import com.google.firebase.messaging.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f, h, androidx.work.impl.a {
    public static final String L = y.g("GreedyScheduler");
    public boolean A;
    public final d D;
    public final k E;
    public final androidx.work.b F;
    public Boolean H;
    public final t I;
    public final androidx.work.impl.utils.taskexecutor.a J;
    public final n K;
    public final Context e;
    public final a z;
    public final HashMap y = new HashMap();
    public final Object B = new Object();
    public final k C = new k(new androidx.work.h(1));
    public final HashMap G = new HashMap();

    public c(Context context, androidx.work.b bVar, i iVar, d dVar, k kVar, androidx.work.impl.utils.taskexecutor.a aVar) {
        this.e = context;
        t tVar = bVar.g;
        this.z = new a(this, tVar, bVar.d);
        this.K = new n(tVar, kVar);
        this.J = aVar;
        this.I = new t(iVar);
        this.F = bVar;
        this.D = dVar;
        this.E = kVar;
    }

    @Override // androidx.work.impl.f
    public final void a(p... pVarArr) {
        long jMax;
        if (this.H == null) {
            this.H = Boolean.valueOf(androidx.work.impl.utils.i.a(this.e, this.F));
        }
        if (!this.H.booleanValue()) {
            y.e().f(L, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.A) {
            this.D.a(this);
            this.A = true;
        }
        HashSet<p> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            if (!this.C.i(coil3.svg.internal.a.q(pVar))) {
                synchronized (this.B) {
                    try {
                        j jVarQ = coil3.svg.internal.a.q(pVar);
                        b bVar = (b) this.G.get(jVarQ);
                        if (bVar == null) {
                            int i = pVar.k;
                            this.F.d.getClass();
                            bVar = new b(i, System.currentTimeMillis());
                            this.G.put(jVarQ, bVar);
                        }
                        jMax = (((long) Math.max((pVar.k - bVar.a) - 5, 0)) * 30000) + bVar.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(pVar.a(), jMax);
                this.F.d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (pVar.b == i0.e) {
                    if (jCurrentTimeMillis < jMax2) {
                        a aVar = this.z;
                        if (aVar != null) {
                            t tVar = aVar.b;
                            HashMap map = aVar.d;
                            Runnable runnable = (Runnable) map.remove(pVar.a);
                            if (runnable != null) {
                                ((Handler) tVar.e).removeCallbacks(runnable);
                            }
                            k0 k0Var = new k0(4, aVar, pVar, false);
                            map.put(pVar.a, k0Var);
                            aVar.c.getClass();
                            ((Handler) tVar.e).postDelayed(k0Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!l.a(e.j, pVar.j)) {
                        e eVar = pVar.j;
                        if (eVar.d) {
                            y.e().a(L, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (eVar.i.isEmpty()) {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.a);
                        } else {
                            y.e().a(L, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.C.i(coil3.svg.internal.a.q(pVar))) {
                        y.e().a(L, "Starting work for " + pVar.a);
                        k kVar = this.C;
                        kVar.getClass();
                        androidx.work.impl.j jVarV = kVar.v(coil3.svg.internal.a.q(pVar));
                        this.K.I(jVarV);
                        k kVar2 = this.E;
                        kVar2.getClass();
                        kVar2.s(jVarV, null);
                    }
                }
            }
        }
        synchronized (this.B) {
            try {
                if (!hashSet.isEmpty()) {
                    y.e().a(L, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (p pVar2 : hashSet) {
                        j jVarQ2 = coil3.svg.internal.a.q(pVar2);
                        if (!this.y.containsKey(jVarQ2)) {
                            this.y.put(jVarQ2, androidx.work.impl.constraints.j.a(this.I, pVar2, ((androidx.work.impl.utils.taskexecutor.c) this.J).b, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.a
    public final void b(j jVar, boolean z) {
        Job job;
        androidx.work.impl.j jVarQ = this.C.q(jVar);
        if (jVarQ != null) {
            this.K.m(jVarQ);
        }
        synchronized (this.B) {
            job = (Job) this.y.remove(jVar);
        }
        if (job != null) {
            y.e().a(L, "Stopping tracking for " + jVar);
            job.cancel((CancellationException) null);
        }
        if (z) {
            return;
        }
        synchronized (this.B) {
            this.G.remove(jVar);
        }
    }

    @Override // androidx.work.impl.f
    public final boolean c() {
        return false;
    }

    @Override // androidx.work.impl.constraints.h
    public final void d(p pVar, androidx.work.impl.constraints.c cVar) {
        j jVarQ = coil3.svg.internal.a.q(pVar);
        boolean z = cVar instanceof androidx.work.impl.constraints.a;
        k kVar = this.E;
        n nVar = this.K;
        String str = L;
        k kVar2 = this.C;
        if (z) {
            if (kVar2.i(jVarQ)) {
                return;
            }
            y.e().a(str, "Constraints met: Scheduling work ID " + jVarQ);
            androidx.work.impl.j jVarV = kVar2.v(jVarQ);
            nVar.I(jVarV);
            kVar.getClass();
            kVar.s(jVarV, null);
            return;
        }
        y.e().a(str, "Constraints not met: Cancelling work ID " + jVarQ);
        androidx.work.impl.j jVarQ2 = kVar2.q(jVarQ);
        if (jVarQ2 != null) {
            nVar.m(jVarQ2);
            int i = ((androidx.work.impl.constraints.b) cVar).a;
            kVar.getClass();
            kVar.t(jVarQ2, i);
        }
    }

    @Override // androidx.work.impl.f
    public final void e(String str) {
        List<androidx.work.impl.j> listC;
        Runnable runnable;
        String str2 = L;
        if (this.H == null) {
            this.H = Boolean.valueOf(androidx.work.impl.utils.i.a(this.e, this.F));
        }
        if (!this.H.booleanValue()) {
            y.e().f(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.A) {
            this.D.a(this);
            this.A = true;
        }
        y.e().a(str2, "Cancelling work ID " + str);
        a aVar = this.z;
        if (aVar != null && (runnable = (Runnable) aVar.d.remove(str)) != null) {
            ((Handler) aVar.b.e).removeCallbacks(runnable);
        }
        k kVar = this.C;
        kVar.getClass();
        str.getClass();
        synchronized (kVar.z) {
            listC = ((androidx.work.h) kVar.y).c(str);
        }
        for (androidx.work.impl.j jVar : listC) {
            this.K.m(jVar);
            k kVar2 = this.E;
            kVar2.getClass();
            kVar2.t(jVar, -512);
        }
    }
}
