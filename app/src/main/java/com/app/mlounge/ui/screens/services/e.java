package com.app.mlounge.ui.screens.services;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
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
import com.app.mlounge.data.remote.debrid.RealDebridDeviceCodeResponse;
import com.app.mlounge.data.remote.debrid.RealDebridUserInfo;
import com.app.mlounge.ui.viewmodel.p0;
import kotlin.collections.q;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ kotlin.jvm.functions.a B;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ p0 y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ e(p0 p0Var, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3) {
        this.y = p0Var;
        this.z = aVar;
        this.A = aVar2;
        this.B = aVar3;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        e eVar;
        boolean z2;
        o oVar;
        int i;
        switch (this.e) {
            case 0:
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 16;
                    o oVar2 = o.b;
                    r rVarQ = androidx.compose.foundation.layout.b.q(oVar2, f);
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
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.f;
                    t.x(sVar, wVarA, eVar2);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.e;
                    t.x(sVar, jVarL, eVar3);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.g;
                    t.p(sVar, numValueOf, eVar4);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                    t.t(sVar, dVar);
                    androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.g.d;
                    t.x(sVar, rVarC, eVar5);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar, 48);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                    r rVarC2 = androidx.compose.ui.a.c(sVar, oVar2);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.o0();
                    }
                    t.x(sVar, f1VarA, eVar2);
                    t.x(sVar, jVarL2, eVar3);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar4, sVar, dVar);
                    t.x(sVar, rVarC2, eVar5);
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
                    t.x(sVar, wVarA2, eVar2);
                    t.x(sVar, jVarL3, eVar3);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar, eVar4, sVar, dVar);
                    t.x(sVar, rVarC3, eVar5);
                    x2 x2Var = n6.a;
                    boolean z3 = true;
                    z5.b("Real-Debrid", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).h, sVar, 390, 0, 131066);
                    z5.b("Premium multi-host service with torrent caching", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).l, sVar, 390, 0, 131066);
                    s sVar2 = sVar;
                    sVar2.p(true);
                    p0 p0Var = this.y;
                    boolean z4 = p0Var.a;
                    boolean z5 = p0Var.b;
                    RealDebridDeviceCodeResponse realDebridDeviceCodeResponse = p0Var.d;
                    RealDebridUserInfo realDebridUserInfo = p0Var.c;
                    n.l(z4, sVar2, 0);
                    sVar2.p(true);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar2, 12));
                    if (p0Var.a) {
                        sVar2.b0(-1275647050);
                        if (z5) {
                            sVar2.b0(-1275628636);
                            r rVarQ2 = androidx.compose.foundation.layout.b.q(i1.e(oVar2, 1.0f), f);
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
                            t.x(sVar2, q0VarD, eVar2);
                            t.x(sVar2, jVarL4, eVar3);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar2, eVar4, sVar2, dVar);
                            t.x(sVar2, rVarC4, eVar5);
                            i = 8;
                            s4.a(i1.m(oVar2, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar2, 54, 60);
                            sVar2.p(true);
                            sVar2.p(false);
                        } else {
                            i = 8;
                            if (realDebridUserInfo != null) {
                                sVar2.b0(-1275323100);
                                kotlin.collections.builders.b bVarG = q.g();
                                bVarG.add(new kotlin.k("Username", realDebridUserInfo.d()));
                                bVarG.add(new kotlin.k("Email", realDebridUserInfo.a()));
                                bVarG.add(new kotlin.k("Premium", realDebridUserInfo.c() > 0 ? "Yes" : "No"));
                                String strB = realDebridUserInfo.b();
                                if (strB != null) {
                                    bVarG.add(new kotlin.k("Expires", n.p(strB)));
                                }
                                n.a(q.c(bVarG), sVar2, 0);
                                sVar2.p(false);
                            } else {
                                sVar2.b0(-1274761876);
                                sVar2.p(false);
                            }
                        }
                        androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar2, i));
                        n.g(this.z, sVar2, 0);
                        sVar2.p(false);
                    } else {
                        if (!p0Var.e || realDebridDeviceCodeResponse == null) {
                            sVar2.b0(-1274247462);
                            if (p0Var.f != null) {
                                sVar2.b0(-1274188779);
                                z = z5;
                                oVar = oVar2;
                                z2 = false;
                                eVar = this;
                                z5.b(p0Var.f, androidx.compose.foundation.layout.b.u(oVar2, 0.0f, 0.0f, 0.0f, 8, 7), com.app.mlounge.ui.theme.b.o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar2, 432, 0, 131064);
                                sVar2 = sVar2;
                                sVar2.p(false);
                            } else {
                                z = z5;
                                eVar = this;
                                z2 = false;
                                oVar = oVar2;
                                sVar2.b0(-1274021844);
                                sVar2.p(false);
                            }
                            n.k("Sign In with Real-Debrid", z, eVar.B, sVar2, 6);
                            androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 8));
                            n.d("https://real-debrid.com/", sVar2, 6);
                            sVar2.p(z2);
                            z3 = true;
                        } else {
                            sVar2.b0(-1274561678);
                            n.e(realDebridDeviceCodeResponse.c(), realDebridDeviceCodeResponse.d(), this.A, sVar2, 0);
                            sVar2.p(false);
                        }
                        sVar2.p(z3);
                    }
                    sVar2.p(z3);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n.i(this.y, this.z, this.A, this.B, (s) obj, t.A(1));
                break;
        }
        return y.a;
    }

    public /* synthetic */ e(p0 p0Var, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, int i) {
        this.y = p0Var;
        this.z = aVar;
        this.A = aVar2;
        this.B = aVar3;
    }
}
