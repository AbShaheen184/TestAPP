package com.app.mlounge.data.local.entity;

import androidx.compose.runtime.j;
import androidx.room.b0;
import com.app.mlounge.emulator.LibretroCore;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Double f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;

    public /* synthetic */ f(String str, String str2, String str3, String str4, String str5, Double d, String str6, String str7, long j, String str8, String str9, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & LibretroCore.SCREEN_WIDTH) != 0 ? System.currentTimeMillis() : j, str8, (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : str9);
    }

    public static f a(f fVar, String str, String str2, Double d, String str3, String str4) {
        String str5 = fVar.a;
        String str6 = fVar.b;
        String str7 = fVar.c;
        long j = fVar.i;
        String str8 = fVar.j;
        String str9 = fVar.k;
        fVar.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        return new f(str5, str6, str7, str, str2, d, str3, str4, j, str8, str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.a, fVar.a) && l.a(this.b, fVar.b) && l.a(this.c, fVar.c) && l.a(this.d, fVar.d) && l.a(this.e, fVar.e) && l.a(this.f, fVar.f) && l.a(this.g, fVar.g) && l.a(this.h, fVar.h) && this.i == fVar.i && l.a(this.j, fVar.j) && l.a(this.k, fVar.k);
    }

    public final int hashCode() {
        int iG = androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iE = androidx.privacysandbox.ads.adservices.java.internal.a.e((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i);
        String str5 = this.j;
        int iHashCode5 = (iE + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = j.q("WatchlistEntity(contentId=", this.a, ", contentType=", this.b, ", title=");
        b0.i(sbQ, this.c, ", posterPath=", this.d, ", backdropPath=");
        sbQ.append(this.e);
        sbQ.append(", rating=");
        sbQ.append(this.f);
        sbQ.append(", releaseDate=");
        b0.i(sbQ, this.g, ", overview=", this.h, ", addedAt=");
        sbQ.append(this.i);
        sbQ.append(", externalId=");
        sbQ.append(this.j);
        return j.m(sbQ, ", providerData=", this.k, ")");
    }

    public f(String str, String str2, String str3, String str4, String str5, Double d, String str6, String str7, long j, String str8, String str9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = d;
        this.g = str6;
        this.h = str7;
        this.i = j;
        this.j = str8;
        this.k = str9;
    }
}
