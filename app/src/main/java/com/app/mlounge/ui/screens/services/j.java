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
import com.app.mlounge.data.remote.debrid.PremiumizeUserInfo;
import com.app.mlounge.ui.viewmodel.m0;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.collections.q;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ m0 y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ j(m0 m0Var, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.l lVar) {
        this.y = m0Var;
        this.A = aVar;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        j jVar;
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
                    r rVarC2 = androidx.compose.ui.a.c(sVar, oVar2);
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
                    boolean z3 = true;
                    z5.b("Premiumize", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).h, sVar, 390, 0, 131066);
                    z5.b("Premium multi-host service with cloud storage", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).l, sVar, 390, 0, 131066);
                    s sVar2 = sVar;
                    sVar2.p(true);
                    m0 m0Var = this.y;
                    boolean z4 = m0Var.a;
                    boolean z5 = m0Var.b;
                    PremiumizeUserInfo premiumizeUserInfo = m0Var.c;
                    n.l(z4, sVar2, 0);
                    sVar2.p(true);
                    androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar2, 12));
                    if (m0Var.a) {
                        sVar2.b0(1641604234);
                        if (z5) {
                            sVar2.b0(1641615487);
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
                            t.x(sVar2, q0VarD, eVar);
                            t.x(sVar2, jVarL4, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar2, eVar3, sVar2, dVar);
                            t.x(sVar2, rVarC4, eVar4);
                            i = 8;
                            s4.a(i1.m(oVar2, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar2, 54, 60);
                            sVar2.p(true);
                            sVar2.p(false);
                        } else {
                            i = 8;
                            if (premiumizeUserInfo != null) {
                                sVar2.b0(1641909336);
                                kotlin.collections.builders.b bVarG = q.g();
                                String strA = premiumizeUserInfo.a();
                                String str = "Unknown";
                                if (strA == null) {
                                    strA = "Unknown";
                                }
                                bVarG.add(new kotlin.k("Customer ID", strA));
                                bVarG.add(new kotlin.k("Status", premiumizeUserInfo.d() ? "Premium" : "Free"));
                                Long lC = premiumizeUserInfo.c();
                                if (lC != null) {
                                    try {
                                        String str2 = new SimpleDateFormat("MMM dd, yyyy", Locale.US).format(new Date(lC.longValue() * ((long) 1000)));
                                        str2.getClass();
                                        str = str2;
                                    } catch (Exception unused) {
                                    }
                                    bVarG.add(new kotlin.k("Expires", str));
                                }
                                Double dB = premiumizeUserInfo.b();
                                if (dB != null) {
                                    bVarG.add(new kotlin.k("Fair Use", String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dB.doubleValue() * ((double) 100))}, 1)).concat("%")));
                                }
                                n.a(q.c(bVarG), sVar2, 0);
                                sVar2.p(false);
                            } else {
                                sVar2.b0(1642584919);
                                sVar2.p(false);
                            }
                        }
                        androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar2, i));
                        n.g(this.A, sVar2, 0);
                        sVar2.p(false);
                    } else {
                        sVar2.b0(1642715925);
                        if (m0Var.d != null) {
                            sVar2.b0(1642768036);
                            z = z5;
                            oVar = oVar2;
                            z2 = false;
                            jVar = this;
                            z5.b(m0Var.d, androidx.compose.foundation.layout.b.u(oVar2, 0.0f, 0.0f, 0.0f, 8, 7), com.app.mlounge.ui.theme.b.o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar2, 432, 0, 131064);
                            sVar2 = sVar2;
                            sVar2.p(false);
                        } else {
                            z = z5;
                            jVar = this;
                            z2 = false;
                            oVar = oVar2;
                            sVar2.b0(1642927159);
                            sVar2.p(false);
                        }
                        n.c("Premiumize API Key", z, jVar.z, sVar2, 6);
                        androidx.compose.foundation.layout.b.e(sVar2, i1.g(oVar, 8));
                        n.d("https://www.premiumize.me/", sVar2, 6);
                        sVar2.p(z2);
                        z3 = true;
                    }
                    sVar2.p(z3);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n.h(this.y, this.z, this.A, (s) obj, t.A(1));
                break;
        }
        return y.a;
    }

    public /* synthetic */ j(m0 m0Var, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, int i) {
        this.y = m0Var;
        this.z = lVar;
        this.A = aVar;
    }
}
