package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final v a;
    public static final b b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new w();
        } else {
            a = new v();
        }
        b = new b("translationAlpha", Float.class, 5);
        new b("clipBounds", Rect.class, 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.d0(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.e0(view, i);
    }
}
