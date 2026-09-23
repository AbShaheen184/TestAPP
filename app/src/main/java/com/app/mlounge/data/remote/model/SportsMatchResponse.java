package com.app.mlounge.data.remote.model;

import androidx.room.b0;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class SportsMatchResponse {
    public static final int $stable = 8;
    private final List<SportsMatch> all;
    private final List<SportsMatch> live;
    private final Boolean success;

    public final List a() {
        return this.all;
    }

    public final List b() {
        return this.live;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportsMatchResponse)) {
            return false;
        }
        SportsMatchResponse sportsMatchResponse = (SportsMatchResponse) obj;
        return l.a(this.success, sportsMatchResponse.success) && l.a(this.live, sportsMatchResponse.live) && l.a(this.all, sportsMatchResponse.all);
    }

    public final int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<SportsMatch> list = this.live;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SportsMatch> list2 = this.all;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.success;
        List<SportsMatch> list = this.live;
        List<SportsMatch> list2 = this.all;
        StringBuilder sb = new StringBuilder("SportsMatchResponse(success=");
        sb.append(bool);
        sb.append(", live=");
        sb.append(list);
        sb.append(", all=");
        return b0.f(sb, list2, ")");
    }
}
