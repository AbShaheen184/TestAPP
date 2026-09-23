package net.luminis.quic.recovery;

import net.luminis.quic.send.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ k y;

    public /* synthetic */ c(int i, k kVar) {
        this.e = i;
        this.y = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.j();
                break;
            default:
                k kVar = this.y;
                try {
                    kVar.s = true;
                    while (kVar.s) {
                        kVar.c();
                    }
                    break;
                } catch (Throwable th) {
                    boolean z = kVar.s;
                    net.luminis.quic.log.a aVar = kVar.g;
                    if (z) {
                        aVar.c("Sender thread aborted with exception", th);
                        kVar.d.a(th);
                        return;
                    } else {
                        th.toString();
                        aVar.getClass();
                    }
                }
                break;
        }
    }
}
