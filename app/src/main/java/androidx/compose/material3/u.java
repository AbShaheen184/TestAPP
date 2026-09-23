package androidx.compose.material3;

import com.app.mlounge.R;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final u a = new u();
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        androidx.compose.material3.tokens.f fVar = androidx.compose.material3.tokens.y.a;
        float f = androidx.compose.material3.tokens.y.f;
        b = 640;
        c = 56;
        d = Token.IF;
    }

    public final void a(androidx.compose.ui.r rVar, float f, float f2, androidx.compose.ui.graphics.n0 n0Var, long j, androidx.compose.runtime.s sVar, final int i) {
        final androidx.compose.ui.r rVar2;
        final float f3;
        final float f4;
        final androidx.compose.ui.graphics.n0 n0Var2;
        final long j2;
        long jD;
        float f5;
        float f6;
        androidx.compose.ui.graphics.n0 n0Var3;
        androidx.compose.ui.r rVar3;
        sVar.c0(-1364277227);
        int i2 = i | 9654;
        if (sVar.T(i2 & 1, (i2 & 9363) != 9362)) {
            sVar.Y();
            if ((i & 1) == 0 || sVar.C()) {
                float f7 = androidx.compose.material3.tokens.y.e;
                float f8 = androidx.compose.material3.tokens.y.d;
                androidx.compose.foundation.shape.d dVar = ((c5) sVar.j(d5.a)).e;
                jD = u0.d(androidx.compose.material3.tokens.y.c, sVar);
                f5 = f7;
                f6 = f8;
                n0Var3 = dVar;
                rVar3 = androidx.compose.ui.o.b;
            } else {
                sVar.W();
                rVar3 = rVar;
                f5 = f;
                f6 = f2;
                n0Var3 = n0Var;
                jD = j;
            }
            sVar.q();
            String strI = androidx.compose.material3.internal.i.i(R.string.m3c_bottom_sheet_drag_handle_description, sVar);
            androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(rVar3, 0.0f, g5.a, 1);
            boolean zF = sVar.f(strI);
            Object objQ = sVar.Q();
            if (zF || objQ == androidx.compose.runtime.n.a) {
                objQ = new r(strI, 0);
                sVar.l0(objQ);
            }
            long j3 = jD;
            p5.a(androidx.compose.ui.semantics.q.a(rVarS, false, (kotlin.jvm.functions.l) objQ), n0Var3, j3, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1039573072, new t(f5, f6), sVar), sVar, 12582912, 120);
            n0Var2 = n0Var3;
            j2 = j3;
            rVar2 = rVar3;
            f3 = f5;
            f4 = f6;
        } else {
            sVar.W();
            rVar2 = rVar;
            f3 = f;
            f4 = f2;
            n0Var2 = n0Var;
            j2 = j;
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new kotlin.jvm.functions.p(rVar2, f3, f4, n0Var2, j2, i) { // from class: androidx.compose.material3.s
                public final /* synthetic */ float A;
                public final /* synthetic */ androidx.compose.ui.graphics.n0 B;
                public final /* synthetic */ long C;
                public final /* synthetic */ androidx.compose.ui.r y;
                public final /* synthetic */ float z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.t.A(196609);
                    this.e.a(this.y, this.z, this.A, this.B, this.C, (androidx.compose.runtime.s) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }
}
