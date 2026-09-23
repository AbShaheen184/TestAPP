package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.compose.material3.internal.r0;
import androidx.work.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a = 0;
    public final Object b;

    public d(androidx.work.impl.constraints.trackers.g gVar) {
        this.b = gVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 1:
                network.getClass();
                if (network.equals(((androidx.work.impl.constraints.trackers.g) this.b).f.getActiveNetwork())) {
                    y.e().a(androidx.work.impl.constraints.trackers.f.a, "Network blocked status changed: " + z);
                    androidx.work.impl.constraints.trackers.g gVar = (androidx.work.impl.constraints.trackers.g) this.b;
                    Object objC = gVar.e;
                    if (objC == null) {
                        objC = gVar.c();
                    }
                    g gVar2 = (g) objC;
                    androidx.work.impl.constraints.trackers.g gVar3 = (androidx.work.impl.constraints.trackers.g) this.b;
                    synchronized (gVar3.g) {
                        if (gVar3.h == z) {
                            return;
                        }
                        gVar3.h = z;
                        ((androidx.work.impl.constraints.trackers.g) this.b).d(new g(gVar2.a, gVar2.b, gVar2.c, gVar2.d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) throws Exception {
        int i = this.a;
        network.getClass();
        networkCapabilities.getClass();
        switch (i) {
            case 0:
                y.e().a(j.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((r0) this.b).invoke(a.a);
                break;
            default:
                y.e().a(androidx.work.impl.constraints.trackers.f.a, "Network capabilities changed: " + networkCapabilities);
                androidx.work.impl.constraints.trackers.g gVar = (androidx.work.impl.constraints.trackers.g) this.b;
                gVar.d(androidx.work.impl.constraints.trackers.f.a(gVar.f, gVar.h));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) throws Exception {
        int i = this.a;
        network.getClass();
        switch (i) {
            case 0:
                y.e().a(j.a, "NetworkRequestConstraintController onLost callback");
                ((r0) this.b).invoke(new b(7));
                break;
            default:
                y.e().a(androidx.work.impl.constraints.trackers.f.a, "Network connection lost");
                ((androidx.work.impl.constraints.trackers.g) this.b).d(new g(false, false, false, false, false));
                break;
        }
    }

    public d(r0 r0Var) {
        this.b = r0Var;
    }
}
