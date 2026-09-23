package androidx.media3.exoplayer.hls.playlist;

import com.google.common.collect.f1;
import com.google.common.collect.h0;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final androidx.media3.common.m q;
    public final h0 r;
    public final h0 s;
    public final f1 t;
    public final long u;
    public final l v;
    public final h0 w;
    public final j x;

    public m(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, androidx.media3.common.m mVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(list, str, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = mVar;
        this.r = h0.o(list2);
        this.s = h0.o(list3);
        this.t = f1.b(map);
        this.w = h0.o(list4);
        this.x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) com.google.common.collect.q.k(list3);
            this.u = hVar.B + hVar.z;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            j jVar2 = (j) com.google.common.collect.q.k(list2);
            this.u = jVar2.B + jVar2.z;
        }
        long jMin = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j6 = this.u;
            jMin = j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j);
        }
        this.e = jMin;
        this.f = j >= 0;
        this.v = lVar;
    }

    @Override // androidx.media3.exoplayer.offline.a
    public final Object a(List list) {
        return this;
    }
}
