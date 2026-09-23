package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static volatile l a;
    public static final l b;

    static {
        l lVar = new l();
        Map map = Collections.EMPTY_MAP;
        b = lVar;
    }

    public static l a() {
        l lVar;
        r0 r0Var = r0.c;
        l lVar2 = a;
        if (lVar2 != null) {
            return lVar2;
        }
        synchronized (l.class) {
            try {
                lVar = a;
                if (lVar == null) {
                    Class cls = k.a;
                    l lVar3 = null;
                    if (cls != null) {
                        try {
                            lVar3 = (l) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    lVar = lVar3 != null ? lVar3 : b;
                    a = lVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }
}
