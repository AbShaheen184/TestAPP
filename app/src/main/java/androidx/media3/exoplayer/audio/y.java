package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final x a;
    public final int b;
    public final com.app.mlounge.data.music.e c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public y(AudioTrack audioTrack, com.app.mlounge.data.music.e eVar) {
        this.a = new x(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = eVar;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i == 1) {
            this.f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000L;
        } else if (i == 4) {
            this.f = 500000L;
        } else {
            org.mozilla.javascript.c.a();
        }
    }
}
