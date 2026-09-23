package androidx.media3.exoplayer.source;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements z0 {
    public final com.google.common.collect.a1 e;
    public long y;

    public j(List list, List list2) {
        com.google.common.collect.d0 d0VarK = com.google.common.collect.h0.k();
        _COROUTINE.a.o(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            d0VarK.b(new i((z0) list.get(i), (List) list2.get(i)));
        }
        this.e = d0VarK.g();
        this.y = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        boolean zD;
        boolean z = false;
        do {
            long jG = g();
            if (jG == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zD = false;
            while (true) {
                com.google.common.collect.a1 a1Var = this.e;
                if (i >= a1Var.A) {
                    break;
                }
                long jG2 = ((i) a1Var.get(i)).e.g();
                boolean z2 = jG2 != Long.MIN_VALUE && jG2 <= n0Var.a;
                if (jG2 == jG || z2) {
                    zD |= ((i) a1Var.get(i)).e.d(n0Var);
                }
                i++;
            }
            z |= zD;
        } while (zD);
        return z;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long g() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            com.google.common.collect.a1 a1Var = this.e;
            if (i >= a1Var.A) {
                break;
            }
            long jG = ((i) a1Var.get(i)).e.g();
            if (jG != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jG);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean o() {
        int i = 0;
        while (true) {
            com.google.common.collect.a1 a1Var = this.e;
            if (i >= a1Var.A) {
                return false;
            }
            if (((i) a1Var.get(i)).e.o()) {
                return true;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long v() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            com.google.common.collect.a1 a1Var = this.e;
            if (i >= a1Var.A) {
                break;
            }
            i iVar = (i) a1Var.get(i);
            long jV = iVar.e.v();
            com.google.common.collect.h0 h0Var = iVar.y;
            if ((h0Var.contains(1) || h0Var.contains(2) || h0Var.contains(4)) && jV != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jV);
            }
            if (jV != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jV);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.y = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.y;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final void w(long j) {
        int i = 0;
        while (true) {
            com.google.common.collect.a1 a1Var = this.e;
            if (i >= a1Var.A) {
                return;
            }
            ((i) a1Var.get(i)).w(j);
            i++;
        }
    }
}
