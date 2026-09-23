package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends s1 {
    public final List a;
    public final String b;

    public g0(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        g0 g0Var = (g0) ((s1) obj);
        if (!this.a.equals(g0Var.a)) {
            return false;
        }
        String str = g0Var.b;
        String str2 = this.b;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, this.b, "}");
    }
}
