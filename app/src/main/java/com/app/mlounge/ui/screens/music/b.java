package com.app.mlounge.ui.screens.music;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.gestures.b2;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.z0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.q;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.r;
import androidx.lifecycle.y0;
import androidx.work.impl.v;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicArtistDetail;
import com.app.mlounge.data.remote.model.MusicGenre;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.components.c0;
import com.app.mlounge.ui.viewmodel.j0;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a0;
import kotlin.y;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.helper.n;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(false, 36220684, new c0(28));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(false, 1410688345, new c0(29));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(false, -1385360816, new a(0));
    public static final androidx.compose.runtime.internal.f d = new androidx.compose.runtime.internal.f(false, -1749763220, new a(1));
    public static final androidx.compose.runtime.internal.f e = new androidx.compose.runtime.internal.f(false, -1688896939, new androidx.compose.foundation.contextmenu.b(18));
    public static final androidx.compose.runtime.internal.f f = new androidx.compose.runtime.internal.f(false, 1101965455, new androidx.compose.foundation.contextmenu.b(19));

    public static final void a(String str, kotlin.jvm.functions.a aVar, l lVar, j0 j0Var, s sVar, int i) {
        j0 j0Var2;
        int i2;
        j0 j0Var3;
        androidx.compose.ui.node.f fVar;
        androidx.compose.ui.node.f fVar2;
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.e eVar2;
        androidx.compose.ui.node.e eVar3;
        androidx.compose.ui.node.d dVar;
        androidx.compose.ui.node.f fVar3;
        o oVar;
        androidx.compose.ui.i iVar;
        boolean z;
        o oVar2;
        androidx.compose.ui.node.f fVar4;
        j0 j0Var4;
        s sVar2 = sVar;
        aVar.getClass();
        lVar.getClass();
        sVar2.c0(726675736);
        int i3 = i | (sVar2.f(str) ? 4 : 2) | (sVar2.h(aVar) ? 32 : 16) | (sVar2.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128) | LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (sVar2.T(i3 & 1, (i3 & 1171) != 1170)) {
            sVar2.Y();
            if ((i & 1) == 0 || sVar2.C()) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar2);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    j0 j0Var5 = (j0) _COROUTINE.b.J(a0.a(j0.class), y0VarA, n.n(y0VarA, sVar2), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar2);
                    i2 = i3 & (-7169);
                    j0Var3 = j0Var5;
                }
            } else {
                sVar2.W();
                i2 = i3 & (-7169);
                j0Var3 = j0Var;
            }
            sVar2.q();
            Context context = (Context) sVar2.j(m0.b);
            a1 a1VarG = t.g(j0Var3.y, sVar2);
            a1 a1VarG2 = t.g(j0Var3.i, sVar2);
            String strConcat = "music_album_".concat(str);
            com.app.mlounge.data.repository.a0 a0Var = j0Var3.c;
            a0Var.getClass();
            int i4 = i2;
            a1 a1VarF = t.f(a0Var.a.c(strConcat), Boolean.FALSE, null, sVar, 48, 2);
            sVar2 = sVar;
            int i5 = i4 & 14;
            boolean zH = sVar2.h(j0Var3) | (i5 == 4);
            Object objQ = sVar2.Q();
            androidx.compose.runtime.f fVar5 = androidx.compose.runtime.n.a;
            if (zH || objQ == fVar5) {
                objQ = new f(j0Var3, str, null, 0);
                sVar2.l0(objQ);
            }
            l0.c(sVar2, str, (p) objQ);
            boolean zH2 = sVar2.h(j0Var3) | sVar2.h(context);
            Object objQ2 = sVar2.Q();
            if (zH2 || objQ2 == fVar5) {
                objQ2 = new androidx.room.s(j0Var3, context, null, 14);
                sVar2.l0(objQ2);
            }
            y yVar = y.a;
            l0.c(sVar2, yVar, (p) objQ2);
            boolean zH3 = sVar2.h(j0Var3) | (i5 == 4);
            Object objQ3 = sVar2.Q();
            if (zH3 || objQ3 == fVar5) {
                objQ3 = new f(j0Var3, str, null, 1);
                sVar2.l0(objQ3);
            }
            l0.c(sVar2, str, (p) objQ3);
            boolean zH4 = sVar2.h(j0Var3);
            Object objQ4 = sVar2.Q();
            if (zH4 || objQ4 == fVar5) {
                objQ4 = new c(j0Var3, 0);
                sVar2.l0(objQ4);
            }
            l0.b(yVar, (l) objQ4, sVar2);
            if (((Boolean) a1VarG2.getValue()).booleanValue() && ((MusicAlbumDetail) a1VarG.getValue()) == null) {
                sVar2.b0(1762623257);
                b0.n(null, sVar2, 0);
                sVar2.p(false);
                s1 s1VarT = sVar2.t();
                if (s1VarT != null) {
                    s1VarT.d = new d(str, aVar, lVar, j0Var3, i, 0);
                    return;
                }
                return;
            }
            j0 j0Var6 = j0Var3;
            sVar2.b0(1762670346);
            sVar2.p(false);
            MusicAlbumDetail musicAlbumDetail = (MusicAlbumDetail) a1VarG.getValue();
            if (musicAlbumDetail == null) {
                sVar2.b0(1762828352);
                sVar2.p(false);
                j0Var4 = j0Var6;
            } else {
                sVar2.b0(1762828353);
                r rVarQ = androidx.compose.foundation.s.q(i1.c, androidx.compose.foundation.s.p(sVar2), true);
                androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                w wVarA = u.a(cVar, hVar, sVar2, 0);
                int iHashCode = Long.hashCode(sVar2.T);
                androidx.compose.runtime.internal.j jVarL = sVar2.l();
                r rVarC = androidx.compose.ui.a.c(sVar2, rVarQ);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar6 = androidx.compose.ui.node.g.b;
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(fVar6);
                } else {
                    sVar2.o0();
                }
                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.f;
                t.x(sVar2, wVarA, eVar4);
                androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.g.e;
                t.x(sVar2, jVarL, eVar5);
                Integer numValueOf = Integer.valueOf(iHashCode);
                androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.g.g;
                t.p(sVar2, numValueOf, eVar6);
                androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
                t.t(sVar2, dVar2);
                androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.g.d;
                t.x(sVar2, rVarC, eVar7);
                o oVar3 = o.b;
                float f2 = 16;
                r rVarQ2 = androidx.compose.foundation.layout.b.q(i1.e(oVar3, 1.0f), f2);
                androidx.compose.ui.i iVar2 = androidx.compose.ui.c.H;
                androidx.compose.foundation.layout.t tVar = androidx.compose.foundation.layout.h.a;
                f1 f1VarA = d1.a(tVar, iVar2, sVar2, 48);
                int iHashCode2 = Long.hashCode(sVar2.T);
                androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarQ2);
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(fVar6);
                } else {
                    sVar2.o0();
                }
                t.x(sVar2, f1VarA, eVar4);
                t.x(sVar2, jVarL2, eVar5);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar6, sVar2, dVar2);
                t.x(sVar2, rVarC2, eVar7);
                Object objQ5 = sVar2.Q();
                if (objQ5 == fVar5) {
                    objQ5 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
                }
                k kVar = (k) objQ5;
                q.e(aVar, androidx.compose.foundation.s.g(oVar3, 2, ((Boolean) _COROUTINE.a.B(kVar, sVar2, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a), false, null, kVar, null, a, sVar, ((i4 >> 3) & 14) | 1597440, 44);
                androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar3, f2));
                String strE = musicAlbumDetail.e();
                androidx.compose.ui.text.m0 m0Var = q.p(sVar).f;
                long j = androidx.compose.ui.graphics.t.d;
                int i6 = i4;
                z5.b(strE, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar, 384, 0, 131066);
                sVar.p(true);
                r rVarS = androidx.compose.foundation.layout.b.s(i1.e(oVar3, 1.0f), f2, 0.0f, 2);
                androidx.compose.ui.i iVar3 = androidx.compose.ui.c.G;
                f1 f1VarA2 = d1.a(tVar, iVar3, sVar, 48);
                int iHashCode3 = Long.hashCode(sVar.T);
                androidx.compose.runtime.internal.j jVarL3 = sVar.l();
                r rVarC3 = androidx.compose.ui.a.c(sVar, rVarS);
                sVar.e0();
                if (sVar.S) {
                    fVar = fVar6;
                    sVar.k(fVar);
                } else {
                    fVar = fVar6;
                    sVar.o0();
                }
                t.x(sVar, f1VarA2, eVar4);
                t.x(sVar, jVarL3, eVar5);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar, eVar6, sVar, dVar2);
                t.x(sVar, rVarC3, eVar7);
                String strD = musicAlbumDetail.d();
                if (strD == null) {
                    strD = "";
                }
                float f3 = 8;
                coil3.compose.k.a(strD, musicAlbumDetail.e(), androidx.compose.ui.draw.h.a(i1.m(oVar3, 160), androidx.compose.foundation.shape.e.a(f3)), null, androidx.compose.ui.layout.i.a, sVar, 1572864, 1976);
                androidx.compose.foundation.layout.b.e(sVar, i1.q(oVar3, f2));
                w wVarA2 = u.a(cVar, hVar, sVar, 0);
                int iHashCode4 = Long.hashCode(sVar.T);
                androidx.compose.runtime.internal.j jVarL4 = sVar.l();
                r rVarC4 = androidx.compose.ui.a.c(sVar, oVar3);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(fVar);
                } else {
                    sVar.o0();
                }
                t.x(sVar, wVarA2, eVar4);
                t.x(sVar, jVarL4, eVar5);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, sVar, eVar6, sVar, dVar2);
                t.x(sVar, rVarC4, eVar7);
                androidx.compose.ui.node.f fVar7 = fVar;
                z5.b(musicAlbumDetail.a(), null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, q.p(sVar).h, sVar, 384, 0, 131066);
                s sVar3 = sVar;
                f1 f1VarA3 = d1.a(androidx.compose.foundation.layout.h.g(f3), iVar3, sVar3, 6);
                int iHashCode5 = Long.hashCode(sVar3.T);
                androidx.compose.runtime.internal.j jVarL5 = sVar3.l();
                r rVarC5 = androidx.compose.ui.a.c(sVar3, oVar3);
                sVar3.e0();
                if (sVar3.S) {
                    fVar2 = fVar7;
                    sVar3.k(fVar2);
                } else {
                    fVar2 = fVar7;
                    sVar3.o0();
                }
                t.x(sVar3, f1VarA3, eVar4);
                t.x(sVar3, jVarL5, eVar5);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, sVar3, eVar6, sVar3, dVar2);
                t.x(sVar3, rVarC5, eVar7);
                String strG = musicAlbumDetail.g();
                if (strG == null) {
                    sVar3.b0(1043015162);
                    sVar3.p(false);
                    iVar = iVar3;
                    eVar = eVar7;
                    eVar2 = eVar6;
                    oVar = oVar3;
                    z = false;
                    fVar3 = fVar2;
                    eVar3 = eVar4;
                    dVar = dVar2;
                } else {
                    sVar3.b0(1043015163);
                    eVar = eVar7;
                    eVar2 = eVar6;
                    eVar3 = eVar4;
                    dVar = dVar2;
                    fVar3 = fVar2;
                    oVar = oVar3;
                    iVar = iVar3;
                    z5.b(strG, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, q.p(sVar3).l, sVar, 384, 0, 131066);
                    sVar3 = sVar;
                    z = false;
                    sVar3.p(false);
                }
                String strC = musicAlbumDetail.c();
                if (strC == null) {
                    sVar3.b0(1043198062);
                    sVar3.p(z);
                } else {
                    sVar3.b0(1043198063);
                    z5.b("•", null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, q.p(sVar3).l, sVar, 390, 0, 131066);
                    z5.b(strC, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, q.p(sVar).l, sVar, 384, 0, 131066);
                    sVar3 = sVar;
                    z = false;
                    sVar3.p(false);
                }
                sVar3.p(true);
                z5.b(androidx.compose.runtime.j.d(musicAlbumDetail.f().size(), " tracks"), null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, q.p(sVar3).l, sVar, 384, 0, 131066);
                s sVar4 = sVar;
                String strB = musicAlbumDetail.b();
                if (strB == null) {
                    sVar4.b0(-1588941362);
                    sVar4.p(false);
                    oVar2 = oVar;
                } else {
                    sVar4.b0(-1588941361);
                    o oVar4 = oVar;
                    androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar4, f3));
                    oVar2 = oVar4;
                    z5.b(strB, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 4, 0, q.p(sVar4).l, sVar, 384, 24960, 110586);
                    sVar4 = sVar;
                    sVar4.p(false);
                }
                sVar4.p(true);
                sVar4.p(true);
                o oVar5 = oVar2;
                androidx.compose.foundation.layout.b.e(sVar4, i1.g(oVar5, f2));
                r rVarS2 = androidx.compose.foundation.layout.b.s(i1.e(oVar5, 1.0f), f2, 0.0f, 2);
                f1 f1VarA4 = d1.a(androidx.compose.foundation.layout.h.g(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05fc: INVOKE (r1v28 'f1VarA4' androidx.compose.foundation.layout.f1) = 
                      (wrap androidx.compose.foundation.layout.f:0x05f5: INVOKE (r32v1 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) STATIC call: androidx.compose.foundation.layout.h.g(float):androidx.compose.foundation.layout.f A[MD:(float):androidx.compose.foundation.layout.f (m), WRAPPED] (LINE:1526))
                      (r76v1 'iVar' androidx.compose.ui.i)
                      (r5v15 'sVar4' androidx.compose.runtime.s)
                      (6 int)
                     STATIC call: androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.e, androidx.compose.ui.i, androidx.compose.runtime.s, int):androidx.compose.foundation.layout.f1 A[DECLARE_VAR, MD:(androidx.compose.foundation.layout.e, androidx.compose.ui.i, androidx.compose.runtime.s, int):androidx.compose.foundation.layout.f1 (m)] (LINE:1533) in method: com.app.mlounge.ui.screens.music.b.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.l, com.app.mlounge.ui.viewmodel.j0, androidx.compose.runtime.s, int):void, file: classes.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v1 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2128
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.music.b.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.l, com.app.mlounge.ui.viewmodel.j0, androidx.compose.runtime.s, int):void");
            }

            public static final void b(String str, kotlin.jvm.functions.a aVar, l lVar, j0 j0Var, s sVar, int i) {
                j0 j0Var2;
                int i2;
                j0 j0Var3;
                j0 j0Var4;
                s sVar2 = sVar;
                aVar.getClass();
                lVar.getClass();
                sVar2.c0(-1640975508);
                int i3 = i | (sVar2.f(str) ? 4 : 2) | (sVar2.h(aVar) ? 32 : 16) | (sVar2.h(lVar) ? 256 : 128) | LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                if (sVar2.T(i3 & 1, (i3 & 1171) != 1170)) {
                    sVar2.Y();
                    if ((i & 1) == 0 || sVar2.C()) {
                        y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar2);
                        if (y0VarA == null) {
                            kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        } else {
                            j0 j0Var5 = (j0) _COROUTINE.b.J(a0.a(j0.class), y0VarA, n.n(y0VarA, sVar2), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar2);
                            i2 = i3 & (-7169);
                            j0Var3 = j0Var5;
                        }
                    } else {
                        sVar2.W();
                        i2 = i3 & (-7169);
                        j0Var3 = j0Var;
                    }
                    sVar2.q();
                    a1 a1VarG = t.g(j0Var3.A, sVar2);
                    a1 a1VarG2 = t.g(j0Var3.i, sVar2);
                    String strConcat = "music_artist_".concat(str);
                    com.app.mlounge.data.repository.a0 a0Var = j0Var3.c;
                    a0Var.getClass();
                    androidx.room.coroutines.j jVarC = a0Var.a.c(strConcat);
                    int i4 = i2;
                    a1 a1VarF = t.f(jVarC, Boolean.FALSE, null, sVar2, 48, 2);
                    int i5 = i4 & 14;
                    boolean zH = sVar2.h(j0Var3) | (i5 == 4);
                    Object objQ = sVar2.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                    if (zH || objQ == fVar) {
                        objQ = new f(j0Var3, str, null, 2);
                        sVar2.l0(objQ);
                    }
                    l0.c(sVar2, str, (p) objQ);
                    boolean zH2 = sVar2.h(j0Var3);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == fVar) {
                        objQ2 = new c(j0Var3, 1);
                        sVar2.l0(objQ2);
                    }
                    l0.b(y.a, (l) objQ2, sVar2);
                    if (((Boolean) a1VarG2.getValue()).booleanValue() && ((MusicArtistDetail) a1VarG.getValue()) == null) {
                        sVar2.b0(-982996059);
                        b0.n(null, sVar2, 0);
                        sVar2.p(false);
                        s1 s1VarT = sVar2.t();
                        if (s1VarT != null) {
                            s1VarT.d = new d(str, aVar, lVar, j0Var3, i, 2);
                            return;
                        }
                        return;
                    }
                    j0 j0Var6 = j0Var3;
                    sVar2.b0(-982948970);
                    sVar2.p(false);
                    MusicArtistDetail musicArtistDetail = (MusicArtistDetail) a1VarG.getValue();
                    if (musicArtistDetail == null) {
                        sVar2.b0(-982801783);
                        sVar2.p(false);
                        sVar2 = sVar2;
                        j0Var4 = j0Var6;
                    } else {
                        sVar2.b0(-982801782);
                        androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y);
                        e0 e0Var = i1.c;
                        z0 z0VarD = androidx.compose.foundation.layout.b.d(32);
                        boolean zH3 = sVar2.h(musicArtistDetail) | ((i4 & Token.ASSIGN_MOD) == 32) | sVar2.f(a1VarF) | sVar2.h(j0Var6) | (i5 == 4) | ((i4 & 896) == 256);
                        Object objQ3 = sVar2.Q();
                        if (zH3 || objQ3 == fVar) {
                            sVar2 = sVar2;
                            androidx.compose.foundation.layout.r rVar = new androidx.compose.foundation.layout.r(musicArtistDetail, aVar, j0Var6, str, a1VarF, lVar, 2);
                            j0Var4 = j0Var6;
                            sVar2.l0(rVar);
                            objQ3 = rVar;
                        } else {
                            sVar2 = sVar2;
                            j0Var4 = j0Var6;
                        }
                        v.b(aVar2, e0Var, null, z0VarD, null, null, null, false, null, (l) objQ3, sVar2, 3120, 1012);
                        sVar2.p(false);
                    }
                    j0Var2 = j0Var4;
                } else {
                    sVar2.W();
                    j0Var2 = j0Var;
                }
                s1 s1VarT2 = sVar2.t();
                if (s1VarT2 != null) {
                    s1VarT2.d = new d(str, aVar, lVar, j0Var2, i, 3);
                }
            }

            public static final void c(l lVar, l lVar2, j0 j0Var, s sVar, int i) {
                j0 j0Var2;
                int i2;
                j0 j0Var3;
                s sVar2 = sVar;
                lVar.getClass();
                lVar2.getClass();
                sVar2.c0(-1920160550);
                int i3 = i | (sVar2.h(lVar) ? 4 : 2) | (sVar2.h(lVar2) ? 32 : 16) | 128;
                if (sVar2.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    sVar2.Y();
                    if ((i & 1) == 0 || sVar2.C()) {
                        y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar2);
                        if (y0VarA == null) {
                            kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        } else {
                            i2 = i3 & (-897);
                            j0Var3 = (j0) _COROUTINE.b.J(a0.a(j0.class), y0VarA, n.n(y0VarA, sVar2), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar2);
                        }
                    } else {
                        sVar2.W();
                        i2 = i3 & (-897);
                        j0Var3 = j0Var;
                    }
                    int i4 = i2;
                    sVar2.q();
                    a1 a1VarG = t.g(j0Var3.g, sVar2);
                    a1 a1VarG2 = t.g(j0Var3.i, sVar2);
                    a1 a1VarG3 = t.g(j0Var3.k, sVar2);
                    a1 a1VarG4 = t.g(j0Var3.o, sVar2);
                    a1 a1VarG5 = t.g(j0Var3.q, sVar2);
                    a1 a1VarG6 = t.g(j0Var3.s, sVar2);
                    x xVarA = z.a(0, 0, sVar2, 3);
                    Context context = (Context) sVar2.j(m0.b);
                    Resources resources = (Resources) sVar2.j(m0.c);
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal threadLocal = androidx.core.content.res.j.a;
                    long jC = androidx.compose.ui.graphics.a0.c(resources.getColor(R.color.gray_medium, theme));
                    boolean zF = sVar2.f(xVarA) | sVar2.f(a1VarG) | sVar2.h(j0Var3);
                    Object objQ = sVar2.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                    if (zF || objQ == fVar) {
                        objQ = new androidx.room.coroutines.c0(xVarA, j0Var3, a1VarG, (kotlin.coroutines.d) null, 15);
                        sVar2.l0(objQ);
                    }
                    l0.c(sVar2, xVarA, (p) objQ);
                    e0 e0Var = i1.c;
                    w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
                    int iHashCode = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.internal.j jVarL = sVar2.l();
                    r rVarC = androidx.compose.ui.a.c(sVar2, e0Var);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar2);
                    } else {
                        sVar2.o0();
                    }
                    t.x(sVar2, wVarA, androidx.compose.ui.node.g.f);
                    t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                    t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    t.t(sVar2, androidx.compose.ui.node.g.h);
                    t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                    float f2 = 16;
                    j0 j0Var4 = j0Var3;
                    z5.b("Music", androidx.compose.foundation.layout.b.u(o.b, f2, f2, 0.0f, 4, 4), ((t0) sVar2.j(u0.a)).o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).e, sVar, 54, 0, 131064);
                    sVar2 = sVar;
                    String str = (String) a1VarG6.getValue();
                    boolean zH = sVar2.h(j0Var4);
                    Object objQ2 = sVar2.Q();
                    if (zH || objQ2 == fVar) {
                        androidx.compose.foundation.c cVar = new androidx.compose.foundation.c(1, j0Var4, j0.class, "setSource", "setSource(Ljava/lang/String;)V", 0, 11);
                        sVar2.l0(cVar);
                        objQ2 = cVar;
                    }
                    l lVar3 = (l) ((kotlin.reflect.e) objQ2);
                    MusicGenre musicGenre = (MusicGenre) a1VarG4.getValue();
                    boolean zH2 = sVar2.h(j0Var4);
                    Object objQ3 = sVar2.Q();
                    if (zH2 || objQ3 == fVar) {
                        androidx.compose.foundation.c cVar2 = new androidx.compose.foundation.c(1, j0Var4, j0.class, "setGenre", "setGenre(Lcom/app/mlounge/data/remote/model/MusicGenre;)V", 0, 12);
                        sVar2.l0(cVar2);
                        objQ3 = cVar2;
                    }
                    l lVar4 = (l) ((kotlin.reflect.e) objQ3);
                    String str2 = (String) a1VarG5.getValue();
                    List list = j0Var4.D;
                    boolean zH3 = sVar2.h(j0Var4);
                    Object objQ4 = sVar2.Q();
                    if (zH3 || objQ4 == fVar) {
                        androidx.compose.foundation.c cVar3 = new androidx.compose.foundation.c(1, j0Var4, j0.class, "setSection", "setSection(Ljava/lang/String;)V", 0, 13);
                        sVar2.l0(cVar3);
                        objQ4 = cVar3;
                    }
                    b0.p(str, lVar3, musicGenre, lVar4, str2, list, (l) ((kotlin.reflect.e) objQ4), null, sVar2, 0);
                    if (((Boolean) a1VarG2.getValue()).booleanValue() && ((List) a1VarG.getValue()).isEmpty()) {
                        sVar2.b0(1536387476);
                        b0.n(null, sVar2, 0);
                        sVar2.p(false);
                    } else {
                        sVar2.b0(1536534261);
                        androidx.compose.foundation.lazy.grid.a aVar = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar2.j(com.app.mlounge.ui.theme.g.a)).y);
                        float f3 = 12;
                        z0 z0Var = new z0(f3, f3, f3, f3);
                        float f4 = 8;
                        androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f4);
                        androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f4);
                        boolean zF2 = sVar2.f(a1VarG) | sVar2.e(jC) | ((i4 & 14) == 4) | ((i4 & Token.ASSIGN_MOD) == 32) | sVar2.f(a1VarG3);
                        Object objQ5 = sVar2.Q();
                        if (zF2 || objQ5 == fVar) {
                            com.app.mlounge.ui.screens.livetv.d dVar = new com.app.mlounge.ui.screens.livetv.d(a1VarG, jC, lVar, lVar2, a1VarG3);
                            sVar2.l0(dVar);
                            objQ5 = dVar;
                        }
                        v.b(aVar, e0Var, xVarA, z0Var, fVarG2, fVarG, null, false, null, (l) objQ5, sVar, 1772592, 912);
                        sVar2 = sVar;
                        sVar2.p(false);
                    }
                    sVar2.p(true);
                    j0Var2 = j0Var4;
                } else {
                    sVar2.W();
                    j0Var2 = j0Var;
                }
                s1 s1VarT = sVar2.t();
                if (s1VarT != null) {
                    s1VarT.d = new b2(lVar, lVar2, j0Var2, i, 10);
                }
            }

            public static final void d(MusicTrack musicTrack, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, s sVar, int i) {
                sVar.c0(-1671029443);
                int i2 = (sVar.f(musicTrack) ? 4 : 2) | i | (sVar.h(aVar) ? 32 : 16) | (sVar.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128);
                if (sVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    float f2 = 8;
                    p5.a(androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.b.s(i1.e(o.b, 1.0f), 0.0f, 2, 1), androidx.compose.foundation.shape.e.a(f2)), androidx.compose.foundation.shape.e.a(f2), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(801405762, new e(musicTrack, aVar, aVar2), sVar), sVar, 12583296, 120);
                } else {
                    sVar.W();
                }
                s1 s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new e(musicTrack, aVar, aVar2, i);
                }
            }
        }
