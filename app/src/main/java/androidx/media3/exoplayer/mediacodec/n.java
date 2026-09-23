package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class n extends androidx.media3.decoder.c {
    public final int e;

    public n(IllegalStateException illegalStateException, o oVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(oVar == null ? null : oVar.a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.e = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
