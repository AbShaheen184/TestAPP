package com.appsalt.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends t1 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;
    public final int e;

    public m1(String str, byte[] bArr, int i, int i2, int i3) {
        super(str);
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return kotlin.jvm.internal.l.a(this.a, m1Var.a) && kotlin.jvm.internal.l.a(this.b, m1Var.b) && this.c == m1Var.c && this.d == m1Var.d && this.e == m1Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.d, (androidx.constraintlayout.core.g.e(this.c) + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connected(proxyId=");
        sb.append(this.a);
        sb.append(", ip=");
        sb.append(Arrays.toString(this.b));
        sb.append(", resolveType=");
        sb.append(androidx.room.b0.k(this.c));
        sb.append(", lookupTime=");
        sb.append(this.d);
        sb.append(", connectTime=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.e, ')');
    }
}
