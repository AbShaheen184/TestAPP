package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public v0(long j, long j2, Bundle bundle, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.e = bundle;
        this.c = j;
        this.d = j2;
    }

    public static v0 a(u uVar) {
        String str = uVar.e;
        String str2 = uVar.z;
        return new v0(uVar.A, uVar.B, uVar.y.h(), str, str2);
    }

    public final u b() {
        t tVar = new t(new Bundle(this.e));
        return new u(this.a, tVar, this.b, this.c, this.d);
    }

    public final String toString() {
        String string = this.e.toString();
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        androidx.room.b0.i(sb, "origin=", str, ",name=", str2);
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, ",params=", string);
    }
}
