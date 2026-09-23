package kotlin.collections;

import java.io.EOFException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlinx.serialization.internal.u0;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final int a(int i) {
        return ((i & 65535) << 8) | 7;
    }

    public static final int b(String str, org.mozilla.classfile.h hVar) {
        if (str.length() != 1) {
            return a(hVar.a(str));
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return 2;
        }
        if (cCharAt != 'S' && cCharAt != 'Z' && cCharAt != 'I') {
            if (cCharAt == 'J') {
                return 4;
            }
            switch (cCharAt) {
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                case Token.ENUM_NEXT /* 67 */:
                    break;
                case Token.ENUM_ID /* 68 */:
                    return 3;
                default:
                    kotlinx.coroutines.future.a.q("bad type");
                    return 0;
            }
        }
        return 1;
    }

    public static final kotlin.reflect.c c(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        if (eVar instanceof kotlinx.serialization.descriptors.b) {
            return null;
        }
        if (eVar instanceof u0) {
            return c(((u0) eVar).a);
        }
        return null;
    }

    public static final Class d(kotlin.reflect.c cVar) {
        cVar.getClass();
        Class clsA = ((kotlin.jvm.internal.d) cVar).a();
        clsA.getClass();
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class e(kotlin.reflect.c cVar) {
        cVar.getClass();
        Class clsA = ((kotlin.jvm.internal.d) cVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final String f(int i, org.mozilla.classfile.h hVar) {
        if ((i & 255) == 7) {
            return (String) hVar.k(i >>> 8);
        }
        kotlinx.coroutines.future.a.q("expecting object type");
        return null;
    }

    public static Object g(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static final boolean h(okio.f fVar) {
        fVar.getClass();
        try {
            okio.b0 b0Var = new okio.b0(new okio.y(fVar));
            for (long j = 0; j < 16 && !b0Var.a(); j++) {
                b0Var.R(1L);
                okio.f fVar2 = b0Var.y;
                byte bY = fVar2.Y(0L);
                if ((bY & 224) == 192) {
                    b0Var.R(2L);
                } else if ((bY & 240) == 224) {
                    b0Var.R(3L);
                } else if ((bY & 248) == 240) {
                    b0Var.R(4L);
                }
                int iJ0 = fVar2.j0();
                if (Character.isISOControl(iJ0) && !Character.isWhitespace(iJ0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean i(int i) {
        return i == 3 || i == 4;
    }

    public static int j(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map k(kotlin.k... kVarArr) {
        if (kVarArr.length <= 0) {
            return x.e;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j(kVarArr.length));
        m(linkedHashMap, kVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap l(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void m(HashMap map, kotlin.k[] kVarArr) {
        for (kotlin.k kVar : kVarArr) {
            map.put(kVar.e, kVar.y);
        }
    }

    public static Map n(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            return x.e;
        }
        if (size == 1) {
            kotlin.k kVar = (kotlin.k) list.get(0);
            kVar.getClass();
            Map mapSingletonMap = Collections.singletonMap(kVar.e, kVar.y);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.k kVar2 = (kotlin.k) it.next();
            linkedHashMap.put(kVar2.e, kVar2.y);
        }
        return linkedHashMap;
    }

    public static Map o(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return x.e;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static LinkedHashMap p(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static String q(int i, org.mozilla.classfile.h hVar) {
        int i2 = i & 255;
        switch (i2) {
            case 0:
                return "top";
            case 1:
                return "int";
            case 2:
                return "float";
            case 3:
                return "double";
            case 4:
                return "long";
            case 5:
                return "null";
            case 6:
                return "uninitialized_this";
            default:
                if (i2 == 7) {
                    return f(i, hVar);
                }
                if (i2 == 8) {
                    return "uninitialized";
                }
                kotlinx.coroutines.future.a.q("bad type");
                return null;
        }
    }
}
