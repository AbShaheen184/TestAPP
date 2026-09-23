package androidx.transition;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT >= 28;
    }
}
