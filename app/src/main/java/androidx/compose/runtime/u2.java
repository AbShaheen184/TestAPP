package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 implements Iterator, kotlin.jvm.internal.markers.a {
    public final int A;
    public int B;
    public final h2 e;
    public final int y;
    public final t z;

    public u2(h2 h2Var, int i, p0 p0Var, t tVar) {
        this.e = h2Var;
        this.y = i;
        this.z = tVar;
        this.A = h2Var.E;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
