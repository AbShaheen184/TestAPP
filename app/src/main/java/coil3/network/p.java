package coil3.network;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final String a;
    public final String b;
    public final o c;
    public final coil3.i d;

    public p(String str, String str2, o oVar, coil3.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && kotlin.jvm.internal.l.a(this.b, pVar.b) && this.c.equals(pVar.c) && kotlin.jvm.internal.l.a(this.d, pVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.a.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b)) * 961);
    }

    public final String toString() {
        StringBuilder sbQ = androidx.compose.runtime.j.q("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        sbQ.append(this.c);
        sbQ.append(", body=null, extras=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
