package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.b0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.u0;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements ComponentCallbacks, View.OnCreateContextMenuListener, v, y0, androidx.lifecycle.j, androidx.savedstate.g {
    public static final Object G = null;
    public x C;
    public androidx.savedstate.f D;
    public final ArrayList E;
    public final com.google.firebase.platforminfo.d F;
    public final int e = -1;
    public final String y = UUID.randomUUID().toString();
    public final h z = new h(0);
    public final boolean A = true;
    public final o B = o.B;

    public d() {
        new b0();
        new AtomicInteger();
        this.E = new ArrayList();
        this.F = new com.google.firebase.platforminfo.d(this);
        this.C = new x(this, true);
        this.D = new androidx.savedstate.f(new androidx.savedstate.internal.a(this, new androidx.navigation.internal.h(this, 6)));
        ArrayList arrayList = this.E;
        com.google.firebase.platforminfo.d dVar = this.F;
        if (arrayList.contains(dVar)) {
            return;
        }
        if (this.e < 0) {
            arrayList.add(dVar);
            return;
        }
        d dVar2 = (d) dVar.e;
        dVar2.D.a();
        m0.c(dVar2);
    }

    public final h a() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View b() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // androidx.lifecycle.j
    public final androidx.lifecycle.viewmodel.c getDefaultViewModelCreationExtras() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.j
    public final u0 getDefaultViewModelProviderFactory() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.v
    public final p getLifecycle() {
        return this.C;
    }

    @Override // androidx.savedstate.g
    public final androidx.savedstate.e getSavedStateRegistry() {
        return this.D.b;
    }

    @Override // androidx.lifecycle.y0
    public final x0 getViewModelStore() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.y);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
