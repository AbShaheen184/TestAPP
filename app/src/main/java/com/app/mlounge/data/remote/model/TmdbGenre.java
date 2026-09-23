package com.app.mlounge.data.remote.model;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbGenre {
    public static final int $stable = 0;
    private final int id = -1;
    private final String name = "Upcoming";

    public final int a() {
        return this.id;
    }

    public final String b() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbGenre)) {
            return false;
        }
        TmdbGenre tmdbGenre = (TmdbGenre) obj;
        return this.id == tmdbGenre.id && l.a(this.name, tmdbGenre.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return "TmdbGenre(id=" + this.id + ", name=" + this.name + ")";
    }
}
