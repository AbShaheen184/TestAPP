package androidx.compose.foundation.layout;

import androidx.compose.ui.node.z1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends androidx.compose.ui.q implements z1 {
    public u1 L;
    public u1 M;

    public k0() {
        g0 g0Var = b.c;
        this.L = g0Var;
        this.M = g0Var;
    }

    @Override // androidx.compose.ui.q
    public void E0() {
        androidx.compose.ui.node.l.y(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new j0(this, 1));
        N0();
    }

    @Override // androidx.compose.ui.q
    public void F0() {
        this.M = this.L;
        androidx.compose.ui.node.l.A(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new j0(this, 0));
    }

    @Override // androidx.compose.ui.q
    public final void G0() {
        this.L = b.c;
    }

    public abstract u1 M0(u1 u1Var);

    public void N0() {
        this.M = M0(this.L);
        androidx.compose.ui.node.l.A(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new j0(this, 0));
    }

    @Override // androidx.compose.ui.node.z1
    public final Object i() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
