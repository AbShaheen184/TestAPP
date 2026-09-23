package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.m0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.lifecycle.v, y0, androidx.lifecycle.j, androidx.savedstate.g {
    public androidx.lifecycle.o A;
    public final m B;
    public final String C;
    public final Bundle D;
    public final androidx.navigation.internal.c E = new androidx.navigation.internal.c(this);
    public final androidx.media3.exoplayer.mediacodec.g e;
    public t y;
    public final Bundle z;

    public i(androidx.media3.exoplayer.mediacodec.g gVar, t tVar, Bundle bundle, androidx.lifecycle.o oVar, m mVar, String str, Bundle bundle2) {
        this.e = gVar;
        this.y = tVar;
        this.z = bundle;
        this.A = oVar;
        this.B = mVar;
        this.C = str;
        this.D = bundle2;
        new kotlin.o(new androidx.activity.w(this, 29));
    }

    public final void a(androidx.lifecycle.o oVar) {
        androidx.navigation.internal.c cVar = this.E;
        cVar.getClass();
        cVar.k = oVar;
        cVar.b();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            Bundle bundle = iVar.z;
            if (kotlin.jvm.internal.l.a(this.C, iVar.C) && kotlin.jvm.internal.l.a(this.y, iVar.y) && kotlin.jvm.internal.l.a(this.E.j, iVar.E.j) && kotlin.jvm.internal.l.a(getSavedStateRegistry(), iVar.getSavedStateRegistry())) {
                Bundle bundle2 = this.z;
                if (kotlin.jvm.internal.l.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!kotlin.jvm.internal.l.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    @Override // androidx.lifecycle.j
    public final androidx.lifecycle.viewmodel.c getDefaultViewModelCreationExtras() {
        Application application;
        androidx.navigation.internal.c cVar = this.E;
        cVar.getClass();
        androidx.lifecycle.viewmodel.e eVar = new androidx.lifecycle.viewmodel.e(0);
        com.google.firebase.heartbeatinfo.e eVar2 = m0.a;
        i iVar = cVar.a;
        LinkedHashMap linkedHashMap = eVar.a;
        linkedHashMap.put(eVar2, iVar);
        linkedHashMap.put(m0.b, iVar);
        Bundle bundleA = cVar.a();
        if (bundleA != null) {
            linkedHashMap.put(m0.c, bundleA);
        }
        androidx.media3.exoplayer.mediacodec.g gVar = this.e;
        if (gVar == null) {
            application = null;
        } else {
            Context context = gVar.e;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(t0.d, application2);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.j
    public final u0 getDefaultViewModelProviderFactory() {
        return this.E.l;
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.p getLifecycle() {
        return this.E.j;
    }

    @Override // androidx.savedstate.g
    public final androidx.savedstate.e getSavedStateRegistry() {
        return this.E.h.b;
    }

    @Override // androidx.lifecycle.y0
    public final x0 getViewModelStore() {
        androidx.navigation.internal.c cVar = this.E;
        if (!cVar.i) {
            kotlinx.coroutines.future.a.u("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (cVar.j.d == androidx.lifecycle.o.e) {
            kotlinx.coroutines.future.a.u("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        m mVar = cVar.e;
        if (mVar == null) {
            kotlinx.coroutines.future.a.u("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = cVar.f;
        str.getClass();
        LinkedHashMap linkedHashMap = mVar.b;
        x0 x0Var = (x0) linkedHashMap.get(str);
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0Var2 = new x0();
        linkedHashMap.put(str, x0Var2);
        return x0Var2;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.y.hashCode() + (this.C.hashCode() * 31);
        Bundle bundle = this.z;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.E.j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.E.toString();
    }
}
