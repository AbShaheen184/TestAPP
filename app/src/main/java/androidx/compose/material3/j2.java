package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j2 implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ j2(kotlin.jvm.internal.v vVar, kotlin.jvm.internal.v vVar2, androidx.navigation.internal.f fVar, boolean z, kotlin.collections.l lVar) {
        this.z = vVar;
        this.A = vVar2;
        this.B = fVar;
        this.y = z;
        this.C = lVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        float fFloatValue;
        switch (this.e) {
            case 0:
                androidx.compose.runtime.j1 j1Var = ((androidx.compose.animation.core.p0) this.z).z;
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) this.A;
                androidx.compose.runtime.w2 w2Var = (androidx.compose.runtime.w2) this.B;
                androidx.compose.runtime.w2 w2Var2 = (androidx.compose.runtime.w2) this.C;
                androidx.compose.ui.graphics.k0 k0Var = (androidx.compose.ui.graphics.k0) obj;
                boolean z = this.y;
                float fFloatValue2 = 0.8f;
                float fFloatValue3 = 1.0f;
                if (z) {
                    fFloatValue = ((Boolean) j1Var.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) w2Var.getValue()).floatValue();
                }
                k0Var.i(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) w2Var.getValue()).floatValue();
                } else if (((Boolean) j1Var.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                k0Var.k(fFloatValue2);
                if (!z) {
                    fFloatValue3 = ((Number) w2Var2.getValue()).floatValue();
                } else if (!((Boolean) j1Var.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                k0Var.c(fFloatValue3);
                k0Var.s(((androidx.compose.ui.graphics.q0) a1Var.getValue()).a);
                break;
            default:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.z;
                kotlin.jvm.internal.v vVar2 = (kotlin.jvm.internal.v) this.A;
                androidx.navigation.internal.f fVar = (androidx.navigation.internal.f) this.B;
                kotlin.collections.l lVar = (kotlin.collections.l) this.C;
                androidx.navigation.i iVar = (androidx.navigation.i) obj;
                iVar.getClass();
                vVar.e = true;
                vVar2.e = true;
                fVar.p(iVar, this.y, lVar);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ j2(boolean z, androidx.compose.animation.core.p0 p0Var, androidx.compose.runtime.a1 a1Var, androidx.compose.animation.core.a2 a2Var, androidx.compose.animation.core.a2 a2Var2) {
        this.y = z;
        this.z = p0Var;
        this.A = a1Var;
        this.B = a2Var;
        this.C = a2Var2;
    }
}
