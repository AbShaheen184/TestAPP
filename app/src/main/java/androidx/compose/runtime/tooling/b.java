package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int a;
    public final Integer b;

    public b(int i, coil3.svg.internal.a aVar, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && l.a(null, null) && l.a(this.b, bVar.b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.a) * 31) + 0) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.b + ')';
    }
}
