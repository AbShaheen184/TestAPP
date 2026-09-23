package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements u1 {
    public final u1 a;
    public final u1 b;

    public m1(u1 u1Var, u1 u1Var2) {
        this.a = u1Var;
        this.b = u1Var2;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int a(androidx.compose.ui.unit.c cVar) {
        return Math.max(this.a.a(cVar), this.b.a(cVar));
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int b(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar) {
        return Math.max(this.a.b(cVar, mVar), this.b.b(cVar, mVar));
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int c(androidx.compose.ui.unit.c cVar) {
        return Math.max(this.a.c(cVar), this.b.c(cVar));
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int d(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar) {
        return Math.max(this.a.d(cVar, mVar), this.b.d(cVar, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return kotlin.jvm.internal.l.a(m1Var.a, this.a) && kotlin.jvm.internal.l.a(m1Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
