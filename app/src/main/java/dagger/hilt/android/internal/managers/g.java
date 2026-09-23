package dagger.hilt.android.internal.managers;

import com.app.mlounge.CinemaHQApp;
import com.app.mlounge.h;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements dagger.hilt.internal.b {
    public volatile h e;
    public final Object y = new Object();
    public final androidx.media3.exoplayer.hls.c z;

    public g(androidx.media3.exoplayer.hls.c cVar) {
        this.z = cVar;
    }

    @Override // dagger.hilt.internal.b
    public final Object a() {
        if (this.e == null) {
            synchronized (this.y) {
                try {
                    if (this.e == null) {
                        this.e = new h(new androidx.media3.exoplayer.mediacodec.g((CinemaHQApp) this.z.y));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }
}
