package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends a {
    @Override // retrofit2.a
    public final String d(int i, Method method) {
        Parameter parameter = method.getParameters()[i];
        if (!parameter.isNamePresent()) {
            return super.d(i, method);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // retrofit2.a
    public final Object e(Method method, Class cls, Object obj, Object[] objArr) {
        return p.a(method, cls, obj, objArr);
    }

    @Override // retrofit2.a
    public final boolean f(Method method) {
        return method.isDefault();
    }
}
