package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i5 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.r {
    public /* synthetic */ k5 A;
    public final /* synthetic */ j5 B;
    public final /* synthetic */ float C;
    public final /* synthetic */ androidx.compose.animation.core.b0 D;
    public int e;
    public /* synthetic */ androidx.compose.material3.internal.m y;
    public /* synthetic */ androidx.compose.material3.internal.h0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(j5 j5Var, float f, androidx.compose.animation.core.b0 b0Var, kotlin.coroutines.d dVar) {
        super(4, dVar);
        this.B = j5Var;
        this.C = f;
        this.D = b0Var;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.C;
        androidx.compose.animation.core.b0 b0Var = this.D;
        i5 i5Var = new i5(this.B, f, b0Var, (kotlin.coroutines.d) obj4);
        i5Var.y = (androidx.compose.material3.internal.m) obj;
        i5Var.z = (androidx.compose.material3.internal.h0) obj2;
        i5Var.A = (k5) obj3;
        return i5Var.invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            androidx.compose.material3.internal.m mVar = this.y;
            float fD = this.z.d(this.A);
            if (!Float.isNaN(fD)) {
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                j5 j5Var = this.B;
                float fG = Float.isNaN(j5Var.c.j.g()) ? 0.0f : j5Var.c.j.g();
                wVar.e = fG;
                h5 h5Var = new h5(mVar, wVar, 0);
                this.y = null;
                this.z = null;
                this.e = 1;
                Object objC = androidx.compose.animation.core.e.c(fG, fD, this.C, this.D, h5Var, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objC == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return kotlin.y.a;
    }
}
