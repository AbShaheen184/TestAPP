package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class l extends androidx.compose.ui.node.w0 {
    public final androidx.compose.ui.j b;

    public l(androidx.compose.ui.j jVar) {
        this.b = jVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        m mVar = new m();
        mVar.L = this.b;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        l lVar = obj instanceof l ? (l) obj : null;
        return lVar != null && this.b.equals(lVar.b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((m) qVar).L = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b.hashCode() * 31);
    }
}
