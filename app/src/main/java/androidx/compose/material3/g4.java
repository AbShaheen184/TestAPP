package androidx.compose.material3;

import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ kotlin.jvm.functions.l B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ androidx.compose.ui.text.m0 E;
    public final /* synthetic */ androidx.compose.foundation.text.q0 F;
    public final /* synthetic */ androidx.compose.foundation.text.p0 G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ androidx.compose.ui.text.input.g0 K;
    public final /* synthetic */ androidx.compose.foundation.interaction.k L;
    public final /* synthetic */ kotlin.jvm.functions.p M;
    public final /* synthetic */ kotlin.jvm.functions.p N;
    public final /* synthetic */ kotlin.jvm.functions.p O;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 P;
    public final /* synthetic */ androidx.compose.ui.r e;
    public final /* synthetic */ kotlin.jvm.functions.p y;
    public final /* synthetic */ u5 z;

    public g4(androidx.compose.ui.r rVar, kotlin.jvm.functions.p pVar, u5 u5Var, String str, kotlin.jvm.functions.l lVar, boolean z, boolean z2, androidx.compose.ui.text.m0 m0Var, androidx.compose.foundation.text.q0 q0Var, androidx.compose.foundation.text.p0 p0Var, boolean z3, int i, int i2, androidx.compose.ui.text.input.g0 g0Var, androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.p pVar2, kotlin.jvm.functions.p pVar3, kotlin.jvm.functions.p pVar4, androidx.compose.ui.graphics.n0 n0Var) {
        this.e = rVar;
        this.y = pVar;
        this.z = u5Var;
        this.A = str;
        this.B = lVar;
        this.C = z;
        this.D = z2;
        this.E = m0Var;
        this.F = q0Var;
        this.G = p0Var;
        this.H = z3;
        this.I = i;
        this.J = i2;
        this.K = g0Var;
        this.L = kVar;
        this.M = pVar2;
        this.N = pVar3;
        this.O = pVar4;
        this.P = n0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            kotlin.jvm.functions.p pVar = this.y;
            androidx.compose.ui.r rVarU = androidx.compose.ui.o.b;
            if (pVar != null) {
                sVar.b0(-903490605);
                Object objQ = sVar.Q();
                if (objQ == androidx.compose.runtime.n.a) {
                    objQ = new t3(0);
                    sVar.l0(objQ);
                }
                rVarU = androidx.compose.foundation.layout.b.u(androidx.compose.ui.semantics.q.a(rVarU, true, (kotlin.jvm.functions.l) objQ), 0.0f, androidx.compose.material3.internal.a1.e(sVar), 0.0f, 0.0f, 13);
                sVar.p(false);
            } else {
                sVar.b0(-903106918);
                sVar.p(false);
            }
            androidx.compose.ui.r rVarD = this.e.d(rVarU);
            androidx.compose.material3.internal.i.i(R.string.default_error_message, sVar);
            float f = androidx.compose.material3.internal.a1.a;
            androidx.compose.ui.r rVarA = androidx.compose.foundation.layout.i1.a(rVarD, b4.c, b4.b);
            u5 u5Var = this.z;
            androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(u5Var.i);
            kotlin.jvm.functions.p pVar2 = this.O;
            androidx.compose.ui.graphics.n0 n0Var = this.P;
            String str = this.A;
            boolean z = this.C;
            boolean z2 = this.H;
            androidx.compose.ui.text.input.g0 g0Var = this.K;
            androidx.compose.foundation.interaction.k kVar = this.L;
            androidx.compose.foundation.text.h.a(str, this.B, rVarA, z, this.D, this.E, this.F, this.G, z2, this.I, this.J, g0Var, null, kVar, p0Var, androidx.compose.runtime.internal.k.c(-1189274459, new f4(str, z, z2, g0Var, kVar, this.y, this.M, this.N, pVar2, u5Var, n0Var), sVar), sVar, 0);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
