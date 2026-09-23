package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static final float a;
    public static final float b;
    public static final androidx.compose.ui.semantics.z c = new androidx.compose.ui.semantics.z("SelectionHandleInfo");

    static {
        float f = 25;
        a = f;
        b = f;
    }

    public static final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
