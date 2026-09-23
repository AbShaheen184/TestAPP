package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import androidx.room.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeMoreInfo {
    public static final int $stable = 8;
    private final String aired;
    private final String duration;
    private final List<String> genres;
    private final String japanese;
    private final String malscore;
    private final String premiered;
    private final List<String> producers;
    private final String status;
    private final String studios;

    public HiAnimeMoreInfo(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, String str7, ArrayList arrayList2) {
        this.japanese = str;
        this.aired = str2;
        this.premiered = str3;
        this.duration = str4;
        this.status = str5;
        this.malscore = str6;
        this.genres = arrayList;
        this.studios = str7;
        this.producers = arrayList2;
    }

    public final String a() {
        return this.aired;
    }

    public final List b() {
        return this.genres;
    }

    public final String c() {
        return this.malscore;
    }

    public final String d() {
        return this.status;
    }

    public final String e() {
        return this.studios;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeMoreInfo)) {
            return false;
        }
        HiAnimeMoreInfo hiAnimeMoreInfo = (HiAnimeMoreInfo) obj;
        return l.a(this.japanese, hiAnimeMoreInfo.japanese) && l.a(this.aired, hiAnimeMoreInfo.aired) && l.a(this.premiered, hiAnimeMoreInfo.premiered) && l.a(this.duration, hiAnimeMoreInfo.duration) && l.a(this.status, hiAnimeMoreInfo.status) && l.a(this.malscore, hiAnimeMoreInfo.malscore) && l.a(this.genres, hiAnimeMoreInfo.genres) && l.a(this.studios, hiAnimeMoreInfo.studios) && l.a(this.producers, hiAnimeMoreInfo.producers);
    }

    public final int hashCode() {
        String str = this.japanese;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aired;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.premiered;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.duration;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.status;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.malscore;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.genres;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.studios;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list2 = this.producers;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.japanese;
        String str2 = this.aired;
        String str3 = this.premiered;
        String str4 = this.duration;
        String str5 = this.status;
        String str6 = this.malscore;
        List<String> list = this.genres;
        String str7 = this.studios;
        List<String> list2 = this.producers;
        StringBuilder sbQ = j.q("HiAnimeMoreInfo(japanese=", str, ", aired=", str2, ", premiered=");
        b0.i(sbQ, str3, ", duration=", str4, ", status=");
        b0.i(sbQ, str5, ", malscore=", str6, ", genres=");
        sbQ.append(list);
        sbQ.append(", studios=");
        sbQ.append(str7);
        sbQ.append(", producers=");
        return b0.f(sbQ, list2, ")");
    }
}
