package androidx.compose.ui.semantics;

import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends w0 implements p {
    public final kotlin.jvm.functions.l b;

    public c(kotlin.jvm.functions.l lVar) {
        this.b = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new e(false, true, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.b == ((c) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.semantics.p
    public final n f() {
        n nVar = new n();
        nVar.z = false;
        nVar.A = true;
        this.b.invoke(nVar);
        return nVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        ((e) qVar).N = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
