package com.app.mlounge.ui.screens.downloads;

import androidx.compose.animation.core.g0;
import androidx.compose.animation.core.i0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.m;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q;
import androidx.compose.material3.q1;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.internal.f;
import androidx.compose.runtime.internal.k;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import androidx.compose.ui.draw.h;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.graphics.vector.v;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.compose.ui.text.m0;
import androidx.lifecycle.j;
import androidx.lifecycle.y0;
import androidx.room.b0;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final f a = new f(false, 1503810104, new androidx.compose.foundation.contextmenu.b(13));
    public static final f b = new f(false, 1030574454, new androidx.compose.foundation.contextmenu.b(14));
    public static final f c = new f(false, -1920421103, new c0(10));
    public static final f d = new f(false, -22044616, new c0(11));
    public static final f e = new f(false, -2013179743, new c0(12));
    public static final f f = new f(false, 833508015, new c0(13));
    public static final f g = new f(false, -77371728, new c0(14));
    public static final f h = new f(false, 1997185241, new c0(15));
    public static final f i = new f(false, -988251471, new c0(6));
    public static final f j = new f(false, 1086305498, new c0(7));
    public static final f k = new f(false, -1899131214, new c0(8));
    public static final f l = new f(false, 175425755, new c0(9));

    public static final void a(com.app.mlounge.data.local.entity.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, kotlin.jvm.functions.a aVar4, kotlin.jvm.functions.a aVar5, kotlin.jvm.functions.a aVar6, kotlin.jvm.functions.a aVar7, s sVar, int i2) {
        s sVar2;
        sVar.c0(-843875838);
        int i3 = i2 | (sVar.f(aVar) ? 4 : 2) | (sVar.h(aVar2) ? 32 : 16) | (sVar.h(aVar3) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(aVar4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.h(aVar5) ? 16384 : 8192) | (sVar.h(aVar6) ? 131072 : Parser.ARGC_LIMIT) | (sVar.h(aVar7) ? 1048576 : 524288);
        if (sVar.T(i3 & 1, (599187 & i3) != 599186)) {
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = n.a;
            if (objQ == fVar) {
                objQ = t.r(Boolean.FALSE);
                sVar.l0(objQ);
            }
            a1 a1Var = (a1) objQ;
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                sVar.b0(-1461177303);
                long j2 = com.app.mlounge.ui.theme.b.b;
                androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(16);
                Object objQ2 = sVar.Q();
                if (objQ2 == fVar) {
                    objQ2 = new m(a1Var, 17);
                    sVar.l0(objQ2);
                }
                q.a((kotlin.jvm.functions.a) objQ2, k.c(-973949803, new com.app.mlounge.ui.components.f(aVar6, a1Var, 2), sVar), null, k.c(-1447185453, new androidx.compose.material3.m(a1Var, 5), sVar), c, k.c(2137928368, new g0(aVar, 22), sVar), dVarA, j2, 0L, 0L, 0L, 0.0f, null, sVar, 102435894, 0, 15892);
                sVar2 = sVar;
                sVar2.p(false);
            } else {
                sVar2 = sVar;
                sVar2.b0(-1460349696);
                sVar2.p(false);
            }
            float f2 = 8;
            p5.a(h.a(i1.e(o.b, 1.0f), androidx.compose.foundation.shape.e.a(f2)), androidx.compose.foundation.shape.e.a(f2), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, k.c(-1603559395, new b(aVar, aVar3, aVar2, aVar4, aVar5, aVar7, a1Var), sVar2), sVar, 12583296, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, i2);
        }
    }

    public static final void b(kotlin.jvm.functions.s sVar, com.app.mlounge.ui.viewmodel.o oVar, s sVar2, int i2) {
        kotlin.jvm.functions.s sVar3;
        com.app.mlounge.ui.viewmodel.o oVar2;
        int i3;
        com.app.mlounge.ui.viewmodel.o oVar3;
        boolean z;
        boolean z2;
        com.app.mlounge.ui.viewmodel.o oVar4;
        s sVar4 = sVar2;
        sVar4.c0(1672307831);
        int i4 = i2 | (sVar4.h(sVar) ? 4 : 2) | 16;
        if (sVar4.T(i4 & 1, (i4 & 19) != 18)) {
            sVar4.Y();
            if ((i2 & 1) == 0 || sVar4.C()) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar4);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i3 = i4 & (-113);
                    oVar3 = (com.app.mlounge.ui.viewmodel.o) _COROUTINE.b.J(a0.a(com.app.mlounge.ui.viewmodel.o.class), y0VarA, org.jsoup.helper.n.n(y0VarA, sVar4), y0VarA instanceof j ? ((j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar4);
                }
            } else {
                sVar4.W();
                i3 = i4 & (-113);
                oVar3 = oVar;
            }
            sVar4.q();
            a1 a1VarG = t.g(oVar3.c, sVar4);
            Object objQ = sVar4.Q();
            androidx.compose.runtime.f fVar = n.a;
            if (objQ == fVar) {
                objQ = new y();
                sVar4.l0(objQ);
            }
            y yVar = (y) objQ;
            e0 e0Var = i1.c;
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
            w wVarA = u.a(cVar, androidx.compose.ui.c.J, sVar4, 0);
            int iHashCode = Long.hashCode(sVar4.T);
            androidx.compose.runtime.internal.j jVarL = sVar4.l();
            r rVarC = androidx.compose.ui.a.c(sVar4, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = g.b;
            sVar4.e0();
            if (sVar4.S) {
                sVar4.k(fVar2);
            } else {
                sVar4.o0();
            }
            androidx.compose.ui.node.e eVar = g.f;
            t.x(sVar4, wVarA, eVar);
            androidx.compose.ui.node.e eVar2 = g.e;
            t.x(sVar4, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = g.g;
            t.p(sVar4, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = g.h;
            t.t(sVar4, dVar);
            androidx.compose.ui.node.e eVar4 = g.d;
            t.x(sVar4, rVarC, eVar4);
            m0 m0Var = ((m6) sVar4.j(n6.a)).e;
            long j2 = ((t0) sVar4.j(u0.a)).o;
            float f2 = 16;
            o oVar5 = o.b;
            z5.b("Downloads", androidx.compose.foundation.layout.b.u(oVar5, f2, f2, 0.0f, f2, 4), j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 54, 0, 131064);
            sVar4 = sVar2;
            if (((List) a1VarG.getValue()).isEmpty()) {
                sVar4.b0(1457324185);
                q0 q0VarD = p.d(androidx.compose.ui.c.B, false);
                int iHashCode2 = Long.hashCode(sVar4.T);
                androidx.compose.runtime.internal.j jVarL2 = sVar4.l();
                r rVarC2 = androidx.compose.ui.a.c(sVar4, e0Var);
                sVar4.e0();
                if (sVar4.S) {
                    sVar4.k(fVar2);
                } else {
                    sVar4.o0();
                }
                t.x(sVar4, q0VarD, eVar);
                t.x(sVar4, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar4, eVar3, sVar4, dVar);
                t.x(sVar4, rVarC2, eVar4);
                w wVarA2 = u.a(cVar, androidx.compose.ui.c.K, sVar4, 48);
                int iHashCode3 = Long.hashCode(sVar4.T);
                androidx.compose.runtime.internal.j jVarL3 = sVar4.l();
                r rVarC3 = androidx.compose.ui.a.c(sVar4, oVar5);
                sVar4.e0();
                if (sVar4.S) {
                    sVar4.k(fVar2);
                } else {
                    sVar4.o0();
                }
                t.x(sVar4, wVarA2, eVar);
                t.x(sVar4, jVarL3, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar4, eVar3, sVar4, dVar);
                t.x(sVar4, rVarC3, eVar4);
                androidx.compose.ui.graphics.vector.f fVarB = androidx.room.t.b;
                if (fVarB == null) {
                    androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.DownloadDone", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i5 = h0.a;
                    long j3 = androidx.compose.ui.graphics.t.b;
                    p0 p0Var = new p0(j3);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new androidx.compose.ui.graphics.vector.o(20.13f, 5.41f));
                    arrayList.add(new v(-1.41f, -1.41f));
                    arrayList.add(new v(-9.19f, 9.19f));
                    arrayList.add(new v(-4.25f, -4.24f));
                    arrayList.add(new v(-1.41f, 1.41f));
                    arrayList.add(new v(5.66f, 5.66f));
                    androidx.compose.ui.graphics.vector.k kVar = androidx.compose.ui.graphics.vector.k.c;
                    arrayList.add(kVar);
                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList, 0, p0Var);
                    p0 p0Var2 = new p0(j3);
                    ArrayList arrayList2 = new ArrayList(32);
                    arrayList2.add(new androidx.compose.ui.graphics.vector.o(5.0f, 18.0f));
                    arrayList2.add(new androidx.compose.ui.graphics.vector.u(14.0f));
                    arrayList2.add(new androidx.compose.ui.graphics.vector.a0(2.0f));
                    arrayList2.add(new androidx.compose.ui.graphics.vector.u(-14.0f));
                    arrayList2.add(kVar);
                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList2, 0, p0Var2);
                    fVarB = eVar5.b();
                    androidx.room.t.b = fVarB;
                }
                androidx.compose.ui.graphics.vector.f fVar3 = fVarB;
                long j4 = com.app.mlounge.ui.theme.b.m;
                q1.b(fVar3, null, i1.m(oVar5, 48), j4, sVar4, 3504, 0);
                androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar5, 8));
                z5.b("No downloads yet", null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 390, 0, 262138);
                sVar4 = sVar2;
                z = true;
                b0.g(sVar4, true, true, false);
                sVar3 = sVar;
                i2 = i2;
                oVar4 = oVar3;
            } else {
                z = true;
                sVar4.b0(1457817364);
                r rVarK = androidx.compose.ui.focus.d.k(e0Var, yVar);
                float f3 = 8;
                z0 z0Var = new z0(f2, f3, f2, f3);
                androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f3);
                boolean zF = sVar4.f(a1VarG) | sVar4.h(oVar3) | ((i3 & 14) == 4);
                Object objQ2 = sVar4.Q();
                if (zF || objQ2 == fVar) {
                    com.app.mlounge.ui.viewmodel.o oVar6 = oVar3;
                    z2 = false;
                    i0 i0Var = new i0(a1VarG, oVar6, sVar, yVar, 8);
                    oVar4 = oVar6;
                    sVar3 = sVar;
                    sVar4.l0(i0Var);
                    objQ2 = i0Var;
                } else {
                    sVar3 = sVar;
                    oVar4 = oVar3;
                    z2 = false;
                }
                android.support.v4.media.session.b.c(rVarK, null, z0Var, fVarG, null, null, false, null, (l) objQ2, sVar4, 24960, 490);
                sVar4.p(z2);
            }
            sVar4.p(z);
            oVar2 = oVar4;
        } else {
            i2 = i2;
            sVar3 = sVar;
            sVar4.W();
            oVar2 = oVar;
        }
        s1 s1VarT = sVar4.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.foundation.contextmenu.f(sVar3, oVar2, i2, 18);
        }
    }

    public static final String c(long j2) {
        if (j2 < 1024) {
            return j2 + " B";
        }
        if (j2 >= 1048576) {
            return j2 < 1073741824 ? String.format(Locale.US, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1048576.0d)}, 1)) : String.format(Locale.US, "%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1.073741824E9d)}, 1));
        }
        return (j2 / ((long) LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) + " KB";
    }
}
