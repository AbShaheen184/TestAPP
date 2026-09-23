package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class AllDebridUserInfo {
    public static final int $stable = 0;

    @b("email")
    private final String email;

    @b("isPremium")
    private final boolean isPremium;

    @b("isSubscribed")
    private final boolean isSubscribed;

    @b("isTrial")
    private final boolean isTrial;

    @b("premiumUntil")
    private final long premiumUntil;

    @b("username")
    private final String username;

    public final String a() {
        return this.email;
    }

    public final String b() {
        return this.username;
    }

    public final boolean c() {
        return this.isPremium;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllDebridUserInfo)) {
            return false;
        }
        AllDebridUserInfo allDebridUserInfo = (AllDebridUserInfo) obj;
        return l.a(this.username, allDebridUserInfo.username) && l.a(this.email, allDebridUserInfo.email) && this.isPremium == allDebridUserInfo.isPremium && this.isSubscribed == allDebridUserInfo.isSubscribed && this.isTrial == allDebridUserInfo.isTrial && this.premiumUntil == allDebridUserInfo.premiumUntil;
    }

    public final int hashCode() {
        return Long.hashCode(this.premiumUntil) + a.h(a.h(a.h(a.g(this.username.hashCode() * 31, 31, this.email), 31, this.isPremium), 31, this.isSubscribed), 31, this.isTrial);
    }

    public final String toString() {
        String str = this.username;
        String str2 = this.email;
        boolean z = this.isPremium;
        boolean z2 = this.isSubscribed;
        boolean z3 = this.isTrial;
        long j = this.premiumUntil;
        StringBuilder sbQ = j.q("AllDebridUserInfo(username=", str, ", email=", str2, ", isPremium=");
        sbQ.append(z);
        sbQ.append(", isSubscribed=");
        sbQ.append(z2);
        sbQ.append(", isTrial=");
        sbQ.append(z3);
        sbQ.append(", premiumUntil=");
        sbQ.append(j);
        sbQ.append(")");
        return sbQ.toString();
    }
}
