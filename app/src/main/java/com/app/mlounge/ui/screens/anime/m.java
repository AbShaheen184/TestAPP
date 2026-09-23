package com.app.mlounge.ui.screens.anime;

import androidx.compose.animation.core.i0;
import androidx.compose.foundation.gestures.b2;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.b0;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.lazy.y;
import androidx.compose.foundation.s0;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.s4;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.s2;
import androidx.compose.runtime.t;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.o;
import androidx.compose.ui.text.m0;
import androidx.lifecycle.y0;
import androidx.work.impl.v;
import com.app.mlounge.data.remote.model.HiAnimeAnimeData;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.HiAnimeMoreInfo;
import com.app.mlounge.data.repository.x;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.c0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.flow.FlowKt;
import org.jsoup.helper.n;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(false, 1049527750, new c0(5));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(false, -1642812827, new androidx.compose.foundation.contextmenu.b(11));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(false, 1269196283, new androidx.compose.foundation.contextmenu.b(12));

    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.ui.r, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r3v56 */
    public static final void a(final String str, final kotlin.jvm.functions.a aVar, final kotlin.jvm.functions.l lVar, final q qVar, final r rVar, com.app.mlounge.ui.viewmodel.g gVar, s sVar, final int i, final int i2) {
        int i3;
        com.app.mlounge.ui.viewmodel.g gVar2;
        final com.app.mlounge.ui.viewmodel.g gVar3;
        Object c0Var;
        androidx.compose.runtime.f fVar;
        a1 a1Var;
        s sVar2;
        final com.app.mlounge.ui.viewmodel.g gVar4;
        kotlin.coroutines.d dVar;
        a1 a1Var2;
        ?? r3;
        boolean z;
        final com.app.mlounge.ui.viewmodel.g gVar5;
        int i4;
        s sVar3 = sVar;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        qVar.getClass();
        rVar.getClass();
        sVar3.c0(-7504691);
        if ((i & 6) == 0) {
            i3 = (sVar3.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar3.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar3.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar3.h(rVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                gVar2 = gVar;
                if (sVar3.h(gVar2)) {
                    i4 = 131072;
                }
                i3 |= i4;
            } else {
                gVar2 = gVar;
            }
            i4 = Parser.ARGC_LIMIT;
            i3 |= i4;
        } else {
            gVar2 = gVar;
        }
        if (sVar3.T(i3 & 1, (73875 & i3) != 73874)) {
            sVar3.Y();
            if ((i & 1) != 0 && !sVar3.C()) {
                sVar3.W();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            } else if ((i2 & 32) != 0) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar3);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    gVar2 = (com.app.mlounge.ui.viewmodel.g) _COROUTINE.b.J(a0.a(com.app.mlounge.ui.viewmodel.g.class), y0VarA, n.n(y0VarA, sVar3), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar3);
                    i3 &= -458753;
                }
            }
            com.app.mlounge.ui.viewmodel.g gVar6 = gVar2;
            int i5 = i3;
            sVar3.q();
            a1 a1VarG = t.g(gVar6.u, sVar3);
            a1 a1VarG2 = t.g(gVar6.w, sVar3);
            final a1 a1VarG3 = t.g(gVar6.y, sVar3);
            String strConcat = "anime_movie_".concat(str);
            String strConcat2 = "anime_tv_".concat(str);
            x xVar = gVar6.c;
            a1 a1VarF = t.f(FlowKt.combine(xVar.c(strConcat), xVar.c(strConcat2), new com.app.mlounge.ui.viewmodel.e(3, 0, null)), Boolean.FALSE, null, sVar3, 48, 2);
            final a1 a1VarG4 = t.g(gVar6.d, sVar3);
            final a1 a1VarG5 = t.g(gVar6.e, sVar3);
            y yVarA = b0.a(gVar6.E.g(), gVar6.F.g(), sVar3, 0);
            boolean zF = sVar3.f(yVarA) | sVar3.h(gVar6);
            Object objQ = sVar3.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
            if (zF || objQ == fVar2) {
                objQ = new androidx.room.s(yVarA, gVar6, null, 11);
                sVar3.l0(objQ);
            }
            l0.c(sVar3, yVarA, (p) objQ);
            Object objQ2 = sVar3.Q();
            if (objQ2 == fVar2) {
                objQ2 = new androidx.compose.ui.focus.y();
                sVar3.l0(objQ2);
            }
            final androidx.compose.ui.focus.y yVar = (androidx.compose.ui.focus.y) objQ2;
            Object objQ3 = sVar3.Q();
            if (objQ3 == fVar2) {
                objQ3 = new LinkedHashMap();
                sVar3.l0(objQ3);
            }
            Map map = (Map) objQ3;
            HiAnimeDetailData hiAnimeDetailData = (HiAnimeDetailData) a1VarG.getValue();
            boolean zF2 = sVar3.f(a1VarG) | sVar3.h(gVar6);
            Object objQ4 = sVar3.Q();
            if (zF2 || objQ4 == fVar2) {
                fVar = fVar2;
                a1Var = a1VarF;
                sVar2 = sVar3;
                c0Var = new androidx.room.coroutines.c0(gVar6, yVar, a1VarG, (kotlin.coroutines.d) null, 12);
                gVar4 = gVar6;
                dVar = null;
                a1Var2 = a1VarG;
                sVar2.l0(c0Var);
            } else {
                fVar = fVar2;
                a1Var2 = a1VarG;
                gVar4 = gVar6;
                a1Var = a1VarF;
                c0Var = objQ4;
                sVar2 = sVar3;
                dVar = null;
            }
            l0.c(sVar2, hiAnimeDetailData, (p) c0Var);
            List list = (List) a1VarG3.getValue();
            boolean zF3 = sVar2.f(a1VarG3) | sVar2.h(gVar4) | sVar2.h(map);
            Object objQ5 = sVar2.Q();
            if (zF3 || objQ5 == fVar) {
                com.app.mlounge.ui.viewmodel.g gVar7 = gVar4;
                kotlin.coroutines.d dVar2 = dVar;
                androidx.room.coroutines.c0 c0Var2 = new androidx.room.coroutines.c0(gVar7, map, a1VarG3, dVar2, 13);
                gVar4 = gVar7;
                r3 = dVar2;
                map = map;
                sVar2.l0(c0Var2);
                objQ5 = c0Var2;
            } else {
                r3 = dVar;
            }
            l0.c(sVar2, list, (p) objQ5);
            boolean zH = sVar2.h(gVar4) | ((i5 & 14) == 4);
            Object objQ6 = sVar2.Q();
            if (zH || objQ6 == fVar) {
                objQ6 = new androidx.compose.foundation.text.input.internal.k(gVar4, str, r3, 9);
                sVar2.l0(objQ6);
            }
            l0.c(sVar2, str, (p) objQ6);
            boolean zH2 = sVar2.h(gVar4);
            Object objQ7 = sVar2.Q();
            if (zH2 || objQ7 == fVar) {
                objQ7 = new s2(gVar4, 14);
                sVar2.l0(objQ7);
            }
            l0.b(kotlin.y.a, (kotlin.jvm.functions.l) objQ7, sVar2);
            if (((Boolean) a1VarG2.getValue()).booleanValue() || ((HiAnimeDetailData) a1Var2.getValue()) == null) {
                s sVar4 = sVar2;
                final com.app.mlounge.ui.viewmodel.g gVar8 = gVar4;
                sVar4.b0(-231966249);
                com.app.mlounge.ui.components.b0.n(r3, sVar4, 0);
                sVar4.p(false);
                s1 s1VarT = sVar4.t();
                if (s1VarT != null) {
                    final int i6 = 0;
                    s1VarT.d = new p() { // from class: com.app.mlounge.ui.screens.anime.c
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i6) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar8, (s) obj, t.A(i | 1), i2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar8, (s) obj, t.A(i | 1), i2);
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar8, (s) obj, t.A(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar8, (s) obj, t.A(i | 1), i2);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    return;
                }
                return;
            }
            sVar2.b0(-231937419);
            sVar2.p(false);
            final HiAnimeDetailData hiAnimeDetailData2 = (HiAnimeDetailData) a1Var2.getValue();
            hiAnimeDetailData2.getClass();
            HiAnimeAnimeData hiAnimeAnimeDataA = hiAnimeDetailData2.a();
            if (hiAnimeAnimeDataA == null) {
                s1 s1VarT2 = sVar2.t();
                if (s1VarT2 != null) {
                    final int i7 = 1;
                    s1VarT2.d = new p() { // from class: com.app.mlounge.ui.screens.anime.c
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i7) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar4, (s) obj, t.A(i | 1), i2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar4, (s) obj, t.A(i | 1), i2);
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar4, (s) obj, t.A(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar4, (s) obj, t.A(i | 1), i2);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    return;
                }
                return;
            }
            final HiAnimeInfo hiAnimeInfoA = hiAnimeAnimeDataA.a();
            if (hiAnimeInfoA == null) {
                s1 s1VarT3 = sVar2.t();
                if (s1VarT3 != null) {
                    final int i8 = 2;
                    s1VarT3.d = new p() { // from class: com.app.mlounge.ui.screens.anime.c
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar4, (s) obj, t.A(i | 1), i2);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar4, (s) obj, t.A(i | 1), i2);
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar4, (s) obj, t.A(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    m.a(str, aVar, lVar, qVar, rVar, gVar4, (s) obj, t.A(i | 1), i2);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    return;
                }
                return;
            }
            final HiAnimeMoreInfo hiAnimeMoreInfoB = hiAnimeAnimeDataA.b();
            e0 e0Var = i1.c;
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar3 = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar3);
            } else {
                sVar2.o0();
            }
            t.x(sVar2, q0VarD, androidx.compose.ui.node.g.f);
            t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
            t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            t.t(sVar2, androidx.compose.ui.node.g.h);
            t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
            String strD = hiAnimeInfoA.d();
            o oVar = o.b;
            float f = 320;
            com.app.mlounge.ui.viewmodel.g gVar9 = gVar4;
            final a1 a1Var3 = a1Var;
            androidx.compose.runtime.f fVar4 = fVar;
            final Map map2 = map;
            coil3.compose.k.a(strD, null, i1.g(i1.e(oVar, 1.0f), f), null, androidx.compose.ui.layout.i.a, sVar, 1573296, 1976);
            androidx.compose.ui.r rVarG = i1.g(i1.e(oVar, 1.0f), f);
            long j = com.app.mlounge.ui.theme.b.a;
            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.e(rVarG, androidx.work.impl.model.f.t(kotlin.collections.q.k(new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.3f, j)), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.5f, j)), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.8f, j)), new androidx.compose.ui.graphics.t(j)), 0.0f, 0.0f, 14)), sVar, 6);
            boolean zF4 = sVar.f(hiAnimeInfoA) | ((i5 & Token.ASSIGN_MOD) == 32) | sVar.h(hiAnimeMoreInfoB) | sVar.f(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0406: ARITH (r0v29 'zF4' boolean) = (wrap boolean:0x03fa: ARITH (wrap boolean:0x03f3: ARITH (wrap boolean:0x03ec: ARITH (wrap boolean:0x03e5: ARITH (wrap boolean:0x03de: ARITH (wrap boolean:0x03d1: ARITH (wrap boolean:0x03cc: ARITH (wrap boolean:0x03c7: ARITH (wrap boolean:0x03c2: ARITH (wrap boolean:0x03bd: ARITH (wrap boolean:0x03b9: INVOKE (r36v0 'sVar' androidx.compose.runtime.s), (r1v3 'hiAnimeInfoA' com.app.mlounge.data.remote.model.HiAnimeInfo) VIRTUAL call: androidx.compose.runtime.s.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:954)) | (wrap boolean:?: TERNARY null = ((wrap int:0x03b0: ARITH (r3v12 'i5' int) & (wrap ??:SGET  A[WRAPPED] org.mozilla.javascript.Token.ASSIGN_MOD int) A[WRAPPED] (LINE:945)) == (32 int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:958)) | (wrap boolean:0x03be: INVOKE (r36v0 'sVar' androidx.compose.runtime.s), (r2v38 'hiAnimeMoreInfoB' com.app.mlounge.data.remote.model.HiAnimeMoreInfo) VIRTUAL call: androidx.compose.runtime.s.h(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:959)) A[DONT_WRAP, WRAPPED] (LINE:963)) | (wrap boolean:0x03c3: INVOKE (r36v0 'sVar' androidx.compose.runtime.s), (r5v6 java.lang.Object) VIRTUAL call: androidx.compose.runtime.s.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:964)) A[DONT_WRAP, WRAPPED] (LINE:968)) | (wrap boolean:0x03c8: INVOKE (r36v0 'sVar' androidx.compose.runtime.s), (r7v18 'gVar9' com.app.mlounge.ui.viewmodel.g) VIRTUAL call: androidx.compose.runtime.s.h(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:969)) A[DONT_WRAP, WRAPPED] (LINE:973)) | (wrap boolean:0x03cd: INVOKE 
                  (r36v0 'sVar' androidx.compose.runtime.s)
                  (r8v8 'hiAnimeDetailData2' com.app.mlounge.data.remote.model.HiAnimeDetailData)
                 VIRTUAL call: androidx.compose.runtime.s.h(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:974)) A[DONT_WRAP, WRAPPED] (LINE:978)) | (wrap boolean:?: TERNARY null = ((wrap int:0x03d5: ARITH (r3v12 'i5' int) & (57344 int) A[WRAPPED] (LINE:982)) == (16384 int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:991)) | (wrap boolean:0x03e1: INVOKE (r36v0 'sVar' androidx.compose.runtime.s), (r27v1 'a1Var3' androidx.compose.runtime.a1) VIRTUAL call: androidx.compose.runtime.s.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:994)) A[DONT_WRAP, WRAPPED] (LINE:998)) | (wrap boolean:0x03e8: INVOKE (r36v0 'sVar' androidx.compose.runtime.s), (r4v13 'a1VarG4' androidx.compose.runtime.a1) VIRTUAL call: androidx.compose.runtime.s.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1001)) A[DONT_WRAP, WRAPPED] (LINE:1005)) | (wrap boolean:0x03ef: INVOKE (r36v0 'sVar' androidx.compose.runtime.s), (r5v4 'a1VarG5' androidx.compose.runtime.a1) VIRTUAL call: androidx.compose.runtime.s.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1008)) A[DONT_WRAP, WRAPPED] (LINE:1012)) | (wrap boolean:0x03f6: INVOKE (r36v0 'sVar' androidx.compose.runtime.s), (r16v5 'map2' java.util.Map) VIRTUAL call: androidx.compose.runtime.s.h(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1015)) A[DONT_WRAP, WRAPPED] (LINE:1019)) | (wrap boolean:?: TERNARY null = ((wrap int:0x03fd: ARITH (r3v12 'i5' int) & (896 int) A[WRAPPED] (LINE:1022)) == (256 int)) ? true : false) A[DECLARE_VAR] (LINE:1031) in method: com.app.mlounge.ui.screens.anime.m.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.r, com.app.mlounge.ui.viewmodel.g, androidx.compose.runtime.s, int, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v6 java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1181
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.anime.m.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.r, com.app.mlounge.ui.viewmodel.g, androidx.compose.runtime.s, int, int):void");
        }

        public static final void b(kotlin.jvm.functions.l lVar, com.app.mlounge.ui.viewmodel.g gVar, s sVar, int i) {
            com.app.mlounge.ui.viewmodel.g gVar2;
            int i2;
            com.app.mlounge.ui.viewmodel.g gVar3;
            com.app.mlounge.ui.viewmodel.g gVar4;
            androidx.compose.runtime.f fVar;
            Object i0Var;
            a1 a1Var;
            boolean z;
            s sVar2 = sVar;
            lVar.getClass();
            sVar2.c0(-127353463);
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
                        gVar3 = (com.app.mlounge.ui.viewmodel.g) _COROUTINE.b.J(a0.a(com.app.mlounge.ui.viewmodel.g.class), y0VarA, n.n(y0VarA, sVar2), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar2);
                    }
                } else {
                    sVar2.W();
                    i2 = i3 & (-113);
                    gVar3 = gVar;
                }
                sVar2.q();
                a1 a1VarG = t.g(gVar3.g, sVar2);
                a1 a1VarG2 = t.g(gVar3.i, sVar2);
                a1 a1VarG3 = t.g(gVar3.k, sVar2);
                a1 a1VarG4 = t.g(gVar3.m, sVar2);
                a1 a1VarG5 = t.g(gVar3.o, sVar2);
                a1 a1VarG6 = t.g(gVar3.q, sVar2);
                a1 a1VarG7 = t.g(gVar3.s, sVar2);
                a1 a1VarG8 = t.g(gVar3.d, sVar2);
                androidx.compose.foundation.lazy.grid.x xVarA = z.a(0, 0, sVar2, 3);
                boolean zF = sVar2.f(xVarA) | sVar2.h(gVar3);
                Object objQ = sVar2.Q();
                androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                if (zF || objQ == fVar2) {
                    objQ = new androidx.room.s(xVarA, gVar3, null, 12);
                    sVar2.l0(objQ);
                }
                l0.c(sVar2, xVarA, (p) objQ);
                e0 e0Var = i1.c;
                w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
                int iHashCode = Long.hashCode(sVar2.T);
                androidx.compose.runtime.internal.j jVarL = sVar2.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, e0Var);
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
                androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                t.t(sVar2, dVar);
                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                t.x(sVar2, rVarC, eVar4);
                m0 m0Var = ((m6) sVar2.j(n6.a)).e;
                long j = ((t0) sVar2.j(u0.a)).o;
                float f = 16;
                float f2 = 4;
                o oVar = o.b;
                androidx.compose.ui.r rVarU = androidx.compose.foundation.layout.b.u(oVar, f, f, 0.0f, f2, 4);
                androidx.compose.runtime.f fVar4 = fVar2;
                com.app.mlounge.ui.viewmodel.g gVar5 = gVar3;
                boolean z2 = false;
                z5.b("Anime", rVarU, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 54, 0, 131064);
                List listK = kotlin.collections.q.k(new kotlin.k("tv", "TV"), new kotlin.k("movie", "Movies"), new kotlin.k("ova", "OVA"), new kotlin.k("ona", "ONA"), new kotlin.k("special", "Special"));
                o oVar2 = oVar;
                androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.q(i1.e(oVar2, 1.0f), androidx.compose.foundation.s.p(sVar), false), f, f2);
                float f3 = 8;
                int i4 = 6;
                f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.g(f3), androidx.compose.ui.c.G, sVar, 6);
                int iHashCode2 = Long.hashCode(sVar.T);
                androidx.compose.runtime.internal.j jVarL2 = sVar.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, rVarR);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(fVar3);
                } else {
                    sVar.o0();
                }
                t.x(sVar, f1VarA, eVar);
                t.x(sVar, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar);
                t.x(sVar, rVarC2, eVar4);
                sVar.b0(1356509191);
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    kotlin.k kVar = (kotlin.k) it.next();
                    String str = (String) kVar.e;
                    String str2 = (String) kVar.y;
                    Object objQ2 = sVar.Q();
                    androidx.compose.runtime.f fVar5 = fVar4;
                    if (objQ2 == fVar5) {
                        objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
                    }
                    androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ2;
                    androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar2, androidx.compose.foundation.shape.e.a(f3)), 2, ((Boolean) _COROUTINE.a.B(kVar2, sVar, i4).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f3));
                    com.app.mlounge.ui.viewmodel.g gVar6 = gVar5;
                    boolean zH = sVar.h(gVar6) | sVar.f(str);
                    Object objQ3 = sVar.Q();
                    if (zH || objQ3 == fVar5) {
                        objQ3 = new com.app.mlounge.ui.screens.adult.b(3, gVar6, str);
                        sVar.l0(objQ3);
                    }
                    fVar4 = fVar5;
                    p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar2, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar2, 1), androidx.compose.foundation.shape.e.a(f3), kotlin.jvm.internal.l.a((String) a1VarG7.getValue(), str) ? androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(2002892753, new b2(7, str, str2, a1VarG7), sVar), sVar, 12582912, 120);
                    it = it;
                    i4 = 6;
                    oVar2 = oVar2;
                    gVar5 = gVar6;
                    z2 = false;
                }
                boolean z3 = z2;
                com.app.mlounge.ui.viewmodel.g gVar7 = gVar5;
                androidx.compose.runtime.f fVar6 = fVar4;
                boolean z4 = true;
                sVar.p(z3);
                sVar.p(true);
                List list = (List) a1VarG2.getValue();
                String str3 = (String) a1VarG6.getValue();
                boolean zH2 = sVar.h(gVar7);
                Object objQ4 = sVar.Q();
                if (zH2 || objQ4 == fVar6) {
                    gVar4 = gVar7;
                    fVar = fVar6;
                    androidx.compose.foundation.c cVar = new androidx.compose.foundation.c(1, gVar4, com.app.mlounge.ui.viewmodel.g.class, "setGenre", "setGenre(Ljava/lang/String;)V", 0, 6);
                    sVar.l0(cVar);
                    objQ4 = cVar;
                } else {
                    gVar4 = gVar7;
                    fVar = fVar6;
                }
                com.app.mlounge.ui.components.b0.a(0, sVar, null, str3, list, (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ4));
                if (((Boolean) a1VarG3.getValue()).booleanValue() && ((List) a1VarG.getValue()).isEmpty()) {
                    sVar.b0(-342089595);
                    com.app.mlounge.ui.components.b0.n(null, sVar, 0);
                    sVar.p(false);
                    sVar2 = sVar;
                    gVar4 = gVar4;
                } else if (((String) a1VarG5.getValue()) == null || !((List) a1VarG.getValue()).isEmpty()) {
                    gVar4 = gVar4;
                    sVar.b0(-2014621728);
                    e0 e0Var2 = i1.c;
                    q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL3 = sVar.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar, e0Var2);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar7 = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(fVar7);
                    } else {
                        sVar.o0();
                    }
                    androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.g.f;
                    t.x(sVar, q0VarD, eVar5);
                    androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.g.e;
                    t.x(sVar, jVarL3, eVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.g.g;
                    t.p(sVar, numValueOf2, eVar7);
                    androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
                    t.t(sVar, dVar2);
                    androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.g.d;
                    t.x(sVar, rVarC3, eVar8);
                    androidx.compose.foundation.lazy.grid.a aVar = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar.j(com.app.mlounge.ui.theme.g.a)).y);
                    float f4 = 12;
                    z0 z0Var = new z0(f4, f4, f4, f4);
                    androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f3);
                    androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f3);
                    boolean zF2 = ((i2 & 14) == 4) | sVar.f(a1VarG) | sVar.f(a1VarG8) | sVar.f(a1VarG4);
                    Object objQ5 = sVar.Q();
                    if (zF2 || objQ5 == fVar) {
                        i0Var = new i0((Object) a1VarG, (Object) lVar, (Object) a1VarG8, (Object) a1VarG4, 7);
                        a1Var = a1VarG;
                        sVar.l0(i0Var);
                    } else {
                        a1Var = a1VarG;
                        i0Var = objQ5;
                    }
                    v.b(aVar, e0Var2, xVarA, z0Var, fVarG2, fVarG, null, false, null, (kotlin.jvm.functions.l) i0Var, sVar, 1772592, 912);
                    sVar2 = sVar;
                    if (!((Boolean) a1VarG3.getValue()).booleanValue() || ((List) a1Var.getValue()).isEmpty()) {
                        z4 = true;
                        z = false;
                        sVar2.b0(1274246038);
                        sVar2.p(false);
                    } else {
                        sVar2.b0(1273950050);
                        z = false;
                        q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                        int iHashCode4 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL4 = sVar2.l();
                        androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(sVar2, e0Var2);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(fVar7);
                        } else {
                            sVar2.o0();
                        }
                        t.x(sVar2, q0VarD2, eVar5);
                        t.x(sVar2, jVarL4, eVar6);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar2, eVar7, sVar2, dVar2);
                        t.x(sVar2, rVarC4, eVar8);
                        s4.a(null, com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, sVar2, 48, 61);
                        z4 = true;
                        sVar2.p(true);
                        sVar2.p(false);
                    }
                    sVar2.p(z4);
                    sVar2.p(z);
                } else {
                    sVar.b0(-342087278);
                    String str4 = (String) a1VarG5.getValue();
                    str4.getClass();
                    boolean zH3 = sVar.h(gVar4);
                    Object objQ6 = sVar.Q();
                    if (zH3 || objQ6 == fVar) {
                        s0 s0Var = new s0(0, gVar4, com.app.mlounge.ui.viewmodel.g.class, "loadAnime", "loadAnime()V", 0, 5);
                        sVar.l0(s0Var);
                        objQ6 = s0Var;
                    }
                    com.app.mlounge.ui.components.b0.i(str4, null, (kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ6), sVar, 0);
                    sVar.p(false);
                    sVar2 = sVar;
                }
                sVar2.p(z4);
                gVar2 = gVar4;
            } else {
                sVar2.W();
                gVar2 = gVar;
            }
            s1 s1VarT = sVar2.t();
            if (s1VarT != null) {
                s1VarT.d = new androidx.compose.foundation.contextmenu.f(lVar, gVar2, i, 17);
            }
        }
    }
