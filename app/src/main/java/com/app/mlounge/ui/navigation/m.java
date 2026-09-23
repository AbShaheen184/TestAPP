package com.app.mlounge.ui.navigation;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends w {
    public static final m g = new m("music_album_detail/{albumUrl}", "Album", androidx.work.impl.v.x(), null, 40);

    public final String a(String str) {
        str.getClass();
        return androidx.compose.runtime.j.i("music_album_detail/", Uri.encode(str));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m);
    }

    public final int hashCode() {
        return -184136644;
    }

    public final String toString() {
        return "MusicAlbumDetail";
    }
}
