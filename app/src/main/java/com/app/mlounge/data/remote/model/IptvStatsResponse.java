package com.app.mlounge.data.remote.model;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class IptvStatsResponse {
    public static final int $stable = 8;
    private final List<IptvProviderStats> providers;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IptvStatsResponse) && l.a(this.providers, ((IptvStatsResponse) obj).providers);
    }

    public final int hashCode() {
        List<IptvProviderStats> list = this.providers;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "IptvStatsResponse(providers=" + this.providers + ")";
    }
}
