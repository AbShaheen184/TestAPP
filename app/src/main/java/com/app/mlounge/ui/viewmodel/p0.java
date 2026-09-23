package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.debrid.RealDebridDeviceCodeResponse;
import com.app.mlounge.data.remote.debrid.RealDebridUserInfo;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public final boolean a;
    public final boolean b;
    public final RealDebridUserInfo c;
    public final RealDebridDeviceCodeResponse d;
    public final boolean e;
    public final String f;

    public /* synthetic */ p0(RealDebridUserInfo realDebridUserInfo, int i) {
        this((i & 1) == 0, false, (i & 4) != 0 ? null : realDebridUserInfo, null, false, null);
    }

    public static p0 a(p0 p0Var, boolean z, RealDebridUserInfo realDebridUserInfo, RealDebridDeviceCodeResponse realDebridDeviceCodeResponse, boolean z2, String str, int i) {
        boolean z3 = (i & 1) != 0 ? p0Var.a : true;
        if ((i & 2) != 0) {
            z = p0Var.b;
        }
        if ((i & 4) != 0) {
            realDebridUserInfo = p0Var.c;
        }
        if ((i & 8) != 0) {
            realDebridDeviceCodeResponse = p0Var.d;
        }
        if ((i & 16) != 0) {
            z2 = p0Var.e;
        }
        if ((i & 32) != 0) {
            str = p0Var.f;
        }
        String str2 = str;
        p0Var.getClass();
        boolean z4 = z2;
        RealDebridDeviceCodeResponse realDebridDeviceCodeResponse2 = realDebridDeviceCodeResponse;
        return new p0(z3, z, realDebridUserInfo, realDebridDeviceCodeResponse2, z4, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.a == p0Var.a && this.b == p0Var.b && kotlin.jvm.internal.l.a(this.c, p0Var.c) && kotlin.jvm.internal.l.a(this.d, p0Var.d) && this.e == p0Var.e && kotlin.jvm.internal.l.a(this.f, p0Var.f);
    }

    public final int hashCode() {
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(Boolean.hashCode(this.a) * 31, 31, this.b);
        RealDebridUserInfo realDebridUserInfo = this.c;
        int iHashCode = (iH + (realDebridUserInfo == null ? 0 : realDebridUserInfo.hashCode())) * 31;
        RealDebridDeviceCodeResponse realDebridDeviceCodeResponse = this.d;
        int iH2 = androidx.privacysandbox.ads.adservices.java.internal.a.h((iHashCode + (realDebridDeviceCodeResponse == null ? 0 : realDebridDeviceCodeResponse.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iH2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RealDebridState(isLoggedIn=" + this.a + ", isLoading=" + this.b + ", userInfo=" + this.c + ", deviceCodeResponse=" + this.d + ", isPolling=" + this.e + ", error=" + this.f + ")";
    }

    public p0(boolean z, boolean z2, RealDebridUserInfo realDebridUserInfo, RealDebridDeviceCodeResponse realDebridDeviceCodeResponse, boolean z3, String str) {
        this.a = z;
        this.b = z2;
        this.c = realDebridUserInfo;
        this.d = realDebridDeviceCodeResponse;
        this.e = z3;
        this.f = str;
    }
}
