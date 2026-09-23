package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ c0 a;

    public b0(c0 c0Var) {
        this.a = c0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.a.c.j.e(-1, new androidx.media3.exoplayer.analytics.d(25));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new androidx.media3.exoplayer.analytics.d(26));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.j.e(-1, new androidx.media3.exoplayer.analytics.d(25));
    }
}
