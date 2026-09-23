package retrofit2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends z0 {
    public final Class c;

    public j0(Class cls) {
        this.c = cls;
    }

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) {
        okhttp3.a0 a0Var = o0Var.e;
        a0Var.getClass();
        Class cls = this.c;
        cls.getClass();
        a0Var.e = a0Var.e.j(kotlin.jvm.internal.a0.a(cls), obj);
    }
}
