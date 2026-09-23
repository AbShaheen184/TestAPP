package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final r a(r rVar, n0 n0Var) {
        return a0.q(rVar, 0.0f, n0Var, 518143);
    }

    public static final r b(r rVar) {
        return a0.q(rVar, 0.0f, null, 520191);
    }

    public static final r c(r rVar, kotlin.jvm.functions.l lVar) {
        return rVar.d(new f(lVar));
    }

    public static final r d(r rVar, kotlin.jvm.functions.l lVar) {
        return rVar.d(new j(lVar));
    }

    public static final r e(r rVar, kotlin.jvm.functions.l lVar) {
        return rVar.d(new k(lVar));
    }

    public static r f(r rVar, androidx.compose.ui.graphics.painter.b bVar, float f, androidx.compose.ui.graphics.m mVar, int i) {
        androidx.compose.ui.j jVar = androidx.compose.ui.c.B;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return rVar.d(new n(bVar, jVar, f, mVar));
    }
}
