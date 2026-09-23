package androidx.media3.exoplayer.video;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y implements DisplayManager.DisplayListener {
    public final Choreographer e;
    public final DisplayManager y;
    public volatile long z = -9223372036854775807L;
    public volatile long A = -9223372036854775807L;

    public y(Choreographer choreographer, DisplayManager displayManager) {
        this.e = choreographer;
        this.y = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
