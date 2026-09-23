package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements kotlin.jvm.functions.q {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;

    public /* synthetic */ c0(int i, kotlin.jvm.functions.a aVar) {
        this.e = i;
        this.y = aVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.foundation.interaction.k kVar;
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                sVar.b0(-756081143);
                e1 e1Var = (e1) sVar.j(b1.a);
                if (e1Var != null) {
                    sVar.b0(-1604682242);
                    sVar.p(false);
                    kVar = null;
                } else {
                    sVar.b0(-1604549624);
                    Object objQ = sVar.Q();
                    if (objQ == androidx.compose.runtime.n.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    kVar = (androidx.compose.foundation.interaction.k) objQ;
                    sVar.p(false);
                }
                androidx.compose.ui.r rVarI = s.i(androidx.compose.ui.o.b, kVar, e1Var, true, null, this.y);
                sVar.p(false);
                return rVarI;
            case 1:
                androidx.compose.ui.layout.s0 s0Var = (androidx.compose.ui.layout.s0) obj;
                androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) obj2;
                androidx.compose.ui.unit.a aVar = (androidx.compose.ui.unit.a) obj3;
                float f = ((androidx.compose.ui.unit.f) this.y.invoke()).e;
                androidx.compose.ui.layout.d1 d1VarF = p0Var.F(androidx.compose.ui.unit.a.a(aVar.a, 0, 0, androidx.compose.ui.unit.b.f(!androidx.compose.ui.unit.f.d(f, Float.NaN) ? s0Var.i0(f) : 0, aVar.a), 0, 11));
                return s0Var.q(d1VarF.e, d1VarF.y, kotlin.collections.x.e, new androidx.compose.foundation.layout.j(d1VarF, 10));
            case 2:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objQ2 = sVar2.Q();
                    if (objQ2 == androidx.compose.runtime.n.a) {
                        objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
                    }
                    androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ2;
                    androidx.compose.runtime.a1 a1VarB = _COROUTINE.a.B(kVar2, sVar2, 6);
                    float f2 = 8;
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, f2);
                    androidx.compose.foundation.shape.d dVar = androidx.compose.foundation.shape.e.a;
                    androidx.compose.material3.q.e(this.y, s.g(androidx.compose.ui.draw.h.a(rVarQ, dVar), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, dVar), false, null, kVar2, null, com.app.mlounge.ui.screens.anime.m.a, sVar2, 1597440, 44);
                    androidx.compose.foundation.layout.b.e(sVar2, androidx.compose.foundation.layout.i1.g(oVar, f2));
                } else {
                    sVar2.W();
                }
                return kotlin.y.a;
            case 3:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    com.app.mlounge.ui.screens.player.k0.e("Settings", this.y, sVar3, 6);
                    androidx.compose.material3.q.d(androidx.compose.foundation.layout.b.s(androidx.compose.ui.o.b, 0.0f, 8, 1), 0.0f, androidx.compose.ui.graphics.t.b(0.1f, androidx.compose.ui.graphics.t.d), sVar3, 390, 2);
                } else {
                    sVar3.W();
                }
                return kotlin.y.a;
            default:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Object objQ3 = sVar4.Q();
                    if (objQ3 == androidx.compose.runtime.n.a) {
                        objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar4);
                    }
                    androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ3;
                    androidx.compose.runtime.a1 a1VarB2 = _COROUTINE.a.B(kVar3, sVar4, 6);
                    float f3 = 8;
                    androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ2 = androidx.compose.foundation.layout.b.q(oVar2, f3);
                    androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
                    androidx.compose.material3.q.e(this.y, s.g(androidx.compose.ui.draw.h.a(rVarQ2, dVar2), 2, ((Boolean) a1VarB2.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, dVar2), false, null, kVar3, null, com.app.mlounge.ui.screens.tvshows.a.a, sVar4, 1597440, 44);
                    androidx.compose.foundation.layout.b.e(sVar4, androidx.compose.foundation.layout.i1.g(oVar2, f3));
                } else {
                    sVar4.W();
                }
                return kotlin.y.a;
        }
    }
}
