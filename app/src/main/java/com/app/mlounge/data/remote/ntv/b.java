package com.app.mlounge.data.remote.ntv;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int a;
    public final String b;
    public final String c;
    public final Long d;
    public final byte[] e;

    public b(int i, String str, String str2, Long l, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = l;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && kotlin.jvm.internal.l.a(this.b, bVar.b) && kotlin.jvm.internal.l.a(this.c, bVar.c) && kotlin.jvm.internal.l.a(this.d, bVar.d) && kotlin.jvm.internal.l.a(this.e, bVar.e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        byte[] bArr = this.e;
        return iHashCode4 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.e);
        StringBuilder sb = new StringBuilder("UpstreamResponse(code=");
        sb.append(this.a);
        sb.append(", contentType=");
        sb.append(this.b);
        sb.append(", contentRange=");
        sb.append(this.c);
        sb.append(", contentLength=");
        sb.append(this.d);
        sb.append(", body=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, string, ")");
    }
}
