package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements androidx.savedstate.d {
    public final androidx.savedstate.e a;
    public boolean b;
    public Bundle c;
    public final kotlin.o d;

    public n0(androidx.savedstate.e eVar, y0 y0Var) {
        eVar.getClass();
        this.a = eVar;
        this.d = new kotlin.o(new androidx.activity.w(y0Var, 28));
    }

    @Override // androidx.savedstate.d
    public final Bundle a() {
        Bundle bundleF = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleF.putAll(bundle);
        }
        for (Map.Entry entry : ((o0) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((androidx.activity.g) ((j0) entry.getValue()).b.B).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleF.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleF;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleF = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleF.putAll(bundle);
        }
        if (bundleA != null) {
            bundleF.putAll(bundleA);
        }
        this.c = bundleF;
        this.b = true;
    }
}
