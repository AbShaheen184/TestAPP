package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z1 extends ContextWrapper {
    public static final Object a = null;

    public static void a(Context context) {
        if (context.getResources() instanceof b2) {
            return;
        }
        context.getResources();
        int i = r2.a;
    }
}
