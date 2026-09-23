package retrofit2;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends a {
    @Override // retrofit2.a
    public final Object e(Method method, Class cls, Object obj, Object[] objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.a(method, cls, obj, objArr);
        }
        com.google.firebase.platforminfo.b.n("Calling default methods on API 24 and 25 is not supported");
        return null;
    }

    @Override // retrofit2.a
    public final boolean f(Method method) {
        return method.isDefault();
    }
}
