package com.app.mlounge.data.remote.trakt;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktSyncEpisode {
    public static final int $stable = 0;
    private final int episode;
    private final TraktIds ids;
    private final int season;

    public TraktSyncEpisode(int i, int i2, TraktIds traktIds) {
        this.season = i;
        this.episode = i2;
        this.ids = traktIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktSyncEpisode)) {
            return false;
        }
        TraktSyncEpisode traktSyncEpisode = (TraktSyncEpisode) obj;
        return this.season == traktSyncEpisode.season && this.episode == traktSyncEpisode.episode && l.a(this.ids, traktSyncEpisode.ids);
    }

    public final int hashCode() {
        return this.ids.hashCode() + a.d(this.episode, Integer.hashCode(this.season) * 31, 31);
    }

    public final String toString() {
        int i = this.season;
        int i2 = this.episode;
        TraktIds traktIds = this.ids;
        StringBuilder sbW = a.w("TraktSyncEpisode(season=", ", episode=", i, ", ids=", i2);
        sbW.append(traktIds);
        sbW.append(")");
        return sbW.toString();
    }
}
