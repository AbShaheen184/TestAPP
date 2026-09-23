package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicArtistDetail {
    public static final int $stable = 8;
    private final List<MusicAlbum> albums;
    private final String bio;
    private final String image;
    private final String name;

    public MusicArtistDetail(String str, String str2, String str3, List list) {
        str.getClass();
        this.name = str;
        this.image = str2;
        this.bio = str3;
        this.albums = list;
    }

    public final List a() {
        return this.albums;
    }

    public final String b() {
        return this.bio;
    }

    public final String c() {
        return this.image;
    }

    public final String d() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicArtistDetail)) {
            return false;
        }
        MusicArtistDetail musicArtistDetail = (MusicArtistDetail) obj;
        return l.a(this.name, musicArtistDetail.name) && l.a(this.image, musicArtistDetail.image) && l.a(this.bio, musicArtistDetail.bio) && l.a(this.albums, musicArtistDetail.albums);
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.image;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bio;
        return this.albums.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.image;
        String str3 = this.bio;
        List<MusicAlbum> list = this.albums;
        StringBuilder sbQ = j.q("MusicArtistDetail(name=", str, ", image=", str2, ", bio=");
        sbQ.append(str3);
        sbQ.append(", albums=");
        sbQ.append(list);
        sbQ.append(")");
        return sbQ.toString();
    }
}
