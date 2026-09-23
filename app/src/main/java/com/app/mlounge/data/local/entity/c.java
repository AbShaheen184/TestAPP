package com.app.mlounge.data.local.entity;

import androidx.compose.runtime.j;
import androidx.room.b0;
import com.app.mlounge.emulator.LibretroCore;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Double f;
    public final String g;
    public final String h;
    public final long i;
    public final Long j;
    public final Long k;
    public final String l;
    public final Integer m;
    public final Integer n;
    public final String o;

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, Double d, String str6, String str7, long j, String str8, Integer num, Integer num2, String str9, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & LibretroCore.SCREEN_WIDTH) != 0 ? System.currentTimeMillis() : j, null, null, str8, (i & 4096) != 0 ? null : num, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : str9);
    }

    public static c a(c cVar, String str, String str2, Double d, String str3, String str4) {
        String str5 = cVar.a;
        String str6 = cVar.b;
        String str7 = cVar.c;
        long j = cVar.i;
        Long l = cVar.j;
        Long l2 = cVar.k;
        String str8 = cVar.l;
        Integer num = cVar.m;
        Integer num2 = cVar.n;
        String str9 = cVar.o;
        cVar.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        return new c(str5, str6, str7, str, str2, d, str3, str4, j, l, l2, str8, num, num2, str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.a, cVar.a) && l.a(this.b, cVar.b) && l.a(this.c, cVar.c) && l.a(this.d, cVar.d) && l.a(this.e, cVar.e) && l.a(this.f, cVar.f) && l.a(this.g, cVar.g) && l.a(this.h, cVar.h) && this.i == cVar.i && l.a(this.j, cVar.j) && l.a(this.k, cVar.k) && l.a(this.l, cVar.l) && l.a(this.m, cVar.m) && l.a(this.n, cVar.n) && l.a(this.o, cVar.o);
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
        Long l = this.j;
        int iHashCode5 = (iE + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.k;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.m;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.n;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.o;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = j.q("HistoryEntity(contentId=", this.a, ", contentType=", this.b, ", title=");
        b0.i(sbQ, this.c, ", posterPath=", this.d, ", backdropPath=");
        sbQ.append(this.e);
        sbQ.append(", rating=");
        sbQ.append(this.f);
        sbQ.append(", releaseDate=");
        b0.i(sbQ, this.g, ", overview=", this.h, ", watchedAt=");
        sbQ.append(this.i);
        sbQ.append(", progress=");
        sbQ.append(this.j);
        sbQ.append(", duration=");
        sbQ.append(this.k);
        sbQ.append(", externalId=");
        sbQ.append(this.l);
        sbQ.append(", season=");
        sbQ.append(this.m);
        sbQ.append(", episode=");
        sbQ.append(this.n);
        return j.m(sbQ, ", episodeTitle=", this.o, ")");
    }

    public c(String str, String str2, String str3, String str4, String str5, Double d, String str6, String str7, long j, Long l, Long l2, String str8, Integer num, Integer num2, String str9) {
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
        this.j = l;
        this.k = l2;
        this.l = str8;
        this.m = num;
        this.n = num2;
        this.o = str9;
    }
}
