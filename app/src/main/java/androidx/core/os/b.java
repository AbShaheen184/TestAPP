package androidx.core.os;

import android.os.Build;
import androidx.compose.ui.graphics.layer.i;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final /* synthetic */ int a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            i.b(30);
        }
        if (i >= 30) {
            i.b(31);
        }
        if (i >= 30) {
            i.b(33);
        }
        if (i >= 30) {
            i.b(1000000);
        }
    }
}
