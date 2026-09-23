package com.app.mlounge.ui.screens.player;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final String i;

    public c1(String str, String str2, String str3, boolean z, int i, int i2, String str4, int i3) {
        boolean z2 = (i3 & 8) == 0;
        boolean z3 = (i3 & 16) == 0;
        z = (i3 & 32) != 0 ? false : z;
        i = (i3 & 64) != 0 ? -1 : i;
        i2 = (i3 & 128) != 0 ? -1 : i2;
        str4 = (i3 & LibretroCore.SCREEN_WIDTH) != 0 ? null : str4;
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z2;
        this.e = z3;
        this.f = z;
        this.g = i;
        this.h = i2;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.a.equals(c1Var.a) && this.b.equals(c1Var.b) && this.c.equals(c1Var.c) && this.d == c1Var.d && this.e == c1Var.e && this.f == c1Var.f && this.g == c1Var.g && this.h == c1Var.h && kotlin.jvm.internal.l.a(this.i, c1Var.i);
    }

    public final int hashCode() {
        int iD = androidx.privacysandbox.ads.adservices.java.internal.a.d(this.h, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.g, androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31);
        String str = this.i;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = androidx.compose.runtime.j.q("SubtitleItem(label=", this.a, ", url=", this.b, ", lang=");
        sbQ.append(this.c);
        sbQ.append(", isLocal=");
        sbQ.append(this.d);
        sbQ.append(", isInternal=");
        sbQ.append(this.e);
        sbQ.append(", isDefault=");
        sbQ.append(this.f);
        sbQ.append(", trackGroupIndex=");
        sbQ.append(this.g);
        sbQ.append(", trackIndex=");
        sbQ.append(this.h);
        sbQ.append(", release=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sbQ, this.i, ")");
    }
}
