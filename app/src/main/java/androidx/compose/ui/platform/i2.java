package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i2 {
    public static final androidx.compose.runtime.x2 a = new androidx.compose.runtime.x2(f2.z);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(androidx.compose.foundation.text.input.internal.q qVar, androidx.compose.animation.core.f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        g2 g2Var;
        if (cVar instanceof g2) {
            g2Var = (g2) cVar;
            int i = g2Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                g2Var.y = i - Integer.MIN_VALUE;
            } else {
                g2Var = new g2(cVar);
            }
        } else {
            g2Var = new g2(cVar);
        }
        Object obj = g2Var.e;
        int i2 = g2Var.y;
        if (i2 != 0) {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                kotlin.a.e(obj);
                com.google.firebase.platforminfo.b.b();
                return;
            }
        }
        kotlin.a.e(obj);
        if (!qVar.e.K) {
            kotlinx.coroutines.future.a.q("establishTextInputSession called from an unattached node");
            return;
        }
        androidx.compose.ui.node.m1 m1VarW = androidx.compose.ui.node.l.w(qVar);
        androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) androidx.compose.ui.node.l.v(qVar).Z;
        jVar.getClass();
        if (androidx.compose.runtime.t.s(jVar, a) != null) {
            androidx.transition.k.h();
        } else {
            g2Var.y = 1;
            b(m1VarW, fVar, g2Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(androidx.compose.ui.node.m1 m1Var, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        h2 h2Var;
        if (cVar instanceof h2) {
            h2Var = (h2) cVar;
            int i = h2Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                h2Var.y = i - Integer.MIN_VALUE;
            } else {
                h2Var = new h2(cVar);
            }
        } else {
            h2Var = new h2(cVar);
        }
        Object obj = h2Var.e;
        int i2 = h2Var.y;
        if (i2 == 0) {
            kotlin.a.e(obj);
            h2Var.y = 1;
            ((u) m1Var).L(pVar, h2Var);
        } else if (i2 == 1) {
            kotlin.a.e(obj);
            com.google.firebase.platforminfo.b.b();
        } else if (i2 != 2) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
        } else {
            kotlin.a.e(obj);
            com.google.firebase.platforminfo.b.b();
        }
    }
}
