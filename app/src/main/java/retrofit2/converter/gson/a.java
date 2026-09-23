package retrofit2.converter.gson;

import com.google.android.gms.tasks.q;
import com.google.gson.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.l;
import retrofit2.m;
import retrofit2.t0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l {
    public final e a;

    public a(e eVar) {
        this.a = eVar;
    }

    public static a c() {
        return new a(new e());
    }

    @Override // retrofit2.l
    public final m a(Type type) {
        com.google.gson.reflect.a aVar = new com.google.gson.reflect.a(type);
        e eVar = this.a;
        return new b(eVar, eVar.e(aVar));
    }

    @Override // retrofit2.l
    public final m b(Type type, Annotation[] annotationArr, t0 t0Var) {
        com.google.gson.m mVarE = this.a.e(new com.google.gson.reflect.a(type));
        q qVar = new q();
        qVar.e = mVarE;
        return qVar;
    }
}
