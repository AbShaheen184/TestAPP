package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends z0 implements Serializable {
    public final z0 e;

    public j1(z0 z0Var) {
        this.e = z0Var;
    }

    @Override // com.google.common.collect.z0
    public final z0 a() {
        return this.e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.e.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            return this.e.equals(((j1) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return -this.e.hashCode();
    }

    public final String toString() {
        return this.e + ".reverse()";
    }
}
