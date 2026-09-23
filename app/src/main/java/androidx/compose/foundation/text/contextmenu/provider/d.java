package androidx.compose.foundation.text.contextmenu.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.foundation.c2;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.lazy.m;
import androidx.compose.material3.c5;
import androidx.compose.material3.g2;
import androidx.compose.material3.m6;
import androidx.compose.material3.q;
import androidx.compose.material3.q1;
import androidx.compose.material3.t0;
import androidx.compose.material3.x2;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.internal.j;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.h;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import com.app.mlounge.ui.screens.player.k0;
import com.app.mlounge.ui.screens.settings.e0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d(t0 t0Var, c5 c5Var, m6 m6Var, androidx.compose.runtime.internal.f fVar, int i) {
        this.e = 1;
        this.z = t0Var;
        this.A = c5Var;
        this.B = m6Var;
        this.y = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i;
        h hVar;
        boolean z;
        o oVar;
        Context context;
        i iVar;
        s sVar;
        androidx.compose.ui.graphics.vector.f fVar;
        int i2 = this.e;
        androidx.compose.runtime.f fVar2 = n.a;
        y yVar = y.a;
        Object obj3 = this.B;
        Object obj4 = this.y;
        Object obj5 = this.A;
        Object obj6 = this.z;
        switch (i2) {
            case 0:
                r rVar = (r) obj6;
                a1 a1Var = (a1) obj5;
                androidx.compose.runtime.internal.f fVar3 = (androidx.compose.runtime.internal.f) obj4;
                c cVar = (c) obj3;
                s sVar2 = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objQ = sVar2.Q();
                    if (objQ == fVar2) {
                        objQ = new m2(a1Var, 4);
                        sVar2.l0(objQ);
                    }
                    r rVarL = a0.l(rVar, (l) objQ);
                    q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
                    int iHashCode = Long.hashCode(sVar2.T);
                    j jVarL = sVar2.l();
                    r rVarC = androidx.compose.ui.a.c(sVar2, rVarL);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar4 = androidx.compose.ui.node.g.b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(fVar4);
                    } else {
                        sVar2.o0();
                    }
                    t.x(sVar2, q0VarD, androidx.compose.ui.node.g.f);
                    t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
                    t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    t.t(sVar2, androidx.compose.ui.node.g.h);
                    t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
                    fVar3.invoke(sVar2, 0);
                    Object objQ2 = sVar2.Q();
                    if (objQ2 == fVar2) {
                        i = 6;
                        objQ2 = new m(a1Var, 6);
                        sVar2.l0(objQ2);
                    } else {
                        i = 6;
                    }
                    cVar.b((kotlin.jvm.functions.a) objQ2, sVar2, i);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return yVar;
            case 1:
                ((Integer) obj2).getClass();
                g2.b((t0) obj6, (c5) obj5, (m6) obj3, (androidx.compose.runtime.internal.f) obj4, (s) obj, t.A(7));
                return yVar;
            case 2:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.livetv.a.b((List) obj6, (Map) obj5, (l) obj4, (l) obj3, (s) obj, t.A(1));
                return yVar;
            case 3:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.movies.a.a((String) obj6, (String) obj5, (String) obj4, (kotlin.jvm.functions.a) obj3, (s) obj, t.A(1));
                return yVar;
            case 4:
                ((Integer) obj2).getClass();
                k0.d((String) obj5, (androidx.compose.ui.graphics.vector.f) obj4, (r) obj6, (kotlin.jvm.functions.a) obj3, (s) obj, t.A(7));
                return yVar;
            case 5:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj6;
                p pVar = (p) obj5;
                PackageManager packageManager = (PackageManager) obj4;
                Context context2 = (Context) obj3;
                s sVar3 = (s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                i iVar2 = androidx.compose.ui.c.H;
                h hVar2 = androidx.compose.ui.c.J;
                if (!sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar3.W();
                    return yVar;
                }
                c2 c2VarP = androidx.compose.foundation.s.p(sVar3);
                o oVar2 = o.b;
                r rVarQ = androidx.compose.foundation.s.q(oVar2, c2VarP, true);
                w wVarA = u.a(androidx.compose.foundation.layout.h.c, hVar2, sVar3, 0);
                i iVar3 = iVar2;
                int iHashCode2 = Long.hashCode(sVar3.T);
                j jVarL2 = sVar3.l();
                r rVarC2 = androidx.compose.ui.a.c(sVar3, rVarQ);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar5 = androidx.compose.ui.node.g.b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(fVar5);
                } else {
                    sVar3.o0();
                }
                t.x(sVar3, wVarA, androidx.compose.ui.node.g.f);
                t.x(sVar3, jVarL2, androidx.compose.ui.node.g.e);
                t.p(sVar3, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                t.t(sVar3, androidx.compose.ui.node.g.h);
                t.x(sVar3, rVarC2, androidx.compose.ui.node.g.d);
                sVar3.b0(265554837);
                Iterator it = e0.c.iterator();
                while (true) {
                    h hVar3 = hVar2;
                    if (!it.hasNext()) {
                        i iVar4 = iVar3;
                        s sVar4 = sVar3;
                        o oVar3 = oVar2;
                        y yVar2 = yVar;
                        kotlin.jvm.functions.a aVar2 = aVar;
                        sVar4.p(false);
                        float f = 4;
                        q.d(androidx.compose.foundation.layout.b.s(oVar3, 0.0f, f, 1), 0.0f, com.app.mlounge.ui.theme.b.e, sVar4, 6, 2);
                        Object objQ3 = sVar4.Q();
                        if (objQ3 == fVar2) {
                            objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar4);
                        }
                        k kVar = (k) objQ3;
                        r rVarG = androidx.compose.foundation.s.g(i1.e(oVar3, 1.0f), 2, ((Boolean) _COROUTINE.a.B(kVar, sVar4, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8));
                        boolean zF = sVar4.f(aVar2);
                        Object objQ4 = sVar4.Q();
                        if (zF || objQ4 == fVar2) {
                            objQ4 = new x2(18, aVar2);
                            sVar4.l0(objQ4);
                        }
                        float f2 = 12;
                        r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ4, 28), kVar, 1), f, f2);
                        f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, iVar4, sVar4, 48);
                        int iHashCode3 = Long.hashCode(sVar4.T);
                        j jVarL3 = sVar4.l();
                        r rVarC3 = androidx.compose.ui.a.c(sVar4, rVarR);
                        androidx.compose.ui.node.h.b.getClass();
                        androidx.compose.ui.node.f fVar6 = androidx.compose.ui.node.g.b;
                        sVar4.e0();
                        if (sVar4.S) {
                            sVar4.k(fVar6);
                        } else {
                            sVar4.o0();
                        }
                        androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                        t.x(sVar4, f1VarA, eVar);
                        androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                        t.x(sVar4, jVarL3, eVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode3);
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                        t.p(sVar4, numValueOf, eVar3);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                        t.t(sVar4, dVar);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                        t.x(sVar4, rVarC3, eVar4);
                        androidx.compose.ui.graphics.vector.f fVarB = kotlin.math.a.e;
                        if (fVarB == null) {
                            androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.AppShortcut", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i3 = h0.a;
                            long j = androidx.compose.ui.graphics.t.b;
                            p0 p0Var = new p0(j);
                            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                            gVar.v(17.0f, 18.0f);
                            gVar.r(7.0f);
                            gVar.z(6.0f);
                            gVar.s(10.0f);
                            gVar.A(1.0f);
                            gVar.s(2.0f);
                            gVar.z(3.0f);
                            gVar.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            gVar.r(7.0f);
                            gVar.m(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
                            gVar.A(18.0f);
                            gVar.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            gVar.s(10.0f);
                            gVar.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            gVar.A(-4.0f);
                            gVar.s(-2.0f);
                            gVar.z(18.0f);
                            gVar.l();
                            androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.b, 0, p0Var);
                            p0 p0Var2 = new p0(j);
                            androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                            gVar2.v(20.38f, 9.62f);
                            gVar2.u(0.62f, 1.38f);
                            gVar2.u(0.62f, -1.38f);
                            gVar2.u(1.38f, -0.62f);
                            gVar2.u(-1.38f, -0.62f);
                            gVar2.u(-0.62f, -1.38f);
                            androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar2, -0.62f, 1.38f, -1.38f, 0.62f);
                            androidx.compose.ui.graphics.vector.e.a(eVar5, gVar2.b, 0, p0Var2);
                            p0 p0Var3 = new p0(j);
                            androidx.compose.ui.graphics.vector.g gVar3 = new androidx.compose.ui.graphics.vector.g(0);
                            gVar3.v(16.0f, 8.0f);
                            gVar3.u(-1.25f, 2.75f);
                            gVar3.u(-2.75f, 1.25f);
                            gVar3.u(2.75f, 1.25f);
                            gVar3.u(1.25f, 2.75f);
                            gVar3.u(1.25f, -2.75f);
                            androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar3, 2.75f, -1.25f, -2.75f, -1.25f);
                            androidx.compose.ui.graphics.vector.e.a(eVar5, gVar3.b, 0, p0Var3);
                            p0 p0Var4 = new p0(j);
                            androidx.compose.ui.graphics.vector.g gVar4 = new androidx.compose.ui.graphics.vector.g(0);
                            gVar4.v(21.0f, 13.0f);
                            gVar4.u(-0.62f, 1.38f);
                            gVar4.u(-1.38f, 0.62f);
                            gVar4.u(1.38f, 0.62f);
                            gVar4.u(0.62f, 1.38f);
                            gVar4.u(0.62f, -1.38f);
                            androidx.privacysandbox.ads.adservices.java.internal.a.C(gVar4, 1.38f, -0.62f, -1.38f, -0.62f);
                            androidx.compose.ui.graphics.vector.e.a(eVar5, gVar4.b, 0, p0Var4);
                            fVarB = eVar5.b();
                            kotlin.math.a.e = fVarB;
                        }
                        q1.b(fVarB, null, i1.m(oVar3, 24), com.app.mlounge.ui.theme.b.f, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x07c4: INVOKE 
                              (r0v18 'fVarB' androidx.compose.ui.graphics.vector.f)
                              (null java.lang.String)
                              (wrap androidx.compose.ui.r:0x07bb: INVOKE (r6v13 'oVar3' androidx.compose.ui.o), (24 int) STATIC call: androidx.compose.foundation.layout.i1.m(androidx.compose.ui.r, float):androidx.compose.ui.r A[MD:(androidx.compose.ui.r, float):androidx.compose.ui.r (m), WRAPPED] (LINE:1980))
                              (wrap long:0x07b6: SGET  A[WRAPPED] (LINE:1975) com.app.mlounge.ui.theme.b.f long)
                              (r14v7 ?? I:??[OBJECT, ARRAY])
                              (432 int)
                              (0 int)
                             STATIC call: androidx.compose.material3.q1.b(androidx.compose.ui.graphics.vector.f, java.lang.String, androidx.compose.ui.r, long, androidx.compose.runtime.s, int, int):void A[MD:(androidx.compose.ui.graphics.vector.f, java.lang.String, androidx.compose.ui.r, long, androidx.compose.runtime.s, int, int):void (m)] (LINE:1989) in method: androidx.compose.foundation.text.contextmenu.provider.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object, file: classes.dex
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
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v7 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 2504
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.provider.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }

                    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i) {
                        this.e = i;
                        this.z = obj;
                        this.A = obj2;
                        this.y = obj3;
                        this.B = obj4;
                    }

                    public /* synthetic */ d(Object obj, Object obj2, Object obj3, kotlin.d dVar, int i, int i2) {
                        this.e = i2;
                        this.z = obj;
                        this.A = obj2;
                        this.y = obj3;
                        this.B = dVar;
                    }

                    public /* synthetic */ d(String str, androidx.compose.ui.graphics.vector.f fVar, r rVar, kotlin.jvm.functions.a aVar, int i) {
                        this.e = 4;
                        this.A = str;
                        this.y = fVar;
                        this.z = rVar;
                        this.B = aVar;
                    }
                }
