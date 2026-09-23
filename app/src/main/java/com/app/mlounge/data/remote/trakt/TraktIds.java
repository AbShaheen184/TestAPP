package com.app.mlounge.data.remote.trakt;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktIds {
    public static final int $stable = 0;
    private final Integer tmdb;
    private final Integer trakt = null;
    private final String slug = null;
    private final String imdb = null;
    private final Integer tvdb = null;

    public TraktIds(Integer num) {
        this.tmdb = num;
    }

    public final Integer a() {
        return this.tmdb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktIds)) {
            return false;
        }
        TraktIds traktIds = (TraktIds) obj;
        return l.a(this.trakt, traktIds.trakt) && l.a(this.slug, traktIds.slug) && l.a(this.imdb, traktIds.imdb) && l.a(this.tmdb, traktIds.tmdb) && l.a(this.tvdb, traktIds.tvdb);
    }

    public final int hashCode() {
        Integer num = this.trakt;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.slug;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imdb;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.tmdb;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.tvdb;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "TraktIds(trakt=" + this.trakt + ", slug=" + this.slug + ", imdb=" + this.imdb + ", tmdb=" + this.tmdb + ", tvdb=" + this.tvdb + ")";
    }
}
