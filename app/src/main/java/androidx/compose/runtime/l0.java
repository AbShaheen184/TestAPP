package androidx.compose.runtime;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    public static final j0 a = new j0();

    public static final void a(Object obj, Object obj2, kotlin.jvm.functions.l lVar, s sVar) {
        boolean zF = sVar.f(obj) | sVar.f(obj2);
        Object objQ = sVar.Q();
        if (zF || objQ == n.a) {
            objQ = new h0(lVar);
            sVar.l0(objQ);
        }
    }

    public static final void b(Object obj, kotlin.jvm.functions.l lVar, s sVar) {
        boolean zF = sVar.f(obj);
        Object objQ = sVar.Q();
        if (zF || objQ == n.a) {
            objQ = new h0(lVar);
            sVar.l0(objQ);
        }
    }

    public static final void c(s sVar, Object obj, kotlin.jvm.functions.p pVar) {
        kotlin.coroutines.j jVar = sVar.R;
        boolean zF = sVar.f(obj);
        Object objQ = sVar.Q();
        if (zF || objQ == n.a) {
            objQ = new v0(jVar, pVar);
            sVar.l0(objQ);
        }
    }

    public static final void d(Object obj, Object obj2, kotlin.jvm.functions.p pVar, s sVar) {
        kotlin.coroutines.j jVar = sVar.R;
        boolean zF = sVar.f(obj) | sVar.f(obj2);
        Object objQ = sVar.Q();
        if (zF || objQ == n.a) {
            objQ = new v0(jVar, pVar);
            sVar.l0(objQ);
        }
    }

    public static final void e(kotlin.jvm.functions.a aVar, s sVar) {
        androidx.compose.runtime.changelist.l0 l0Var = sVar.M.b.l;
        l0Var.W(androidx.compose.runtime.changelist.b0.c);
        okhttp3.internal.platform.android.g.w(l0Var, 0, aVar);
    }

    public static final CoroutineScope f(s sVar) {
        Job.Key.getClass();
        return new e2(sVar.R);
    }
}
