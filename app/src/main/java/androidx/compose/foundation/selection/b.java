package androidx.compose.foundation.selection;

import androidx.compose.foundation.b1;
import androidx.compose.foundation.e1;
import androidx.compose.foundation.interaction.k;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.compose.ui.semantics.j;
import kotlin.jvm.functions.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements q {
    public final /* synthetic */ j A;
    public final /* synthetic */ kotlin.jvm.functions.a B;
    public final /* synthetic */ e1 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public b(e1 e1Var, boolean z, boolean z2, j jVar, kotlin.jvm.functions.a aVar) {
        this.e = e1Var;
        this.y = z;
        this.z = z2;
        this.A = jVar;
        this.B = aVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s sVar = (s) obj2;
        ((Number) obj3).intValue();
        sVar.b0(-1525724089);
        Object objQ = sVar.Q();
        if (objQ == n.a) {
            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
        }
        k kVar = (k) objQ;
        r rVarD = b1.a(o.b, kVar, this.e).d(new a(this.y, kVar, null, this.z, this.A, this.B));
        sVar.p(false);
        return rVarD;
    }
}
