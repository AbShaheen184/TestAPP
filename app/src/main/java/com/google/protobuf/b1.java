package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public static t0 a(long j, Object obj) {
        t0 t0Var = (t0) l2.c.k(j, obj);
        if (((c) t0Var).e) {
            return t0Var;
        }
        int size = t0Var.size();
        t0 t0VarN = t0Var.n(size == 0 ? 10 : size * 2);
        l2.p(j, obj, t0VarN);
        return t0VarN;
    }
}
