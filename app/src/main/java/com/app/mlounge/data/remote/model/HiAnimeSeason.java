package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import androidx.room.b0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeSeason {
    public static final int $stable = 0;
    private final String id;
    private final Boolean isCurrent;
    private final String name;
    private final String poster;
    private final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeSeason)) {
            return false;
        }
        HiAnimeSeason hiAnimeSeason = (HiAnimeSeason) obj;
        return l.a(this.id, hiAnimeSeason.id) && l.a(this.name, hiAnimeSeason.name) && l.a(this.title, hiAnimeSeason.title) && l.a(this.poster, hiAnimeSeason.poster) && l.a(this.isCurrent, hiAnimeSeason.isCurrent);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.poster;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isCurrent;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.title;
        String str4 = this.poster;
        Boolean bool = this.isCurrent;
        StringBuilder sbQ = j.q("HiAnimeSeason(id=", str, ", name=", str2, ", title=");
        b0.i(sbQ, str3, ", poster=", str4, ", isCurrent=");
        sbQ.append(bool);
        sbQ.append(")");
        return sbQ.toString();
    }
}
