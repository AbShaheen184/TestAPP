package androidx.compose.foundation.layout;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements androidx.compose.ui.layout.q0 {
    public final androidx.compose.ui.j a;
    public final boolean b;

    public s(androidx.compose.ui.j jVar, boolean z) {
        this.a = jVar;
        this.b = z;
    }

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(final androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        kotlin.collections.x xVar = kotlin.collections.x.e;
        if (zIsEmpty) {
            return s0Var.q(androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.i(j), xVar, new androidx.compose.animation.core.n1(23));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(0);
            p0Var.L();
            final androidx.compose.ui.layout.d1 d1VarF = p0Var.F(j2);
            final int iMax = Math.max(androidx.compose.ui.unit.a.j(j), d1VarF.e);
            final int iMax2 = Math.max(androidx.compose.ui.unit.a.i(j), d1VarF.y);
            return s0Var.q(iMax, iMax2, xVar, new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.layout.q
                @Override // kotlin.jvm.functions.l
                public final Object invoke(Object obj) {
                    p.b((androidx.compose.ui.layout.c1) obj, d1VarF, p0Var, s0Var.getLayoutDirection(), iMax, iMax2, this.a);
                    return kotlin.y.a;
                }
            });
        }
        androidx.compose.ui.layout.d1[] d1VarArr = new androidx.compose.ui.layout.d1[list.size()];
        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
        xVar2.e = androidx.compose.ui.unit.a.j(j);
        kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
        xVar3.e = androidx.compose.ui.unit.a.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) list.get(i);
            p0Var2.L();
            androidx.compose.ui.layout.d1 d1VarF2 = p0Var2.F(j2);
            d1VarArr[i] = d1VarF2;
            xVar2.e = Math.max(xVar2.e, d1VarF2.e);
            xVar3.e = Math.max(xVar3.e, d1VarF2.y);
        }
        return s0Var.q(xVar2.e, xVar3.e, xVar, new r(d1VarArr, list, s0Var, xVar2, xVar3, this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a.equals(sVar.a) && this.b == sVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
