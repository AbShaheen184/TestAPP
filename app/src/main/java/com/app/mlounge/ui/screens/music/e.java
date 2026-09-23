package com.app.mlounge.ui.screens.music;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.q1;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x2;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.compose.ui.text.m0;
import androidx.work.impl.v;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.ui.components.b0;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ MusicTrack y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ e(MusicTrack musicTrack, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        this.y = musicTrack;
        this.z = aVar;
        this.A = aVar2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 12;
                    o oVar = o.b;
                    r rVarQ = androidx.compose.foundation.layout.b.q(oVar, f);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    r rVarC = androidx.compose.ui.a.c(sVar, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                    t.x(sVar, f1VarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                    t.x(sVar, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                    t.p(sVar, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                    t.t(sVar, dVar);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                    t.x(sVar, rVarC, eVar4);
                    q1.b(v.x(), null, i1.m(oVar, 24), com.app.mlounge.ui.theme.b.f, sVar, 3504, 0);
                    androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar, f));
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    t0 t0Var = new t0(1.0f, true);
                    w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                    r rVarC2 = androidx.compose.ui.a.c(sVar, t0Var);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.o0();
                    }
                    t.x(sVar, wVarA, eVar);
                    t.x(sVar, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar);
                    t.x(sVar, rVarC2, eVar4);
                    MusicTrack musicTrack = this.y;
                    String strG = musicTrack.g();
                    x2 x2Var = n6.a;
                    z5.b(strG, null, androidx.compose.ui.graphics.t.d, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((m6) sVar.j(x2Var)).k, sVar, 384, 24960, 110586);
                    String strB = musicTrack.b();
                    m0 m0Var = ((m6) sVar.j(x2Var)).l;
                    long j = com.app.mlounge.ui.theme.b.m;
                    z5.b(strB, null, j, 0L, null, 0L, null, 0L, 2, false, 1, 0, m0Var, sVar, 384, 24960, 110586);
                    s sVar2 = sVar;
                    sVar2.p(true);
                    String strC = musicTrack.c();
                    if (strC == null) {
                        sVar2.b0(872913045);
                        sVar2.p(false);
                    } else {
                        sVar2.b0(872913046);
                        z5.b(strC, androidx.compose.foundation.layout.b.s(oVar, 8, 0.0f, 2), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar2, 432, 0, 131064);
                        sVar2 = sVar2;
                        sVar2.p(false);
                    }
                    f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.g(16), androidx.compose.ui.c.G, sVar2, 6);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar2.l();
                    r rVarC3 = androidx.compose.ui.a.c(sVar2, oVar);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar);
                    } else {
                        sVar2.o0();
                    }
                    t.x(sVar2, f1VarA2, eVar);
                    t.x(sVar2, jVarL3, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar2, eVar3, sVar2, dVar);
                    t.x(sVar2, rVarC3, eVar4);
                    b0.m(this.z, null, false, b.b, sVar2, 3072);
                    b0.m(this.A, null, false, b.c, sVar2, 3072);
                    sVar2.p(true);
                    sVar2.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b.d(this.y, this.z, this.A, (s) obj, t.A(1));
                break;
        }
        return y.a;
    }

    public /* synthetic */ e(MusicTrack musicTrack, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, int i) {
        this.y = musicTrack;
        this.z = aVar;
        this.A = aVar2;
    }
}
