package com.app.mlounge.data.remote.ntv;

import androidx.room.b0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public e(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.l.a(this.a, eVar.a) && kotlin.jvm.internal.l.a(this.b, eVar.b) && this.c.equals(eVar.c) && this.d.equals(eVar.d) && kotlin.jvm.internal.l.a(this.e, eVar.e);
    }

    public final int hashCode() {
        int iG = androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = androidx.compose.runtime.j.q("NtvUriParts(channelName=", this.a, ", channelCode=", this.b, ", server=");
        b0.i(sbQ, this.c, ", channelId=", this.d, ", rawUrl=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sbQ, this.e, ")");
    }
}
