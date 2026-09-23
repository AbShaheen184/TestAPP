package coil3.network;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final int a;
    public final long b;
    public final long c;
    public final o d;
    public final r e;
    public final Object f;

    public q(int i, long j, long j2, o oVar, r rVar, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = oVar;
        this.e = rVar;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.b == qVar.b && this.c == qVar.c && kotlin.jvm.internal.l.a(this.d, qVar.d) && kotlin.jvm.internal.l.a(this.e, qVar.e) && kotlin.jvm.internal.l.a(this.f, qVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.a.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a * 31, 31, this.b), 31, this.c)) * 31;
        r rVar = this.e;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.e.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.a + ", requestMillis=" + this.b + ", responseMillis=" + this.c + ", headers=" + this.d + ", body=" + this.e + ", delegate=" + this.f + ")";
    }
}
