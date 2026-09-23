package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final com.google.android.material.internal.k f;

    public l1(String str, String str2, String str3, String str4, int i, com.google.android.material.internal.k kVar) {
        if (str == null) {
            com.google.firebase.platforminfo.b.h("Null appIdentifier");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            com.google.firebase.platforminfo.b.h("Null versionCode");
            throw null;
        }
        this.b = str2;
        if (str3 == null) {
            com.google.firebase.platforminfo.b.h("Null versionName");
            throw null;
        }
        this.c = str3;
        if (str4 == null) {
            com.google.firebase.platforminfo.b.h("Null installUuid");
            throw null;
        }
        this.d = str4;
        this.e = i;
        this.f = kVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.a.equals(l1Var.a) && this.b.equals(l1Var.b) && this.c.equals(l1Var.c) && this.d.equals(l1Var.d) && this.e == l1Var.e && this.f.equals(l1Var.f);
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
