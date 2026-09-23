package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements u {
    public static final i e = new i();
    public static final i y = new i();

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint c(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    @Override // androidx.media3.exoplayer.mediacodec.u
    public int a(Object obj) {
        String str = ((o) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public List b(String str, boolean z, boolean z2) {
        return v.e(str, z, z2);
    }
}
