package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ o0 y;

    public /* synthetic */ h0(o0 o0Var, int i) {
        this.e = i;
        this.y = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.g0 = true;
                break;
            case 1:
                this.y.A();
                break;
            default:
                o0 o0Var = this.y;
                if (!o0Var.m0) {
                    t tVar = o0Var.N;
                    tVar.getClass();
                    tVar.u(o0Var);
                }
                break;
        }
    }
}
