package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.app.mlounge.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static final androidx.work.impl.model.f b;
    public static final com.google.android.gms.common.internal.k c;
    public static final com.google.firebase.heartbeatinfo.e a = new com.google.firebase.heartbeatinfo.e(7);
    public static final androidx.lifecycle.viewmodel.internal.c d = new androidx.lifecycle.viewmodel.internal.c();

    static {
        int i = 8;
        b = new androidx.work.impl.model.f(i);
        c = new com.google.android.gms.common.internal.k(i);
    }

    public static final void a(s0 s0Var, androidx.savedstate.e eVar, p pVar) {
        eVar.getClass();
        pVar.getClass();
        k0 k0Var = (k0) s0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (k0Var == null || k0Var.z) {
            return;
        }
        k0Var.L(pVar, eVar);
        o oVar = ((x) pVar).d;
        if (oVar == o.y || oVar.compareTo(o.A) >= 0) {
            eVar.d();
        } else {
            pVar.a(new androidx.activity.b0(pVar, eVar));
        }
    }

    public static final j0 b(androidx.lifecycle.viewmodel.c cVar) {
        j0 j0Var;
        cVar.getClass();
        androidx.savedstate.g gVar = (androidx.savedstate.g) cVar.a(a);
        if (gVar == null) {
            kotlinx.coroutines.future.a.q("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        y0 y0Var = (y0) cVar.a(b);
        if (y0Var == null) {
            kotlinx.coroutines.future.a.q("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) cVar.a(c);
        String str = (String) cVar.a(w0.b);
        if (str == null) {
            kotlinx.coroutines.future.a.q("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        androidx.savedstate.d dVarB = gVar.getSavedStateRegistry().b();
        Bundle bundle2 = null;
        n0 n0Var = dVarB instanceof n0 ? (n0) dVarB : null;
        if (n0Var == null) {
            kotlinx.coroutines.future.a.u("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = f(y0Var).b;
        j0 j0Var2 = (j0) linkedHashMap.get(str);
        if (j0Var2 != null) {
            return j0Var2;
        }
        n0Var.b();
        Bundle bundle3 = n0Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                n0Var.c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            j0Var = new j0();
        } else {
            ClassLoader classLoader = j0.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            kotlin.collections.builders.f fVar = new kotlin.collections.builders.f(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                fVar.put(str2, bundle.get(str2));
            }
            j0Var = new j0(fVar.b());
        }
        linkedHashMap.put(str, j0Var);
        return j0Var;
    }

    public static final void c(androidx.savedstate.g gVar) {
        o oVar = ((x) gVar.getLifecycle()).d;
        if (oVar != o.y && oVar != o.z) {
            kotlinx.coroutines.future.a.q("Failed requirement.");
        } else if (gVar.getSavedStateRegistry().b() == null) {
            n0 n0Var = new n0(gVar.getSavedStateRegistry(), (y0) gVar);
            gVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", n0Var);
            gVar.getLifecycle().a(new e(n0Var, 1));
        }
    }

    public static final v d(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            v vVar = tag instanceof v ? (v) tag : null;
            if (vVar != null) {
                return vVar;
            }
            Object objP = android.support.v4.media.session.b.p(view);
            view = objP instanceof View ? (View) objP : null;
        }
        return null;
    }

    public static final y0 e(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            y0 y0Var = tag instanceof y0 ? (y0) tag : null;
            if (y0Var != null) {
                return y0Var;
            }
            Object objP = android.support.v4.media.session.b.p(view);
            view = objP instanceof View ? (View) objP : null;
        }
        return null;
    }

    public static final o0 f(y0 y0Var) {
        w0 w0VarB = com.google.firebase.heartbeatinfo.e.b(y0Var, new l0(), 4);
        return (o0) ((com.google.firebase.messaging.n) w0VarB.a).z("androidx.lifecycle.internal.SavedStateHandlesVM", kotlin.jvm.internal.a0.a(o0.class));
    }

    public static final androidx.lifecycle.viewmodel.internal.a g(s0 s0Var) {
        androidx.lifecycle.viewmodel.internal.a aVar;
        s0Var.getClass();
        synchronized (d) {
            aVar = (androidx.lifecycle.viewmodel.internal.a) s0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                kotlin.coroutines.j immediate = kotlin.coroutines.k.e;
                try {
                    immediate = Dispatchers.getMain().getImmediate();
                } catch (IllegalStateException | kotlin.j unused) {
                }
                androidx.lifecycle.viewmodel.internal.a aVar2 = new androidx.lifecycle.viewmodel.internal.a(immediate.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
                s0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }
}
