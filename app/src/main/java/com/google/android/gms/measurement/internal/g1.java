package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.lb;
import com.google.android.gms.internal.measurement.y9;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ g1(i1 i1Var, String str, int i) {
        this.a = i;
        this.b = i1Var;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.a) {
            case 0:
                return new y9(new g1(this.b, this.c, 1));
            case 1:
                i1 i1Var = this.b;
                m mVar = i1Var.y.z;
                j4.U(mVar);
                String str = this.c;
                z0 z0VarZ0 = mVar.z0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((p1) i1Var.e).A.B();
                map.put("gmp_version", 161000L);
                if (z0VarZ0 != null) {
                    String strO = z0VarZ0.O();
                    if (strO != null) {
                        map.put("app_version", strO);
                    }
                    map.put("app_version_int", Long.valueOf(z0VarZ0.Q()));
                    map.put("dynamite_version", Long.valueOf(z0VarZ0.b()));
                }
                return map;
            default:
                androidx.work.impl.k kVar = new androidx.work.impl.k(26, this.b, this.c, false);
                lb lbVar = new lb("internal.remoteConfig", 0);
                lbVar.y.put("getValue", new y9(lbVar, kVar));
                return lbVar;
        }
    }
}
