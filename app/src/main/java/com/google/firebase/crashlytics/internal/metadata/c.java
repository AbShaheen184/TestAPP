package com.google.firebase.crashlytics.internal.metadata;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final String a;
    public final long b;
    public final Map c;

    public c(String str, long j, Map map) {
        map.getClass();
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b == cVar.b && kotlin.jvm.internal.l.a(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.a + ", timestamp=" + this.b + ", additionalCustomKeys=" + this.c + ')';
    }
}
