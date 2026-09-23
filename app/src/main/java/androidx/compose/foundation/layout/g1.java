package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {
    public static final g1 a = new g1();

    public static androidx.compose.ui.r a(g1 g1Var, androidx.compose.ui.r rVar, float f) {
        g1Var.getClass();
        if (f <= 0.0d) {
            androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return rVar.d(new t0(f, true));
    }
}
