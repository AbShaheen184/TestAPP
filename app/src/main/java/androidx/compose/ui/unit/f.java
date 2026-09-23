package androidx.compose.ui.unit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {
    public final float e;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean d(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String e(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.e, ((f) obj).e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.e, ((f) obj).e) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e);
    }

    public final String toString() {
        return e(this.e);
    }
}
