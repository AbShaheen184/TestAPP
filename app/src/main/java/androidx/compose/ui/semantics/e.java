package androidx.compose.ui.semantics;

import androidx.compose.ui.node.u1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.compose.ui.q implements u1 {
    public boolean L;
    public final boolean M;
    public kotlin.jvm.functions.l N;

    public e(boolean z, boolean z2, kotlin.jvm.functions.l lVar) {
        this.L = z;
        this.M = z2;
        this.N = lVar;
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean F() {
        return this.M;
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(a0 a0Var) {
        this.N.invoke(a0Var);
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean v0() {
        return this.L;
    }
}
