package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.foundation.text.m;
import androidx.compose.foundation.text.selection.u0;
import androidx.compose.foundation.text.selection.v0;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
final class i extends w0 {
    public final o b;
    public final u0 c;
    public final v0 d;
    public final m e;

    public i(o oVar, u0 u0Var, v0 v0Var, m mVar) {
        this.b = oVar;
        this.c = u0Var;
        this.d = v0Var;
        this.e = mVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return new j(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.b == iVar.b && this.c == iVar.c && this.d == iVar.d && this.e == iVar.e;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(q qVar) {
        j jVar = (j) qVar;
        jVar.N.y = null;
        o oVar = this.b;
        jVar.N = oVar;
        oVar.y = jVar;
        oVar.z = jVar.K ? k.z : k.y;
        jVar.O = this.c;
        jVar.P = this.d;
        jVar.Q = this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
    }
}
