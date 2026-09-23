package com.app.mlounge.ui.screens.settings;

import androidx.compose.animation.core.i0;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.z0;
import androidx.compose.material3.k1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.q0;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.material3.z4;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.text.m0;
import com.app.mlounge.ui.viewmodel.p1;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.q {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ w2 D;
    public final /* synthetic */ w2 E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int e;
    public final /* synthetic */ a1 y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, Object obj4, int i) {
        this.e = i;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.y = a1Var;
        this.z = a1Var2;
        this.D = a1Var3;
        this.E = a1Var4;
        this.F = obj4;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.runtime.s sVar;
        int i;
        float f;
        androidx.compose.runtime.s sVar2;
        a1 a1Var;
        int i2;
        Object oVar;
        a1 a1Var2;
        String str;
        int i3;
        a1 a1Var3;
        int i4 = this.e;
        kotlin.y yVar = kotlin.y.a;
        int i5 = 8;
        androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
        Object obj4 = this.F;
        w2 w2Var = this.E;
        w2 w2Var2 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.B;
        Object obj7 = this.A;
        switch (i4) {
            case 0:
                String str2 = (String) obj7;
                List list = (List) obj6;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj5;
                a1 a1Var4 = (a1) w2Var2;
                a1 a1Var5 = (a1) w2Var;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) obj4;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (!sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sVar3.W();
                    return yVar;
                }
                androidx.compose.foundation.layout.e0 e0Var = i1.c;
                androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar3, 0);
                int iHashCode = Long.hashCode(sVar3.T);
                androidx.compose.runtime.internal.j jVarL = sVar3.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, e0Var);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(fVar2);
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
                androidx.compose.runtime.t.x(sVar3, rVarC, eVar4);
                androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                a1 a1Var6 = a1Var4;
                float f2 = 16;
                androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(i1.e(oVar2, 1.0f), f2);
                f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.e, iVar, sVar3, 54);
                int iHashCode2 = Long.hashCode(sVar3.T);
                androidx.compose.runtime.internal.j jVarL2 = sVar3.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar3, rVarQ);
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(fVar2);
                } else {
                    sVar3.o0();
                }
                androidx.compose.runtime.t.x(sVar3, f1VarA, eVar);
                androidx.compose.runtime.t.x(sVar3, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar3, eVar3, sVar3, dVar);
                androidx.compose.runtime.t.x(sVar3, rVarC2, eVar4);
                m0 m0Var = ((m6) sVar3.j(n6.a)).g;
                long j = androidx.compose.ui.graphics.t.d;
                z5.b("Select Folder", null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar3, 390, 0, 131066);
                f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.a, iVar, sVar3, 48);
                int iHashCode3 = Long.hashCode(sVar3.T);
                androidx.compose.runtime.internal.j jVarL3 = sVar3.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar3, oVar2);
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(fVar2);
                } else {
                    sVar3.o0();
                }
                androidx.compose.runtime.t.x(sVar3, f1VarA2, eVar);
                androidx.compose.runtime.t.x(sVar3, jVarL3, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar3, eVar3, sVar3, dVar);
                androidx.compose.runtime.t.x(sVar3, rVarC3, eVar4);
                Object objQ = sVar3.Q();
                if (objQ == fVar) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar3);
                }
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                a1 a1VarB = _COROUTINE.a.B(kVar, sVar3, 6);
                Object objQ2 = sVar3.Q();
                if (objQ2 == fVar) {
                    objQ2 = new androidx.compose.foundation.lazy.m(this.y, 28);
                    sVar3.l0(objQ2);
                }
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ2;
                float f3 = 2;
                long j2 = ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
                androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
                float f4 = 50;
                androidx.compose.foundation.shape.c cVar = new androidx.compose.foundation.shape.c(f4);
                androidx.compose.material3.q.e(aVar2, androidx.compose.foundation.s.g(oVar2, f3, j2, new androidx.compose.foundation.shape.d(cVar, cVar, cVar, cVar)), false, null, kVar, null, b.o, sVar3, 1597446, 44);
                Object objQ3 = sVar3.Q();
                if (objQ3 == fVar) {
                    objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar3);
                }
                androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ3;
                long j3 = ((Boolean) _COROUTINE.a.B(kVar2, sVar3, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
                androidx.compose.foundation.shape.c cVar2 = new androidx.compose.foundation.shape.c(f4);
                androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.g(oVar2, f3, j3, new androidx.compose.foundation.shape.d(cVar2, cVar2, cVar2, cVar2)), false, null, kVar2, null, b.p, sVar3, 1597440, 44);
                sVar3.p(true);
                sVar3.p(true);
                a1 a1Var7 = this.z;
                String absolutePath = ((File) a1Var7.getValue()).getAbsolutePath();
                absolutePath.getClass();
                z5.b(absolutePath, androidx.compose.foundation.layout.b.s(oVar2, f2, 0.0f, 2), com.app.mlounge.ui.theme.b.f, coil3.svg.internal.a.x(13), null, 0L, null, 0L, 0, false, 2, 0, null, sVar3, 24624, 24576, 245736);
                if (kotlin.text.k.J(str2)) {
                    sVar = sVar3;
                    sVar.b0(-135732308);
                    sVar.p(false);
                } else {
                    sVar3.b0(-135996180);
                    z5.b(str2, androidx.compose.foundation.layout.b.r(oVar2, f2, f3), androidx.compose.ui.graphics.t.b(0.5f, j), coil3.svg.internal.a.x(11), null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 25008, 0, 262120);
                    sVar = sVar3;
                    sVar.p(false);
                }
                if (list.size() > 1) {
                    sVar.b0(-135575324);
                    androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(oVar2, f2, 4);
                    float f5 = 8;
                    f1 f1VarA3 = d1.a(androidx.compose.foundation.layout.h.g(f5), androidx.compose.ui.c.G, sVar, 6);
                    int iHashCode4 = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL4 = sVar.l();
                    androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar, rVarR);
                    sVar.e0();
                    a1 a1Var8 = a1Var7;
                    if (sVar.S) {
                        sVar.k(fVar2);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.runtime.t.x(sVar, f1VarA3, eVar);
                    androidx.compose.runtime.t.x(sVar, jVarL4, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar, eVar3, sVar, dVar);
                    androidx.compose.runtime.t.x(sVar, rVarC4, eVar4);
                    sVar.b0(1011322915);
                    Iterator it = list.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            kotlin.collections.q.o();
                            throw null;
                        }
                        kotlin.k kVar3 = (kotlin.k) next;
                        File file = (File) kVar3.e;
                        String str3 = (String) kVar3.y;
                        Object objQ4 = sVar.Q();
                        if (objQ4 == fVar) {
                            objQ4 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                        }
                        androidx.compose.foundation.interaction.k kVar4 = (androidx.compose.foundation.interaction.k) objQ4;
                        a1 a1VarB2 = _COROUTINE.a.B(kVar4, sVar, 6);
                        String absolutePath2 = ((File) a1Var8.getValue()).getAbsolutePath();
                        absolutePath2.getClass();
                        String absolutePath3 = file.getAbsolutePath();
                        absolutePath3.getClass();
                        boolean zU = kotlin.text.r.u(absolutePath2, absolutePath3, false);
                        androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(oVar2, f3, ((Boolean) a1VarB2.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f5));
                        float f6 = k1.a;
                        long j4 = androidx.compose.ui.graphics.t.h;
                        long j5 = com.app.mlounge.ui.theme.b.f;
                        long jB = androidx.compose.ui.graphics.t.b(0.2f, j5);
                        long j6 = androidx.compose.ui.graphics.t.d;
                        long j7 = androidx.compose.ui.graphics.t.i;
                        t0 t0Var = (t0) sVar.j(u0.a);
                        Iterator it2 = it;
                        z4 z4Var = t0Var.a0;
                        if (z4Var == null) {
                            long j8 = androidx.compose.ui.graphics.t.h;
                            z4Var = new z4(j8, u0.c(t0Var, androidx.compose.material3.tokens.l.t), u0.c(t0Var, androidx.compose.material3.tokens.l.x), u0.c(t0Var, androidx.compose.material3.tokens.l.B), j8, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.l.d, u0.c(t0Var, androidx.compose.material3.tokens.l.c)), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.l.v, u0.c(t0Var, androidx.compose.material3.tokens.l.u)), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.l.z, u0.c(t0Var, androidx.compose.material3.tokens.l.y)), u0.c(t0Var, androidx.compose.material3.tokens.l.k), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.l.h, u0.c(t0Var, androidx.compose.material3.tokens.l.g)), u0.c(t0Var, androidx.compose.material3.tokens.l.s), u0.c(t0Var, androidx.compose.material3.tokens.l.w), u0.c(t0Var, androidx.compose.material3.tokens.l.A));
                            t0Var.a0 = z4Var;
                        }
                        z4 z4Var2 = new z4(j4 != 16 ? j4 : z4Var.a, j6 != r3 ? j6 : z4Var.b, j7 != r3 ? j7 : z4Var.c, r3 != 0 ? j7 : z4Var.d, r3 != 0 ? j7 : z4Var.e, r3 != 0 ? j7 : z4Var.f, r3 != 0 ? j7 : z4Var.g, r3 != 0 ? j7 : z4Var.h, jB != r3 ? jB : z4Var.i, r3 != 0 ? j7 : z4Var.j, j5 != 16 ? j5 : z4Var.k, r3 != 0 ? j7 : z4Var.l, j7 != r3 ? j7 : z4Var.m);
                        boolean zD = sVar.d(i6) | sVar.h(file) | sVar.f(str3);
                        Object objQ5 = sVar.Q();
                        if (zD || objQ5 == fVar) {
                            a1Var2 = a1Var8;
                            a1 a1Var9 = a1Var6;
                            str = str3;
                            i3 = 13;
                            oVar = new o(i6, file, str, a1Var2, a1Var9);
                            a1Var3 = a1Var9;
                            sVar.l0(oVar);
                        } else {
                            oVar = objQ5;
                            a1Var2 = a1Var8;
                            a1Var3 = a1Var6;
                            str = str3;
                            i3 = 13;
                        }
                        androidx.compose.runtime.s sVar4 = sVar;
                        q0.b(zU, (kotlin.jvm.functions.a) oVar, androidx.compose.runtime.internal.k.c(1790140496, new com.app.mlounge.ui.components.r(str, i3), sVar), rVarG, false, null, z4Var2, null, null, kVar4, sVar4, 384);
                        f5 = f5;
                        a1Var8 = a1Var2;
                        i6 = i7;
                        sVar = sVar4;
                        a1Var6 = a1Var3;
                        it = it2;
                    }
                    sVar2 = sVar;
                    a1Var = a1Var8;
                    i = 4;
                    f = 0.0f;
                    i2 = 1;
                    androidx.room.b0.g(sVar2, false, true, false);
                } else {
                    i = 4;
                    f = 0.0f;
                    sVar2 = sVar;
                    a1Var = a1Var7;
                    i2 = 1;
                    sVar2.b0(-133691764);
                    sVar2.p(false);
                }
                long j9 = androidx.compose.ui.graphics.t.d;
                androidx.compose.runtime.s sVar5 = sVar2;
                androidx.compose.material3.q.d(androidx.compose.foundation.layout.b.s(oVar2, f, i, i2), 0.0f, androidx.compose.ui.graphics.t.b(0.1f, j9), sVar5, 390, 2);
                if (1.0f <= 0.0d) {
                    androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                }
                androidx.compose.ui.r rVarE = i1.e(new androidx.compose.foundation.layout.t0(1.0f, true), 1.0f);
                float f7 = 8;
                z0 z0VarB = androidx.compose.foundation.layout.b.b(2, f7);
                boolean zH = sVar5.h(list);
                Object objQ6 = sVar5.Q();
                if (zH || objQ6 == fVar) {
                    objQ6 = new androidx.compose.animation.core.a(22, list, a1Var, a1Var5);
                    sVar5.l0(objQ6);
                }
                android.support.v4.media.session.b.c(rVarE, null, z0VarB, null, null, null, false, null, (kotlin.jvm.functions.l) objQ6, sVar5, 384, 506);
                androidx.compose.material3.q.d(null, 0.0f, androidx.compose.ui.graphics.t.b(0.1f, j9), sVar5, 384, 3);
                androidx.compose.ui.r rVarQ2 = androidx.compose.foundation.layout.b.q(i1.e(oVar2, 1.0f), 12);
                f1 f1VarA4 = d1.a(androidx.compose.foundation.layout.h.b, iVar, sVar5, 54);
                int iHashCode5 = Long.hashCode(sVar5.T);
                androidx.compose.runtime.internal.j jVarL5 = sVar5.l();
                androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(sVar5, rVarQ2);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                sVar5.e0();
                if (sVar5.S) {
                    sVar5.k(fVar3);
                } else {
                    sVar5.o0();
                }
                androidx.compose.runtime.t.x(sVar5, f1VarA4, androidx.compose.ui.node.g.f);
                androidx.compose.runtime.t.x(sVar5, jVarL5, androidx.compose.ui.node.g.e);
                androidx.compose.runtime.t.p(sVar5, Integer.valueOf(iHashCode5), androidx.compose.ui.node.g.g);
                androidx.compose.runtime.t.t(sVar5, androidx.compose.ui.node.g.h);
                androidx.compose.runtime.t.x(sVar5, rVarC5, androidx.compose.ui.node.g.d);
                Object objQ7 = sVar5.Q();
                if (objQ7 == fVar) {
                    objQ7 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar5);
                }
                androidx.compose.foundation.interaction.k kVar5 = (androidx.compose.foundation.interaction.k) objQ7;
                androidx.compose.material3.q.i(aVar, androidx.compose.foundation.s.g(oVar2, f3, ((Boolean) _COROUTINE.a.B(kVar5, sVar5, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f7)), false, null, null, null, kVar5, b.r, sVar5, 905969664, 252);
                androidx.compose.foundation.layout.b.e(sVar5, i1.q(oVar2, f7));
                Object objQ8 = sVar5.Q();
                if (objQ8 == fVar) {
                    objQ8 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar5);
                }
                androidx.compose.foundation.interaction.k kVar6 = (androidx.compose.foundation.interaction.k) objQ8;
                a1 a1VarB3 = _COROUTINE.a.B(kVar6, sVar5, 6);
                boolean zF = sVar5.f(lVar);
                Object objQ9 = sVar5.Q();
                if (zF || objQ9 == fVar) {
                    objQ9 = new com.app.mlounge.ui.screens.services.l(lVar, a1Var, 1);
                    sVar5.l0(objQ9);
                }
                androidx.compose.material3.q.i((kotlin.jvm.functions.a) objQ9, androidx.compose.foundation.s.g(oVar2, f3, ((Boolean) a1VarB3.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f7)), false, null, null, null, kVar6, b.s, sVar5, 905969664, 252);
                sVar5.p(true);
                sVar5.p(true);
                return yVar;
            default:
                w2 w2Var3 = (w2) obj7;
                p1 p1Var = (p1) obj6;
                w2 w2Var4 = (w2) obj5;
                w2 w2Var5 = (w2) obj4;
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.x) obj).getClass();
                if (sVar6.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String str4 = ((Boolean) w2Var4.getValue()).booleanValue() ? "Adult content section is enabled" : "Enable adult content section";
                    boolean zBooleanValue = ((Boolean) w2Var4.getValue()).booleanValue();
                    boolean zF2 = sVar6.f(w2Var3) | sVar6.h(p1Var);
                    Object objQ10 = sVar6.Q();
                    if (zF2 || objQ10 == fVar) {
                        i0 i0Var = new i0((Object) p1Var, (Object) w2Var3, this.y, this.z, 14);
                        sVar6.l0(i0Var);
                        objQ10 = i0Var;
                    }
                    e0.r("Adult Section", str4, zBooleanValue, (kotlin.jvm.functions.l) objQ10, _COROUTINE.b.v(), false, sVar6, 6, 32);
                    boolean z = ((Boolean) w2Var2.getValue()).booleanValue() && ((Boolean) w2Var4.getValue()).booleanValue();
                    boolean zH2 = sVar6.h(p1Var);
                    Object objQ11 = sVar6.Q();
                    if (zH2 || objQ11 == fVar) {
                        objQ11 = new u(p1Var, 7);
                        sVar6.l0(objQ11);
                    }
                    e0.r("Include Adult in Search", "Show adult content in TMDB search results", z, (kotlin.jvm.functions.l) objQ11, com.google.android.gms.dynamite.g.x(), ((Boolean) w2Var4.getValue()).booleanValue(), sVar6, 54, 0);
                    boolean z2 = ((Boolean) w2Var.getValue()).booleanValue() && ((Boolean) w2Var4.getValue()).booleanValue();
                    boolean zH3 = sVar6.h(p1Var);
                    Object objQ12 = sVar6.Q();
                    if (zH3 || objQ12 == fVar) {
                        objQ12 = new u(p1Var, i5);
                        sVar6.l0(objQ12);
                    }
                    kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ12;
                    androidx.compose.ui.graphics.vector.f fVarB = androidx.room.t.a;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.BookmarkBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i8 = h0.a;
                        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.v(17.0f, 3.0f);
                        gVar.t(7.0f, 3.0f);
                        gVar.n(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        gVar.t(5.0f, 21.0f);
                        gVar.u(7.0f, -3.0f);
                        gVar.u(7.0f, 3.0f);
                        gVar.t(19.0f, 5.0f);
                        gVar.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        gVar.l();
                        gVar.v(17.0f, 18.0f);
                        gVar.u(-5.0f, -2.18f);
                        gVar.t(7.0f, 18.0f);
                        gVar.t(7.0f, 5.0f);
                        gVar.s(10.0f);
                        gVar.A(13.0f);
                        gVar.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.b, 0, p0Var);
                        fVarB = eVar5.b();
                        androidx.room.t.a = fVarB;
                    }
                    e0.r("Include Adult in Favourites", "Show adult items in your favourites", z2, lVar2, fVarB, ((Boolean) w2Var4.getValue()).booleanValue(), sVar6, 54, 0);
                    boolean z3 = ((Boolean) w2Var5.getValue()).booleanValue() && ((Boolean) w2Var4.getValue()).booleanValue();
                    boolean zH4 = sVar6.h(p1Var);
                    Object objQ13 = sVar6.Q();
                    if (zH4 || objQ13 == fVar) {
                        objQ13 = new u(p1Var, 9);
                        sVar6.l0(objQ13);
                    }
                    e0.r("Include Adult in History", "Show adult items in your history", z3, (kotlin.jvm.functions.l) objQ13, coil3.svg.internal.a.u(), ((Boolean) w2Var4.getValue()).booleanValue(), sVar6, 54, 0);
                } else {
                    sVar6.W();
                }
                return yVar;
        }
    }
}
