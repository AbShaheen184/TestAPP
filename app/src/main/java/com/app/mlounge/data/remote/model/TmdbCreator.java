package com.app.mlounge.data.remote.model;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbCreator {
    public static final int $stable = 0;
    private final int id;
    private final String name;

    @b("profile_path")
    private final String profilePath;

    public final String a() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbCreator)) {
            return false;
        }
        TmdbCreator tmdbCreator = (TmdbCreator) obj;
        return this.id == tmdbCreator.id && l.a(this.name, tmdbCreator.name) && l.a(this.profilePath, tmdbCreator.profilePath);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.profilePath;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.profilePath;
        StringBuilder sb = new StringBuilder("TmdbCreator(id=");
        sb.append(i);
        sb.append(", name=");
        sb.append(str);
        sb.append(", profilePath=");
        return a.u(sb, str2, ")");
    }
}
