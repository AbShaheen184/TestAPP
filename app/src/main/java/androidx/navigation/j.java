package androidx.navigation;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final com.google.android.gms.cloudmessaging.n a;

    public j(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(j.class.getClassLoader());
        bundle.getClass();
        com.google.android.gms.cloudmessaging.n nVar = new com.google.android.gms.cloudmessaging.n();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            coil3.svg.internal.a.D("nav-entry-state:id");
            throw null;
        }
        nVar.y = string;
        nVar.e = coil3.network.g.r("nav-entry-state:destination-id", bundle);
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            coil3.svg.internal.a.D("nav-entry-state:args");
            throw null;
        }
        nVar.z = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 == null) {
            coil3.svg.internal.a.D("nav-entry-state:saved-state");
            throw null;
        }
        nVar.A = bundle3;
        this.a = nVar;
    }

    public j(i iVar) {
        int i = iVar.y.y.a;
        com.google.android.gms.cloudmessaging.n nVar = new com.google.android.gms.cloudmessaging.n();
        nVar.y = iVar.C;
        nVar.e = i;
        androidx.navigation.internal.c cVar = iVar.E;
        nVar.z = cVar.a();
        Bundle bundleF = coil3.network.g.f((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
        nVar.A = bundleF;
        cVar.h.c(bundleF);
        this.a = nVar;
    }
}
