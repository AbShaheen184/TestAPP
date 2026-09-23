package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.o1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.compose.foundation.lazy.layout.q {
    public final x a;

    public d(x xVar) {
        this.a = xVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.q
    public final int a() {
        return this.a.h().p;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.lazy.layout.q
    public final int b() {
        return ((o) kotlin.collections.p.J(this.a.h().m)).a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.lazy.layout.q
    public final int c() {
        int i;
        x xVar = this.a;
        int i2 = 0;
        if (xVar.h().m.isEmpty()) {
            return 0;
        }
        n nVarH = xVar.h();
        o1 o1Var = nVarH.q;
        o1 o1Var2 = o1.e;
        int iG = (int) (o1Var == o1Var2 ? nVarH.g() & 4294967295L : nVarH.g() >> 32);
        n nVarH2 = xVar.h();
        o1 o1Var3 = nVarH2.q;
        ?? r9 = nVarH2.m;
        boolean z = o1Var3 == o1Var2;
        if (!r9.isEmpty()) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < r9.size()) {
                o oVar = (o) r9.get(i3);
                int i6 = z ? oVar.p : oVar.q;
                if (i6 == -1) {
                    i3++;
                } else {
                    int iMax = i2;
                    while (i3 < r9.size()) {
                        o oVar2 = (o) r9.get(i3);
                        if ((z ? oVar2.p : oVar2.q) != i6) {
                            break;
                        }
                        iMax = Math.max(iMax, (int) (z ? ((o) r9.get(i3)).n & 4294967295L : ((o) r9.get(i3)).n >> 32));
                        i3++;
                        z = z;
                    }
                    i4 += iMax;
                    i5++;
                    z = z;
                    i2 = 0;
                }
            }
            i2 = (i4 / i5) + nVarH2.s;
        }
        if (i2 != 0 && (i = iG / i2) >= 1) {
            return i;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // androidx.compose.foundation.lazy.layout.q
    public final boolean d() {
        return !this.a.h().m.isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.q
    public final int e() {
        return this.a.g();
    }
}
