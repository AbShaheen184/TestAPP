package com.google.android.gms.internal.measurement;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends e {
    public static final f1 b;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            h.class.getName().equals(a());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        b = new f1(4);
    }

    public static String a() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
