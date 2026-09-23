package androidx.compose.ui.semantics;

import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w0 implements p {
    public final boolean b;
    public final kotlin.jvm.functions.l c;

    public b(kotlin.jvm.functions.l lVar, boolean z) {
        this.b = z;
        this.c = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new e(this.b, false, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.b == bVar.b && this.c == bVar.c;
    }

    @Override // androidx.compose.ui.semantics.p
    public final n f() {
        n nVar = new n();
        nVar.z = this.b;
        this.c.invoke(nVar);
        return nVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        e eVar = (e) qVar;
        eVar.L = this.b;
        eVar.N = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }
}
