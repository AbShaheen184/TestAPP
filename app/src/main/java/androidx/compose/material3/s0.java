package androidx.compose.material3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements androidx.compose.ui.layout.q0 {
    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a0.h((androidx.compose.ui.layout.p0) obj), "leadingIcon")) {
                break;
            }
            i++;
        }
        androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) obj;
        final androidx.compose.ui.layout.d1 d1VarF = p0Var != null ? p0Var.F(androidx.compose.ui.unit.a.a(j, 0, 0, 0, 0, 10)) : null;
        int i2 = d1VarF != null ? d1VarF.e : 0;
        final int i3 = d1VarF != null ? d1VarF.y : 0;
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a0.h((androidx.compose.ui.layout.p0) obj2), "trailingIcon")) {
                break;
            }
            i4++;
        }
        androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) obj2;
        final androidx.compose.ui.layout.d1 d1VarF2 = p0Var2 != null ? p0Var2.F(androidx.compose.ui.unit.a.a(j, 0, 0, 0, 0, 10)) : null;
        int i5 = d1VarF2 != null ? d1VarF2.e : 0;
        final int i6 = d1VarF2 != null ? d1VarF2.y : 0;
        int size3 = list.size();
        int i7 = 0;
        while (i7 < size3) {
            androidx.compose.ui.layout.p0 p0Var3 = (androidx.compose.ui.layout.p0) list.get(i7);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a0.h(p0Var3), "label")) {
                final androidx.compose.ui.layout.d1 d1VarF3 = p0Var3.F(androidx.compose.ui.unit.b.j(-(i2 + i5), 0, 2, j));
                int i8 = d1VarF3.e + i2 + i5;
                final int iMax = Math.max(i3, Math.max(d1VarF3.y, i6));
                final int i9 = i2;
                return s0Var.q(i8, iMax, kotlin.collections.x.e, new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.r0
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj3) {
                        androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj3;
                        androidx.compose.ui.layout.d1 d1Var = d1VarF;
                        int i10 = iMax;
                        if (d1Var != null) {
                            androidx.compose.ui.layout.c1.l(c1Var, d1Var, 0, androidx.privacysandbox.ads.adservices.java.internal.a.a(1, 0.0f, (i10 - i3) / 2.0f));
                        }
                        androidx.compose.ui.layout.d1 d1Var2 = d1VarF3;
                        int i11 = i9;
                        androidx.compose.ui.layout.c1.l(c1Var, d1Var2, i11, 0);
                        androidx.compose.ui.layout.d1 d1Var3 = d1VarF2;
                        if (d1Var3 != null) {
                            androidx.compose.ui.layout.c1.l(c1Var, d1Var3, i11 + d1Var2.e, androidx.privacysandbox.ads.adservices.java.internal.a.a(1, 0.0f, (i10 - i6) / 2.0f));
                        }
                        return kotlin.y.a;
                    }
                });
            }
            i7++;
            d1VarF = d1VarF;
            i2 = i2;
            i3 = i3;
        }
        androidx.compose.ui.util.a.b("Collection contains no element matching the predicate.");
        com.google.firebase.platforminfo.b.b();
        return null;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int b(androidx.compose.ui.layout.s sVar, List list, int i) {
        int size = list.size();
        int iB = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iB += ((androidx.compose.ui.layout.p0) list.get(i2)).B(i);
        }
        return iB;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int e(androidx.compose.ui.layout.s sVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(0)).a0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(i2)).a0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int g(androidx.compose.ui.layout.s sVar, List list, int i) {
        int size = list.size();
        int iV = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iV += ((androidx.compose.ui.layout.p0) list.get(i2)).v(i);
        }
        return iV;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int h(androidx.compose.ui.layout.s sVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(0)).b(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(i2)).b(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
