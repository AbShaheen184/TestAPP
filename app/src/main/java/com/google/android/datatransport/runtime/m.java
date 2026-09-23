package com.google.android.datatransport.runtime;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final com.google.android.datatransport.c a;
    public final byte[] b;

    public m(com.google.android.datatransport.c cVar, byte[] bArr) {
        if (cVar == null) {
            com.google.firebase.platforminfo.b.h("encoding is null");
            throw null;
        }
        if (bArr == null) {
            com.google.firebase.platforminfo.b.h("bytes is null");
            throw null;
        }
        this.a = cVar;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a.equals(mVar.a)) {
            return Arrays.equals(this.b, mVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
