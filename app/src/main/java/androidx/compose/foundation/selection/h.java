package androidx.compose.foundation.selection;

import androidx.activity.w;
import androidx.compose.foundation.e0;
import androidx.compose.foundation.interaction.k;
import androidx.compose.ui.autofill.n;
import androidx.compose.ui.semantics.a0;
import androidx.compose.ui.semantics.j;
import androidx.compose.ui.semantics.y;
import androidx.compose.ui.semantics.z;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e0 {
    public boolean k0;
    public l l0;
    public final w m0;

    public h(boolean z, k kVar, boolean z2, j jVar, l lVar) {
        super(kVar, null, false, z2, null, jVar, new g(lVar, z, 0));
        this.k0 = z;
        this.l0 = lVar;
        this.m0 = new w(this, 7);
    }

    @Override // androidx.compose.foundation.j
    public final void P0(a0 a0Var) {
        y.f(a0Var, this.k0 ? androidx.compose.ui.state.a.e : androidx.compose.ui.state.a.y);
        z zVar = androidx.compose.ui.semantics.w.r;
        kotlin.reflect.j[] jVarArr = y.a;
        kotlin.reflect.j jVar = jVarArr[9];
        a0Var.b(zVar, n.b);
        androidx.compose.ui.autofill.g gVarH = androidx.media3.common.audio.h.h(this.k0);
        if (gVarH != null) {
            z zVar2 = androidx.compose.ui.semantics.w.s;
            kotlin.reflect.j jVar2 = jVarArr[10];
            a0Var.b(zVar2, gVarH);
        }
        y.b(a0Var, new f(a0Var, 0));
    }
}
