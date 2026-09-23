package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbContentRating {
    public static final int $stable = 0;

    @b("iso_3166_1")
    private final String countryCode;
    private final String rating;

    public final String a() {
        return this.countryCode;
    }

    public final String b() {
        return this.rating;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbContentRating)) {
            return false;
        }
        TmdbContentRating tmdbContentRating = (TmdbContentRating) obj;
        return l.a(this.countryCode, tmdbContentRating.countryCode) && l.a(this.rating, tmdbContentRating.rating);
    }

    public final int hashCode() {
        int iHashCode = this.countryCode.hashCode() * 31;
        String str = this.rating;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return j.k("TmdbContentRating(countryCode=", this.countryCode, ", rating=", this.rating, ")");
    }
}
