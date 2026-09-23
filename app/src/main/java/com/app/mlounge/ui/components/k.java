package com.app.mlounge.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.z5;
import androidx.compose.runtime.x2;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ k(Context context, kotlin.jvm.functions.l lVar, int i) {
        this.e = i;
        this.y = context;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 16;
                    p5.a(androidx.compose.foundation.layout.b.q(i1.e(androidx.compose.ui.o.b, 0.9f), f), androidx.compose.foundation.shape.e.a(f), com.app.mlounge.ui.theme.b.d, 0L, 8, 0.0f, androidx.compose.runtime.internal.k.c(2140634710, new k(this.y, this.z, 1), sVar), sVar, 12607878, Token.ASSIGN_LOGICAL_AND);
                } else {
                    sVar.W();
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f2 = 24;
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.s.q(androidx.compose.foundation.layout.b.q(oVar, f2), androidx.compose.foundation.s.p(sVar2), true);
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
                    androidx.compose.runtime.t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                    x2 x2Var = n6.a;
                    z5.b("Help Keep CinemaHQ Free", null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.k.C, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).g, sVar2, 1573254, 0, 129978);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 16));
                    androidx.compose.ui.text.m0 m0Var = ((m6) sVar2.j(x2Var)).k;
                    long j = com.app.mlounge.ui.theme.b.m;
                    z5.b("Cinema HQ uses a small portion of your device's spare resources (such as a bit of network bandwidth) to help fund development and keep the app free. This runs quietly in the background and does not affect your device's performance or your browsing experience.", null, j, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), coil3.svg.internal.a.x(20), 0, false, 0, 0, m0Var, sVar2, 384, 48, 127994);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 12));
                    z5.b("No personal data is collected. You can opt out at any time from Settings.", null, j, 0L, androidx.compose.ui.text.font.k.A, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar2, 1573254, 0, 129978);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 8));
                    androidx.compose.ui.text.m0 m0VarA = androidx.compose.ui.text.m0.a(((m6) sVar2.j(x2Var)).l, 0L, 0L, null, null, 0L, 0L, null, 16773119);
                    long j2 = com.app.mlounge.ui.theme.b.f;
                    Context context = this.y;
                    boolean zH = sVar2.h(context);
                    Object objQ = sVar2.Q();
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                    if (zH || objQ == fVar2) {
                        objQ = new androidx.navigation.compose.o(context, 2);
                        sVar2.l0(objQ);
                    }
                    z5.b("Privacy Policy", androidx.compose.foundation.s.k(oVar, false, null, (kotlin.jvm.functions.a) objQ, 15), j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0VarA, sVar2, 390, 0, 131064);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, f2));
                    boolean zH2 = sVar2.h(context);
                    kotlin.jvm.functions.l lVar = this.z;
                    boolean zF = zH2 | sVar2.f(lVar);
                    Object objQ2 = sVar2.Q();
                    if (zF || objQ2 == fVar2) {
                        objQ2 = new androidx.activity.compose.f(28, context, lVar);
                        sVar2.l0(objQ2);
                    }
                    b0.g((kotlin.jvm.functions.a) objQ2, sVar2, 54);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 10));
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
