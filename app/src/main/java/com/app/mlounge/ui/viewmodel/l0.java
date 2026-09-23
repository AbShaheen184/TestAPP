package com.app.mlounge.ui.viewmodel;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public final String a;
    public final String b;
    public final Map c;
    public final String d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;

    public l0(String str, String str2, Map map, String str3, int i, String str4, int i2, int i3, String str5) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = i2;
        this.h = i3;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return kotlin.jvm.internal.l.a(this.a, l0Var.a) && kotlin.jvm.internal.l.a(this.b, l0Var.b) && kotlin.jvm.internal.l.a(this.c, l0Var.c) && kotlin.jvm.internal.l.a(this.d, l0Var.d) && this.e == l0Var.e && kotlin.jvm.internal.l.a(this.f, l0Var.f) && this.g == l0Var.g && this.h == l0Var.h && this.i.equals(l0Var.i);
    }

    public final int hashCode() {
        int iG = androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        int iHashCode = (iG + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.d;
        return this.i.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.h, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.g, androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.d(this.e, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.f), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = androidx.compose.runtime.j.q("PlayEvent(url=", this.a, ", title=", this.b, ", headers=");
        sbQ.append(this.c);
        sbQ.append(", streamType=");
        sbQ.append(this.d);
        sbQ.append(", tmdbId=");
        sbQ.append(this.e);
        sbQ.append(", contentType=");
        sbQ.append(this.f);
        sbQ.append(", season=");
        sbQ.append(this.g);
        sbQ.append(", episode=");
        sbQ.append(this.h);
        sbQ.append(", contentKey=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sbQ, this.i, ")");
    }
}
