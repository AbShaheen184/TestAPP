package androidx.lifecycle.compose;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.r1;
import androidx.compose.runtime.x2;
import androidx.lifecycle.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final r1 a;

    static {
        Object lVar;
        try {
            ClassLoader classLoader = v.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof r1) {
                        lVar = (r1) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof kotlin.c)) {
                    i++;
                }
                lVar = null;
                break;
            }
        } catch (Throwable th) {
            lVar = new l(th);
        }
        r1 x2Var = (r1) (lVar instanceof l ? null : lVar);
        if (x2Var == null) {
            x2Var = new x2(new c0(6));
        }
        a = x2Var;
    }
}
