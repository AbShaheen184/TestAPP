package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends e {
    public final Executor a;

    public o(Executor executor) {
        this.a = executor;
    }

    @Override // retrofit2.e
    public final f a(Type type, Annotation[] annotationArr) {
        if (z0.h(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new com.google.android.material.internal.k(27, z0.g(0, (ParameterizedType) type), z0.k(annotationArr, u0.class) ? null : this.a);
        }
        kotlinx.coroutines.future.a.q("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
