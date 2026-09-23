package androidx.media3.exoplayer;

import androidx.media3.exoplayer.image.ImageOutput;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends androidx.media3.common.q0 {
    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);
}
