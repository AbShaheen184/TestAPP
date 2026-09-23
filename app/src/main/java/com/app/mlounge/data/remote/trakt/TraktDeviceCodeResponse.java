package com.app.mlounge.data.remote.trakt;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktDeviceCodeResponse {
    public static final int $stable = 0;

    @b("device_code")
    private final String deviceCode;

    @b("expires_in")
    private final int expiresIn;

    @b("interval")
    private final int interval;

    @b("user_code")
    private final String userCode;

    @b("verification_url")
    private final String verificationUrl;

    public final String a() {
        return this.deviceCode;
    }

    public final int b() {
        return this.interval;
    }

    public final String c() {
        return this.userCode;
    }

    public final String d() {
        return this.verificationUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktDeviceCodeResponse)) {
            return false;
        }
        TraktDeviceCodeResponse traktDeviceCodeResponse = (TraktDeviceCodeResponse) obj;
        return l.a(this.deviceCode, traktDeviceCodeResponse.deviceCode) && l.a(this.userCode, traktDeviceCodeResponse.userCode) && l.a(this.verificationUrl, traktDeviceCodeResponse.verificationUrl) && this.expiresIn == traktDeviceCodeResponse.expiresIn && this.interval == traktDeviceCodeResponse.interval;
    }

    public final int hashCode() {
        return Integer.hashCode(this.interval) + a.d(this.expiresIn, a.g(a.g(this.deviceCode.hashCode() * 31, 31, this.userCode), 31, this.verificationUrl), 31);
    }

    public final String toString() {
        String str = this.deviceCode;
        String str2 = this.userCode;
        String str3 = this.verificationUrl;
        int i = this.expiresIn;
        int i2 = this.interval;
        StringBuilder sbQ = j.q("TraktDeviceCodeResponse(deviceCode=", str, ", userCode=", str2, ", verificationUrl=");
        sbQ.append(str3);
        sbQ.append(", expiresIn=");
        sbQ.append(i);
        sbQ.append(", interval=");
        return a.o(i2, ")", sbQ);
    }
}
