package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements GenericArrayType, Serializable {
    public final Type e;

    public e(Type type) {
        Objects.requireNonNull(type);
        this.e = h.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && h.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return h.k(this.e) + "[]";
    }
}
