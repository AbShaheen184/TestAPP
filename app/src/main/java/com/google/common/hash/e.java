package com.google.common.hash;

import androidx.work.impl.v;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends v implements Serializable {
    public static final /* synthetic */ int G = 0;

    static {
        int i = c.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof e;
    }

    public final int hashCode() {
        return e.class.hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
