package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import androidx.room.b0;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class IptvSearchResponse {
    public static final int $stable = 8;
    private final List<IptvChannel> channels;
    private final String group;
    private final String provider;
    private final String query;
    private final Integer total;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IptvSearchResponse)) {
            return false;
        }
        IptvSearchResponse iptvSearchResponse = (IptvSearchResponse) obj;
        return l.a(this.query, iptvSearchResponse.query) && l.a(this.provider, iptvSearchResponse.provider) && l.a(this.group, iptvSearchResponse.group) && l.a(this.total, iptvSearchResponse.total) && l.a(this.channels, iptvSearchResponse.channels);
    }

    public final int hashCode() {
        String str = this.query;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.provider;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.group;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.total;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<IptvChannel> list = this.channels;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.query;
        String str2 = this.provider;
        String str3 = this.group;
        Integer num = this.total;
        List<IptvChannel> list = this.channels;
        StringBuilder sbQ = j.q("IptvSearchResponse(query=", str, ", provider=", str2, ", group=");
        sbQ.append(str3);
        sbQ.append(", total=");
        sbQ.append(num);
        sbQ.append(", channels=");
        return b0.f(sbQ, list, ")");
    }
}
