package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface z4 {
    static d5 k(z4 z4Var, g5 g5Var, b7 b7Var, ArrayList arrayList) {
        String str = g5Var.e;
        if (z4Var.i(str)) {
            d5 d5VarC = z4Var.c(str);
            if (d5VarC instanceof c4) {
                return ((c4) d5VarC).a(b7Var, arrayList);
            }
            kotlinx.coroutines.future.a.q(androidx.constraintlayout.core.g.c(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            ea.c("hasOwnProperty", 1, arrayList);
            return z4Var.i(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).e()) ? d5.r : d5.s;
        }
        kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.i("Object has no function ", str));
        return null;
    }

    d5 c(String str);

    void f(String str, d5 d5Var);

    boolean i(String str);
}
