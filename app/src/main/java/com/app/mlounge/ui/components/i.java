package com.app.mlounge.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.s4;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.x2;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements kotlin.jvm.functions.p {
    public final /* synthetic */ f1 A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ Context C;
    public final /* synthetic */ kotlin.jvm.functions.a D;
    public final /* synthetic */ a1 E;
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ i(y0 y0Var, a1 a1Var, f1 f1Var, a1 a1Var2, Context context, kotlin.jvm.functions.a aVar, a1 a1Var3, int i) {
        this.e = i;
        this.y = y0Var;
        this.z = a1Var;
        this.A = f1Var;
        this.B = a1Var2;
        this.C = context;
        this.D = aVar;
        this.E = a1Var3;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        f1 f1Var;
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p5.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(605933855, new i(this.y, this.z, this.A, this.B, this.C, this.D, this.E, 1), sVar), sVar, 12582912, Token.DOT);
                } else {
                    sVar.W();
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                androidx.compose.ui.i iVar = androidx.compose.ui.c.G;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, 24);
                    androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, sVar2, 48);
                    int iHashCode = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL = sVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                    androidx.compose.runtime.t.x(sVar2, wVarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                    androidx.compose.runtime.t.x(sVar2, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                    androidx.compose.runtime.t.p(sVar2, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                    androidx.compose.runtime.t.t(sVar2, dVar);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                    androidx.compose.runtime.t.x(sVar2, rVarC, eVar4);
                    x2 x2Var = n6.a;
                    z5.b("Update Available", null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).h, sVar2, 1572870, 0, 131002);
                    float f = 4;
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, f));
                    y0 y0Var = this.y;
                    int i = y0Var.a;
                    String strG = androidx.compose.runtime.j.g("v", i / 100, ".", i % 100);
                    androidx.compose.ui.text.m0 m0Var = ((m6) sVar2.j(x2Var)).l;
                    long j = com.app.mlounge.ui.theme.b.f;
                    z5.b(strG, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 0, 0, 131066);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 16));
                    androidx.compose.ui.r rVarG = i1.g(i1.e(oVar, 1.0f), org.mozilla.javascript.Context.VERSION_ES6);
                    long j2 = com.app.mlounge.ui.theme.b.b;
                    float f2 = 12;
                    p5.a(rVarG, androidx.compose.foundation.shape.e.a(f2), j2, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-2120945936, new androidx.compose.animation.core.g0(y0Var, 19), sVar2), sVar2, 12582918, 120);
                    androidx.compose.runtime.s sVar3 = sVar2;
                    androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar, 20));
                    a1 a1Var = this.z;
                    boolean zBooleanValue = ((Boolean) a1Var.getValue()).booleanValue();
                    f1 f1Var2 = this.A;
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                    if (zBooleanValue) {
                        sVar3.b0(-9733228);
                        androidx.compose.ui.text.m0 m0Var2 = ((m6) sVar3.j(x2Var)).l;
                        long j3 = com.app.mlounge.ui.theme.b.m;
                        z5.b("Downloading update...", null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var2, sVar3, 6, 0, 131066);
                        androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar, 8));
                        Object objQ = sVar3.Q();
                        if (objQ == fVar2) {
                            f1Var = f1Var2;
                            objQ = new androidx.navigation.internal.h(f1Var, 19);
                            sVar3.l0(objQ);
                        } else {
                            f1Var = f1Var2;
                        }
                        s4.b((kotlin.jvm.functions.a) objQ, androidx.compose.ui.draw.h.a(i1.g(i1.e(oVar, 1.0f), 6), androidx.compose.foundation.shape.e.a(3)), j, j2, 0, 0.0f, null, sVar3, 6, Token.ASSIGN_MOD);
                        androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar, f));
                        z5.b(androidx.compose.runtime.j.d((int) (f1Var.g() * 100), "%"), null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(x2Var)).l, sVar3, 0, 0, 131066);
                        sVar3 = sVar3;
                        sVar3.p(false);
                        z = true;
                    } else {
                        a1 a1Var2 = this.B;
                        String str = (String) a1Var2.getValue();
                        Context context = this.C;
                        kotlin.jvm.functions.a aVar = this.D;
                        a1 a1Var3 = this.E;
                        if (str != null) {
                            sVar3.b0(-8580400);
                            String str2 = (String) a1Var2.getValue();
                            str2.getClass();
                            z5.b(str2, null, androidx.compose.ui.graphics.a0.d(4294929259L), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(x2Var)).l, sVar3, 384, 0, 131066);
                            androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar, f2));
                            androidx.compose.ui.r rVarE = i1.e(oVar, 1.0f);
                            androidx.compose.foundation.layout.f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.d, iVar, sVar3, 6);
                            int iHashCode2 = Long.hashCode(sVar3.T);
                            androidx.compose.runtime.internal.j jVarL2 = sVar3.l();
                            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar3, rVarE);
                            sVar3.e0();
                            if (sVar3.S) {
                                sVar3 = sVar3;
                                sVar3.k(fVar);
                            } else {
                                sVar3 = sVar3;
                                sVar3.o0();
                            }
                            androidx.compose.runtime.t.x(sVar3, f1VarA, eVar);
                            androidx.compose.runtime.t.x(sVar3, jVarL2, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar3, eVar3, sVar3, dVar);
                            androidx.compose.runtime.t.x(sVar3, rVarC2, eVar4);
                            boolean zH = sVar3.h(context);
                            Object objQ2 = sVar3.Q();
                            if (zH || objQ2 == fVar2) {
                                objQ2 = new b(context, a1Var2, a1Var, f1Var2);
                                sVar3.l0(objQ2);
                            }
                            b0.l("Retry", j, (kotlin.jvm.functions.a) objQ2, sVar3, 6);
                            androidx.compose.foundation.layout.b.e(sVar3, i1.q(oVar, f2));
                            long j4 = com.app.mlounge.ui.theme.b.m;
                            boolean zF = sVar3.f(aVar);
                            Object objQ3 = sVar3.Q();
                            if (zF || objQ3 == fVar2) {
                                objQ3 = new a(aVar, a1Var3, 1);
                                sVar3.l0(objQ3);
                            }
                            b0.l("Later", j4, (kotlin.jvm.functions.a) objQ3, sVar3, 6);
                            z = true;
                            sVar3.p(true);
                            sVar3.p(false);
                        } else {
                            sVar3.b0(-6967129);
                            androidx.compose.ui.r rVarE2 = i1.e(oVar, 1.0f);
                            androidx.compose.foundation.layout.f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.d, iVar, sVar3, 6);
                            int iHashCode3 = Long.hashCode(sVar3.T);
                            androidx.compose.runtime.internal.j jVarL3 = sVar3.l();
                            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar3, rVarE2);
                            sVar3.e0();
                            if (sVar3.S) {
                                sVar3.k(fVar);
                            } else {
                                sVar3.o0();
                            }
                            androidx.compose.runtime.t.x(sVar3, f1VarA2, eVar);
                            androidx.compose.runtime.t.x(sVar3, jVarL3, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar3, eVar3, sVar3, dVar);
                            androidx.compose.runtime.t.x(sVar3, rVarC3, eVar4);
                            long j5 = com.app.mlounge.ui.theme.b.m;
                            boolean zH2 = sVar3.h(context);
                            Object objQ4 = sVar3.Q();
                            if (zH2 || objQ4 == fVar2) {
                                objQ4 = new b(context, a1Var, f1Var2, a1Var2);
                                sVar3.l0(objQ4);
                            }
                            b0.l("Update Now", j5, (kotlin.jvm.functions.a) objQ4, sVar3, 6);
                            androidx.compose.foundation.layout.b.e(sVar3, i1.q(oVar, f2));
                            boolean zF2 = sVar3.f(aVar);
                            Object objQ5 = sVar3.Q();
                            if (zF2 || objQ5 == fVar2) {
                                objQ5 = new a(aVar, a1Var3, 2);
                                sVar3.l0(objQ5);
                            }
                            b0.l("Later", j5, (kotlin.jvm.functions.a) objQ5, sVar3, 6);
                            z = true;
                            sVar3.p(true);
                            sVar3.p(false);
                        }
                    }
                    sVar3.p(z);
                } else {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
