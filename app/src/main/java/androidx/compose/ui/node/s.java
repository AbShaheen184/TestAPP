package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends d1 {
    public static final com.google.android.gms.cloudmessaging.n q0;
    public final w1 o0;
    public r p0;

    static {
        com.google.android.gms.cloudmessaging.n nVarG = androidx.compose.ui.graphics.a0.g();
        int i = androidx.compose.ui.graphics.t.j;
        nVarG.h(androidx.compose.ui.graphics.t.e);
        nVarG.n(1.0f);
        nVarG.o(1);
        q0 = nVarG;
    }

    public s(f0 f0Var) {
        super(f0Var);
        w1 w1Var = new w1();
        w1Var.A = 0;
        this.o0 = w1Var;
        w1Var.E = this;
        this.p0 = f0Var.F != null ? new r(this) : null;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.b((d1) f0Var.d0.e, f0Var.m(), i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final androidx.compose.ui.layout.d1 F(long j) {
        o0(j);
        f0 f0Var = this.L;
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((f0) objArr[i2]).e0.p.I = d0.z;
        }
        n1(f0Var.U.a(this, f0Var.m(), j));
        e1();
        return this;
    }

    @Override // androidx.compose.ui.node.d1
    public final void P0() {
        if (this.p0 == null) {
            this.p0 = new r(this);
        }
    }

    @Override // androidx.compose.ui.node.d1
    public final o0 S0() {
        return this.p0;
    }

    @Override // androidx.compose.ui.node.d1
    public final androidx.compose.ui.q U0() {
        return this.o0;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int a0(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.e((d1) f0Var.d0.e, f0Var.m(), i);
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // androidx.compose.ui.node.d1
    public final void a1(b1 b1Var, long j, q qVar, int i, boolean z) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        Object[] objArr;
        int i3;
        f0 f0Var;
        f0 f0Var2;
        long jB;
        long j2 = j;
        q qVar2 = qVar;
        int i4 = b1Var.a;
        f0 f0Var3 = this.L;
        switch (i4) {
            case 0:
                z2 = true;
                break;
            default:
                androidx.compose.ui.semantics.n nVarX = f0Var3.x();
                z2 = !(nVarX != null && nVarX.A);
                break;
        }
        if (z2) {
            if (u1(j2)) {
                i2 = i;
                z3 = z;
                z4 = true;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(M0(j2, T0())) & Integer.MAX_VALUE) < 2139095040) {
                    z4 = true;
                    z3 = false;
                }
            }
            if (z4) {
                int i5 = qVar2.z;
                androidx.compose.runtime.collection.b bVarY = f0Var3.y();
                objArr = bVarY.e;
                i3 = bVarY.z - 1;
                while (i3 >= 0) {
                    f0Var = (f0) objArr[i3];
                    if (f0Var.I()) {
                        switch (b1Var.a) {
                            case 0:
                                f0Var.A(j2, qVar2, i2, z3);
                                f0Var2 = f0Var;
                                break;
                            default:
                                a1 a1Var = f0Var.d0;
                                ((d1) a1Var.e).Z0(d1.n0, ((d1) a1Var.e).R0(j2), qVar2, 1, z3);
                                qVar2 = qVar;
                                f0Var2 = f0Var;
                                break;
                        }
                        jB = qVar2.b();
                        if (l.j(jB) < 0.0f && l.o(jB) && !l.n(jB)) {
                            d1 d1Var = (d1) f0Var2.d0.e;
                            d1Var.getClass();
                            androidx.compose.ui.q qVarW0 = d1Var.W0(e1.g(16));
                            if (qVarW0 != null && qVarW0.K) {
                                if (!qVarW0.e.K) {
                                    androidx.compose.ui.internal.a.b("visitLocalDescendants called on an unattached node");
                                }
                                androidx.compose.ui.q qVar3 = qVarW0.e;
                                if ((qVar3.A & 16) != 0) {
                                    while (true) {
                                        if (qVar3 != null) {
                                            if ((qVar3.z & 16) != 0) {
                                                ?? E = qVar3;
                                                ?? bVar = 0;
                                                while (E != 0) {
                                                    if (E instanceof r1) {
                                                        if (((r1) E).l0()) {
                                                            qVar2.z = qVar2.e.b - 1;
                                                            break;
                                                        }
                                                    } else if ((E.z & 16) != 0 && (E instanceof k)) {
                                                        androidx.compose.ui.q qVar4 = ((k) E).M;
                                                        int i6 = 0;
                                                        while (qVar4 != null) {
                                                            if ((qVar4.z & 16) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    E = E;
                                                                    bVar = bVar;
                                                                    bVar = bVar;
                                                                    E = qVar4;
                                                                } else {
                                                                    if (bVar == 0) {
                                                                        bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                                    }
                                                                    if (E != 0) {
                                                                        bVar.b(E);
                                                                        E = 0;
                                                                    }
                                                                    bVar.b(qVar4);
                                                                }
                                                            } else {
                                                                E = E;
                                                                bVar = bVar;
                                                            }
                                                            qVar4 = qVar4.C;
                                                            E = E;
                                                            bVar = bVar;
                                                        }
                                                        if (i6 == 1) {
                                                            E = E;
                                                            bVar = bVar;
                                                        } else {
                                                            E = E;
                                                            bVar = bVar;
                                                        }
                                                    }
                                                    E = l.e(bVar);
                                                }
                                            }
                                            qVar3 = qVar3.C;
                                        }
                                    }
                                }
                            }
                            qVar2.z = i5;
                        }
                    }
                    i3--;
                    j2 = j;
                    i2 = i;
                }
                qVar2.z = i5;
            }
        }
        i2 = i;
        z3 = z;
        z4 = false;
        if (z4) {
            int i7 = qVar2.z;
            androidx.compose.runtime.collection.b bVarY2 = f0Var3.y();
            objArr = bVarY2.e;
            i3 = bVarY2.z - 1;
            while (i3 >= 0) {
                f0Var = (f0) objArr[i3];
                if (f0Var.I()) {
                    switch (b1Var.a) {
                        case 0:
                            f0Var.A(j2, qVar2, i2, z3);
                            f0Var2 = f0Var;
                            break;
                        default:
                            a1 a1Var2 = f0Var.d0;
                            ((d1) a1Var2.e).Z0(d1.n0, ((d1) a1Var2.e).R0(j2), qVar2, 1, z3);
                            qVar2 = qVar;
                            f0Var2 = f0Var;
                            break;
                    }
                    jB = qVar2.b();
                    if (l.j(jB) < 0.0f) {
                        continue;
                    }
                }
                i3--;
                j2 = j;
                i2 = i;
            }
            qVar2.z = i7;
        }
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.h((d1) f0Var.d0.e, f0Var.m(), i);
    }

    @Override // androidx.compose.ui.node.d1
    public final void j1(androidx.compose.ui.graphics.r rVar, androidx.compose.ui.graphics.layer.b bVar) {
        f0 f0Var = this.L;
        m1 m1VarA = i0.a(f0Var);
        androidx.compose.runtime.collection.b bVarY = f0Var.y();
        Object[] objArr = bVarY.e;
        int i = bVarY.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (f0Var2.I()) {
                f0Var2.i(rVar, bVar);
            }
        }
        if (((androidx.compose.ui.platform.u) m1VarA).getShowLayoutBounds()) {
            long j = this.z;
            rVar.m(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, q0);
        }
    }

    @Override // androidx.compose.ui.layout.d1
    public final void l0(long j, float f, kotlin.jvm.functions.l lVar) {
        k1(j, f, lVar);
        if (this.G) {
            return;
        }
        this.L.e0.p.y0();
    }

    @Override // androidx.compose.ui.node.n0
    public final int q0(androidx.compose.ui.layout.a aVar) {
        r rVar = this.p0;
        if (rVar != null) {
            return rVar.q0(aVar);
        }
        v0 v0Var = this.L.e0.p;
        g0 g0Var = v0Var.U;
        if (!v0Var.J) {
            if (v0Var.C.d == b0.e) {
                g0Var.f = true;
                if (g0Var.b) {
                    v0Var.S = true;
                    v0Var.T = true;
                }
            } else {
                g0Var.g = true;
            }
        }
        s sVarG = v0Var.g();
        boolean z = sVarG.H;
        sVarG.H = true;
        v0Var.R();
        sVarG.H = z;
        Integer num = (Integer) g0Var.i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int v(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.g((d1) f0Var.d0.e, f0Var.m(), i);
    }
}
