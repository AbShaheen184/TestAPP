package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.util.i0;
import androidx.media3.common.w0;
import androidx.media3.exoplayer.hls.playlist.w;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import com.google.common.collect.k0;
import com.google.common.collect.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final d a;
    public final androidx.media3.datasource.h b;
    public final androidx.media3.datasource.h c;
    public final androidx.media3.exoplayer.dash.manifest.t d;
    public final w[] e;
    public final androidx.media3.common.r[] f;
    public final androidx.media3.exoplayer.hls.playlist.d g;
    public final w0 h;
    public final List i;
    public final androidx.media3.exoplayer.analytics.k k;
    public boolean l;
    public androidx.media3.exoplayer.source.b n;
    public Uri o;
    public Uri p;
    public boolean q;
    public androidx.media3.exoplayer.trackselection.q r;
    public final androidx.media3.exoplayer.dash.manifest.t j = new androidx.media3.exoplayer.dash.manifest.t(2);
    public byte[] m = i0.b;
    public long s = -9223372036854775807L;

    public j(d dVar, androidx.media3.exoplayer.hls.playlist.d dVar2, w[] wVarArr, androidx.media3.common.r[] rVarArr, c cVar, androidx.media3.exoplayer.upstream.f fVar, androidx.media3.exoplayer.dash.manifest.t tVar, List list, androidx.media3.exoplayer.analytics.k kVar) {
        this.a = dVar;
        this.g = dVar2;
        this.e = wVarArr;
        this.f = rVarArr;
        this.d = tVar;
        this.i = list;
        this.k = kVar;
        androidx.media3.datasource.h hVarB = ((androidx.media3.datasource.g) cVar.y).b();
        this.b = hVarB;
        if (fVar != null) {
            hVarB.c(fVar);
        }
        this.c = ((androidx.media3.datasource.g) cVar.y).b();
        this.h = new w0("", rVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < wVarArr.length; i++) {
            if ((rVarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        w0 w0Var = this.h;
        int[] iArrA = com.imsdk.a.A(arrayList);
        h hVar = new h(w0Var, iArrA);
        hVar.g = hVar.b(w0Var.d[iArrA[0]]);
        this.r = hVar;
    }

    public static i f(androidx.media3.exoplayer.hls.playlist.m mVar, long j, int i) {
        long j2 = mVar.k;
        h0 h0Var = mVar.s;
        int i2 = (int) (j - j2);
        h0 h0Var2 = mVar.r;
        if (i2 == h0Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < h0Var.size()) {
                return new i((androidx.media3.exoplayer.hls.playlist.k) h0Var.get(i), j, i);
            }
            return null;
        }
        androidx.media3.exoplayer.hls.playlist.j jVar = (androidx.media3.exoplayer.hls.playlist.j) h0Var2.get(i2);
        if (i == -1) {
            return new i(jVar, j, -1);
        }
        if (i < jVar.J.size()) {
            return new i((androidx.media3.exoplayer.hls.playlist.k) jVar.J.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < h0Var2.size()) {
            return new i((androidx.media3.exoplayer.hls.playlist.k) h0Var2.get(i3), j + 1, -1);
        }
        if (h0Var.isEmpty()) {
            return null;
        }
        return new i((androidx.media3.exoplayer.hls.playlist.k) h0Var.get(0), j + 1, 0);
    }

    public final androidx.media3.exoplayer.upstream.g a(Uri uri) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        androidx.media3.exoplayer.hls.playlist.d dVar = this.g;
        androidx.media3.exoplayer.hls.playlist.c cVar = (androidx.media3.exoplayer.hls.playlist.c) dVar.A.get(uri);
        w wVar = cVar != null ? cVar.a : null;
        wVar.getClass();
        HashMap map = wVar.b;
        int size = map.size();
        p1 it = k0.l(map.values()).iterator();
        int i = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            androidx.media3.exoplayer.hls.playlist.c cVar2 = (androidx.media3.exoplayer.hls.playlist.c) dVar.A.get(uri2);
            if (cVar2 != null) {
                androidx.media3.exoplayer.hls.playlist.b bVar = (androidx.media3.exoplayer.hls.playlist.b) androidx.compose.runtime.j.c(cVar2.b, uri2, uri2);
                bVar.getClass();
                if (jElapsedRealtime <= bVar.F) {
                    i++;
                }
            }
        }
        return new androidx.media3.exoplayer.upstream.g(size, i, this.r.length(), d(jElapsedRealtime));
    }

    public final androidx.media3.exoplayer.source.chunk.l[] b(k kVar, long j) {
        List listUnmodifiableList;
        j jVar = this;
        k kVar2 = kVar;
        int iA = kVar2 == null ? -1 : jVar.h.a(kVar2.A);
        int length = jVar.r.length();
        androidx.media3.exoplayer.source.chunk.l[] lVarArr = new androidx.media3.exoplayer.source.chunk.l[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int i2 = jVar.r.i(i);
            Uri uriC = jVar.e[i2].c();
            androidx.media3.exoplayer.hls.playlist.d dVar = jVar.g;
            if (dVar.g(uriC)) {
                androidx.media3.exoplayer.hls.playlist.m mVarB = dVar.b(z, uriC);
                mVarB.getClass();
                long j2 = mVarB.h - dVar.P;
                Pair pairE = jVar.e(kVar2, i2 != iA ? true : z, mVarB, j2, j);
                long jLongValue = ((Long) pairE.first).longValue();
                int iIntValue = ((Integer) pairE.second).intValue();
                long j3 = mVarB.k;
                h0 h0Var = mVarB.s;
                h0 h0Var2 = mVarB.r;
                int i3 = (int) (jLongValue - j3);
                if (i3 < 0 || h0Var2.size() < i3) {
                    e0 e0Var = h0.y;
                    listUnmodifiableList = a1.B;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i3 < h0Var2.size()) {
                        if (iIntValue != -1) {
                            androidx.media3.exoplayer.hls.playlist.j jVar2 = (androidx.media3.exoplayer.hls.playlist.j) h0Var2.get(i3);
                            if (iIntValue == 0) {
                                arrayList.add(jVar2);
                            } else if (iIntValue < jVar2.J.size()) {
                                h0 h0Var3 = jVar2.J;
                                arrayList.addAll(h0Var3.subList(iIntValue, h0Var3.size()));
                            }
                            i3++;
                        }
                        arrayList.addAll(h0Var2.subList(i3, h0Var2.size()));
                        iIntValue = 0;
                    }
                    if (mVarB.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < h0Var.size()) {
                            arrayList.addAll(h0Var.subList(iIntValue, h0Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                lVarArr[i] = new g(j2, listUnmodifiableList);
            } else {
                lVarArr[i] = androidx.media3.exoplayer.source.chunk.l.c;
            }
            i++;
            jVar = this;
            kVar2 = kVar;
            z = false;
        }
        return lVarArr;
    }

    public final int c(k kVar) {
        int i = kVar.L;
        if (i == -1) {
            return 1;
        }
        androidx.media3.exoplayer.hls.playlist.m mVarB = this.g.b(false, kVar.J);
        mVarB.getClass();
        h0 h0Var = mVarB.r;
        int i2 = (int) (kVar.G - mVarB.k);
        if (i2 < 0) {
            return 1;
        }
        h0 h0Var2 = i2 < h0Var.size() ? ((androidx.media3.exoplayer.hls.playlist.j) h0Var.get(i2)).J : mVarB.s;
        if (i >= h0Var2.size()) {
            return 2;
        }
        androidx.media3.exoplayer.hls.playlist.h hVar = (androidx.media3.exoplayer.hls.playlist.h) h0Var2.get(i);
        if (hVar.J) {
            return 0;
        }
        return Objects.equals(Uri.parse(androidx.media3.common.util.b.q(mVarB.a, hVar.e)), kVar.y.a) ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final int d(long j) {
        androidx.media3.exoplayer.trackselection.q qVar = this.r;
        int length = qVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = qVar.i(i2);
            if (qVar.a(i2, j)) {
                i++;
            } else {
                if (this.g.e(this.e[i3], j)) {
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    public final Pair e(k kVar, boolean z, androidx.media3.exoplayer.hls.playlist.m mVar, long j, long j2) {
        h0 h0Var;
        int i = -1;
        boolean z2 = true;
        if (kVar != null) {
            long jA = kVar.G;
            int i2 = kVar.L;
            if (!z) {
                if (!kVar.e0) {
                    return new Pair(Long.valueOf(jA), Integer.valueOf(i2));
                }
                if (i2 == -1) {
                    jA = kVar.a();
                }
                return new Pair(Long.valueOf(jA), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
            }
        }
        long j3 = mVar.u;
        long j4 = mVar.k;
        h0 h0Var2 = mVar.s;
        h0 h0Var3 = mVar.r;
        long j5 = j + j3;
        long j6 = (kVar == null || this.q) ? j2 : kVar.D;
        if (!mVar.o && j6 >= j5) {
            return new Pair(Long.valueOf(j4 + ((long) h0Var3.size())), -1);
        }
        long j7 = j6 - j;
        Long lValueOf = Long.valueOf(j7);
        androidx.media3.exoplayer.hls.playlist.d dVar = this.g;
        if (dVar.O && kVar != null) {
            z2 = false;
        }
        int iD = i0.d(h0Var3, lValueOf, z2);
        long j8 = ((long) iD) + j4;
        if (!dVar.O) {
            return new Pair(Long.valueOf(j8), -1);
        }
        if (iD >= 0) {
            if (h0Var3.isEmpty()) {
                h0Var = h0Var2;
            } else {
                androidx.media3.exoplayer.hls.playlist.j jVar = (androidx.media3.exoplayer.hls.playlist.j) h0Var3.get(iD);
                if (j7 < jVar.B + jVar.z) {
                    h0Var = jVar.J;
                } else {
                    h0Var = h0Var2;
                }
            }
            for (int i3 = 0; i3 < h0Var.size(); i3++) {
                androidx.media3.exoplayer.hls.playlist.h hVar = (androidx.media3.exoplayer.hls.playlist.h) h0Var.get(i3);
                if (j7 < hVar.B + hVar.z) {
                    if (!hVar.I) {
                        break;
                    }
                    j8 += (h0Var != h0Var2 || h0Var3.isEmpty()) ? 0L : 1L;
                    i = i3;
                    break;
                }
            }
        }
        return new Pair(Long.valueOf(j8), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f g(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        androidx.media3.exoplayer.dash.manifest.t tVar = this.j;
        byte[] bArr = (byte[]) ((e) tVar.e).remove(uri);
        if (bArr != null) {
            return null;
        }
        androidx.media3.datasource.l lVar = new androidx.media3.datasource.l(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        androidx.media3.common.r rVar = this.f[i];
        int iO = this.r.o();
        Object objR = this.r.r();
        byte[] bArr2 = this.m;
        f fVar = new f(this.c, lVar, 3, rVar, iO, objR, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = i0.b;
        }
        fVar.G = bArr2;
        return fVar;
    }
}
