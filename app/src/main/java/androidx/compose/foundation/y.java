package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends androidx.compose.ui.node.k implements androidx.compose.ui.node.u1 {
    public u N;
    public float O;
    public androidx.compose.ui.graphics.p0 P;
    public androidx.compose.ui.graphics.n0 Q;
    public final androidx.compose.ui.draw.c R;

    public y(float f, androidx.compose.ui.graphics.p0 p0Var, androidx.compose.ui.graphics.n0 n0Var) {
        this.O = f;
        this.P = p0Var;
        this.Q = n0Var;
        androidx.compose.ui.draw.c cVar = new androidx.compose.ui.draw.c(new androidx.compose.ui.draw.d(), new androidx.activity.compose.g(this, 2));
        M0(cVar);
        this.R = cVar;
    }

    @Override // androidx.compose.ui.q
    public final boolean B0() {
        return false;
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean f() {
        return false;
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(androidx.compose.ui.semantics.a0 a0Var) {
        androidx.compose.ui.semantics.y.e(a0Var, this.Q);
    }
}
