package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {
    public final /* synthetic */ b0 e;

    public z(b0 b0Var) {
        this.e = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.e.a) {
            obj = this.e.d;
            this.e.d = b0.i;
        }
        this.e.c(obj);
    }
}
