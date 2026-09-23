package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.d2;
import com.google.android.gms.measurement.internal.e2;
import com.google.android.material.behavior.d;
import com.google.android.material.internal.k;
import com.google.common.collect.k0;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.measurement.internal.e2
    public final void a(String str, String str2, Bundle bundle, long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k kVar = (k) obj;
                if (((HashSet) kVar.y).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    k0 k0Var = a.a;
                    String strG = d2.g(str2, d2.f, d2.a);
                    if (strG != null) {
                        str2 = strG;
                    }
                    bundle2.putString("events", str2);
                    ((k) kVar.z).x(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !a.a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((k) ((d) obj).e).x(3, bundle3);
                    break;
                }
                break;
        }
    }
}
