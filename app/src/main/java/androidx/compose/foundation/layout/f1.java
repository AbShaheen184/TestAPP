package androidx.compose.foundation.layout;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements androidx.compose.ui.layout.q0, b1 {
    public final e a;
    public final androidx.compose.ui.i b;

    public f1(e eVar, androidx.compose.ui.i iVar) {
        this.a = eVar;
        this.b = iVar;
    }

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        return b.o(this, androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.i(j), androidx.compose.ui.unit.a.h(j), androidx.compose.ui.unit.a.g(j), s0Var.i0(this.a.a()), s0Var, list, new androidx.compose.ui.layout.d1[list.size()], list.size());
    }

    @Override // androidx.compose.ui.layout.q0
    public final int b(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iI0 = sVar.i0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(i3);
            float fL = b.l(b.k(p0Var));
            int iB = p0Var.B(i);
            if (fL == 0.0f) {
                i2 += iB;
            } else if (fL > 0.0f) {
                f += fL;
                iMax = Math.max(iMax, Math.round(iB / fL));
            }
        }
        return ((list.size() - 1) * iI0) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.foundation.layout.b1
    public final void c(int i, androidx.compose.ui.layout.s0 s0Var, int[] iArr, int[] iArr2) {
        this.a.c(s0Var, i, iArr, s0Var.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.foundation.layout.b1
    public final long d(int i, int i2, int i3, boolean z) {
        return !z ? androidx.compose.ui.unit.b.a(i, i2, 0, i3) : _COROUTINE.a.J(i, i2, 0, i3);
    }

    @Override // androidx.compose.ui.layout.q0
    public final int e(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iI0 = sVar.i0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iI0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(i2);
            float fL = b.l(b.k(p0Var));
            if (fL == 0.0f) {
                int iMin2 = Math.min(p0Var.B(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.a0(iMin2));
            } else if (fL > 0.0f) {
                f += fL;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) list.get(i3);
            float fL2 = b.l(b.k(p0Var2));
            if (fL2 > 0.0f) {
                iMax = Math.max(iMax, p0Var2.a0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fL2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return kotlin.jvm.internal.l.a(this.a, f1Var.a) && kotlin.jvm.internal.l.a(this.b, f1Var.b);
    }

    @Override // androidx.compose.foundation.layout.b1
    public final int f(androidx.compose.ui.layout.d1 d1Var) {
        return d1Var.e;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int g(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iI0 = sVar.i0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(i3);
            float fL = b.l(b.k(p0Var));
            int iV = p0Var.v(i);
            if (fL == 0.0f) {
                i2 += iV;
            } else if (fL > 0.0f) {
                f += fL;
                iMax = Math.max(iMax, Math.round(iV / fL));
            }
        }
        return ((list.size() - 1) * iI0) + Math.round(iMax * f) + i2;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int h(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iI0 = sVar.i0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iI0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(i2);
            float fL = b.l(b.k(p0Var));
            if (fL == 0.0f) {
                int iMin2 = Math.min(p0Var.B(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.b(iMin2));
            } else if (fL > 0.0f) {
                f += fL;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) list.get(i3);
            float fL2 = b.l(b.k(p0Var2));
            if (fL2 > 0.0f) {
                iMax = Math.max(iMax, p0Var2.b(iRound != Integer.MAX_VALUE ? Math.round(iRound * fL2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.b1
    public final int i(androidx.compose.ui.layout.d1 d1Var) {
        return d1Var.y;
    }

    @Override // androidx.compose.foundation.layout.b1
    public final androidx.compose.ui.layout.r0 j(androidx.compose.ui.layout.d1[] d1VarArr, androidx.compose.ui.layout.s0 s0Var, int[] iArr, int i, int i2) {
        return s0Var.q(i, i2, kotlin.collections.x.e, new e1(d1VarArr, this, i2, iArr));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
