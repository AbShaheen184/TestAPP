package androidx.work;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ AtomicBoolean y;

    public /* synthetic */ q(AtomicBoolean atomicBoolean, int i) {
        this.e = i;
        this.y = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.set(true);
                break;
            default:
                this.y.set(true);
                break;
        }
    }
}
