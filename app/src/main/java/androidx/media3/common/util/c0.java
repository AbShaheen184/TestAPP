package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends IllegalStateException {
    public final int e;
    public final int y;

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(int i, int i2) {
        String strQ;
        if (i == 0) {
            strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("Player stuck buffering and not loading for ", i2, " ms");
        } else if (i == 1) {
            strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("Player stuck buffering with no progress for ", i2, " ms");
        } else if (i == 2) {
            strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("Player stuck playing with no progress for ", i2, " ms");
        } else if (i == 3) {
            strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("Player stuck playing without ending for ", i2, " ms");
        } else {
            if (i != 4) {
                org.mozilla.javascript.c.a();
                throw null;
            }
            strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("Player stuck suppressed for ", i2, " ms");
        }
        super(strQ);
        this.e = i;
        this.y = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.e == c0Var.e && this.y == c0Var.y;
    }

    public final int hashCode() {
        return ((527 + this.e) * 31) + this.y;
    }
}
