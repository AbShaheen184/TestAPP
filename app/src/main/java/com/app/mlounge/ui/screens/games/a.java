package com.app.mlounge.ui.screens.games;

import android.content.Context;
import androidx.compose.animation.core.i0;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.g1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.lazy.m;
import androidx.compose.foundation.s0;
import androidx.compose.material3.internal.r0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q1;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.internal.f;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x2;
import androidx.compose.ui.h;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.m0;
import androidx.lifecycle.j;
import androidx.lifecycle.y0;
import androidx.work.impl.v;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.components.c0;
import com.app.mlounge.ui.components.o0;
import com.app.mlounge.ui.viewmodel.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.q;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a0;
import kotlin.k;
import kotlin.y;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.helper.n;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final f a = new f(false, -2014384698, new c0(16));
    public static final f b = new f(false, -1695273306, new androidx.compose.foundation.contextmenu.b(15));

    /* JADX WARN: Code duplicated, block: B:110:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:111:0x0617  */
    /* JADX WARN: Code duplicated, block: B:113:0x0623  */
    /* JADX WARN: Code duplicated, block: B:114:0x0626  */
    /* JADX WARN: Code duplicated, block: B:117:0x0634  */
    /* JADX WARN: Code duplicated, block: B:119:0x063c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0653  */
    /* JADX WARN: Code duplicated, block: B:123:0x0655  */
    /* JADX WARN: Code duplicated, block: B:129:0x0672  */
    /* JADX WARN: Code duplicated, block: B:132:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:133:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:136:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:137:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:141:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:144:0x0714  */
    /* JADX WARN: Code duplicated, block: B:147:0x0728  */
    /* JADX WARN: Code duplicated, block: B:149:0x0756  */
    /* JADX WARN: Code duplicated, block: B:152:0x076d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0788  */
    /* JADX WARN: Code duplicated, block: B:155:0x07af  */
    /* JADX WARN: Code duplicated, block: B:157:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:161:0x085d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0866  */
    /* JADX WARN: Code duplicated, block: B:165:0x086d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0876  */
    /* JADX WARN: Code duplicated, block: B:169:0x087d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0887  */
    /* JADX WARN: Code duplicated, block: B:173:0x088f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0899  */
    /* JADX WARN: Code duplicated, block: B:177:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:178:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:181:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:182:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:185:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:187:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:189:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:193:0x0921  */
    /* JADX WARN: Code duplicated, block: B:195:0x0965  */
    /* JADX WARN: Code duplicated, block: B:196:0x0969  */
    /* JADX WARN: Code duplicated, block: B:199:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:203:0x0a6c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v73 */
    /* JADX WARN: Type inference failed for: r13v10, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r13v15, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v7, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47, types: [int] */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r25v12, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r4v15, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r4v16, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r4v20, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    public static final void a(final String str, final String str2, final kotlin.jvm.functions.a aVar, r rVar, s sVar, final int i) {
        final r rVar2;
        int i2;
        r rVar3;
        androidx.compose.ui.node.f fVar;
        boolean z;
        androidx.compose.runtime.f fVar2;
        androidx.compose.runtime.f fVar3;
        int i3;
        float f;
        Context context;
        r rVar4;
        GameDetailResponse gameDetailResponse;
        i iVar;
        int i4;
        String strQ;
        androidx.compose.ui.graphics.vector.f fVarU;
        boolean z2;
        boolean zH;
        Object bVar;
        GameDetailResponse gameDetailResponse2;
        o oVar;
        float f2;
        h hVar;
        float f3;
        String str3;
        androidx.compose.ui.graphics.vector.f fVarQ;
        boolean zH2;
        Object objQ;
        ?? r12;
        ?? r13;
        String strA;
        androidx.compose.ui.node.f fVar4;
        androidx.compose.foundation.layout.c cVar;
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.e eVar2;
        androidx.compose.ui.node.e eVar3;
        int i5;
        float f4;
        ?? r14;
        String strB;
        k kVar;
        String strG;
        k kVar2;
        String strC;
        k kVar3;
        String strK;
        k kVar4;
        String strE;
        k kVar5;
        String strH;
        k kVar6;
        ArrayList<k> arrayListQ;
        int i6;
        h hVar2;
        float f5;
        float f6;
        o oVar2;
        ?? r15;
        float f7;
        ?? r4;
        androidx.compose.ui.node.f fVarB;
        boolean z3;
        ?? r16;
        androidx.compose.ui.node.f fVar5;
        boolean zF;
        Object objQ2;
        s sVar2 = sVar;
        i iVar2 = androidx.compose.ui.c.G;
        h hVar3 = androidx.compose.ui.c.J;
        aVar.getClass();
        sVar2.c0(885118496);
        int i7 = i | (sVar2.f(str) ? 4 : 2) | (sVar2.f(str2) ? 32 : 16) | (sVar2.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128) | LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (sVar2.T(i7 & 1, (i7 & 1171) != 1170)) {
            sVar2.Y();
            if ((i & 1) == 0 || sVar2.C()) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar2);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i7 & (-7169);
                    rVar3 = (r) _COROUTINE.b.J(a0.a(r.class), y0VarA, n.n(y0VarA, sVar2), y0VarA instanceof j ? ((j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar2);
                }
            } else {
                sVar2.W();
                i2 = i7 & (-7169);
                rVar3 = rVar;
            }
            sVar2.q();
            a1 a1VarG = t.g(rVar3.n, sVar2);
            a1 a1VarG2 = t.g(rVar3.p, sVar2);
            a1 a1VarG3 = t.g(rVar3.r, sVar2);
            a1 a1VarG4 = t.g(rVar3.t, sVar2);
            a1 a1VarG5 = t.g(rVar3.v, sVar2);
            a1 a1VarG6 = t.g(rVar3.K, sVar2);
            Context context2 = (Context) sVar2.j(m0.b);
            int i8 = i2 & 14;
            boolean zH3 = sVar2.h(rVar3) | ((i2 & Token.ASSIGN_MOD) == 32) | (i8 == 4);
            Object objQ3 = sVar2.Q();
            androidx.compose.runtime.f fVar6 = androidx.compose.runtime.n.a;
            if (zH3 || objQ3 == fVar6) {
                objQ3 = new d(rVar3, str2, str, null);
                sVar2.l0(objQ3);
            }
            l0.d(str, str2, (p) objQ3, sVar2);
            boolean zH4 = sVar2.h(rVar3);
            Object objQ4 = sVar2.Q();
            if (zH4 || objQ4 == fVar6) {
                objQ4 = new b(rVar3, 0);
                sVar2.l0(objQ4);
            }
            l0.b(y.a, (l) objQ4, sVar2);
            if (((Boolean) a1VarG2.getValue()).booleanValue() || ((GameDetailResponse) a1VarG.getValue()) == null) {
                final r rVar5 = rVar3;
                sVar2.b0(1761786449);
                b0.n(null, sVar2, 0);
                sVar2.s();
                s1 s1VarT = sVar2.t();
                if (s1VarT != null) {
                    final int i9 = 0;
                    s1VarT.e(new p(str, str2, aVar, rVar5, i, i9) { // from class: com.app.mlounge.ui.screens.games.c
                        public final /* synthetic */ kotlin.jvm.functions.a A;
                        public final /* synthetic */ r B;
                        public final /* synthetic */ int e;
                        public final /* synthetic */ String y;
                        public final /* synthetic */ String z;

                        {
                            this.e = i9;
                        }

                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.e) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iA = t.A(1);
                                    a.a(this.y, this.z, this.A, this.B, (s) obj, iA);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iA2 = t.A(1);
                                    a.a(this.y, this.z, this.A, this.B, (s) obj, iA2);
                                    break;
                            }
                            return y.a;
                        }
                    });
                    return;
                }
                return;
            }
            sVar2.b0(1761833538);
            sVar2.p(false);
            GameDetailResponse gameDetailResponse3 = (GameDetailResponse) a1VarG.getValue();
            gameDetailResponse3.getClass();
            boolean zF2 = sVar2.f(gameDetailResponse3.j());
            Object objQ5 = sVar2.Q();
            if (zF2 || objQ5 == fVar6) {
                String strJ = gameDetailResponse3.j();
                if (strJ == null) {
                    strJ = str;
                }
                objQ5 = t.r(Boolean.valueOf(rVar3.e(strJ)));
                sVar2.l0(objQ5);
            }
            a1 a1Var = (a1) objQ5;
            e0 e0Var = i1.c;
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar7 = g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar7);
            } else {
                sVar2.o0();
            }
            androidx.compose.ui.node.e eVar4 = g.f;
            t.x(sVar2, q0VarD, eVar4);
            androidx.compose.ui.node.e eVar5 = g.e;
            t.x(sVar2, jVarL, eVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar6 = g.g;
            t.p(sVar2, numValueOf, eVar6);
            androidx.compose.ui.node.d dVar = g.h;
            t.t(sVar2, dVar);
            androidx.compose.ui.node.e eVar7 = g.d;
            t.x(sVar2, rVarC, eVar7);
            String strF = gameDetailResponse3.f();
            o oVar3 = o.b;
            float f8 = 300;
            r rVar6 = rVar3;
            coil3.compose.k.a(strF, null, i1.g(i1.e(oVar3, 1.0f), f8), null, androidx.compose.ui.layout.i.a, sVar2, 1573296, 1976);
            androidx.compose.ui.r rVarG = i1.g(i1.e(oVar3, 1.0f), f8);
            long j = com.app.mlounge.ui.theme.b.a;
            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.e(rVarG, androidx.work.impl.model.f.t(q.k(new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.3f, j)), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.5f, j)), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.8f, j)), new androidx.compose.ui.graphics.t(j)), 0.0f, 0.0f, 14)), sVar2, 6);
            androidx.compose.ui.r rVarQ = androidx.compose.foundation.s.q(e0Var, androidx.compose.foundation.s.p(sVar2), true);
            androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.h.c;
            w wVarA = u.a(cVar2, hVar3, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarQ);
            sVar2.e0();
            if (sVar2.S) {
                fVar = fVar7;
                sVar2.k(fVar);
            } else {
                fVar = fVar7;
                sVar2.o0();
            }
            t.x(sVar2, wVarA, eVar4);
            t.x(sVar2, jVarL2, eVar5);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar6, sVar2, dVar);
            t.x(sVar2, rVarC2, eVar7);
            Object objQ6 = sVar2.Q();
            if (objQ6 == fVar6) {
                objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
            }
            androidx.compose.foundation.interaction.k kVar7 = (androidx.compose.foundation.interaction.k) objQ6;
            a1 a1VarB = _COROUTINE.a.B(kVar7, sVar2, 6);
            float f9 = 8;
            androidx.compose.ui.r rVarQ2 = androidx.compose.foundation.layout.b.q(oVar3, f9);
            androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
            float f10 = 2;
            androidx.compose.ui.node.f fVar8 = fVar;
            androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVarQ2, dVar2), f10, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, dVar2), false, null, kVar7, null, a, sVar, ((i2 >> 6) & 14) | 1597440, 44);
            androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar3, f9));
            float f11 = 16;
            androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(oVar3, f11, 0.0f, 2);
            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, iVar2, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL3 = sVar.l();
            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar, rVarS);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar8);
            } else {
                sVar.o0();
            }
            t.x(sVar, f1VarA, eVar4);
            t.x(sVar, jVarL3, eVar5);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar, eVar6, sVar, dVar);
            t.x(sVar, rVarC3, eVar7);
            androidx.compose.material3.q.c(null, androidx.compose.foundation.shape.e.a(f9), null, androidx.compose.material3.q.k(62, f9), androidx.compose.runtime.internal.k.c(-554153330, new androidx.compose.foundation.gestures.y(gameDetailResponse3, 7), sVar), sVar, 196608, 21);
            androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar3, f11));
            g1 g1Var = g1.a;
            androidx.compose.ui.r rVarA = g1.a(g1Var, oVar3, 1.0f);
            w wVarA2 = u.a(cVar2, hVar3, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL4 = sVar.l();
            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar, rVarA);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar8);
            } else {
                sVar.o0();
            }
            t.x(sVar, wVarA2, eVar4);
            t.x(sVar, jVarL4, eVar5);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar, eVar6, sVar, dVar);
            t.x(sVar, rVarC4, eVar7);
            String strD = gameDetailResponse3.d();
            if (strD == null) {
                strD = "";
            }
            x2 x2Var = n6.a;
            androidx.compose.ui.text.m0 m0Var = ((m6) sVar.j(x2Var)).f;
            long j2 = com.app.mlounge.ui.theme.b.l;
            z5.b(strD, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 384, 0, 131066);
            androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar3, f9));
            e("Platform:", ((GamePlatform) a1VarG5.getValue()).e(), sVar, 6);
            Double dI = gameDetailResponse3.i();
            if (dI == null) {
                sVar.b0(1786575307);
                sVar.p(false);
                z = false;
            } else {
                sVar.b0(1786575308);
                e("Size:", String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dI.doubleValue())}, 1)).concat(" MB"), sVar, 6);
                z = false;
                sVar.p(false);
            }
            androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar3, 12));
            boolean z4 = z;
            z5.b("Hint!", null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).h, sVar, 390, 0, 131066);
            float f12 = 4;
            androidx.compose.foundation.layout.b.e(sVar, i1.g(oVar3, f12));
            androidx.compose.ui.text.m0 m0Var2 = ((m6) sVar.j(x2Var)).l;
            long j3 = com.app.mlounge.ui.theme.b.m;
            float f13 = f12;
            z5.b("First download the game and then press Play. Enjoy!", null, j3, 0L, null, 0L, null, ((m6) sVar.j(x2Var)).l.b.c, 0, false, 0, 0, m0Var2, sVar, 390, 0, 129018);
            s sVar3 = sVar;
            sVar3.p(true);
            sVar3.p(true);
            androidx.compose.foundation.layout.b.e(sVar3, i1.g(oVar3, 24));
            androidx.compose.ui.r rVarS2 = androidx.compose.foundation.layout.b.s(i1.e(oVar3, 1.0f), f11, 0.0f, 2);
            f1 f1VarA2 = d1.a(androidx.compose.foundation.layout.h.g(f9), iVar2, sVar3, 6);
            int iHashCode5 = Long.hashCode(sVar3.T);
            androidx.compose.runtime.internal.j jVarL5 = sVar3.l();
            androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(sVar3, rVarS2);
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(fVar8);
            } else {
                sVar3.o0();
            }
            t.x(sVar3, f1VarA2, eVar4);
            t.x(sVar3, jVarL5, eVar5);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, sVar3, eVar6, sVar3, dVar);
            t.x(sVar3, rVarC5, eVar7);
            androidx.compose.ui.graphics.vector.f fVarN = okhttp3.internal.platform.android.g.n();
            boolean zF3 = sVar3.f(gameDetailResponse3) | (i8 == 4 ? true : z4) | sVar3.h(rVar6) | sVar3.h(context2);
            Object objQ7 = sVar3.Q();
            if (zF3) {
                fVar2 = fVar6;
            } else {
                if (objQ7 != fVar2) {
                    fVar2 = fVar6;
                    fVar3 = fVar2;
                    rVar4 = rVar6;
                    context = context2;
                    f = 1.0f;
                    i3 = 4;
                    gameDetailResponse = gameDetailResponse3;
                }
                iVar = iVar2;
                i4 = i3;
                androidx.compose.runtime.f fVar9 = fVar3;
                com.app.mlounge.ui.screens.movies.a.b("Play", fVarN, (kotlin.jvm.functions.a) objQ7, g1.a(g1Var, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05f0: INVOKE 
                      ("Play")
                      (r9v57 'fVarN' androidx.compose.ui.graphics.vector.f)
                      (wrap kotlin.jvm.functions.a:0x05ce: CHECK_CAST (kotlin.jvm.functions.a) (r12v40 'objQ7' java.lang.Object))
                      (wrap androidx.compose.ui.r:0x05d4: INVOKE (r8v22 'g1Var' androidx.compose.foundation.layout.g1), (r2v13 ?? I:??[OBJECT, ARRAY]), (r10v42 'f' float) STATIC call: androidx.compose.foundation.layout.g1.a(androidx.compose.foundation.layout.g1, androidx.compose.ui.r, float):androidx.compose.ui.r A[MD:(androidx.compose.foundation.layout.g1, androidx.compose.ui.r, float):androidx.compose.ui.r (m), WRAPPED] (LINE:1493))
                      false
                      (r13v6 'sVar3' androidx.compose.runtime.s)
                      (6 int)
                      (48 int)
                     STATIC call: com.app.mlounge.ui.screens.movies.a.b(java.lang.String, androidx.compose.ui.graphics.vector.f, kotlin.jvm.functions.a, androidx.compose.ui.r, boolean, androidx.compose.runtime.s, int, int):void A[MD:(java.lang.String, androidx.compose.ui.graphics.vector.f, kotlin.jvm.functions.a, androidx.compose.ui.r, boolean, androidx.compose.runtime.s, int, int):void (m)] (LINE:1521) in method: com.app.mlounge.ui.screens.games.a.a(java.lang.String, java.lang.String, kotlin.jvm.functions.a, com.app.mlounge.ui.viewmodel.r, androidx.compose.runtime.s, int):void, file: classes.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v13 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2893
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.games.a.a(java.lang.String, java.lang.String, kotlin.jvm.functions.a, com.app.mlounge.ui.viewmodel.r, androidx.compose.runtime.s, int):void");
            }

            public static final void b(String str, ArrayList arrayList, String str2, l lVar, s sVar, int i) {
                int i2;
                s sVar2 = sVar;
                sVar2.c0(1936390144);
                if ((i & 6) == 0) {
                    i2 = (sVar2.f(str) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= sVar2.h(arrayList) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= sVar2.f(str2) ? LibretroCore.SCREEN_WIDTH : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= sVar2.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                if (sVar2.T(i2 & 1, (i2 & 1171) != 1170)) {
                    Object objQ = sVar2.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                    if (objQ == fVar) {
                        objQ = t.r(Boolean.FALSE);
                        sVar2.l0(objQ);
                    }
                    a1 a1Var = (a1) objQ;
                    Object objQ2 = sVar2.Q();
                    if (objQ2 == fVar) {
                        objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
                    }
                    androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ2;
                    a1 a1VarB = _COROUTINE.a.B(kVar, sVar2, 6);
                    q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL = sVar2.l();
                    o oVar = o.b;
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, oVar);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar2);
                    } else {
                        sVar2.o0();
                    }
                    t.x(sVar2, q0VarD, g.f);
                    t.x(sVar2, jVarL, g.e);
                    t.p(sVar2, Integer.valueOf(iHashCode), g.g);
                    t.t(sVar2, g.h);
                    t.x(sVar2, rVarC, g.d);
                    float f = 8;
                    androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f));
                    Object objQ3 = sVar2.Q();
                    if (objQ3 == fVar) {
                        objQ3 = new m(a1Var, 18);
                        sVar2.l0(objQ3);
                    }
                    p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), str2 != null ? androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(364196833, new o0(str2, str, 2, (byte) 0), sVar2), sVar2, 12582912, 120);
                    boolean zBooleanValue = ((Boolean) a1Var.getValue()).booleanValue();
                    Object objQ4 = sVar2.Q();
                    if (objQ4 == fVar) {
                        objQ4 = new m(a1Var, 19);
                        sVar2.l0(objQ4);
                    }
                    androidx.compose.material3.p.a(zBooleanValue, (kotlin.jvm.functions.a) objQ4, i1.i(androidx.compose.foundation.s.f(oVar, com.app.mlounge.ui.theme.b.b, androidx.compose.ui.graphics.a0.b), 0.0f, 300, 1), 0L, null, null, null, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1720302187, new androidx.compose.foundation.contextmenu.e(arrayList, lVar, str2, a1Var, 4), sVar2), sVar, 432, 2040);
                    sVar2 = sVar;
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                s1 s1VarT = sVar2.t();
                if (s1VarT != null) {
                    s1VarT.d = new androidx.compose.material3.d(str, arrayList, str2, lVar, i, 5);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r0v14 */
            /* JADX WARN: Type inference failed for: r0v16 */
            /* JADX WARN: Type inference failed for: r0v34 */
            /* JADX WARN: Type inference failed for: r0v37 */
            /* JADX WARN: Type inference failed for: r0v38 */
            /* JADX WARN: Type inference failed for: r40v0, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r6v19 */
            /* JADX WARN: Type inference failed for: r6v20, types: [boolean] */
            /* JADX WARN: Type inference failed for: r6v22 */
            /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.runtime.s] */
            /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.s] */
            /* JADX WARN: Type inference failed for: r8v7 */
            /* JADX WARN: Type inference failed for: r8v8 */
            public static final void c(final GamePlatform gamePlatform, final List list, final List list2, final String str, final String str2, boolean z, final l lVar, final l lVar2, final l lVar3, final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, s sVar, final int i) {
                boolean z2;
                androidx.compose.ui.r rVar2;
                ?? r8;
                androidx.compose.runtime.f fVar;
                ?? string;
                String string2;
                ?? r9 = sVar;
                r9.c0(-1763075841);
                int i2 = i | (r9.d(gamePlatform.ordinal()) ? 4 : 2) | (r9.h(list) ? 32 : 16) | (r9.h(list2) ? LibretroCore.SCREEN_WIDTH : 128) | (r9.f(str) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (r9.f(str2) ? 16384 : 8192) | (r9.g(z) ? 131072 : Parser.ARGC_LIMIT) | (r9.h(lVar) ? 1048576 : 524288) | (r9.h(lVar2) ? 8388608 : 4194304) | (r9.h(lVar3) ? 67108864 : 33554432) | (r9.h(aVar) ? 536870912 : 268435456);
                if (r9.T(i2 & 1, (i2 & 306783379) != 306783378)) {
                    o oVar = o.b;
                    float f = 8;
                    androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(r9), false), 12, f);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(f), androidx.compose.ui.c.H, r9, 54);
                    int iHashCode = Long.hashCode(r9.T);
                    androidx.compose.runtime.internal.j jVarL = r9.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(r9, rVarR);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = g.b;
                    r9.e0();
                    if (r9.S) {
                        r9.k(fVar2);
                    } else {
                        r9.o0();
                    }
                    t.x(r9, f1VarA, g.f);
                    t.x(r9, jVarL, g.e);
                    t.p(r9, Integer.valueOf(iHashCode), g.g);
                    t.t(r9, g.h);
                    t.x(r9, rVarC, g.d);
                    o oVar2 = oVar;
                    ?? r0 = 0;
                    q1.b(_COROUTINE.a.N(), "Filters", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.m, r9, 3504, 0);
                    r9.b0(1922654338);
                    Iterator it = GamePlatform.f().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        fVar = androidx.compose.runtime.n.a;
                        if (!zHasNext) {
                            break;
                        }
                        GamePlatform gamePlatform2 = (GamePlatform) it.next();
                        ?? r6 = gamePlatform == gamePlatform2 ? 1 : r0;
                        Object objQ = r9.Q();
                        if (objQ == fVar) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(r9);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                        o oVar3 = oVar2;
                        androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar2, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) _COROUTINE.a.B(kVar, r9, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f));
                        boolean zD = ((i2 & 3670016) == 1048576) | r9.d(gamePlatform2.ordinal());
                        Object objQ2 = r9.Q();
                        if (zD || objQ2 == fVar) {
                            objQ2 = new com.app.mlounge.ui.screens.adult.b(5, lVar, gamePlatform2);
                            r9.l0(objQ2);
                        }
                        p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), r6 != 0 ? androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-301515982, new androidx.activity.compose.i(gamePlatform2, (boolean) r6, 4), r9), r9, 12582912, 120);
                        oVar2 = oVar3;
                        r0 = 0;
                    }
                    o oVar4 = oVar2;
                    r9.p(r0);
                    if (str == 0) {
                        string = "Genre";
                    } else if (str.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String strValueOf = String.valueOf(str.charAt(r0));
                        strValueOf.getClass();
                        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        sb.append((Object) upperCase);
                        sb.append(str.substring(1));
                        string = sb.toString();
                    } else {
                        string = str;
                    }
                    List listJ = q.j(new k(null, "All Genres"));
                    ArrayList arrayList = new ArrayList(kotlin.collections.r.p(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        if (str3.length() > 0) {
                            StringBuilder sb2 = new StringBuilder();
                            String strValueOf2 = String.valueOf(str3.charAt(0));
                            strValueOf2.getClass();
                            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                            upperCase2.getClass();
                            sb2.append((Object) upperCase2);
                            sb2.append(str3.substring(1));
                            string2 = sb2.toString();
                        } else {
                            string2 = str3;
                        }
                        arrayList.add(new k(str3, string2));
                    }
                    ?? r4 = string;
                    rVar2 = oVar4;
                    b(r4, kotlin.collections.p.O(listJ, arrayList), str, lVar2, r9, ((i2 >> 3) & 896) | ((i2 >> 12) & 7168));
                    String str4 = str2 == null ? "Decade" : str2;
                    List listJ2 = q.j(new k(null, "All Decades"));
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.r.p(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        String str5 = (String) it3.next();
                        arrayList2.add(new k(str5, str5));
                    }
                    s sVar2 = sVar;
                    b(str4, kotlin.collections.p.O(listJ2, arrayList2), str2, lVar3, sVar2, ((i2 >> 6) & 896) | ((i2 >> 15) & 7168));
                    Object objQ3 = sVar2.Q();
                    if (objQ3 == fVar) {
                        objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
                    }
                    androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ3;
                    androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVar2, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) _COROUTINE.a.B(kVar2, sVar2, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f));
                    boolean z3 = (i2 & 1879048192) == 536870912;
                    Object objQ4 = sVar2.Q();
                    if (z3 || objQ4 == fVar) {
                        objQ4 = new androidx.compose.material3.x2(9, aVar);
                        sVar2.l0(objQ4);
                    }
                    z2 = z;
                    p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG2, kVar2, null, false, null, (kotlin.jvm.functions.a) objQ4, 28), kVar2, 1), androidx.compose.foundation.shape.e.a(f), z ? androidx.compose.ui.graphics.t.b(0.3f, androidx.compose.ui.graphics.a0.d(4293467747L)) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1841374240, new com.app.mlounge.ui.components.o(z2, 2, (byte) 0), sVar2), sVar2, 12582912, 120);
                    sVar2.p(true);
                    r8 = sVar2;
                } else {
                    z2 = z;
                    r9.W();
                    rVar2 = rVar;
                    r8 = r9;
                }
                s1 s1VarT = r8.t();
                if (s1VarT != null) {
                    final androidx.compose.ui.r rVar3 = rVar2;
                    final boolean z4 = z2;
                    s1VarT.d = new p(list, list2, str, str2, z4, lVar, lVar2, lVar3, aVar, rVar3, i) { // from class: com.app.mlounge.ui.screens.games.e
                        public final /* synthetic */ String A;
                        public final /* synthetic */ String B;
                        public final /* synthetic */ boolean C;
                        public final /* synthetic */ l D;
                        public final /* synthetic */ l E;
                        public final /* synthetic */ l F;
                        public final /* synthetic */ kotlin.jvm.functions.a G;
                        public final /* synthetic */ androidx.compose.ui.r H;
                        public final /* synthetic */ List y;
                        public final /* synthetic */ List z;

                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = t.A(1);
                            a.c(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (s) obj, iA);
                            return y.a;
                        }
                    };
                }
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0468  */
            /* JADX WARN: Code duplicated, block: B:45:0x0248  */
            /* JADX WARN: Code duplicated, block: B:49:0x025f  */
            /* JADX WARN: Code duplicated, block: B:53:0x0277  */
            /* JADX WARN: Code duplicated, block: B:56:0x02a2  */
            /* JADX WARN: Code duplicated, block: B:58:0x02b4  */
            /* JADX WARN: Code duplicated, block: B:60:0x02d8  */
            /* JADX WARN: Code duplicated, block: B:62:0x02e0  */
            /* JADX WARN: Code duplicated, block: B:64:0x0339  */
            /* JADX WARN: Code duplicated, block: B:66:0x036b  */
            /* JADX WARN: Code duplicated, block: B:67:0x036d  */
            /* JADX WARN: Code duplicated, block: B:73:0x037b  */
            /* JADX WARN: Code duplicated, block: B:77:0x03a2  */
            /* JADX WARN: Code duplicated, block: B:82:0x03cb  */
            /* JADX WARN: Code duplicated, block: B:84:0x03d3  */
            /* JADX WARN: Code duplicated, block: B:95:0x044e  */
            /* JADX WARN: Code duplicated, block: B:96:0x0450  */
            /* JADX WARN: Code duplicated, block: B:99:0x0466 A[ADDED_TO_REGION] */
            public static final void d(p pVar, r rVar, s sVar, int i) {
                s sVar2;
                r rVar2;
                int i2;
                r rVar3;
                a1 a1Var;
                r rVar4;
                a1 a1Var2;
                androidx.compose.runtime.f fVar;
                boolean zH;
                Object objQ;
                boolean zH2;
                Object objQ2;
                boolean zH3;
                Object objQ3;
                boolean z;
                boolean z2;
                boolean zF;
                Object objQ4;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                Object objQ5;
                pVar.getClass();
                sVar.c0(519157550);
                int i3 = i | (sVar.h(pVar) ? 4 : 2) | 16;
                if (sVar.T(i3 & 1, (i3 & 19) != 18)) {
                    sVar.Y();
                    if ((i & 1) == 0 || sVar.C()) {
                        y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar);
                        if (y0VarA == null) {
                            kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        } else {
                            i2 = i3 & (-113);
                            rVar3 = (r) _COROUTINE.b.J(a0.a(r.class), y0VarA, n.n(y0VarA, sVar), y0VarA instanceof j ? ((j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar);
                        }
                    } else {
                        sVar.W();
                        i2 = i3 & (-113);
                        rVar3 = rVar;
                    }
                    sVar.q();
                    a1 a1VarG = t.g(rVar3.f, sVar);
                    a1 a1VarG2 = t.g(rVar3.h, sVar);
                    a1 a1VarG3 = t.g(rVar3.j, sVar);
                    a1 a1VarG4 = t.g(rVar3.l, sVar);
                    a1 a1VarG5 = t.g(rVar3.v, sVar);
                    a1 a1VarG6 = t.g(rVar3.z, sVar);
                    a1 a1VarG7 = t.g(rVar3.B, sVar);
                    a1 a1VarG8 = t.g(rVar3.D, sVar);
                    a1 a1VarG9 = t.g(rVar3.F, sVar);
                    a1 a1VarG10 = t.g(rVar3.H, sVar);
                    a1 a1VarG11 = t.g(rVar3.I, sVar);
                    x xVarA = z.a(0, 0, sVar, 3);
                    boolean zF2 = sVar.f(xVarA) | sVar.f(a1VarG10) | sVar.f(a1VarG) | sVar.h(rVar3);
                    Object objQ6 = sVar.Q();
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                    if (zF2 || objQ6 == fVar2) {
                        a1Var = a1VarG;
                        rVar4 = rVar3;
                        objQ6 = new androidx.compose.animation.core.f(xVarA, rVar4, a1VarG10, a1Var, null, 16);
                        a1Var2 = a1VarG10;
                        sVar.l0(objQ6);
                    } else {
                        a1Var = a1VarG;
                        a1Var2 = a1VarG10;
                        rVar4 = rVar3;
                    }
                    l0.c(sVar, xVarA, (p) objQ6);
                    e0 e0Var = i1.c;
                    w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, e0Var);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar3 = g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar3);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.ui.node.e eVar = g.f;
                    t.x(sVar, wVarA, eVar);
                    androidx.compose.ui.node.e eVar2 = g.e;
                    t.x(sVar, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = g.g;
                    t.p(sVar, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = g.h;
                    t.t(sVar, dVar);
                    androidx.compose.ui.node.e eVar4 = g.d;
                    t.x(sVar, rVarC, eVar4);
                    x2 x2Var = n6.a;
                    androidx.compose.ui.text.m0 m0Var = ((m6) sVar.j(x2Var)).e;
                    x2 x2Var2 = u0.a;
                    int i4 = i2;
                    long j = ((t0) sVar.j(x2Var2)).o;
                    float f = 16;
                    o oVar = o.b;
                    r rVar5 = rVar4;
                    a1 a1Var3 = a1Var;
                    z5.b("Games", androidx.compose.foundation.layout.b.u(oVar, f, f, 0.0f, 4, 4), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 54, 0, 131064);
                    float f2 = 8;
                    z5.b("Retro Game Library - To change emulator settings go to Settings > Emulator Settings", androidx.compose.foundation.layout.b.u(oVar, f, 0.0f, 0.0f, f2, 6), ((t0) sVar.j(x2Var2)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).l, sVar, 54, 0, 131064);
                    GamePlatform gamePlatform = (GamePlatform) a1VarG5.getValue();
                    List list = (List) a1VarG6.getValue();
                    List list2 = (List) a1VarG7.getValue();
                    String str = (String) a1VarG8.getValue();
                    String str2 = (String) a1VarG9.getValue();
                    boolean zBooleanValue = ((Boolean) a1Var2.getValue()).booleanValue();
                    boolean zH4 = sVar.h(rVar5);
                    Object objQ7 = sVar.Q();
                    if (zH4) {
                        fVar = fVar2;
                    } else {
                        fVar = fVar2;
                        if (objQ7 == fVar) {
                        }
                        l lVar = (l) objQ7;
                        zH = sVar.h(rVar5);
                        objQ = sVar.Q();
                        if (zH || objQ == fVar) {
                            objQ = new b(rVar5, 2);
                            sVar.l0(objQ);
                        }
                        l lVar2 = (l) objQ;
                        zH2 = sVar.h(rVar5);
                        objQ2 = sVar.Q();
                        if (zH2 || objQ2 == fVar) {
                            objQ2 = new b(rVar5, 3);
                            sVar.l0(objQ2);
                        }
                        l lVar3 = (l) objQ2;
                        zH3 = sVar.h(rVar5);
                        objQ3 = sVar.Q();
                        if (zH3 || objQ3 == fVar) {
                            objQ3 = new androidx.navigation.internal.h(rVar5, 22);
                            sVar.l0(objQ3);
                        }
                        androidx.compose.runtime.f fVar4 = fVar;
                        r rVar6 = rVar5;
                        c(gamePlatform, list, list2, str, str2, zBooleanValue, lVar, lVar2, lVar3, (kotlin.jvm.functions.a) objQ3, null, sVar, 0);
                        if (((Boolean) a1Var2.getValue()).booleanValue()) {
                            sVar.b0(-439408175);
                            if (((List) a1VarG11.getValue()).isEmpty()) {
                                sVar.b0(-439397139);
                                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                                int iHashCode2 = Long.hashCode(sVar.T);
                                androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, e0Var);
                                sVar.e0();
                                if (sVar.S) {
                                    sVar.k(fVar3);
                                } else {
                                    sVar.o0();
                                }
                                t.x(sVar, q0VarD, eVar);
                                t.x(sVar, jVarL2, eVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar);
                                t.x(sVar, rVarC2, eVar4);
                                z4 = false;
                                z5.b("No favourites yet. Add games from their detail page!", null, ((t0) sVar.j(x2Var2)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).k, sVar, 6, 0, 131066);
                                z = true;
                                sVar.p(true);
                                sVar.p(false);
                                sVar2 = sVar;
                            } else {
                                z4 = false;
                                z = true;
                                sVar.b0(-438816230);
                                androidx.compose.foundation.lazy.grid.a aVar = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar.j(com.app.mlounge.ui.theme.g.a)).y);
                                float f3 = 12;
                                z0 z0Var = new z0(f3, f3, f3, f3);
                                androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f2);
                                androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f2);
                                boolean zF3 = sVar.f(a1VarG11);
                                if ((i4 & 14) == 4) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                z6 = zF3 | z5;
                                objQ5 = sVar.Q();
                                if (z6 || objQ5 == fVar4) {
                                    objQ5 = new r0(a1VarG11, pVar);
                                    sVar.l0(objQ5);
                                }
                                v.b(aVar, e0Var, null, z0Var, fVarG2, fVarG, null, false, null, (l) objQ5, sVar, 1772592, 916);
                                sVar2 = sVar;
                                sVar2.p(false);
                            }
                            sVar2.p(z4);
                        } else {
                            sVar2 = sVar;
                            z = true;
                            if (((Boolean) a1VarG2.getValue()).booleanValue() || !((List) a1Var3.getValue()).isEmpty()) {
                                if (((String) a1VarG4.getValue()) == null && ((List) a1Var3.getValue()).isEmpty()) {
                                    sVar2.b0(-1815232731);
                                    String str3 = (String) a1VarG4.getValue();
                                    str3.getClass();
                                    rVar6 = rVar6;
                                    boolean zH5 = sVar2.h(rVar6);
                                    Object objQ8 = sVar2.Q();
                                    if (zH5 || objQ8 == fVar4) {
                                        s0 s0Var = new s0(0, rVar6, r.class, "loadGames", "loadGames()V", 0, 6);
                                        sVar2.l0(s0Var);
                                        objQ8 = s0Var;
                                    }
                                    b0.i(str3, null, (kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ8), sVar2, 0);
                                    sVar2.p(false);
                                } else {
                                    sVar2.b0(-437443240);
                                    androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y);
                                    float f4 = 12;
                                    z0 z0Var2 = new z0(f4, f4, f4, f4);
                                    androidx.compose.foundation.layout.f fVarG3 = androidx.compose.foundation.layout.h.g(f2);
                                    androidx.compose.foundation.layout.f fVarG4 = androidx.compose.foundation.layout.h.g(f2);
                                    boolean zF4 = sVar2.f(a1Var3);
                                    if ((i4 & 14) == 4) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    zF = zF4 | z2 | sVar2.f(a1VarG5) | sVar2.f(a1VarG3);
                                    objQ4 = sVar2.Q();
                                    if (!zF || objQ4 == fVar4) {
                                        z3 = false;
                                        i0 i0Var = new i0((Object) a1Var3, (Object) pVar, a1VarG5, a1VarG3, 9);
                                        sVar2.l0(i0Var);
                                        objQ4 = i0Var;
                                    } else {
                                        z3 = false;
                                    }
                                    v.b(aVar2, e0Var, xVarA, z0Var2, fVarG4, fVarG3, null, false, null, (l) objQ4, sVar, 1772592, 912);
                                    sVar2 = sVar;
                                    sVar2.p(z3);
                                }
                                sVar2.p(z);
                                rVar2 = rVar6;
                            } else {
                                sVar2.b0(-1815234966);
                                b0.n(null, sVar2, 0);
                                sVar2.p(false);
                            }
                        }
                        i = i;
                        z = z;
                        sVar2.p(z);
                        rVar2 = rVar6;
                    }
                    objQ7 = new b(rVar5, 1);
                    sVar.l0(objQ7);
                    l lVar4 = (l) objQ7;
                    zH = sVar.h(rVar5);
                    objQ = sVar.Q();
                    if (zH) {
                        objQ = new b(rVar5, 2);
                        sVar.l0(objQ);
                    } else {
                        objQ = new b(rVar5, 2);
                        sVar.l0(objQ);
                    }
                    l lVar5 = (l) objQ;
                    zH2 = sVar.h(rVar5);
                    objQ2 = sVar.Q();
                    if (zH2) {
                        objQ2 = new b(rVar5, 3);
                        sVar.l0(objQ2);
                    } else {
                        objQ2 = new b(rVar5, 3);
                        sVar.l0(objQ2);
                    }
                    l lVar6 = (l) objQ2;
                    zH3 = sVar.h(rVar5);
                    objQ3 = sVar.Q();
                    if (zH3) {
                        objQ3 = new androidx.navigation.internal.h(rVar5, 22);
                        sVar.l0(objQ3);
                    } else {
                        objQ3 = new androidx.navigation.internal.h(rVar5, 22);
                        sVar.l0(objQ3);
                    }
                    androidx.compose.runtime.f fVar5 = fVar;
                    r rVar7 = rVar5;
                    c(gamePlatform, list, list2, str, str2, zBooleanValue, lVar4, lVar5, lVar6, (kotlin.jvm.functions.a) objQ3, null, sVar, 0);
                    if (((Boolean) a1Var2.getValue()).booleanValue()) {
                        sVar.b0(-439408175);
                        if (((List) a1VarG11.getValue()).isEmpty()) {
                            sVar.b0(-439397139);
                            q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                            int iHashCode3 = Long.hashCode(sVar.T);
                            androidx.compose.runtime.internal.j jVarL3 = sVar.l();
                            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar, e0Var);
                            sVar.e0();
                            if (sVar.S) {
                                sVar.k(fVar3);
                            } else {
                                sVar.o0();
                            }
                            t.x(sVar, q0VarD2, eVar);
                            t.x(sVar, jVarL3, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar, eVar3, sVar, dVar);
                            t.x(sVar, rVarC3, eVar4);
                            z4 = false;
                            z5.b("No favourites yet. Add games from their detail page!", null, ((t0) sVar.j(x2Var2)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).k, sVar, 6, 0, 131066);
                            z = true;
                            sVar.p(true);
                            sVar.p(false);
                            sVar2 = sVar;
                        } else {
                            z4 = false;
                            z = true;
                            sVar.b0(-438816230);
                            androidx.compose.foundation.lazy.grid.a aVar3 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar.j(com.app.mlounge.ui.theme.g.a)).y);
                            float f5 = 12;
                            z0 z0Var3 = new z0(f5, f5, f5, f5);
                            androidx.compose.foundation.layout.f fVarG5 = androidx.compose.foundation.layout.h.g(f2);
                            androidx.compose.foundation.layout.f fVarG6 = androidx.compose.foundation.layout.h.g(f2);
                            boolean zF5 = sVar.f(a1VarG11);
                            if ((i4 & 14) == 4) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z6 = zF5 | z5;
                            objQ5 = sVar.Q();
                            if (z6) {
                                objQ5 = new r0(a1VarG11, pVar);
                                sVar.l0(objQ5);
                            } else {
                                objQ5 = new r0(a1VarG11, pVar);
                                sVar.l0(objQ5);
                            }
                            v.b(aVar3, e0Var, null, z0Var3, fVarG6, fVarG5, null, false, null, (l) objQ5, sVar, 1772592, 916);
                            sVar2 = sVar;
                            sVar2.p(false);
                        }
                        sVar2.p(z4);
                    } else {
                        sVar2 = sVar;
                        z = true;
                        if (((Boolean) a1VarG2.getValue()).booleanValue()) {
                            if (((String) a1VarG4.getValue()) == null) {
                            }
                            sVar2.b0(-437443240);
                            androidx.compose.foundation.lazy.grid.a aVar4 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y);
                            float f6 = 12;
                            z0 z0Var4 = new z0(f6, f6, f6, f6);
                            androidx.compose.foundation.layout.f fVarG7 = androidx.compose.foundation.layout.h.g(f2);
                            androidx.compose.foundation.layout.f fVarG8 = androidx.compose.foundation.layout.h.g(f2);
                            boolean zF6 = sVar2.f(a1Var3);
                            if ((i4 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zF = zF6 | z2 | sVar2.f(a1VarG5) | sVar2.f(a1VarG3);
                            objQ4 = sVar2.Q();
                            if (zF) {
                                z3 = false;
                                i0 i0Var2 = new i0((Object) a1Var3, (Object) pVar, a1VarG5, a1VarG3, 9);
                                sVar2.l0(i0Var2);
                                objQ4 = i0Var2;
                            } else {
                                z3 = false;
                                i0 i0Var3 = new i0((Object) a1Var3, (Object) pVar, a1VarG5, a1VarG3, 9);
                                sVar2.l0(i0Var3);
                                objQ4 = i0Var3;
                            }
                            v.b(aVar4, e0Var, xVarA, z0Var4, fVarG8, fVarG7, null, false, null, (l) objQ4, sVar, 1772592, 912);
                            sVar2 = sVar;
                            sVar2.p(z3);
                        } else {
                            if (((String) a1VarG4.getValue()) == null) {
                            }
                            sVar2.b0(-437443240);
                            androidx.compose.foundation.lazy.grid.a aVar5 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y);
                            float f7 = 12;
                            z0 z0Var5 = new z0(f7, f7, f7, f7);
                            androidx.compose.foundation.layout.f fVarG9 = androidx.compose.foundation.layout.h.g(f2);
                            androidx.compose.foundation.layout.f fVarG10 = androidx.compose.foundation.layout.h.g(f2);
                            boolean zF7 = sVar2.f(a1Var3);
                            if ((i4 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zF = zF7 | z2 | sVar2.f(a1VarG5) | sVar2.f(a1VarG3);
                            objQ4 = sVar2.Q();
                            if (zF) {
                                z3 = false;
                                i0 i0Var4 = new i0((Object) a1Var3, (Object) pVar, a1VarG5, a1VarG3, 9);
                                sVar2.l0(i0Var4);
                                objQ4 = i0Var4;
                            } else {
                                z3 = false;
                                i0 i0Var5 = new i0((Object) a1Var3, (Object) pVar, a1VarG5, a1VarG3, 9);
                                sVar2.l0(i0Var5);
                                objQ4 = i0Var5;
                            }
                            v.b(aVar5, e0Var, xVarA, z0Var5, fVarG10, fVarG9, null, false, null, (l) objQ4, sVar, 1772592, 912);
                            sVar2 = sVar;
                            sVar2.p(z3);
                        }
                        sVar2.p(z);
                        rVar2 = rVar7;
                    }
                    i = i;
                    z = z;
                    sVar2.p(z);
                    rVar2 = rVar7;
                } else {
                    sVar2 = sVar;
                    i = i;
                    sVar2.W();
                    rVar2 = rVar;
                }
                s1 s1VarT = sVar2.t();
                if (s1VarT != null) {
                    s1VarT.d = new androidx.compose.foundation.contextmenu.f(pVar, rVar2, i, 19);
                }
            }

            public static final void e(String str, String str2, s sVar, int i) {
                String str3 = str2;
                s sVar2 = sVar;
                sVar2.c0(-366913024);
                int i2 = i | (sVar2.f(str3) ? 32 : 16);
                if (sVar2.T(i2 & 1, (i2 & 19) != 18)) {
                    androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(o.b, 0.0f, 2, 1);
                    f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.G, sVar2, 6);
                    int iHashCode = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL = sVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, rVarS);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar);
                    } else {
                        sVar2.o0();
                    }
                    t.x(sVar2, f1VarA, g.f);
                    t.x(sVar2, jVarL, g.e);
                    t.p(sVar2, Integer.valueOf(iHashCode), g.g);
                    t.t(sVar2, g.h);
                    t.x(sVar2, rVarC, g.d);
                    x2 x2Var = n6.a;
                    z5.b(str, null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar2, 390, 0, 131066);
                    str3 = str2;
                    z5.b(str3, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var)).l, sVar, ((i2 >> 3) & 14) | 384, 0, 131066);
                    sVar2 = sVar;
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                s1 s1VarT = sVar2.t();
                if (s1VarT != null) {
                    s1VarT.d = new o0(str, str3, i);
                }
            }
        }
