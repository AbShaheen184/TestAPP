package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public kotlin.jvm.functions.l L;
    public long M;

    @Override // androidx.compose.ui.q
    public final boolean B0() {
        return true;
    }

    @Override // androidx.compose.ui.node.v
    public final void l(long j) {
        if (androidx.compose.ui.unit.l.a(this.M, j)) {
            return;
        }
        this.L.invoke(new androidx.compose.ui.unit.l(j));
        this.M = j;
    }
}
