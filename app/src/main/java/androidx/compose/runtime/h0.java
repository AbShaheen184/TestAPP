package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements b2 {
    public final kotlin.jvm.functions.l e;
    public i0 y;

    public h0(kotlin.jvm.functions.l lVar) {
        this.e = lVar;
    }

    @Override // androidx.compose.runtime.b2
    public final void b() {
        i0 i0Var = this.y;
        if (i0Var != null) {
            i0Var.dispose();
        }
        this.y = null;
    }

    @Override // androidx.compose.runtime.b2
    public final void c() {
        this.y = (i0) this.e.invoke(l0.a);
    }

    @Override // androidx.compose.runtime.b2
    public final void a() {
    }
}
