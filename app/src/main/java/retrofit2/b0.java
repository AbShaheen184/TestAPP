package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends z0 {
    public final Method c;
    public final int d;
    public final m e;

    public b0(Method method, int i, m mVar) {
        this.c = method;
        this.d = i;
        this.e = mVar;
    }

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) {
        int i = this.d;
        Method method = this.c;
        if (obj == null) {
            throw z0.m(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            o0Var.k = (okhttp3.e0) this.e.c(obj);
        } catch (IOException e) {
            throw z0.n(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
