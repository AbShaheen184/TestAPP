package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends androidx.compose.ui.q implements androidx.compose.ui.node.p1 {
    public float L;
    public boolean M;

    @Override // androidx.compose.ui.node.p1
    public final Object y0(Object obj) {
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        if (c1Var == null) {
            c1Var = new c1();
        }
        c1Var.a = this.L;
        c1Var.b = this.M;
        return c1Var;
    }
}
