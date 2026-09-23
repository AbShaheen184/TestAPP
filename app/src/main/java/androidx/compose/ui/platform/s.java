package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends androidx.compose.ui.node.w0 {
    public final /* synthetic */ u b;

    public s(u uVar) {
        this.b = uVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new k(this.b);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.w0
    public final /* bridge */ /* synthetic */ void g(androidx.compose.ui.q qVar) {
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
