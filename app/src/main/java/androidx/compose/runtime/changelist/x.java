package androidx.compose.runtime.changelist;

import androidx.collection.o0;
import androidx.collection.w0;
import androidx.compose.runtime.c2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.s1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends j0 {
    public static final x c = new x(0, 1, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        s1 s1Var = (s1) wVar.e(0);
        Set set = lVar.a;
        if (set == null) {
            return;
        }
        androidx.compose.runtime.internal.h hVar = new androidx.compose.runtime.internal.h(set);
        o0 o0Var = lVar.i;
        if (o0Var == null) {
            long[] jArr = w0.a;
            o0Var = new o0();
            lVar.i = o0Var;
        }
        o0Var.m(s1Var, hVar);
        lVar.e.b(new c2(hVar, -1));
    }
}
