package com.google.android.datatransport.runtime;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final String a;
    public final byte[] b;
    public final com.google.android.datatransport.d c;

    public k(String str, byte[] bArr, com.google.android.datatransport.d dVar) {
        this.a = str;
        this.b = bArr;
        this.c = dVar;
    }

    public static j a() {
        j jVar = new j(0, false);
        jVar.A = com.google.android.datatransport.d.e;
        return jVar;
    }

    public final k b(com.google.android.datatransport.d dVar) {
        j jVarA = a();
        jVarA.v(this.a);
        if (dVar == null) {
            com.google.firebase.platforminfo.b.h("Null priority");
            return null;
        }
        jVarA.A = dVar;
        jVarA.z = this.b;
        return jVarA.n();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.a.equals(kVar.a) && Arrays.equals(this.b, kVar.b) && this.c.equals(kVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, strEncodeToString, ")");
    }
}
