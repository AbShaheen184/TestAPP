package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.activity.w;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.foundation.text.m;
import androidx.compose.foundation.text.selection.u0;
import androidx.compose.foundation.text.selection.v0;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.t;
import androidx.compose.ui.layout.x;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.compose.ui.node.k implements androidx.compose.ui.node.i, androidx.compose.foundation.text.contextmenu.provider.e {
    public o N;
    public u0 O;
    public v0 P;
    public m Q;
    public Job R;
    public final g0 S = t.k(new w(this, 13));
    public androidx.compose.ui.geometry.c T = androidx.compose.ui.geometry.c.e;

    public j(o oVar, u0 u0Var, v0 v0Var, m mVar) {
        this.N = oVar;
        this.O = u0Var;
        this.P = v0Var;
        this.Q = mVar;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        o oVar = this.N;
        oVar.z = k.z;
        oVar.y = this;
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        o oVar = this.N;
        oVar.z = k.y;
        oVar.y = null;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final androidx.compose.foundation.text.contextmenu.data.c N() {
        return (androidx.compose.foundation.text.contextmenu.data.c) this.S.getValue();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final androidx.compose.ui.geometry.c j0(x xVar) {
        if (!this.K) {
            return this.T;
        }
        androidx.compose.ui.geometry.c cVar = (androidx.compose.ui.geometry.c) this.Q.invoke(xVar);
        if (cVar == null) {
            return this.T;
        }
        this.T = cVar;
        return cVar;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final long o0(x xVar) {
        return j0(xVar).d();
    }
}
