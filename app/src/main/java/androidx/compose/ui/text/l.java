package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {
    public final String a;
    public final k0 b;

    public l(String str, k0 k0Var) {
        this.a = str;
        this.b = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.a) && kotlin.jvm.internal.l.a(this.b, lVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        k0 k0Var = this.b;
        return (iHashCode + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return androidx.compose.runtime.j.l(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }
}
