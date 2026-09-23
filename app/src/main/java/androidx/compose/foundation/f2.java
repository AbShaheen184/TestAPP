package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends androidx.compose.ui.node.w0 {
    public final c2 b;
    public final boolean c;

    public f2(c2 c2Var, boolean z) {
        this.b = c2Var;
        this.c = z;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        z1 z1Var = new z1();
        z1Var.L = this.b;
        z1Var.M = this.c;
        return z1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return kotlin.jvm.internal.l.a(this.b, f2Var.b) && this.c == f2Var.c;
    }

    @Override // androidx.compose.ui.node.w0
    public final void g(androidx.compose.ui.q qVar) {
        z1 z1Var = (z1) qVar;
        z1Var.L = this.b;
        z1Var.M = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.h(this.b.hashCode() * 31, 31, false);
    }
}
