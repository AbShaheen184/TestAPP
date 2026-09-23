package com.google.android.datatransport;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final String a;

    public c(String str) {
        if (str != null) {
            this.a = str;
        } else {
            com.google.firebase.platforminfo.b.h("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.a.equals(((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
