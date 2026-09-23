package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final androidx.compose.foundation.lazy.layout.a a = new androidx.compose.foundation.lazy.layout.a(2);
    public static final Object b = new Object();

    public static final int A(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final androidx.compose.runtime.internal.j B(androidx.appcompat.widget.r[] rVarArr, androidx.compose.runtime.internal.j jVar, androidx.compose.runtime.internal.j jVar2) {
        androidx.compose.runtime.internal.i iVar = new androidx.compose.runtime.internal.i(androidx.compose.runtime.internal.j.A);
        for (androidx.appcompat.widget.r rVar : rVarArr) {
            r1 r1Var = (r1) rVar.d;
            if (rVar.c || !jVar.containsKey(r1Var)) {
                iVar.put(r1Var, r1Var.c(rVar, (z2) jVar2.get(r1Var)));
            }
        }
        return iVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
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
    public static final void a(androidx.appcompat.widget.r rVar, kotlin.jvm.functions.p pVar, s sVar, int i) {
        z2 z2Var;
        boolean z;
        s1 s1VarT;
        sVar.c0(-149765515);
        q0 q0Var = sVar.x;
        androidx.compose.runtime.internal.j jVarL = sVar.l();
        sVar.Z(201, u.b);
        Object objQ = sVar.Q();
        if (kotlin.jvm.internal.l.a(objQ, n.a)) {
            z2Var = null;
        } else {
            objQ.getClass();
            z2Var = (z2) objQ;
        }
        r1 r1Var = (r1) rVar.d;
        z2 z2VarC = r1Var.c(rVar, z2Var);
        boolean zEquals = z2VarC.equals(z2Var);
        if (!zEquals) {
            sVar.l0(z2VarC);
        }
        if (!sVar.S) {
            g2 g2Var = sVar.G;
            Object objB = g2Var.b(g2Var.g, g2Var.b);
            objB.getClass();
            androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) objB;
            if (!(sVar.F() && zEquals) && (rVar.c || !jVarL.containsKey(r1Var))) {
                jVarL = jVarL.b(r1Var, z2VarC);
            } else if ((zEquals && !sVar.w) || !sVar.w) {
                jVarL = jVar;
            }
            if (sVar.y || jVar != jVarL) {
                z = true;
            }
            if (z && !sVar.S) {
                sVar.O(jVarL);
            }
            q0Var.c(sVar.w ? 1 : 0);
            sVar.w = z;
            sVar.K = jVarL;
            sVar.X(202, u.c, jVarL, 0);
            pVar.invoke(sVar, Integer.valueOf((i >> 3) & 14));
            sVar.p(false);
            sVar.p(false);
            sVar.w = q0Var.b() != 0;
            sVar.K = null;
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new androidx.compose.animation.core.v1(rVar, pVar, i, 6);
            }
        }
        if (rVar.c || !jVarL.containsKey(r1Var)) {
            jVarL = jVarL.b(r1Var, z2VarC);
        }
        sVar.J = true;
        z = false;
        if (z) {
            sVar.O(jVarL);
        }
        q0Var.c(sVar.w ? 1 : 0);
        sVar.w = z;
        sVar.K = jVarL;
        sVar.X(202, u.c, jVarL, 0);
        pVar.invoke(sVar, Integer.valueOf((i >> 3) & 14));
        sVar.p(false);
        sVar.p(false);
        sVar.w = q0Var.b() != 0;
        sVar.K = null;
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.animation.core.v1(rVar, pVar, i, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
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
    public static final void b(androidx.appcompat.widget.r[] rVarArr, kotlin.jvm.functions.p pVar, s sVar, int i) {
        androidx.compose.runtime.internal.j jVarK0;
        boolean z;
        s1 s1VarT;
        sVar.c0(415205898);
        q0 q0Var = sVar.x;
        androidx.compose.runtime.internal.j jVarL = sVar.l();
        sVar.Z(201, u.b);
        if (sVar.S) {
            jVarK0 = sVar.k0(jVarL, B(rVarArr, jVarL, androidx.compose.runtime.internal.j.A));
            sVar.J = true;
        } else {
            g2 g2Var = sVar.G;
            Object objH = g2Var.h(g2Var.g, 0);
            objH.getClass();
            androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) objH;
            g2 g2Var2 = sVar.G;
            Object objH2 = g2Var2.h(g2Var2.g, 1);
            objH2.getClass();
            androidx.compose.runtime.internal.j jVar2 = (androidx.compose.runtime.internal.j) objH2;
            androidx.compose.runtime.internal.j jVarB = B(rVarArr, jVarL, jVar2);
            if (!sVar.F() || sVar.y || !jVar2.equals(jVarB)) {
                jVarK0 = sVar.k0(jVarL, jVarB);
                if (sVar.y || !kotlin.jvm.internal.l.a(jVarK0, jVar)) {
                    z = true;
                }
                if (z && !sVar.S) {
                    sVar.O(jVarK0);
                }
                q0Var.c(sVar.w ? 1 : 0);
                sVar.w = z;
                sVar.K = jVarK0;
                sVar.X(202, u.c, jVarK0, 0);
                pVar.invoke(sVar, Integer.valueOf((i >> 3) & 14));
                sVar.p(false);
                sVar.p(false);
                sVar.w = q0Var.b() != 0;
                sVar.K = null;
                s1VarT = sVar.t();
                if (s1VarT != null) {
                    s1VarT.d = new androidx.compose.animation.core.v1(rVarArr, pVar, i, 7);
                }
            }
            sVar.l = sVar.G.s() + sVar.l;
            jVarK0 = jVar;
        }
        z = false;
        if (z) {
            sVar.O(jVarK0);
        }
        q0Var.c(sVar.w ? 1 : 0);
        sVar.w = z;
        sVar.K = jVarK0;
        sVar.X(202, u.c, jVarK0, 0);
        pVar.invoke(sVar, Integer.valueOf((i >> 3) & 14));
        sVar.p(false);
        sVar.p(false);
        sVar.w = q0Var.b() != 0;
        sVar.K = null;
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.animation.core.v1(rVarArr, pVar, i, 7);
        }
    }

    public static final void c(int i, List list, int i2) {
        int iL = l(i, list);
        if (iL < 0) {
            iL = -(iL + 1);
        }
        while (iL < list.size() && ((r0) list.get(iL)).b < i2) {
        }
    }

    public static final void d(androidx.collection.y yVar, int i) {
        if (yVar.b == 0 || !(yVar.c(0) == i || yVar.c(yVar.b - 1) == i)) {
            int i2 = yVar.b;
            yVar.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = yVar.c(i3);
                if (i <= iC) {
                    break;
                }
                yVar.e(i2, iC);
                i2 = i3;
            }
            yVar.e(i2, i);
        }
    }

    public static void e(k2 k2Var, List list, z zVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = k2Var.c((a) list.get(i));
            int iN = k2Var.N(k2Var.r(iC), k2Var.b);
            Object obj = iN < k2Var.g(k2Var.r(iC + 1), k2Var.b) ? k2Var.c[k2Var.h(iN)] : n.a;
            s1 s1Var = obj instanceof s1 ? (s1) obj : null;
            if (s1Var != null) {
                s1Var.a = zVar;
            }
        }
    }

    public static final a1 f(Flow flow, Object obj, kotlin.coroutines.j jVar, s sVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            jVar = kotlin.coroutines.k.e;
        }
        boolean zH = sVar.h(jVar) | sVar.h(flow);
        Object objQ = sVar.Q();
        kotlin.coroutines.d dVar = null;
        Object obj2 = n.a;
        if (zH || objQ == obj2) {
            objQ = new androidx.compose.animation.b0(jVar, flow, dVar, 21);
            sVar.l0(objQ);
        }
        kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) objQ;
        Object objQ2 = sVar.Q();
        if (objQ2 == obj2) {
            objQ2 = r(obj);
            sVar.l0(objQ2);
        }
        a1 a1Var = (a1) objQ2;
        boolean zH2 = sVar.h(pVar);
        Object objQ3 = sVar.Q();
        if (zH2 || objQ3 == obj2) {
            objQ3 = new q2(pVar, a1Var, dVar, 1);
            sVar.l0(objQ3);
        }
        l0.d(flow, jVar, (kotlin.jvm.functions.p) objQ3, sVar);
        return a1Var;
    }

    public static final a1 g(StateFlow stateFlow, s sVar) {
        return f(stateFlow, stateFlow.getValue(), kotlin.coroutines.k.e, sVar, 0, 0);
    }

    public static final void h(g2 g2Var, ArrayList arrayList, int i) {
        boolean zL = g2Var.l(i);
        int[] iArr = g2Var.b;
        if (zL) {
            arrayList.add(g2Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            h(g2Var, arrayList, i3);
        }
    }

    public static final androidx.compose.runtime.collection.b i() {
        androidx.appcompat.widget.c2 c2Var = p2.b;
        androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) c2Var.u();
        if (bVar != null) {
            return bVar;
        }
        androidx.compose.runtime.collection.b bVar2 = new androidx.compose.runtime.collection.b(new r[0]);
        c2Var.X(bVar2);
        return bVar2;
    }

    public static final g0 j(f fVar, kotlin.jvm.functions.a aVar) {
        androidx.appcompat.widget.c2 c2Var = p2.a;
        return new g0(fVar, aVar);
    }

    public static final g0 k(kotlin.jvm.functions.a aVar) {
        androidx.appcompat.widget.c2 c2Var = p2.a;
        return new g0(null, aVar);
    }

    public static final int l(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iB = kotlin.jvm.internal.l.b(((r0) list.get(i3)).b, i);
            if (iB < 0) {
                i2 = i3 + 1;
            } else {
                if (iB <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int m(s sVar) {
        sVar.getClass();
        return Long.hashCode(sVar.T);
    }

    public static final long n(s sVar) {
        return sVar.T;
    }

    public static final e o(kotlin.coroutines.j jVar) {
        e eVar = (e) jVar.get(f.z);
        if (eVar != null) {
            return eVar;
        }
        kotlinx.coroutines.future.a.u("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final void p(s sVar, Integer num, kotlin.jvm.functions.p pVar) {
        if (sVar.S) {
            sVar.b(num, pVar);
        }
    }

    public static List q(k2 k2Var, int i, k2 k2Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iU = k2Var.u(i);
        int i2 = i + iU;
        int iF = k2Var.f(i);
        int iF2 = k2Var.f(i2);
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (k2Var.b[(k2Var.r(i) * 5) + 1] & 201326592) != 0;
        k2Var2.w(iU);
        k2Var2.x(i3, k2Var2.t);
        if (k2Var.g < i2) {
            k2Var.B(i2);
        }
        if (k2Var.k < iF2) {
            k2Var.C(iF2, i2);
        }
        int[] iArr = k2Var2.b;
        int i4 = k2Var2.t;
        int i5 = i4 * 5;
        kotlin.collections.o.e(i5, i * 5, i2 * 5, k2Var.b, iArr);
        Object[] objArr = k2Var2.c;
        int i6 = k2Var2.i;
        System.arraycopy(k2Var.c, iF, objArr, i6, i3);
        int i7 = k2Var2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iU;
        int iG = i6 - k2Var2.g(i4, iArr);
        int i10 = k2Var2.m;
        int i11 = k2Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = k2.i(k2Var2.g(i13, iArr) + iG, i12 < i13 ? 0 : k2Var2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        k2Var2.m = i12;
        int iA = j2.a(k2Var.d, i, k2Var.p());
        int iA2 = j2.a(k2Var.d, i2, k2Var.p());
        if (iA < iA2) {
            ArrayList arrayList = k2Var.d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i15 = iA; i15 < iA2; i15++) {
                a aVar = (a) arrayList.get(i15);
                aVar.a += i8;
                arrayList2.add(aVar);
            }
            k2Var2.d.addAll(j2.a(k2Var2.d, k2Var2.t, k2Var2.p()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            list = arrayList2;
        } else {
            list = kotlin.collections.w.e;
        }
        if (!list.isEmpty()) {
            HashMap map = k2Var.e;
            HashMap map2 = k2Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = k2Var2.v;
        k2Var2.O(i7);
        int iE = k2Var.E(i, k2Var.b);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iE >= 0;
            if (z7) {
                k2Var.P();
                k2Var.a(iE - k2Var.t);
                k2Var.P();
            }
            k2Var.a(i - k2Var.t);
            boolean zH = k2Var.H();
            if (z7) {
                k2Var.M();
                k2Var.j();
                k2Var.M();
                k2Var.j();
            }
            z4 = zH;
        } else {
            boolean zI = k2Var.I(i, iU);
            k2Var.J(iF, i3, i - 1);
            z4 = zI;
        }
        if (z4) {
            u.a("Unexpectedly removed anchors");
        }
        int i18 = k2Var2.o;
        int i19 = iArr3[i5 + 1];
        k2Var2.o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            k2Var2.t = i9;
            k2Var2.i = i6 + i3;
        }
        if (z6) {
            k2Var2.T(i7);
        }
        return list;
    }

    public static j1 r(Object obj) {
        return new j1(obj, f.D);
    }

    public static final Object s(androidx.compose.runtime.internal.j jVar, r1 r1Var) {
        r1Var.getClass();
        Object objB = jVar.get(r1Var);
        if (objB == null) {
            objB = r1Var.b();
        }
        return ((z2) objB).a(jVar);
    }

    public static final void t(s sVar, kotlin.jvm.functions.l lVar) {
        sVar.b(kotlin.y.a, new androidx.compose.foundation.lazy.grid.g(lVar, 1, (byte) 0));
    }

    public static final q u(s sVar) {
        s sVar2;
        sVar.Z(206, u.e);
        if (sVar.S) {
            k2.z(sVar.I);
        }
        Object objI = sVar.I();
        c2 f2Var = objI instanceof c2 ? (c2) objI : null;
        if (f2Var == null) {
            sVar2 = sVar;
            f2Var = new f2(new p(new q(sVar2, sVar.T, sVar.q, sVar.C, sVar.h.Q)), -1);
            sVar2.m0(f2Var);
        } else {
            sVar2 = sVar;
        }
        b2 b2Var = f2Var.a;
        b2Var.getClass();
        q qVar = ((p) b2Var).e;
        qVar.f.setValue(sVar2.l());
        sVar2.p(false);
        return qVar;
    }

    public static final a1 v(Object obj, s sVar) {
        Object objQ = sVar.Q();
        if (objQ == n.a) {
            objQ = r(obj);
            sVar.l0(objQ);
        }
        a1 a1Var = (a1) objQ;
        a1Var.setValue(obj);
        return a1Var;
    }

    public static final void w(k2 k2Var, int i, Object obj) {
        int iH = k2Var.h(i);
        Object[] objArr = k2Var.c;
        Object obj2 = objArr[iH];
        objArr[iH] = n.a;
        if (obj == obj2) {
            return;
        }
        u.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void x(s sVar, Object obj, kotlin.jvm.functions.p pVar) {
        if (sVar.S || !kotlin.jvm.internal.l.a(sVar.Q(), obj)) {
            sVar.l0(obj);
            sVar.b(obj, pVar);
        }
    }

    public static final Flow y(kotlin.jvm.functions.a aVar) {
        return FlowKt.flow(new t2(aVar, null));
    }

    public static final int z(androidx.collection.y yVar) {
        int iC;
        int i = yVar.b;
        int iC2 = yVar.c(0);
        while (yVar.b != 0 && yVar.c(0) == iC2) {
            int i2 = yVar.b;
            if (i2 == 0) {
                androidx.transition.k.m("IntList is empty.");
                return 0;
            }
            yVar.e(0, yVar.a[i2 - 1]);
            yVar.d(yVar.b - 1);
            int i3 = yVar.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iC3 = yVar.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iC4 = yVar.c(i7);
                if (i6 < i3 && (iC = yVar.c(i6)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    yVar.e(i5, iC);
                    yVar.e(i6, iC3);
                    i5 = i6;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    yVar.e(i5, iC4);
                    yVar.e(i7, iC3);
                    i5 = i7;
                }
            }
        }
        return iC2;
    }
}
