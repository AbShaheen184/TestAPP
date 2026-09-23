package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends a0 {
    public final androidx.compose.ui.geometry.c f;

    public h0(androidx.compose.ui.geometry.c cVar) {
        this.f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return this.f.equals(((h0) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // androidx.compose.ui.graphics.a0
    public final androidx.compose.ui.geometry.c m() {
        return this.f;
    }
}
