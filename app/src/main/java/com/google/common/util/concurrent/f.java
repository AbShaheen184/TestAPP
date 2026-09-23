package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final f d = new f();
    public final Runnable a;
    public final Executor b;
    public f c;

    public f() {
        this.a = null;
        this.b = null;
    }

    public f(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
