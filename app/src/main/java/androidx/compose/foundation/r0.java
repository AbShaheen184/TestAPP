package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class r0 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.interaction.k b;

    public r0(androidx.compose.foundation.interaction.k kVar) {
        this.b = kVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new u0(this.b, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            return kotlin.jvm.internal.l.a(this.b, ((r0) obj).b);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((u0) qVar).R0(this.b);
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.k kVar = this.b;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }
}
