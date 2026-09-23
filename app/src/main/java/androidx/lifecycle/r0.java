package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Runnable {
    public final x e;
    public final n y;
    public boolean z;

    public r0(x xVar, n nVar) {
        xVar.getClass();
        nVar.getClass();
        this.e = xVar;
        this.y = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.z) {
            return;
        }
        this.e.e(this.y);
        this.z = true;
    }
}
