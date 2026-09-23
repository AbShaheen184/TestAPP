package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends k implements Runnable {
    public ListenableFuture E;

    @Override // com.google.common.util.concurrent.r
    public final void c() {
        this.E = null;
    }

    @Override // com.google.common.util.concurrent.r
    public final String j() {
        ListenableFuture listenableFuture = this.E;
        if (listenableFuture == null) {
            return null;
        }
        return "delegate=[" + listenableFuture + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.E;
        if (listenableFuture != null) {
            n(listenableFuture);
        }
    }
}
