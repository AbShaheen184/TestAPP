package com.app.mlounge.data.remote.model;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class IptvProviderStats {
    public static final int $stable = 0;
    private final Integer count;
    private final String provider;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IptvProviderStats)) {
            return false;
        }
        IptvProviderStats iptvProviderStats = (IptvProviderStats) obj;
        return l.a(this.provider, iptvProviderStats.provider) && l.a(this.count, iptvProviderStats.count);
    }

    public final int hashCode() {
        String str = this.provider;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.count;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "IptvProviderStats(provider=" + this.provider + ", count=" + this.count + ")";
    }
}
