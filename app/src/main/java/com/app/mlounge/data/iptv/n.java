package com.app.mlounge.data.iptv;

import kotlin.collections.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final int $stable = 0;

    @com.google.gson.annotations.b("category")
    private final String category;

    @com.google.gson.annotations.b("channelId")
    private final String channelId;

    @com.google.gson.annotations.b("description")
    private final String description;

    @com.google.gson.annotations.b("endTimeMs")
    private final long endTimeMs;

    @com.google.gson.annotations.b("startTimeMs")
    private final long startTimeMs;

    @com.google.gson.annotations.b("title")
    private final String title;

    public n(String str, String str2, String str3, long j, long j2, String str4) {
        str2.getClass();
        this.channelId = str;
        this.title = str2;
        this.description = str3;
        this.startTimeMs = j;
        this.endTimeMs = j2;
        this.category = str4;
    }

    public final long a() {
        return this.endTimeMs;
    }

    public final float b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.startTimeMs;
        if (jCurrentTimeMillis < j) {
            return 0.0f;
        }
        long j2 = this.endTimeMs;
        if (jCurrentTimeMillis >= j2) {
            return 1.0f;
        }
        return i0.c((jCurrentTimeMillis - j) / (j2 - j), 0.0f, 1.0f);
    }

    public final long c() {
        return this.startTimeMs;
    }

    public final String d() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.l.a(this.channelId, nVar.channelId) && kotlin.jvm.internal.l.a(this.title, nVar.title) && kotlin.jvm.internal.l.a(this.description, nVar.description) && this.startTimeMs == nVar.startTimeMs && this.endTimeMs == nVar.endTimeMs && kotlin.jvm.internal.l.a(this.category, nVar.category);
    }

    public final int hashCode() {
        int iG = androidx.privacysandbox.ads.adservices.java.internal.a.g(this.channelId.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iE = androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.startTimeMs), 31, this.endTimeMs);
        String str2 = this.category;
        return iE + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.channelId;
        String str2 = this.title;
        String str3 = this.description;
        long j = this.startTimeMs;
        long j2 = this.endTimeMs;
        String str4 = this.category;
        StringBuilder sbQ = androidx.compose.runtime.j.q("EpgProgram(channelId=", str, ", title=", str2, ", description=");
        sbQ.append(str3);
        sbQ.append(", startTimeMs=");
        sbQ.append(j);
        sbQ.append(", endTimeMs=");
        sbQ.append(j2);
        sbQ.append(", category=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sbQ, str4, ")");
    }
}
