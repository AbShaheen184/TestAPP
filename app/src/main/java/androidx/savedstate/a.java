package androidx.savedstate;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.collections.p;
import kotlin.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {
    public final LinkedHashSet a = new LinkedHashSet();

    public a(e eVar) {
        eVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // androidx.savedstate.d
    public final Bundle a() {
        Bundle bundleF = coil3.network.g.f((k[]) Arrays.copyOf(new k[0], 0));
        com.google.android.gms.dynamite.g.M(bundleF, "classes_to_restore", p.b0(this.a));
        return bundleF;
    }
}
