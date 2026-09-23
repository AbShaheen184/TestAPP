package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TorBoxAuthResponse {
    public static final int $stable = 0;

    @b("data")
    private final AuthData data;

    @b("detail")
    private final String detail;

    @b("error")
    private final String error;

    @b("success")
    private final boolean success;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class AuthData {
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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthData)) {
                return false;
            }
            AuthData authData = (AuthData) obj;
            return l.a(this.deviceCode, authData.deviceCode) && l.a(this.userCode, authData.userCode) && l.a(this.verificationUrl, authData.verificationUrl) && this.expiresIn == authData.expiresIn && this.interval == authData.interval;
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
            StringBuilder sbQ = j.q("AuthData(deviceCode=", str, ", userCode=", str2, ", verificationUrl=");
            sbQ.append(str3);
            sbQ.append(", expiresIn=");
            sbQ.append(i);
            sbQ.append(", interval=");
            return a.o(i2, ")", sbQ);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TorBoxAuthResponse)) {
            return false;
        }
        TorBoxAuthResponse torBoxAuthResponse = (TorBoxAuthResponse) obj;
        return this.success == torBoxAuthResponse.success && l.a(this.detail, torBoxAuthResponse.detail) && l.a(this.error, torBoxAuthResponse.error) && l.a(this.data, torBoxAuthResponse.data);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.detail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AuthData authData = this.data;
        return iHashCode3 + (authData != null ? authData.hashCode() : 0);
    }

    public final String toString() {
        return "TorBoxAuthResponse(success=" + this.success + ", detail=" + this.detail + ", error=" + this.error + ", data=" + this.data + ")";
    }
}
