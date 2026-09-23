package androidx.compose.material3.internal;

import androidx.compose.material3.h5;
import androidx.compose.material3.j5;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.r {
    public /* synthetic */ Object A;
    public final /* synthetic */ p B;
    public final /* synthetic */ float C;
    public int e;
    public /* synthetic */ m y;
    public /* synthetic */ h0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, float f, kotlin.coroutines.d dVar) {
        super(4, dVar);
        this.B = pVar;
        this.C = f;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        f fVar = new f(this.B, this.C, (kotlin.coroutines.d) obj4);
        fVar.y = (m) obj;
        fVar.z = (h0) obj2;
        fVar.A = obj3;
        return fVar.invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            m mVar = this.y;
            float fD = this.z.d(this.A);
            if (!Float.isNaN(fD)) {
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                p pVar = this.B;
                float fG = Float.isNaN(pVar.j.g()) ? 0.0f : pVar.j.g();
                wVar.e = fG;
                androidx.compose.animation.core.m mVar2 = ((j5) pVar.c.y).b;
                h5 h5Var = new h5(mVar, wVar, 1);
                this.y = null;
                this.z = null;
                this.e = 1;
                Object objC = androidx.compose.animation.core.e.c(fG, fD, this.C, mVar2, h5Var, this);
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
