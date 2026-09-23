package androidx.compose.foundation.layout;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements androidx.compose.ui.layout.q0, b1 {
    public final g a;
    public final androidx.compose.ui.h b;

    public w(g gVar, androidx.compose.ui.h hVar) {
        this.a = gVar;
        this.b = hVar;
    }

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        return b.o(this, androidx.compose.ui.unit.a.i(j), androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.g(j), androidx.compose.ui.unit.a.h(j), s0Var.i0(this.a.a()), s0Var, list, new androidx.compose.ui.layout.d1[list.size()], list.size());
    }

    @Override // androidx.compose.ui.layout.q0
    public final int b(androidx.compose.ui.layout.s sVar, List list, int i) {
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
                int iMin2 = Math.min(p0Var.b(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.B(iMin2));
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
                iMax = Math.max(iMax, p0Var2.B(iRound != Integer.MAX_VALUE ? Math.round(iRound * fL2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.layout.b1
    public final void c(int i, androidx.compose.ui.layout.s0 s0Var, int[] iArr, int[] iArr2) {
        this.a.b(i, s0Var, iArr, iArr2);
    }

    @Override // androidx.compose.foundation.layout.b1
    public final long d(int i, int i2, int i3, boolean z) {
        return !z ? androidx.compose.ui.unit.b.a(0, i3, i, i2) : _COROUTINE.a.I(0, i3, i, i2);
    }

    @Override // androidx.compose.ui.layout.q0
    public final int e(androidx.compose.ui.layout.s sVar, List list, int i) {
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
            int iA0 = p0Var.a0(i);
            if (fL == 0.0f) {
                i2 += iA0;
            } else if (fL > 0.0f) {
                f += fL;
                iMax = Math.max(iMax, Math.round(iA0 / fL));
            }
        }
        return ((list.size() - 1) * iI0) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.l.a(this.a, wVar.a) && this.b.equals(wVar.b);
    }

    @Override // androidx.compose.foundation.layout.b1
    public final int f(androidx.compose.ui.layout.d1 d1Var) {
        return d1Var.y;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int g(androidx.compose.ui.layout.s sVar, List list, int i) {
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
                int iMin2 = Math.min(p0Var.b(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, p0Var.v(iMin2));
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
                iMax = Math.max(iMax, p0Var2.v(iRound != Integer.MAX_VALUE ? Math.round(iRound * fL2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int h(androidx.compose.ui.layout.s sVar, List list, int i) {
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
            int iB = p0Var.b(i);
            if (fL == 0.0f) {
                i2 += iB;
            } else if (fL > 0.0f) {
                f += fL;
                iMax = Math.max(iMax, Math.round(iB / fL));
            }
        }
        return ((list.size() - 1) * iI0) + Math.round(iMax * f) + i2;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.b1
    public final int i(androidx.compose.ui.layout.d1 d1Var) {
        return d1Var.e;
    }

    @Override // androidx.compose.foundation.layout.b1
    public final androidx.compose.ui.layout.r0 j(androidx.compose.ui.layout.d1[] d1VarArr, androidx.compose.ui.layout.s0 s0Var, int[] iArr, int i, int i2) {
        return s0Var.q(i2, i, kotlin.collections.x.e, new v(d1VarArr, this, i2, s0Var, iArr, 0));
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
