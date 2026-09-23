package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public static final androidx.work.impl.model.f b = new androidx.work.impl.model.f(9);
    public final Object a;

    public w0(x0 x0Var, u0 u0Var, androidx.lifecycle.viewmodel.c cVar) {
        x0Var.getClass();
        u0Var.getClass();
        cVar.getClass();
        this.a = new com.google.firebase.messaging.n(x0Var, u0Var, cVar);
    }

    public s0 a(kotlin.jvm.internal.e eVar) {
        com.google.firebase.messaging.n nVar = (com.google.firebase.messaging.n) this.a;
        String strB = eVar.b();
        if (strB != null) {
            return nVar.z("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), eVar);
        }
        kotlinx.coroutines.future.a.q("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public w0() {
        this.a = new AtomicReference(null);
    }

    public w0(f0 f0Var) {
        this.a = f0Var;
    }
}
