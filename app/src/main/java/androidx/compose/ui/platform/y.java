package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements androidx.compose.ui.semantics.a0 {
    public boolean e;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 y;

    public y(androidx.compose.ui.graphics.n0 n0Var) {
        this.y = n0Var;
    }

    @Override // androidx.compose.ui.semantics.a0
    public final void b(androidx.compose.ui.semantics.z zVar, Object obj) {
        if (obj == this.y) {
            this.e = true;
        }
    }
}
