package androidx.compose.runtime.changelist;

import androidx.compose.runtime.k2;
import androidx.compose.runtime.z0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends j0 {
    public static final h c = new h(0, 4, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        z0 z0Var = (z0) wVar.e(2);
        androidx.compose.runtime.w wVar2 = (androidx.compose.runtime.w) wVar.e(1);
        wVar2.m(z0Var);
        androidx.compose.runtime.u.b("Could not resolve state for movable content");
        throw new androidx.compose.ui.res.e(10);
    }
}
