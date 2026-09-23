package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {
    public final WeakReference e;
    public final long y;
    public final CountDownLatch z = new CountDownLatch(1);
    public boolean A = false;

    public b(a aVar, long j) {
        this.e = new WeakReference(aVar);
        this.y = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.e;
        try {
            if (this.z.await(this.y, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.b();
            this.A = true;
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.A = true;
            }
        }
    }
}
