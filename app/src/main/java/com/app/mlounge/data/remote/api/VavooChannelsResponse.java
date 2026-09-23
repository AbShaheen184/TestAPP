package com.app.mlounge.data.remote.api;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class VavooChannelsResponse {
    public static final int $stable = 8;
    private final List<VavooChannel> channels;
    private final Integer total;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VavooChannelsResponse)) {
            return false;
        }
        VavooChannelsResponse vavooChannelsResponse = (VavooChannelsResponse) obj;
        return l.a(this.total, vavooChannelsResponse.total) && l.a(this.channels, vavooChannelsResponse.channels);
    }

    public final int hashCode() {
        Integer num = this.total;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<VavooChannel> list = this.channels;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "VavooChannelsResponse(total=" + this.total + ", channels=" + this.channels + ")";
    }
}
