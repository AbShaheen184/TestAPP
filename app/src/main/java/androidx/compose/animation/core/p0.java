package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends j2 {
    public final androidx.compose.runtime.j1 y;
    public final androidx.compose.runtime.j1 z;

    public p0(Object obj) {
        super(0);
        this.y = androidx.compose.runtime.t.r(obj);
        this.z = androidx.compose.runtime.t.r(obj);
    }

    @Override // androidx.compose.animation.core.j2
    public final Object n() {
        return this.y.getValue();
    }

    @Override // androidx.compose.animation.core.j2
    public final Object p() {
        return this.z.getValue();
    }

    @Override // androidx.compose.animation.core.j2
    public final void s(Object obj) {
        this.y.setValue(obj);
    }

    @Override // androidx.compose.animation.core.j2
    public final void u() {
    }

    @Override // androidx.compose.animation.core.j2
    public final void t(e2 e2Var) {
    }
}
