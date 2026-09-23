package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x4 {
    public static final androidx.compose.runtime.d0 a = new androidx.compose.runtime.d0(new androidx.activity.compose.b(25));
    public static final y4 b;
    public static final y4 c;

    static {
        long j = androidx.compose.ui.graphics.t.i;
        b = new y4(true, Float.NaN, j);
        c = new y4(false, Float.NaN, j);
    }

    public static y4 a(boolean z, float f, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = androidx.compose.ui.graphics.t.i;
        if (androidx.compose.ui.unit.f.d(f, Float.NaN) && androidx.compose.ui.graphics.t.c(j, j)) {
            return z ? b : c;
        }
        return new y4(z, f, j);
    }
}
