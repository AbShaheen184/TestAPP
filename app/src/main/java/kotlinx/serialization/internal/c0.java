package kotlinx.serialization.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements kotlinx.serialization.descriptors.e {
    public final kotlinx.serialization.descriptors.e a;
    public final kotlinx.serialization.descriptors.e b;

    public c0(kotlinx.serialization.descriptors.e eVar, kotlinx.serialization.descriptors.e eVar2) {
        eVar.getClass();
        eVar2.getClass();
        this.a = eVar;
        this.b = eVar2;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int d(String str) {
        str.getClass();
        Integer numW = kotlin.text.r.w(str);
        if (numW != null) {
            return numW.intValue();
        }
        kotlinx.coroutines.future.a.q(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlin.collections.i0 e() {
        return kotlinx.serialization.descriptors.i.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.l.a(this.a, c0Var.a) && kotlin.jvm.internal.l.a(this.b, c0Var.b);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int f() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List getAnnotations() {
        return kotlin.collections.w.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List h(int i) {
        if (i >= 0) {
            return kotlin.collections.w.e;
        }
        kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.q("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlinx.serialization.descriptors.e i(int i) {
        if (i < 0) {
            kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.q("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        kotlinx.coroutines.future.a.u("Unreached");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.q("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
