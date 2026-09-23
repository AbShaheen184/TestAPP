package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements z2 {
    public final kotlin.jvm.functions.l a;

    public e0(kotlin.jvm.functions.l lVar) {
        this.a = lVar;
    }

    @Override // androidx.compose.runtime.z2
    public final Object a(androidx.compose.runtime.internal.j jVar) {
        return this.a.invoke(jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.a.equals(((e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
