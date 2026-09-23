package com.appsalt.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends t1 {
    public final String a;
    public final byte[] b;

    public u0(String str, byte[] bArr) {
        super(str);
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (u0.class.equals(obj != null ? obj.getClass() : null)) {
            return Arrays.equals(this.b, ((u0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chunk(proxyId: ");
        sb.append(this.a);
        sb.append(", data=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.o(this.b.length, " B)", sb);
    }
}
