package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {
    public final f A;

    public p(f fVar) {
        this.A = fVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.z;
        this.z = i + 2;
        Object[] objArr = this.e;
        return new a(this.A, objArr[i], objArr[i + 1]);
    }
}
