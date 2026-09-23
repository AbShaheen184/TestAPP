package coil3.network;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.c0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final o b = new o(c0.o(new LinkedHashMap()));
    public final Map a;

    public o(Map map) {
        this.a = map;
    }

    public final String a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List list = (List) this.a.get(lowerCase);
        if (list != null) {
            return (String) kotlin.collections.p.K(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.a.equals(((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.a + ")";
    }
}
