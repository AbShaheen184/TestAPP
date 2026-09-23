package androidx.compose.foundation.layout;

import androidx.core.view.z1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u1 {
    public final int a;
    public final String b;
    public final androidx.compose.runtime.j1 c = androidx.compose.runtime.t.r(androidx.core.graphics.c.e);
    public final androidx.compose.runtime.j1 d = androidx.compose.runtime.t.r(Boolean.TRUE);

    public a(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int a(androidx.compose.ui.unit.c cVar) {
        return e().b;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int b(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar) {
        return e().c;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int c(androidx.compose.ui.unit.c cVar) {
        return e().d;
    }

    @Override // androidx.compose.foundation.layout.u1
    public final int d(androidx.compose.ui.unit.c cVar, androidx.compose.ui.unit.m mVar) {
        return e().a;
    }

    public final androidx.core.graphics.c e() {
        return (androidx.core.graphics.c) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(z1 z1Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(z1Var.a.i(i2));
            f(z1Var.a.u(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, e().d, ')');
    }
}
