package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeSource {
    public static final int $stable = 0;
    private final String type;
    private final String url;

    public HiAnimeSource(String str) {
        str.getClass();
        this.url = str;
        this.type = "hls";
    }

    public final String a() {
        return this.type;
    }

    public final String b() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeSource)) {
            return false;
        }
        HiAnimeSource hiAnimeSource = (HiAnimeSource) obj;
        return l.a(this.url, hiAnimeSource.url) && l.a(this.type, hiAnimeSource.type);
    }

    public final int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.type;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return j.k("HiAnimeSource(url=", this.url, ", type=", this.type, ")");
    }
}
