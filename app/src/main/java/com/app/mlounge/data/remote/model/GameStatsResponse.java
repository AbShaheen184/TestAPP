package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class GameStatsResponse {
    public static final int $stable = 8;
    private final Map<String, Integer> decades;
    private final Map<String, Integer> genres;
    private final String platform;
    private final String platformName;
    private final Integer totalGames;

    public final Map a() {
        return this.decades;
    }

    public final Map b() {
        return this.genres;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameStatsResponse)) {
            return false;
        }
        GameStatsResponse gameStatsResponse = (GameStatsResponse) obj;
        return l.a(this.platform, gameStatsResponse.platform) && l.a(this.platformName, gameStatsResponse.platformName) && l.a(this.totalGames, gameStatsResponse.totalGames) && l.a(this.genres, gameStatsResponse.genres) && l.a(this.decades, gameStatsResponse.decades);
    }

    public final int hashCode() {
        String str = this.platform;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platformName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.totalGames;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, Integer> map = this.genres;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Integer> map2 = this.decades;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.platform;
        String str2 = this.platformName;
        Integer num = this.totalGames;
        Map<String, Integer> map = this.genres;
        Map<String, Integer> map2 = this.decades;
        StringBuilder sbQ = j.q("GameStatsResponse(platform=", str, ", platformName=", str2, ", totalGames=");
        sbQ.append(num);
        sbQ.append(", genres=");
        sbQ.append(map);
        sbQ.append(", decades=");
        sbQ.append(map2);
        sbQ.append(")");
        return sbQ.toString();
    }
}
