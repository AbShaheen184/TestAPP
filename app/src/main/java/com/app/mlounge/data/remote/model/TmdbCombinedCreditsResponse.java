package com.app.mlounge.data.remote.model;

import androidx.room.b0;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbCombinedCreditsResponse {
    public static final int $stable = 8;
    private final List<TmdbMultiResult> cast;
    private final List<TmdbMultiResult> crew;
    private final int id;

    public final List a() {
        return this.cast;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbCombinedCreditsResponse)) {
            return false;
        }
        TmdbCombinedCreditsResponse tmdbCombinedCreditsResponse = (TmdbCombinedCreditsResponse) obj;
        return this.id == tmdbCombinedCreditsResponse.id && l.a(this.cast, tmdbCombinedCreditsResponse.cast) && l.a(this.crew, tmdbCombinedCreditsResponse.crew);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        List<TmdbMultiResult> list = this.cast;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<TmdbMultiResult> list2 = this.crew;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        List<TmdbMultiResult> list = this.cast;
        List<TmdbMultiResult> list2 = this.crew;
        StringBuilder sb = new StringBuilder("TmdbCombinedCreditsResponse(id=");
        sb.append(i);
        sb.append(", cast=");
        sb.append(list);
        sb.append(", crew=");
        return b0.f(sb, list2, ")");
    }
}
