package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends b {
    public final androidx.compose.ui.i j;

    public z(androidx.compose.ui.i iVar) {
        this.j = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.l.a(this.j, ((z) obj).j);
    }

    @Override // androidx.compose.foundation.layout.b
    public final int f(int i, int i2, androidx.compose.ui.unit.m mVar) {
        return this.j.a(i2, i);
    }

    public final int hashCode() {
        return Float.hashCode(this.j.a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.j + ')';
    }
}
