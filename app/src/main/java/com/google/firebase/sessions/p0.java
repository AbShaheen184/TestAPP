package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static final o0 Companion = new o0();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ p0(int i, String str, String str2, int i2, long j) {
        if (15 != (i & 15)) {
            kotlinx.serialization.internal.m0.e(i, 15, n0.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.l.a(this.a, p0Var.a) && kotlin.jvm.internal.l.a(this.b, p0Var.b) && this.c == p0Var.c && this.d == p0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public p0(String str, String str2, int i, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
