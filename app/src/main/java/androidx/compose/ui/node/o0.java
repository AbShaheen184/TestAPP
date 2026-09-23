package androidx.compose.ui.node;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends n0 implements androidx.compose.ui.layout.p0 {
    public final d1 L;
    public LinkedHashMap N;
    public androidx.compose.ui.layout.r0 P;
    public final androidx.collection.f0 Q;
    public long M = 0;
    public final androidx.compose.ui.layout.o0 O = new androidx.compose.ui.layout.o0(this);

    public o0(d1 d1Var) {
        this.L = d1Var;
        androidx.collection.f0 f0Var = androidx.collection.t0.a;
        this.Q = new androidx.collection.f0();
    }

    public static final void J0(o0 o0Var, androidx.compose.ui.layout.r0 r0Var) {
        LinkedHashMap linkedHashMap;
        if (r0Var != null) {
            o0Var.n0((((long) r0Var.a()) & 4294967295L) | (((long) r0Var.b()) << 32));
        } else {
            o0Var.n0(0L);
        }
        if (!kotlin.jvm.internal.l.a(o0Var.P, r0Var) && r0Var != null && ((((linkedHashMap = o0Var.N) != null && !linkedHashMap.isEmpty()) || !r0Var.c().isEmpty()) && !kotlin.jvm.internal.l.a(r0Var.c(), o0Var.N))) {
            r0 r0Var2 = o0Var.L.L.e0.q;
            r0Var2.getClass();
            r0Var2.O.f();
            LinkedHashMap linkedHashMap2 = o0Var.N;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                o0Var.N = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(r0Var.c());
        }
        o0Var.P = r0Var;
    }

    @Override // androidx.compose.ui.node.n0
    public final boolean A0() {
        return this.P != null;
    }

    @Override // androidx.compose.ui.node.n0
    public final f0 B0() {
        return this.L.L;
    }

    @Override // androidx.compose.ui.node.n0
    public final androidx.compose.ui.layout.r0 C0() {
        androidx.compose.ui.layout.r0 r0Var = this.P;
        if (r0Var != null) {
            return r0Var;
        }
        throw androidx.compose.runtime.j.a("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.n0
    public final n0 D0() {
        d1 d1Var = this.L.N;
        if (d1Var != null) {
            return d1Var.S0();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.n0
    public final long E0() {
        return this.M;
    }

    @Override // androidx.compose.ui.node.n0
    public final void I0() {
        l0(this.M, 0.0f, null);
    }

    public void K0() {
        C0().d();
    }

    @Override // androidx.compose.ui.layout.d1, androidx.compose.ui.layout.p0
    public final Object L() {
        return this.L.L();
    }

    public final void L0(long j) {
        if (!androidx.compose.ui.unit.j.a(this.M, j)) {
            this.M = j;
            d1 d1Var = this.L;
            r0 r0Var = d1Var.L.e0.q;
            if (r0Var != null) {
                r0Var.w0();
            }
            n0.G0(d1Var);
        }
        if (this.H) {
            return;
        }
        w0(C0());
    }

    public final long M0(o0 o0Var, boolean z) {
        long jC = 0;
        o0 o0VarS0 = this;
        while (!o0VarS0.equals(o0Var)) {
            if (!o0VarS0.F || !z) {
                jC = androidx.compose.ui.unit.j.c(jC, o0VarS0.M);
            }
            d1 d1Var = o0VarS0.L.N;
            d1Var.getClass();
            o0VarS0 = d1Var.S0();
            o0VarS0.getClass();
        }
        return jC;
    }

    @Override // androidx.compose.ui.unit.c
    public final float U() {
        return this.L.U();
    }

    @Override // androidx.compose.ui.node.n0, androidx.compose.ui.layout.s
    public final boolean V() {
        return true;
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.L.a();
    }

    @Override // androidx.compose.ui.layout.s
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return this.L.L.X;
    }

    @Override // androidx.compose.ui.layout.d1
    public final void l0(long j, float f, kotlin.jvm.functions.l lVar) {
        L0(j);
        if (this.G) {
            return;
        }
        K0();
    }

    @Override // androidx.compose.ui.node.n0
    public final n0 x0() {
        d1 d1Var = this.L.M;
        if (d1Var != null) {
            return d1Var.S0();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.n0
    public final androidx.compose.ui.layout.x y0() {
        return this.O;
    }
}
