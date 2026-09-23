package kotlinx.serialization.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements kotlinx.serialization.descriptors.e {
    public static final i0 a = new i0();

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return "kotlin.Nothing";
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int d(String str) {
        str.getClass();
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlin.collections.i0 e() {
        return kotlinx.serialization.descriptors.i.e;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int f() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String g(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List getAnnotations() {
        return kotlin.collections.w.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List h(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (kotlinx.serialization.descriptors.i.e.hashCode() * 31) - 1818355776;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlinx.serialization.descriptors.e i(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean j(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
