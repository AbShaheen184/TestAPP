package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements u0 {
    public final Application a;
    public final t0 b;
    public final Bundle c;
    public final p d;
    public final androidx.savedstate.e e;

    public p0(Application application, androidx.savedstate.g gVar, Bundle bundle) {
        t0 t0Var;
        this.e = gVar.getSavedStateRegistry();
        this.d = gVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (t0.c == null) {
                t0.c = new t0(application);
            }
            t0Var = t0.c;
            t0Var.getClass();
        } else {
            t0Var = new t0(null);
        }
        this.b = t0Var;
    }

    @Override // androidx.lifecycle.u0
    public final s0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        kotlinx.coroutines.future.a.q("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // androidx.lifecycle.u0
    public final s0 b(Class cls, androidx.lifecycle.viewmodel.e eVar) {
        LinkedHashMap linkedHashMap = eVar.a;
        String str = (String) linkedHashMap.get(w0.b);
        if (str == null) {
            kotlinx.coroutines.future.a.u("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(m0.a) == null || linkedHashMap.get(m0.b) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            kotlinx.coroutines.future.a.u("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(t0.d);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? q0.a(cls, q0.b) : q0.a(cls, q0.a);
        if (constructorA == null) {
            return this.b.b(cls, eVar);
        }
        return (!zIsAssignableFrom || application == null) ? q0.b(cls, constructorA, m0.b(eVar)) : q0.b(cls, constructorA, application, m0.b(eVar));
    }

    @Override // androidx.lifecycle.u0
    public final s0 c(kotlin.jvm.internal.e eVar, androidx.lifecycle.viewmodel.e eVar2) {
        Class clsA = eVar.a();
        clsA.getClass();
        return b(clsA, eVar2);
    }

    public final s0 d(Class cls, String str) {
        j0 j0Var;
        p pVar = this.d;
        if (pVar == null) {
            com.google.firebase.platforminfo.b.n("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? q0.a(cls, q0.b) : q0.a(cls, q0.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (v0.a == null) {
                v0.a = new v0();
            }
            v0.a.getClass();
            return android.support.v4.media.session.b.j(cls);
        }
        androidx.savedstate.e eVar = this.e;
        eVar.getClass();
        Bundle bundleA = eVar.a(str);
        if (bundleA == null) {
            bundleA = this.c;
        }
        if (bundleA == null) {
            j0Var = new j0();
        } else {
            ClassLoader classLoader = j0.class.getClassLoader();
            classLoader.getClass();
            bundleA.setClassLoader(classLoader);
            kotlin.collections.builders.f fVar = new kotlin.collections.builders.f(bundleA.size());
            for (String str2 : bundleA.keySet()) {
                str2.getClass();
                fVar.put(str2, bundleA.get(str2));
            }
            j0Var = new j0(fVar.b());
        }
        k0 k0Var = new k0(str, j0Var);
        k0Var.L(pVar, eVar);
        o oVar = ((x) pVar).d;
        if (oVar == o.y || oVar.compareTo(o.A) >= 0) {
            eVar.d();
        } else {
            pVar.a(new androidx.activity.b0(pVar, eVar));
        }
        s0 s0VarB = (!zIsAssignableFrom || application == null) ? q0.b(cls, constructorA, j0Var) : q0.b(cls, constructorA, application, j0Var);
        s0VarB.a("androidx.lifecycle.savedstate.vm.tag", k0Var);
        return s0VarB;
    }

    public p0() {
        this.b = new t0(null);
    }
}
