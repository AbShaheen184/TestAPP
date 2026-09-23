package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class a implements m {
    public final /* synthetic */ int e;
    public static final a y = new a(0);
    public static final a z = new a(1);
    public static final a A = new a(2);
    public static final a B = new a(3);
    public static final a C = new a(4);
    public static final a D = new a(5);

    public /* synthetic */ a(int i) {
        this.e = i;
    }

    public List a(Executor executor) {
        return Collections.singletonList(new o(executor));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }

    @Override // retrofit2.m
    public Object c(Object obj) {
        switch (this.e) {
            case 0:
                return obj.toString();
            case 1:
                okhttp3.j0 j0Var = (okhttp3.j0) obj;
                try {
                    okio.f fVar = new okio.f();
                    j0Var.P().O(fVar);
                    return new okhttp3.i0(j0Var.x(), j0Var.n(), fVar);
                } finally {
                    j0Var.close();
                }
            case 2:
                return (okhttp3.e0) obj;
            case 3:
                return (okhttp3.j0) obj;
            case 4:
                ((okhttp3.j0) obj).close();
                return kotlin.y.a;
            default:
                ((okhttp3.j0) obj).close();
                return null;
        }
    }

    public String d(int i, Method method) {
        return "parameter #" + (i + 1);
    }

    public Object e(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean f(Method method) {
        return false;
    }
}
