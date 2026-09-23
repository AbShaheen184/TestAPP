package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements androidx.compose.runtime.tooling.c, Iterable, kotlin.jvm.internal.markers.a {
    public final h2 e;
    public final int y;
    public final int z;

    public i2(h2 h2Var, int i, int i2) {
        this.e = h2Var;
        this.y = i;
        this.z = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return i2Var.y == this.y && i2Var.z == this.z && i2Var.e.equals(this.e);
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.y;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        h2 h2Var = this.e;
        if (h2Var.E != this.z) {
            j2.e();
        }
        int i = this.y;
        h2Var.h(i);
        return new o0(h2Var, i + 1, h2Var.e[(i * 5) + 3] + i);
    }
}
