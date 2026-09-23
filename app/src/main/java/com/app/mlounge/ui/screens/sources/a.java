package com.app.mlounge.ui.screens.sources;

import android.content.Context;
import androidx.activity.compose.i;
import androidx.compose.animation.core.g0;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.s0;
import androidx.compose.foundation.shape.e;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q;
import androidx.compose.material3.x2;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.internal.f;
import androidx.compose.runtime.internal.k;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.s2;
import androidx.compose.ui.draw.h;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.j;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.r;
import androidx.lifecycle.y0;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.screens.player.x;
import com.app.mlounge.ui.viewmodel.m;
import com.app.mlounge.ui.viewmodel.w1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.w;
import kotlin.jvm.internal.a0;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final f a = new f(false, -1741442298, new com.app.mlounge.ui.screens.settings.a(12));
    public static final f b = new f(false, -2080977553, new com.app.mlounge.ui.screens.music.a(28));
    public static final f c = new f(false, -1830133351, new com.app.mlounge.ui.screens.music.a(29));
    public static final f d = new f(false, -805600161, new com.app.mlounge.ui.screens.settings.a(13));

    public static final void a(List list, l lVar, kotlin.jvm.functions.a aVar, s sVar, int i) {
        sVar.c0(-1522015970);
        int i2 = (sVar.h(list) ? 4 : 2) | i | (sVar.h(lVar) ? 32 : 16) | (sVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            t1.a(aVar, null, k.c(-799520729, new x(list, aVar, lVar, 2), sVar), sVar, ((i2 >> 6) & 14) | 384, 2);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new x(list, lVar, aVar, i, 3);
        }
    }

    public static final void b(ChqStream chqStream, boolean z, kotlin.jvm.functions.a aVar, s sVar, int i) {
        sVar.c0(-1174766216);
        int i2 = (sVar.h(chqStream) ? 4 : 2) | i | (sVar.g(z) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar = n.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f = 8;
            r rVarG = androidx.compose.foundation.s.g(h.a(i1.e(o.b, 1.0f), e.a(f)), 2, ((Boolean) _COROUTINE.a.B(kVar, sVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, e.a(f));
            boolean z2 = (i2 & 896) == 256;
            Object objQ2 = sVar.Q();
            if (z2 || objQ2 == fVar) {
                objQ2 = new x2(23, aVar);
                sVar.l0(objQ2);
            }
            p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), e.a(f), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, k.c(-521817987, new i(z, 5, chqStream), sVar), sVar, 12583296, 120);
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.screens.movies.c(chqStream, z, aVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public static final void c(kotlin.jvm.functions.a aVar, w wVar, w1 w1Var, s sVar, int i) {
        w1 w1Var2;
        w1 w1Var3;
        int i2;
        String str;
        int i3;
        w1 w1Var4;
        ?? r0;
        androidx.compose.runtime.f fVar;
        androidx.compose.ui.node.f fVar2;
        androidx.compose.ui.node.f fVar3;
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.e eVar2;
        androidx.compose.foundation.layout.c cVar;
        androidx.compose.ui.node.e eVar3;
        j0 j0Var;
        androidx.compose.runtime.x2 x2Var;
        androidx.compose.ui.node.f fVar4;
        androidx.compose.ui.node.d dVar;
        androidx.compose.ui.node.e eVar4;
        androidx.compose.runtime.f fVar5;
        boolean z;
        w1 w1Var5;
        j jVar;
        androidx.compose.ui.node.e eVar5;
        androidx.compose.ui.node.e eVar6;
        androidx.compose.ui.node.e eVar7;
        androidx.compose.ui.node.d dVar2;
        androidx.compose.ui.node.e eVar8;
        androidx.compose.foundation.layout.c cVar2;
        androidx.compose.runtime.f fVar6;
        e0 e0Var;
        boolean z2;
        boolean z3;
        androidx.compose.ui.node.f fVar7;
        s sVar2 = sVar;
        androidx.compose.ui.h hVar = androidx.compose.ui.c.K;
        j jVar2 = androidx.compose.ui.c.B;
        aVar.getClass();
        wVar.getClass();
        sVar2.c0(1075398829);
        int i4 = i | (sVar2.h(aVar) ? 4 : 2) | (sVar2.h(wVar) ? 32 : 16) | 128;
        if (sVar2.T(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            sVar2.Y();
            if ((i & 1) == 0 || sVar2.C()) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar2);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    w1Var3 = (w1) _COROUTINE.b.J(a0.a(w1.class), y0VarA, org.jsoup.helper.n.n(y0VarA, sVar2), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar2);
                    i2 = i4 & (-897);
                }
            } else {
                sVar2.W();
                i2 = i4 & (-897);
                w1Var3 = w1Var;
            }
            int i5 = i2;
            sVar2.q();
            a1 a1VarG = androidx.compose.runtime.t.g(w1Var3.i, sVar2);
            a1 a1VarG2 = androidx.compose.runtime.t.g(w1Var3.k, sVar2);
            a1 a1VarG3 = androidx.compose.runtime.t.g(w1Var3.m, sVar2);
            a1 a1VarG4 = androidx.compose.runtime.t.g(w1Var3.o, sVar2);
            String str2 = w1Var3.u;
            boolean zA = kotlin.jvm.internal.l.a(w1Var3.x, "download");
            Context context = (Context) sVar2.j(m0.b);
            boolean zH = sVar2.h(w1Var3) | ((i5 & Token.ASSIGN_MOD) == 32);
            Object objQ = sVar2.Q();
            androidx.compose.runtime.f fVar8 = n.a;
            if (zH || objQ == fVar8) {
                objQ = new androidx.room.s(w1Var3, wVar, null, 20);
                sVar2.l0(objQ);
            }
            y yVar = y.a;
            l0.c(sVar2, yVar, (p) objQ);
            boolean zH2 = sVar2.h(w1Var3) | sVar2.h(context);
            Object objQ2 = sVar2.Q();
            if (zH2 || objQ2 == fVar8) {
                objQ2 = new androidx.room.s(w1Var3, context, null, 21);
                sVar2.l0(objQ2);
            }
            l0.c(sVar2, yVar, (p) objQ2);
            if (((m) a1VarG4.getValue()).d) {
                sVar2.b0(1046616501);
                List list = ((m) a1VarG4.getValue()).f;
                boolean zH3 = sVar2.h(w1Var3);
                Object objQ3 = sVar2.Q();
                if (zH3 || objQ3 == fVar8) {
                    objQ3 = new s2(w1Var3, 18);
                    sVar2.l0(objQ3);
                }
                l lVar = (l) objQ3;
                boolean zH4 = sVar2.h(w1Var3);
                Object objQ4 = sVar2.Q();
                if (zH4 || objQ4 == fVar8) {
                    str = str2;
                    s0 s0Var = new s0(0, w1Var3, w1.class, "dismissDebridPicker", "dismissDebridPicker()V", 0, 10);
                    sVar2.l0(s0Var);
                    objQ4 = s0Var;
                } else {
                    str = str2;
                }
                a(list, lVar, (kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ4), sVar2, 0);
                sVar2.p(false);
            } else {
                str = str2;
                sVar2.b0(1046831765);
                sVar2.p(false);
            }
            String str3 = ((m) a1VarG4.getValue()).b;
            if (str3 == null) {
                sVar2.b0(1046899065);
                sVar2.p(false);
                fVar = fVar8;
                w1Var4 = w1Var3;
                r0 = 0;
                i3 = 14;
            } else {
                sVar2.b0(1046899066);
                long j = com.app.mlounge.ui.theme.b.d;
                boolean zH5 = sVar2.h(w1Var3);
                Object objQ5 = sVar2.Q();
                if (zH5 || objQ5 == fVar8) {
                    objQ5 = new c(w1Var3, 1);
                    sVar2.l0(objQ5);
                }
                i3 = 14;
                w1Var4 = w1Var3;
                r0 = 0;
                fVar = fVar8;
                q.a((kotlin.jvm.functions.a) objQ5, k.c(838136355, new g0(w1Var3, 27), sVar2), null, null, k.c(1812283807, new androidx.compose.material3.m(a1VarG4, 11), sVar2), k.c(2055820670, new com.app.mlounge.ui.components.r(str3, 14), sVar2), null, j, 0L, 0L, 0L, 0.0f, null, sVar, 102432816, 0, 16028);
                sVar2 = sVar;
                sVar2.p(false);
            }
            e0 e0Var2 = i1.c;
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, r0);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            r rVarC = androidx.compose.ui.a.c(sVar2, e0Var2);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar9 = g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar9);
            } else {
                sVar2.o0();
            }
            androidx.compose.ui.node.e eVar9 = g.f;
            androidx.compose.runtime.t.x(sVar2, q0VarD, eVar9);
            androidx.compose.ui.node.e eVar10 = g.e;
            androidx.compose.runtime.t.x(sVar2, jVarL, eVar10);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar11 = g.g;
            androidx.compose.runtime.t.p(sVar2, numValueOf, eVar11);
            androidx.compose.ui.node.d dVar3 = g.h;
            androidx.compose.runtime.t.t(sVar2, dVar3);
            androidx.compose.ui.node.e eVar12 = g.d;
            androidx.compose.runtime.t.x(sVar2, rVarC, eVar12);
            long j2 = com.app.mlounge.ui.theme.b.a;
            j0 j0Var2 = androidx.compose.ui.graphics.a0.b;
            r rVarF = androidx.compose.foundation.s.f(e0Var2, j2, j0Var2);
            androidx.compose.foundation.layout.c cVar3 = androidx.compose.foundation.layout.h.c;
            androidx.compose.ui.h hVar2 = androidx.compose.ui.c.J;
            androidx.compose.foundation.layout.w wVarA = u.a(cVar3, hVar2, sVar2, r0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
            r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarF);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar9);
            } else {
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, wVarA, eVar9);
            androidx.compose.runtime.t.x(sVar2, jVarL2, eVar10);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar11, sVar2, dVar3);
            androidx.compose.runtime.t.x(sVar2, rVarC2, eVar12);
            o oVar = o.b;
            r rVarE = i1.e(oVar, 1.0f);
            androidx.compose.runtime.f fVar10 = fVar;
            long j3 = com.app.mlounge.ui.theme.b.b;
            float f = 8;
            r rVarQ = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.s.f(rVarE, j3, j0Var2), f);
            androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, iVar, sVar2, 48);
            int iHashCode3 = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL3 = sVar2.l();
            r rVarC3 = androidx.compose.ui.a.c(sVar2, rVarQ);
            sVar2.e0();
            if (sVar2.S) {
                fVar2 = fVar9;
                sVar2.k(fVar2);
            } else {
                fVar2 = fVar9;
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, f1VarA, eVar9);
            androidx.compose.runtime.t.x(sVar2, jVarL3, eVar10);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar2, eVar11, sVar2, dVar3);
            androidx.compose.runtime.t.x(sVar2, rVarC3, eVar12);
            Object objQ6 = sVar2.Q();
            if (objQ6 == fVar10) {
                objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ6;
            a1 a1VarB = _COROUTINE.a.B(kVar, sVar2, 6);
            androidx.compose.foundation.shape.d dVar4 = e.a;
            float f2 = 2;
            androidx.compose.ui.node.f fVar11 = fVar2;
            q.e(aVar, androidx.compose.foundation.s.g(h.a(oVar, dVar4), f2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, dVar4), false, null, kVar, null, b, sVar, 1597440 | (i5 & 14), 44);
            androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar, f));
            if (1.0f <= 0.0d) {
                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
            }
            t0 t0Var = new t0(1.0f, true);
            androidx.compose.foundation.layout.w wVarA2 = u.a(cVar3, hVar2, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL4 = sVar.l();
            r rVarC4 = androidx.compose.ui.a.c(sVar, t0Var);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar11);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, wVarA2, eVar9);
            androidx.compose.runtime.t.x(sVar, jVarL4, eVar10);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar, eVar11, sVar, dVar3);
            androidx.compose.runtime.t.x(sVar, rVarC4, eVar12);
            String str4 = zA ? "Download Sources" : "Sources";
            androidx.compose.runtime.x2 x2Var2 = n6.a;
            z5.b(str4, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var2)).g, sVar, 384, 0, 131066);
            androidx.compose.ui.text.m0 m0Var = ((m6) sVar.j(x2Var2)).l;
            long j4 = com.app.mlounge.ui.theme.b.m;
            z5.b(str, null, j4, 0L, null, 0L, null, 0L, 2, false, 1, 0, m0Var, sVar, 384, 24960, 110586);
            sVar2 = sVar;
            sVar2.p(true);
            if (((List) a1VarG.getValue()).isEmpty()) {
                sVar2.b0(162021813);
                sVar2.p(false);
            } else {
                sVar2.b0(161785934);
                z5.b(String.valueOf(((List) a1VarG.getValue()).size()), androidx.compose.foundation.layout.b.u(oVar, 0.0f, 0.0f, f, 0.0f, 11), com.app.mlounge.ui.theme.b.h, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(x2Var2)).n, sVar, 432, 0, 131064);
                sVar2 = sVar;
                sVar2.p(false);
            }
            sVar2.p(true);
            if (d(a1VarG2) || !((List) a1VarG3.getValue()).isEmpty()) {
                sVar2.b0(-2082376653);
                r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.f(i1.e(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0505: INVOKE (r5v15 'rVarR' androidx.compose.ui.r) = 
                      (wrap androidx.compose.ui.r:0x04fe: INVOKE 
                      (wrap androidx.compose.ui.r:0x04f0: INVOKE (r52v0 ?? I:??[OBJECT, ARRAY]), (1.0f float) STATIC call: androidx.compose.foundation.layout.i1.e(androidx.compose.ui.r, float):androidx.compose.ui.r A[MD:(androidx.compose.ui.r, float):androidx.compose.ui.r (m), WRAPPED] (LINE:194))
                      (wrap long:0x04f8: INVOKE (0.5f float), (r1v4 'j3' long) STATIC call: androidx.compose.ui.graphics.t.b(float, long):long A[MD:(float, long):long (m), WRAPPED] (LINE:195))
                      (r6v12 'j0Var2' androidx.compose.ui.graphics.j0)
                     STATIC call: androidx.compose.foundation.s.f(androidx.compose.ui.r, long, androidx.compose.ui.graphics.n0):androidx.compose.ui.r A[MD:(androidx.compose.ui.r, long, androidx.compose.ui.graphics.n0):androidx.compose.ui.r (m), WRAPPED] (LINE:196))
                      (16 int)
                      (r46v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
                     STATIC call: androidx.compose.foundation.layout.b.r(androidx.compose.ui.r, float, float):androidx.compose.ui.r A[DECLARE_VAR, MD:(androidx.compose.ui.r, float, float):androidx.compose.ui.r (m)] (LINE:197) in method: com.app.mlounge.ui.screens.sources.a.c(kotlin.jvm.functions.a, kotlin.jvm.functions.w, com.app.mlounge.ui.viewmodel.w1, androidx.compose.runtime.s, int):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r52v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2936
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.sources.a.c(kotlin.jvm.functions.a, kotlin.jvm.functions.w, com.app.mlounge.ui.viewmodel.w1, androidx.compose.runtime.s, int):void");
            }

            public static final boolean d(a1 a1Var) {
                return ((Boolean) a1Var.getValue()).booleanValue();
            }
        }
