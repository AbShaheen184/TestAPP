package com.google.android.datatransport.runtime;

import androidx.compose.ui.node.a1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final String a;
    public final Integer b;
    public final m c;
    public final long d;
    public final long e;
    public final Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public i(String str, Integer num, m mVar, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = mVar;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final a1 c() {
        a1 a1Var = new a1();
        String str = this.a;
        if (str == null) {
            com.google.firebase.platforminfo.b.h("Null transportName");
            return null;
        }
        a1Var.b = str;
        a1Var.c = this.b;
        a1Var.h = this.g;
        a1Var.i = this.h;
        a1Var.j = this.i;
        a1Var.k = this.j;
        m mVar = this.c;
        if (mVar == null) {
            com.google.firebase.platforminfo.b.h("Null encodedPayload");
            return null;
        }
        a1Var.d = mVar;
        a1Var.e = Long.valueOf(this.d);
        a1Var.f = Long.valueOf(this.e);
        a1Var.g = new HashMap(this.f);
        return a1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.a.equals(iVar.a)) {
                Integer num = iVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(iVar.c) && this.d == iVar.d && this.e == iVar.e && this.f.equals(iVar.f)) {
                        Integer num3 = iVar.g;
                        Integer num4 = this.g;
                        if (num4 != null ? num4.equals(num3) : num3 == null) {
                            String str = iVar.h;
                            String str2 = this.h;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (Arrays.equals(this.i, iVar.i) && Arrays.equals(this.j, iVar.j)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
