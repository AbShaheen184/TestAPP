package androidx.compose.animation;

import androidx.compose.animation.core.k1;
import androidx.compose.animation.core.l2;
import androidx.compose.runtime.w2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {
    static {
        androidx.compose.animation.core.e.n(0.0f, 0.0f, null, 7);
    }

    public static final w2 a(long j, k1 k1Var, androidx.compose.runtime.s sVar) {
        boolean zF = sVar.f(androidx.compose.ui.graphics.t.f(j));
        Object objQ = sVar.Q();
        if (zF || objQ == androidx.compose.runtime.n.a) {
            l2 l2Var = new l2(c0.A, new e(androidx.compose.ui.graphics.t.f(j), 1));
            sVar.l0(l2Var);
            objQ = l2Var;
        }
        return androidx.compose.animation.core.h.c(new androidx.compose.ui.graphics.t(j), (l2) objQ, k1Var, null, "ColorAnimation", sVar, 0, 8);
    }
}
