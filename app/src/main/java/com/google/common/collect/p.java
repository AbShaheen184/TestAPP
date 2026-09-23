package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends z0 implements Serializable {
    public final com.google.common.base.d e;
    public final z0 y;

    public p(com.google.common.base.d dVar, z0 z0Var) {
        this.e = dVar;
        this.y = z0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.google.common.base.d dVar = this.e;
        return this.y.compare(dVar.apply(obj), dVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.e.equals(pVar.e) && this.y.equals(pVar.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.y});
    }

    public final String toString() {
        return this.y + ".onResultOf(" + this.e + ")";
    }
}
