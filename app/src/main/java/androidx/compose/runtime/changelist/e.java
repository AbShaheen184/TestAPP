package androidx.compose.runtime.changelist;

import androidx.compose.runtime.c2;
import androidx.compose.runtime.k2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j0 {
    public static final e c = new e(0, 2, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) wVar.e(0);
        Object objE = wVar.e(1);
        if (objE instanceof c2) {
            c2 c2Var = (c2) objE;
            lVar.e.b(c2Var);
            lVar.d.a(c2Var);
        }
        if (k2Var.n != 0) {
            androidx.compose.runtime.u.a("Can only append a slot if not current inserting");
        }
        int i = k2Var.i;
        int i2 = k2Var.j;
        int iC = k2Var.c(aVar);
        int iG = k2Var.g(k2Var.r(iC + 1), k2Var.b);
        k2Var.i = iG;
        k2Var.j = iG;
        k2Var.x(1, iC);
        if (i >= iG) {
            i++;
            i2++;
        }
        k2Var.c[iG] = objE;
        k2Var.i = i;
        k2Var.j = i2;
    }
}
