package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Looper;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.t2;
import androidx.media3.common.c0;
import androidx.media3.common.d0;
import androidx.media3.common.j0;
import androidx.media3.common.util.i0;
import androidx.media3.common.w;
import androidx.media3.common.x;
import androidx.media3.common.y;
import androidx.media3.exoplayer.source.b1;
import androidx.media3.exoplayer.source.v;
import com.google.common.collect.h0;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends androidx.media3.exoplayer.source.a {
    public final d h;
    public final c i;
    public final com.google.android.material.shape.f j;
    public final androidx.media3.exoplayer.drm.f k;
    public final t2 l;
    public final boolean m;
    public final int n;
    public final androidx.media3.exoplayer.hls.playlist.d o;
    public final long p;
    public x q;
    public androidx.media3.exoplayer.upstream.f r;
    public c0 s;

    static {
        d0.a("media3.exoplayer.hls");
    }

    public m(c0 c0Var, c cVar, d dVar, com.google.android.material.shape.f fVar, androidx.media3.exoplayer.drm.f fVar2, t2 t2Var, androidx.media3.exoplayer.hls.playlist.d dVar2, long j, boolean z, int i) {
        this.s = c0Var;
        this.q = c0Var.c;
        this.i = cVar;
        this.h = dVar;
        this.j = fVar;
        this.k = fVar2;
        this.l = t2Var;
        this.o = dVar2;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static androidx.media3.exoplayer.hls.playlist.h t(long j, List list) {
        androidx.media3.exoplayer.hls.playlist.h hVar = null;
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.hls.playlist.h hVar2 = (androidx.media3.exoplayer.hls.playlist.h) list.get(i);
            long j2 = hVar2.B;
            if (j2 > j || !hVar2.I) {
                if (j2 > j) {
                    break;
                }
            } else {
                hVar = hVar2;
            }
        }
        return hVar;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final androidx.media3.exoplayer.source.u b(v vVar, c2 c2Var, long j) {
        androidx.media3.exoplayer.drm.d dVarA = a(vVar);
        androidx.media3.exoplayer.drm.d dVar = new androidx.media3.exoplayer.drm.d(this.d.c, 0, vVar);
        androidx.media3.exoplayer.upstream.f fVar = this.r;
        androidx.media3.exoplayer.analytics.k kVar = this.g;
        kVar.getClass();
        return new l(this.h, this.o, this.i, fVar, this.k, dVar, this.l, dVarA, c2Var, this.j, this.m, this.n, kVar);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final synchronized c0 h() {
        return this.s;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void j() throws IOException {
        androidx.media3.exoplayer.hls.playlist.d dVar = this.o;
        androidx.media3.exoplayer.upstream.n nVar = dVar.D;
        if (nVar != null) {
            nVar.b();
        }
        j0 j0Var = dVar.H;
        if (j0Var != null) {
            throw j0Var;
        }
        Uri uri = dVar.M;
        if (uri != null) {
            dVar.i(uri);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void l(androidx.media3.exoplayer.upstream.f fVar) {
        this.r = fVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        androidx.media3.exoplayer.analytics.k kVar = this.g;
        kVar.getClass();
        androidx.media3.exoplayer.drm.f fVar2 = this.k;
        fVar2.d(looperMyLooper, kVar);
        fVar2.b();
        androidx.media3.exoplayer.drm.d dVarA = a(null);
        y yVar = h().b;
        yVar.getClass();
        Uri uri = yVar.a;
        androidx.media3.exoplayer.hls.playlist.d dVar = this.o;
        dVar.getClass();
        dVar.E = i0.q(null);
        dVar.C = dVarA;
        dVar.F = this;
        Map map = Collections.EMPTY_MAP;
        _COROUTINE.a.v(uri, "The uri must be set.");
        androidx.media3.exoplayer.upstream.q qVar = new androidx.media3.exoplayer.upstream.q(((androidx.media3.datasource.g) dVar.e.y).b(), new androidx.media3.datasource.l(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, dVar.y.l());
        _COROUTINE.a.A(dVar.D == null);
        androidx.media3.exoplayer.upstream.n nVar = new androidx.media3.exoplayer.upstream.n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.D = nVar;
        nVar.f(qVar, dVar, dVar.z.f(qVar.z));
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void n(androidx.media3.exoplayer.source.u uVar) {
        l lVar = (l) uVar;
        lVar.y.B.remove(lVar);
        for (r rVar : lVar.Q) {
            if (rVar.a0) {
                for (q qVar : rVar.S) {
                    qVar.k();
                    androidx.media3.exoplayer.dash.manifest.t tVar = qVar.h;
                    if (tVar != null) {
                        tVar.M(qVar.e);
                        qVar.h = null;
                        qVar.g = null;
                    }
                }
            }
            j jVar = rVar.A;
            int iM = jVar.r.m();
            androidx.media3.exoplayer.hls.playlist.d dVar = jVar.g;
            Uri uriC = jVar.e[iM].c();
            androidx.media3.exoplayer.hls.playlist.c cVar = (androidx.media3.exoplayer.hls.playlist.c) dVar.A.get(uriC);
            if (cVar != null) {
                androidx.media3.exoplayer.hls.playlist.b bVar = (androidx.media3.exoplayer.hls.playlist.b) androidx.compose.runtime.j.c(cVar.b, uriC, uriC);
                bVar.getClass();
                bVar.I = false;
            }
            jVar.n = null;
            rVar.G.e(rVar);
            rVar.O.removeCallbacksAndMessages(null);
            rVar.e0 = true;
            rVar.P.clear();
        }
        lVar.N = null;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void p() {
        androidx.media3.exoplayer.hls.playlist.d dVar = this.o;
        dVar.M = null;
        dVar.N = null;
        dVar.G = null;
        dVar.I = null;
        dVar.J = null;
        dVar.K = null;
        dVar.L = null;
        dVar.H = null;
        dVar.P = -9223372036854775807L;
        dVar.D.e(null);
        dVar.D = null;
        HashMap map = dVar.A;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((androidx.media3.exoplayer.hls.playlist.c) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((androidx.media3.exoplayer.hls.playlist.b) it2.next()).z.e(null);
            }
        }
        dVar.E.removeCallbacksAndMessages(null);
        dVar.E = null;
        map.clear();
        this.k.c();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final synchronized void s(c0 c0Var) {
        this.s = c0Var;
    }

    public final void u(androidx.media3.exoplayer.hls.playlist.m mVar) {
        long j;
        b1 b1Var;
        long j2;
        long jQ;
        long j3;
        boolean z = mVar.p;
        boolean z2 = mVar.g;
        h0 h0Var = mVar.r;
        long j4 = mVar.u;
        long jQ2 = mVar.e;
        int i = mVar.d;
        long j5 = mVar.h;
        long jD0 = z ? i0.d0(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jD0 : -9223372036854775807L;
        androidx.media3.exoplayer.hls.playlist.d dVar = this.o;
        dVar.G.getClass();
        com.google.firebase.heartbeatinfo.e eVar = new com.google.firebase.heartbeatinfo.e(10);
        long j7 = 0;
        if (dVar.O) {
            androidx.media3.exoplayer.hls.playlist.l lVar = mVar.v;
            long j8 = j5 - dVar.P;
            boolean z3 = mVar.o;
            long j9 = z3 ? j8 + j4 : -9223372036854775807L;
            long jQ3 = mVar.p ? i0.Q(i0.C(this.p)) - (j5 + j4) : 0L;
            long j10 = this.q.a;
            if (j10 != -9223372036854775807L) {
                jQ = i0.Q(j10);
            } else {
                if (jQ2 != -9223372036854775807L) {
                    j2 = j4 - jQ2;
                } else {
                    j2 = lVar.d;
                    if (j2 == -9223372036854775807L || mVar.n == -9223372036854775807L) {
                        j2 = lVar.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * mVar.m;
                        }
                    }
                }
                jQ = j2 + jQ3;
            }
            long j11 = j4 + jQ3;
            long jK = i0.k(jQ, jQ3, j11);
            x xVar = h().c;
            boolean z4 = xVar.d == -3.4028235E38f && xVar.e == -3.4028235E38f && lVar.c == -9223372036854775807L && lVar.d == -9223372036854775807L;
            x xVar2 = this.q;
            w wVar = new w();
            wVar.a = xVar2.a;
            wVar.b = xVar2.b;
            wVar.c = xVar2.c;
            wVar.d = xVar2.d;
            wVar.e = xVar2.e;
            wVar.a = i0.d0(jK);
            wVar.d = z4 ? 1.0f : this.q.d;
            wVar.e = z4 ? 1.0f : this.q.e;
            x xVar3 = new x(wVar);
            this.q = xVar3;
            if (jQ2 == -9223372036854775807L) {
                jQ2 = j11 - i0.Q(xVar3.a);
            }
            if (z2) {
                j7 = jQ2;
            } else {
                androidx.media3.exoplayer.hls.playlist.h hVarT = t(jQ2, mVar.s);
                if (hVarT != null) {
                    j3 = hVarT.B;
                } else if (!h0Var.isEmpty()) {
                    androidx.media3.exoplayer.hls.playlist.j jVar = (androidx.media3.exoplayer.hls.playlist.j) h0Var.get(i0.d(h0Var, Long.valueOf(jQ2), true));
                    androidx.media3.exoplayer.hls.playlist.h hVarT2 = t(jQ2, jVar.J);
                    j3 = hVarT2 != null ? hVarT2.B : jVar.B;
                }
                j7 = j3;
            }
            b1Var = new b1(j6, jD0, j9, mVar.u, j8, j7, true, !z3, i == 2 && mVar.f, eVar, h(), this.q);
        } else {
            if (jQ2 == -9223372036854775807L || h0Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jQ2 != j4) {
                    jQ2 = ((androidx.media3.exoplayer.hls.playlist.j) h0Var.get(i0.d(h0Var, Long.valueOf(jQ2), true))).B;
                }
                j = jQ2;
            }
            long j12 = mVar.u;
            b1Var = new b1(j6, jD0, j12, j12, 0L, j, true, false, true, eVar, h(), null);
        }
        m(b1Var);
    }
}
