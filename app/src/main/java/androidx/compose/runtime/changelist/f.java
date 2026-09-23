package androidx.compose.runtime.changelist;

import androidx.compose.animation.core.u2;
import androidx.compose.runtime.k2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j0 {
    public static final f c = new f(0, 2, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        androidx.compose.runtime.internal.g gVar = (androidx.compose.runtime.internal.g) wVar.e(1);
        int i = gVar != null ? gVar.a : 0;
        a aVar = (a) wVar.e(0);
        if (i > 0) {
            cVar = new u2(cVar, i);
        }
        aVar.S(cVar, k2Var, lVar, k0Var != null ? new androidx.compose.foundation.text.input.internal.o(13, k0Var, k2Var) : null);
    }
}
