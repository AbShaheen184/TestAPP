package com.app.mlounge.data.remote.trakt;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktSyncMovie {
    public static final int $stable = 0;
    private final TraktIds ids;

    public TraktSyncMovie(TraktIds traktIds) {
        this.ids = traktIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraktSyncMovie) && l.a(this.ids, ((TraktSyncMovie) obj).ids);
    }

    public final int hashCode() {
        return this.ids.hashCode();
    }

    public final String toString() {
        return "TraktSyncMovie(ids=" + this.ids + ")";
    }
}
