package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.j2;
import androidx.compose.foundation.lazy.layout.d0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends j2 {
    public final long A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ d0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ androidx.compose.ui.d F;
    public final /* synthetic */ androidx.compose.ui.i G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ long J;
    public final /* synthetic */ y K;
    public final l y;
    public final d0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j, boolean z, l lVar, d0 d0Var, int i, int i2, androidx.compose.ui.d dVar, androidx.compose.ui.i iVar, int i3, int i4, long j2, y yVar) {
        super(1);
        this.B = z;
        this.C = d0Var;
        this.D = i;
        this.E = i2;
        this.F = dVar;
        this.G = iVar;
        this.H = i3;
        this.I = i4;
        this.J = j2;
        this.K = yVar;
        this.y = lVar;
        this.z = d0Var;
        this.A = androidx.compose.ui.unit.b.b(z ? androidx.compose.ui.unit.a.h(j) : Integer.MAX_VALUE, z ? Integer.MAX_VALUE : androidx.compose.ui.unit.a.g(j), 5);
    }

    public final t w(int i, long j) {
        l lVar = this.y;
        Object objB = lVar.b(i);
        Object objJ = lVar.b.j(i);
        return new t(i, o(this.z, i, j), this.B, this.F, this.G, this.C.y.getLayoutDirection(), this.H, this.I, i == this.D + (-1) ? 0 : this.E, this.J, objB, objJ, this.K.n, j);
    }
}
