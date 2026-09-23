package androidx.compose.foundation.layout;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final w a = new w(h.c, androidx.compose.ui.c.J);

    public static final w a(g gVar, androidx.compose.ui.h hVar, androidx.compose.runtime.s sVar, int i) {
        if (kotlin.jvm.internal.l.a(gVar, h.c) && hVar.equals(androidx.compose.ui.c.J)) {
            sVar.b0(-1446604504);
            sVar.p(false);
            return a;
        }
        sVar.b0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && sVar.f(gVar)) || (i & 6) == 4;
        if ((((i & Token.ASSIGN_MOD) ^ 48) <= 32 || !sVar.f(hVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objQ = sVar.Q();
        if (z3 || objQ == androidx.compose.runtime.n.a) {
            objQ = new w(gVar, hVar);
            sVar.l0(objQ);
        }
        w wVar = (w) objQ;
        sVar.p(false);
        return wVar;
    }
}
