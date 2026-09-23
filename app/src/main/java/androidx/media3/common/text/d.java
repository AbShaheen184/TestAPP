package androidx.media3.common.text;

import android.os.Bundle;
import android.text.Spanned;
import androidx.media3.common.util.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;

    static {
        String str = i0.a;
        a = Integer.toString(0, 36);
        b = Integer.toString(1, 36);
        c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(obj));
        bundle2.putInt(b, spanned.getSpanEnd(obj));
        bundle2.putInt(c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
