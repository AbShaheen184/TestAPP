package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicStreamResult {
    public static final int $stable = 0;
    private final String type;
    private final String url;

    public MusicStreamResult(String str, String str2) {
        str.getClass();
        this.url = str;
        this.type = str2;
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
        if (!(obj instanceof MusicStreamResult)) {
            return false;
        }
        MusicStreamResult musicStreamResult = (MusicStreamResult) obj;
        return l.a(this.url, musicStreamResult.url) && l.a(this.type, musicStreamResult.type);
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.url.hashCode() * 31);
    }

    public final String toString() {
        return j.k("MusicStreamResult(url=", this.url, ", type=", this.type, ")");
    }
}
