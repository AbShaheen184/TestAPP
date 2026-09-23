package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.l;
import kotlin.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ConnectivityManager.NetworkCallback {
    public static final i a = new i();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static boolean a(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = f;
        bool.getClass();
        return !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    public static void b() {
        ArrayList<k> arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    for (Map.Entry entry : c.entrySet()) {
                        l lVar = (l) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        i iVar = a;
                        NetworkCapabilities networkCapabilities = d;
                        iVar.getClass();
                        arrayList.add(new k(lVar, a(networkRequest, networkCapabilities) ? a.a : new b(7)));
                    }
                    for (k kVar : arrayList) {
                        ((l) kVar.e).invoke((c) kVar.y);
                    }
                    return;
                }
                y.e().a(j.a, "Not dispatching constraint state yet: isBlocked=" + f + ", capabilitiesInitialized=" + e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        y.e().a(j.a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (b) {
            if (kotlin.jvm.internal.l.a(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        y.e().a(j.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        y.e().a(j.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((l) it.next()).invoke(new b(7));
            }
        }
    }
}
