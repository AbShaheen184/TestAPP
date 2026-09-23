package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.debrid.PremiumizeUserInfo;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public final boolean a;
    public final boolean b;
    public final PremiumizeUserInfo c;
    public final String d;

    public /* synthetic */ m0(PremiumizeUserInfo premiumizeUserInfo, int i) {
        this((i & 1) == 0, false, (i & 4) != 0 ? null : premiumizeUserInfo, null);
    }

    public static m0 a(m0 m0Var, boolean z, PremiumizeUserInfo premiumizeUserInfo, String str, int i) {
        boolean z2 = (i & 1) != 0 ? m0Var.a : true;
        if ((i & 4) != 0) {
            premiumizeUserInfo = m0Var.c;
        }
        if ((i & 8) != 0) {
            str = m0Var.d;
        }
        m0Var.getClass();
        return new m0(z2, z, premiumizeUserInfo, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.a == m0Var.a && this.b == m0Var.b && kotlin.jvm.internal.l.a(this.c, m0Var.c) && kotlin.jvm.internal.l.a(this.d, m0Var.d);
    }

    public final int hashCode() {
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(Boolean.hashCode(this.a) * 31, 31, this.b);
        PremiumizeUserInfo premiumizeUserInfo = this.c;
        int iHashCode = (iH + (premiumizeUserInfo == null ? 0 : premiumizeUserInfo.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumizeState(isLoggedIn=" + this.a + ", isLoading=" + this.b + ", userInfo=" + this.c + ", error=" + this.d + ")";
    }

    public m0(boolean z, boolean z2, PremiumizeUserInfo premiumizeUserInfo, String str) {
        this.a = z;
        this.b = z2;
        this.c = premiumizeUserInfo;
        this.d = str;
    }
}
