package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {
    public static final List a = kotlin.collections.q.k(Application.class, j0.class);
    public static final List b = kotlin.collections.q.j(j0.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listC = kotlin.collections.o.C(parameterTypes);
            if (list.equals(listC)) {
                return constructor;
            }
            if (list.size() == listC.size() && listC.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final s0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (s0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            androidx.core.graphics.b.c("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            androidx.media3.exoplayer.source.t0.j("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
