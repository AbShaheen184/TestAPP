package androidx.work.impl.utils;

import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static int[] a(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] capabilities = networkRequest.getCapabilities();
        capabilities.getClass();
        return capabilities;
    }

    public static int[] b(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] transportTypes = networkRequest.getTransportTypes();
        transportTypes.getClass();
        return transportTypes;
    }
}
