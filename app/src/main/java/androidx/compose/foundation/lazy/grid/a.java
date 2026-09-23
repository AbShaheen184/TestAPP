package androidx.compose.foundation.lazy.grid;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final float a;

    public a(float f) {
        this.a = f;
        if (androidx.compose.ui.unit.f.a(f, 0) > 0) {
            return;
        }
        androidx.compose.foundation.internal.b.a("Provided min size should be larger than zero.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return androidx.compose.ui.unit.f.d(this.a, ((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
