package androidx.arch.core.executor;

import com.google.android.gms.dynamite.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    public static volatile b n;
    public static final a o = new a(0);
    public final e m = new e();

    public static b g0() {
        if (n != null) {
            return n;
        }
        synchronized (b.class) {
            try {
                if (n == null) {
                    n = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n;
    }
}
