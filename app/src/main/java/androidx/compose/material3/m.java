package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.runtime.a1 y;

    public /* synthetic */ m(androidx.compose.runtime.a1 a1Var, int i) {
        this.e = i;
        this.y = a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x073d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0760  */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        float fMin;
        androidx.compose.ui.graphics.vector.f fVarB;
        int i = this.e;
        float fMin2 = 1.0f;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
        kotlin.y yVar = kotlin.y.a;
        androidx.compose.runtime.a1 a1Var = this.y;
        switch (i) {
            case 0:
                androidx.compose.ui.unit.k kVar = (androidx.compose.ui.unit.k) obj;
                androidx.compose.ui.unit.k kVar2 = (androidx.compose.ui.unit.k) obj2;
                float f = n2.a;
                int i2 = kVar2.a;
                int i3 = kVar2.d;
                int i4 = kVar2.c;
                int i5 = kVar2.b;
                int i6 = kVar.c;
                int i7 = kVar.b;
                int i8 = kVar.d;
                int i9 = kVar.a;
                if (i2 >= i6) {
                    fMin = 0.0f;
                } else if (i4 <= i9) {
                    fMin = 1.0f;
                } else if (kVar2.c() == 0) {
                    fMin = 0.0f;
                } else {
                    fMin = (((Math.min(kVar.c, i4) + Math.max(i9, i2)) / 2) - i2) / kVar2.c();
                }
                if (i5 >= i8) {
                    fMin2 = 0.0f;
                } else if (i3 > i7) {
                    if (kVar2.b() == 0) {
                        fMin2 = 0.0f;
                    } else {
                        fMin2 = (((Math.min(i8, i3) + Math.max(i7, i5)) / 2) - i5) / kVar2.b();
                    }
                }
                a1Var.setValue(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.a0.h(fMin, fMin2)));
                break;
            case 1:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    androidx.compose.foundation.layout.f1 f1VarA = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.H, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, oVar);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar2);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.runtime.t.x(sVar, f1VarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                    s4.a(androidx.compose.foundation.layout.i1.m(oVar, 24), 0L, 0.0f, 0L, 0, 0.0f, sVar, 6, 62);
                    z5.b(androidx.privacysandbox.ads.adservices.java.internal.a.r("Loading ", (String) a1Var.getValue(), "..."), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 262142);
                    sVar.p(true);
                }
                break;
            case 2:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.s.q(androidx.compose.foundation.layout.b.q(oVar, 12), androidx.compose.foundation.s.p(sVar2), true);
                    androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar3);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.runtime.t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar2, jVarL2, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar2, rVarC2, androidx.compose.ui.node.g.d);
                    String str = (String) a1Var.getValue();
                    if (str == null) {
                        str = "Unable to load changelog.";
                    }
                    z5.b(str, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).l, sVar2, 0, 0, 131066);
                    sVar2.p(true);
                }
                break;
            case 3:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                } else {
                    Object objQ = sVar3.Q();
                    if (objQ == fVar) {
                        objQ = new androidx.compose.foundation.lazy.m(a1Var, 8);
                        sVar3.l0(objQ);
                    }
                    q.e((kotlin.jvm.functions.a) objQ, null, false, null, null, null, androidx.compose.runtime.internal.k.c(403555793, new m(a1Var, 4), sVar3), sVar3, 1572870, 62);
                }
                break;
            case 4:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    sVar4.W();
                } else {
                    if (((Boolean) a1Var.getValue()).booleanValue()) {
                        fVarB = kotlin.math.a.D;
                        if (fVarB == null) {
                            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.VisibilityOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i10 = androidx.compose.ui.graphics.vector.h0.a;
                            androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                            androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(12.0f, 7.0f);
                            gVarJ.n(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
                            gVarJ.n(0.0f, 0.65f, -0.13f, 1.26f, -0.36f, 1.83f);
                            gVarJ.u(2.92f, 2.92f);
                            gVarJ.n(1.51f, -1.26f, 2.7f, -2.89f, 3.43f, -4.75f);
                            gVarJ.n(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
                            gVarJ.n(-1.4f, 0.0f, -2.74f, 0.25f, -3.98f, 0.7f);
                            gVarJ.u(2.16f, 2.16f);
                            gVarJ.m(10.74f, 7.13f, 11.35f, 7.0f, 12.0f, 7.0f);
                            gVarJ.l();
                            gVarJ.v(2.0f, 4.27f);
                            gVarJ.u(2.28f, 2.28f);
                            gVarJ.u(0.46f, 0.46f);
                            gVarJ.m(3.08f, 8.3f, 1.78f, 10.02f, 1.0f, 12.0f);
                            gVarJ.n(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
                            gVarJ.n(1.55f, 0.0f, 3.03f, -0.3f, 4.38f, -0.84f);
                            gVarJ.u(0.42f, 0.42f);
                            gVarJ.t(19.73f, 22.0f);
                            gVarJ.t(21.0f, 20.73f);
                            gVarJ.t(3.27f, 3.0f);
                            gVarJ.t(2.0f, 4.27f);
                            gVarJ.l();
                            gVarJ.v(7.53f, 9.8f);
                            gVarJ.u(1.55f, 1.55f);
                            gVarJ.n(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                            gVarJ.n(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                            gVarJ.n(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
                            gVarJ.u(1.55f, 1.55f);
                            gVarJ.n(-0.67f, 0.33f, -1.41f, 0.53f, -2.2f, 0.53f);
                            gVarJ.n(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                            gVarJ.n(0.0f, -0.79f, 0.2f, -1.53f, 0.53f, -2.2f);
                            gVarJ.l();
                            gVarJ.v(11.84f, 9.02f);
                            gVarJ.u(3.15f, 3.15f);
                            gVarJ.u(0.02f, -0.16f);
                            gVarJ.n(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                            gVarJ.u(-0.17f, 0.01f);
                            gVarJ.l();
                            androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
                            fVarB = eVar.b();
                            kotlin.math.a.D = fVarB;
                        }
                    } else {
                        fVarB = com.imsdk.a.g;
                        if (fVarB == null) {
                            androidx.compose.ui.graphics.vector.e eVar2 = new androidx.compose.ui.graphics.vector.e("Filled.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i11 = androidx.compose.ui.graphics.vector.h0.a;
                            androidx.compose.ui.graphics.p0 p0Var2 = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                            androidx.compose.ui.graphics.vector.g gVarJ2 = androidx.privacysandbox.ads.adservices.java.internal.a.j(12.0f, 4.5f);
                            gVarJ2.m(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f);
                            gVarJ2.n(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
                            gVarJ2.x(9.27f, -3.11f, 11.0f, -7.5f);
                            gVarJ2.n(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
                            gVarJ2.l();
                            gVarJ2.v(12.0f, 17.0f);
                            gVarJ2.n(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                            gVarJ2.x(2.24f, -5.0f, 5.0f, -5.0f);
                            gVarJ2.x(5.0f, 2.24f, 5.0f, 5.0f);
                            gVarJ2.x(-2.24f, 5.0f, -5.0f, 5.0f);
                            gVarJ2.l();
                            gVarJ2.v(12.0f, 9.0f);
                            gVarJ2.n(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                            gVarJ2.x(1.34f, 3.0f, 3.0f, 3.0f);
                            gVarJ2.x(3.0f, -1.34f, 3.0f, -3.0f);
                            gVarJ2.x(-1.34f, -3.0f, -3.0f, -3.0f);
                            gVarJ2.l();
                            androidx.compose.ui.graphics.vector.e.a(eVar2, gVarJ2.b, 0, p0Var2);
                            fVarB = eVar2.b();
                            com.imsdk.a.g = fVarB;
                        }
                    }
                    q1.b(fVarB, ((Boolean) a1Var.getValue()).booleanValue() ? "Hide" : "Show", null, 0L, sVar4, 0, 12);
                }
                break;
            case 5:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sVar5.W();
                } else {
                    Object objQ2 = sVar5.Q();
                    if (objQ2 == fVar) {
                        objQ2 = new androidx.compose.foundation.lazy.m(a1Var, 13);
                        sVar5.l0(objQ2);
                    }
                    q.i((kotlin.jvm.functions.a) objQ2, null, false, null, null, null, null, com.app.mlounge.ui.screens.downloads.a.b, sVar5, 805306374, 510);
                }
                break;
            case 6:
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    sVar6.W();
                } else {
                    z5.b("All", null, androidx.compose.ui.graphics.t.d, 0L, ((String) a1Var.getValue()) == null ? androidx.compose.ui.text.font.k.C : androidx.compose.ui.text.font.k.z, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 390, 0, 262074);
                }
                break;
            case 7:
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    sVar7.W();
                } else {
                    Object objQ3 = sVar7.Q();
                    if (objQ3 == fVar) {
                        objQ3 = new com.app.mlounge.ui.screens.settings.q(a1Var, 11);
                        sVar7.l0(objQ3);
                    }
                    q.i((kotlin.jvm.functions.a) objQ3, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.b, sVar7, 805306374, 510);
                }
                break;
            case 8:
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    sVar8.W();
                } else {
                    Object objQ4 = sVar8.Q();
                    if (objQ4 == fVar) {
                        objQ4 = new androidx.compose.foundation.lazy.m(a1Var, 26);
                        sVar8.l0(objQ4);
                    }
                    q.i((kotlin.jvm.functions.a) objQ4, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.x, sVar8, 805306374, 510);
                }
                break;
            case 9:
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!sVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    sVar9.W();
                } else {
                    String str2 = (String) a1Var.getValue();
                    b4 b4Var = b4.a;
                    long j = androidx.compose.ui.graphics.t.d;
                    long j2 = com.app.mlounge.ui.theme.b.f;
                    u5 u5VarC = b4.c(j, j, j2, j2, androidx.compose.ui.graphics.t.b(0.3f, j), j2, androidx.compose.ui.graphics.t.b(0.5f, j), sVar9, 2122311420);
                    androidx.compose.ui.r rVarE = androidx.compose.foundation.layout.i1.e(oVar, 1.0f);
                    Object objQ5 = sVar9.Q();
                    if (objQ5 == fVar) {
                        objQ5 = new androidx.compose.foundation.gestures.m2(a1Var, 19);
                        sVar9.l0(objQ5);
                    }
                    h4.a(str2, (kotlin.jvm.functions.l) objQ5, rVarE, false, false, null, com.app.mlounge.ui.screens.settings.b.z, null, null, null, null, null, null, true, 0, 0, null, null, u5VarC, sVar9, 1573296, 12582912, 0, 4063160);
                }
                break;
            case 10:
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!sVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    sVar10.W();
                } else {
                    Object objQ6 = sVar10.Q();
                    if (objQ6 == fVar) {
                        objQ6 = new androidx.compose.foundation.lazy.m(a1Var, 27);
                        sVar10.l0(objQ6);
                    }
                    q.i((kotlin.jvm.functions.a) objQ6, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.u, sVar10, 805306374, 510);
                }
                break;
            default:
                androidx.compose.runtime.s sVar11 = (androidx.compose.runtime.s) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!sVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    sVar11.W();
                } else {
                    String str3 = ((com.app.mlounge.ui.viewmodel.m) a1Var.getValue()).c;
                    if (str3 == null) {
                        str3 = "Debrid Error";
                    }
                    z5.b(str3, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 384, 0, 262138);
                }
                break;
        }
        return yVar;
    }
}
