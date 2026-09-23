package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.trakt.TraktDeviceCodeResponse;
import com.app.mlounge.data.remote.trakt.TraktUserSettings;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {
    public final boolean a;
    public final boolean b;
    public final TraktUserSettings c;
    public final TraktDeviceCodeResponse d;
    public final boolean e;
    public final String f;

    public /* synthetic */ y1(TraktUserSettings traktUserSettings, int i) {
        this((i & 1) == 0, false, (i & 4) != 0 ? null : traktUserSettings, null, false, null);
    }

    public static y1 a(y1 y1Var, boolean z, TraktUserSettings traktUserSettings, TraktDeviceCodeResponse traktDeviceCodeResponse, boolean z2, String str, int i) {
        boolean z3 = (i & 1) != 0 ? y1Var.a : true;
        if ((i & 2) != 0) {
            z = y1Var.b;
        }
        if ((i & 4) != 0) {
            traktUserSettings = y1Var.c;
        }
        if ((i & 8) != 0) {
            traktDeviceCodeResponse = y1Var.d;
        }
        if ((i & 16) != 0) {
            z2 = y1Var.e;
        }
        if ((i & 32) != 0) {
            str = y1Var.f;
        }
        String str2 = str;
        y1Var.getClass();
        boolean z4 = z2;
        TraktDeviceCodeResponse traktDeviceCodeResponse2 = traktDeviceCodeResponse;
        return new y1(z3, z, traktUserSettings, traktDeviceCodeResponse2, z4, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.a == y1Var.a && this.b == y1Var.b && kotlin.jvm.internal.l.a(this.c, y1Var.c) && kotlin.jvm.internal.l.a(this.d, y1Var.d) && this.e == y1Var.e && kotlin.jvm.internal.l.a(this.f, y1Var.f);
    }

    public final int hashCode() {
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(Boolean.hashCode(this.a) * 31, 31, this.b);
        TraktUserSettings traktUserSettings = this.c;
        int iHashCode = (iH + (traktUserSettings == null ? 0 : traktUserSettings.hashCode())) * 31;
        TraktDeviceCodeResponse traktDeviceCodeResponse = this.d;
        int iH2 = androidx.privacysandbox.ads.adservices.java.internal.a.h((iHashCode + (traktDeviceCodeResponse == null ? 0 : traktDeviceCodeResponse.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iH2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TraktState(isLoggedIn=" + this.a + ", isLoading=" + this.b + ", userSettings=" + this.c + ", authResponse=" + this.d + ", isPolling=" + this.e + ", error=" + this.f + ")";
    }

    public y1(boolean z, boolean z2, TraktUserSettings traktUserSettings, TraktDeviceCodeResponse traktDeviceCodeResponse, boolean z3, String str) {
        this.a = z;
        this.b = z2;
        this.c = traktUserSettings;
        this.d = traktDeviceCodeResponse;
        this.e = z3;
        this.f = str;
    }
}
