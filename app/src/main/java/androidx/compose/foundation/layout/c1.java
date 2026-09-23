package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public float a = 0.0f;
    public boolean b = true;
    public b c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Float.compare(this.a, c1Var.a) == 0 && this.b == c1Var.b && kotlin.jvm.internal.l.a(this.c, c1Var.c);
    }

    public final int hashCode() {
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(Float.hashCode(this.a) * 31, 31, this.b);
        b bVar = this.c;
        return (iH + (bVar == null ? 0 : bVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
