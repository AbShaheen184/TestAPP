package androidx.compose.ui.layout;

import androidx.compose.material3.a2;
import androidx.compose.material3.b2;
import androidx.compose.material3.c2;
import androidx.compose.material3.d2;
import androidx.compose.material3.e2;
import androidx.compose.material3.f2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements q0 {
    public final f2 a;

    public v0(f2 f2Var) {
        this.a = f2Var;
    }

    @Override // androidx.compose.ui.layout.q0
    public final r0 a(s0 s0Var, List list, long j) {
        int i;
        final d1 d1VarF;
        int i2;
        int i3;
        int iMax;
        ArrayList arrayListI = androidx.compose.ui.node.l.i(s0Var);
        this.a.getClass();
        List list2 = (List) arrayListI.get(0);
        List list3 = (List) arrayListI.get(1);
        List list4 = (List) arrayListI.get(2);
        List list5 = (List) arrayListI.get(3);
        List list6 = (List) arrayListI.get(4);
        long jA = androidx.compose.ui.unit.a.a(j, 0, 0, 0, 0, 10);
        float f = a2.c;
        float f2 = a2.d;
        int iI0 = s0Var.i0(f + f2);
        p0 p0Var = (p0) kotlin.collections.p.D(list5);
        int iV = p0Var != null ? p0Var.v(androidx.compose.ui.unit.a.g(j)) : 0;
        p0 p0Var2 = (p0) kotlin.collections.p.D(list6);
        int iJ = androidx.compose.material3.internal.i.j(androidx.compose.ui.unit.a.h(jA), iV + (p0Var2 != null ? p0Var2.v(androidx.compose.ui.unit.a.g(j)) : 0) + iI0);
        p0 p0Var3 = (p0) kotlin.collections.p.D(list4);
        boolean z = (p0Var3 != null ? p0Var3.a0(iJ) : 0) > s0Var.f0(coil3.svg.internal.a.x(30));
        float f3 = 2;
        long jI = androidx.compose.ui.unit.b.i(-iI0, -s0Var.i0(((((kotlin.collections.p.D(list3) != null) && (kotlin.collections.p.D(list4) != null)) || z) ? a2.b : a2.a) * f3), jA);
        p0 p0Var4 = (p0) kotlin.collections.p.D(list5);
        d1 d1VarF2 = p0Var4 != null ? p0Var4.F(jI) : null;
        int i4 = d1VarF2 != null ? d1VarF2.e : 0;
        p0 p0Var5 = (p0) kotlin.collections.p.D(list6);
        d1 d1VarF3 = p0Var5 != null ? p0Var5.F(androidx.compose.ui.unit.b.j(-i4, 0, 2, jI)) : null;
        int i5 = i4 + (d1VarF3 != null ? d1VarF3.e : 0);
        p0 p0Var6 = (p0) kotlin.collections.p.D(list2);
        if (p0Var6 != null) {
            i = 0;
            d1VarF = p0Var6.F(androidx.compose.ui.unit.b.j(-i5, 0, 2, jI));
        } else {
            i = 0;
            d1VarF = null;
        }
        int i6 = d1VarF != null ? d1VarF.y : i;
        p0 p0Var7 = (p0) kotlin.collections.p.D(list4);
        d1 d1VarF4 = p0Var7 != null ? p0Var7.F(androidx.compose.ui.unit.b.i(-i5, -i6, jI)) : null;
        int i7 = i6 + (d1VarF4 != null ? d1VarF4.y : 0);
        boolean z2 = (d1VarF4 == null || d1VarF4.b0(d.a) == d1VarF4.b0(d.b)) ? false : true;
        p0 p0Var8 = (p0) kotlin.collections.p.D(list3);
        final d1 d1VarF5 = p0Var8 != null ? p0Var8.F(androidx.compose.ui.unit.b.i(-i5, -i7, jI)) : null;
        boolean z3 = d1VarF5 != null;
        boolean z4 = d1VarF4 != null;
        if ((z3 && z4) || z2) {
            i2 = 3;
            i3 = 3;
        } else if (z3 || z4) {
            i2 = 3;
            i3 = 2;
        } else {
            i2 = 3;
            i3 = 1;
        }
        float f4 = i3 == i2 ? a2.b : a2.a;
        float f5 = f3 * f4;
        int i8 = d1VarF2 != null ? d1VarF2.e : 0;
        int i9 = d1VarF3 != null ? d1VarF3.e : 0;
        int i10 = d1VarF != null ? d1VarF.e : 0;
        float f6 = f4;
        int i11 = d1VarF5 != null ? d1VarF5.e : 0;
        int i12 = i8;
        int i13 = d1VarF4 != null ? d1VarF4.e : 0;
        if (androidx.compose.ui.unit.a.d(j)) {
            iMax = androidx.compose.ui.unit.a.h(j);
        } else {
            iMax = iI0 + i12 + Math.max(i10, Math.max(i11, i13)) + i9;
        }
        final int i14 = iMax;
        final d1 d1Var = d1VarF4;
        final int iD = a2.d(s0Var, d1VarF2 != null ? d1VarF2.y : 0, d1VarF3 != null ? d1VarF3.y : 0, d1VarF != null ? d1VarF.y : 0, d1VarF5 != null ? d1VarF5.y : 0, d1VarF4 != null ? d1VarF4.y : 0, i3, s0Var.i0(f5), j);
        final boolean z5 = i3 == 3;
        final int iI1 = s0Var.i0(f);
        final int iI2 = s0Var.i0(f2);
        final int iI3 = s0Var.i0(f6);
        final d1 d1Var2 = d1VarF3;
        final d1 d1Var3 = d1VarF2;
        return s0Var.q(i14, iD, kotlin.collections.x.e, new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.w1
            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                int iA;
                int iA2;
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
                androidx.compose.ui.layout.d1 d1Var4 = d1Var3;
                int i15 = iI1;
                boolean z6 = z5;
                int iA3 = iI3;
                int i16 = iD;
                if (d1Var4 != null) {
                    if (z6) {
                        iA2 = iA3;
                    } else {
                        iA2 = androidx.privacysandbox.ads.adservices.java.internal.a.a(1, 0.0f, (i16 - d1Var4.y) / 2.0f);
                    }
                    androidx.compose.ui.layout.c1.l(c1Var, d1Var4, i15, iA2);
                }
                int i17 = i15 + (d1Var4 != null ? d1Var4.e : 0);
                androidx.compose.ui.layout.d1 d1Var5 = d1VarF;
                androidx.compose.ui.layout.d1 d1Var6 = d1VarF5;
                androidx.compose.ui.layout.d1 d1Var7 = d1Var;
                if (z6) {
                    iA = iA3;
                } else {
                    iA = androidx.privacysandbox.ads.adservices.java.internal.a.a(1, 0.0f, (i16 - (((d1Var5 != null ? d1Var5.y : 0) + (d1Var6 != null ? d1Var6.y : 0)) + (d1Var7 != null ? d1Var7.y : 0))) / 2.0f);
                }
                if (d1Var6 != null) {
                    androidx.compose.ui.layout.c1.l(c1Var, d1Var6, i17, iA);
                }
                int i18 = iA + (d1Var6 != null ? d1Var6.y : 0);
                if (d1Var5 != null) {
                    androidx.compose.ui.layout.c1.l(c1Var, d1Var5, i17, i18);
                }
                int i19 = i18 + (d1Var5 != null ? d1Var5.y : 0);
                if (d1Var7 != null) {
                    androidx.compose.ui.layout.c1.l(c1Var, d1Var7, i17, i19);
                }
                androidx.compose.ui.layout.d1 d1Var8 = d1Var2;
                if (d1Var8 != null) {
                    int i20 = (i14 - iI2) - d1Var8.e;
                    if (!z6) {
                        iA3 = androidx.privacysandbox.ads.adservices.java.internal.a.a(1, 0.0f, (i16 - d1Var8.y) / 2.0f);
                    }
                    androidx.compose.ui.layout.c1.l(c1Var, d1Var8, i20, iA3);
                }
                return kotlin.y.a;
            }
        });
    }

    @Override // androidx.compose.ui.layout.q0
    public final int b(s sVar, List list, int i) {
        ArrayList arrayListI = androidx.compose.ui.node.l.i(sVar);
        this.a.getClass();
        return f2.b(sVar, arrayListI, i, c2.e);
    }

    @Override // androidx.compose.ui.layout.q0
    public final int e(s sVar, List list, int i) {
        ArrayList arrayListI = androidx.compose.ui.node.l.i(sVar);
        this.a.getClass();
        return f2.a(sVar, arrayListI, i, d2.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && kotlin.jvm.internal.l.a(this.a, ((v0) obj).a);
    }

    @Override // androidx.compose.ui.layout.q0
    public final int g(s sVar, List list, int i) {
        ArrayList arrayListI = androidx.compose.ui.node.l.i(sVar);
        this.a.getClass();
        return f2.b(sVar, arrayListI, i, e2.e);
    }

    @Override // androidx.compose.ui.layout.q0
    public final int h(s sVar, List list, int i) {
        ArrayList arrayListI = androidx.compose.ui.node.l.i(sVar);
        this.a.getClass();
        return f2.a(sVar, arrayListI, i, b2.e);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
