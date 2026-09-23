package com.app.mlounge.ui;

import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.s4;
import androidx.compose.material3.z5;
import androidx.compose.runtime.x2;
import androidx.compose.ui.text.m0;
import com.app.mlounge.ui.screens.player.k0;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ f(String str, kotlin.jvm.functions.a aVar, int i) {
        this.e = i;
        this.y = str;
        this.z = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p5.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.b, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1937432935, new f(this.y, this.z, 2), sVar), sVar, 12582912, Token.DOT);
                } else {
                    sVar.W();
                }
                return kotlin.y.a;
            case 1:
                ((Integer) obj2).getClass();
                f0.d(this.y, this.z, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(49));
                break;
            case 2:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
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
                    androidx.compose.runtime.t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                    s4.a(null, com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar2, 0, 61);
                    float f = 16;
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, f));
                    x2 x2Var = n6.a;
                    m0 m0Var = ((m6) sVar2.j(x2Var)).h;
                    long j = androidx.compose.ui.graphics.t.d;
                    z5.b("One-Click Play", null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 390, 0, 131066);
                    z5.b(this.y, null, androidx.compose.ui.graphics.t.b(0.7f, j), 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar2, 384, 0, 130042);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, f));
                    androidx.compose.material3.q.i(this.z, null, false, null, null, null, null, a.e, sVar2, 805306368, 510);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return kotlin.y.a;
            default:
                ((Integer) obj2).getClass();
                k0.e(this.y, this.z, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(7));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ f(String str, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.e = i2;
        this.y = str;
        this.z = aVar;
    }
}
