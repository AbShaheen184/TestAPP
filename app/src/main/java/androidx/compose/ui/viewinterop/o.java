package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.pointer.b0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends androidx.compose.ui.q {
    public b0 L;
    public final androidx.compose.animation.e M = new androidx.compose.animation.e(this, 25);

    public o(b0 b0Var) {
        this.L = b0Var;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        this.L.invoke(this.M);
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        this.L.invoke(null);
    }
}
