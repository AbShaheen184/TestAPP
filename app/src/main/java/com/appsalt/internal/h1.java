package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public final int a;
    public final int b;

    public h1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.a == h1Var.a && this.b == h1Var.b;
    }

    public final int hashCode() {
        return androidx.constraintlayout.core.g.e(this.b) + (androidx.constraintlayout.core.g.e(this.a) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Action(protocol=");
        int i = this.a;
        if (i != 1) {
            str = i != 2 ? "null" : "QUIC";
        } else {
            str = "WS";
        }
        sb.append(str);
        sb.append(", type=");
        int i2 = this.b;
        if (i2 != 1) {
            str2 = i2 != 2 ? "null" : "SWITCH";
        } else {
            str2 = "RECONNECT";
        }
        sb.append(str2);
        sb.append(')');
        return sb.toString();
    }
}
