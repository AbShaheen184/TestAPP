package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.z0;
import androidx.compose.material3.b0;
import androidx.compose.ui.graphics.n0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.p {
    public final /* synthetic */ z0 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ kotlin.d G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ androidx.compose.ui.r y;
    public final /* synthetic */ Object z;

    public /* synthetic */ e(a aVar, androidx.compose.ui.r rVar, x xVar, z0 z0Var, androidx.compose.foundation.layout.g gVar, androidx.compose.foundation.layout.e eVar, androidx.compose.foundation.gestures.l lVar, boolean z, androidx.compose.foundation.n nVar, kotlin.jvm.functions.l lVar2, int i, int i2) {
        this.J = aVar;
        this.y = rVar;
        this.z = xVar;
        this.A = z0Var;
        this.E = gVar;
        this.F = eVar;
        this.B = lVar;
        this.C = z;
        this.D = nVar;
        this.G = lVar2;
        this.H = i;
        this.I = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                androidx.work.impl.v.b((a) this.J, this.y, (x) this.z, this.A, (androidx.compose.foundation.layout.g) this.E, (androidx.compose.foundation.layout.e) this.F, (androidx.compose.foundation.gestures.l) this.B, this.C, (androidx.compose.foundation.n) this.D, (kotlin.jvm.functions.l) this.G, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.H | 1), this.I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                coil3.network.g.a(this.y, (x) this.z, (c) this.J, this.A, (androidx.compose.foundation.gestures.l) this.B, this.C, (androidx.compose.foundation.n) this.D, (androidx.compose.foundation.layout.g) this.E, (androidx.compose.foundation.layout.e) this.F, (kotlin.jvm.functions.l) this.G, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.H | 1), androidx.compose.runtime.t.A(this.I));
                break;
            default:
                ((Integer) obj2).getClass();
                androidx.compose.material3.q.b((kotlin.jvm.functions.a) this.J, this.y, this.C, (n0) this.z, (androidx.compose.material3.w) this.E, (b0) this.F, (androidx.compose.foundation.a0) this.B, this.A, (androidx.compose.foundation.interaction.k) this.D, (kotlin.jvm.functions.q) this.G, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.H | 1), this.I);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ e(androidx.compose.ui.r rVar, x xVar, c cVar, z0 z0Var, androidx.compose.foundation.gestures.l lVar, boolean z, androidx.compose.foundation.n nVar, androidx.compose.foundation.layout.g gVar, androidx.compose.foundation.layout.e eVar, kotlin.jvm.functions.l lVar2, int i, int i2) {
        this.y = rVar;
        this.z = xVar;
        this.J = cVar;
        this.A = z0Var;
        this.B = lVar;
        this.C = z;
        this.D = nVar;
        this.E = gVar;
        this.F = eVar;
        this.G = lVar2;
        this.H = i;
        this.I = i2;
    }

    public /* synthetic */ e(kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, n0 n0Var, androidx.compose.material3.w wVar, b0 b0Var, androidx.compose.foundation.a0 a0Var, z0 z0Var, androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.q qVar, int i, int i2) {
        this.J = aVar;
        this.y = rVar;
        this.C = z;
        this.z = n0Var;
        this.E = wVar;
        this.F = b0Var;
        this.B = a0Var;
        this.A = z0Var;
        this.D = kVar;
        this.G = qVar;
        this.H = i;
        this.I = i2;
    }
}
