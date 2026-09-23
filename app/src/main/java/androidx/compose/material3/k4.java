package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k4 {
    public static final float a = androidx.compose.material3.tokens.c.c;
    public static final int b = 1;
    public static final int c = 1;
    public static final float d = androidx.compose.material3.tokens.m.b;
    public static final float e = androidx.compose.material3.tokens.m.c;
    public static final float f = androidx.compose.material3.tokens.c.b;

    public static final void a(androidx.compose.ui.graphics.drawscope.d dVar, int i, long j, float f2, float f3) {
        if (i == 1) {
            float f4 = f2 / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (dVar.d() >> 32)) - f4) - f3;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / 2.0f;
            androidx.compose.ui.graphics.drawscope.d.S(dVar, j, f4, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))), null, 120);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (dVar.d() >> 32)) - f2) - f3;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) - f2) / 2.0f;
        androidx.compose.ui.graphics.drawscope.d.G(dVar, j, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2))), 0.0f, 120);
    }
}
