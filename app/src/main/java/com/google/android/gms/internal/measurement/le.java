package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class le {
    public final String a;
    public final com.google.common.util.concurrent.s b;
    public final androidx.compose.ui.node.a1 c;
    public final com.google.android.material.internal.k d;
    public final com.caverock.androidsvg.x1 e;
    public final com.caverock.androidsvg.x1 f = new com.caverock.androidsvg.x1(new j5(this));
    public final Object g;
    public final f1 h;
    public List i;

    public le(androidx.compose.ui.node.a1 a1Var, com.google.common.util.concurrent.s sVar) {
        Object obj = new Object();
        this.g = obj;
        this.i = new ArrayList();
        this.c = a1Var;
        this.b = sVar;
        this.a = (String) a1Var.b;
        this.e = new com.caverock.androidsvg.x1(new oe(a1Var, 1));
        this.d = new com.google.android.material.internal.k(3);
        this.h = new f1(19);
        kc kcVar = new kc(this, 4);
        synchronized (obj) {
            this.i.add(kcVar);
        }
    }

    public final com.google.common.util.concurrent.t a(nc ncVar, com.google.common.util.concurrent.v0 v0Var) throws Throwable {
        kc kcVar = new kc(ncVar, 3);
        int i = rf.a;
        xc xcVar = new xc(4, bf.a(), kcVar);
        androidx.room.t tVar = tf.a;
        _COROUTINE.a.v(tVar, "ticker");
        tVar.A();
        String strConcat = "Update ".concat(String.valueOf(this.a));
        this.h.getClass();
        jf jfVarE = f1.e(strConcat);
        try {
            com.google.common.util.concurrent.r rVarX0 = this.f.x0();
            com.google.android.material.internal.k kVar = this.d;
            s5 s5Var = new s5(rVarX0, 17);
            com.google.common.util.concurrent.d0 d0Var = com.google.common.util.concurrent.d0.e;
            kVar.D(s5Var, d0Var);
            try {
                ListenableFuture listenableFutureD = kVar.D(rf.a(new b7(this, rVarX0, xcVar, v0Var, 3)), d0Var);
                com.google.common.util.concurrent.m0.propagateCancellation(listenableFutureD, rVarX0);
                com.google.common.util.concurrent.m0.e(this.b);
                com.google.common.util.concurrent.t tVarF = com.google.common.util.concurrent.m0.f(listenableFutureD, new com.google.common.base.e(), d0Var);
                jfVarE.a(tVarF);
                jfVarE.close();
                return tVarF;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    jfVarE.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
