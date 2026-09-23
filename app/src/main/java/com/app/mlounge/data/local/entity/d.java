package com.app.mlounge.data.local.entity;

import androidx.compose.runtime.j;
import androidx.room.b0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public d(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && l.a(this.b, dVar.b) && l.a(this.c, dVar.c) && l.a(this.d, dVar.d) && l.a(this.e, dVar.e) && l.a(this.f, dVar.f) && l.a(this.g, dVar.g);
    }

    public final int hashCode() {
        int iG = androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iG2 = androidx.privacysandbox.ads.adservices.java.internal.a.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        return iG2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IptvChannelEntity(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        b0.i(sb, ", url=", this.c, ", logo=", this.d);
        b0.i(sb, ", groupName=", this.e, ", provider=", this.f);
        return j.m(sb, ", tvgId=", this.g, ")");
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, String str5, String str6) {
        this(0L, str, str2, str3, str4, str5, str6);
    }
}
