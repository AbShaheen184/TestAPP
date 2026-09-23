package com.google.android.gms.common.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public final String a;
    public final String b;
    public final boolean c;

    public g0(String str, boolean z) {
        x.d(str);
        this.a = str;
        x.d("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return x.j(this.a, g0Var.a) && x.j(this.b, g0Var.b) && x.j(null, null) && this.c == g0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        x.g(null);
        throw null;
    }
}
