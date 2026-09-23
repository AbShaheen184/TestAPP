package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import java.util.Arrays;
import java.util.Map;
import kotlin.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final androidx.savedstate.internal.a a;
    public final e b;

    public f(androidx.savedstate.internal.a aVar) {
        this.a = aVar;
        this.b = new e(aVar);
    }

    public final void a() {
        this.a.a();
    }

    public final void b(Bundle bundle) {
        androidx.savedstate.internal.a aVar = this.a;
        g gVar = aVar.a;
        if (!aVar.e) {
            aVar.a();
        }
        if (((x) gVar.getLifecycle()).d.compareTo(o.A) >= 0) {
            kotlinx.coroutines.future.a.e(((x) gVar.getLifecycle()).d, "performRestore cannot be called when owner is ");
            return;
        }
        if (aVar.g) {
            kotlinx.coroutines.future.a.u("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                coil3.svg.internal.a.D("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        aVar.f = bundle2;
        aVar.g = true;
    }

    public final void c(Bundle bundle) {
        androidx.savedstate.internal.a aVar = this.a;
        Bundle bundleF = coil3.network.g.f((k[]) Arrays.copyOf(new k[0], 0));
        Bundle bundle2 = aVar.f;
        if (bundle2 != null) {
            bundleF.putAll(bundle2);
        }
        synchronized (aVar.c) {
            for (Map.Entry entry : aVar.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((d) entry.getValue()).a();
                str.getClass();
                bundleF.putBundle(str, bundleA);
            }
        }
        if (bundleF.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleF);
    }
}
