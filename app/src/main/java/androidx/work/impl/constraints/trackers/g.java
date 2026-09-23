package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.navigation.u;
import androidx.work.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends u {
    public final ConnectivityManager f;
    public final Object g;
    public volatile boolean h;
    public final androidx.work.impl.constraints.d i;

    public g(Context context, androidx.work.impl.utils.taskexecutor.c cVar) {
        super(context, cVar);
        Object systemService = ((Context) this.b).getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new Object();
        this.i = new androidx.work.impl.constraints.d(this);
    }

    @Override // androidx.navigation.u
    public final Object c() {
        return f.a(this.f, this.h);
    }

    @Override // androidx.navigation.u
    public final void e() {
        try {
            y.e().a(f.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f;
            androidx.work.impl.constraints.d dVar = this.i;
            connectivityManager.getClass();
            dVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(dVar);
        } catch (IllegalArgumentException e) {
            y.e().d(f.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            y.e().d(f.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.navigation.u
    public final void f() {
        try {
            y.e().a(f.a, "Unregistering network callback");
            this.f.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException e) {
            y.e().d(f.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            y.e().d(f.a, "Received exception while unregistering network callback", e2);
        }
    }
}
