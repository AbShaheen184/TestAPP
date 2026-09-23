package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements ComponentCallbacks2 {
    public final /* synthetic */ androidx.compose.ui.res.d e;

    public l0(androidx.compose.ui.res.d dVar) {
        this.e = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        androidx.compose.ui.res.d dVar = this.e;
        synchronized (dVar) {
            dVar.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        androidx.compose.ui.res.d dVar = this.e;
        synchronized (dVar) {
            dVar.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        androidx.compose.ui.res.d dVar = this.e;
        synchronized (dVar) {
            dVar.a.c();
        }
    }
}
