package com.google.firebase.components;

import androidx.room.t;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final r a;
    public final int b;
    public final int c;

    public j(r rVar, int i, int i2) {
        t.e(rVar, "Null dependency anInterface.");
        this.a = rVar;
        this.b = i;
        this.c = i2;
    }

    public static j a(r rVar) {
        return new j(rVar, 1, 0);
    }

    public static j b(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a.equals(jVar.a) && this.b == jVar.b && this.c == jVar.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                kotlinx.coroutines.future.a.o(androidx.privacysandbox.ads.adservices.java.internal.a.n(i2, "Unsupported injection: "));
                return null;
            }
            str2 = "deferred";
        }
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, str2, "}");
    }

    public j(int i, int i2, Class cls) {
        this(r.a(cls), i, i2);
    }
}
