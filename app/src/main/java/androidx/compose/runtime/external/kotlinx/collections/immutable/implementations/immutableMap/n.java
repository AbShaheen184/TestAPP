package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Iterator, kotlin.jvm.internal.markers.a {
    public Object[] e = m.e.d;
    public int y;
    public int z;

    public final void b(Object[] objArr, int i, int i2) {
        this.e = objArr;
        this.y = i;
        this.z = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.z < this.y;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
