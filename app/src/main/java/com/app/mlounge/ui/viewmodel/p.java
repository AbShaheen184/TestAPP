package com.app.mlounge.ui.viewmodel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final boolean a;
    public final String b;

    public p(String str, int i) {
        boolean z = (i & 1) == 0;
        str = (i & 4) != 0 ? null : str;
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && kotlin.jvm.internal.l.a(this.b, pVar.b);
    }

    public final int hashCode() {
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(Boolean.hashCode(this.a) * 31, 31, false);
        String str = this.b;
        return (iH + (str != null ? str.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "EasyNewsState(isLoggedIn=" + this.a + ", isLoading=false, username=" + this.b + ", error=null)";
    }
}
