package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements u1 {
    public final u1 a;
    public final int b;

    public v0(u1 u1Var, int i) {
        this.a = u1Var;
        this.b = i;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int a(androidx.compose.ui.unit.c cVar) {
        if ((this.b & 16) != 0) {
            return this.a.a(cVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int b(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar) {
        if (((mVar == androidx.compose.ui.unit.m.e ? 4 : 1) & this.b) != 0) {
            return this.a.b(cVar, mVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int c(androidx.compose.ui.unit.c cVar) {
        if ((this.b & 32) != 0) {
            return this.a.c(cVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int d(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar) {
        if (((mVar == androidx.compose.ui.unit.m.e ? 8 : 2) & this.b) != 0) {
            return this.a.d(cVar, mVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.l.a(this.a, v0Var.a) && this.b == v0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = b.e;
        int i2 = this.b;
        if ((i2 & i) == i) {
            b.w("Start", sb3);
        }
        int i3 = b.g;
        if ((i2 & i3) == i3) {
            b.w("Left", sb3);
        }
        if ((i2 & 16) == 16) {
            b.w("Top", sb3);
        }
        int i4 = b.f;
        if ((i2 & i4) == i4) {
            b.w("End", sb3);
        }
        int i5 = b.h;
        if ((i2 & i5) == i5) {
            b.w("Right", sb3);
        }
        if ((i2 & 32) == 32) {
            b.w("Bottom", sb3);
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
