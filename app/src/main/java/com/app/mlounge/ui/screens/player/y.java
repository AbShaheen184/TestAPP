package com.app.mlounge.ui.screens.player;

import android.graphics.Color;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.z5;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements kotlin.jvm.functions.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ kotlin.jvm.functions.l C;
    public final /* synthetic */ kotlin.jvm.functions.l D;
    public final /* synthetic */ kotlin.jvm.functions.l E;
    public final /* synthetic */ kotlin.jvm.functions.l F;
    public final /* synthetic */ kotlin.jvm.functions.a G;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ float y;
    public final /* synthetic */ int z;

    public /* synthetic */ y(float f, int i, int i2, long j, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, kotlin.jvm.functions.l lVar4, kotlin.jvm.functions.a aVar, int i3) {
        this.y = f;
        this.z = i;
        this.A = i2;
        this.B = j;
        this.C = lVar;
        this.D = lVar2;
        this.E = lVar3;
        this.F = lVar4;
        this.G = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.ui.r rVarC = i1.c(i1.e(androidx.compose.ui.o.b, 0.85f), 0.85f);
                    androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(16);
                    androidx.compose.material3.g0 g0VarJ = androidx.compose.material3.q.j(com.app.mlounge.ui.theme.b.b, sVar, 6);
                    final kotlin.jvm.functions.a aVar = this.G;
                    final kotlin.jvm.functions.l lVar = this.C;
                    final float f = this.y;
                    final kotlin.jvm.functions.l lVar2 = this.D;
                    final long j = this.B;
                    final int i = this.z;
                    final kotlin.jvm.functions.l lVar3 = this.E;
                    final int i2 = this.A;
                    final kotlin.jvm.functions.l lVar4 = this.F;
                    androidx.compose.material3.q.c(rVarC, dVarA, g0VarJ, null, androidx.compose.runtime.internal.k.c(48059655, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.z
                        @Override // kotlin.jvm.functions.q
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ((androidx.compose.foundation.layout.x) obj3).getClass();
                            if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(i1.c, 20);
                                final kotlin.jvm.functions.a aVar2 = aVar;
                                boolean zF = sVar2.f(aVar2);
                                final kotlin.jvm.functions.l lVar5 = lVar;
                                boolean zF2 = zF | sVar2.f(lVar5);
                                final float f2 = f;
                                boolean zC = zF2 | sVar2.c(f2);
                                final kotlin.jvm.functions.l lVar6 = lVar2;
                                boolean zF3 = zC | sVar2.f(lVar6);
                                final long j2 = j;
                                boolean zE = zF3 | sVar2.e(j2);
                                final int i3 = i;
                                boolean zD = zE | sVar2.d(i3);
                                final kotlin.jvm.functions.l lVar7 = lVar3;
                                boolean zF4 = zD | sVar2.f(lVar7);
                                final int i4 = i2;
                                boolean zD2 = zF4 | sVar2.d(i4);
                                final kotlin.jvm.functions.l lVar8 = lVar4;
                                boolean zF5 = zD2 | sVar2.f(lVar8);
                                Object objQ = sVar2.Q();
                                if (zF5 || objQ == androidx.compose.runtime.n.a) {
                                    kotlin.jvm.functions.l lVar9 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.player.p
                                        @Override // kotlin.jvm.functions.l
                                        public final Object invoke(Object obj6) {
                                            androidx.compose.foundation.lazy.j jVar = (androidx.compose.foundation.lazy.j) obj6;
                                            jVar.getClass();
                                            androidx.compose.foundation.lazy.j.p(jVar, new androidx.compose.runtime.internal.f(true, 1399435676, new androidx.compose.foundation.c0(3, aVar2)), 3);
                                            final kotlin.jvm.functions.l lVar10 = lVar5;
                                            final float f3 = f2;
                                            androidx.compose.foundation.lazy.j.p(jVar, new androidx.compose.runtime.internal.f(true, 311693587, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.f
                                                @Override // kotlin.jvm.functions.q
                                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj8;
                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                    ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                    if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                        z5.b("Subtitle Size", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), coil3.svg.internal.a.x(13), null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24966, 0, 262122);
                                                        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                                                        androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.h.d;
                                                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                                                        androidx.compose.ui.r rVarE = i1.e(oVar, 1.0f);
                                                        f1 f1VarA = d1.a(dVar, iVar, sVar3, 54);
                                                        int iHashCode = Long.hashCode(sVar3.T);
                                                        androidx.compose.runtime.internal.j jVarL = sVar3.l();
                                                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar3, rVarE);
                                                        androidx.compose.ui.node.h.b.getClass();
                                                        androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                                                        sVar3.e0();
                                                        if (sVar3.S) {
                                                            sVar3.k(fVar);
                                                        } else {
                                                            sVar3.o0();
                                                        }
                                                        androidx.compose.runtime.t.x(sVar3, f1VarA, androidx.compose.ui.node.g.f);
                                                        androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                                                        androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                                                        androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                                                        androidx.compose.runtime.t.x(sVar3, rVarC2, androidx.compose.ui.node.g.d);
                                                        androidx.compose.ui.graphics.vector.f fVarW = _COROUTINE.b.w();
                                                        kotlin.jvm.functions.l lVar11 = lVar10;
                                                        boolean zF6 = sVar3.f(lVar11);
                                                        float f4 = f3;
                                                        boolean zC2 = zF6 | sVar3.c(f4);
                                                        Object objQ2 = sVar3.Q();
                                                        androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                                                        if (zC2 || objQ2 == fVar2) {
                                                            objQ2 = new k(lVar11, f4, 0);
                                                            sVar3.l0(objQ2);
                                                        }
                                                        k0.f(fVarW, (kotlin.jvm.functions.a) objQ2, sVar3, 0);
                                                        z5.b(androidx.compose.runtime.j.d((int) f4, "sp"), androidx.compose.foundation.layout.b.s(oVar, 16, 0.0f, 2), com.app.mlounge.ui.theme.b.f, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 1573296, 0, 262072);
                                                        androidx.compose.ui.graphics.vector.f fVarV = t1.v();
                                                        boolean zF7 = sVar3.f(lVar11) | sVar3.c(f4);
                                                        Object objQ3 = sVar3.Q();
                                                        if (zF7 || objQ3 == fVar2) {
                                                            objQ3 = new k(lVar11, f4, 1);
                                                            sVar3.l0(objQ3);
                                                        }
                                                        k0.f(fVarV, (kotlin.jvm.functions.a) objQ3, sVar3, 0);
                                                        sVar3.p(true);
                                                        androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar, 24));
                                                    } else {
                                                        sVar3.W();
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            }), 3);
                                            final long j3 = j2;
                                            final kotlin.jvm.functions.l lVar11 = lVar6;
                                            androidx.compose.foundation.lazy.j.p(jVar, new androidx.compose.runtime.internal.f(true, 2137329364, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.g
                                                @Override // kotlin.jvm.functions.q
                                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj8;
                                                    int iIntValue3 = ((Integer) obj9).intValue();
                                                    ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                    if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                        z5.b("Sync Offset", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), coil3.svg.internal.a.x(13), null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24966, 0, 262122);
                                                        androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                                                        androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.h.d;
                                                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                                                        androidx.compose.ui.r rVarE = i1.e(oVar, 1.0f);
                                                        f1 f1VarA = d1.a(dVar, iVar, sVar3, 54);
                                                        int iHashCode = Long.hashCode(sVar3.T);
                                                        androidx.compose.runtime.internal.j jVarL = sVar3.l();
                                                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar3, rVarE);
                                                        androidx.compose.ui.node.h.b.getClass();
                                                        androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                                                        sVar3.e0();
                                                        if (sVar3.S) {
                                                            sVar3.k(fVar);
                                                        } else {
                                                            sVar3.o0();
                                                        }
                                                        androidx.compose.runtime.t.x(sVar3, f1VarA, androidx.compose.ui.node.g.f);
                                                        androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                                                        androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                                                        androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                                                        androidx.compose.runtime.t.x(sVar3, rVarC2, androidx.compose.ui.node.g.d);
                                                        androidx.compose.ui.graphics.vector.f fVarW = _COROUTINE.b.w();
                                                        final kotlin.jvm.functions.l lVar12 = lVar11;
                                                        boolean zF6 = sVar3.f(lVar12);
                                                        final long j4 = j3;
                                                        boolean zE2 = zF6 | sVar3.e(j4);
                                                        Object objQ2 = sVar3.Q();
                                                        androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                                                        if (zE2 || objQ2 == fVar2) {
                                                            final int i5 = 0;
                                                            objQ2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.l
                                                                @Override // kotlin.jvm.functions.a
                                                                public final Object invoke() {
                                                                    switch (i5) {
                                                                        case 0:
                                                                            lVar12.invoke(Long.valueOf(j4 - ((long) Context.VERSION_ECMASCRIPT)));
                                                                            break;
                                                                        default:
                                                                            lVar12.invoke(Long.valueOf(j4 + ((long) Context.VERSION_ECMASCRIPT)));
                                                                            break;
                                                                    }
                                                                    return kotlin.y.a;
                                                                }
                                                            };
                                                            sVar3.l0(objQ2);
                                                        }
                                                        k0.f(fVarW, (kotlin.jvm.functions.a) objQ2, sVar3, 0);
                                                        z5.b(androidx.compose.runtime.j.j(j4 >= 0 ? "+" : "", String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j4 / 1000.0d)}, 1)), "s"), androidx.compose.foundation.layout.b.s(oVar, 16, 0.0f, 2), com.app.mlounge.ui.theme.b.f, 0L, androidx.compose.ui.text.font.k.C, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 1573296, 0, 262072);
                                                        androidx.compose.ui.graphics.vector.f fVarV = t1.v();
                                                        boolean zF7 = sVar3.f(lVar12) | sVar3.e(j4);
                                                        Object objQ3 = sVar3.Q();
                                                        if (zF7 || objQ3 == fVar2) {
                                                            final int i6 = 1;
                                                            objQ3 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.l
                                                                @Override // kotlin.jvm.functions.a
                                                                public final Object invoke() {
                                                                    switch (i6) {
                                                                        case 0:
                                                                            lVar12.invoke(Long.valueOf(j4 - ((long) Context.VERSION_ECMASCRIPT)));
                                                                            break;
                                                                        default:
                                                                            lVar12.invoke(Long.valueOf(j4 + ((long) Context.VERSION_ECMASCRIPT)));
                                                                            break;
                                                                    }
                                                                    return kotlin.y.a;
                                                                }
                                                            };
                                                            sVar3.l0(objQ3);
                                                        }
                                                        k0.f(fVarV, (kotlin.jvm.functions.a) objQ3, sVar3, 0);
                                                        if (j4 != 0) {
                                                            sVar3.b0(-1250496576);
                                                            boolean zF8 = sVar3.f(lVar12);
                                                            Object objQ4 = sVar3.Q();
                                                            if (zF8 || objQ4 == fVar2) {
                                                                objQ4 = new e(2, lVar12);
                                                                sVar3.l0(objQ4);
                                                            }
                                                            androidx.compose.material3.q.i((kotlin.jvm.functions.a) objQ4, null, false, null, null, null, null, b.b, sVar3, 805306368, 510);
                                                            sVar3.p(false);
                                                        } else {
                                                            sVar3.b0(-1250363958);
                                                            sVar3.p(false);
                                                        }
                                                        sVar3.p(true);
                                                        androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar, 24));
                                                    } else {
                                                        sVar3.W();
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            }), 3);
                                            final int i5 = 0;
                                            final int i6 = i3;
                                            final kotlin.jvm.functions.l lVar12 = lVar7;
                                            androidx.compose.foundation.lazy.j.p(jVar, new androidx.compose.runtime.internal.f(true, -332002155, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.h
                                                @Override // kotlin.jvm.functions.q
                                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                    switch (i5) {
                                                        case 0:
                                                            androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                            if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                z5.b("Text Color", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), coil3.svg.internal.a.x(13), null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24966, 0, 262122);
                                                                f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, sVar3, 6);
                                                                int iHashCode = Long.hashCode(sVar3.T);
                                                                androidx.compose.runtime.internal.j jVarL = sVar3.l();
                                                                androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                                                                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar3, oVar);
                                                                androidx.compose.ui.node.h.b.getClass();
                                                                androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                                                                sVar3.e0();
                                                                if (sVar3.S) {
                                                                    sVar3.k(fVar);
                                                                } else {
                                                                    sVar3.o0();
                                                                }
                                                                androidx.compose.runtime.t.x(sVar3, f1VarA, androidx.compose.ui.node.g.f);
                                                                androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                                                                androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                                                                androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                                                                androidx.compose.runtime.t.x(sVar3, rVarC2, androidx.compose.ui.node.g.d);
                                                                sVar3.b0(-860516516);
                                                                Iterator it = kotlin.collections.q.k(-1, -256, -16711936, -16711681).iterator();
                                                                while (it.hasNext()) {
                                                                    final int iIntValue4 = ((Number) it.next()).intValue();
                                                                    long jC = androidx.compose.ui.graphics.a0.c(iIntValue4);
                                                                    boolean z = i6 == iIntValue4;
                                                                    final kotlin.jvm.functions.l lVar13 = lVar12;
                                                                    boolean zF6 = sVar3.f(lVar13) | sVar3.d(iIntValue4);
                                                                    Object objQ2 = sVar3.Q();
                                                                    if (zF6 || objQ2 == androidx.compose.runtime.n.a) {
                                                                        final int i7 = 1;
                                                                        objQ2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.j
                                                                            @Override // kotlin.jvm.functions.a
                                                                            public final Object invoke() {
                                                                                switch (i7) {
                                                                                    case 0:
                                                                                        lVar13.invoke(Integer.valueOf(iIntValue4));
                                                                                        break;
                                                                                    default:
                                                                                        lVar13.invoke(Integer.valueOf(iIntValue4));
                                                                                        break;
                                                                                }
                                                                                return kotlin.y.a;
                                                                            }
                                                                        };
                                                                        sVar3.l0(objQ2);
                                                                    }
                                                                    k0.c(jC, z, (kotlin.jvm.functions.a) objQ2, sVar3, 0);
                                                                }
                                                                sVar3.p(false);
                                                                sVar3.p(true);
                                                                androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar, 24));
                                                            } else {
                                                                sVar3.W();
                                                            }
                                                            break;
                                                        default:
                                                            androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj8;
                                                            int iIntValue5 = ((Integer) obj9).intValue();
                                                            ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                            if (sVar4.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                z5.b("Background Color", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), coil3.svg.internal.a.x(13), null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 24966, 0, 262122);
                                                                List listK = kotlin.collections.q.k(new kotlin.k(Integer.valueOf(Color.argb(128, 0, 0, 0)), "Semi"), new kotlin.k(Integer.valueOf(Color.argb(255, 0, 0, 0)), "Black"), new kotlin.k(0, "None"), new kotlin.k(Integer.valueOf(Color.argb(160, 50, 50, 50)), "Gray"));
                                                                f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, sVar4, 6);
                                                                int iHashCode2 = Long.hashCode(sVar4.T);
                                                                androidx.compose.runtime.internal.j jVarL2 = sVar4.l();
                                                                androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                                                                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar4, oVar2);
                                                                androidx.compose.ui.node.h.b.getClass();
                                                                androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                                                                sVar4.e0();
                                                                if (sVar4.S) {
                                                                    sVar4.k(fVar2);
                                                                } else {
                                                                    sVar4.o0();
                                                                }
                                                                androidx.compose.runtime.t.x(sVar4, f1VarA2, androidx.compose.ui.node.g.f);
                                                                androidx.compose.runtime.t.x(sVar4, jVarL2, androidx.compose.ui.node.g.e);
                                                                androidx.compose.runtime.t.p(sVar4, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                                                                androidx.compose.runtime.t.t(sVar4, androidx.compose.ui.node.g.h);
                                                                androidx.compose.runtime.t.x(sVar4, rVarC3, androidx.compose.ui.node.g.d);
                                                                sVar4.b0(1228804714);
                                                                Iterator it2 = listK.iterator();
                                                                while (it2.hasNext()) {
                                                                    final int iIntValue6 = ((Number) ((kotlin.k) it2.next()).e).intValue();
                                                                    long jC2 = iIntValue6 == 0 ? androidx.compose.ui.graphics.t.h : androidx.compose.ui.graphics.a0.c(iIntValue6);
                                                                    boolean z2 = i6 == iIntValue6;
                                                                    final kotlin.jvm.functions.l lVar14 = lVar12;
                                                                    boolean zF7 = sVar4.f(lVar14) | sVar4.d(iIntValue6);
                                                                    Object objQ3 = sVar4.Q();
                                                                    if (zF7 || objQ3 == androidx.compose.runtime.n.a) {
                                                                        final int i8 = 0;
                                                                        objQ3 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.j
                                                                            @Override // kotlin.jvm.functions.a
                                                                            public final Object invoke() {
                                                                                switch (i8) {
                                                                                    case 0:
                                                                                        lVar14.invoke(Integer.valueOf(iIntValue6));
                                                                                        break;
                                                                                    default:
                                                                                        lVar14.invoke(Integer.valueOf(iIntValue6));
                                                                                        break;
                                                                                }
                                                                                return kotlin.y.a;
                                                                            }
                                                                        };
                                                                        sVar4.l0(objQ3);
                                                                    }
                                                                    k0.c(jC2, z2, (kotlin.jvm.functions.a) objQ3, sVar4, 0);
                                                                }
                                                                sVar4.p(false);
                                                                sVar4.p(true);
                                                                androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar2, 16));
                                                            } else {
                                                                sVar4.W();
                                                            }
                                                            break;
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            }), 3);
                                            final int i7 = 1;
                                            final int i8 = i4;
                                            final kotlin.jvm.functions.l lVar13 = lVar8;
                                            androidx.compose.foundation.lazy.j.p(jVar, new androidx.compose.runtime.internal.f(true, 1493633622, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.h
                                                @Override // kotlin.jvm.functions.q
                                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                    switch (i7) {
                                                        case 0:
                                                            androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj8;
                                                            int iIntValue3 = ((Integer) obj9).intValue();
                                                            ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                            if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                z5.b("Text Color", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), coil3.svg.internal.a.x(13), null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24966, 0, 262122);
                                                                f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, sVar3, 6);
                                                                int iHashCode = Long.hashCode(sVar3.T);
                                                                androidx.compose.runtime.internal.j jVarL = sVar3.l();
                                                                androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                                                                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar3, oVar);
                                                                androidx.compose.ui.node.h.b.getClass();
                                                                androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                                                                sVar3.e0();
                                                                if (sVar3.S) {
                                                                    sVar3.k(fVar);
                                                                } else {
                                                                    sVar3.o0();
                                                                }
                                                                androidx.compose.runtime.t.x(sVar3, f1VarA, androidx.compose.ui.node.g.f);
                                                                androidx.compose.runtime.t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                                                                androidx.compose.runtime.t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                                                                androidx.compose.runtime.t.t(sVar3, androidx.compose.ui.node.g.h);
                                                                androidx.compose.runtime.t.x(sVar3, rVarC2, androidx.compose.ui.node.g.d);
                                                                sVar3.b0(-860516516);
                                                                Iterator it = kotlin.collections.q.k(-1, -256, -16711936, -16711681).iterator();
                                                                while (it.hasNext()) {
                                                                    final int iIntValue4 = ((Number) it.next()).intValue();
                                                                    long jC = androidx.compose.ui.graphics.a0.c(iIntValue4);
                                                                    boolean z = i8 == iIntValue4;
                                                                    final kotlin.jvm.functions.l lVar14 = lVar13;
                                                                    boolean zF6 = sVar3.f(lVar14) | sVar3.d(iIntValue4);
                                                                    Object objQ2 = sVar3.Q();
                                                                    if (zF6 || objQ2 == androidx.compose.runtime.n.a) {
                                                                        final int i9 = 1;
                                                                        objQ2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.j
                                                                            @Override // kotlin.jvm.functions.a
                                                                            public final Object invoke() {
                                                                                switch (i9) {
                                                                                    case 0:
                                                                                        lVar14.invoke(Integer.valueOf(iIntValue4));
                                                                                        break;
                                                                                    default:
                                                                                        lVar14.invoke(Integer.valueOf(iIntValue4));
                                                                                        break;
                                                                                }
                                                                                return kotlin.y.a;
                                                                            }
                                                                        };
                                                                        sVar3.l0(objQ2);
                                                                    }
                                                                    k0.c(jC, z, (kotlin.jvm.functions.a) objQ2, sVar3, 0);
                                                                }
                                                                sVar3.p(false);
                                                                sVar3.p(true);
                                                                androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar, 24));
                                                            } else {
                                                                sVar3.W();
                                                            }
                                                            break;
                                                        default:
                                                            androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj8;
                                                            int iIntValue5 = ((Integer) obj9).intValue();
                                                            ((androidx.compose.foundation.lazy.d) obj7).getClass();
                                                            if (sVar4.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                                z5.b("Background Color", null, androidx.compose.ui.graphics.t.b(0.7f, androidx.compose.ui.graphics.t.d), coil3.svg.internal.a.x(13), null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 24966, 0, 262122);
                                                                List listK = kotlin.collections.q.k(new kotlin.k(Integer.valueOf(Color.argb(128, 0, 0, 0)), "Semi"), new kotlin.k(Integer.valueOf(Color.argb(255, 0, 0, 0)), "Black"), new kotlin.k(0, "None"), new kotlin.k(Integer.valueOf(Color.argb(160, 50, 50, 50)), "Gray"));
                                                                f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, sVar4, 6);
                                                                int iHashCode2 = Long.hashCode(sVar4.T);
                                                                androidx.compose.runtime.internal.j jVarL2 = sVar4.l();
                                                                androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                                                                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar4, oVar2);
                                                                androidx.compose.ui.node.h.b.getClass();
                                                                androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                                                                sVar4.e0();
                                                                if (sVar4.S) {
                                                                    sVar4.k(fVar2);
                                                                } else {
                                                                    sVar4.o0();
                                                                }
                                                                androidx.compose.runtime.t.x(sVar4, f1VarA2, androidx.compose.ui.node.g.f);
                                                                androidx.compose.runtime.t.x(sVar4, jVarL2, androidx.compose.ui.node.g.e);
                                                                androidx.compose.runtime.t.p(sVar4, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                                                                androidx.compose.runtime.t.t(sVar4, androidx.compose.ui.node.g.h);
                                                                androidx.compose.runtime.t.x(sVar4, rVarC3, androidx.compose.ui.node.g.d);
                                                                sVar4.b0(1228804714);
                                                                Iterator it2 = listK.iterator();
                                                                while (it2.hasNext()) {
                                                                    final int iIntValue6 = ((Number) ((kotlin.k) it2.next()).e).intValue();
                                                                    long jC2 = iIntValue6 == 0 ? androidx.compose.ui.graphics.t.h : androidx.compose.ui.graphics.a0.c(iIntValue6);
                                                                    boolean z2 = i8 == iIntValue6;
                                                                    final kotlin.jvm.functions.l lVar15 = lVar13;
                                                                    boolean zF7 = sVar4.f(lVar15) | sVar4.d(iIntValue6);
                                                                    Object objQ3 = sVar4.Q();
                                                                    if (zF7 || objQ3 == androidx.compose.runtime.n.a) {
                                                                        final int i10 = 0;
                                                                        objQ3 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.player.j
                                                                            @Override // kotlin.jvm.functions.a
                                                                            public final Object invoke() {
                                                                                switch (i10) {
                                                                                    case 0:
                                                                                        lVar15.invoke(Integer.valueOf(iIntValue6));
                                                                                        break;
                                                                                    default:
                                                                                        lVar15.invoke(Integer.valueOf(iIntValue6));
                                                                                        break;
                                                                                }
                                                                                return kotlin.y.a;
                                                                            }
                                                                        };
                                                                        sVar4.l0(objQ3);
                                                                    }
                                                                    k0.c(jC2, z2, (kotlin.jvm.functions.a) objQ3, sVar4, 0);
                                                                }
                                                                sVar4.p(false);
                                                                sVar4.p(true);
                                                                androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar2, 16));
                                                            } else {
                                                                sVar4.W();
                                                            }
                                                            break;
                                                    }
                                                    return kotlin.y.a;
                                                }
                                            }), 3);
                                            return kotlin.y.a;
                                        }
                                    };
                                    sVar2.l0(lVar9);
                                    objQ = lVar9;
                                }
                                android.support.v4.media.session.b.c(rVarQ, null, null, null, null, null, false, null, (kotlin.jvm.functions.l) objQ, sVar2, 6, 510);
                            } else {
                                sVar2.W();
                            }
                            return kotlin.y.a;
                        }
                    }, sVar), sVar, 196614, 24);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                k0.n(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ y(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.l lVar, float f, kotlin.jvm.functions.l lVar2, long j, int i, kotlin.jvm.functions.l lVar3, int i2, kotlin.jvm.functions.l lVar4) {
        this.G = aVar;
        this.C = lVar;
        this.y = f;
        this.D = lVar2;
        this.B = j;
        this.z = i;
        this.E = lVar3;
        this.A = i2;
        this.F = lVar4;
    }
}
