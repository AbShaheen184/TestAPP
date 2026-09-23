package androidx.compose.foundation.selection;

import androidx.compose.foundation.b1;
import androidx.compose.foundation.interaction.k;
import androidx.compose.material3.y4;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.compose.ui.semantics.j;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final r a(r rVar, boolean z, k kVar, y4 y4Var, boolean z2, j jVar, kotlin.jvm.functions.a aVar) {
        r rVarD;
        if (y4Var != null) {
            rVarD = new a(z, kVar, y4Var, z2, jVar, aVar);
        } else if (y4Var == null) {
            rVarD = new a(z, kVar, null, z2, jVar, aVar);
        } else {
            o oVar = o.b;
            rVarD = kVar != null ? b1.a(oVar, kVar, y4Var).d(new a(z, kVar, null, z2, jVar, aVar)) : androidx.compose.ui.a.a(oVar, new b(y4Var, z, z2, jVar, aVar));
        }
        return rVar.d(rVarD);
    }

    public static final r b(r rVar, boolean z, k kVar, boolean z2, j jVar, l lVar) {
        return rVar.d(new e(z, kVar, z2, jVar, lVar));
    }
}
