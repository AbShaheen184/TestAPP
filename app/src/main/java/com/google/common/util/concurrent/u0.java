package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends k implements Runnable {
    public final Runnable E;

    public u0(Runnable runnable) {
        runnable.getClass();
        this.E = runnable;
    }

    @Override // com.google.common.util.concurrent.r
    public final String j() {
        return "task=[" + this.E + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.E.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
