package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final b a;
    public final com.google.android.gms.common.d b;

    public /* synthetic */ l(b bVar, com.google.android.gms.common.d dVar) {
        this.a = bVar;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return com.google.android.gms.common.internal.x.j(this.a, lVar.a) && com.google.android.gms.common.internal.x.j(this.b, lVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        androidx.work.impl.k kVar = new androidx.work.impl.k(this);
        kVar.g(this.a, "key");
        kVar.g(this.b, "feature");
        return kVar.toString();
    }
}
