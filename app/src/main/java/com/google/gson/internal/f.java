package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ParameterizedType, Serializable {
    public final Type e;
    public final Type y;
    public final Type[] z;

    public f(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            com.google.firebase.platforminfo.b.f(cls, "Must specify owner type for ");
            throw null;
        }
        this.e = type == null ? null : h.a(type);
        this.y = h.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.z = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.z[i]);
            h.b(this.z[i]);
            Type[] typeArr3 = this.z;
            typeArr3[i] = h.a(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && h.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.z.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.y;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.z) ^ this.y.hashCode();
        Type type = this.e;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.z;
        int length = typeArr.length;
        Type type = this.y;
        if (length == 0) {
            return h.k(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(h.k(type));
        sb.append("<");
        sb.append(h.k(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(h.k(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
