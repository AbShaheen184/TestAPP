package androidx.compose.material3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 implements androidx.compose.ui.layout.q0 {
    public final /* synthetic */ kotlin.jvm.functions.a a;
    public final /* synthetic */ kotlin.jvm.functions.p b;
    public final /* synthetic */ boolean c;

    public w3(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.p pVar, boolean z) {
        this.a = aVar;
        this.b = pVar;
        this.c = z;
    }

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(final androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        Object obj;
        final androidx.compose.ui.layout.d1 d1VarF;
        androidx.compose.ui.layout.d1 d1VarF2;
        w3 w3Var = this;
        float fFloatValue = ((Number) w3Var.a.invoke()).floatValue();
        float f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
        long jA = androidx.compose.ui.unit.a.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i = 0;
        while (i < size) {
            androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(i);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a0.h(p0Var), "icon")) {
                final androidx.compose.ui.layout.d1 d1VarF3 = p0Var.F(jA);
                char c = 2;
                float f2 = 2;
                int iI0 = s0Var.i0(x3.d * f2) + d1VarF3.e;
                int iH = kotlin.math.a.H(iI0 * f);
                int iI1 = s0Var.i0(x3.e * f2) + d1VarF3.y;
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) list.get(i2);
                    char c2 = c;
                    final float f3 = f;
                    if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a0.h(p0Var2), "indicatorRipple")) {
                        if (!((iI0 >= 0) & (iI1 >= 0))) {
                            androidx.compose.ui.unit.i.a("width and height must be >= 0");
                        }
                        final androidx.compose.ui.layout.d1 d1VarF4 = p0Var2.F(androidx.compose.ui.unit.b.h(iI0, iI0, iI1, iI1));
                        int size3 = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i3);
                            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a0.h((androidx.compose.ui.layout.p0) obj), "indicator")) {
                                break;
                            }
                            i3++;
                        }
                        androidx.compose.ui.layout.p0 p0Var3 = (androidx.compose.ui.layout.p0) obj;
                        if (p0Var3 != null) {
                            if (!((iH >= 0) & (iI1 >= 0))) {
                                androidx.compose.ui.unit.i.a("width and height must be >= 0");
                            }
                            d1VarF = p0Var3.F(androidx.compose.ui.unit.b.h(iH, iH, iI1, iI1));
                        } else {
                            d1VarF = null;
                        }
                        kotlin.jvm.functions.p pVar = w3Var.b;
                        if (pVar != null) {
                            int size4 = list.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size4) {
                                    androidx.compose.ui.util.a.b("Collection contains no element matching the predicate.");
                                    com.google.firebase.platforminfo.b.b();
                                    return null;
                                }
                                androidx.compose.ui.layout.p0 p0Var4 = (androidx.compose.ui.layout.p0) list.get(i4);
                                if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a0.h(p0Var4), "label")) {
                                    d1VarF2 = p0Var4.F(jA);
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            d1VarF2 = null;
                        }
                        kotlin.collections.x xVar = kotlin.collections.x.e;
                        if (pVar == null) {
                            final int iI2 = androidx.compose.ui.unit.a.h(j) == Integer.MAX_VALUE ? (s0Var.i0(x3.g) * 2) + d1VarF3.e : androidx.compose.ui.unit.a.h(j);
                            final int iF = androidx.compose.ui.unit.b.f(s0Var.i0(x3.a), j);
                            final int i5 = (iI2 - d1VarF3.e) / 2;
                            final int i6 = (iF - d1VarF3.y) / 2;
                            final int i7 = (iI2 - d1VarF4.e) / 2;
                            final int i8 = (iF - d1VarF4.y) / 2;
                            return s0Var.q(iI2, iF, xVar, new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.r3
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj2) {
                                    androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj2;
                                    androidx.compose.ui.layout.d1 d1Var = d1VarF;
                                    if (d1Var != null) {
                                        androidx.compose.ui.layout.c1.l(c1Var, d1Var, (iI2 - d1Var.e) / 2, (iF - d1Var.y) / 2);
                                    }
                                    androidx.compose.ui.layout.c1.l(c1Var, d1VarF3, i5, i6);
                                    androidx.compose.ui.layout.c1.l(c1Var, d1VarF4, i7, i8);
                                    return kotlin.y.a;
                                }
                            });
                        }
                        d1VarF2.getClass();
                        float f4 = d1VarF3.y;
                        float f5 = x3.e;
                        float fW = s0Var.W(f5) + f4;
                        float f6 = x3.c;
                        float fW2 = s0Var.W(f6) + fW + d1VarF2.y;
                        float fI = (androidx.compose.ui.unit.a.i(j) - fW2) / f2;
                        float fW3 = s0Var.W(f5);
                        if (fI < fW3) {
                            fI = fW3;
                        }
                        float f7 = (fI * f2) + fW2;
                        final boolean z = w3Var.c;
                        final float f8 = (1 - f3) * ((z ? fI : (f7 - d1VarF3.y) / f2) - fI);
                        final float fW4 = s0Var.W(f6) + s0Var.W(f5) + d1VarF3.y + fI;
                        int iI3 = androidx.compose.ui.unit.a.h(j) == Integer.MAX_VALUE ? (s0Var.i0(x3.g) * 2) + d1VarF3.e : androidx.compose.ui.unit.a.h(j);
                        final int i9 = (iI3 - d1VarF2.e) / 2;
                        final int i10 = (iI3 - d1VarF3.e) / 2;
                        final int i11 = (iI3 - d1VarF4.e) / 2;
                        final float fW5 = fI - s0Var.W(f5);
                        int iH2 = kotlin.math.a.H(f7);
                        final float f9 = fI;
                        final androidx.compose.ui.layout.d1 d1Var = d1VarF;
                        final androidx.compose.ui.layout.d1 d1Var2 = d1VarF2;
                        final int i12 = iI3;
                        return s0Var.q(i12, iH2, xVar, new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.q3
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj2;
                                androidx.compose.ui.layout.d1 d1Var3 = d1Var;
                                float f10 = f8;
                                float f11 = f9;
                                if (d1Var3 != null) {
                                    androidx.compose.ui.layout.c1.l(c1Var, d1Var3, (i12 - d1Var3.e) / 2, kotlin.math.a.H((f11 - s0Var.i0(x3.e)) + f10));
                                }
                                if (z || f3 != 0.0f) {
                                    androidx.compose.ui.layout.c1.l(c1Var, d1Var2, i9, kotlin.math.a.H(fW4 + f10));
                                }
                                androidx.compose.ui.layout.c1.l(c1Var, d1VarF3, i10, kotlin.math.a.H(f11 + f10));
                                androidx.compose.ui.layout.c1.l(c1Var, d1VarF4, i11, kotlin.math.a.H(fW5 + f10));
                                return kotlin.y.a;
                            }
                        });
                    }
                    i2++;
                    w3Var = this;
                    c = c2;
                    f = f3;
                }
                androidx.compose.ui.util.a.b("Collection contains no element matching the predicate.");
                com.google.firebase.platforminfo.b.b();
                return null;
            }
            i++;
            w3Var = this;
        }
        androidx.compose.ui.util.a.b("Collection contains no element matching the predicate.");
        com.google.firebase.platforminfo.b.b();
        return null;
    }
}
