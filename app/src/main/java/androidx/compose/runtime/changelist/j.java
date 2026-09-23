package androidx.compose.runtime.changelist;

import androidx.compose.runtime.k2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends j0 {
    public static final j c = new j(0, 2, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        int i;
        androidx.compose.runtime.internal.g gVar = (androidx.compose.runtime.internal.g) wVar.e(0);
        int iC = k2Var.c((androidx.compose.runtime.a) wVar.e(1));
        if (k2Var.t >= iC) {
            androidx.compose.runtime.u.a("Check failed");
        }
        kotlin.math.a.B(k2Var, cVar, iC);
        int i2 = k2Var.t;
        int iE = k2Var.v;
        while (iE >= 0 && !k2Var.y(iE)) {
            iE = k2Var.E(iE, k2Var.b);
        }
        int iU = iE + 1;
        int iL = 0;
        while (iU < i2) {
            if (k2Var.v(i2, iU)) {
                if (k2Var.y(iU)) {
                    iL = 0;
                }
                iU++;
            } else {
                iL += k2Var.y(iU) ? 1 : k2Var.b[(k2Var.r(iU) * 5) + 1] & 67108863;
                iU += k2Var.u(iU);
            }
        }
        while (true) {
            i = k2Var.t;
            if (i >= iC) {
                break;
            }
            if (k2Var.v(iC, i)) {
                int i3 = k2Var.t;
                if (i3 < k2Var.u && (k2Var.b[(k2Var.r(i3) * 5) + 1] & 1073741824) != 0) {
                    cVar.d(k2Var.D(k2Var.t));
                    iL = 0;
                }
                k2Var.P();
            } else {
                iL += k2Var.L();
            }
        }
        if (i != iC) {
            androidx.compose.runtime.u.a("Check failed");
        }
        gVar.a = iL;
    }
}
