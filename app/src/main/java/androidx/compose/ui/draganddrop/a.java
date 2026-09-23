package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends w0 {
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return this.b.a;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.w0
    public final /* bridge */ /* synthetic */ void g(q qVar) {
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }
}
