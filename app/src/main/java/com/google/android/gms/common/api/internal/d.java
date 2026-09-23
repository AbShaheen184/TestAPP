package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final d B = new d();
    public final AtomicBoolean e = new AtomicBoolean();
    public final AtomicBoolean y = new AtomicBoolean();
    public final ArrayList z = new ArrayList();
    public boolean A = false;

    public static void a(Application application) {
        d dVar = B;
        synchronized (dVar) {
            try {
                if (!dVar.A) {
                    application.registerActivityLifecycleCallbacks(dVar);
                    application.registerComponentCallbacks(dVar);
                    dVar.A = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z) {
        synchronized (B) {
            try {
                Iterator it = this.z.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.e.compareAndSet(true, false);
        this.y.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.e.compareAndSet(true, false);
        this.y.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.e.compareAndSet(false, true)) {
            this.y.set(true);
            b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
