package com.app.mlounge.ui.components;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends androidx.compose.ui.graphics.painter.b {
    public final /* synthetic */ androidx.compose.ui.graphics.vector.j0 C;
    public final /* synthetic */ long D;

    public j0(androidx.compose.ui.graphics.vector.j0 j0Var, long j) {
        this.C = j0Var;
        this.D = j;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final long h() {
        return this.C.h();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final void i(androidx.compose.ui.node.h0 h0Var) {
        this.C.g(h0Var, h0Var.e.d(), 1.0f, new androidx.compose.ui.graphics.m(this.D, 5));
    }
}
