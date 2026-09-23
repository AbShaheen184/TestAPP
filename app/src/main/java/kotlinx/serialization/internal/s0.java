package kotlinx.serialization.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements kotlinx.serialization.descriptors.e {
    public final String a;
    public final kotlinx.serialization.descriptors.d b;

    public s0(String str, kotlinx.serialization.descriptors.d dVar) {
        dVar.getClass();
        this.a = str;
        this.b = dVar;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return this.a;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int d(String str) {
        str.getClass();
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlin.collections.i0 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.a.equals(s0Var.a) && kotlin.jvm.internal.l.a(this.b, s0Var.b);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int f() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List getAnnotations() {
        return kotlin.collections.w.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlinx.serialization.descriptors.e i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return androidx.compose.runtime.j.l(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
