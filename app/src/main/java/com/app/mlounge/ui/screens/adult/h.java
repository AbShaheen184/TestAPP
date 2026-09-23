package com.app.mlounge.ui.screens.adult;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.g1;
import androidx.compose.foundation.layout.h0;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.text.input.internal.k;
import androidx.compose.foundation.text.u0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.t0;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.s2;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x2;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.compose.ui.text.m0;
import androidx.lifecycle.j;
import androidx.lifecycle.y0;
import androidx.work.impl.v;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.components.c0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.a0;
import kotlin.y;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.helper.n;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(false, 881045301, new c0(2));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(false, -730155723, new androidx.compose.foundation.contextmenu.b(10));

    public static final void a(final String str, final kotlin.jvm.functions.a aVar, final q qVar, final q qVar2, com.app.mlounge.ui.viewmodel.c cVar, s sVar, final int i) {
        com.app.mlounge.ui.viewmodel.c cVar2;
        int i2;
        com.app.mlounge.ui.viewmodel.c cVar3;
        int i3;
        char c;
        float f;
        boolean z;
        androidx.compose.ui.node.f fVar;
        boolean z2;
        i iVar;
        androidx.compose.ui.node.d dVar;
        androidx.compose.ui.node.f fVar2;
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.e eVar2;
        x2 x2Var;
        androidx.compose.ui.node.e eVar3;
        androidx.compose.ui.node.e eVar4;
        o oVar;
        i iVar2;
        int i4;
        boolean z3;
        s sVar2;
        s sVar3 = sVar;
        androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
        i iVar3 = androidx.compose.ui.c.G;
        aVar.getClass();
        qVar.getClass();
        qVar2.getClass();
        sVar3.c0(-2016688229);
        int i5 = i | (sVar3.f(str) ? 4 : 2) | (sVar3.h(aVar) ? 32 : 16) | (sVar3.h(qVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | 8192;
        if (sVar3.T(i5 & 1, (i5 & 9235) != 9234)) {
            sVar3.Y();
            if ((i & 1) == 0 || sVar3.C()) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar3);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    com.app.mlounge.ui.viewmodel.c cVar4 = (com.app.mlounge.ui.viewmodel.c) _COROUTINE.b.J(a0.a(com.app.mlounge.ui.viewmodel.c.class), y0VarA, n.n(y0VarA, sVar3), y0VarA instanceof j ? ((j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar3);
                    i2 = i5 & (-57345);
                    cVar3 = cVar4;
                }
            } else {
                sVar3.W();
                i2 = i5 & (-57345);
                cVar3 = cVar;
            }
            sVar3.q();
            a1 a1VarG = t.g(cVar3.t, sVar3);
            a1 a1VarG2 = t.g(cVar3.v, sVar3);
            int i6 = i2;
            final com.app.mlounge.ui.viewmodel.c cVar5 = cVar3;
            a1 a1VarF = t.f(cVar3.c.c("adult_".concat(str)), Boolean.FALSE, null, sVar3, 48, 2);
            int i7 = i6 & 14;
            boolean zH = sVar3.h(cVar5) | (i7 == 4);
            Object objQ = sVar3.Q();
            androidx.compose.runtime.f fVar3 = androidx.compose.runtime.n.a;
            kotlin.coroutines.d dVar2 = null;
            if (zH || objQ == fVar3) {
                objQ = new k(cVar5, str, dVar2, 8);
                sVar3.l0(objQ);
            }
            l0.c(sVar3, str, (p) objQ);
            boolean zH2 = sVar3.h(cVar5);
            Object objQ2 = sVar3.Q();
            if (zH2 || objQ2 == fVar3) {
                objQ2 = new s2(cVar5, 13);
                sVar3.l0(objQ2);
            }
            l0.b(y.a, (l) objQ2, sVar3);
            if (((Boolean) a1VarG2.getValue()).booleanValue() || ((EpornerVideoDetail) a1VarG.getValue()) == null) {
                sVar3.b0(-1155884663);
                b0.n(null, sVar3, 0);
                sVar3.p(false);
                s1 s1VarT = sVar3.t();
                if (s1VarT != null) {
                    final int i8 = 0;
                    s1VarT.d = new p(str, aVar, qVar, qVar2, cVar5, i, i8) { // from class: com.app.mlounge.ui.screens.adult.a
                        public final /* synthetic */ q A;
                        public final /* synthetic */ q B;
                        public final /* synthetic */ com.app.mlounge.ui.viewmodel.c C;
                        public final /* synthetic */ int e;
                        public final /* synthetic */ String y;
                        public final /* synthetic */ kotlin.jvm.functions.a z;

                        {
                            this.e = i8;
                        }

                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.e) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iA = t.A(1);
                                    h.a(this.y, this.z, this.A, this.B, this.C, (s) obj, iA);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iA2 = t.A(1);
                                    h.a(this.y, this.z, this.A, this.B, this.C, (s) obj, iA2);
                                    break;
                            }
                            return y.a;
                        }
                    };
                    return;
                }
                return;
            }
            sVar3.b0(-1155855833);
            sVar3.p(false);
            EpornerVideoDetail epornerVideoDetail = (EpornerVideoDetail) a1VarG.getValue();
            epornerVideoDetail.getClass();
            List listG = epornerVideoDetail.g();
            if (listG == null) {
                listG = w.e;
            }
            e0 e0Var = i1.c;
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar3.T);
            androidx.compose.runtime.internal.j jVarL = sVar3.l();
            r rVarC = androidx.compose.ui.a.c(sVar3, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(fVar4);
            } else {
                sVar3.o0();
            }
            androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.g.f;
            t.x(sVar3, q0VarD, eVar5);
            androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.g.e;
            t.x(sVar3, jVarL, eVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.g.g;
            t.p(sVar3, numValueOf, eVar7);
            androidx.compose.ui.node.d dVar3 = androidx.compose.ui.node.g.h;
            t.t(sVar3, dVar3);
            androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.g.d;
            t.x(sVar3, rVarC, eVar8);
            EpornerThumb epornerThumbB = epornerVideoDetail.b();
            String strA = epornerThumbB != null ? epornerThumbB.a() : null;
            o oVar2 = o.b;
            String str2 = strA;
            float f2 = 320;
            r rVarG = i1.g(i1.e(oVar2, 1.0f), f2);
            androidx.compose.ui.layout.h hVar2 = androidx.compose.ui.layout.i.a;
            List list = listG;
            i iVar4 = iVar3;
            coil3.compose.k.a(str2, null, rVarG, null, hVar2, sVar, 1573296, 1976);
            androidx.compose.ui.layout.h hVar3 = hVar2;
            r rVarG2 = i1.g(i1.e(oVar2, 1.0f), f2);
            long j = com.app.mlounge.ui.theme.b.a;
            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.e(rVarG2, androidx.work.impl.model.f.t(kotlin.collections.q.k(new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.3f, j)), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.5f, j)), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.8f, j)), new androidx.compose.ui.graphics.t(j)), 0.0f, 0.0f, 14)), sVar, 6);
            r rVarQ = androidx.compose.foundation.s.q(e0Var, androidx.compose.foundation.s.p(sVar), true);
            androidx.compose.foundation.layout.w wVarA = u.a(androidx.compose.foundation.layout.h.c, hVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar.l();
            r rVarC2 = androidx.compose.ui.a.c(sVar, rVarQ);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar4);
            } else {
                sVar.o0();
            }
            t.x(sVar, wVarA, eVar5);
            t.x(sVar, jVarL2, eVar6);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar7, sVar, dVar3);
            t.x(sVar, rVarC2, eVar8);
            Object objQ3 = sVar.Q();
            if (objQ3 == fVar3) {
                objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ3;
            a1 a1VarB = _COROUTINE.a.B(kVar, sVar, 6);
            float f3 = 8;
            r rVarQ2 = androidx.compose.foundation.layout.b.q(oVar2, f3);
            androidx.compose.foundation.shape.d dVar4 = androidx.compose.foundation.shape.e.a;
            float f4 = f3;
            int i9 = 6;
            androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVarQ2, dVar4), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, dVar4), false, null, kVar, null, a, sVar, ((i6 >> 3) & 14) | 1597440, 44);
            s sVar4 = sVar;
            androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar2, f4));
            boolean zIsEmpty = list.isEmpty();
            g1 g1Var = g1.a;
            if (zIsEmpty) {
                i3 = 0;
                c = 0;
                f = 0.0f;
                z = true;
                sVar4.b0(-1023055092);
                androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar2, 140));
                sVar4.p(false);
            } else {
                sVar4.b0(-1024637115);
                List listX = kotlin.collections.p.X(6, list);
                r rVarE = i1.e(oVar2, 0.65f);
                androidx.compose.ui.h hVar4 = androidx.compose.ui.c.K;
                float f5 = 16;
                float f6 = 0.0f;
                r rVarS = androidx.compose.foundation.layout.b.s(rVarE.d(new h0(hVar4)), f5, 0.0f, 2);
                androidx.compose.foundation.layout.w wVarA2 = u.a(androidx.compose.foundation.layout.h.g(f4), hVar4, sVar4, 54);
                int iHashCode3 = Long.hashCode(sVar4.T);
                androidx.compose.runtime.internal.j jVarL3 = sVar4.l();
                r rVarC3 = androidx.compose.ui.a.c(sVar4, rVarS);
                sVar4.e0();
                if (sVar4.S) {
                    sVar4.k(fVar4);
                } else {
                    sVar4.o0();
                }
                t.x(sVar4, wVarA2, eVar5);
                t.x(sVar4, jVarL3, eVar6);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar4, eVar7, sVar4, dVar3);
                t.x(sVar4, rVarC3, eVar8);
                sVar4.b0(511282125);
                char c2 = 3;
                Iterator it = kotlin.collections.p.w(3, listX).iterator();
                while (it.hasNext()) {
                    List list2 = (List) it.next();
                    androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f4);
                    float f7 = 1.0f;
                    r rVarE2 = i1.e(oVar2, 1.0f);
                    i iVar5 = iVar4;
                    f1 f1VarA = d1.a(fVarG, iVar5, sVar4, i9);
                    int iHashCode4 = Long.hashCode(sVar4.T);
                    androidx.compose.runtime.internal.j jVarL4 = sVar4.l();
                    r rVarC4 = androidx.compose.ui.a.c(sVar4, rVarE2);
                    androidx.compose.ui.node.h.b.getClass();
                    char c3 = c2;
                    androidx.compose.ui.node.f fVar5 = androidx.compose.ui.node.g.b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(fVar5);
                    } else {
                        sVar4.o0();
                    }
                    t.x(sVar4, f1VarA, androidx.compose.ui.node.g.f);
                    t.x(sVar4, jVarL4, androidx.compose.ui.node.g.e);
                    t.p(sVar4, Integer.valueOf(iHashCode4), androidx.compose.ui.node.g.g);
                    t.t(sVar4, androidx.compose.ui.node.g.h);
                    t.x(sVar4, rVarC4, androidx.compose.ui.node.g.d);
                    sVar4.b0(-947263346);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        coil3.compose.k.a(((EpornerThumb) it2.next()).a(), null, androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.b.g(g1.a(g1Var, oVar2, f7), 1.7777778f), androidx.compose.foundation.shape.e.a(i9)), null, hVar3, sVar, 1572912, 1976);
                        sVar4 = sVar;
                        f7 = f7;
                        it = it;
                        iVar5 = iVar5;
                        i9 = 6;
                    }
                    iVar4 = iVar5;
                    Iterator it3 = it;
                    androidx.compose.ui.layout.h hVar5 = hVar3;
                    float f8 = f7;
                    sVar4.p(false);
                    sVar4.b0(-947242814);
                    int size = 3 - list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        androidx.compose.foundation.layout.b.e(sVar4, g1.a(g1Var, oVar2, f8));
                    }
                    sVar4.p(false);
                    sVar4.p(true);
                    hVar3 = hVar5;
                    f6 = 0.0f;
                    c2 = c3;
                    it = it3;
                    i9 = 6;
                }
                f = f6;
                i3 = 0;
                c = 0;
                z = true;
                sVar4.p(false);
                sVar4.p(true);
                androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar2, f5));
                sVar4.p(false);
            }
            float f9 = 16;
            r rVarS2 = androidx.compose.foundation.layout.b.s(oVar2, f9, f, 2);
            androidx.compose.foundation.layout.w wVarA3 = u.a(androidx.compose.foundation.layout.h.c, hVar, sVar4, i3);
            int iHashCode5 = Long.hashCode(sVar4.T);
            androidx.compose.runtime.internal.j jVarL5 = sVar4.l();
            r rVarC5 = androidx.compose.ui.a.c(sVar4, rVarS2);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar6 = androidx.compose.ui.node.g.b;
            sVar4.e0();
            if (sVar4.S) {
                sVar4.k(fVar6);
            } else {
                sVar4.o0();
            }
            androidx.compose.ui.node.e eVar9 = androidx.compose.ui.node.g.f;
            t.x(sVar4, wVarA3, eVar9);
            androidx.compose.ui.node.e eVar10 = androidx.compose.ui.node.g.e;
            t.x(sVar4, jVarL5, eVar10);
            Integer numValueOf2 = Integer.valueOf(iHashCode5);
            androidx.compose.ui.node.e eVar11 = androidx.compose.ui.node.g.g;
            t.p(sVar4, numValueOf2, eVar11);
            androidx.compose.ui.node.d dVar5 = androidx.compose.ui.node.g.h;
            t.t(sVar4, dVar5);
            androidx.compose.ui.node.e eVar12 = androidx.compose.ui.node.g.d;
            t.x(sVar4, rVarC5, eVar12);
            String strH = epornerVideoDetail.h();
            if (strH == null) {
                strH = "";
            }
            x2 x2Var2 = n6.a;
            m0 m0Var = ((m6) sVar4.j(x2Var2)).f;
            long j2 = com.app.mlounge.ui.theme.b.l;
            z5.b(strH, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 384, 0, 131066);
            s sVar5 = sVar;
            androidx.compose.foundation.layout.b.e(sVar5, i1.g(oVar2, f4));
            i iVar6 = iVar4;
            f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.g(f9), iVar6, sVar5, 6);
            int iHashCode6 = Long.hashCode(sVar5.T);
            androidx.compose.runtime.internal.j jVarL6 = sVar5.l();
            r rVarC6 = androidx.compose.ui.a.c(sVar5, oVar2);
            sVar5.e0();
            if (sVar5.S) {
                fVar = fVar6;
                sVar5.k(fVar);
            } else {
                fVar = fVar6;
                sVar5.o0();
            }
            t.x(sVar5, f1VarA2, eVar9);
            t.x(sVar5, jVarL6, eVar10);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode6, sVar5, eVar11, sVar5, dVar5);
            t.x(sVar5, rVarC6, eVar12);
            Long lI = epornerVideoDetail.i();
            if (lI == null) {
                sVar5.b0(1530336671);
                sVar5.p(false);
                eVar3 = eVar10;
                iVar = iVar6;
                eVar2 = eVar12;
                eVar4 = eVar11;
                fVar2 = fVar;
                eVar = eVar9;
                dVar = dVar5;
                z2 = false;
                x2Var = x2Var2;
            } else {
                sVar5.b0(1530336672);
                z2 = false;
                iVar = iVar6;
                dVar = dVar5;
                fVar2 = fVar;
                eVar = eVar9;
                eVar2 = eVar12;
                x2Var = x2Var2;
                eVar3 = eVar10;
                eVar4 = eVar11;
                z5.b(lI.longValue() + " views", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(x2Var2)).l, sVar, 384, 0, 131066);
                sVar5 = sVar;
                sVar5.p(false);
            }
            String strF = epornerVideoDetail.f();
            if (strF == null) {
                sVar5.b0(1530512937);
                sVar5.p(z2);
            } else {
                sVar5.b0(1530512938);
                z5.b("★ " + strF + "%", null, com.app.mlounge.ui.theme.b.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(x2Var)).l, sVar, 384, 0, 131066);
                sVar5 = sVar;
                sVar5.p(z2);
            }
            String strE = epornerVideoDetail.e();
            if (strE == null) {
                sVar5.b0(1530684739);
                sVar5.p(z2);
            } else {
                sVar5.b0(1530684740);
                z5.b(strE.concat(" min"), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(x2Var)).l, sVar, 384, 0, 131066);
                sVar5 = sVar;
                sVar5.p(z2);
            }
            sVar5.p(true);
            String strA2 = epornerVideoDetail.a();
            if (strA2 == null) {
                sVar5.b0(-670452743);
                sVar5.p(z2);
            } else {
                sVar5.b0(-670452742);
                z5.b("Added: ".concat(kotlin.text.k.b0(strA2, "T")), null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar5.j(x2Var)).l, sVar, 384, 0, 131066);
                sVar5 = sVar;
                sVar5.p(z2);
            }
            String strD = epornerVideoDetail.d();
            if (strD == null) {
                sVar5.b0(-670243431);
                sVar5.p(z2);
                sVar2 = sVar5;
                oVar = oVar2;
                iVar2 = iVar;
                z3 = true;
                i4 = 6;
            } else {
                sVar5.b0(-670243430);
                androidx.compose.foundation.layout.b.e(sVar5, i1.g(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0716: INVOKE 
                      (r5v21 'sVar5' androidx.compose.runtime.s)
                      (wrap androidx.compose.ui.r:0x0712: INVOKE (r1v10 androidx.compose.ui.o), (r0v6 'f4' float) STATIC call: androidx.compose.foundation.layout.i1.g(androidx.compose.ui.r, float):androidx.compose.ui.r A[MD:(androidx.compose.ui.r, float):androidx.compose.ui.r (m), WRAPPED] (LINE:261))
                     STATIC call: androidx.compose.foundation.layout.b.e(androidx.compose.runtime.s, androidx.compose.ui.r):void A[MD:(androidx.compose.runtime.s, androidx.compose.ui.r):void (m)] (LINE:261) in method: com.app.mlounge.ui.screens.adult.h.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.q, kotlin.jvm.functions.q, com.app.mlounge.ui.viewmodel.c, androidx.compose.runtime.s, int):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v10 androidx.compose.ui.o
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2423
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.adult.h.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.q, kotlin.jvm.functions.q, com.app.mlounge.ui.viewmodel.c, androidx.compose.runtime.s, int):void");
            }

            public static final void b(l lVar, com.app.mlounge.ui.viewmodel.c cVar, s sVar, int i) {
                com.app.mlounge.ui.viewmodel.c cVar2;
                int i2;
                com.app.mlounge.ui.viewmodel.c cVar3;
                kotlin.coroutines.d dVar;
                boolean z;
                androidx.compose.runtime.f fVar;
                lVar = lVar;
                s sVar2 = sVar;
                i iVar = androidx.compose.ui.c.G;
                lVar.getClass();
                sVar2.c0(1484275133);
                int i3 = i | (sVar2.h(lVar) ? 4 : 2) | 16;
                if (sVar2.T(i3 & 1, (i3 & 19) != 18)) {
                    sVar2.Y();
                    if ((i & 1) == 0 || sVar2.C()) {
                        y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar2);
                        if (y0VarA == null) {
                            kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        } else {
                            i2 = i3 & (-113);
                            cVar3 = (com.app.mlounge.ui.viewmodel.c) _COROUTINE.b.J(a0.a(com.app.mlounge.ui.viewmodel.c.class), y0VarA, n.n(y0VarA, sVar2), y0VarA instanceof j ? ((j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar2);
                        }
                    } else {
                        sVar2.W();
                        i2 = i3 & (-113);
                        cVar3 = cVar;
                    }
                    int i4 = i2;
                    sVar2.q();
                    a1 a1VarG = t.g(cVar3.f, sVar2);
                    a1 a1VarG2 = t.g(cVar3.h, sVar2);
                    a1 a1VarG3 = t.g(cVar3.j, sVar2);
                    a1 a1VarG4 = t.g(cVar3.l, sVar2);
                    a1 a1VarG5 = t.g(cVar3.n, sVar2);
                    a1 a1VarG6 = t.g(cVar3.r, sVar2);
                    a1 a1VarG7 = t.g(cVar3.p, sVar2);
                    x xVarA = z.a(0, 0, sVar2, 3);
                    boolean zH = sVar2.h(cVar3);
                    Object objQ = sVar2.Q();
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                    if (zH || objQ == fVar2) {
                        objQ = new androidx.compose.foundation.text.selection.q(cVar3, null, 7);
                        sVar2.l0(objQ);
                    }
                    l0.c(sVar2, y.a, (p) objQ);
                    String str = (String) a1VarG6.getValue();
                    boolean zF = sVar2.f(a1VarG6) | sVar2.f(a1VarG) | sVar2.h(cVar3);
                    Object objQ2 = sVar2.Q();
                    if (zF || objQ2 == fVar2) {
                        dVar = null;
                        u0 u0Var = new u0(cVar3, a1VarG6, a1VarG, null, 4);
                        sVar2.l0(u0Var);
                        objQ2 = u0Var;
                    } else {
                        dVar = null;
                    }
                    l0.c(sVar2, str, (p) objQ2);
                    boolean zF2 = sVar2.f(xVarA) | sVar2.f(a1VarG) | sVar2.h(cVar3);
                    Object objQ3 = sVar2.Q();
                    if (zF2 || objQ3 == fVar2) {
                        com.app.mlounge.ui.viewmodel.c cVar4 = cVar3;
                        androidx.room.coroutines.c0 c0Var = new androidx.room.coroutines.c0(xVarA, cVar4, a1VarG, dVar, 11);
                        cVar3 = cVar4;
                        sVar2.l0(c0Var);
                        objQ3 = c0Var;
                    }
                    l0.c(sVar2, xVarA, (p) objQ3);
                    e0 e0Var = i1.c;
                    androidx.compose.foundation.layout.w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL = sVar2.l();
                    r rVarC = androidx.compose.ui.a.c(sVar2, e0Var);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar3);
                    } else {
                        sVar2.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                    t.x(sVar2, wVarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                    t.x(sVar2, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                    t.p(sVar2, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
                    t.t(sVar2, dVar2);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                    t.x(sVar2, rVarC, eVar4);
                    m0 m0Var = ((m6) sVar2.j(n6.a)).e;
                    long j = ((t0) sVar2.j(androidx.compose.material3.u0.a)).o;
                    float f = 16;
                    float f2 = 4;
                    o oVar = o.b;
                    androidx.compose.runtime.f fVar4 = fVar2;
                    com.app.mlounge.ui.viewmodel.c cVar5 = cVar3;
                    z5.b("Adult", androidx.compose.foundation.layout.b.u(oVar, f, f, 0.0f, f2, 4), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 54, 0, 131064);
                    sVar2 = sVar;
                    float f3 = 12;
                    r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar2), false), f3, f2);
                    float f4 = 6;
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(f4), iVar, sVar2, 6);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                    r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarR);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar3);
                    } else {
                        sVar2.o0();
                    }
                    t.x(sVar2, f1VarA, eVar);
                    t.x(sVar2, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar2);
                    t.x(sVar2, rVarC2, eVar4);
                    sVar2.b0(-351604601);
                    for (kotlin.k kVar : com.app.mlounge.ui.viewmodel.c.H) {
                        com.app.mlounge.data.repository.a aVar = (com.app.mlounge.data.repository.a) kVar.e;
                        String str2 = (String) kVar.y;
                        boolean z2 = ((com.app.mlounge.data.repository.a) a1VarG7.getValue()) == aVar;
                        com.app.mlounge.ui.viewmodel.c cVar6 = cVar5;
                        boolean zH2 = sVar2.h(cVar6) | sVar2.d(aVar.ordinal());
                        Object objQ4 = sVar2.Q();
                        if (zH2) {
                            fVar = fVar4;
                        } else {
                            fVar = fVar4;
                            if (objQ4 == fVar) {
                            }
                            c(str2, z2, (kotlin.jvm.functions.a) objQ4, sVar2, 0);
                            fVar4 = fVar;
                            cVar5 = cVar6;
                        }
                        objQ4 = new b(0, cVar6, aVar);
                        sVar2.l0(objQ4);
                        c(str2, z2, (kotlin.jvm.functions.a) objQ4, sVar2, 0);
                        fVar4 = fVar;
                        cVar5 = cVar6;
                    }
                    cVar2 = cVar5;
                    androidx.compose.runtime.f fVar5 = fVar4;
                    sVar2.p(false);
                    sVar2.p(true);
                    r rVarR2 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(sVar2), false), f3, f2);
                    f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.g(f4), iVar, sVar2, 6);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar2.l();
                    r rVarC3 = androidx.compose.ui.a.c(sVar2, rVarR2);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar6 = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar6);
                    } else {
                        sVar2.o0();
                    }
                    t.x(sVar2, f1VarA2, androidx.compose.ui.node.g.f);
                    t.x(sVar2, jVarL3, androidx.compose.ui.node.g.e);
                    t.p(sVar2, Integer.valueOf(iHashCode3), androidx.compose.ui.node.g.g);
                    t.t(sVar2, androidx.compose.ui.node.g.h);
                    t.x(sVar2, rVarC3, androidx.compose.ui.node.g.d);
                    sVar2.b0(-781389834);
                    for (String str3 : (List) a1VarG2.getValue()) {
                        boolean zA = kotlin.jvm.internal.l.a((String) a1VarG6.getValue(), str3);
                        boolean zH3 = sVar2.h(cVar2) | sVar2.f(str3);
                        Object objQ5 = sVar2.Q();
                        if (zH3 || objQ5 == fVar5) {
                            objQ5 = new b(1, cVar2, str3);
                            sVar2.l0(objQ5);
                        }
                        c(str3, zA, (kotlin.jvm.functions.a) objQ5, sVar2, 0);
                    }
                    sVar2.p(false);
                    sVar2.p(true);
                    if (((Boolean) a1VarG3.getValue()).booleanValue() && ((List) a1VarG.getValue()).isEmpty()) {
                        sVar2.b0(-2050234279);
                        b0.n(null, sVar2, 0);
                        sVar2.p(false);
                    } else {
                        if (((String) a1VarG5.getValue()) == null || !((List) a1VarG.getValue()).isEmpty()) {
                            sVar2.b0(867467203);
                            androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y * 1.8f);
                            z0 z0Var = new z0(f3, f3, f3, f3);
                            float f5 = 8;
                            androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f5);
                            androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f5);
                            e0 e0Var2 = i1.c;
                            boolean zF3 = sVar2.f(a1VarG) | ((i4 & 14) == 4) | sVar2.f(a1VarG4);
                            Object objQ6 = sVar2.Q();
                            if (zF3 || objQ6 == fVar5) {
                                objQ6 = new androidx.compose.animation.core.a(20, a1VarG, lVar, a1VarG4);
                                sVar2.l0(objQ6);
                            }
                            v.b(aVar2, e0Var2, xVarA, z0Var, fVarG2, fVarG, null, false, null, (l) objQ6, sVar2, 1772592, 912);
                            sVar2.p(false);
                            z = true;
                        } else {
                            sVar2.b0(-2050232052);
                            String str4 = (String) a1VarG5.getValue();
                            str4.getClass();
                            boolean zH4 = sVar2.h(cVar2);
                            Object objQ7 = sVar2.Q();
                            if (zH4 || objQ7 == fVar5) {
                                objQ7 = new androidx.navigation.internal.h(cVar2, 20);
                                sVar2.l0(objQ7);
                            }
                            b0.i(str4, null, (kotlin.jvm.functions.a) objQ7, sVar2, 0);
                            sVar2.p(false);
                        }
                        sVar2.p(z);
                    }
                    z = true;
                    sVar2.p(z);
                } else {
                    sVar2.W();
                    cVar2 = cVar;
                }
                s1 s1VarT = sVar2.t();
                if (s1VarT != null) {
                    s1VarT.d = new androidx.compose.foundation.contextmenu.f(lVar, cVar2, i, 16);
                }
            }

            public static final void c(String str, boolean z, kotlin.jvm.functions.a aVar, s sVar, int i) {
                sVar.c0(-2109039812);
                int i2 = i | (sVar.f(str) ? 4 : 2) | (sVar.g(z) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
                if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    Object objQ = sVar.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                    if (objQ == fVar) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                    float f = 8;
                    r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(o.b, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f));
                    boolean z2 = (i2 & 896) == 256;
                    Object objQ2 = sVar.Q();
                    if (z2 || objQ2 == fVar) {
                        objQ2 = new androidx.compose.material3.x2(8, aVar);
                        sVar.l0(objQ2);
                    }
                    p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), z ? androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1523487703, new c(0, str, z), sVar), sVar, 12582912, 120);
                } else {
                    sVar.W();
                }
                s1 s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new d(str, z, aVar, i, 0);
                }
            }
        }
