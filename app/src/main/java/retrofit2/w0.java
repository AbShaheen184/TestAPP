package retrofit2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements GenericArrayType {
    public final Type e;

    public w0(Type type) {
        this.e = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && z0.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return z0.r(this.e) + "[]";
    }
}
