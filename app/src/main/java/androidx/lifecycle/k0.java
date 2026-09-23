package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements t, AutoCloseable {
    public final String e;
    public final j0 y;
    public boolean z;

    public k0(String str, j0 j0Var) {
        this.e = str;
        this.y = j0Var;
    }

    public final void L(p pVar, androidx.savedstate.e eVar) {
        eVar.getClass();
        pVar.getClass();
        if (this.z) {
            kotlinx.coroutines.future.a.u("Already attached to lifecycleOwner");
            return;
        }
        this.z = true;
        pVar.a(this);
        eVar.c(this.e, (androidx.activity.g) this.y.b.B);
    }

    @Override // androidx.lifecycle.t
    public final void g(v vVar, n nVar) {
        if (nVar == n.ON_DESTROY) {
            this.z = false;
            vVar.getLifecycle().b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
