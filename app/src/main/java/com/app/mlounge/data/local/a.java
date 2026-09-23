package com.app.mlounge.data.local;

import androidx.compose.runtime.j;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ a(int i, String str, String str2, boolean z) {
        this(str, str2, z, (i & 8) == 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && l.a(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j.q("ExpectedColumn(name=", this.a, ", type=", this.b, ", notNull=");
        sbQ.append(this.c);
        sbQ.append(", primaryKey=");
        sbQ.append(this.d);
        sbQ.append(", autoIncrement=");
        sbQ.append(this.e);
        sbQ.append(")");
        return sbQ.toString();
    }

    public a(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
