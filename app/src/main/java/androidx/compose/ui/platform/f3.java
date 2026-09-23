package androidx.compose.ui.platform;

import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 implements androidx.compose.runtime.v, androidx.lifecycle.t {
    public androidx.lifecycle.p A;
    public kotlin.jvm.functions.p B = j1.a;
    public final u e;
    public final androidx.compose.runtime.z y;
    public boolean z;

    public f3(u uVar, androidx.compose.runtime.z zVar) {
        this.e = uVar;
        this.y = zVar;
    }

    public final void b() {
        if (!this.z) {
            this.z = true;
            this.e.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.p pVar = this.A;
            if (pVar != null) {
                pVar.b(this);
            }
        }
        this.y.m();
    }

    public final void c(kotlin.jvm.functions.p pVar) {
        this.e.setOnViewTreeOwnersAvailable(new androidx.compose.animation.c(10, this, pVar));
    }

    @Override // androidx.lifecycle.t
    public final void g(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
            b();
        } else {
            if (nVar != androidx.lifecycle.n.ON_CREATE || this.z) {
                return;
            }
            c(this.B);
        }
    }
}
