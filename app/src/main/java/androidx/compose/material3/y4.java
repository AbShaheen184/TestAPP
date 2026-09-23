package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 implements androidx.compose.foundation.e1 {
    public final boolean a;
    public final float b;
    public final long c;

    public y4(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // androidx.compose.foundation.e1
    public final androidx.compose.ui.node.j a(androidx.compose.foundation.interaction.j jVar) {
        return new g1(jVar, this.a, this.b, new f1(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        if (this.a == y4Var.a && androidx.compose.ui.unit.f.d(this.b, y4Var.b)) {
            return androidx.compose.ui.graphics.t.c(this.c, y4Var.c);
        }
        return false;
    }

    @Override // androidx.compose.foundation.e1
    public final int hashCode() {
        int iC = androidx.privacysandbox.ads.adservices.java.internal.a.c(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.c) + iC;
    }
}
