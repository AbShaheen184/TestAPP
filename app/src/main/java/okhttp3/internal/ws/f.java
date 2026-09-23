package okhttp3.internal.ws;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public f(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = num2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && l.a(this.b, fVar.b) && this.c == fVar.c && l.a(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        Integer num2 = this.d;
        return Boolean.hashCode(this.f) + androidx.privacysandbox.ads.adservices.java.internal.a.h((iH + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.a + ", clientMaxWindowBits=" + this.b + ", clientNoContextTakeover=" + this.c + ", serverMaxWindowBits=" + this.d + ", serverNoContextTakeover=" + this.e + ", unknownValues=" + this.f + ')';
    }
}
