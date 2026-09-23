package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends o0 {
    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.b((d1) f0Var.d0.e, f0Var.l(), i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final androidx.compose.ui.layout.d1 F(long j) {
        o0(j);
        d1 d1Var = this.L;
        androidx.compose.runtime.collection.b bVarZ = d1Var.L.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            r0 r0Var = ((f0) objArr[i2]).e0.q;
            r0Var.getClass();
            r0Var.G = d0.z;
        }
        f0 f0Var = d1Var.L;
        o0.J0(this, f0Var.U.a(this, f0Var.l(), j));
        return this;
    }

    @Override // androidx.compose.ui.node.o0
    public final void K0() {
        r0 r0Var = this.L.L.e0.q;
        r0Var.getClass();
        r0Var.y0();
    }

    @Override // androidx.compose.ui.layout.p0
    public final int a0(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.e((d1) f0Var.d0.e, f0Var.l(), i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.h((d1) f0Var.d0.e, f0Var.l(), i);
    }

    @Override // androidx.compose.ui.node.n0
    public final int q0(androidx.compose.ui.layout.a aVar) {
        r0 r0Var = this.L.L.e0.q;
        r0Var.getClass();
        g0 g0Var = r0Var.O;
        if (!r0Var.H) {
            j0 j0Var = r0Var.C;
            if (j0Var.d == b0.y) {
                g0Var.f = true;
                if (g0Var.b) {
                    j0Var.f = true;
                    j0Var.g = true;
                }
            } else {
                g0Var.g = true;
            }
        }
        r rVar = r0Var.g().p0;
        if (rVar != null) {
            rVar.H = true;
        }
        r0Var.R();
        r rVar2 = r0Var.g().p0;
        if (rVar2 != null) {
            rVar2.H = false;
        }
        Integer num = (Integer) g0Var.i.get(aVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.Q.g(iIntValue, aVar);
        return iIntValue;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int v(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.g((d1) f0Var.d0.e, f0Var.l(), i);
    }
}
