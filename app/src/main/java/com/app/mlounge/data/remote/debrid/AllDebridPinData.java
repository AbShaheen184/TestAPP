package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class AllDebridPinData {
    public static final int $stable = 0;
    private final String check;
    private final int expiresIn;
    private final String pin;
    private final String userUrl;

    public AllDebridPinData(String str, int i, String str2, String str3) {
        this.pin = str;
        this.check = str2;
        this.expiresIn = i;
        this.userUrl = str3;
    }

    public final String a() {
        return this.check;
    }

    public final String b() {
        return this.pin;
    }

    public final String c() {
        return this.userUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllDebridPinData)) {
            return false;
        }
        AllDebridPinData allDebridPinData = (AllDebridPinData) obj;
        return l.a(this.pin, allDebridPinData.pin) && l.a(this.check, allDebridPinData.check) && this.expiresIn == allDebridPinData.expiresIn && l.a(this.userUrl, allDebridPinData.userUrl);
    }

    public final int hashCode() {
        return this.userUrl.hashCode() + a.d(this.expiresIn, a.g(this.pin.hashCode() * 31, 31, this.check), 31);
    }

    public final String toString() {
        String str = this.pin;
        String str2 = this.check;
        int i = this.expiresIn;
        String str3 = this.userUrl;
        StringBuilder sbQ = j.q("AllDebridPinData(pin=", str, ", check=", str2, ", expiresIn=");
        sbQ.append(i);
        sbQ.append(", userUrl=");
        sbQ.append(str3);
        sbQ.append(")");
        return sbQ.toString();
    }
}
