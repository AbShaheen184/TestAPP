package com.google.firebase;

import com.caverock.androidsvg.x1;
import com.google.firebase.components.r;
import java.util.concurrent.Executor;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements com.google.firebase.components.e {
    public final /* synthetic */ int e;
    public static final h y = new h(0);
    public static final h z = new h(1);
    public static final h A = new h(2);
    public static final h B = new h(3);

    public /* synthetic */ h(int i) {
        this.e = i;
    }

    @Override // com.google.firebase.components.e
    public final Object g(x1 x1Var) {
        switch (this.e) {
            case 0:
                Object objF = x1Var.f(new r(com.google.firebase.annotations.concurrent.a.class, Executor.class));
                objF.getClass();
                return ExecutorsKt.from((Executor) objF);
            case 1:
                Object objF2 = x1Var.f(new r(com.google.firebase.annotations.concurrent.c.class, Executor.class));
                objF2.getClass();
                return ExecutorsKt.from((Executor) objF2);
            case 2:
                Object objF3 = x1Var.f(new r(com.google.firebase.annotations.concurrent.b.class, Executor.class));
                objF3.getClass();
                return ExecutorsKt.from((Executor) objF3);
            default:
                Object objF4 = x1Var.f(new r(com.google.firebase.annotations.concurrent.d.class, Executor.class));
                objF4.getClass();
                return ExecutorsKt.from((Executor) objF4);
        }
    }
}
