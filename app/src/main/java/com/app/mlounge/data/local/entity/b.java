package com.app.mlounge.data.local.entity;

import androidx.compose.runtime.j;
import androidx.room.b0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public b(String str, String str2, String str3, String str4, String str5, long j) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.a, bVar.a) && l.a(this.b, bVar.b) && l.a(this.c, bVar.c) && l.a(this.d, bVar.d) && l.a(this.e, bVar.e) && this.f == bVar.f;
    }

    public final int hashCode() {
        int iG = androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return Long.hashCode(this.f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = j.q("FavouriteGameEntity(slug=", this.a, ", platform=", this.b, ", name=");
        b0.i(sbQ, this.c, ", posterUrl=", this.d, ", year=");
        sbQ.append(this.e);
        sbQ.append(", addedAt=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
