package com.app.mlounge.data.remote.model;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import androidx.room.b0;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbCrewMember {
    public static final int $stable = 0;
    private final String department;
    private final int id;
    private final String job;
    private final String name;

    @b("profile_path")
    private final String profilePath;

    public final String a() {
        return this.job;
    }

    public final String b() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbCrewMember)) {
            return false;
        }
        TmdbCrewMember tmdbCrewMember = (TmdbCrewMember) obj;
        return this.id == tmdbCrewMember.id && l.a(this.name, tmdbCrewMember.name) && l.a(this.job, tmdbCrewMember.job) && l.a(this.department, tmdbCrewMember.department) && l.a(this.profilePath, tmdbCrewMember.profilePath);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.job;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.department;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profilePath;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.job;
        String str3 = this.department;
        String str4 = this.profilePath;
        StringBuilder sb = new StringBuilder("TmdbCrewMember(id=");
        sb.append(i);
        sb.append(", name=");
        sb.append(str);
        sb.append(", job=");
        b0.i(sb, str2, ", department=", str3, ", profilePath=");
        return a.u(sb, str4, ")");
    }
}
