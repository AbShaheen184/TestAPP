package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 implements k3 {
    public final int a;
    public final Integer b;
    public final int c;
    public final Integer d;
    public final int e;
    public final int f;
    public final int g;

    public y2(int i, Integer num, int i2, Integer num2, int i3, int i4, int i5) {
        this.a = i;
        this.b = num;
        this.c = i2;
        this.d = num2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return this.a == y2Var.a && kotlin.jvm.internal.l.a(this.b, y2Var.b) && this.c == y2Var.c && kotlin.jvm.internal.l.a(this.d, y2Var.d) && this.e == y2Var.e && this.f == y2Var.f && this.g == y2Var.g;
    }

    public final int hashCode() {
        int i = this.a;
        int iE = (i == 0 ? 0 : androidx.constraintlayout.core.g.e(i)) * 31;
        Integer num = this.b;
        int iE2 = (androidx.constraintlayout.core.g.e(this.c) + ((iE + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Integer num2 = this.d;
        return androidx.constraintlayout.core.g.e(this.g) + ((androidx.constraintlayout.core.g.e(this.f) + ((androidx.constraintlayout.core.g.e(this.e) + ((iE2 + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Pong(networkType=");
        int i = this.a;
        if (i == 1) {
            str = "NETWORK_TYPE_UNSPECIFIED";
        } else if (i == 2) {
            str = "NETWORK_TYPE_MOBILE";
        } else if (i != 3) {
            str = i != 4 ? "null" : "NETWORK_TYPE_ETHERNET";
        } else {
            str = "NETWORK_TYPE_WIFI";
        }
        sb.append(str);
        sb.append(", signalStrength=");
        sb.append(this.b);
        sb.append(", isPlugged=");
        sb.append(androidx.room.b0.l(this.c));
        sb.append(", batteryLevel=");
        sb.append(this.d);
        sb.append(", isRoaming=");
        sb.append(androidx.room.b0.l(this.e));
        sb.append(", isIdle=");
        sb.append(androidx.room.b0.l(this.f));
        sb.append(", isMetered=");
        sb.append(androidx.room.b0.l(this.g));
        sb.append(')');
        return sb.toString();
    }
}
