package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements z2 {
    public final j1 a;

    public k0(j1 j1Var) {
        this.a = j1Var;
    }

    @Override // androidx.compose.runtime.z2
    public final Object a(androidx.compose.runtime.internal.j jVar) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.a.equals(((k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
