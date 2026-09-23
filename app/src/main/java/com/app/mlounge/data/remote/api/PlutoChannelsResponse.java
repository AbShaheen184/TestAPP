package com.app.mlounge.data.remote.api;

import androidx.room.b0;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class PlutoChannelsResponse {
    public static final int $stable = 8;
    private final List<PlutoChannel> channels;
    private final String region;
    private final Integer total;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlutoChannelsResponse)) {
            return false;
        }
        PlutoChannelsResponse plutoChannelsResponse = (PlutoChannelsResponse) obj;
        return l.a(this.region, plutoChannelsResponse.region) && l.a(this.total, plutoChannelsResponse.total) && l.a(this.channels, plutoChannelsResponse.channels);
    }

    public final int hashCode() {
        String str = this.region;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.total;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<PlutoChannel> list = this.channels;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.region;
        Integer num = this.total;
        List<PlutoChannel> list = this.channels;
        StringBuilder sb = new StringBuilder("PlutoChannelsResponse(region=");
        sb.append(str);
        sb.append(", total=");
        sb.append(num);
        sb.append(", channels=");
        return b0.f(sb, list, ")");
    }
}
