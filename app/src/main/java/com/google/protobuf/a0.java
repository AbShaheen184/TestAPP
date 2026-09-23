package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static volatile a0 a;
    public static final a0 b;

    static {
        a0 a0Var = new a0();
        Map map = Collections.EMPTY_MAP;
        b = a0Var;
    }

    public static a0 a() {
        a0 a0Var;
        Class cls = d.a;
        a0 a0Var2 = a;
        if (a0Var2 != null) {
            return a0Var2;
        }
        synchronized (a0.class) {
            try {
                a0Var = a;
                if (a0Var == null) {
                    Class cls2 = z.a;
                    a0 a0Var3 = null;
                    if (cls2 != null) {
                        try {
                            a0Var3 = (a0) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    a0Var = a0Var3 != null ? a0Var3 : b;
                    a = a0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a0Var;
    }
}
