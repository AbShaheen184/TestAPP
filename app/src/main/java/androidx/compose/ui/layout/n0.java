package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends c1 {
    public final /* synthetic */ int y;
    public final Object z;

    public /* synthetic */ n0(Object obj, int i) {
        this.y = i;
        this.z = obj;
    }

    @Override // androidx.compose.ui.unit.c
    public final float U() {
        switch (this.y) {
            case 0:
                return ((androidx.compose.ui.node.n0) this.z).U();
            default:
                return ((androidx.compose.ui.platform.u) this.z).getDensity().U();
        }
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        switch (this.y) {
            case 0:
                return ((androidx.compose.ui.node.n0) this.z).a();
            default:
                return ((androidx.compose.ui.platform.u) this.z).getDensity().a();
        }
    }

    @Override // androidx.compose.ui.layout.c1
    public float c(p pVar) {
        float fIntBitsToFloat;
        int iW;
        switch (this.y) {
            case 0:
                kotlin.jvm.functions.p pVar2 = pVar.a;
                if (pVar2 != null) {
                    return ((Number) pVar2.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                androidx.compose.ui.node.n0 n0Var = (androidx.compose.ui.node.n0) this.z;
                if (n0Var.H) {
                    return Float.NaN;
                }
                androidx.compose.ui.node.n0 n0Var2 = n0Var;
                while (true) {
                    androidx.appcompat.widget.o oVar = n0Var2.J;
                    float f = (oVar == null || (iW = kotlin.collections.o.w(pVar, (p[]) oVar.b)) < 0) ? Float.NaN : ((float[]) oVar.c)[iW];
                    if (!Float.isNaN(f)) {
                        n0Var2.p0(n0Var.B0(), pVar);
                        x xVarY0 = n0Var2.y0();
                        x xVarY1 = n0Var.y0();
                        switch (pVar.b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (xVarY1.i(xVarY0, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (xVarY0.u() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (xVarY1.i(xVarY0, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(((int) (xVarY0.u() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    androidx.compose.ui.node.n0 n0VarD0 = n0Var2.D0();
                    if (n0VarD0 == null) {
                        n0Var2.p0(n0Var.B0(), pVar);
                        return Float.NaN;
                    }
                    n0Var2 = n0VarD0;
                }
                break;
            default:
                return super.c(pVar);
        }
    }

    @Override // androidx.compose.ui.layout.c1
    public final androidx.compose.ui.unit.m f() {
        switch (this.y) {
            case 0:
                return ((androidx.compose.ui.node.n0) this.z).getLayoutDirection();
            default:
                return ((androidx.compose.ui.platform.u) this.z).getLayoutDirection();
        }
    }

    @Override // androidx.compose.ui.layout.c1
    public final int g() {
        switch (this.y) {
            case 0:
                return ((androidx.compose.ui.node.n0) this.z).g0();
            default:
                return ((androidx.compose.ui.platform.u) this.z).getRoot().e0.p.e;
        }
    }
}
