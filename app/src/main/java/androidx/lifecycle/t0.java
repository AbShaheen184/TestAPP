package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends v0 {
    public static t0 c;
    public static final com.google.android.material.shape.f d = new com.google.android.material.shape.f(8);
    public final Application b;

    public t0(Application application) {
        this.b = application;
    }

    @Override // androidx.lifecycle.v0, androidx.lifecycle.u0
    public final s0 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        com.google.firebase.platforminfo.b.n("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // androidx.lifecycle.v0, androidx.lifecycle.u0
    public final s0 b(Class cls, androidx.lifecycle.viewmodel.e eVar) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) eVar.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!a.class.isAssignableFrom(cls)) {
            return android.support.v4.media.session.b.j(cls);
        }
        kotlinx.coroutines.future.a.q("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final s0 d(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return android.support.v4.media.session.b.j(cls);
        }
        try {
            s0 s0Var = (s0) cls.getConstructor(Application.class).newInstance(application);
            s0Var.getClass();
            return s0Var;
        } catch (IllegalAccessException e) {
            androidx.core.graphics.b.c("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            androidx.core.graphics.b.c("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            androidx.core.graphics.b.c("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            androidx.core.graphics.b.c("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
