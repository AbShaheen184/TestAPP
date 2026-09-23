package kotlinx.serialization.json.internal;

import kotlin.text.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final int a;

    static {
        Object lVar;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            property.getClass();
            lVar = r.w(property);
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        if (lVar instanceof kotlin.l) {
            lVar = null;
        }
        Integer num = (Integer) lVar;
        a = num != null ? num.intValue() : 2097152;
    }
}
