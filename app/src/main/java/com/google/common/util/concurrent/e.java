package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e b = new e(new androidx.concurrent.futures.b("Failure occurred while trying to finish a future.", 2));
    public final Throwable a;

    public e(Throwable th) {
        th.getClass();
        this.a = th;
    }
}
