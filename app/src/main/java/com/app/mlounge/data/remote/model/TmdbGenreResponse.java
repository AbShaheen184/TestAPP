package com.app.mlounge.data.remote.model;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbGenreResponse {
    public static final int $stable = 8;
    private final List<TmdbGenre> genres;

    public final List a() {
        return this.genres;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TmdbGenreResponse) && l.a(this.genres, ((TmdbGenreResponse) obj).genres);
    }

    public final int hashCode() {
        return this.genres.hashCode();
    }

    public final String toString() {
        return "TmdbGenreResponse(genres=" + this.genres + ")";
    }
}
