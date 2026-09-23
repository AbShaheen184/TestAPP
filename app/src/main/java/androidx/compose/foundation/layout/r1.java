package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements u1 {
    public final String a;
    public final androidx.compose.runtime.j1 b;

    public r1(p0 p0Var, String str) {
        this.a = str;
        this.b = androidx.compose.runtime.t.r(p0Var);
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

    public final p0 e() {
        return (p0) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            return kotlin.jvm.internal.l.a(e(), ((r1) obj).e());
        }
        return false;
    }

    public final void f(p0 p0Var) {
        this.b.setValue(p0Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, e().d, ')');
    }
}
