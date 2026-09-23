package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    public static final /* synthetic */ y0 a = new y0();
    public static final NativeSharedCounter b;

    static {
        System.loadLibrary("datastore_shared_counter");
        b = new NativeSharedCounter();
    }
}
