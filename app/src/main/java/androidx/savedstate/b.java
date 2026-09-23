package androidx.savedstate;

import android.os.Bundle;
import androidx.activity.p;
import androidx.compose.runtime.j;
import androidx.lifecycle.m0;
import androidx.lifecycle.n;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.media3.exoplayer.source.t0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements t {
    public final /* synthetic */ int e;
    public final g y;

    public /* synthetic */ b(g gVar, int i) {
        this.e = i;
        this.y = gVar;
    }

    @Override // androidx.lifecycle.t
    public final void g(v vVar, n nVar) {
        switch (this.e) {
            case 0:
                if (nVar != n.ON_CREATE) {
                    kotlinx.coroutines.future.a.o("Next event must be ON_CREATE");
                    return;
                }
                vVar.getLifecycle().b(this);
                g gVar = this.y;
                Bundle bundleA = gVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    kotlinx.coroutines.future.a.u("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(gVar instanceof y0)) {
                                    kotlinx.coroutines.future.a.e(gVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                x0 viewModelStore = ((y0) gVar).getViewModelStore();
                                e savedStateRegistry = gVar.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    str2.getClass();
                                    s0 s0Var = (s0) linkedHashMap.get(str2);
                                    if (s0Var != null) {
                                        m0.a(s0Var, savedStateRegistry, gVar.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                t0.j(j.i("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        t0.j(androidx.privacysandbox.ads.adservices.java.internal.a.r("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            default:
                p pVar = (p) this.y;
                p.access$ensureViewModelStore(pVar);
                pVar.getLifecycle().b(this);
                return;
        }
    }
}
