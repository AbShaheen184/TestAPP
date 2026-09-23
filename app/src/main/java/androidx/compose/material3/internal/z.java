package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.o1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class z<T> extends androidx.compose.ui.node.w0 {
    public final p b;
    public final kotlin.jvm.functions.p c;

    public z(p pVar, kotlin.jvm.functions.p pVar2) {
        this.b = pVar;
        this.c = pVar2;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        a0 a0Var = new a0();
        a0Var.L = this.b;
        a0Var.M = this.c;
        a0Var.N = o1.e;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.l.a(this.b, zVar.b) && this.c == zVar.c;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        a0 a0Var = (a0) qVar;
        a0Var.L = this.b;
        a0Var.M = this.c;
        a0Var.N = o1.e;
    }

    public final int hashCode() {
        return o1.e.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
