package com.app.mlounge.ui.components;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.s4;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import com.app.mlounge.ui.screens.player.c1;
import com.app.mlounge.ui.viewmodel.d2;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ n(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, kotlin.jvm.functions.l lVar4, kotlin.jvm.functions.l lVar5, kotlin.jvm.functions.q qVar, kotlin.jvm.functions.l lVar6, boolean z, kotlin.jvm.functions.a aVar, d2 d2Var, int i) {
        this.B = lVar;
        this.C = lVar2;
        this.D = lVar3;
        this.E = lVar4;
        this.F = lVar5;
        this.z = qVar;
        this.A = lVar6;
        this.y = z;
        this.G = aVar;
        this.H = d2Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                final kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.B;
                androidx.compose.ui.focus.y yVar = (androidx.compose.ui.focus.y) this.C;
                final a1 a1Var = (a1) this.z;
                final a1 a1Var2 = (a1) this.A;
                final a1 a1Var3 = (a1) this.G;
                final a1 a1Var4 = (a1) this.H;
                androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) this.D;
                androidx.compose.ui.focus.y yVar3 = (androidx.compose.ui.focus.y) this.E;
                androidx.compose.ui.focus.y yVar4 = (androidx.compose.ui.focus.y) this.F;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final boolean z = this.y;
                    boolean zG = sVar.g(z) | sVar.f(pVar);
                    Object objQ = sVar.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                    if (zG || objQ == fVar) {
                        kotlin.jvm.functions.a aVar = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.u
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                a1 a1Var5 = a1Var;
                                int length = ((String) a1Var5.getValue()).length();
                                a1 a1Var6 = a1Var2;
                                if (length != 4) {
                                    a1Var6.setValue("PIN must be 4 digits");
                                } else if (z || kotlin.jvm.internal.l.a((String) a1Var5.getValue(), (String) a1Var3.getValue())) {
                                    String str = (String) a1Var5.getValue();
                                    Boolean bool = (Boolean) a1Var4.getValue();
                                    bool.booleanValue();
                                    pVar.invoke(str, bool);
                                } else {
                                    a1Var6.setValue("PINs do not match");
                                }
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(aVar);
                        objQ = aVar;
                    }
                    kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ;
                    androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(androidx.compose.ui.o.b, yVar);
                    boolean zG2 = sVar.g(z);
                    Object objQ2 = sVar.Q();
                    if (zG2 || objQ2 == fVar) {
                        y yVar5 = new y(z, yVar2, yVar3, yVar4, 0);
                        sVar.l0(yVar5);
                        objQ2 = yVar5;
                    }
                    androidx.compose.material3.q.i(aVar2, androidx.compose.ui.input.key.c.e(rVarK, (kotlin.jvm.functions.l) objQ2), false, null, null, null, null, b0.a, sVar, 805306368, 508);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                final c1 c1Var = (c1) this.B;
                final kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) this.C;
                final List list = (List) this.D;
                final kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.E;
                final kotlin.jvm.functions.a aVar4 = (kotlin.jvm.functions.a) this.F;
                final kotlin.jvm.functions.a aVar5 = (kotlin.jvm.functions.a) this.G;
                final a1 a1Var5 = (a1) this.z;
                final List list2 = (List) this.H;
                final a1 a1Var6 = (a1) this.A;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.r rVarC = i1.c(i1.e(androidx.compose.ui.o.b, 0.85f), 0.7f);
                    androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(16);
                    androidx.compose.material3.g0 g0VarJ = androidx.compose.material3.q.j(com.app.mlounge.ui.theme.b.b, sVar2, 6);
                    final boolean z2 = this.y;
                    androidx.compose.material3.q.c(rVarC, dVarA, g0VarJ, null, androidx.compose.runtime.internal.k.c(-1843188989, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.e0
                        @Override // kotlin.jvm.functions.q
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            androidx.compose.ui.node.f fVar2;
                            androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            ((androidx.compose.foundation.layout.x) obj3).getClass();
                            if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                androidx.compose.foundation.layout.e0 e0Var = i1.c;
                                androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar3, 0);
                                int iHashCode = Long.hashCode(sVar3.T);
                                androidx.compose.runtime.internal.j jVarL = sVar3.l();
                                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar3, e0Var);
                                androidx.compose.ui.node.h.b.getClass();
                                androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                                sVar3.e0();
                                if (sVar3.S) {
                                    sVar3.k(fVar3);
                                } else {
                                    sVar3.o0();
                                }
                                androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                                androidx.compose.runtime.t.x(sVar3, wVarA, eVar);
                                androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                                androidx.compose.runtime.t.x(sVar3, jVarL, eVar2);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                                androidx.compose.runtime.t.p(sVar3, numValueOf, eVar3);
                                androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                                androidx.compose.runtime.t.t(sVar3, dVar);
                                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                                androidx.compose.runtime.t.x(sVar3, rVarC2, eVar4);
                                androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                                androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(i1.e(oVar, 1.0f), 16);
                                androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.h.e;
                                androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                                f1 f1VarA = d1.a(dVar2, iVar, sVar3, 54);
                                int iHashCode2 = Long.hashCode(sVar3.T);
                                androidx.compose.runtime.internal.j jVarL2 = sVar3.l();
                                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar3, rVarQ);
                                sVar3.e0();
                                if (sVar3.S) {
                                    sVar3.k(fVar3);
                                } else {
                                    sVar3.o0();
                                }
                                androidx.compose.runtime.t.x(sVar3, f1VarA, eVar);
                                androidx.compose.runtime.t.x(sVar3, jVarL2, eVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar3, eVar3, sVar3, dVar);
                                androidx.compose.runtime.t.x(sVar3, rVarC3, eVar4);
                                androidx.compose.ui.text.m0 m0Var = ((m6) sVar3.j(n6.a)).g;
                                long j = androidx.compose.ui.graphics.t.d;
                                z5.b("Subtitles", null, j, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar3, 1573254, 0, 131002);
                                f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.a, iVar, sVar3, 48);
                                int iHashCode3 = Long.hashCode(sVar3.T);
                                androidx.compose.runtime.internal.j jVarL3 = sVar3.l();
                                androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar3, oVar);
                                sVar3.e0();
                                if (sVar3.S) {
                                    fVar2 = fVar3;
                                    sVar3.k(fVar2);
                                } else {
                                    fVar2 = fVar3;
                                    sVar3.o0();
                                }
                                androidx.compose.runtime.t.x(sVar3, f1VarA2, eVar);
                                androidx.compose.runtime.t.x(sVar3, jVarL3, eVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar3, eVar3, sVar3, dVar);
                                androidx.compose.runtime.t.x(sVar3, rVarC4, eVar4);
                                androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                                int iHashCode4 = Long.hashCode(sVar3.T);
                                androidx.compose.runtime.internal.j jVarL4 = sVar3.l();
                                androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(sVar3, oVar);
                                sVar3.e0();
                                if (sVar3.S) {
                                    sVar3.k(fVar2);
                                } else {
                                    sVar3.o0();
                                }
                                androidx.compose.runtime.t.x(sVar3, q0VarD, eVar);
                                androidx.compose.runtime.t.x(sVar3, jVarL4, eVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar3, eVar3, sVar3, dVar);
                                androidx.compose.runtime.t.x(sVar3, rVarC5, eVar4);
                                androidx.compose.ui.graphics.vector.f fVarN = _COROUTINE.a.N();
                                Object objQ3 = sVar3.Q();
                                androidx.compose.runtime.a1 a1Var7 = a1Var5;
                                androidx.compose.runtime.f fVar4 = androidx.compose.runtime.n.a;
                                if (objQ3 == fVar4) {
                                    objQ3 = new androidx.compose.foundation.lazy.m(a1Var7, 21);
                                    sVar3.l0(objQ3);
                                }
                                k0.f(fVarN, (kotlin.jvm.functions.a) objQ3, sVar3, 48);
                                boolean zBooleanValue = ((Boolean) a1Var7.getValue()).booleanValue();
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0)) << 32) | (((long) Float.floatToRawIntBits(4)) & 4294967295L);
                                androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(oVar, com.app.mlounge.ui.theme.b.c, androidx.compose.ui.graphics.a0.b);
                                Object objQ4 = sVar3.Q();
                                if (objQ4 == fVar4) {
                                    objQ4 = new androidx.compose.foundation.lazy.m(a1Var7, 22);
                                    sVar3.l0(objQ4);
                                }
                                androidx.compose.ui.node.f fVar5 = fVar2;
                                androidx.compose.material3.p.a(zBooleanValue, (kotlin.jvm.functions.a) objQ4, rVarF, jFloatToRawIntBits, null, null, null, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1172944058, new com.app.mlounge.ui.components.e0(3, list2, a1Var6, a1Var7), sVar3), sVar3, 3504, 2032);
                                sVar3.p(true);
                                k0.f(org.jsoup.helper.n.t(), aVar4, sVar3, 0);
                                k0.f(t1.w(), aVar5, sVar3, 0);
                                sVar3.p(true);
                                sVar3.p(true);
                                androidx.compose.material3.q.d(null, 0.0f, androidx.compose.ui.graphics.t.b(0.1f, j), sVar3, 384, 3);
                                if (z2) {
                                    sVar3.b0(-1922553587);
                                    androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                                    int iHashCode5 = Long.hashCode(sVar3.T);
                                    androidx.compose.runtime.internal.j jVarL5 = sVar3.l();
                                    androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(sVar3, e0Var);
                                    sVar3.e0();
                                    if (sVar3.S) {
                                        sVar3.k(fVar5);
                                    } else {
                                        sVar3.o0();
                                    }
                                    androidx.compose.runtime.t.x(sVar3, q0VarD2, eVar);
                                    androidx.compose.runtime.t.x(sVar3, jVarL5, eVar2);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, sVar3, eVar3, sVar3, dVar);
                                    androidx.compose.runtime.t.x(sVar3, rVarC6, eVar4);
                                    s4.a(null, com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar3, 48, 61);
                                    sVar3.p(true);
                                    sVar3.p(false);
                                } else {
                                    sVar3.b0(-1922379770);
                                    float f = 8;
                                    androidx.compose.foundation.layout.z0 z0Var = new androidx.compose.foundation.layout.z0(f, f, f, f);
                                    c1 c1Var2 = c1Var;
                                    boolean zF = sVar3.f(c1Var2);
                                    kotlin.jvm.functions.a aVar6 = aVar3;
                                    boolean zF2 = zF | sVar3.f(aVar6);
                                    List list3 = list;
                                    boolean zH = zF2 | sVar3.h(list3);
                                    kotlin.jvm.functions.l lVar2 = lVar;
                                    boolean zF3 = zH | sVar3.f(lVar2);
                                    Object objQ5 = sVar3.Q();
                                    if (zF3 || objQ5 == fVar4) {
                                        androidx.compose.animation.core.i0 i0Var = new androidx.compose.animation.core.i0(list3, c1Var2, aVar6, lVar2, 12);
                                        sVar3.l0(i0Var);
                                        objQ5 = i0Var;
                                    }
                                    android.support.v4.media.session.b.c(e0Var, null, z0Var, null, null, null, false, null, (kotlin.jvm.functions.l) objQ5, sVar3, 390, 506);
                                    sVar3.p(false);
                                }
                                sVar3.p(true);
                            } else {
                                sVar3.W();
                            }
                            return kotlin.y.a;
                        }
                    }, sVar2), sVar2, 196614, 24);
                } else {
                    sVar2.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                t1.b((kotlin.jvm.functions.l) this.B, (kotlin.jvm.functions.l) this.C, (kotlin.jvm.functions.l) this.D, (kotlin.jvm.functions.l) this.E, (kotlin.jvm.functions.l) this.F, (kotlin.jvm.functions.q) this.z, (kotlin.jvm.functions.l) this.A, this.y, (kotlin.jvm.functions.a) this.G, (d2) this.H, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(100663297));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ n(boolean z, c1 c1Var, kotlin.jvm.functions.a aVar, List list, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, a1 a1Var, List list2, a1 a1Var2) {
        this.y = z;
        this.B = c1Var;
        this.C = aVar;
        this.D = list;
        this.E = lVar;
        this.F = aVar2;
        this.G = aVar3;
        this.z = a1Var;
        this.H = list2;
        this.A = a1Var2;
    }

    public /* synthetic */ n(boolean z, kotlin.jvm.functions.p pVar, androidx.compose.ui.focus.y yVar, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, androidx.compose.ui.focus.y yVar4) {
        this.y = z;
        this.B = pVar;
        this.C = yVar;
        this.z = a1Var;
        this.A = a1Var2;
        this.G = a1Var3;
        this.H = a1Var4;
        this.D = yVar2;
        this.E = yVar3;
        this.F = yVar4;
    }
}
