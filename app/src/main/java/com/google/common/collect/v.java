package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends z0 implements Serializable {
    public final androidx.compose.foundation.lazy.layout.a e;

    public v(androidx.compose.foundation.lazy.layout.a aVar) {
        this.e = aVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.e.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return this.e.equals(((v) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e.toString();
    }
}
