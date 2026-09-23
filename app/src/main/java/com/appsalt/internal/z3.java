package com.appsalt.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 implements d2 {
    public final String a;
    public final byte[] b;

    public z3(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return this.a.equals(z3Var.a) && kotlin.jvm.internal.l.a(this.b, z3Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chunk(id=");
        sb.append(this.a);
        sb.append(", payload=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.o(this.b.length, " B)", sb);
    }
}
