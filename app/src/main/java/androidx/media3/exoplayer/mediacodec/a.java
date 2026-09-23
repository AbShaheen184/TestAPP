package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.media3.exoplayer.video.j b;

    public /* synthetic */ a(l lVar, androidx.media3.exoplayer.video.j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                androidx.media3.exoplayer.video.j jVar = this.b;
                Handler handler = jVar.e;
                if (Build.VERSION.SDK_INT >= 30) {
                    jVar.a(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                androidx.media3.exoplayer.video.j jVar2 = this.b;
                Handler handler2 = jVar2.e;
                if (Build.VERSION.SDK_INT >= 30) {
                    jVar2.a(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
