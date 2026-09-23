package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements WildcardType, Serializable {
    public final Type e;
    public final Type y;

    public g(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            kotlinx.coroutines.future.a.q("At most one lower bound is supported");
            throw null;
        }
        if (typeArr.length != 1) {
            kotlinx.coroutines.future.a.q("Exactly one upper bound must be specified");
            throw null;
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            h.b(typeArr[0]);
            this.y = null;
            this.e = h.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        h.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            kotlinx.coroutines.future.a.q("When lower bound is specified, upper bound must be Object");
            throw null;
        }
        this.y = h.a(typeArr2[0]);
        this.e = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && h.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.y;
        return type != null ? new Type[]{type} : h.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.e};
    }

    public final int hashCode() {
        Type type = this.y;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.e.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.y;
        if (type != null) {
            return "? super " + h.k(type);
        }
        Type type2 = this.e;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + h.k(type2);
    }
}
