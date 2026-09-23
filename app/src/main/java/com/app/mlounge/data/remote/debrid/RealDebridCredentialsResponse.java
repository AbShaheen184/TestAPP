package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class RealDebridCredentialsResponse {
    public static final int $stable = 0;

    @b("client_id")
    private final String clientId = null;

    @b("client_secret")
    private final String clientSecret = null;

    @b("error")
    private final String error = null;

    public final String a() {
        return this.clientId;
    }

    public final String b() {
        return this.clientSecret;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealDebridCredentialsResponse)) {
            return false;
        }
        RealDebridCredentialsResponse realDebridCredentialsResponse = (RealDebridCredentialsResponse) obj;
        return l.a(this.clientId, realDebridCredentialsResponse.clientId) && l.a(this.clientSecret, realDebridCredentialsResponse.clientSecret) && l.a(this.error, realDebridCredentialsResponse.error);
    }

    public final int hashCode() {
        String str = this.clientId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientSecret;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.clientId;
        String str2 = this.clientSecret;
        return a.u(j.q("RealDebridCredentialsResponse(clientId=", str, ", clientSecret=", str2, ", error="), this.error, ")");
    }
}
