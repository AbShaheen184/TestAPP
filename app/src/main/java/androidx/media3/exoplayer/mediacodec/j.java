package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import com.google.common.util.concurrent.d0;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final HashSet a;
    public final i b;
    public LoudnessCodecController c;

    public j() {
        i iVar = i.e;
        this.a = new HashSet();
        this.b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            _COROUTINE.a.A(this.a.add(mediaCodec));
        }
    }

    public final void b() {
        this.a.clear();
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.a.remove(mediaCodec) || (loudnessCodecController = this.c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d(int i) {
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, d0.e, new h(this));
        this.c = loudnessCodecControllerCreate;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
