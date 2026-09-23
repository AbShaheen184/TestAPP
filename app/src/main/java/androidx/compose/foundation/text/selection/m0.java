package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.k1;
import androidx.compose.animation.core.l2;
import androidx.compose.foundation.gestures.w1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static final androidx.compose.animation.core.p a = new androidx.compose.animation.core.p(Float.NaN, Float.NaN);
    public static final l2 b = new l2(new w1(21), new w1(22));
    public static final long c;
    public static final k1 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new k1(new androidx.compose.ui.geometry.b(jFloatToRawIntBits));
    }
}
