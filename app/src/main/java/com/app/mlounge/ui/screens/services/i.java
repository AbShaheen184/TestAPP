package com.app.mlounge.ui.screens.services;

import android.content.Context;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.z0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.s4;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x2;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.compose.ui.text.m0;
import com.app.mlounge.data.remote.debrid.AllDebridPinData;
import com.app.mlounge.data.remote.debrid.AllDebridUserInfo;
import kotlin.collections.q;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ kotlin.jvm.functions.a B;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ com.app.mlounge.ui.viewmodel.d y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ i(com.app.mlounge.ui.viewmodel.d dVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3) {
        this.y = dVar;
        this.z = aVar;
        this.A = aVar2;
        this.B = aVar3;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        o oVar;
        i iVar;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        o oVar2;
        int i;
        switch (this.e) {
            case 0:
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 16;
                    o oVar3 = o.b;
                    r rVarQ = androidx.compose.foundation.layout.b.q(oVar3, f);
                    androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                    androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                    w wVarA = u.a(cVar, hVar, sVar, 0);
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
                    t.x(sVar, wVarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                    t.x(sVar, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                    t.p(sVar, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                    t.t(sVar, dVar);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                    t.x(sVar, rVarC, eVar4);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar, 48);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                    r rVarC2 = androidx.compose.ui.a.c(sVar, oVar3);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.o0();
                    }
                    t.x(sVar, f1VarA, eVar);
                    t.x(sVar, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar);
                    t.x(sVar, rVarC2, eVar4);
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    t0 t0Var = new t0(1.0f, true);
                    w wVarA2 = u.a(cVar, hVar, sVar, 0);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar.l();
                    r rVarC3 = androidx.compose.ui.a.c(sVar, t0Var);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.o0();
                    }
                    t.x(sVar, wVarA2, eVar);
                    t.x(sVar, jVarL3, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar, eVar3, sVar, dVar);
                    t.x(sVar, rVarC3, eVar4);
                    x2 x2Var = n6.a;
                    z5.b("AllDebrid", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).h, sVar, 390, 0, 131066);
                    m0 m0Var = ((m6) sVar.j(x2Var)).l;
                    long j2 = com.app.mlounge.ui.theme.b.m;
                    z5.b("Premium link host and torrent downloader", null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 390, 0, 131066);
                    s sVar2 = sVar;
                    sVar2.p(true);
                    com.app.mlounge.ui.viewmodel.d dVar2 = this.y;
                    boolean z4 = dVar2.a;
                    boolean z5 = dVar2.b;
                    AllDebridPinData allDebridPinData = dVar2.d;
                    AllDebridUserInfo allDebridUserInfo = dVar2.c;
                    n.l(z4, sVar2, 0);
                    sVar2.p(true);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar3, 12));
                    if (dVar2.a) {
                        sVar2.b0(101751125);
                        if (z5) {
                            sVar2.b0(101735470);
                            r rVarQ2 = androidx.compose.foundation.layout.b.q(i1.e(oVar3, 1.0f), f);
                            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                            int iHashCode4 = Long.hashCode(sVar2.T);
                            androidx.compose.runtime.internal.j jVarL4 = sVar2.l();
                            r rVarC4 = androidx.compose.ui.a.c(sVar2, rVarQ2);
                            sVar2.e0();
                            if (sVar2.S) {
                                sVar2.k(fVar);
                            } else {
                                sVar2.o0();
                            }
                            t.x(sVar2, q0VarD, eVar);
                            t.x(sVar2, jVarL4, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar2, eVar3, sVar2, dVar);
                            t.x(sVar2, rVarC4, eVar4);
                            j = j2;
                            i = 8;
                            oVar2 = oVar3;
                            z3 = false;
                            s4.a(i1.m(oVar3, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar2, 54, 60);
                            sVar2.p(true);
                            sVar2.p(false);
                        } else {
                            z3 = false;
                            j = j2;
                            oVar2 = oVar3;
                            i = 8;
                            if (allDebridUserInfo != null) {
                                sVar2.b0(102035643);
                                kotlin.collections.builders.b bVarG = q.g();
                                bVarG.add(new kotlin.k("Username", allDebridUserInfo.b()));
                                bVarG.add(new kotlin.k("Email", allDebridUserInfo.a()));
                                bVarG.add(new kotlin.k("Premium", allDebridUserInfo.c() ? "Yes" : "No"));
                                n.a(q.c(bVarG), sVar2, 0);
                                sVar2.p(false);
                            } else {
                                sVar2.b0(102430614);
                                sVar2.p(false);
                            }
                        }
                        androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar2, i));
                        Context context = (Context) sVar2.j(androidx.compose.ui.platform.m0.b);
                        float f2 = 4;
                        o oVar4 = oVar2;
                        z5.b("NOTE: Comet provider may require you to confirm access at alldebrid.com/apikeys/", androidx.compose.foundation.layout.b.s(i1.e(oVar2, 1.0f), 0.0f, f2, 1), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar2, 438, 0, 131064);
                        sVar2 = sVar2;
                        androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar4, f2));
                        boolean zH = sVar2.h(context);
                        Object objQ = sVar2.Q();
                        if (zH || objQ == androidx.compose.runtime.n.a) {
                            objQ = new androidx.navigation.compose.o(context, 3);
                            sVar2.l0(objQ);
                        }
                        kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
                        float f3 = 0;
                        androidx.compose.material3.q.i(aVar, androidx.compose.foundation.layout.b.q(oVar4, f3), false, null, null, new z0(f3, f3, f3, f3), null, a.a, sVar2, 817889328, 380);
                        androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar4, f2));
                        n.g(this.z, sVar2, 0);
                        sVar2.p(false);
                    } else if (!dVar2.e || allDebridPinData == null) {
                        sVar2.b0(104161096);
                        if (dVar2.f != null) {
                            sVar2.b0(104219903);
                            z = z5;
                            oVar = oVar3;
                            z2 = false;
                            iVar = this;
                            z5.b(dVar2.f, androidx.compose.foundation.layout.b.u(oVar3, 0.0f, 0.0f, 0.0f, 8, 7), com.app.mlounge.ui.theme.b.o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar2, 432, 0, 131064);
                            sVar2 = sVar2;
                            sVar2.p(false);
                        } else {
                            oVar = oVar3;
                            iVar = this;
                            z = z5;
                            z2 = false;
                            sVar2.b0(104386838);
                            sVar2.p(false);
                        }
                        n.k("Sign In with AllDebrid", z, iVar.B, sVar2, 6);
                        androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 8));
                        n.d("https://alldebrid.com/", sVar2, 6);
                        sVar2.p(z2);
                    } else {
                        sVar2.b0(103880639);
                        n.e(allDebridPinData.b(), allDebridPinData.c(), this.A, sVar2, 0);
                        sVar2.p(false);
                    }
                    sVar2.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n.b(this.y, this.z, this.A, this.B, (s) obj, t.A(1));
                break;
        }
        return y.a;
    }

    public /* synthetic */ i(com.app.mlounge.ui.viewmodel.d dVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, int i) {
        this.y = dVar;
        this.z = aVar;
        this.A = aVar2;
        this.B = aVar3;
    }
}
