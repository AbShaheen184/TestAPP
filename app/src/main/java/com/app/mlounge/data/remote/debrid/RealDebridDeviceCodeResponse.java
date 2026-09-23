package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class RealDebridDeviceCodeResponse {
    public static final int $stable = 0;

    @b("device_code")
    private final String deviceCode;

    @b("expires_in")
    private final int expiresIn;
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
        if (!(obj instanceof RealDebridDeviceCodeResponse)) {
            return false;
        }
        RealDebridDeviceCodeResponse realDebridDeviceCodeResponse = (RealDebridDeviceCodeResponse) obj;
        return l.a(this.deviceCode, realDebridDeviceCodeResponse.deviceCode) && l.a(this.userCode, realDebridDeviceCodeResponse.userCode) && this.interval == realDebridDeviceCodeResponse.interval && this.expiresIn == realDebridDeviceCodeResponse.expiresIn && l.a(this.verificationUrl, realDebridDeviceCodeResponse.verificationUrl);
    }

    public final int hashCode() {
        return this.verificationUrl.hashCode() + a.d(this.expiresIn, a.d(this.interval, a.g(this.deviceCode.hashCode() * 31, 31, this.userCode), 31), 31);
    }

    public final String toString() {
        String str = this.deviceCode;
        String str2 = this.userCode;
        int i = this.interval;
        int i2 = this.expiresIn;
        String str3 = this.verificationUrl;
        StringBuilder sbQ = j.q("RealDebridDeviceCodeResponse(deviceCode=", str, ", userCode=", str2, ", interval=");
        sbQ.append(i);
        sbQ.append(", expiresIn=");
        sbQ.append(i2);
        sbQ.append(", verificationUrl=");
        return a.u(sbQ, str3, ")");
    }
}
