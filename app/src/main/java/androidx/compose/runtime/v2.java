package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 implements androidx.compose.runtime.tooling.c, Iterable, kotlin.jvm.internal.markers.a {
    public final h2 e;
    public final int y;
    public final a2 z;

    public v2(h2 h2Var, int i, p0 p0Var, a2 a2Var) {
        this.e = h2Var;
        this.y = i;
        this.z = a2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return v2Var.y == this.y && v2Var.e.equals(this.e) && v2Var.z.equals(this.z);
    }

    public final int hashCode() {
        return this.z.hashCode() + ((this.e.hashCode() + (this.y * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u2(this.e, this.y, null, this.z);
    }
}
