package com.app.mlounge.data.remote.trakt;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import androidx.room.b0;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktRefreshTokenRequest {
    public static final int $stable = 0;

    @b("refresh_token")
    private final String refreshToken;

    @b("client_id")
    private final String clientId = TraktManager.CLIENT_ID;

    @b("client_secret")
    private final String clientSecret = TraktManager.CLIENT_SECRET;

    @b("redirect_uri")
    private final String redirectUri = "urn:ietf:wg:oauth:2.0:oob";

    @b("grant_type")
    private final String grantType = "refresh_token";

    public TraktRefreshTokenRequest(String str) {
        this.refreshToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktRefreshTokenRequest)) {
            return false;
        }
        TraktRefreshTokenRequest traktRefreshTokenRequest = (TraktRefreshTokenRequest) obj;
        return l.a(this.refreshToken, traktRefreshTokenRequest.refreshToken) && l.a(this.clientId, traktRefreshTokenRequest.clientId) && l.a(this.clientSecret, traktRefreshTokenRequest.clientSecret) && l.a(this.redirectUri, traktRefreshTokenRequest.redirectUri) && l.a(this.grantType, traktRefreshTokenRequest.grantType);
    }

    public final int hashCode() {
        return this.grantType.hashCode() + a.g(a.g(a.g(this.refreshToken.hashCode() * 31, 31, this.clientId), 31, this.clientSecret), 31, this.redirectUri);
    }

    public final String toString() {
        String str = this.refreshToken;
        String str2 = this.clientId;
        String str3 = this.clientSecret;
        String str4 = this.redirectUri;
        String str5 = this.grantType;
        StringBuilder sbQ = j.q("TraktRefreshTokenRequest(refreshToken=", str, ", clientId=", str2, ", clientSecret=");
        b0.i(sbQ, str3, ", redirectUri=", str4, ", grantType=");
        return a.u(sbQ, str5, ")");
    }
}
