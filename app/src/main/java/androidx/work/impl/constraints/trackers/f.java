package androidx.work.impl.constraints.trackers;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final String a = y.g("NetworkStateTracker");

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025 A[Catch: SecurityException -> 0x002c, TRY_LEAVE, TryCatch #3 {SecurityException -> 0x002c, blocks: (B:12:0x001b, B:14:0x0025), top: B:42:0x001b, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    public static final androidx.work.impl.constraints.g a(ConnectivityManager connectivityManager, boolean z) {
        boolean z2;
        SecurityException securityException;
        boolean zHasCapability;
        boolean z3;
        NetworkCapabilities networkCapabilities;
        String str = a;
        connectivityManager.getClass();
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z4 = true;
            if (activeNetworkInfo == null) {
                z4 = false;
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    zHasCapability = networkCapabilities.hasCapability(16);
                } else {
                    zHasCapability = false;
                }
                boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                z2 = z;
                return new androidx.work.impl.constraints.g(z4, zHasCapability, zIsActiveNetworkMetered, z3, z2);
            }
            try {
                if (!activeNetworkInfo.isConnected()) {
                    z4 = false;
                }
                try {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null) {
                        zHasCapability = networkCapabilities.hasCapability(16);
                    } else {
                        zHasCapability = false;
                    }
                } catch (SecurityException e) {
                    y.e().d(str, "Unable to validate active network", e);
                }
                boolean zIsActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                z2 = z;
                try {
                    return new androidx.work.impl.constraints.g(z4, zHasCapability, zIsActiveNetworkMetered2, z3, z2);
                } catch (SecurityException e2) {
                    e = e2;
                    securityException = e;
                    y.e().d(str, "Unable to get active network state", securityException);
                    return new androidx.work.impl.constraints.g(false, false, false, true, z2);
                }
            } catch (SecurityException e3) {
                securityException = e3;
                z2 = z;
            }
        } catch (SecurityException e4) {
            e = e4;
            z2 = z;
        }
        y.e().d(str, "Unable to get active network state", securityException);
        return new androidx.work.impl.constraints.g(false, false, false, true, z2);
    }
}
