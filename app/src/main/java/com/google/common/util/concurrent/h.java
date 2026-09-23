package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {
    public final r e;
    public final ListenableFuture y;

    public h(r rVar, ListenableFuture listenableFuture) {
        this.e = rVar;
        this.y = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.e != this) {
            return;
        }
        if (r.C.j(this.e, this, r.h(this.y))) {
            r.e(this.e, false);
        }
    }
}
