package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w4 {
    public final long a = androidx.compose.ui.graphics.t.i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w4) {
            return androidx.compose.ui.graphics.t.c(this.a, ((w4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) androidx.compose.ui.graphics.t.i(this.a)) + ", rippleAlpha=null)";
    }
}
