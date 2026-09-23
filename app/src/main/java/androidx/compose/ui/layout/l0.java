package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements k1 {
    public final androidx.collection.a0 a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ Object c;

    public l0(m0 m0Var, Object obj) {
        this.b = m0Var;
        this.c = obj;
        int[] iArr = androidx.collection.p.a;
        this.a = new androidx.collection.a0();
    }

    @Override // androidx.compose.ui.layout.k1
    public final int a() {
        androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) this.b.G.g(this.c);
        if (f0Var != null) {
            return ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.n()).y).z;
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.k1
    public final long b(int i) {
        androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) this.b.G.g(this.c);
        if (f0Var == null || !f0Var.H()) {
            return 0L;
        }
        int i2 = ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.n()).y).z;
        if (i < 0 || i >= i2) {
            androidx.compose.ui.internal.a.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!this.a.b(i)) {
            return 0L;
        }
        return (((long) ((androidx.compose.ui.node.f0) ((androidx.collection.h0) f0Var.n()).get(i)).e0.p.e) << 32) | (((long) ((androidx.compose.ui.node.f0) ((androidx.collection.h0) f0Var.n()).get(i)).e0.p.y) & 4294967295L);
    }

    @Override // androidx.compose.ui.layout.k1
    public final void c(int i, long j) {
        m0 m0Var = this.b;
        androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) m0Var.G.g(this.c);
        if (f0Var == null || !f0Var.H()) {
            return;
        }
        int i2 = ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.n()).y).z;
        if (i < 0 || i >= i2) {
            androidx.compose.ui.internal.a.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (f0Var.I()) {
            androidx.compose.ui.internal.a.a("Pre-measure called on node that is not placed");
        }
        androidx.compose.ui.node.f0 f0Var2 = m0Var.e;
        f0Var2.O = true;
        ((androidx.compose.ui.platform.u) androidx.compose.ui.node.i0.a(f0Var)).v((androidx.compose.ui.node.f0) ((androidx.collection.h0) f0Var.n()).get(i), j);
        f0Var2.O = false;
        this.a.a(i);
    }

    @Override // androidx.compose.ui.layout.k1
    public final void d(androidx.compose.foundation.lazy.layout.y0 y0Var) {
        androidx.compose.ui.node.a1 a1Var;
        androidx.compose.ui.q qVar;
        androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) this.b.G.g(this.c);
        if (f0Var == null || (a1Var = f0Var.d0) == null || (qVar = (androidx.compose.ui.q) a1Var.g) == null) {
            return;
        }
        androidx.compose.ui.node.l.A(qVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", y0Var);
    }

    @Override // androidx.compose.ui.layout.k1
    public final void dispose() {
        m0 m0Var = this.b;
        androidx.compose.ui.node.f0 f0Var = m0Var.e;
        m0Var.g();
        androidx.collection.o0 o0Var = m0Var.G;
        Object obj = this.c;
        androidx.compose.ui.node.f0 f0Var2 = (androidx.compose.ui.node.f0) o0Var.k(obj);
        if (f0Var2 != null) {
            if (m0Var.L <= 0) {
                androidx.compose.ui.internal.a.b("No pre-composed items to dispose");
            }
            int i = ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).i(f0Var2);
            if (i < ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).z - m0Var.L) {
                androidx.compose.ui.internal.a.b("Item is not in pre-composed item range");
            }
            m0Var.K++;
            m0Var.L--;
            f0 f0Var3 = (f0) m0Var.C.g(f0Var2);
            if (f0Var3 != null) {
                m0.d(f0Var3);
            }
            int i2 = (((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).z - m0Var.L) - m0Var.K;
            m0Var.i(i, i2);
            m0Var.f(i2);
        }
        if (m0Var.J.h(obj)) {
            androidx.compose.ui.node.f0.X(f0Var, true, 6);
        }
    }
}
