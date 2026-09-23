package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final androidx.compose.ui.unit.d a = _COROUTINE.b.a();

    public static final m1 a(f0 f0Var) {
        m1 m1Var = f0Var.L;
        if (m1Var != null) {
            return m1Var;
        }
        throw androidx.compose.runtime.j.a("LayoutNode should be attached to an owner");
    }
}
