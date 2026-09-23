package androidx.compose.material3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 implements androidx.compose.ui.layout.q0 {
    public final kotlin.jvm.functions.l a;
    public final boolean b;
    public final x5 c;
    public final androidx.compose.material3.internal.z0 d;
    public final androidx.compose.foundation.layout.z0 e;
    public final float f;

    public j4(kotlin.jvm.functions.l lVar, boolean z, x5 x5Var, androidx.compose.material3.internal.z0 z0Var, androidx.compose.foundation.layout.z0 z0Var2, float f) {
        this.a = lVar;
        this.b = z;
        this.c = x5Var;
        this.d = z0Var;
        this.e = z0Var2;
        this.f = f;
    }

    public static final int j(int i, j4 j4Var, int i2, int i3, androidx.compose.ui.layout.d1 d1Var, androidx.compose.ui.layout.d1 d1Var2) {
        if (j4Var.b) {
            i3 = androidx.privacysandbox.ads.adservices.java.internal.a.a(1, 0.0f, (i2 - d1Var2.y) / 2.0f);
        }
        return Math.max(i + i3, (d1Var != null ? d1Var.y : 0) / 2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v4 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 r45, java.util.List r46, long r47) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.j4.a(androidx.compose.ui.layout.s0, java.util.List, long):androidx.compose.ui.layout.r0");
    }

    @Override // androidx.compose.ui.layout.q0
    public final int b(androidx.compose.ui.layout.s sVar, List list, int i) {
        return i(sVar, list, i, new androidx.compose.foundation.b2(9));
    }

    public final int c(androidx.compose.ui.layout.s sVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, com.google.firebase.b.N(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        androidx.compose.foundation.layout.z0 z0Var = this.e;
        float fW = sVar.W(z0Var.b);
        return androidx.compose.ui.unit.b.f(Math.max(i, Math.max(i2, kotlin.math.a.H(com.google.firebase.b.M(fW, Math.max(fW, i6 / 2.0f), f) + i5 + sVar.W(z0Var.d)))) + i8, j);
    }

    public final int d(androidx.compose.ui.layout.s sVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, com.google.firebase.b.N(f, i6, 0))) + i + i2;
        androidx.compose.foundation.layout.z0 z0Var = this.e;
        androidx.compose.ui.unit.m mVar = androidx.compose.ui.unit.m.e;
        return androidx.compose.ui.unit.b.g(Math.max(iMax, kotlin.math.a.H((i6 + sVar.W(z0Var.b(mVar) + z0Var.a(mVar))) * f)), j);
    }

    @Override // androidx.compose.ui.layout.q0
    public final int e(androidx.compose.ui.layout.s sVar, List list, int i) {
        return f(sVar, list, i, new androidx.compose.foundation.b2(8));
    }

    public final int f(androidx.compose.ui.layout.s sVar, List list, int i, kotlin.jvm.functions.p pVar) {
        Object obj;
        int iJ;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        j4 j4Var = this;
        float fA = j4Var.d.a();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj), "Leading")) {
                break;
            }
            i2++;
        }
        androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) obj;
        if (p0Var != null) {
            iJ = androidx.compose.material3.internal.i.j(i, p0Var.B(Integer.MAX_VALUE));
            iIntValue = ((Number) pVar.invoke(p0Var, Integer.valueOf(i))).intValue();
        } else {
            iJ = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) obj2;
        if (p0Var2 != null) {
            iJ = androidx.compose.material3.internal.i.j(iJ, p0Var2.B(Integer.MAX_VALUE));
            iIntValue2 = ((Number) pVar.invoke(p0Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (androidx.compose.ui.layout.p0) obj3;
        int iIntValue5 = obj8 != null ? ((Number) pVar.invoke(obj8, Integer.valueOf(com.google.firebase.b.N(fA, iJ, i)))).intValue() : 0;
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj4), "Prefix")) {
                break;
            }
            i5++;
        }
        androidx.compose.ui.layout.p0 p0Var3 = (androidx.compose.ui.layout.p0) obj4;
        if (p0Var3 != null) {
            iIntValue3 = ((Number) pVar.invoke(p0Var3, Integer.valueOf(iJ))).intValue();
            iJ = androidx.compose.material3.internal.i.j(iJ, p0Var3.B(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i6);
            if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj5), "Suffix")) {
                break;
            }
            i6++;
        }
        androidx.compose.ui.layout.p0 p0Var4 = (androidx.compose.ui.layout.p0) obj5;
        if (p0Var4 != null) {
            iIntValue4 = ((Number) pVar.invoke(p0Var4, Integer.valueOf(iJ))).intValue();
            iJ = androidx.compose.material3.internal.i.j(iJ, p0Var4.B(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj9), "TextField")) {
                int iIntValue6 = ((Number) pVar.invoke(obj9, Integer.valueOf(iJ))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (androidx.compose.ui.layout.p0) obj6;
                int iIntValue7 = obj10 != null ? ((Number) pVar.invoke(obj10, Integer.valueOf(iJ))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (androidx.compose.ui.layout.p0) obj7;
                return j4Var.c(sVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) pVar.invoke(obj11, Integer.valueOf(i))).intValue() : 0, androidx.compose.ui.unit.b.b(0, 0, 15), fA);
            }
            i7++;
            iIntValue4 = iIntValue4;
            j4Var = this;
            iIntValue3 = iIntValue3;
        }
        androidx.compose.ui.util.a.b("Collection contains no element matching the predicate.");
        com.google.firebase.platforminfo.b.b();
        return 0;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int g(androidx.compose.ui.layout.s sVar, List list, int i) {
        return i(sVar, list, i, new androidx.compose.foundation.b2(11));
    }

    @Override // androidx.compose.ui.layout.q0
    public final int h(androidx.compose.ui.layout.s sVar, List list, int i) {
        return f(sVar, list, i, new androidx.compose.foundation.b2(10));
    }

    public final int i(androidx.compose.ui.layout.s sVar, List list, int i, kotlin.jvm.functions.p pVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj7), "TextField")) {
                int iIntValue = ((Number) pVar.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) obj2;
                int iIntValue2 = p0Var != null ? ((Number) pVar.invoke(p0Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) obj3;
                int iIntValue3 = p0Var2 != null ? ((Number) pVar.invoke(p0Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                androidx.compose.ui.layout.p0 p0Var3 = (androidx.compose.ui.layout.p0) obj4;
                int iIntValue4 = p0Var3 != null ? ((Number) pVar.invoke(p0Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                androidx.compose.ui.layout.p0 p0Var4 = (androidx.compose.ui.layout.p0) obj5;
                int iIntValue5 = p0Var4 != null ? ((Number) pVar.invoke(p0Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                androidx.compose.ui.layout.p0 p0Var5 = (androidx.compose.ui.layout.p0) obj6;
                int iIntValue6 = p0Var5 != null ? ((Number) pVar.invoke(p0Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (kotlin.jvm.internal.l.a(androidx.compose.material3.internal.i.h((androidx.compose.ui.layout.p0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                androidx.compose.ui.layout.p0 p0Var6 = (androidx.compose.ui.layout.p0) obj;
                return d(sVar, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, p0Var6 != null ? ((Number) pVar.invoke(p0Var6, Integer.valueOf(i))).intValue() : 0, androidx.compose.ui.unit.b.b(0, 0, 15), this.d.a());
            }
        }
        androidx.compose.ui.util.a.b("Collection contains no element matching the predicate.");
        com.google.firebase.platforminfo.b.b();
        return 0;
    }
}
