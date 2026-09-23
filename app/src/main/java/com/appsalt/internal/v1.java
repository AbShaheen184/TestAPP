package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements d2 {
    public final String a;
    public final byte b;
    public final byte c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final Boolean g;
    public final boolean h;

    public v1(String str, byte b, byte b2, boolean z, boolean z2, int i, Boolean bool, boolean z3) {
        this.a = str;
        this.b = b;
        this.c = b2;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = bool;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.a.equals(v1Var.a) && this.b == v1Var.b && this.c == v1Var.c && this.d == v1Var.d && this.e == v1Var.e && this.f == v1Var.f && kotlin.jvm.internal.l.a(this.g, v1Var.g) && this.h == v1Var.h;
    }

    public final int hashCode() {
        int iD = androidx.privacysandbox.ads.adservices.java.internal.a.d(this.f, androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h((Byte.hashCode(this.c) + ((Byte.hashCode((byte) 0) + ((Byte.hashCode(this.b) + ((Byte.hashCode((byte) 0) + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31);
        Boolean bool = this.g;
        return Boolean.hashCode(this.h) + ((iD + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Pong(id=" + this.a + ", os=0, networkType=" + ((int) this.b) + ", telephonyNetworkType=0, signalStrength=" + ((int) this.c) + ", isPluggedIn=" + this.d + ", isRoaming=" + this.e + ", batteryLevel=" + this.f + ", isIdle=" + this.g + ", isMetered=" + this.h + ')';
    }
}
