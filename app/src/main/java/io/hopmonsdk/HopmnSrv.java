package io.hopmonsdk;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class HopmnSrv {
    static {
        try {
            System.loadLibrary("hopmn");
            Log.d("HopmnProxy", "Library loaded");
        } catch (UnsatisfiedLinkError e) {
            Log.e("HopmnProxy", "Failed to load native library", e);
        }
    }

    public static native void reload();

    public static native int start(String[] strArr);

    public static native void stop();
}
