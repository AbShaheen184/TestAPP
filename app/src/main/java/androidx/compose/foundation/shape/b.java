package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.f;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {
    public final float a;

    public b(float f) {
        this.a = f;
    }

    @Override // androidx.compose.foundation.shape.a
    public final float a(long j, androidx.compose.ui.unit.c cVar) {
        return cVar.W(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.d(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
