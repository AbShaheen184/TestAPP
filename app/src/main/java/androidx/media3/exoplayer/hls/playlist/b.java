package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.SystemClock;
import androidx.compose.animation.core.t2;
import androidx.media3.common.j0;
import androidx.media3.common.util.i0;
import androidx.media3.datasource.y;
import com.google.common.collect.h0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements androidx.media3.exoplayer.upstream.i {
    public final androidx.media3.datasource.h A;
    public m B;
    public long C;
    public long D;
    public long E;
    public long F;
    public boolean G;
    public IOException H;
    public boolean I;
    public final /* synthetic */ d J;
    public final Uri e;
    public final String y;
    public final androidx.media3.exoplayer.upstream.n z = new androidx.media3.exoplayer.upstream.n("DefaultHlsPlaylistTracker:MediaPlaylist");

    public b(d dVar, Uri uri, String str) {
        this.J = dVar;
        this.e = uri;
        this.y = str;
        this.A = ((androidx.media3.datasource.g) dVar.e.y).b();
    }

    public final Uri a() {
        m mVar = this.B;
        Uri uri = this.e;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.a != -9223372036854775807L || lVar.e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                m mVar2 = this.B;
                if (mVar2.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.k + ((long) mVar2.r.size())));
                    m mVar3 = this.B;
                    if (mVar3.n != -9223372036854775807L) {
                        h0 h0Var = mVar3.s;
                        int size = h0Var.size();
                        if (!h0Var.isEmpty() && ((h) com.google.common.collect.q.k(h0Var)).J) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.B.v;
                if (lVar2.a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", lVar2.b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void b(Uri uri) {
        d dVar = this.J;
        androidx.media3.exoplayer.upstream.p pVarF = dVar.y.f(dVar.G, this.B);
        Map map = Collections.EMPTY_MAP;
        _COROUTINE.a.v(uri, "The uri must be set.");
        androidx.media3.exoplayer.upstream.q qVar = new androidx.media3.exoplayer.upstream.q(this.A, new androidx.media3.datasource.l(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, pVarF);
        this.z.f(qVar, this, dVar.z.f(qVar.z));
    }

    public final void c(Uri uri) {
        this.F = 0L;
        if (this.G) {
            return;
        }
        androidx.media3.exoplayer.upstream.n nVar = this.z;
        if (nVar.d() || nVar.c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.E;
        if (jElapsedRealtime >= j) {
            b(uri);
        } else {
            this.G = true;
            this.J.E.postDelayed(new androidx.activity.c(20, this, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:101:0x0262 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0264  */
    /* JADX WARN: Code duplicated, block: B:104:0x026f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0287  */
    /* JADX WARN: Code duplicated, block: B:110:0x028f  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:44:0x0104  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    /* JADX WARN: Code duplicated, block: B:57:0x012d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:60:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0135  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ec A[LOOP:0: B:78:0x01e6->B:80:0x01ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x020b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0213  */
    /* JADX WARN: Code duplicated, block: B:88:0x0226  */
    /* JADX WARN: Code duplicated, block: B:90:0x022d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0231  */
    /* JADX WARN: Code duplicated, block: B:95:0x0245 A[LOOP:1: B:93:0x023f->B:95:0x0245, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x025b A[DONT_INVERT] */
    public final void d(m mVar, androidx.media3.exoplayer.source.n nVar) {
        boolean z;
        h0 h0Var;
        long j;
        long j2;
        boolean z2;
        m mVar2;
        long j3;
        long j4;
        h0 h0Var2;
        long j5;
        int size;
        int i;
        j jVar;
        long j6;
        m mVar3;
        int i2;
        int i3;
        h0 h0Var3;
        j jVar2;
        int i4;
        m mVar4;
        androidx.datastore.preferences.protobuf.i iVar;
        Uri uri;
        long size2;
        m mVar5;
        androidx.datastore.preferences.protobuf.i iVar2;
        boolean z3;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar;
        Iterator it;
        m mVar6;
        l lVar2;
        long j7;
        long j8;
        Iterator it2;
        int size3;
        int size4;
        int size5;
        m mVar7 = this.B;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.C = jElapsedRealtime;
        d dVar = this.J;
        CopyOnWriteArrayList copyOnWriteArrayList = dVar.B;
        if (mVar7 != null) {
            long j9 = mVar.k;
            long j10 = mVar7.k;
            z = j9 > j10 || (j9 >= j10 && ((size3 = mVar.r.size() - mVar7.r.size()) == 0 ? (size4 = mVar.s.size()) > (size5 = mVar7.s.size()) || (size4 == size5 && mVar.o && !mVar7.o) : size3 > 0));
            h0Var = mVar.r;
            j = mVar.k;
            j2 = 0;
            if (z) {
                copyOnWriteArrayList = copyOnWriteArrayList;
                z2 = true;
                if (mVar.p) {
                    j3 = mVar.h;
                } else {
                    mVar2 = dVar.N;
                    if (mVar2 != null) {
                        j3 = mVar2.h;
                    } else {
                        j3 = 0;
                    }
                    if (mVar7 == null) {
                        long j11 = mVar7.h;
                        j4 = mVar7.k;
                        h0Var2 = mVar7.r;
                        j5 = j3;
                        size = h0Var2.size();
                        i = (int) (j - j4);
                        if (i < h0Var2.size()) {
                            jVar = (j) h0Var2.get(i);
                        } else {
                            jVar = null;
                        }
                        if (jVar != null) {
                            j6 = jVar.B;
                        } else if (size == j - j4) {
                            j6 = mVar7.u;
                        }
                        j3 = j11 + j6;
                    }
                    if (mVar.i) {
                        i4 = mVar.j;
                    } else {
                        mVar3 = dVar.N;
                        if (mVar3 != null) {
                            i2 = mVar3.j;
                        } else {
                            i2 = 0;
                        }
                        if (mVar7 == null) {
                            i3 = (int) (j - mVar7.k);
                            h0Var3 = mVar7.r;
                            if (i3 < h0Var3.size()) {
                                jVar2 = (j) h0Var3.get(i3);
                            } else {
                                jVar2 = null;
                            }
                            if (jVar2 != null) {
                                i2 = (mVar7.j + jVar2.A) - ((j) h0Var.get(0)).A;
                            }
                        }
                        i4 = i2;
                    }
                    iVar = null;
                    j = j;
                    mVar4 = new m(mVar.d, mVar.a, mVar.b, mVar.e, mVar.g, j5, true, i4, mVar.k, mVar.l, mVar.m, mVar.n, mVar.c, mVar.o, mVar.p, mVar.q, h0Var, mVar.s, mVar.v, mVar.t, mVar.w, mVar.x);
                }
                j5 = j3;
                if (mVar.i) {
                    i4 = mVar.j;
                } else {
                    mVar3 = dVar.N;
                    if (mVar3 != null) {
                        i2 = mVar3.j;
                    } else {
                        i2 = 0;
                    }
                    if (mVar7 == null) {
                        i3 = (int) (j - mVar7.k);
                        h0Var3 = mVar7.r;
                        if (i3 < h0Var3.size()) {
                            jVar2 = (j) h0Var3.get(i3);
                        } else {
                            jVar2 = null;
                        }
                        if (jVar2 != null) {
                            i2 = (mVar7.j + jVar2.A) - ((j) h0Var.get(0)).A;
                        }
                    }
                    i4 = i2;
                }
                iVar = null;
                j = j;
                mVar4 = new m(mVar.d, mVar.a, mVar.b, mVar.e, mVar.g, j5, true, i4, mVar.k, mVar.l, mVar.m, mVar.n, mVar.c, mVar.o, mVar.p, mVar.q, h0Var, mVar.s, mVar.v, mVar.t, mVar.w, mVar.x);
            } else {
                if (mVar.o) {
                    z2 = true;
                    mVar4 = mVar7;
                } else if (mVar7.o) {
                    mVar4 = mVar7;
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    j = j;
                    iVar = null;
                    z2 = true;
                } else {
                    z2 = true;
                    mVar4 = new m(mVar7.d, mVar7.a, mVar7.b, mVar7.e, mVar7.g, mVar7.h, mVar7.i, mVar7.j, mVar7.k, mVar7.l, mVar7.m, mVar7.n, mVar7.c, true, mVar7.p, mVar7.q, mVar7.r, mVar7.s, mVar7.v, mVar7.t, mVar7.w, mVar7.x);
                }
                iVar = null;
            }
            this.B = mVar4;
            uri = this.e;
            if (mVar4 != mVar7) {
                this.H = iVar;
                this.D = jElapsedRealtime;
                if (uri.equals(dVar.M)) {
                    if (dVar.N == null) {
                        dVar.O = !mVar4.o;
                        dVar.P = mVar4.h;
                    }
                    dVar.N = mVar4;
                    dVar.F.u(mVar4);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((u) it2.next()).a();
                }
            } else if (!mVar4.o) {
                size2 = j + ((long) mVar.r.size());
                mVar5 = this.B;
                if (size2 < mVar5.k) {
                    iVar2 = new androidx.datastore.preferences.protobuf.i();
                    z3 = z2;
                } else {
                    if (jElapsedRealtime - this.D > i0.d0(mVar5.m) * 3.5d) {
                        iVar2 = new androidx.datastore.preferences.protobuf.i();
                    } else {
                        iVar2 = iVar;
                    }
                    z3 = false;
                }
                if (iVar2 != null) {
                    this.H = iVar2;
                    lVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(iVar2, z2 ? 1 : 0, 3);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((u) it.next()).b(uri, lVar, z3);
                    }
                }
            }
            mVar6 = this.B;
            lVar2 = mVar6.v;
            j7 = mVar6.m;
            if (!lVar2.e) {
                if (mVar6 == mVar7) {
                    j8 = mVar6.n;
                    if (j8 != -9223372036854775807L) {
                        j2 = j8 / 2;
                    } else {
                        j7 /= 2;
                    }
                }
                this.E = (i0.d0(j2) + jElapsedRealtime) - nVar.a;
                if (this.B.o) {
                }
                if (!uri.equals(dVar.M) || this.I) {
                    c(a());
                }
                return;
            }
            if (mVar6 == mVar7) {
                j7 /= 2;
            }
            j2 = j7;
            this.E = (i0.d0(j2) + jElapsedRealtime) - nVar.a;
            if (this.B.o) {
                if (uri.equals(dVar.M)) {
                }
                c(a());
            }
        }
        mVar.getClass();
        h0Var = mVar.r;
        j = mVar.k;
        j2 = 0;
        if (z) {
            if (mVar.o) {
                z2 = true;
                mVar4 = mVar7;
            } else if (mVar7.o) {
                mVar4 = mVar7;
                copyOnWriteArrayList = copyOnWriteArrayList;
                j = j;
                iVar = null;
                z2 = true;
            } else {
                z2 = true;
                mVar4 = new m(mVar7.d, mVar7.a, mVar7.b, mVar7.e, mVar7.g, mVar7.h, mVar7.i, mVar7.j, mVar7.k, mVar7.l, mVar7.m, mVar7.n, mVar7.c, true, mVar7.p, mVar7.q, mVar7.r, mVar7.s, mVar7.v, mVar7.t, mVar7.w, mVar7.x);
            }
            iVar = null;
        } else {
            copyOnWriteArrayList = copyOnWriteArrayList;
            z2 = true;
            if (mVar.p) {
                j3 = mVar.h;
            } else {
                mVar2 = dVar.N;
                if (mVar2 != null) {
                    j3 = mVar2.h;
                } else {
                    j3 = 0;
                }
                if (mVar7 == null) {
                    long j12 = mVar7.h;
                    j4 = mVar7.k;
                    h0Var2 = mVar7.r;
                    j5 = j3;
                    size = h0Var2.size();
                    i = (int) (j - j4);
                    if (i < h0Var2.size()) {
                        jVar = (j) h0Var2.get(i);
                    } else {
                        jVar = null;
                    }
                    if (jVar != null) {
                        j6 = jVar.B;
                    } else if (size == j - j4) {
                        j6 = mVar7.u;
                    }
                    j3 = j12 + j6;
                }
                if (mVar.i) {
                    i4 = mVar.j;
                } else {
                    mVar3 = dVar.N;
                    if (mVar3 != null) {
                        i2 = mVar3.j;
                    } else {
                        i2 = 0;
                    }
                    if (mVar7 == null) {
                        i3 = (int) (j - mVar7.k);
                        h0Var3 = mVar7.r;
                        if (i3 < h0Var3.size()) {
                            jVar2 = (j) h0Var3.get(i3);
                        } else {
                            jVar2 = null;
                        }
                        if (jVar2 != null) {
                            i2 = (mVar7.j + jVar2.A) - ((j) h0Var.get(0)).A;
                        }
                    }
                    i4 = i2;
                }
                iVar = null;
                j = j;
                mVar4 = new m(mVar.d, mVar.a, mVar.b, mVar.e, mVar.g, j5, true, i4, mVar.k, mVar.l, mVar.m, mVar.n, mVar.c, mVar.o, mVar.p, mVar.q, h0Var, mVar.s, mVar.v, mVar.t, mVar.w, mVar.x);
            }
            j5 = j3;
            if (mVar.i) {
                i4 = mVar.j;
            } else {
                mVar3 = dVar.N;
                if (mVar3 != null) {
                    i2 = mVar3.j;
                } else {
                    i2 = 0;
                }
                if (mVar7 == null) {
                    i3 = (int) (j - mVar7.k);
                    h0Var3 = mVar7.r;
                    if (i3 < h0Var3.size()) {
                        jVar2 = (j) h0Var3.get(i3);
                    } else {
                        jVar2 = null;
                    }
                    if (jVar2 != null) {
                        i2 = (mVar7.j + jVar2.A) - ((j) h0Var.get(0)).A;
                    }
                }
                i4 = i2;
            }
            iVar = null;
            j = j;
            mVar4 = new m(mVar.d, mVar.a, mVar.b, mVar.e, mVar.g, j5, true, i4, mVar.k, mVar.l, mVar.m, mVar.n, mVar.c, mVar.o, mVar.p, mVar.q, h0Var, mVar.s, mVar.v, mVar.t, mVar.w, mVar.x);
        }
        this.B = mVar4;
        uri = this.e;
        if (mVar4 != mVar7) {
            this.H = iVar;
            this.D = jElapsedRealtime;
            if (uri.equals(dVar.M)) {
                if (dVar.N == null) {
                    dVar.O = !mVar4.o;
                    dVar.P = mVar4.h;
                }
                dVar.N = mVar4;
                dVar.F.u(mVar4);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((u) it2.next()).a();
            }
        } else if (!mVar4.o) {
            size2 = j + ((long) mVar.r.size());
            mVar5 = this.B;
            if (size2 < mVar5.k) {
                iVar2 = new androidx.datastore.preferences.protobuf.i();
                z3 = z2;
            } else {
                if (jElapsedRealtime - this.D > i0.d0(mVar5.m) * 3.5d) {
                    iVar2 = new androidx.datastore.preferences.protobuf.i();
                } else {
                    iVar2 = iVar;
                }
                z3 = false;
            }
            if (iVar2 != null) {
                this.H = iVar2;
                lVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(iVar2, z2 ? 1 : 0, 3);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).b(uri, lVar, z3);
                }
            }
        }
        mVar6 = this.B;
        lVar2 = mVar6.v;
        j7 = mVar6.m;
        if (!lVar2.e) {
            if (mVar6 == mVar7) {
                j8 = mVar6.n;
                if (j8 != -9223372036854775807L) {
                    j2 = j8 / 2;
                } else {
                    j7 /= 2;
                }
            }
            this.E = (i0.d0(j2) + jElapsedRealtime) - nVar.a;
            if (this.B.o) {
                if (uri.equals(dVar.M)) {
                }
                c(a());
            }
        }
        if (mVar6 == mVar7) {
            j7 /= 2;
        }
        j2 = j7;
        this.E = (i0.d0(j2) + jElapsedRealtime) - nVar.a;
        if (this.B.o) {
            if (uri.equals(dVar.M)) {
            }
            c(a());
        }
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final androidx.media3.exoplayer.upstream.h f(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, IOException iOException, int i) {
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        long j3 = qVar.e;
        int i2 = qVar.z;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        Uri uri = yVar.z;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, uri, yVar.A, j, j2, yVar.y);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof r;
        androidx.media3.exoplayer.upstream.h hVar = androidx.media3.exoplayer.upstream.n.e;
        Uri uri2 = this.e;
        d dVar = this.J;
        if (z || z2) {
            int i3 = iOException instanceof androidx.media3.datasource.t ? ((androidx.media3.datasource.t) iOException).z : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.E = SystemClock.elapsedRealtime();
                c(uri2);
                androidx.media3.exoplayer.drm.d dVar2 = dVar.C;
                String str = i0.a;
                dVar2.f(nVar, i2, iOException, true);
                return hVar;
            }
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar2 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(iOException, i, 3);
        Iterator it = dVar.B.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((u) it.next()).b(uri2, lVar2, false);
        }
        t2 t2Var = dVar.z;
        if (z3) {
            long jG = t2Var.g(lVar2);
            hVar = jG != -9223372036854775807L ? new androidx.media3.exoplayer.upstream.h(jG, 0, false) : androidx.media3.exoplayer.upstream.n.f;
        }
        boolean zA = hVar.a();
        dVar.C.f(nVar, i2, iOException, !zA);
        if (!zA) {
            t2Var.getClass();
        }
        return hVar;
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
        this.J.C.g(nVar, qVar.z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void s(androidx.media3.exoplayer.upstream.k kVar, long j, long j2) {
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        q qVar2 = (q) qVar.C;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        if (qVar2 instanceof m) {
            d((m) qVar2, nVar);
            this.J.C.d(nVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            j0 j0VarB = j0.b(null, "Loaded playlist has unexpected type.");
            this.H = j0VarB;
            this.J.C.f(nVar, 4, j0VarB, true);
        }
        this.J.z.getClass();
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void x(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, boolean z) {
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        long j3 = qVar.e;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        d dVar = this.J;
        dVar.z.getClass();
        dVar.C.c(nVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
