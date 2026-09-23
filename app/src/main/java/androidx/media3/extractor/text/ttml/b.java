package androidx.media3.extractor.text.ttml;

import com.google.common.collect.k0;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final k0 e = k0.k(2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");
    public static final k0 f = k0.k(3, "dot", "sesame", "circle");
    public static final k0 g = k0.k(2, "filled", "open");
    public static final k0 h = k0.k(3, "after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    public b(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
