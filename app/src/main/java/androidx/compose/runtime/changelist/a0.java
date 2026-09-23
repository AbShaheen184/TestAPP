package androidx.compose.runtime.changelist;

import androidx.compose.runtime.k2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends j0 {
    public static final a0 c = new a0(0, 0, 3);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        if (k2Var.n != 0) {
            androidx.compose.runtime.u.a("Cannot reset when inserting");
        }
        k2Var.G();
        k2Var.t = 0;
        k2Var.u = k2Var.o() - k2Var.h;
        k2Var.i = 0;
        k2Var.j = 0;
        k2Var.o = 0;
    }
}
