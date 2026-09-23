package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicArtist {
    public static final int $stable = 0;
    private final String image;
    private final String name;
    private final String url;

    public MusicArtist(String str, String str2) {
        str.getClass();
        this.name = str;
        this.url = str2;
        this.image = null;
    }

    public final String a() {
        return this.image;
    }

    public final String b() {
        return this.name;
    }

    public final String c() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicArtist)) {
            return false;
        }
        MusicArtist musicArtist = (MusicArtist) obj;
        return l.a(this.name, musicArtist.name) && l.a(this.url, musicArtist.url) && l.a(this.image, musicArtist.image);
    }

    public final int hashCode() {
        int iG = a.g(this.name.hashCode() * 31, 31, this.url);
        String str = this.image;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.url;
        return a.u(j.q("MusicArtist(name=", str, ", url=", str2, ", image="), this.image, ")");
    }
}
