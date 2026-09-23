package com.google.firebase.sessions;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final g0 d;
    public final ArrayList e;

    public a(String str, String str2, String str3, g0 g0Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = g0Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.a) || !kotlin.jvm.internal.l.a(this.b, aVar.b) || !kotlin.jvm.internal.l.a(this.c, aVar.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return kotlin.jvm.internal.l.a(str, str) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
