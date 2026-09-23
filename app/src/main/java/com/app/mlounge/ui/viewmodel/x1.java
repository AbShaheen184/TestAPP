package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.debrid.TorBoxUserInfo;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {
    public final boolean a;
    public final boolean b;
    public final TorBoxUserInfo c;
    public final String d;

    public /* synthetic */ x1(TorBoxUserInfo torBoxUserInfo, int i) {
        this((i & 1) == 0, false, (i & 4) != 0 ? null : torBoxUserInfo, null);
    }

    public static x1 a(x1 x1Var, boolean z, TorBoxUserInfo torBoxUserInfo, String str, int i) {
        boolean z2 = (i & 1) != 0 ? x1Var.a : true;
        if ((i & 4) != 0) {
            torBoxUserInfo = x1Var.c;
        }
        if ((i & 8) != 0) {
            str = x1Var.d;
        }
        x1Var.getClass();
        return new x1(z2, z, torBoxUserInfo, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return this.a == x1Var.a && this.b == x1Var.b && kotlin.jvm.internal.l.a(this.c, x1Var.c) && kotlin.jvm.internal.l.a(this.d, x1Var.d);
    }

    public final int hashCode() {
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(Boolean.hashCode(this.a) * 31, 31, this.b);
        TorBoxUserInfo torBoxUserInfo = this.c;
        int iHashCode = (iH + (torBoxUserInfo == null ? 0 : torBoxUserInfo.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TorBoxState(isLoggedIn=" + this.a + ", isLoading=" + this.b + ", userInfo=" + this.c + ", error=" + this.d + ")";
    }

    public x1(boolean z, boolean z2, TorBoxUserInfo torBoxUserInfo, String str) {
        this.a = z;
        this.b = z2;
        this.c = torBoxUserInfo;
        this.d = str;
    }
}
