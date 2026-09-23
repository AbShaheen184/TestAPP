package androidx.compose.runtime.changelist;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.k2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends j0 {
    public static final t c = new t(0, 3, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        androidx.compose.foundation.text.input.internal.o oVar;
        h2 h2Var = (h2) wVar.e(1);
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) wVar.e(0);
        c cVar2 = (c) wVar.e(2);
        k2 k2VarE = h2Var.e();
        if (k0Var != null) {
            try {
                oVar = new androidx.compose.foundation.text.input.internal.o(13, k0Var, k2Var);
            } catch (Throwable th) {
                k2VarE.e(false);
                throw th;
            }
        } else {
            oVar = null;
        }
        if (!cVar2.m.U()) {
            androidx.compose.runtime.u.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar2.l.T(cVar, k2VarE, lVar, oVar);
        k2VarE.e(true);
        k2Var.d();
        aVar.getClass();
        k2Var.A(h2Var, h2Var.b(aVar));
        k2Var.k();
    }
}
