package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.compose.animation.core.t2;
import androidx.media3.common.j0;
import androidx.media3.common.util.i0;
import androidx.media3.datasource.y;
import com.google.common.collect.h0;
import com.google.common.collect.k0;
import com.google.common.collect.p1;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.media3.exoplayer.upstream.i {
    public static final androidx.media3.exoplayer.analytics.d Q = new androidx.media3.exoplayer.analytics.d(29);
    public androidx.media3.exoplayer.drm.d C;
    public androidx.media3.exoplayer.upstream.n D;
    public Handler E;
    public androidx.media3.exoplayer.hls.m F;
    public p G;
    public j0 H;
    public h0 I;
    public h0 J;
    public h0 K;
    public h0 L;
    public Uri M;
    public m N;
    public boolean O;
    public final androidx.media3.exoplayer.hls.c e;
    public final t y;
    public final t2 z;
    public final CopyOnWriteArrayList B = new CopyOnWriteArrayList();
    public final HashMap A = new HashMap();
    public long P = -9223372036854775807L;

    public d(androidx.media3.exoplayer.hls.c cVar, t2 t2Var, t tVar) {
        this.e = cVar;
        this.y = tVar;
        this.z = t2Var;
    }

    public final void a(List list) {
        for (int i = 0; i < list.size(); i++) {
            w wVar = (w) list.get(i);
            c cVar = new c(this, wVar);
            p1 it = k0.l(wVar.b.values()).iterator();
            while (it.hasNext()) {
                this.A.put((Uri) it.next(), cVar);
            }
        }
    }

    public final m b(boolean z, Uri uri) {
        HashMap map = this.A;
        c cVar = (c) map.get(uri);
        if (cVar == null) {
            return null;
        }
        m mVarA = c.a(cVar, uri);
        if (mVarA != null && z) {
            h(uri);
            c cVar2 = (c) map.get(uri);
            cVar2.getClass();
            HashMap map2 = cVar2.b;
            b bVar = (b) androidx.compose.runtime.j.c(map2, uri, uri);
            bVar.getClass();
            if (!bVar.I) {
                b bVar2 = (b) androidx.compose.runtime.j.c(map2, uri, uri);
                bVar2.getClass();
                bVar2.I = true;
                m mVarA2 = c.a(cVar2, uri);
                if (mVarA2 != null && !mVarA2.o) {
                    c.b(cVar2, uri, true);
                }
            }
        }
        return mVarA;
    }

    public final h0 c(int i) {
        if (i == 0) {
            return this.I;
        }
        if (i == 1) {
            return this.J;
        }
        if (i == 2) {
            return this.K;
        }
        if (i != 3) {
            return null;
        }
        return this.L;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.N;
        if (mVar == null || !mVar.v.e || (iVar = (i) mVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.b));
        int i = iVar.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean e(w wVar, long j) {
        c cVar = (c) this.A.get(wVar.c());
        if (cVar == null) {
            return false;
        }
        Iterator it = cVar.b.values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= j <= ((b) it.next()).F;
        }
        return z;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final androidx.media3.exoplayer.upstream.h f(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, IOException iOException, int i) {
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        long j3 = qVar.e;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        int i2 = qVar.z;
        long jG = this.z.g(new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(iOException, i, 3));
        boolean z = jG == -9223372036854775807L;
        this.C.f(nVar, i2, iOException, z);
        return z ? androidx.media3.exoplayer.upstream.n.f : new androidx.media3.exoplayer.upstream.h(jG, 0, false);
    }

    public final boolean g(Uri uri) {
        int i;
        c cVar = (c) this.A.get(uri);
        if (cVar == null) {
            return false;
        }
        b bVar = (b) androidx.compose.runtime.j.c(cVar.b, uri, uri);
        bVar.getClass();
        if (bVar.B == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, i0.d0(bVar.B.u));
        m mVar = bVar.B;
        return mVar.o || (i = mVar.d) == 2 || i == 1 || bVar.C + jMax > jElapsedRealtime;
    }

    public final void h(Uri uri) {
        if (uri.equals(this.M)) {
            return;
        }
        List list = this.G.d;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(((o) list.get(i)).a)) {
                m mVar = this.N;
                if (mVar == null || !mVar.o) {
                    this.M = uri;
                    c cVar = (c) this.A.get(uri);
                    cVar.getClass();
                    m mVarA = c.a(cVar, uri);
                    if (mVarA != null && mVarA.o) {
                        this.N = mVarA;
                        this.F.u(mVarA);
                        return;
                    } else {
                        Uri uriD = d(uri);
                        b bVar = (b) androidx.compose.runtime.j.c(cVar.b, uri, uri);
                        bVar.getClass();
                        bVar.c(uriD);
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void i(Uri uri) {
        c cVar = (c) this.A.get(uri);
        if (cVar != null) {
            b bVar = (b) androidx.compose.runtime.j.c(cVar.b, uri, uri);
            bVar.getClass();
            bVar.z.b();
            IOException iOException = bVar.H;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void n(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, int i) {
        androidx.media3.exoplayer.source.n nVar;
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        if (i == 0) {
            long j3 = qVar.e;
            nVar = new androidx.media3.exoplayer.source.n(qVar.y, j);
        } else {
            long j4 = qVar.e;
            androidx.media3.datasource.l lVar = qVar.y;
            y yVar = qVar.A;
            nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        }
        this.C.g(nVar, qVar.z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void s(androidx.media3.exoplayer.upstream.k kVar, long j, long j2) {
        p pVar;
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        q qVar2 = (q) qVar.C;
        boolean z = qVar2 instanceof m;
        if (z) {
            String str = qVar2.a;
            p pVar2 = p.l;
            Uri uri = Uri.parse(str);
            androidx.media3.common.q qVar3 = new androidx.media3.common.q();
            qVar3.a = "0";
            qVar3.m = androidx.media3.common.i0.p("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new o(uri, new androidx.media3.common.r(qVar3), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar2;
        }
        this.G = pVar;
        try {
            this.I = w.b(pVar.d);
            this.J = w.a(pVar.e);
            this.K = w.a(pVar.f);
            this.L = w.a(pVar.g);
            this.M = ((w) this.I.get(0)).c();
            this.B.add(new a(this));
            a(this.I);
            a(this.J);
            a(this.K);
            a(this.L);
            androidx.media3.datasource.l lVar = qVar.y;
            y yVar = qVar.A;
            androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
            c cVar = (c) this.A.get(this.M);
            cVar.getClass();
            if (z) {
                Uri uri2 = qVar.A.z;
                b bVar = (b) androidx.compose.runtime.j.c(cVar.b, uri2, uri2);
                bVar.getClass();
                bVar.d((m) qVar2, nVar);
            } else {
                c.b(cVar, this.M, false);
            }
            this.z.getClass();
            this.C.d(nVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (j0 e) {
            this.H = e;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void x(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, boolean z) {
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        long j3 = qVar.e;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        this.z.getClass();
        this.C.c(nVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
