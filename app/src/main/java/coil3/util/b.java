package coil3.util;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.media3.exoplayer.source.r0;
import coil3.p;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {
    public final /* synthetic */ androidx.compose.material.ripple.g e;

    public b(androidx.compose.material.ripple.g gVar) {
        this.e = gVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        androidx.compose.material.ripple.g gVar = this.e;
        synchronized (gVar) {
            if (((p) ((WeakReference) gVar.b).get()) == null) {
                gVar.i();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        coil3.memory.c cVarC;
        long jC;
        androidx.compose.material.ripple.g gVar = this.e;
        synchronized (gVar) {
            try {
                p pVar = (p) ((WeakReference) gVar.b).get();
                if (pVar != null) {
                    androidx.media3.exoplayer.hls.c cVar = pVar.a.g;
                    if (cVar != null) {
                        h hVar = h.e;
                        if (((h) cVar.y).compareTo(hVar) <= 0) {
                            androidx.media3.exoplayer.hls.c.E("AndroidSystemCallbacks", hVar, "trimMemory, level=" + i, null);
                        }
                    }
                    if (i >= 40) {
                        coil3.memory.c cVarC2 = pVar.c();
                        if (cVarC2 != null) {
                            synchronized (cVarC2.c) {
                                ((r0) cVarC2.a.c).e(-1L);
                                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = cVarC2.b;
                                lVar.y = 0;
                                ((LinkedHashMap) lVar.z).clear();
                            }
                        }
                    } else if (i >= 20) {
                        ((a) gVar.c).a(pVar.a.a);
                    } else if (i >= 10 && (cVarC = pVar.c()) != null) {
                        synchronized (cVarC.c) {
                            jC = ((r0) cVarC.a.c).c();
                        }
                        long j = jC / ((long) 2);
                        synchronized (cVarC.c) {
                            ((r0) cVarC.a.c).e(j);
                        }
                    }
                } else {
                    gVar.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
