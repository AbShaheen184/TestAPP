package androidx.compose.runtime.changelist;

import androidx.compose.runtime.c2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.s1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends j0 {
    public static final e0 c = new e0(1, 0, 2);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        int iD = wVar.d(0);
        int i = k2Var.v;
        int iN = k2Var.N(k2Var.r(i), k2Var.b);
        int iG = k2Var.g(k2Var.r(i + 1), k2Var.b);
        for (int iMax = Math.max(iN, iG - iD); iMax < iG; iMax++) {
            Object obj = k2Var.c[k2Var.h(iMax)];
            if (obj instanceof c2) {
                lVar.e((c2) obj);
            } else if (obj instanceof s1) {
                ((s1) obj).c();
            }
        }
        if (iD <= 0) {
            androidx.compose.runtime.u.a("Check failed");
        }
        int i2 = k2Var.v;
        int iN2 = k2Var.N(k2Var.r(i2), k2Var.b);
        int iG2 = k2Var.g(k2Var.r(i2 + 1), k2Var.b) - iD;
        if (iG2 < iN2) {
            androidx.compose.runtime.u.a("Check failed");
        }
        k2Var.J(iG2, iD, i2);
        int i3 = k2Var.i;
        if (i3 >= iN2) {
            k2Var.i = i3 - iD;
        }
    }
}
