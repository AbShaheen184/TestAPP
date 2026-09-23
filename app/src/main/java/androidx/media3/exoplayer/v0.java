package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ androidx.media3.exoplayer.source.n A;
    public final /* synthetic */ androidx.media3.exoplayer.source.s B;
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ Pair z;

    public /* synthetic */ v0(y0 y0Var, Pair pair, androidx.media3.exoplayer.source.n nVar, androidx.media3.exoplayer.source.s sVar, int i) {
        this.e = i;
        this.y = y0Var;
        this.z = pair;
        this.A = nVar;
        this.B = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                androidx.media3.exoplayer.analytics.g gVar = (androidx.media3.exoplayer.analytics.g) this.y.y.i;
                Pair pair = this.z;
                gVar.F(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.v) pair.second, this.A, this.B);
                break;
            default:
                androidx.media3.exoplayer.analytics.g gVar2 = (androidx.media3.exoplayer.analytics.g) this.y.y.i;
                Pair pair2 = this.z;
                gVar2.j(((Integer) pair2.first).intValue(), (androidx.media3.exoplayer.source.v) pair2.second, this.A, this.B);
                break;
        }
    }
}
