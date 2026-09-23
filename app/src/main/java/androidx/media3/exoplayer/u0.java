package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ androidx.media3.exoplayer.source.s A;
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ Pair z;

    public /* synthetic */ u0(y0 y0Var, Pair pair, androidx.media3.exoplayer.source.s sVar, int i) {
        this.e = i;
        this.y = y0Var;
        this.z = pair;
        this.A = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                androidx.media3.exoplayer.analytics.g gVar = (androidx.media3.exoplayer.analytics.g) this.y.y.i;
                Pair pair = this.z;
                int iIntValue = ((Integer) pair.first).intValue();
                androidx.media3.exoplayer.source.v vVar = (androidx.media3.exoplayer.source.v) pair.second;
                vVar.getClass();
                gVar.f(iIntValue, vVar, this.A);
                break;
            default:
                androidx.media3.exoplayer.analytics.g gVar2 = (androidx.media3.exoplayer.analytics.g) this.y.y.i;
                Pair pair2 = this.z;
                gVar2.k(((Integer) pair2.first).intValue(), (androidx.media3.exoplayer.source.v) pair2.second, this.A);
                break;
        }
    }
}
