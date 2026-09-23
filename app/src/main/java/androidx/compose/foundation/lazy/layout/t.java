package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.compose.ui.q implements androidx.compose.ui.node.n {
    public v L;

    @Override // androidx.compose.ui.q
    public final void E0() {
        this.L.getClass();
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        v vVar = this.L;
        vVar.d();
        vVar.b = null;
    }

    @Override // androidx.compose.ui.node.n
    public final void X(androidx.compose.ui.node.h0 h0Var) {
        ArrayList arrayList = this.L.h;
        if (arrayList.size() <= 0) {
            h0Var.b();
        } else {
            androidx.privacysandbox.ads.adservices.java.internal.a.D(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && kotlin.jvm.internal.l.a(this.L, ((t) obj).L);
    }

    public final int hashCode() {
        return this.L.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.L + ')';
    }
}
