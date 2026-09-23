package com.app.mlounge.data.remote.trakt;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktSyncNotFound {
    public static final int $stable = 8;
    private final List<TraktSyncMovie> movies;
    private final List<TraktSyncShow> shows;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktSyncNotFound)) {
            return false;
        }
        TraktSyncNotFound traktSyncNotFound = (TraktSyncNotFound) obj;
        return l.a(this.movies, traktSyncNotFound.movies) && l.a(this.shows, traktSyncNotFound.shows);
    }

    public final int hashCode() {
        List<TraktSyncMovie> list = this.movies;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TraktSyncShow> list2 = this.shows;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "TraktSyncNotFound(movies=" + this.movies + ", shows=" + this.shows + ")";
    }
}
