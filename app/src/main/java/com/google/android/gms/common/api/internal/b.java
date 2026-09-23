package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int a;
    public final androidx.work.impl.k b;
    public final com.google.android.gms.common.api.b c;
    public final String d;

    public b(androidx.work.impl.k kVar, com.google.android.gms.common.api.b bVar, String str) {
        this.b = kVar;
        this.c = bVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{kVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return com.google.android.gms.common.internal.x.j(this.b, bVar.b) && com.google.android.gms.common.internal.x.j(this.c, bVar.c) && com.google.android.gms.common.internal.x.j(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
