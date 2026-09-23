package androidx.compose.foundation.shape;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    public final float a;

    public c(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            androidx.compose.foundation.internal.b.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // androidx.compose.foundation.shape.a
    public final float a(long j, androidx.compose.ui.unit.c cVar) {
        return (this.a / 100.0f) * androidx.compose.ui.geometry.e.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.a, ((c) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
