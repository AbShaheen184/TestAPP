package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbReleaseDate {
    public static final int $stable = 0;
    private final String certification;

    @b("release_date")
    private final String releaseDate;
    private final Integer type;

    public final String a() {
        return this.certification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbReleaseDate)) {
            return false;
        }
        TmdbReleaseDate tmdbReleaseDate = (TmdbReleaseDate) obj;
        return l.a(this.certification, tmdbReleaseDate.certification) && l.a(this.releaseDate, tmdbReleaseDate.releaseDate) && l.a(this.type, tmdbReleaseDate.type);
    }

    public final int hashCode() {
        String str = this.certification;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.releaseDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.certification;
        String str2 = this.releaseDate;
        Integer num = this.type;
        StringBuilder sbQ = j.q("TmdbReleaseDate(certification=", str, ", releaseDate=", str2, ", type=");
        sbQ.append(num);
        sbQ.append(")");
        return sbQ.toString();
    }
}
