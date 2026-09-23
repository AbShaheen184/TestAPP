package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.foundation.text.selection.b1 y;

    public /* synthetic */ m(androidx.compose.foundation.text.selection.b1 b1Var, int i) {
        this.e = i;
        this.y = b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0127  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.geometry.c cVar;
        androidx.compose.ui.layout.x xVarC;
        char c;
        float fIntBitsToFloat;
        androidx.compose.ui.layout.x xVarC2;
        androidx.compose.ui.layout.x xVarC3;
        androidx.compose.ui.layout.x xVarC4;
        androidx.compose.ui.layout.x xVarC5;
        int i = this.e;
        androidx.compose.foundation.text.selection.b1 b1Var = this.y;
        switch (i) {
            case 0:
                return new androidx.activity.compose.d(b1Var, 4);
            case 1:
                b1Var.r();
                return kotlin.y.a;
            default:
                androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) obj;
                r0 r0Var = b1Var.d;
                androidx.compose.ui.geometry.c cVar2 = androidx.compose.ui.geometry.c.e;
                if (r0Var == null) {
                    cVar = cVar2;
                } else {
                    if (r0Var.p) {
                        r0Var = null;
                    }
                    if (r0Var != null) {
                        androidx.compose.ui.text.input.q qVar = b1Var.b;
                        long j = b1Var.n().b;
                        int i2 = androidx.compose.ui.text.l0.c;
                        int iV = qVar.v((int) (j >> 32));
                        int iV2 = b1Var.b.v((int) (b1Var.n().b & 4294967295L));
                        r0 r0Var2 = b1Var.d;
                        long jX = 0;
                        long jX2 = (r0Var2 == null || (xVarC5 = r0Var2.c()) == null) ? 0L : xVarC5.X(b1Var.l(true));
                        r0 r0Var3 = b1Var.d;
                        if (r0Var3 != null && (xVarC4 = r0Var3.c()) != null) {
                            jX = xVarC4.X(b1Var.l(false));
                        }
                        r0 r0Var4 = b1Var.d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (r0Var4 == null || (xVarC3 = r0Var4.c()) == null) {
                            c = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            k1 k1VarD = r0Var.d();
                            c = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (xVarC3.X((((long) Float.floatToRawIntBits(k1VarD != null ? k1VarD.a.c(iV).b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        r0 r0Var5 = b1Var.d;
                        if (r0Var5 != null && (xVarC2 = r0Var5.c()) != null) {
                            k1 k1VarD2 = r0Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (xVarC2.X((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(k1VarD2 != null ? k1VarD2.a.c(iV2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jX2 >> c);
                        int i4 = (int) (jX >> c);
                        cVar = new androidx.compose.ui.geometry.c(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (r0Var.a.g.a() * 25) + Math.max(Float.intBitsToFloat((int) (jX2 & 4294967295L)), Float.intBitsToFloat((int) (jX & 4294967295L))));
                    } else {
                        cVar = cVar2;
                    }
                }
                r0 r0Var6 = b1Var.d;
                if (r0Var6 == null || (xVarC = r0Var6.c()) == null) {
                    return null;
                }
                return (xVarC.l() && xVar.l()) ? org.jsoup.helper.n.b(xVar.i(androidx.compose.ui.layout.a0.g(xVarC), cVar.d()), cVar.c()) : cVar2;
        }
    }
}
