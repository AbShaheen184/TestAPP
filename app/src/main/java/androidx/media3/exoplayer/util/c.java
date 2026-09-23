package androidx.media3.exoplayer.util;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ Runnable a;

    public c(Runnable runnable) {
        this.a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.run();
    }
}
