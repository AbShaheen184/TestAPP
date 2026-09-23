package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class s extends androidx.compose.ui.node.w0 {
    public final v b;

    public s(v vVar) {
        this.b = vVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        t tVar = new t();
        tVar.L = this.b;
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.b.equals(((s) obj).b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        t tVar = (t) qVar;
        v vVar = tVar.L;
        v vVar2 = this.b;
        if (kotlin.jvm.internal.l.a(vVar, vVar2) || !tVar.e.K) {
            return;
        }
        v vVar3 = tVar.L;
        vVar3.d();
        vVar3.b = null;
        tVar.L = vVar2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.b + ')';
    }
}
