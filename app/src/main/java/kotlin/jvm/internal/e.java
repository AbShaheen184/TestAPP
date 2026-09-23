package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements kotlin.reflect.c, d {
    public static final Map y;
    public final Class e;

    static {
        List listK = kotlin.collections.q.k(kotlin.jvm.functions.a.class, kotlin.jvm.functions.l.class, kotlin.jvm.functions.p.class, kotlin.jvm.functions.q.class, kotlin.jvm.functions.r.class, kotlin.jvm.functions.s.class, kotlin.jvm.functions.t.class, kotlin.jvm.functions.u.class, kotlin.jvm.functions.v.class, kotlin.jvm.functions.w.class, kotlin.jvm.functions.b.class, kotlin.jvm.functions.c.class, kotlin.jvm.functions.d.class, kotlin.jvm.functions.e.class, kotlin.jvm.functions.f.class, kotlin.jvm.functions.g.class, kotlin.jvm.functions.h.class, kotlin.jvm.functions.i.class, kotlin.jvm.functions.j.class, kotlin.jvm.functions.k.class, kotlin.jvm.functions.m.class, kotlin.jvm.functions.n.class, kotlin.jvm.functions.o.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.p(listK, 10));
        int i = 0;
        for (Object obj : listK) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.q.o();
                throw null;
            }
            arrayList.add(new kotlin.k((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        y = kotlin.collections.c0.n(arrayList);
    }

    public e(Class cls) {
        cls.getClass();
        this.e = cls;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.e;
    }

    public final String b() {
        String strD;
        Class cls = this.e;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strD2 = c0.d(cls.getName());
            return strD2 == null ? cls.getCanonicalName() : strD2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strD = c0.d(componentType.getName())) != null) {
            strConcat = strD.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String strF;
        Class cls = this.e;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strF2 = c0.f(cls.getName());
                return strF2 == null ? cls.getSimpleName() : strF2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strF = c0.f(componentType.getName())) != null) {
                strConcat = strF.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return kotlin.text.k.W(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iG = kotlin.text.k.G(simpleName, '$', 0, 6);
            return iG == -1 ? simpleName : simpleName.substring(iG + 1, simpleName.length());
        }
        return kotlin.text.k.W(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean d(Object obj) {
        Class clsE = this.e;
        clsE.getClass();
        Map map = y;
        map.getClass();
        Integer num = (Integer) map.get(clsE);
        if (num != null) {
            return c0.e(num.intValue(), obj);
        }
        if (clsE.isPrimitive()) {
            clsE = kotlin.collections.c0.e(a0.a(clsE));
        }
        return clsE.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && kotlin.collections.c0.e(this).equals(kotlin.collections.c0.e((kotlin.reflect.c) obj));
    }

    public final int hashCode() {
        return kotlin.collections.c0.e(this).hashCode();
    }

    public final String toString() {
        return this.e.toString() + " (Kotlin reflection is not available)";
    }
}
