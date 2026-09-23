package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED = false;

    static {
        try {
            Class.forName("android.os.Build");
        } catch (Throwable unused) {
        }
    }

    public static final boolean getANDROID_DETECTED() {
        return true;
    }
}
