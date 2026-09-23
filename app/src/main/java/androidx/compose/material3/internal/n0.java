package androidx.compose.material3.internal;

import androidx.compose.ui.node.u1;
import androidx.compose.ui.node.z1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends androidx.compose.ui.q implements z1, u1 {
    public androidx.compose.animation.core.a L;
    public boolean M;

    @Override // androidx.compose.ui.node.z1
    public final Object i() {
        return p0.a;
    }

    @Override // androidx.compose.ui.node.u1
    public final void n0(androidx.compose.ui.semantics.a0 a0Var) throws Throwable {
        if (this.M) {
            return;
        }
        this.L.invoke(a0Var);
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean v0() {
        return true;
    }
}
