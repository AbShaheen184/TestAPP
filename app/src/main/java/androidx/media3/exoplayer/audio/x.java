package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final AudioTrack a;
    public final AudioTimestamp b = new AudioTimestamp();
    public long c;
    public long d;
    public long e;
    public boolean f;
    public long g;

    public x(AudioTrack audioTrack) {
        this.a = audioTrack;
    }
}
