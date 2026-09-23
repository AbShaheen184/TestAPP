package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.gestures.w1;
import androidx.compose.foundation.layout.g1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.v1;
import androidx.compose.foundation.text.selection.j1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.q1;
import androidx.compose.material3.s4;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.material3.z5;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.layout.d1;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import java.util.WeakHashMap;
import kotlin.collections.x;
import kotlin.jvm.functions.q;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements q {
    public final /* synthetic */ int e;

    public /* synthetic */ b(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        x xVar = x.e;
        o oVar = o.b;
        y yVar = y.a;
        final int i2 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                s sVar = (s) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= sVar.f(dVar) ? 4 : 2;
                }
                if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p.a(androidx.compose.foundation.s.f(i1.g(i1.e(androidx.compose.foundation.layout.b.s(oVar, 0.0f, h.l, 1), 1.0f), h.k), dVar.c, a0.b), sVar, 0);
                } else {
                    sVar.W();
                }
                return yVar;
            case 1:
                r rVar = (r) obj;
                s sVar2 = (s) obj2;
                ((Integer) obj3).getClass();
                sVar2.b0(-2126899193);
                long j = ((androidx.compose.foundation.text.selection.i1) sVar2.j(j1.a)).a;
                boolean zE = sVar2.e(j);
                Object objQ = sVar2.Q();
                if (zE || objQ == n.a) {
                    objQ = new androidx.compose.foundation.text.c(j, z ? 1 : 0);
                    sVar2.l0(objQ);
                }
                r rVarD = rVar.d(androidx.compose.ui.draw.h.d(oVar, (kotlin.jvm.functions.l) objQ));
                sVar2.p(false);
                return rVarD;
            case 2:
                d1 d1VarF = ((p0) obj2).F(((androidx.compose.ui.unit.a) obj3).a);
                return ((s0) obj).h0(d1VarF.e, d1VarF.y, x.e, new w1(23), new androidx.compose.foundation.layout.j(d1VarF, 9));
            case 3:
                s0 s0Var = (s0) obj;
                final int iI0 = s0Var.i0(androidx.compose.material3.internal.b.a);
                int i3 = iI0 * 2;
                final d1 d1VarF2 = ((p0) obj2).F(androidx.compose.ui.unit.b.i(i3, 0, ((androidx.compose.ui.unit.a) obj3).a));
                return s0Var.q(d1VarF2.e - i3, d1VarF2.y, xVar, new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.internal.a
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj4) {
                        androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj4;
                        switch (i2) {
                            case 0:
                                androidx.compose.ui.layout.c1.i(c1Var, d1VarF2, 0, -iI0);
                                break;
                            default:
                                androidx.compose.ui.layout.c1.i(c1Var, d1VarF2, -iI0, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                });
            case 4:
                s0 s0Var2 = (s0) obj;
                final int iI1 = s0Var2.i0(androidx.compose.material3.internal.b.b);
                int i4 = iI1 * 2;
                final d1 d1VarF3 = ((p0) obj2).F(androidx.compose.ui.unit.b.i(0, i4, ((androidx.compose.ui.unit.a) obj3).a));
                int i5 = d1VarF3.y - i4;
                int i6 = d1VarF3.e;
                final int i7 = z ? 1 : 0;
                return s0Var2.q(i6, i5, xVar, new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.internal.a
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj4) {
                        androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj4;
                        switch (i7) {
                            case 0:
                                androidx.compose.ui.layout.c1.i(c1Var, d1VarF3, 0, -iI1);
                                break;
                            default:
                                androidx.compose.ui.layout.c1.i(c1Var, d1VarF3, -iI1, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                });
            case 5:
                s sVar3 = (s) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z5.b("Cancel", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 6, 0, 262138);
                } else {
                    sVar3.W();
                }
                return yVar;
            case 6:
                s sVar4 = (s) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    z5.b("Confirm", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 390, 0, 262138);
                } else {
                    sVar4.W();
                }
                return yVar;
            case 7:
                s sVar5 = (s) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar5.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    z5.b("Cancel", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 390, 0, 262138);
                } else {
                    sVar5.W();
                }
                return yVar;
            case 8:
                s sVar6 = (s) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar6.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    z5.b("Retry", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 6, 0, 262142);
                } else {
                    sVar6.W();
                }
                return yVar;
            case 9:
                s sVar7 = (s) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar7.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    WeakHashMap weakHashMap = v1.w;
                    androidx.compose.foundation.layout.b.e(sVar7, androidx.compose.foundation.layout.b.y(t.f(sVar7).e));
                    androidx.compose.foundation.layout.b.e(sVar7, i1.g(oVar, 8));
                } else {
                    sVar7.W();
                }
                return yVar;
            case 10:
                s sVar8 = (s) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (sVar8.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    r rVarQ = androidx.compose.foundation.layout.b.q(i1.e(oVar, 1.0f), 16);
                    q0 q0VarD = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode = Long.hashCode(sVar8.T);
                    androidx.compose.runtime.internal.j jVarL = sVar8.l();
                    r rVarC = androidx.compose.ui.a.c(sVar8, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                    sVar8.e0();
                    if (sVar8.S) {
                        sVar8.k(fVar);
                    } else {
                        sVar8.o0();
                    }
                    androidx.compose.runtime.t.x(sVar8, q0VarD, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar8, jVarL, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar8, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar8, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar8, rVarC, androidx.compose.ui.node.g.d);
                    s4.a(i1.m(oVar, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar8, 54, 60);
                    sVar8.p(true);
                } else {
                    sVar8.W();
                }
                return yVar;
            case 11:
                s sVar9 = (s) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (sVar9.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    androidx.compose.foundation.layout.b.e(sVar9, i1.g(oVar, 32));
                } else {
                    sVar9.W();
                }
                return yVar;
            case 12:
                s sVar10 = (s) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (sVar10.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    r rVarQ2 = androidx.compose.foundation.layout.b.q(i1.e(oVar, 1.0f), 16);
                    q0 q0VarD2 = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode2 = Long.hashCode(sVar10.T);
                    androidx.compose.runtime.internal.j jVarL2 = sVar10.l();
                    r rVarC2 = androidx.compose.ui.a.c(sVar10, rVarQ2);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar10.e0();
                    if (sVar10.S) {
                        sVar10.k(fVar2);
                    } else {
                        sVar10.o0();
                    }
                    androidx.compose.runtime.t.x(sVar10, q0VarD2, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar10, jVarL2, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar10, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar10, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar10, rVarC2, androidx.compose.ui.node.g.d);
                    s4.a(i1.m(oVar, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar10, 54, 60);
                    sVar10.p(true);
                } else {
                    sVar10.W();
                }
                return yVar;
            case 13:
                s sVar11 = (s) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar11.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    z5.b("Delete", null, a0.d(4294198070L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 390, 0, 262138);
                } else {
                    sVar11.W();
                }
                return yVar;
            case 14:
                s sVar12 = (s) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar12.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    z5.b("Cancel", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar12, 390, 0, 262138);
                } else {
                    sVar12.W();
                }
                return yVar;
            case 15:
                s sVar13 = (s) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (sVar13.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    r rVarQ3 = androidx.compose.foundation.layout.b.q(i1.e(oVar, 1.0f), 16);
                    q0 q0VarD3 = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode3 = Long.hashCode(sVar13.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar13.l();
                    r rVarC3 = androidx.compose.ui.a.c(sVar13, rVarQ3);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
                    sVar13.e0();
                    if (sVar13.S) {
                        sVar13.k(fVar3);
                    } else {
                        sVar13.o0();
                    }
                    androidx.compose.runtime.t.x(sVar13, q0VarD3, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar13, jVarL3, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar13, Integer.valueOf(iHashCode3), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar13, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar13, rVarC3, androidx.compose.ui.node.g.d);
                    s4.a(i1.m(oVar, 24), ((t0) sVar13.j(u0.a)).a, 0.0f, 0L, 0, 0.0f, sVar13, 6, 60);
                    sVar13.p(true);
                } else {
                    sVar13.W();
                }
                return yVar;
            case 16:
                s sVar14 = (s) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar14.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    z5.b("Clear All", null, com.app.mlounge.ui.theme.b.o, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar14, 390, 0, 262138);
                } else {
                    sVar14.W();
                }
                return yVar;
            case 17:
                s sVar15 = (s) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (sVar15.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    r rVarQ4 = androidx.compose.foundation.layout.b.q(i1.e(oVar, 1.0f), 16);
                    q0 q0VarD4 = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode4 = Long.hashCode(sVar15.T);
                    androidx.compose.runtime.internal.j jVarL4 = sVar15.l();
                    r rVarC4 = androidx.compose.ui.a.c(sVar15, rVarQ4);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                    sVar15.e0();
                    if (sVar15.S) {
                        sVar15.k(fVar4);
                    } else {
                        sVar15.o0();
                    }
                    androidx.compose.runtime.t.x(sVar15, q0VarD4, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar15, jVarL4, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar15, Integer.valueOf(iHashCode4), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar15, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar15, rVarC4, androidx.compose.ui.node.g.d);
                    s4.a(i1.m(oVar, 24), ((t0) sVar15.j(u0.a)).a, 0.0f, 0L, 0, 0.0f, sVar15, 6, 60);
                    sVar15.p(true);
                } else {
                    sVar15.W();
                }
                return yVar;
            case 18:
                s sVar16 = (s) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (sVar16.T(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    z5.b("Discography", androidx.compose.foundation.layout.b.q(oVar, 16), androidx.compose.ui.graphics.t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar16.j(n6.a)).h, sVar16, 438, 0, 131064);
                } else {
                    sVar16.W();
                }
                return yVar;
            case 19:
                s sVar17 = (s) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (sVar17.T(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    r rVarQ5 = androidx.compose.foundation.layout.b.q(i1.e(oVar, 1.0f), 16);
                    q0 q0VarD5 = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode5 = Long.hashCode(sVar17.T);
                    androidx.compose.runtime.internal.j jVarL5 = sVar17.l();
                    r rVarC5 = androidx.compose.ui.a.c(sVar17, rVarQ5);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar5 = androidx.compose.ui.node.g.b;
                    sVar17.e0();
                    if (sVar17.S) {
                        sVar17.k(fVar5);
                    } else {
                        sVar17.o0();
                    }
                    androidx.compose.runtime.t.x(sVar17, q0VarD5, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar17, jVarL5, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar17, Integer.valueOf(iHashCode5), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar17, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar17, rVarC5, androidx.compose.ui.node.g.d);
                    s4.a(i1.m(oVar, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar17, 54, 60);
                    sVar17.p(true);
                } else {
                    sVar17.W();
                }
                return yVar;
            case 20:
                s sVar18 = (s) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar18.T(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    z5.b("Reset", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar18, 390, 0, 262138);
                } else {
                    sVar18.W();
                }
                return yVar;
            case 21:
                s sVar19 = (s) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (sVar19.T(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    r rVarQ6 = androidx.compose.foundation.layout.b.q(i1.e(oVar, 1.0f), 16);
                    q0 q0VarD6 = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode6 = Long.hashCode(sVar19.T);
                    androidx.compose.runtime.internal.j jVarL6 = sVar19.l();
                    r rVarC6 = androidx.compose.ui.a.c(sVar19, rVarQ6);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar6 = androidx.compose.ui.node.g.b;
                    sVar19.e0();
                    if (sVar19.S) {
                        sVar19.k(fVar6);
                    } else {
                        sVar19.o0();
                    }
                    androidx.compose.runtime.t.x(sVar19, q0VarD6, androidx.compose.ui.node.g.f);
                    androidx.compose.runtime.t.x(sVar19, jVarL6, androidx.compose.ui.node.g.e);
                    androidx.compose.runtime.t.p(sVar19, Integer.valueOf(iHashCode6), androidx.compose.ui.node.g.g);
                    androidx.compose.runtime.t.t(sVar19, androidx.compose.ui.node.g.h);
                    androidx.compose.runtime.t.x(sVar19, rVarC6, androidx.compose.ui.node.g.d);
                    s4.a(i1.m(oVar, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar19, 54, 60);
                    sVar19.p(true);
                } else {
                    sVar19.W();
                }
                return yVar;
            case 22:
                s sVar20 = (s) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar20.T(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    z5.b("Open API Keys page", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar20.j(n6.a)).l, sVar20, 390, 0, 131066);
                } else {
                    sVar20.W();
                }
                return yVar;
            case 23:
                s sVar21 = (s) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar21.T(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    z5.b("OPEN AUTHORIZATION PAGE", null, com.app.mlounge.ui.theme.b.f, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, null, sVar21, 1573254, 0, 262074);
                } else {
                    sVar21.W();
                }
                return yVar;
            case 24:
                s sVar22 = (s) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar22.T(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    z5.b("CANCEL", null, com.app.mlounge.ui.theme.b.m, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, null, sVar22, 1573254, 0, 262074);
                } else {
                    sVar22.W();
                }
                return yVar;
            case 25:
                s sVar23 = (s) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar23.T(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    androidx.compose.ui.graphics.vector.f fVarB = com.google.firebase.b.a;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("AutoMirrored.Filled.Logout", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i8 = h0.a;
                        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.v(17.0f, 7.0f);
                        gVar.u(-1.41f, 1.41f);
                        gVar.t(18.17f, 11.0f);
                        gVar.r(8.0f);
                        gVar.A(2.0f);
                        gVar.s(10.17f);
                        gVar.u(-2.58f, 2.58f);
                        gVar.t(17.0f, 17.0f);
                        gVar.u(5.0f, -5.0f);
                        gVar.l();
                        gVar.v(4.0f, 5.0f);
                        gVar.s(8.0f);
                        gVar.z(3.0f);
                        gVar.r(4.0f);
                        gVar.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        gVar.A(14.0f);
                        gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        gVar.s(8.0f);
                        gVar.A(-2.0f);
                        gVar.r(4.0f);
                        gVar.z(5.0f);
                        gVar.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
                        fVarB = eVar.b();
                        com.google.firebase.b.a = fVarB;
                    }
                    androidx.compose.ui.graphics.vector.f fVar7 = fVarB;
                    long j2 = com.app.mlounge.ui.theme.b.o;
                    q1.b(fVar7, null, i1.m(oVar, 18), j2, sVar23, 3504, 0);
                    androidx.compose.foundation.layout.b.e(sVar23, i1.q(oVar, 4));
                    z5.b("Logout", null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar23, 390, 0, 262138);
                } else {
                    sVar23.W();
                }
                return yVar;
            case 26:
                s sVar24 = (s) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar24.T(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    z5.b("Don't have an account? Sign up", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar24.j(n6.a)).l, sVar24, 390, 0, 131066);
                } else {
                    sVar24.W();
                }
                return yVar;
            case 27:
                s sVar25 = (s) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar25.T(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    sVar25.b0(-1605114917);
                    sVar25.p(false);
                    z5.b("Sign In", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar25, 0, 0, 262142);
                } else {
                    sVar25.W();
                }
                return yVar;
            case 28:
                s sVar26 = (s) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar26.T(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    z5.b("Grant Permission", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar26, 6, 0, 262138);
                } else {
                    sVar26.W();
                }
                return yVar;
            default:
                s sVar27 = (s) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((g1) obj).getClass();
                if (sVar27.T(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    z5.b("Continue", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar27, 6, 0, 262138);
                } else {
                    sVar27.W();
                }
                return yVar;
        }
    }
}
