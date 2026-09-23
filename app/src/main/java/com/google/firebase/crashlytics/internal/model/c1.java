package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends f2 {
    public final String a;

    public c1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        return this.a.equals(((c1) ((f2) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("Log{content="), this.a, "}");
    }
}
