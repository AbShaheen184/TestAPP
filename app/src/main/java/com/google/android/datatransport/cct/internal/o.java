package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a0 {
    public final r a;

    public o(r rVar) {
        z zVar = z.e;
        this.a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        if (!this.a.equals(((o) ((a0) obj)).a)) {
            return false;
        }
        Object obj2 = z.e;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ z.e.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + z.e + "}";
    }
}
