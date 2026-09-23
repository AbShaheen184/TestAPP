package androidx.media3.exoplayer;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements androidx.media3.common.util.l, com.google.common.base.q {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;

    public /* synthetic */ q(androidx.media3.exoplayer.analytics.a aVar, int i, androidx.media3.common.p0 p0Var, androidx.media3.common.p0 p0Var2) {
        this.e = 2;
        this.y = i;
    }

    @Override // com.google.common.base.q
    public Object get() {
        switch (this.e) {
            case 3:
                return new HandlerThread(androidx.media3.exoplayer.mediacodec.b.b(this.y, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(androidx.media3.exoplayer.mediacodec.b.b(this.y, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }

    @Override // androidx.media3.common.util.l
    public void invoke(Object obj) {
        switch (this.e) {
            case 0:
                ((androidx.media3.common.o0) obj).q(this.y);
                break;
            case 1:
                ((androidx.media3.common.o0) obj).h(this.y);
                break;
            default:
                androidx.media3.exoplayer.analytics.b bVar = (androidx.media3.exoplayer.analytics.b) obj;
                bVar.getClass();
                androidx.media3.exoplayer.analytics.j jVar = (androidx.media3.exoplayer.analytics.j) bVar;
                int i = this.y;
                if (i == 1) {
                    jVar.v = true;
                }
                jVar.l = i;
                break;
        }
    }

    public /* synthetic */ q(int i, int i2) {
        this.e = i2;
        this.y = i;
    }
}
