package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class i extends androidx.compose.ui.node.w0 {
    public final float b;

    public i(float f) {
        this.b = f;
        if (f > 0.0f) {
            return;
        }
        androidx.compose.foundation.layout.internal.a.a("aspectRatio " + f + " must be > 0");
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        k kVar = new k();
        kVar.L = this.b;
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i iVar = obj instanceof i ? (i) obj : null;
        if (iVar == null || this.b != iVar.b) {
            return false;
        }
        ((i) obj).getClass();
        return true;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((k) qVar).L = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.b) * 31);
    }
}
