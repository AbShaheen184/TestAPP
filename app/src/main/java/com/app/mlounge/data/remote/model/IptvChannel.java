package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import androidx.room.b0;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class IptvChannel {
    public static final int $stable = 0;

    @b("group")
    private final String group;

    @b("logo")
    private final String logo;

    @b("name")
    private final String name;

    @b("provider")
    private final String provider;

    @b("tvgId")
    private final String tvgId;

    @b("url")
    private final String url;

    public IptvChannel(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.url = str2;
        this.logo = str3;
        this.group = str4;
        this.provider = str5;
        this.tvgId = str6;
    }

    public final String a() {
        return this.group;
    }

    public final String b() {
        return this.logo;
    }

    public final String c() {
        return this.name;
    }

    public final String d() {
        return this.provider;
    }

    public final String e() {
        return this.tvgId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IptvChannel)) {
            return false;
        }
        IptvChannel iptvChannel = (IptvChannel) obj;
        return l.a(this.name, iptvChannel.name) && l.a(this.url, iptvChannel.url) && l.a(this.logo, iptvChannel.logo) && l.a(this.group, iptvChannel.group) && l.a(this.provider, iptvChannel.provider) && l.a(this.tvgId, iptvChannel.tvgId);
    }

    public final String f() {
        return this.url;
    }

    public final int hashCode() {
        int iG = a.g(this.name.hashCode() * 31, 31, this.url);
        String str = this.logo;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.group;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.provider;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tvgId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.url;
        String str3 = this.logo;
        String str4 = this.group;
        String str5 = this.provider;
        String str6 = this.tvgId;
        StringBuilder sbQ = j.q("IptvChannel(name=", str, ", url=", str2, ", logo=");
        b0.i(sbQ, str3, ", group=", str4, ", provider=");
        return j.n(sbQ, str5, ", tvgId=", str6, ")");
    }
}
