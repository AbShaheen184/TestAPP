package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements u1 {
    public final u1 a;
    public final u1 b;

    public d0(u1 u1Var, u1 u1Var2) {
        this.a = u1Var;
        this.b = u1Var2;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int a(androidx.compose.ui.unit.c cVar) {
        int iA = this.a.a(cVar) - this.b.a(cVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int b(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar) {
        int iB = this.a.b(cVar, mVar) - this.b.b(cVar, mVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int c(androidx.compose.ui.unit.c cVar) {
        int iC = this.a.c(cVar) - this.b.c(cVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int d(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar) {
        int iD = this.a.d(cVar, mVar) - this.b.d(cVar, mVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.l.a(d0Var.a, this.a) && kotlin.jvm.internal.l.a(d0Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
