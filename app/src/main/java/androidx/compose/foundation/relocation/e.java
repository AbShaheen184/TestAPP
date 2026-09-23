package androidx.compose.foundation.relocation;

import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends q {
    public c L;

    @Override // androidx.compose.ui.q
    public final boolean B0() {
        return false;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        c cVar = this.L;
        if (cVar != null) {
            cVar.a.j(this);
        }
        if (cVar != null) {
            cVar.a.b(this);
        }
        this.L = cVar;
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        c cVar = this.L;
        if (cVar != null) {
            cVar.a.j(this);
        }
    }
}
