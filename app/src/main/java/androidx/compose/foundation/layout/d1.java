package androidx.compose.foundation.layout;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {
    public static final f1 a = new f1(h.a, androidx.compose.ui.c.G);

    public static final f1 a(e eVar, androidx.compose.ui.i iVar, androidx.compose.runtime.s sVar, int i) {
        if (kotlin.jvm.internal.l.a(eVar, h.a) && kotlin.jvm.internal.l.a(iVar, androidx.compose.ui.c.G)) {
            sVar.b0(-1073830487);
            sVar.p(false);
            return a;
        }
        sVar.b0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && sVar.f(eVar)) || (i & 6) == 4;
        if ((((i & Token.ASSIGN_MOD) ^ 48) <= 32 || !sVar.f(iVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objQ = sVar.Q();
        if (z3 || objQ == androidx.compose.runtime.n.a) {
            objQ = new f1(eVar, iVar);
            sVar.l0(objQ);
        }
        f1 f1Var = (f1) objQ;
        sVar.p(false);
        return f1Var;
    }
}
