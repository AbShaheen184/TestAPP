package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Iterator, kotlin.jvm.internal.markers.a {
    public final int A;
    public final h2 e;
    public final int y;
    public int z;

    public o0(h2 h2Var, int i, int i2) {
        this.e = h2Var;
        this.y = i2;
        this.z = i;
        this.A = h2Var.E;
        if (h2Var.D) {
            j2.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.z < this.y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        h2 h2Var = this.e;
        int i = h2Var.E;
        int i2 = this.A;
        if (i != i2) {
            j2.e();
        }
        int i3 = this.z;
        this.z = h2Var.e[(i3 * 5) + 3] + i3;
        return new i2(h2Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
