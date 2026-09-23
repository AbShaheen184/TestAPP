package androidx.work;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i b;
    public final HashMap a;

    static {
        i iVar = new i(new LinkedHashMap());
        android.support.v4.media.session.b.G(iVar);
        b = iVar;
    }

    public i(i iVar) {
        iVar.getClass();
        this.a = new HashMap(iVar.a);
    }

    public final String a(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean b(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && i.class.equals(obj.getClass())) {
                HashMap map = ((i) obj).a;
                HashMap map2 = this.a;
                Set<String> setKeySet = map2.keySet();
                if (kotlin.jvm.internal.l.a(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = kotlin.collections.o.d(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("Data {"), kotlin.collections.p.I(this.a.entrySet(), null, null, null, new androidx.navigation.compose.r(9), 31), "}");
    }

    public i(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.a = new HashMap(linkedHashMap);
    }
}
