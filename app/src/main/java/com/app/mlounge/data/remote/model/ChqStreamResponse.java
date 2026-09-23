package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import androidx.room.b0;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ChqStreamResponse {
    public static final int $stable = 8;
    private final Integer count;
    private final Integer episode;
    private final String imdbId;
    private final String provider;
    private final ChqStreamQuery query;
    private final Integer season;
    private final List<ChqStream> streams;
    private final String tmdbId;
    private final Integer total;
    private final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChqStreamResponse)) {
            return false;
        }
        ChqStreamResponse chqStreamResponse = (ChqStreamResponse) obj;
        return l.a(this.provider, chqStreamResponse.provider) && l.a(this.tmdbId, chqStreamResponse.tmdbId) && l.a(this.imdbId, chqStreamResponse.imdbId) && l.a(this.type, chqStreamResponse.type) && l.a(this.season, chqStreamResponse.season) && l.a(this.episode, chqStreamResponse.episode) && l.a(this.count, chqStreamResponse.count) && l.a(this.total, chqStreamResponse.total) && l.a(this.query, chqStreamResponse.query) && l.a(this.streams, chqStreamResponse.streams);
    }

    public final int hashCode() {
        String str = this.provider;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tmdbId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imdbId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.season;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.episode;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.count;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.total;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        ChqStreamQuery chqStreamQuery = this.query;
        int iHashCode9 = (iHashCode8 + (chqStreamQuery == null ? 0 : chqStreamQuery.hashCode())) * 31;
        List<ChqStream> list = this.streams;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.provider;
        String str2 = this.tmdbId;
        String str3 = this.imdbId;
        String str4 = this.type;
        Integer num = this.season;
        Integer num2 = this.episode;
        Integer num3 = this.count;
        Integer num4 = this.total;
        ChqStreamQuery chqStreamQuery = this.query;
        List<ChqStream> list = this.streams;
        StringBuilder sbQ = j.q("ChqStreamResponse(provider=", str, ", tmdbId=", str2, ", imdbId=");
        b0.i(sbQ, str3, ", type=", str4, ", season=");
        sbQ.append(num);
        sbQ.append(", episode=");
        sbQ.append(num2);
        sbQ.append(", count=");
        sbQ.append(num3);
        sbQ.append(", total=");
        sbQ.append(num4);
        sbQ.append(", query=");
        sbQ.append(chqStreamQuery);
        sbQ.append(", streams=");
        sbQ.append(list);
        sbQ.append(")");
        return sbQ.toString();
    }
}
