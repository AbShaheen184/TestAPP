package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import androidx.compose.animation.core.l0;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.a2;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.s4;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.x2;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.text.m0;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.MatchSource;
import com.app.mlounge.data.remote.model.SportsMatch;
import java.util.List;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ kotlin.d C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ q(IptvChannel iptvChannel, com.app.mlounge.data.iptv.n nVar, com.app.mlounge.data.iptv.n nVar2, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, int i) {
        this.e = 2;
        this.z = iptvChannel;
        this.A = nVar;
        this.y = nVar2;
        this.C = aVar;
        this.B = aVar2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.r rVar = (androidx.compose.ui.r) this.z;
                a1 a1Var = (a1) this.A;
                androidx.compose.runtime.internal.f fVar = (androidx.compose.runtime.internal.f) this.y;
                androidx.compose.foundation.text.contextmenu.provider.c cVar = (androidx.compose.foundation.text.contextmenu.provider.c) this.B;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.C;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objQ = sVar.Q();
                    if (objQ == androidx.compose.runtime.n.a) {
                        objQ = new m2(a1Var, 3);
                        sVar.l0(objQ);
                    }
                    androidx.compose.ui.r rVarL = a0.l(rVar, (kotlin.jvm.functions.l) objQ);
                    q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVarL);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar2);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.runtime.t.x(sVar, q0VarD, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                    fVar.invoke(sVar, 0);
                    cVar.b(aVar, sVar, 6);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return y.a;
            case 1:
                ((Integer) obj2).getClass();
                a2.b((kotlin.jvm.functions.p) this.z, (kotlin.jvm.functions.p) this.A, (androidx.compose.runtime.internal.f) this.y, (kotlin.jvm.functions.p) this.B, (kotlin.jvm.functions.p) this.C, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.livetv.a.a((IptvChannel) this.z, (com.app.mlounge.data.iptv.n) this.A, (com.app.mlounge.data.iptv.n) this.y, (kotlin.jvm.functions.a) this.C, (kotlin.jvm.functions.a) this.B, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            case 3:
                List<MatchSource> list = (List) this.z;
                com.app.mlounge.ui.viewmodel.a0 a0Var = (com.app.mlounge.ui.viewmodel.a0) this.y;
                SportsMatch sportsMatch = (SportsMatch) this.B;
                kotlin.jvm.functions.s sVar2 = (kotlin.jvm.functions.s) this.C;
                a1 a1Var2 = (a1) this.A;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean z = false;
                boolean z2 = true;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.g(6), androidx.compose.ui.c.J, sVar3, 6);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar3.l();
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar3, oVar);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(fVar3);
                    } else {
                        sVar3.o0();
                    }
                    androidx.compose.runtime.t.x(sVar3, wVarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar3, jVarL2, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar3, rVarC2, androidx.compose.ui.node.g.d);
                    sVar3.b0(-57647131);
                    for (MatchSource matchSource : list) {
                        String strB = matchSource.b();
                        if (strB == null && (strB = matchSource.a()) == null) {
                            strB = "Unknown";
                        }
                        String str = strB;
                        float f = 8;
                        androidx.compose.ui.r rVarA = androidx.compose.ui.draw.h.a(i1.e(oVar, 1.0f), androidx.compose.foundation.shape.e.a(f));
                        boolean zF = sVar3.f(matchSource) | sVar3.h(a0Var) | sVar3.h(sportsMatch) | sVar3.f(sVar2);
                        Object objQ2 = sVar3.Q();
                        if (zF || objQ2 == androidx.compose.runtime.n.a) {
                            com.app.mlounge.ui.screens.anime.b bVar = new com.app.mlounge.ui.screens.anime.b(matchSource, a0Var, sportsMatch, a1Var2, sVar2);
                            sVar3.l0(bVar);
                            objQ2 = bVar;
                        }
                        androidx.compose.runtime.s sVar4 = sVar3;
                        p5.a(androidx.compose.foundation.s.k(rVarA, z, null, (kotlin.jvm.functions.a) objQ2, 15), androidx.compose.foundation.shape.e.a(f), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(165322557, new com.app.mlounge.ui.components.r(str, 4), sVar3), sVar4, 12582912, 120);
                        z = false;
                        z2 = z2;
                        oVar = oVar;
                        sVar3 = sVar4;
                    }
                    androidx.compose.runtime.s sVar5 = sVar3;
                    sVar5.p(z);
                    sVar5.p(z2);
                } else {
                    sVar3.W();
                }
                return y.a;
            default:
                String str2 = (String) this.z;
                String str3 = (String) this.A;
                h1 h1Var = (h1) this.y;
                Context context = (Context) this.B;
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) this.C;
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar6.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    float f2 = 16;
                    androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar2, f2);
                    androidx.compose.foundation.layout.w wVarA2 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, sVar6, 48);
                    int iHashCode3 = Long.hashCode(sVar6.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar6.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar6, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(fVar4);
                    } else {
                        sVar6.o0();
                    }
                    androidx.compose.runtime.t.x(sVar6, wVarA2, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar6, jVarL3, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar6, Integer.valueOf(iHashCode3), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar6, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar6, rVarC3, androidx.compose.ui.node.g.d);
                    float f3 = 2;
                    s4.a(i1.m(oVar2, 20), com.app.mlounge.ui.theme.b.h, f3, 0L, 0, 0.0f, sVar6, 438, 56);
                    androidx.compose.foundation.layout.b.e(sVar6, i1.g(oVar2, 12));
                    x2 x2Var = n6.a;
                    m0 m0Var = ((m6) sVar6.j(x2Var)).k;
                    long j = com.app.mlounge.ui.theme.b.m;
                    z5.b("Waiting for authorization...", null, j, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, m0Var, sVar6, 390, 0, 130042);
                    androidx.compose.foundation.layout.b.e(sVar6, i1.g(oVar2, f2));
                    z5.b(str2, null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar6.j(x2Var)).d, sVar6, 1573248, 0, 131002);
                    androidx.compose.foundation.layout.b.e(sVar6, i1.g(oVar2, f2));
                    z5.b("Please visit the authorization page " + str3 + " and enter this code", null, j, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((m6) sVar6.j(x2Var)).l, sVar6, 384, 0, 130042);
                    androidx.compose.foundation.layout.b.e(sVar6, i1.g(oVar2, f2));
                    Object objQ3 = sVar6.Q();
                    androidx.compose.runtime.f fVar5 = androidx.compose.runtime.n.a;
                    if (objQ3 == fVar5) {
                        objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar6);
                    }
                    androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ3;
                    float f4 = 4;
                    androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(oVar2, f3, ((Boolean) _COROUTINE.a.B(kVar, sVar6, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f4));
                    boolean zH = sVar6.h(h1Var) | sVar6.f(str2) | sVar6.f(str3) | sVar6.h(context);
                    Object objQ4 = sVar6.Q();
                    if (zH || objQ4 == fVar5) {
                        l0 l0Var = new l0(h1Var, str2, str3, context, 7);
                        sVar6.l0(l0Var);
                        objQ4 = l0Var;
                    }
                    androidx.compose.material3.q.i((kotlin.jvm.functions.a) objQ4, rVarG, false, null, null, null, kVar, com.app.mlounge.ui.screens.services.a.d, sVar6, 905969664, 252);
                    androidx.compose.foundation.layout.b.e(sVar6, i1.g(oVar2, 8));
                    Object objQ5 = sVar6.Q();
                    if (objQ5 == fVar5) {
                        objQ5 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar6);
                    }
                    androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ5;
                    androidx.compose.material3.q.i(aVar2, androidx.compose.foundation.s.g(oVar2, f3, ((Boolean) _COROUTINE.a.B(kVar2, sVar6, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f4)), false, null, null, null, kVar2, com.app.mlounge.ui.screens.services.a.e, sVar6, 905969664, 252);
                    sVar6.p(true);
                } else {
                    sVar6.W();
                }
                return y.a;
        }
        return y.a;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, kotlin.jvm.functions.a aVar, int i) {
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.y = obj3;
        this.B = obj4;
        this.C = aVar;
    }

    public /* synthetic */ q(List list, com.app.mlounge.ui.viewmodel.a0 a0Var, SportsMatch sportsMatch, kotlin.jvm.functions.s sVar, a1 a1Var) {
        this.e = 3;
        this.z = list;
        this.y = a0Var;
        this.B = sportsMatch;
        this.C = sVar;
        this.A = a1Var;
    }

    public /* synthetic */ q(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.p pVar2, androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.p pVar3, kotlin.jvm.functions.p pVar4, int i) {
        this.e = 1;
        this.z = pVar;
        this.A = pVar2;
        this.y = fVar;
        this.B = pVar3;
        this.C = pVar4;
    }
}
