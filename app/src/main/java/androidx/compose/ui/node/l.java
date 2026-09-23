package androidx.compose.ui.node;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final j1 a = new j1(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.l] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final void A(j jVar, String str, kotlin.jvm.functions.l lVar) {
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) jVar;
        if (!qVar.e.K) {
            androidx.compose.ui.internal.a.b("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
        androidx.compose.ui.q qVar2 = qVar.e;
        androidx.compose.ui.q qVar3 = qVar2.C;
        if (qVar3 == null) {
            b(bVar, qVar2);
        } else {
            bVar.b(qVar3);
        }
        while (true) {
            int i = bVar.z;
            if (i == 0) {
                return;
            }
            androidx.compose.ui.q qVar4 = (androidx.compose.ui.q) bVar.k(i - 1);
            if ((qVar4.A & 262144) != 0) {
                androidx.compose.ui.q qVar5 = qVar4;
                while (true) {
                    if (qVar5 != null && qVar5.K) {
                        if ((qVar5.z & 262144) != 0) {
                            ?? E = qVar5;
                            ?? bVar2 = 0;
                            while (E != 0) {
                                if (E instanceof z1) {
                                    z1 z1Var = (z1) E;
                                    y1 y1Var = str.equals(z1Var.i()) ? (y1) lVar.invoke(z1Var) : y1.e;
                                    if (y1Var != y1.z) {
                                        if (y1Var == y1.y) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E.z & 262144) != 0 && (E instanceof k)) {
                                    androidx.compose.ui.q qVar6 = ((k) E).M;
                                    int i2 = 0;
                                    E = E;
                                    bVar2 = bVar2;
                                    while (qVar6 != null) {
                                        if ((qVar6.z & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bVar2 = bVar2;
                                                E = qVar6;
                                            } else {
                                                if (bVar2 == 0) {
                                                    bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar2.b(E);
                                                    E = 0;
                                                }
                                                bVar2.b(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.C;
                                        E = E;
                                        bVar2 = bVar2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = e(bVar2);
                            }
                        }
                        qVar5 = qVar5.C;
                    }
                }
            }
            b(bVar, qVar4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.ui.node.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.l] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void B(z1 z1Var, kotlin.jvm.functions.l lVar) {
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) z1Var;
        if (!qVar.e.K) {
            androidx.compose.ui.internal.a.b("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
        androidx.compose.ui.q qVar2 = qVar.e;
        androidx.compose.ui.q qVar3 = qVar2.C;
        if (qVar3 == null) {
            b(bVar, qVar2);
        } else {
            bVar.b(qVar3);
        }
        while (true) {
            int i = bVar.z;
            if (i == 0) {
                return;
            }
            androidx.compose.ui.q qVar4 = (androidx.compose.ui.q) bVar.k(i - 1);
            if ((qVar4.A & 262144) != 0) {
                androidx.compose.ui.q qVar5 = qVar4;
                while (true) {
                    if (qVar5 != null && qVar5.K) {
                        if ((qVar5.z & 262144) != 0) {
                            ?? E = qVar5;
                            ?? bVar2 = 0;
                            while (E != 0) {
                                if (E instanceof z1) {
                                    z1 z1Var2 = (z1) E;
                                    y1 y1Var = (kotlin.jvm.internal.l.a(z1Var.i(), z1Var2.i()) && z1Var.getClass() == z1Var2.getClass()) ? (y1) lVar.invoke(z1Var2) : y1.e;
                                    if (y1Var != y1.z) {
                                        if (y1Var == y1.y) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E.z & 262144) != 0 && (E instanceof k)) {
                                    androidx.compose.ui.q qVar6 = ((k) E).M;
                                    int i2 = 0;
                                    E = E;
                                    bVar2 = bVar2;
                                    while (qVar6 != null) {
                                        if ((qVar6.z & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bVar2 = bVar2;
                                                E = qVar6;
                                            } else {
                                                if (bVar2 == 0) {
                                                    bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar2.b(E);
                                                    E = 0;
                                                }
                                                bVar2.b(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.C;
                                        E = E;
                                        bVar2 = bVar2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = e(bVar2);
                            }
                        }
                        qVar5 = qVar5.C;
                    }
                }
            }
            b(bVar, qVar4);
        }
    }

    public static final long a(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final void b(androidx.compose.runtime.collection.b bVar, androidx.compose.ui.q qVar) {
        androidx.compose.runtime.collection.b bVarZ = v(qVar).z();
        int i = bVarZ.z - 1;
        Object[] objArr = bVarZ.e;
        if (i < objArr.length) {
            while (i >= 0) {
                bVar.b((androidx.compose.ui.q) ((f0) objArr[i]).d0.g);
                i--;
            }
        }
    }

    public static final int c(n0 n0Var, androidx.compose.ui.layout.a aVar) {
        n0 n0VarX0 = n0Var.x0();
        if (n0VarX0 == null) {
            androidx.compose.ui.internal.a.b("Child of " + n0Var + " cannot be null when calculating alignment line");
        }
        if (n0Var.C0().c().containsKey(aVar)) {
            Integer num = (Integer) n0Var.C0().c().get(aVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iB0 = n0VarX0.b0(aVar);
            if (iB0 != Integer.MIN_VALUE) {
                n0VarX0.G = true;
                n0Var.H = true;
                n0Var.I0();
                n0VarX0.G = false;
                n0Var.H = false;
                return iB0 + ((int) (aVar instanceof androidx.compose.ui.layout.n ? n0VarX0.E0() & 4294967295L : n0VarX0.E0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final androidx.compose.ui.q d(j jVar, int i) {
        androidx.compose.ui.q qVar = ((androidx.compose.ui.q) jVar).e.C;
        if (qVar == null || (qVar.A & i) == 0) {
            return null;
        }
        while (qVar != null) {
            int i2 = qVar.z;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return qVar;
            }
            qVar = qVar.C;
        }
        return null;
    }

    public static final androidx.compose.ui.q e(androidx.compose.runtime.collection.b bVar) {
        int i;
        if (bVar == null || (i = bVar.z) == 0) {
            return null;
        }
        return (androidx.compose.ui.q) bVar.k(i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final w f(androidx.compose.ui.q qVar) {
        if ((qVar.z & 2) != 0) {
            if (qVar instanceof w) {
                return (w) qVar;
            }
            if (qVar instanceof k) {
                androidx.compose.ui.q qVar2 = ((k) qVar).M;
                while (qVar2 != 0) {
                    if (qVar2 instanceof w) {
                        return (w) qVar2;
                    }
                    qVar2 = (!(qVar2 instanceof k) || (qVar2.z & 2) == 0) ? qVar2.C : ((k) qVar2).M;
                }
            }
        }
        return null;
    }

    public static final int g(long j, long j2) {
        boolean zO = o(j);
        if (zO != o(j2)) {
            return zO ? -1 : 1;
        }
        int iSignum = (int) Math.signum(j(j) - j(j2));
        if (Math.min(j(j), j(j2)) >= 0.0f && n(j) != n(j2)) {
            return n(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(i iVar, androidx.compose.runtime.r1 r1Var) {
        if (!((androidx.compose.ui.q) iVar).e.K) {
            androidx.compose.ui.internal.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) v(iVar).Z;
        jVar.getClass();
        return androidx.compose.runtime.t.s(jVar, r1Var);
    }

    public static final ArrayList i(androidx.compose.ui.layout.s sVar) {
        sVar.getClass();
        f0 f0VarB0 = ((n0) sVar).B0();
        boolean zP = p(f0VarB0);
        androidx.collection.h0 h0Var = (androidx.collection.h0) f0VarB0.o();
        androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) h0Var.y;
        ArrayList arrayList = new ArrayList(bVar.z);
        int i = bVar.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var = (f0) h0Var.get(i2);
            arrayList.add(zP ? f0Var.l() : f0Var.m());
        }
        return arrayList;
    }

    public static final float j(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(n nVar) {
        if (((androidx.compose.ui.q) nVar).e.K) {
            t(nVar, 1).b1();
        }
    }

    public static final void l(w wVar) {
        v(wVar).E();
    }

    public static final void m(u1 u1Var) {
        v(u1Var).F();
    }

    public static final boolean n(long j) {
        return (j & 2) != 0;
    }

    public static final boolean o(long j) {
        return (j & 1) != 0;
    }

    public static final boolean p(f0 f0Var) {
        int iOrdinal = f0Var.e0.d.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    coil3.g.a();
                    return false;
                }
                f0 f0VarV = f0Var.v();
                if (f0VarV != null) {
                    return p(f0VarV);
                }
                kotlinx.coroutines.future.a.q("no parent for idle node");
                return false;
            }
        }
        return true;
    }

    public static final boolean q(f0 f0Var) {
        if (f0Var.F == null) {
            return false;
        }
        f0 f0VarV = f0Var.v();
        return (f0VarV != null ? f0VarV.F : null) == null || f0Var.e0.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(androidx.compose.ui.q qVar, kotlin.jvm.functions.a aVar) {
        i1 i1Var = qVar.D;
        if (i1Var == null) {
            i1Var = new i1((h1) qVar);
            qVar.D = i1Var;
        }
        o1 snapshotObserver = ((androidx.compose.ui.platform.u) w(qVar)).getSnapshotObserver();
        snapshotObserver.a.d(i1Var, d.D, aVar);
    }

    public static final void s(j jVar) {
        androidx.compose.ui.autofill.d dVar;
        f0 f0VarV = v(jVar);
        if (f0VarV.R) {
            return;
        }
        androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) i0.a(f0VarV);
        if (!androidx.compose.ui.platform.u.f() || (dVar = uVar.l0) == null) {
            return;
        }
        dVar.A.a.u(f0VarV.y, new androidx.compose.ui.autofill.c(dVar, f0VarV));
    }

    public static final d1 t(j jVar, int i) {
        d1 d1Var = ((androidx.compose.ui.q) jVar).e.E;
        d1Var.getClass();
        if (d1Var.U0() != jVar || !e1.g(i)) {
            return d1Var;
        }
        d1 d1Var2 = d1Var.M;
        d1Var2.getClass();
        return d1Var2;
    }

    public static final d1 u(j jVar) {
        if (!((androidx.compose.ui.q) jVar).e.K) {
            androidx.compose.ui.internal.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        d1 d1VarT = t(jVar, 2);
        if (!d1VarT.U0().K) {
            androidx.compose.ui.internal.a.b("LayoutCoordinates is not attached.");
        }
        return d1VarT;
    }

    public static final f0 v(j jVar) {
        d1 d1Var = ((androidx.compose.ui.q) jVar).e.E;
        if (d1Var != null) {
            return d1Var.L;
        }
        throw androidx.compose.runtime.j.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final m1 w(j jVar) {
        m1 m1Var = v(jVar).L;
        if (m1Var != null) {
            return m1Var;
        }
        throw androidx.compose.runtime.j.a("This node does not have an owner.");
    }

    public static final View x(j jVar) {
        if (!((androidx.compose.ui.q) jVar).e.K) {
            androidx.compose.ui.internal.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) i0.a(v(jVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.l] */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void y(j jVar, Object obj, kotlin.jvm.functions.l lVar) {
        a1 a1Var;
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) jVar;
        if (!qVar.e.K) {
            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.q qVar2 = qVar.e.B;
        f0 f0VarV = v(jVar);
        while (f0VarV != null) {
            if ((((androidx.compose.ui.q) f0VarV.d0.g).A & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.z & 262144) != 0) {
                        ?? E = qVar2;
                        ?? bVar = 0;
                        while (E != 0) {
                            if (E instanceof z1) {
                                z1 z1Var = (z1) E;
                                if (!(obj.equals(z1Var.i()) ? ((Boolean) lVar.invoke(z1Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((E.z & 262144) != 0) && (E instanceof k)) {
                                    androidx.compose.ui.q qVar3 = ((k) E).M;
                                    int i = 0;
                                    while (qVar3 != null) {
                                        if ((qVar3.z & 262144) != 0) {
                                            E = E;
                                            bVar = bVar;
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                bVar = bVar;
                                                bVar = bVar;
                                                E = qVar3;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar3);
                                            }
                                        } else {
                                            E = E;
                                            bVar = bVar;
                                            E = E;
                                            bVar = bVar;
                                        }
                                        qVar3 = qVar3.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i == 1) {
                                        E = E;
                                        bVar = bVar;
                                    } else {
                                        E = E;
                                        bVar = bVar;
                                    }
                                }
                            }
                            E = e(bVar);
                        }
                    }
                    qVar2 = qVar2.B;
                }
            }
            f0VarV = f0VarV.v();
            qVar2 = (f0VarV == null || (a1Var = f0VarV.d0) == null) ? null : (w1) a1Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.ui.node.j, androidx.compose.ui.node.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.l] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void z(z1 z1Var, kotlin.jvm.functions.l lVar) {
        a1 a1Var;
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) z1Var;
        if (!qVar.e.K) {
            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.q qVar2 = qVar.e.B;
        f0 f0VarV = v(z1Var);
        while (f0VarV != null) {
            if ((((androidx.compose.ui.q) f0VarV.d0.g).A & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.z & 262144) != 0) {
                        ?? E = qVar2;
                        ?? bVar = 0;
                        while (E != 0) {
                            boolean zBooleanValue = true;
                            if (E instanceof z1) {
                                z1 z1Var2 = (z1) E;
                                if (kotlin.jvm.internal.l.a(z1Var.i(), z1Var2.i()) && z1Var.getClass() == z1Var2.getClass()) {
                                    zBooleanValue = ((Boolean) lVar.invoke(z1Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((E.z & 262144) != 0) && (E instanceof k)) {
                                    androidx.compose.ui.q qVar3 = ((k) E).M;
                                    int i = 0;
                                    while (qVar3 != null) {
                                        if ((qVar3.z & 262144) != 0) {
                                            E = E;
                                            bVar = bVar;
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                bVar = bVar;
                                                bVar = bVar;
                                                E = qVar3;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar3);
                                            }
                                        } else {
                                            E = E;
                                            bVar = bVar;
                                            E = E;
                                            bVar = bVar;
                                        }
                                        qVar3 = qVar3.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i == 1) {
                                        E = E;
                                        bVar = bVar;
                                    } else {
                                        E = E;
                                        bVar = bVar;
                                    }
                                }
                            }
                            E = e(bVar);
                        }
                    }
                    qVar2 = qVar2.B;
                }
            }
            f0VarV = f0VarV.v();
            qVar2 = (f0VarV == null || (a1Var = f0VarV.d0) == null) ? null : (w1) a1Var.f;
        }
    }
}
