package com.app.mlounge.data.remote.model;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbPagedResponse<T> {
    public static final int $stable = 8;
    private final int page;
    private final List<T> results;

    @b("total_pages")
    private final int totalPages;

    @b("total_results")
    private final int totalResults;

    public final int a() {
        return this.page;
    }

    public final List b() {
        return this.results;
    }

    public final int c() {
        return this.totalPages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbPagedResponse)) {
            return false;
        }
        TmdbPagedResponse tmdbPagedResponse = (TmdbPagedResponse) obj;
        return this.page == tmdbPagedResponse.page && l.a(this.results, tmdbPagedResponse.results) && this.totalPages == tmdbPagedResponse.totalPages && this.totalResults == tmdbPagedResponse.totalResults;
    }

    public final int hashCode() {
        return Integer.hashCode(this.totalResults) + a.d(this.totalPages, (this.results.hashCode() + (Integer.hashCode(this.page) * 31)) * 31, 31);
    }

    public final String toString() {
        return "TmdbPagedResponse(page=" + this.page + ", results=" + this.results + ", totalPages=" + this.totalPages + ", totalResults=" + this.totalResults + ")";
    }
}
