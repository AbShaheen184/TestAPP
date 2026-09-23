package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d d = new d(null, null);
    public final Runnable a;
    public final Executor b;
    public d c;

    public d(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
