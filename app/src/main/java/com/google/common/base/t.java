package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements q, Serializable {
    public final Object e;

    public t(Object obj) {
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return okhttp3.internal.platform.android.g.g(this.e, ((t) obj).e);
        }
        return false;
    }

    @Override // com.google.common.base.q
    public final Object get() {
        return this.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.e + ")";
    }
}
