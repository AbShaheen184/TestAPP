package com.app.mlounge.data.remote.trakt;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktShow {
    public static final int $stable = 0;
    private final TraktIds ids;
    private final String title;
    private final Integer year;

    public final TraktIds a() {
        return this.ids;
    }

    public final String b() {
        return this.title;
    }

    public final Integer c() {
        return this.year;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktShow)) {
            return false;
        }
        TraktShow traktShow = (TraktShow) obj;
        return l.a(this.title, traktShow.title) && l.a(this.year, traktShow.year) && l.a(this.ids, traktShow.ids);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.year;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        TraktIds traktIds = this.ids;
        return iHashCode2 + (traktIds != null ? traktIds.hashCode() : 0);
    }

    public final String toString() {
        return "TraktShow(title=" + this.title + ", year=" + this.year + ", ids=" + this.ids + ")";
    }
}
