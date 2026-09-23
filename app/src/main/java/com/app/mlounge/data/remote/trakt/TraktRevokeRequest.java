package com.app.mlounge.data.remote.trakt;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktRevokeRequest {
    public static final int $stable = 0;

    @b("client_id")
    private final String clientId;

    @b("client_secret")
    private final String clientSecret;

    @b("token")
    private final String token;

    public TraktRevokeRequest(String str) {
        str.getClass();
        this.token = str;
        this.clientId = TraktManager.CLIENT_ID;
        this.clientSecret = TraktManager.CLIENT_SECRET;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktRevokeRequest)) {
            return false;
        }
        TraktRevokeRequest traktRevokeRequest = (TraktRevokeRequest) obj;
        return l.a(this.token, traktRevokeRequest.token) && l.a(this.clientId, traktRevokeRequest.clientId) && l.a(this.clientSecret, traktRevokeRequest.clientSecret);
    }

    public final int hashCode() {
        return this.clientSecret.hashCode() + a.g(this.token.hashCode() * 31, 31, this.clientId);
    }

    public final String toString() {
        String str = this.token;
        String str2 = this.clientId;
        return a.u(j.q("TraktRevokeRequest(token=", str, ", clientId=", str2, ", clientSecret="), this.clientSecret, ")");
    }
}
