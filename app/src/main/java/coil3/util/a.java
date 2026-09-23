package coil3.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.media3.exoplayer.source.r0;
import coil3.n;
import coil3.p;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {
    public final double e;
    public final /* synthetic */ androidx.compose.material.ripple.g y;

    public a(androidx.compose.material.ripple.g gVar, p pVar) {
        this.y = gVar;
        n nVar = pVar.a;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e eVar = coil3.m.a;
        Object obj = nVar.b.n.a.get(coil3.m.d);
        this.e = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        long j2;
        double d = this.e;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        androidx.compose.material.ripple.g gVar = this.y;
        p pVar = (p) ((WeakReference) gVar.b).get();
        if (pVar == null) {
            gVar.i();
            return;
        }
        coil3.memory.c cVarC = pVar.c();
        if (cVarC != null) {
            synchronized (cVarC.c) {
                j = cVarC.a.a;
            }
            cVarC.a((long) (d * j));
            androidx.media3.exoplayer.hls.c cVar = pVar.a.g;
            if (cVar != null) {
                h hVar = h.e;
                if (((h) cVar.y).compareTo(hVar) <= 0) {
                    synchronized (cVarC.c) {
                        j2 = ((r0) cVarC.a.c).e;
                    }
                    androidx.media3.exoplayer.hls.c.E("AndroidSystemCallbacks", hVar, "Restricting " + cVarC + "'s max size to " + j2 + " bytes.", null);
                }
            }
        }
    }

    public final void b(Context context) {
        long j;
        long j2;
        if (this.e == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        androidx.compose.material.ripple.g gVar = this.y;
        p pVar = (p) ((WeakReference) gVar.b).get();
        if (pVar == null) {
            gVar.i();
            return;
        }
        coil3.memory.c cVarC = pVar.c();
        if (cVarC != null) {
            synchronized (cVarC.c) {
                j = cVarC.a.a;
            }
            cVarC.a(j);
            androidx.media3.exoplayer.hls.c cVar = pVar.a.g;
            if (cVar != null) {
                h hVar = h.e;
                if (((h) cVar.y).compareTo(hVar) <= 0) {
                    synchronized (cVarC.c) {
                        j2 = ((r0) cVarC.a.c).e;
                    }
                    androidx.media3.exoplayer.hls.c.E("AndroidSystemCallbacks", hVar, "Restoring " + cVarC + "'s max size to " + j2 + " bytes.", null);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
