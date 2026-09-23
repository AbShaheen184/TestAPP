package androidx.compose.runtime.changelist;

import androidx.collection.o0;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.s1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends j0 {
    public static final d0 c = new d0(0, 1, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        s1 s1Var = (s1) wVar.e(0);
        o0 o0Var = lVar.i;
        androidx.compose.runtime.internal.h hVar = o0Var != null ? (androidx.compose.runtime.internal.h) o0Var.g(s1Var) : null;
        if (hVar != null) {
            ArrayList arrayList = lVar.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                lVar.j = arrayList;
            }
            arrayList.add(lVar.e);
            lVar.e = hVar.y;
        }
    }
}
