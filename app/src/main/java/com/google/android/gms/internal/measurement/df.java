package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class df extends c4 {
    public final HashMap A;
    public final s5 z;

    public df(s5 s5Var) {
        super("require");
        this.A = new HashMap();
        this.z = s5Var;
    }

    @Override // com.google.android.gms.internal.measurement.c4
    public final d5 a(b7 b7Var, List list) {
        d5 d5Var;
        ea.c("require", 1, list);
        String strE = ((j5) b7Var.z).f(b7Var, (d5) list.get(0)).e();
        HashMap map = this.A;
        if (map.containsKey(strE)) {
            return (d5) map.get(strE);
        }
        HashMap map2 = (HashMap) this.z.y;
        if (map2.containsKey(strE)) {
            try {
                d5Var = (d5) ((Callable) map2.get(strE)).call();
            } catch (Exception unused) {
                kotlinx.coroutines.future.a.u("Failed to create API implementation: ".concat(String.valueOf(strE)));
                return null;
            }
        } else {
            d5Var = d5.m;
        }
        if (d5Var instanceof c4) {
            map.put(strE, (c4) d5Var);
        }
        return d5Var;
    }
}
