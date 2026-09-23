package com.app.mlounge.data.remote.model;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeServer {
    public static final int $stable = 0;
    private final Integer serverId;
    private final String serverName;

    public HiAnimeServer(Integer num, String str) {
        this.serverId = num;
        this.serverName = str;
    }

    public final String a() {
        return this.serverName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeServer)) {
            return false;
        }
        HiAnimeServer hiAnimeServer = (HiAnimeServer) obj;
        return l.a(this.serverId, hiAnimeServer.serverId) && l.a(this.serverName, hiAnimeServer.serverName);
    }

    public final int hashCode() {
        Integer num = this.serverId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.serverName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "HiAnimeServer(serverId=" + this.serverId + ", serverName=" + this.serverName + ")";
    }
}
