package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public q1(j4 j4Var, r4 r4Var) {
        this.a = 2;
        this.c = r4Var;
        Objects.requireNonNull(j4Var);
        this.b = j4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.a) {
            case 0:
                w1 w1Var = (w1) this.b;
                w1Var.d.W();
                m mVar = w1Var.d.z;
                j4.U(mVar);
                return mVar.s0((String) this.c);
            case 1:
                w1 w1Var2 = (w1) this.b;
                w1Var2.d.W();
                return new i(w1Var2.d.q0(((r4) this.c).e));
            default:
                r4 r4Var = (r4) this.c;
                String str = r4Var.e;
                com.google.android.gms.common.internal.x.g(str);
                j4 j4Var = (j4) this.b;
                c2 c2VarD = j4Var.d(str);
                b2 b2Var = b2.ANALYTICS_STORAGE;
                if (c2VarD.i(b2Var) && c2.c(100, r4Var.P).i(b2Var)) {
                    return j4Var.d0(r4Var).F();
                }
                j4Var.b().K.a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public /* synthetic */ q1(w1 w1Var, Object obj, int i) {
        this.a = i;
        this.c = obj;
        this.b = w1Var;
    }
}
