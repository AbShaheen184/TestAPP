package androidx.compose.runtime;

import android.os.Trace;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public int A;
    public int B;
    public boolean C;
    public final r D;
    public final ArrayList E;
    public boolean F;
    public g2 G;
    public h2 H;
    public k2 I;
    public boolean J;
    public androidx.compose.runtime.internal.j K;
    public androidx.compose.runtime.changelist.a L;
    public final androidx.compose.runtime.changelist.b M;
    public a N;
    public androidx.compose.runtime.changelist.c O;
    public androidx.compose.ui.graphics.a P;
    public final androidx.compose.runtime.tooling.d Q;
    public final kotlin.coroutines.j R;
    public boolean S;
    public long T;
    public y U;
    public final androidx.compose.ui.node.a2 a;
    public final w b;
    public final h2 c;
    public final androidx.collection.r0 d;
    public final androidx.compose.runtime.changelist.a e;
    public final androidx.compose.runtime.changelist.a f;
    public final com.app.mlounge.data.music.e g;
    public final z h;
    public o1 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public androidx.collection.x p;
    public boolean q;
    public boolean r;
    public androidx.collection.z v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final q0 n = new q0();
    public final ArrayList s = new ArrayList();
    public final q0 t = new q0();
    public androidx.compose.runtime.internal.j u = androidx.compose.runtime.internal.j.A;
    public final q0 x = new q0();
    public int z = -1;

    public s(androidx.compose.ui.node.a2 a2Var, w wVar, h2 h2Var, androidx.collection.r0 r0Var, androidx.compose.runtime.changelist.a aVar, androidx.compose.runtime.changelist.a aVar2, com.app.mlounge.data.music.e eVar, z zVar) {
        this.a = a2Var;
        this.b = wVar;
        this.c = h2Var;
        this.d = r0Var;
        this.e = aVar;
        this.f = aVar2;
        this.g = eVar;
        this.h = zVar;
        this.C = wVar.f() || wVar.d();
        this.D = new r(this, 0);
        this.E = new ArrayList();
        g2 g2VarD = h2Var.d();
        g2VarD.c();
        this.G = g2VarD;
        h2 h2Var2 = new h2();
        if (wVar.f()) {
            h2Var2.c();
        }
        if (wVar.d()) {
            h2Var2.H = new androidx.collection.z();
        }
        this.H = h2Var2;
        k2 k2VarE = h2Var2.e();
        k2VarE.e(true);
        this.I = k2VarE;
        this.M = new androidx.compose.runtime.changelist.b(this, aVar);
        g2 g2VarD2 = this.H.d();
        try {
            a aVarA = g2VarD2.a(0);
            g2VarD2.c();
            this.N = aVarA;
            this.O = new androidx.compose.runtime.changelist.c();
            this.Q = new androidx.compose.runtime.tooling.d(this);
            kotlin.coroutines.j jVarJ = wVar.j();
            kotlin.coroutines.j jVarD = D();
            this.R = jVarJ.plus(jVarD == null ? kotlin.coroutines.k.e : jVarD);
        } catch (Throwable th) {
            g2VarD2.c();
            throw th;
        }
    }

    public static final int S(s sVar, int i, boolean z, int i2) {
        g2 g2Var = sVar.G;
        androidx.compose.runtime.changelist.b bVar = sVar.M;
        boolean zJ = g2Var.j(i);
        int[] iArr = g2Var.b;
        if (zJ) {
            int i3 = g2Var.i(i);
            Object objP = g2Var.p(i, iArr);
            if (i3 == 206 && kotlin.jvm.internal.l.a(objP, u.e)) {
                Object objH = g2Var.h(i, 0);
                c2 c2Var = objH instanceof c2 ? (c2) objH : null;
                b2 b2Var = c2Var != null ? c2Var.a : null;
                p pVar = b2Var instanceof p ? (p) b2Var : null;
                if (pVar != null) {
                    for (s sVar2 : pVar.e.e) {
                        h2 h2Var = sVar2.c;
                        if (h2Var.y > 0 && (h2Var.e[1] & 67108864) != 0) {
                            z zVar = sVar2.h;
                            synchronized (zVar.A) {
                                zVar.p();
                                androidx.collection.o0 o0Var = zVar.K;
                                zVar.K = _COROUTINE.a.D();
                                try {
                                    zVar.S.h0(o0Var);
                                } catch (Throwable th) {
                                    zVar.K = o0Var;
                                    throw th;
                                }
                            }
                            androidx.compose.runtime.changelist.a aVar = new androidx.compose.runtime.changelist.a();
                            sVar2.L = aVar;
                            g2 g2VarD = sVar2.c.d();
                            try {
                                sVar2.G = g2VarD;
                                androidx.compose.runtime.changelist.b bVar2 = sVar2.M;
                                androidx.compose.runtime.changelist.a aVar2 = bVar2.b;
                                try {
                                    bVar2.b = aVar;
                                    sVar2.R(0);
                                    androidx.compose.runtime.changelist.b bVar3 = sVar2.M;
                                    bVar3.b();
                                    if (bVar3.c) {
                                        bVar3.b.l.W(androidx.compose.runtime.changelist.c0.c);
                                        if (bVar3.c) {
                                            bVar3.d(false);
                                            bVar3.d(false);
                                            bVar3.b.l.W(androidx.compose.runtime.changelist.m.c);
                                            bVar3.c = false;
                                        }
                                    }
                                    bVar2.b = aVar2;
                                    g2VarD.c();
                                } catch (Throwable th2) {
                                    bVar2.b = aVar2;
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                g2VarD.c();
                                throw th3;
                            }
                        }
                        sVar.b.r(sVar2.h);
                    }
                }
                return g2Var.o(i);
            }
            if (!g2Var.l(i)) {
                return g2Var.o(i);
            }
        } else if (g2Var.d(i)) {
            int i4 = iArr[(i * 5) + 3] + i;
            int iS = 0;
            for (int i5 = i + 1; i5 < i4; i5 += iArr[(i5 * 5) + 3]) {
                boolean zL = g2Var.l(i5);
                if (zL) {
                    bVar.c();
                    Object objN = g2Var.n(i5);
                    bVar.c();
                    bVar.h.add(objN);
                }
                iS += S(sVar, i5, zL || z, zL ? 0 : i2 + iS);
                if (zL) {
                    bVar.c();
                    bVar.a();
                }
            }
            if (!g2Var.l(i)) {
                return iS;
            }
        } else if (!g2Var.l(i)) {
            return g2Var.o(i);
        }
        return 1;
    }

    public final androidx.compose.runtime.internal.j A() {
        return l();
    }

    public final s1 B() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (s1) androidx.privacysandbox.ads.adservices.java.internal.a.l(1, arrayList);
    }

    public final boolean C() {
        if (!F() || this.w) {
            return true;
        }
        s1 s1VarB = B();
        return (s1VarB == null || (s1VarB.b & 4) == 0) ? false : true;
    }

    public final androidx.compose.runtime.tooling.d D() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean E() {
        return this.S;
    }

    public final boolean F() {
        s1 s1VarB;
        return (this.S || this.y || this.w || (s1VarB = B()) == null || (s1VarB.b & 8) != 0) ? false : true;
    }

    public final void G(ArrayList arrayList) {
        androidx.compose.runtime.changelist.a aVar = this.f;
        androidx.compose.runtime.changelist.b bVar = this.M;
        androidx.compose.runtime.changelist.a aVar2 = bVar.b;
        try {
            bVar.b = aVar;
            aVar.l.W(androidx.compose.runtime.changelist.a0.c);
            if (arrayList.size() <= 0) {
                bVar.b();
                bVar.b.l.W(androidx.compose.runtime.changelist.n.c);
                bVar.f = 0;
                bVar.b = aVar2;
                return;
            }
            kotlin.k kVar = (kotlin.k) arrayList.get(0);
            z0 z0Var = (z0) kVar.e;
            z0Var.getClass();
            throw null;
        } catch (Throwable th) {
            bVar.b = aVar2;
            throw th;
        }
    }

    public final void H(androidx.compose.runtime.internal.j jVar, Object obj) {
        X(126665345, null, null, 0);
        I();
        m0(obj);
        long j = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                k2.z(this.I);
            }
            boolean z = (this.S || kotlin.jvm.internal.l.a(this.G.f(), jVar)) ? false : true;
            if (z) {
                O(jVar);
            }
            X(202, u.c, jVar, 0);
            this.K = null;
            this.w = z;
            throw null;
        } catch (Throwable th) {
            try {
                coil3.network.g.G(th, new o(2, this));
                throw th;
            } catch (Throwable th2) {
                p(false);
                this.K = null;
                this.T = j;
                p(false);
                throw th2;
            }
        }
    }

    public final Object I() {
        boolean z = this.S;
        f fVar = n.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof f2)) {
                return objM;
            }
        } else if (this.r) {
            u.a("A call to createNode(), emitNode() or useNode() expected");
            return fVar;
        }
        return fVar;
    }

    public final List J() {
        w wVar = this.b;
        v vVarH = wVar.h();
        z zVar = vVarH != null ? (z) vVarH : null;
        if (zVar != null) {
            h2 h2Var = zVar.C;
            g2 g2VarD = h2Var.d();
            try {
                Integer numN = androidx.work.impl.v.n(g2VarD, wVar, 0, g2VarD.c);
                g2VarD.c();
                if (numN != null) {
                    g2 g2VarD2 = h2Var.d();
                    try {
                        return kotlin.collections.p.O(androidx.work.impl.v.Q(g2VarD2, numN.intValue(), 0), zVar.S.J());
                    } finally {
                        g2VarD2.c();
                    }
                }
            } catch (Throwable th) {
                g2VarD.c();
                throw th;
            }
        }
        return kotlin.collections.w.e;
    }

    public final int K(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    public final Object L(z zVar, z zVar2, Integer num, List list, kotlin.jvm.functions.a aVar) {
        Object objInvoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                kotlin.k kVar = (kotlin.k) list.get(i2);
                s1 s1Var = (s1) kVar.e;
                Object obj = kVar.y;
                if (obj != null) {
                    g0(s1Var, obj);
                } else {
                    g0(s1Var, null);
                }
            }
            if (zVar == null) {
                objInvoke = aVar.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (zVar2 == null || zVar2.equals(zVar) || iIntValue < 0) {
                    objInvoke = aVar.invoke();
                } else {
                    zVar.O = zVar2;
                    zVar.P = iIntValue;
                    try {
                        objInvoke = aVar.invoke();
                        zVar.O = null;
                        zVar.P = 0;
                    } catch (Throwable th) {
                        zVar.O = null;
                        zVar.P = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = aVar.invoke();
                }
            }
            this.F = z;
            this.k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void M() {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.s.M():void");
    }

    public final void N() {
        int i;
        R(this.G.g);
        androidx.compose.runtime.changelist.b bVar = this.M;
        bVar.d(false);
        q0 q0Var = bVar.d;
        s sVar = bVar.a;
        g2 g2Var = sVar.G;
        if (g2Var.c > 0 && q0Var.a(-2) != (i = g2Var.i)) {
            if (!bVar.c && bVar.e) {
                bVar.d(false);
                bVar.b.l.W(androidx.compose.runtime.changelist.q.c);
                bVar.c = true;
            }
            if (i > 0) {
                a aVarA = g2Var.a(i);
                q0Var.c(i);
                bVar.d(false);
                androidx.compose.runtime.changelist.l0 l0Var = bVar.b.l;
                l0Var.W(androidx.compose.runtime.changelist.p.c);
                okhttp3.internal.platform.android.g.w(l0Var, 0, aVarA);
                bVar.c = true;
            }
        }
        bVar.b.l.W(androidx.compose.runtime.changelist.y.c);
        int i2 = bVar.f;
        g2 g2Var2 = sVar.G;
        bVar.f = g2Var2.b[(g2Var2.g * 5) + 3] + i2;
    }

    public final void O(androidx.compose.runtime.internal.j jVar) {
        androidx.collection.z zVar = this.v;
        if (zVar == null) {
            zVar = new androidx.collection.z();
            this.v = zVar;
        }
        zVar.h(this.G.g, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void P(int i, int i2, int i3) {
        g2 g2Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (g2Var.q(i) == i2) {
                i3 = i2;
            } else if (g2Var.q(i2) == i) {
                i3 = i;
            } else if (g2Var.q(i) == g2Var.q(i2)) {
                i3 = g2Var.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = g2Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = g2Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = g2Var.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = g2Var.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = g2Var.q(iQ5)) {
                    i3 = g2Var.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (g2Var.l(i)) {
                this.M.a();
            }
            i = g2Var.q(i);
        }
        o(i2, i3);
    }

    public final Object Q() {
        boolean z = this.S;
        f fVar = n.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof f2)) {
                return objM instanceof c2 ? ((c2) objM).a : objM;
            }
        } else if (this.r) {
            u.a("A call to createNode(), emitNode() or useNode() expected");
            return fVar;
        }
        return fVar;
    }

    public final void R(int i) {
        boolean zL = this.G.l(i);
        androidx.compose.runtime.changelist.b bVar = this.M;
        if (zL) {
            bVar.c();
            Object objN = this.G.n(i);
            bVar.c();
            bVar.h.add(objN);
        }
        S(this, i, zL, 0);
        bVar.c();
        if (zL) {
            bVar.a();
        }
    }

    public final boolean T(int i, boolean z) {
        if ((i & 1) == 0 && (this.S || this.y)) {
            androidx.compose.ui.graphics.a aVar = this.P;
            if (aVar != null && B() != null) {
                aVar.getClass();
            }
        } else if (!z && F()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    public final void U() {
        int i;
        long jRotateLeft;
        long jRotateLeft2;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        g2 g2Var = this.G;
        int iG = g2Var.g();
        int[] iArr = g2Var.b;
        int i2 = g2Var.g;
        Object objP = i2 < g2Var.h ? g2Var.p(i2, iArr) : null;
        Object objF = g2Var.f();
        int i3 = this.m;
        f fVar = n.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(fVar)) {
                jRotateLeft2 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i3);
            } else {
                this.T = Long.rotateLeft(((long) objF.hashCode()) ^ Long.rotateLeft(this.T, 3), 3) ^ ((long) i3);
            }
            a0(null, (iArr[(g2Var.g * 5) + 1] & 1073741824) != 0);
            M();
            g2Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(fVar)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i3), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i3), 3), 3);
            }
        }
        if (objP instanceof Enum) {
            jRotateLeft = Long.rotateLeft(((long) ((Enum) objP).ordinal()) ^ Long.rotateLeft(this.T, 3), 3);
            i = 0;
        } else {
            i = 0;
            jRotateLeft = Long.rotateLeft(((long) objP.hashCode()) ^ Long.rotateLeft(this.T, 3), 3);
        }
        jRotateLeft2 = jRotateLeft ^ ((long) i);
        this.T = jRotateLeft2;
        a0(null, (iArr[(g2Var.g * 5) + 1] & 1073741824) != 0);
        M();
        g2Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i3), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void V() {
        g2 g2Var = this.G;
        int i = g2Var.i;
        this.l = i >= 0 ? g2Var.b[(i * 5) + 1] & 67108863 : 0;
        g2Var.t();
    }

    public final void W() {
        if (this.l != 0) {
            u.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        s1 s1VarB = B();
        if (s1VarB != null) {
            int i = s1VarB.b;
            if ((i & 128) == 0) {
                s1VarB.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            V();
        } else {
            M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0327  */
    /* JADX WARN: Code duplicated, block: B:175:0x033d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0358  */
    /* JADX WARN: Code duplicated, block: B:179:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x0360 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0364  */
    /* JADX WARN: Code duplicated, block: B:184:0x036b  */
    /* JADX WARN: Code duplicated, block: B:186:0x036e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0370  */
    /* JADX WARN: Code duplicated, block: B:191:0x039e  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x0160  */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:83:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x017a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0198  */
    public final void X(int i, Object obj, Object obj2, int i2) {
        long jRotateLeft;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        o1 o1Var;
        o1 o1Var2;
        ArrayList arrayList;
        androidx.collection.z zVar;
        int i3;
        Object objValueOf;
        androidx.collection.o0 o0Var;
        Object objG;
        androidx.collection.j0 j0Var;
        k2 k2Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        g2 g2Var;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        g2 g2Var2;
        int i13;
        Object objP;
        k2 k2Var2;
        int i14;
        o1 o1Var3;
        Object obj4 = obj;
        if (this.r) {
            u.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.m;
        Object obj5 = n.a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3);
                j = i15;
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i15);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                k2Var2 = this.I;
                i14 = k2Var2.t;
                if (z) {
                    k2Var2.Q(i, obj5, obj5, true);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    k2Var2.Q(i, obj4, obj2, false);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    k2Var2.Q(i, obj4, obj5, false);
                }
                o1Var3 = this.j;
                if (o1Var3 != null) {
                    int i16 = (-2) - i14;
                    u0 u0Var = new u0(i, i16, -1, -1);
                    o1Var3.e.h(i16, new n0(-1, this.k - o1Var3.b, 0));
                    o1Var3.d.add(u0Var);
                }
                x(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    g2Var2 = this.G;
                    i13 = g2Var2.g;
                    if (i13 < g2Var2.h) {
                        objP = g2Var2.p(i13, g2Var2.b);
                    } else {
                        objP = null;
                    }
                    if (kotlin.jvm.internal.l.a(obj4, objP)) {
                        a0(obj2, z);
                        z3 = z2;
                    }
                }
                g2Var = this.G;
                iArr = g2Var.b;
                arrayList2 = new ArrayList();
                if (g2Var.k <= 0) {
                    i10 = g2Var.g;
                    while (i10 < g2Var.h) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objP2 = g2Var.p(i10, iArr);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new u0(i18, i10, i12, objP2));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new o1(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            o1Var = this.j;
            if (o1Var != null) {
                arrayList = o1Var.d;
                zVar = o1Var.e;
                i3 = o1Var.b;
                if (obj4 != null) {
                    objValueOf = new t0(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                o0Var = ((androidx.compose.runtime.collection.a) o1Var.f.getValue()).a;
                objG = o0Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof androidx.collection.j0) {
                    j0Var = (androidx.collection.j0) objG;
                    Object objK = j0Var.k(0);
                    if (j0Var.h()) {
                        o0Var.k(objValueOf);
                    }
                    if (j0Var.b == 1) {
                        o0Var.m(objValueOf, j0Var.e());
                    }
                    objG = objK;
                } else {
                    o0Var.k(objValueOf);
                }
                u0 u0Var2 = (u0) objG;
                if (!z3 || u0Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        k2 k2VarE = this.H.e();
                        this.I = k2VarE;
                        k2VarE.M();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    k2Var = this.I;
                    int i19 = k2Var.t;
                    if (z) {
                        k2Var.Q(i, obj5, obj5, true);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        k2Var.Q(i, obj5, obj2, false);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        k2Var.Q(i, obj3, obj5, false);
                    }
                    this.N = this.I.b(i19);
                    int i20 = (-2) - i19;
                    u0 u0Var3 = new u0(i, i20, -1, -1);
                    zVar.h(i20, new n0(-1, this.k - i3, i4));
                    arrayList.add(u0Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    o1Var2 = new o1(i5, arrayList3);
                } else {
                    int i21 = u0Var2.c;
                    arrayList.add(u0Var2);
                    n0 n0Var = (n0) zVar.b(i21);
                    this.k = (n0Var != null ? n0Var.b : -1) + i3;
                    n0 n0Var2 = (n0) zVar.b(i21);
                    int i22 = n0Var2 != null ? n0Var2.a : -1;
                    int i23 = o1Var.c;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = zVar.c;
                            long[] jArr = zVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j2 = jArr[i26];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j2 & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                n0 n0Var3 = (n0) objArr3[(i26 << 3) + i28];
                                                int i29 = n0Var3.a;
                                                if (i29 == i22) {
                                                    n0Var3.a = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        n0Var3.a = i29 - 1;
                                                    }
                                                }
                                            }
                                            j2 >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = zVar.c;
                        long[] jArr2 = zVar.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j3 = jArr2[i30];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j3 & 255) < 128) {
                                            i9 = i25;
                                            n0 n0Var4 = (n0) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = n0Var4.a;
                                            if (i33 == i22) {
                                                n0Var4.a = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                n0Var4.a = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j3 >>= i9;
                                        i32++;
                                        i25 = i9;
                                        i24 = i8;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    androidx.compose.runtime.changelist.b bVar = this.M;
                    int i34 = bVar.f;
                    s sVar = bVar.a;
                    bVar.f = (i21 - sVar.G.g) + i34;
                    this.G.r(i21);
                    if (i6 > 0) {
                        bVar.d(false);
                        q0 q0Var = bVar.d;
                        g2 g2Var3 = sVar.G;
                        if (g2Var3.c > 0 && q0Var.a(-2) != (i7 = g2Var3.i)) {
                            if (!bVar.c && bVar.e) {
                                bVar.d(false);
                                bVar.b.l.W(androidx.compose.runtime.changelist.q.c);
                                bVar.c = true;
                            }
                            if (i7 > 0) {
                                a aVarA = g2Var3.a(i7);
                                q0Var.c(i7);
                                bVar.d(false);
                                androidx.compose.runtime.changelist.l0 l0Var = bVar.b.l;
                                l0Var.W(androidx.compose.runtime.changelist.p.c);
                                okhttp3.internal.platform.android.g.w(l0Var, 0, aVarA);
                                bVar.c = true;
                            }
                        }
                        androidx.compose.runtime.changelist.l0 l0Var2 = bVar.b.l;
                        l0Var2.W(androidx.compose.runtime.changelist.u.c);
                        l0Var2.n[l0Var2.o - l0Var2.l[l0Var2.m - 1].a] = i6;
                    }
                    a0(obj2, z);
                    o1Var2 = null;
                }
            } else {
                o1Var2 = null;
            }
            x(z, o1Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        j = 0;
        this.T = jRotateLeft ^ j;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            k2Var2 = this.I;
            i14 = k2Var2.t;
            if (z) {
                k2Var2.Q(i, obj5, obj5, true);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                k2Var2.Q(i, obj4, obj2, false);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                k2Var2.Q(i, obj4, obj5, false);
            }
            o1Var3 = this.j;
            if (o1Var3 != null) {
                int i110 = (-2) - i14;
                u0 u0Var4 = new u0(i, i110, -1, -1);
                o1Var3.e.h(i110, new n0(-1, this.k - o1Var3.b, 0));
                o1Var3.d.add(u0Var4);
            }
            x(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                g2Var2 = this.G;
                i13 = g2Var2.g;
                if (i13 < g2Var2.h) {
                    objP = g2Var2.p(i13, g2Var2.b);
                } else {
                    objP = null;
                }
                if (kotlin.jvm.internal.l.a(obj4, objP)) {
                    a0(obj2, z);
                    z3 = z2;
                }
            }
            g2Var = this.G;
            iArr = g2Var.b;
            arrayList2 = new ArrayList();
            if (g2Var.k <= 0) {
                i10 = g2Var.g;
                while (i10 < g2Var.h) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = g2Var.p(i10, iArr);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new u0(i112, i10, i12, objP3));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new o1(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        o1Var = this.j;
        if (o1Var != null) {
            arrayList = o1Var.d;
            zVar = o1Var.e;
            i3 = o1Var.b;
            if (obj4 != null) {
                objValueOf = new t0(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            o0Var = ((androidx.compose.runtime.collection.a) o1Var.f.getValue()).a;
            objG = o0Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof androidx.collection.j0) {
                j0Var = (androidx.collection.j0) objG;
                Object objK2 = j0Var.k(0);
                if (j0Var.h()) {
                    o0Var.k(objValueOf);
                }
                if (j0Var.b == 1) {
                    o0Var.m(objValueOf, j0Var.e());
                }
                objG = objK2;
            } else {
                o0Var.k(objValueOf);
            }
            u0 u0Var5 = (u0) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                k2 k2VarE2 = this.H.e();
                this.I = k2VarE2;
                k2VarE2.M();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            k2Var = this.I;
            int i113 = k2Var.t;
            if (z) {
                k2Var.Q(i, obj5, obj5, true);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                k2Var.Q(i, obj5, obj2, false);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                k2Var.Q(i, obj3, obj5, false);
            }
            this.N = this.I.b(i113);
            int i210 = (-2) - i113;
            u0 u0Var6 = new u0(i, i210, -1, -1);
            zVar.h(i210, new n0(-1, this.k - i3, i4));
            arrayList.add(u0Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            o1Var2 = new o1(i5, arrayList4);
        } else {
            o1Var2 = null;
        }
        x(z, o1Var2);
    }

    public final void Y() {
        X(-127, null, null, 0);
    }

    public final void Z(int i, d1 d1Var) {
        X(i, d1Var, null, 0);
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        androidx.compose.runtime.changelist.c cVar = this.O;
        cVar.m.S();
        cVar.l.S();
        this.T = 0;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        g2 g2Var = this.G;
        if (!g2Var.f) {
            g2Var.c();
        }
        if (this.I.w) {
            return;
        }
        y();
    }

    public final void a0(Object obj, boolean z) {
        if (z) {
            g2 g2Var = this.G;
            if (g2Var.k <= 0) {
                if ((g2Var.b[(g2Var.g * 5) + 1] & 1073741824) == 0) {
                    p1.a("Expected a node group");
                }
                g2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            androidx.compose.runtime.changelist.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            androidx.compose.runtime.changelist.l0 l0Var = bVar.b.l;
            l0Var.W(androidx.compose.runtime.changelist.f0.c);
            okhttp3.internal.platform.android.g.w(l0Var, 0, obj);
        }
        this.G.u();
    }

    public final void b(Object obj, kotlin.jvm.functions.p pVar) {
        if (this.S) {
            androidx.compose.runtime.changelist.l0 l0Var = this.O.l;
            l0Var.W(androidx.compose.runtime.changelist.g0.c);
            okhttp3.internal.platform.android.g.w(l0Var, 0, obj);
            pVar.getClass();
            kotlin.jvm.internal.c0.c(2, pVar);
            okhttp3.internal.platform.android.g.w(l0Var, 1, pVar);
            return;
        }
        androidx.compose.runtime.changelist.b bVar = this.M;
        bVar.b();
        androidx.compose.runtime.changelist.l0 l0Var2 = bVar.b.l;
        l0Var2.W(androidx.compose.runtime.changelist.g0.c);
        pVar.getClass();
        kotlin.jvm.internal.c0.c(2, pVar);
        okhttp3.internal.platform.android.g.x(l0Var2, 0, obj, 1, pVar);
    }

    public final void b0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            X(i, null, null, 0);
            return;
        }
        if (this.r) {
            u.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        g2 g2Var = this.G;
        boolean z = this.S;
        f fVar = n.a;
        if (z) {
            g2Var.k++;
            this.I.Q(i, fVar, fVar, false);
            x(false, null);
            return;
        }
        if (g2Var.g() == i && ((i3 = g2Var.g) >= g2Var.h || (g2Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            g2Var.u();
            x(false, null);
            return;
        }
        if (g2Var.k <= 0 && (i2 = g2Var.g) != g2Var.h) {
            int i4 = this.k;
            N();
            this.M.e(i4, g2Var.s());
            t.c(i2, this.s, g2Var.g);
        }
        g2Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            k2 k2VarE = this.H.e();
            this.I = k2VarE;
            k2VarE.M();
            this.J = false;
            this.K = null;
        }
        k2 k2Var = this.I;
        k2Var.d();
        int i5 = k2Var.t;
        k2Var.Q(i, fVar, fVar, false);
        this.N = k2Var.b(i5);
        x(false, null);
    }

    public final boolean c(float f) {
        Object objI = I();
        if ((objI instanceof Float) && f == ((Number) objI).floatValue()) {
            return false;
        }
        m0(Float.valueOf(f));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final s c0(int i) {
        s1 s1Var;
        boolean z;
        b0(i);
        boolean z2 = this.S;
        com.app.mlounge.data.music.e eVar = this.g;
        ArrayList arrayList = this.E;
        z zVar = this.h;
        if (z2) {
            s1 s1Var2 = new s1(zVar);
            arrayList.add(s1Var2);
            m0(s1Var2);
            s1Var2.e = this.B;
            s1Var2.b &= -17;
            eVar.k();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iL = t.l(i2, arrayList2);
        r0 r0Var = iL >= 0 ? (r0) arrayList2.remove(iL) : null;
        Object objM = this.G.m();
        if (kotlin.jvm.internal.l.a(objM, n.a)) {
            s1Var = new s1(zVar);
            m0(s1Var);
        } else {
            objM.getClass();
            s1Var = (s1) objM;
        }
        if (r0Var == null) {
            int i3 = s1Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                s1Var.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = s1Var.b;
        s1Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(s1Var);
        s1Var.e = this.B;
        s1Var.b &= -17;
        eVar.k();
        int i5 = s1Var.b;
        if ((i5 & LibretroCore.SCREEN_WIDTH) != 0) {
            s1Var.b = (i5 & (-257)) | 512;
            androidx.compose.runtime.changelist.l0 l0Var = this.M.b.l;
            l0Var.W(androidx.compose.runtime.changelist.d0.c);
            okhttp3.internal.platform.android.g.w(l0Var, 0, s1Var);
            if (!this.y) {
                int i6 = s1Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    s1Var.b = i6 | LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
            }
        }
        return this;
    }

    public final boolean d(int i) {
        Object objI = I();
        if ((objI instanceof Integer) && i == ((Number) objI).intValue()) {
            return false;
        }
        m0(Integer.valueOf(i));
        return true;
    }

    public final void d0(Object obj) {
        if (!this.S && this.G.g() == 207 && !kotlin.jvm.internal.l.a(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        X(207, null, obj, 0);
    }

    public final boolean e(long j) {
        Object objI = I();
        if ((objI instanceof Long) && j == ((Number) objI).longValue()) {
            return false;
        }
        m0(Long.valueOf(j));
        return true;
    }

    public final void e0() {
        X(Token.IF, null, null, 2);
        this.r = true;
    }

    public final boolean f(Object obj) {
        if (kotlin.jvm.internal.l.a(I(), obj)) {
            return false;
        }
        m0(obj);
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f0() {
        this.m = 0;
        this.G = this.c.d();
        X(100, null, null, 0);
        w wVar = this.b;
        wVar.t();
        androidx.compose.runtime.internal.j jVarI = wVar.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(jVarI);
        this.K = null;
        if (!this.q) {
            this.q = wVar.e();
        }
        if (!this.C) {
            this.C = wVar.f();
        }
        if (this.C) {
            x2 x2Var = androidx.compose.runtime.tooling.e.a;
            x2Var.getClass();
            jVarI = jVarI.b(x2Var, new y2(D()));
        }
        this.u = jVarI;
        Set set = (Set) t.s(jVarI, androidx.compose.runtime.tooling.g.a);
        if (set != null) {
            set.add(z());
            wVar.o(set);
        }
        X(Long.hashCode(wVar.g()), null, null, 0);
    }

    public final boolean g(boolean z) {
        Object objI = I();
        if ((objI instanceof Boolean) && z == ((Boolean) objI).booleanValue()) {
            return false;
        }
        m0(Boolean.valueOf(z));
        return true;
    }

    public final boolean g0(s1 s1Var, Object obj) {
        a aVar = s1Var.c;
        if (aVar == null) {
            return false;
        }
        int iB = this.G.a.b(aVar);
        if (!this.F || iB < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iL = t.l(iB, arrayList);
        if (iL < 0) {
            int i = -(iL + 1);
            if (!(obj instanceof g0)) {
                obj = null;
            }
            arrayList.add(i, new r0(s1Var, iB, obj));
            return true;
        }
        r0 r0Var = (r0) arrayList.get(iL);
        if (!(obj instanceof g0)) {
            r0Var.c = null;
            return true;
        }
        Object obj2 = r0Var.c;
        if (obj2 == null) {
            r0Var.c = obj;
            return true;
        }
        if (obj2 instanceof androidx.collection.p0) {
            ((androidx.collection.p0) obj2).a(obj);
            return true;
        }
        androidx.collection.p0 p0Var = androidx.collection.x0.a;
        androidx.collection.p0 p0Var2 = new androidx.collection.p0(2);
        p0Var2.k(obj2);
        p0Var2.k(obj);
        r0Var.c = p0Var2;
        return true;
    }

    public final boolean h(Object obj) {
        if (I() == obj) {
            return false;
        }
        m0(obj);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0086 A[LOOP:1: B:17:0x003a->B:32:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[EDGE_INSN: B:40:0x0089->B:33:0x0089 BREAK  A[LOOP:1: B:17:0x003a->B:32:0x0086], SYNTHETIC] */
    public final void h0(androidx.collection.o0 o0Var) {
        ArrayList arrayList = this.s;
        for (int iH = kotlin.collections.q.h(arrayList); -1 < iH; iH--) {
            r0 r0Var = (r0) arrayList.get(iH);
            a aVar = r0Var.a.c;
            if (aVar == null || !aVar.a()) {
                arrayList.remove(iH);
            } else {
                int i = r0Var.b;
                int i2 = aVar.a;
                if (i != i2) {
                    r0Var.b = i2;
                }
            }
        }
        Object[] objArr = o0Var.b;
        Object[] objArr2 = o0Var.c;
        long[] jArr = o0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            s1 s1Var = (s1) obj;
                            a aVar2 = s1Var.c;
                            if (aVar2 != null) {
                                int i7 = aVar2.a;
                                if (obj2 == f.C) {
                                    obj2 = null;
                                }
                                arrayList.add(new r0(s1Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        kotlin.collections.t.s(t.a, arrayList);
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        androidx.compose.runtime.changelist.b bVar = this.M;
        bVar.c = false;
        bVar.d.b = 0;
        bVar.f = 0;
        bVar.e = true;
        bVar.g = 0;
        bVar.h.clear();
        bVar.i = -1;
        bVar.j = -1;
        bVar.k = -1;
        bVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0(int i, int i2) {
        if (n0(i) != i2) {
            if (i < 0) {
                androidx.collection.x xVar = this.p;
                if (xVar == null) {
                    xVar = new androidx.collection.x();
                    this.p = xVar;
                }
                xVar.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final Object j(r1 r1Var) {
        return t.s(l(), r1Var);
    }

    public final void j0(int i, int i2) {
        int iN0 = n0(i);
        if (iN0 != i2) {
            int i3 = i2 - iN0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iN1 = n0(i) + i3;
                i0(i, iN1);
                for (int i4 = size; -1 < i4; i4--) {
                    o1 o1Var = (o1) arrayList.get(i4);
                    if (o1Var != null && o1Var.a(i, iN1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                g2 g2Var = this.G;
                if (i < 0) {
                    i = g2Var.i;
                } else if (g2Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final void k(kotlin.jvm.functions.a aVar) {
        if (!this.r) {
            u.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            u.a("createNode() can only be called when inserting");
        }
        q0 q0Var = this.n;
        int i = q0Var.a[q0Var.b - 1];
        k2 k2Var = this.I;
        a aVarB = k2Var.b(k2Var.v);
        this.l++;
        androidx.compose.runtime.changelist.c cVar = this.O;
        androidx.compose.runtime.changelist.l0 l0Var = cVar.l;
        l0Var.W(androidx.compose.runtime.changelist.r.d);
        okhttp3.internal.platform.android.g.w(l0Var, 0, aVar);
        l0Var.n[l0Var.o - l0Var.l[l0Var.m - 1].a] = i;
        okhttp3.internal.platform.android.g.w(l0Var, 1, aVarB);
        androidx.compose.runtime.changelist.l0 l0Var2 = cVar.m;
        l0Var2.W(androidx.compose.runtime.changelist.r.e);
        l0Var2.n[l0Var2.o - l0Var2.l[l0Var2.m - 1].a] = i;
        okhttp3.internal.platform.android.g.w(l0Var2, 0, aVarB);
    }

    public final androidx.compose.runtime.internal.j k0(androidx.compose.runtime.internal.j jVar, androidx.compose.runtime.internal.j jVar2) {
        jVar.getClass();
        androidx.compose.runtime.internal.i iVar = new androidx.compose.runtime.internal.i(jVar);
        iVar.putAll(jVar2);
        androidx.compose.runtime.internal.j jVarA = iVar.a();
        Z(204, u.d);
        I();
        m0(jVarA);
        I();
        m0(jVar2);
        p(false);
        return jVarA;
    }

    public final androidx.compose.runtime.internal.j l() {
        androidx.compose.runtime.internal.j jVar;
        androidx.compose.runtime.internal.j jVar2 = this.K;
        if (jVar2 != null) {
            return jVar2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        d1 d1Var = u.c;
        if (z && this.J) {
            int iE = this.I.v;
            while (iE > 0) {
                if (this.I.s(iE) == 202 && kotlin.jvm.internal.l.a(this.I.t(iE), d1Var)) {
                    Object objQ = this.I.q(iE);
                    objQ.getClass();
                    androidx.compose.runtime.internal.j jVar3 = (androidx.compose.runtime.internal.j) objQ;
                    this.K = jVar3;
                    return jVar3;
                }
                k2 k2Var = this.I;
                iE = k2Var.E(iE, k2Var.b);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    g2 g2Var = this.G;
                    if (kotlin.jvm.internal.l.a(g2Var.p(iQ, g2Var.b), d1Var)) {
                        androidx.collection.z zVar = this.v;
                        if (zVar == null || (jVar = (androidx.compose.runtime.internal.j) zVar.b(iQ)) == null) {
                            g2 g2Var2 = this.G;
                            Object objB = g2Var2.b(iQ, g2Var2.b);
                            objB.getClass();
                            jVar = (androidx.compose.runtime.internal.j) objB;
                        }
                        this.K = jVar;
                        return jVar;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        androidx.compose.runtime.internal.j jVar4 = this.u;
        this.K = jVar4;
        return jVar4;
    }

    public final void l0(Object obj) {
        if (obj instanceof b2) {
            c2 c2Var = new c2((b2) obj, this.m - 1);
            if (this.S) {
                androidx.compose.runtime.changelist.l0 l0Var = this.M.b.l;
                l0Var.W(androidx.compose.runtime.changelist.w.c);
                okhttp3.internal.platform.android.g.w(l0Var, 0, c2Var);
            }
            this.d.add(obj);
            obj = c2Var;
        }
        m0(obj);
    }

    public final androidx.compose.runtime.tooling.a m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        kotlin.collections.builders.b bVarG = kotlin.collections.q.g();
        k2 k2Var = this.I;
        bVarG.addAll(androidx.work.impl.v.g(k2Var, null, k2Var.t, null));
        g2 g2Var = this.G;
        boolean z = g2Var.f;
        int[] iArr = g2Var.b;
        if (z || g2Var.c == 0) {
            collection = kotlin.collections.w.e;
        } else {
            androidx.compose.runtime.tooling.j jVar = new androidx.compose.runtime.tooling.j(g2Var);
            int iQ = g2Var.i;
            Object objValueOf = Integer.valueOf(g2Var.l - j2.b(iQ, iArr));
            while (iQ >= 0) {
                jVar.r(g2Var.i(iQ), g2Var.k(iQ) ? g2Var.p(iQ, iArr) : n.a, g2Var.a.h(iQ), objValueOf);
                objValueOf = g2Var.a(iQ);
                iQ = g2Var.q(iQ);
            }
            collection = (ArrayList) jVar.e;
        }
        bVarG.addAll(collection);
        bVarG.addAll(J());
        return new androidx.compose.runtime.tooling.a(kotlin.collections.q.c(bVarG));
    }

    public final void m0(Object obj) {
        if (this.S) {
            k2 k2Var = this.I;
            if (k2Var.n <= 0 || k2Var.i == k2Var.k) {
                k2Var.F(obj);
                return;
            }
            androidx.collection.z zVar = k2Var.s;
            if (zVar == null) {
                zVar = new androidx.collection.z();
            }
            k2Var.s = zVar;
            int i = k2Var.v;
            Object objB = zVar.b(i);
            if (objB == null) {
                objB = new androidx.collection.j0();
                zVar.h(i, objB);
            }
            ((androidx.collection.j0) objB).a(obj);
            return;
        }
        g2 g2Var = this.G;
        boolean z = g2Var.n;
        androidx.compose.runtime.changelist.b bVar = this.M;
        if (!z) {
            a aVarA = g2Var.a(g2Var.i);
            androidx.compose.runtime.changelist.l0 l0Var = bVar.b.l;
            l0Var.W(androidx.compose.runtime.changelist.e.c);
            okhttp3.internal.platform.android.g.x(l0Var, 0, aVarA, 1, obj);
            return;
        }
        int iB = (g2Var.l - j2.b(g2Var.i, g2Var.b)) - 1;
        if (bVar.a.G.i - bVar.f >= 0) {
            bVar.d(true);
            androidx.compose.runtime.changelist.l0 l0Var2 = bVar.b.l;
            l0Var2.W(androidx.compose.runtime.changelist.r.g);
            okhttp3.internal.platform.android.g.w(l0Var2, 0, obj);
            l0Var2.n[l0Var2.o - l0Var2.l[l0Var2.m - 1].a] = iB;
            return;
        }
        g2 g2Var2 = this.G;
        a aVarA2 = g2Var2.a(g2Var2.i);
        androidx.compose.runtime.changelist.l0 l0Var3 = bVar.b.l;
        l0Var3.W(androidx.compose.runtime.changelist.r.f);
        okhttp3.internal.platform.android.g.x(l0Var3, 0, obj, 1, aVarA2);
        l0Var3.n[l0Var3.o - l0Var3.l[l0Var3.m - 1].a] = iB;
    }

    public final void n(androidx.collection.o0 o0Var, kotlin.jvm.functions.p pVar) {
        ArrayList arrayList = this.s;
        if (this.F) {
            u.a("Reentrant composition is not supported");
        }
        this.g.k();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(androidx.compose.runtime.snapshots.n.j().g());
            this.v = null;
            h0(o0Var);
            this.k = 0;
            this.F = true;
            try {
                f0();
                Object objI = I();
                if (objI != pVar && pVar != null) {
                    m0(pVar);
                }
                r rVar = this.D;
                androidx.compose.runtime.collection.b bVarI = t.i();
                try {
                    bVarI.b(rVar);
                    d1 d1Var = u.a;
                    if (pVar != null) {
                        Z(Context.VERSION_ES6, d1Var);
                        kotlin.jvm.internal.c0.c(2, pVar);
                        pVar.invoke(this, 1);
                        p(false);
                    } else if (!this.w || objI == null || objI.equals(n.a)) {
                        U();
                    } else {
                        Z(Context.VERSION_ES6, d1Var);
                        kotlin.jvm.internal.c0.c(2, objI);
                        kotlin.jvm.functions.p pVar2 = (kotlin.jvm.functions.p) objI;
                        kotlin.jvm.internal.c0.c(2, pVar2);
                        pVar2.invoke(this, 1);
                        p(false);
                    }
                    bVarI.k(bVarI.z - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        u.a("Check failed");
                    }
                    y();
                    Trace.endSection();
                } catch (Throwable th) {
                    bVarI.k(bVarI.z - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    coil3.network.g.G(th2, new o(1, this));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        u.a("Check failed");
                    }
                    y();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final int n0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        androidx.collection.x xVar = this.p;
        if (xVar == null || xVar.c(i) < 0) {
            return 0;
        }
        int iC = xVar.c(i);
        if (iC >= 0) {
            return xVar.c[iC];
        }
        androidx.transition.k.m(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Cannot find value for key "));
        return 0;
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            androidx.compose.runtime.changelist.b bVar = this.M;
            bVar.c();
            bVar.h.add(objN);
        }
    }

    public final void o0() {
        if (!this.r) {
            u.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            u.a("useNode() called while inserting");
        }
        g2 g2Var = this.G;
        Object objN = g2Var.n(g2Var.i);
        androidx.compose.runtime.changelist.b bVar = this.M;
        bVar.c();
        bVar.h.add(objN);
        if (this.y && (objN instanceof i)) {
            bVar.b();
            bVar.b.l.W(androidx.compose.runtime.changelist.i0.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:201:0x0516  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void p(boolean z) {
        long jRotateRight;
        q0 q0Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        q0 q0Var2;
        int i7;
        LinkedHashSet linkedHashSet;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        q0 q0Var3 = this.n;
        int i15 = q0Var3.a[q0Var3.b - 2] - 1;
        boolean z2 = this.S;
        f fVar = n.a;
        if (z2) {
            k2 k2Var = this.I;
            int i16 = k2Var.v;
            int iS = k2Var.s(i16);
            Object objT = this.I.t(i16);
            Object objQ = this.I.q(i16);
            if (objT != null) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objT instanceof Enum ? ((Enum) objT).ordinal() : objT.hashCode()));
            } else if (objQ == null || iS != 207 || objQ.equals(fVar)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) iS);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objQ.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            g2 g2Var = this.G;
            int i17 = g2Var.i;
            int i18 = g2Var.i(i17);
            g2 g2Var2 = this.G;
            Object objP = g2Var2.p(i17, g2Var2.b);
            g2 g2Var3 = this.G;
            Object objB = g2Var3.b(i17, g2Var3.b);
            if (objP != null) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode()));
            } else if (objB == null || i18 != 207 || objB.equals(fVar)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) i18);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = this.l;
        o1 o1Var = this.j;
        ArrayList arrayList4 = this.s;
        androidx.compose.runtime.changelist.b bVar = this.M;
        if (o1Var != null) {
            androidx.collection.z zVar = o1Var.e;
            int i20 = o1Var.b;
            ArrayList arrayList5 = o1Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = o1Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList6.get(i21));
                }
                i = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    u0 u0Var = (u0) arrayList5.get(i22);
                    if (hashSet2.contains(u0Var)) {
                        q0Var2 = q0Var3;
                        i7 = i22;
                        if (!linkedHashSet2.contains(u0Var)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                u0 u0Var2 = (u0) arrayList6.get(i25);
                                if (u0Var2 != u0Var) {
                                    n0 n0Var = (n0) zVar.b(u0Var2.c);
                                    int i26 = n0Var != null ? n0Var.b : -1;
                                    linkedHashSet2.add(u0Var2);
                                    i10 = i24;
                                    if (i26 != i10) {
                                        n0 n0Var2 = (n0) zVar.b(u0Var2.c);
                                        int i27 = n0Var2 != null ? n0Var2.c : u0Var2.d;
                                        linkedHashSet = linkedHashSet2;
                                        int i28 = i26 + i20;
                                        i8 = size2;
                                        int i29 = i10 + i20;
                                        if (i27 > 0) {
                                            i9 = i20;
                                            int i30 = bVar.l;
                                            if (i30 > 0) {
                                                arrayList2 = arrayList5;
                                                if (bVar.j == i28 - i30 && bVar.k == i29 - i30) {
                                                    bVar.l = i30 + i27;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            bVar.c();
                                            bVar.j = i28;
                                            bVar.k = i29;
                                            bVar.l = i27;
                                        } else {
                                            i9 = i20;
                                            arrayList2 = arrayList5;
                                            bVar.getClass();
                                        }
                                        if (i26 <= i10) {
                                            int i31 = i27;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i26) {
                                                Object[] objArr5 = zVar.c;
                                                long[] jArr5 = zVar.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i32 = 0;
                                                    while (true) {
                                                        long j = jArr5[i32];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i33 = 8 - ((~(i32 - length)) >>> 31);
                                                            int i34 = 0;
                                                            while (i34 < i33) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    n0 n0Var3 = (n0) objArr5[(i32 << 3) + i34];
                                                                    jArr2 = jArr5;
                                                                    int i35 = n0Var3.b;
                                                                    i13 = i26;
                                                                    if (i26 <= i35 && i35 < i13 + i31) {
                                                                        n0Var3.b = (i35 - i13) + i10;
                                                                    } else if (i13 + 1 <= i35 && i35 < i10) {
                                                                        n0Var3.b = i35 - i31;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i26;
                                                                }
                                                                j >>= 8;
                                                                i34++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i26 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                            if (i33 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                        }
                                                        if (i32 == length) {
                                                            break;
                                                        }
                                                        i32++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i26 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = zVar.c;
                                            long[] jArr6 = zVar.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i36 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i36];
                                                    int i37 = i27;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i36 - length2)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i39;
                                                                n0 n0Var4 = (n0) objArr6[(i36 << 3) + i39];
                                                                objArr4 = objArr6;
                                                                int i40 = n0Var4.b;
                                                                jArr4 = jArr6;
                                                                if (i26 <= i40 && i40 < i26 + i37) {
                                                                    n0Var4.b = (i40 - i26) + i10;
                                                                } else if (i10 <= i40 && i40 < i26) {
                                                                    n0Var4.b = i40 + i37;
                                                                }
                                                            } else {
                                                                i14 = i39;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i39 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i36 == length2) {
                                                        break;
                                                    }
                                                    i36++;
                                                    arrayList4 = arrayList4;
                                                    i27 = i37;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        linkedHashSet = linkedHashSet2;
                                        i8 = size2;
                                        i9 = i20;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    linkedHashSet = linkedHashSet2;
                                    i8 = size2;
                                    i9 = i20;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i24;
                                    i11 = i7 + 1;
                                }
                                i23 = i25 + 1;
                                n0 n0Var5 = (n0) zVar.b(u0Var2.c);
                                int i41 = i10 + (n0Var5 != null ? n0Var5.c : u0Var2.d);
                                i22 = i11;
                                o1Var = o1Var;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i8;
                                i20 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i24 = i41;
                                q0Var3 = q0Var2;
                            } else {
                                i23 = i25;
                                q0Var3 = q0Var2;
                                i22 = i7;
                            }
                        }
                    } else {
                        q0Var2 = q0Var3;
                        n0 n0Var6 = (n0) zVar.b(u0Var.c);
                        int i42 = n0Var6 != null ? n0Var6.b : -1;
                        int i43 = u0Var.c;
                        i7 = i22;
                        bVar.e(i42 + i20, u0Var.d);
                        o1Var.a(i43, 0);
                        bVar.f = (i43 - bVar.a.G.g) + bVar.f;
                        this.G.r(i43);
                        N();
                        this.G.s();
                        t.c(i43, arrayList4, this.G.b[(i43 * 5) + 3] + i43);
                    }
                    i22 = i7 + 1;
                    q0Var3 = q0Var2;
                }
                q0Var = q0Var3;
                arrayList = arrayList4;
                bVar.c();
                if (arrayList5.size() > 0) {
                    g2 g2Var4 = this.G;
                    bVar.f = (g2Var4.h - bVar.a.G.g) + bVar.f;
                    g2Var4.t();
                }
            } else {
                q0Var = q0Var3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            q0Var = q0Var3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            g2 g2Var5 = this.G;
            int i44 = g2Var5.m - g2Var5.l;
            if (i44 > 0) {
                if (i44 > 0) {
                    bVar.d(false);
                    q0 q0Var4 = bVar.d;
                    g2 g2Var6 = bVar.a.G;
                    if (g2Var6.c > 0 && q0Var4.a(-2) != (i6 = g2Var6.i)) {
                        if (!bVar.c && bVar.e) {
                            bVar.d(false);
                            bVar.b.l.W(androidx.compose.runtime.changelist.q.c);
                            bVar.c = true;
                        }
                        if (i6 > 0) {
                            a aVarA = g2Var6.a(i6);
                            q0Var4.c(i6);
                            bVar.d(false);
                            androidx.compose.runtime.changelist.l0 l0Var = bVar.b.l;
                            l0Var.W(androidx.compose.runtime.changelist.p.c);
                            okhttp3.internal.platform.android.g.w(l0Var, 0, aVarA);
                            bVar.c = true;
                        }
                    }
                    androidx.compose.runtime.changelist.l0 l0Var2 = bVar.b.l;
                    l0Var2.W(androidx.compose.runtime.changelist.e0.c);
                    l0Var2.n[l0Var2.o - l0Var2.l[l0Var2.m - 1].a] = i44;
                } else {
                    bVar.getClass();
                }
            }
        }
        int i45 = this.k;
        while (true) {
            g2 g2Var7 = this.G;
            if (g2Var7.k > 0 || (i5 = g2Var7.g) == g2Var7.h) {
                break;
            }
            N();
            bVar.e(i45, this.G.s());
            t.c(i5, arrayList, this.G.g);
        }
        if (z3) {
            if (z) {
                androidx.compose.runtime.changelist.c cVar = this.O;
                androidx.compose.runtime.changelist.l0 l0Var3 = cVar.m;
                if (!l0Var3.V()) {
                    u.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                androidx.compose.runtime.changelist.l0 l0Var4 = cVar.l;
                androidx.compose.runtime.changelist.j0[] j0VarArr = l0Var3.l;
                int i46 = l0Var3.m - 1;
                l0Var3.m = i46;
                androidx.compose.runtime.changelist.j0 j0Var = j0VarArr[i46];
                j0VarArr[i46] = null;
                l0Var4.W(j0Var);
                Object[] objArr7 = l0Var3.p;
                Object[] objArr8 = l0Var4.p;
                int i47 = l0Var4.q;
                int i48 = j0Var.b;
                int i49 = l0Var3.q;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = l0Var3.p;
                int i51 = l0Var3.q;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = l0Var3.n;
                int[] iArr2 = l0Var4.n;
                int i52 = l0Var4.o;
                int i53 = j0Var.a;
                int i54 = l0Var3.o;
                kotlin.collections.o.e(i52 - i53, i54 - i53, i54, iArr, iArr2);
                l0Var3.q -= i48;
                l0Var3.o -= i53;
                i19 = 1;
            }
            g2 g2Var8 = this.G;
            if (g2Var8.k <= 0) {
                p1.a("Unbalanced begin/end empty");
            }
            g2Var8.k--;
            k2 k2Var2 = this.I;
            int i55 = k2Var2.v;
            k2Var2.j();
            if (this.G.k <= 0) {
                int i56 = (-2) - i55;
                this.I.k();
                this.I.e(true);
                a aVar = this.N;
                boolean zU = this.O.l.U();
                h2 h2Var = this.H;
                if (zU) {
                    bVar.b();
                    bVar.d(false);
                    q0 q0Var5 = bVar.d;
                    g2 g2Var9 = bVar.a.G;
                    if (g2Var9.c <= 0 || q0Var5.a(-2) == (i4 = g2Var9.i)) {
                        i3 = 1;
                    } else {
                        if (!bVar.c && bVar.e) {
                            bVar.d(false);
                            bVar.b.l.W(androidx.compose.runtime.changelist.q.c);
                            bVar.c = true;
                        }
                        if (i4 > 0) {
                            a aVarA2 = g2Var9.a(i4);
                            q0Var5.c(i4);
                            bVar.d(false);
                            androidx.compose.runtime.changelist.l0 l0Var5 = bVar.b.l;
                            l0Var5.W(androidx.compose.runtime.changelist.p.c);
                            okhttp3.internal.platform.android.g.w(l0Var5, 0, aVarA2);
                            i3 = 1;
                            bVar.c = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    bVar.c();
                    androidx.compose.runtime.changelist.l0 l0Var6 = bVar.b.l;
                    l0Var6.W(androidx.compose.runtime.changelist.s.c);
                    okhttp3.internal.platform.android.g.x(l0Var6, 0, aVar, i3, h2Var);
                    r3 = 0;
                } else {
                    androidx.compose.runtime.changelist.c cVar2 = this.O;
                    bVar.b();
                    bVar.d(false);
                    q0 q0Var6 = bVar.d;
                    g2 g2Var10 = bVar.a.G;
                    if (g2Var10.c > 0 && q0Var6.a(-2) != (i2 = g2Var10.i)) {
                        if (!bVar.c && bVar.e) {
                            bVar.d(false);
                            bVar.b.l.W(androidx.compose.runtime.changelist.q.c);
                            bVar.c = true;
                        }
                        if (i2 > 0) {
                            a aVarA3 = g2Var10.a(i2);
                            q0Var6.c(i2);
                            bVar.d(false);
                            androidx.compose.runtime.changelist.l0 l0Var7 = bVar.b.l;
                            l0Var7.W(androidx.compose.runtime.changelist.p.c);
                            okhttp3.internal.platform.android.g.w(l0Var7, 0, aVarA3);
                            bVar.c = true;
                        }
                    }
                    bVar.c();
                    androidx.compose.runtime.changelist.l0 l0Var8 = bVar.b.l;
                    l0Var8.W(androidx.compose.runtime.changelist.t.c);
                    int i57 = l0Var8.q - l0Var8.l[l0Var8.m - 1].b;
                    Object[] objArr10 = l0Var8.p;
                    objArr10[i57] = aVar;
                    objArr10[i57 + 1] = h2Var;
                    objArr10[i57 + 2] = cVar2;
                    this.O = new androidx.compose.runtime.changelist.c();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.y != 0) {
                    i0(i56, r3);
                    j0(i56, i19);
                }
            }
        } else {
            if (z) {
                bVar.a();
            }
            int i58 = bVar.a.G.i;
            q0 q0Var7 = bVar.d;
            int i59 = i;
            if (q0Var7.a(i59) > i58) {
                u.a("Missed recording an endGroup");
            }
            if (q0Var7.a(i59) == i58) {
                bVar.d(false);
                q0Var7.b();
                bVar.b.l.W(androidx.compose.runtime.changelist.m.c);
            }
            int i60 = this.G.i;
            if (i19 != n0(i60)) {
                j0(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.G.e();
            bVar.c();
        }
        ArrayList arrayList7 = this.i;
        o1 o1Var2 = (o1) arrayList7.remove(arrayList7.size() - 1);
        if (o1Var2 != null && !z3) {
            o1Var2.c++;
        }
        this.j = o1Var2;
        this.k = q0Var.b() + i19;
        this.m = q0Var.b();
        this.l = q0Var.b() + i19;
    }

    public final void q() {
        p(false);
        s1 s1VarB = B();
        if (s1VarB != null) {
            int i = s1VarB.b;
            if ((i & 1) != 0) {
                s1VarB.b = i | 2;
            }
        }
    }

    public final void r() {
        p(true);
    }

    public final void s() {
        p(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[LOOP:0: B:15:0x003e->B:27:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[EDGE_INSN: B:28:0x0083->B:29:0x0084 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0083 A[SYNTHETIC] */
    public final s1 t() {
        s1 s1Var;
        a aVarA;
        androidx.compose.foundation.x1 x1Var;
        ArrayList arrayList = this.E;
        s1 s1Var2 = !arrayList.isEmpty() ? (s1) arrayList.remove(arrayList.size() - 1) : null;
        if (s1Var2 != null) {
            s1Var2.b &= -9;
            this.g.k();
            int i = this.B;
            androidx.collection.f0 f0Var = s1Var2.f;
            if (f0Var == null || (s1Var2.b & 16) != 0) {
                x1Var = null;
                break;
            }
            Object[] objArr = f0Var.b;
            int[] iArr = f0Var.c;
            long[] jArr = f0Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                x1Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                x1Var = new androidx.compose.foundation.x1(s1Var2, i, f0Var, 2);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    x1Var = null;
                    break;
                }
                if (i2 == length) {
                    x1Var = null;
                    break;
                }
                i2++;
            }
            androidx.compose.runtime.changelist.b bVar = this.M;
            if (x1Var != null) {
                androidx.compose.runtime.changelist.l0 l0Var = bVar.b.l;
                l0Var.W(androidx.compose.runtime.changelist.l.c);
                okhttp3.internal.platform.android.g.x(l0Var, 0, x1Var, 1, this.h);
            }
            int i6 = s1Var2.b;
            if ((i6 & 512) != 0) {
                s1Var2.b = i6 & (-513);
                androidx.compose.runtime.changelist.l0 l0Var2 = bVar.b.l;
                l0Var2.W(androidx.compose.runtime.changelist.o.c);
                okhttp3.internal.platform.android.g.w(l0Var2, 0, s1Var2);
                int i7 = s1Var2.b;
                s1Var2.b = i7 & (-129);
                if ((i7 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    s1Var2.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (s1Var2 != null) {
            int i8 = s1Var2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (s1Var2.c == null) {
                    if (this.S) {
                        k2 k2Var = this.I;
                        aVarA = k2Var.b(k2Var.v);
                    } else {
                        g2 g2Var = this.G;
                        aVarA = g2Var.a(g2Var.i);
                    }
                    s1Var2.c = aVarA;
                }
                s1Var2.b &= -5;
                s1Var = s1Var2;
            } else {
                s1Var = null;
            }
        } else {
            s1Var = null;
        }
        p(false);
        return s1Var;
    }

    public final void u() {
        if (this.F || this.z != 0) {
            p1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void v() {
        p(false);
        this.b.c();
        p(false);
        androidx.compose.runtime.changelist.b bVar = this.M;
        if (bVar.c) {
            bVar.d(false);
            bVar.d(false);
            bVar.b.l.W(androidx.compose.runtime.changelist.m.c);
            bVar.c = false;
        }
        bVar.b();
        if (bVar.d.b != 0) {
            u.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            u.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void w(int i) {
        if (i < 0) {
            int i2 = -i;
            k2 k2Var = this.I;
            while (true) {
                int i3 = k2Var.v;
                if (i3 <= i2) {
                    return;
                } else {
                    p(k2Var.y(i3));
                }
            }
        } else {
            if (this.S) {
                k2 k2Var2 = this.I;
                while (this.S) {
                    p(k2Var2.y(k2Var2.v));
                }
            }
            g2 g2Var = this.G;
            while (true) {
                int i4 = g2Var.i;
                if (i4 <= i) {
                    return;
                } else {
                    p(g2Var.l(i4));
                }
            }
        }
    }

    public final void x(boolean z, o1 o1Var) {
        this.i.add(this.j);
        this.j = o1Var;
        int i = this.l;
        q0 q0Var = this.n;
        q0Var.c(i);
        q0Var.c(this.m);
        q0Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void y() {
        h2 h2Var = new h2();
        if (this.C) {
            h2Var.c();
        }
        if (this.b.d()) {
            h2Var.H = new androidx.collection.z();
        }
        this.H = h2Var;
        k2 k2VarE = h2Var.e();
        k2VarE.e(true);
        this.I = k2VarE;
    }

    public final androidx.compose.runtime.tooling.c z() {
        y yVar = this.U;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this.h);
        this.U = yVar2;
        return yVar2;
    }
}
