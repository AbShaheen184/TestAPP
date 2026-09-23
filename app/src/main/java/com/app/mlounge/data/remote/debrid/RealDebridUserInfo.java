package com.app.mlounge.data.remote.debrid;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import androidx.room.b0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class RealDebridUserInfo {
    public static final int $stable = 0;
    private final String avatar;
    private final String email;
    private final String expiration;
    private final int id;
    private final String locale;
    private final int points;
    private final int premium;
    private final String type;
    private final String username;

    public final String a() {
        return this.email;
    }

    public final String b() {
        return this.expiration;
    }

    public final int c() {
        return this.premium;
    }

    public final String d() {
        return this.username;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealDebridUserInfo)) {
            return false;
        }
        RealDebridUserInfo realDebridUserInfo = (RealDebridUserInfo) obj;
        return this.id == realDebridUserInfo.id && l.a(this.username, realDebridUserInfo.username) && l.a(this.email, realDebridUserInfo.email) && this.points == realDebridUserInfo.points && l.a(this.locale, realDebridUserInfo.locale) && l.a(this.avatar, realDebridUserInfo.avatar) && l.a(this.type, realDebridUserInfo.type) && this.premium == realDebridUserInfo.premium && l.a(this.expiration, realDebridUserInfo.expiration);
    }

    public final int hashCode() {
        int iD = a.d(this.premium, a.g(a.g(a.g(a.d(this.points, a.g(a.g(Integer.hashCode(this.id) * 31, 31, this.username), 31, this.email), 31), 31, this.locale), 31, this.avatar), 31, this.type), 31);
        String str = this.expiration;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.id;
        String str = this.username;
        String str2 = this.email;
        int i2 = this.points;
        String str3 = this.locale;
        String str4 = this.avatar;
        String str5 = this.type;
        int i3 = this.premium;
        String str6 = this.expiration;
        StringBuilder sb = new StringBuilder("RealDebridUserInfo(id=");
        sb.append(i);
        sb.append(", username=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", points=");
        sb.append(i2);
        sb.append(", locale=");
        b0.i(sb, str3, ", avatar=", str4, ", type=");
        sb.append(str5);
        sb.append(", premium=");
        sb.append(i3);
        sb.append(", expiration=");
        return a.u(sb, str6, ")");
    }
}
