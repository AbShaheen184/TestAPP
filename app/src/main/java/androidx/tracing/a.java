package androidx.tracing;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
