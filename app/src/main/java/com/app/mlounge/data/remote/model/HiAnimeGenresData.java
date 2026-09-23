package com.app.mlounge.data.remote.model;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeGenresData {
    public static final int $stable = 8;
    private final List<String> genres;
    private final Integer total;

    public HiAnimeGenresData(Integer num, List list) {
        this.total = num;
        this.genres = list;
    }

    public final List a() {
        return this.genres;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeGenresData)) {
            return false;
        }
        HiAnimeGenresData hiAnimeGenresData = (HiAnimeGenresData) obj;
        return l.a(this.total, hiAnimeGenresData.total) && l.a(this.genres, hiAnimeGenresData.genres);
    }

    public final int hashCode() {
        Integer num = this.total;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.genres;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "HiAnimeGenresData(total=" + this.total + ", genres=" + this.genres + ")";
    }
}
