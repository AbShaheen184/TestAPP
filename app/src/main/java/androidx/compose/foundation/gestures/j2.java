package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ float A;
    public int e;
    public final /* synthetic */ k2 y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, float f, float f2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = k2Var;
        this.z = f;
        this.A = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new j2(this.y, this.z, this.A, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            r2 r2Var = this.y.k0;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.z)) << 32) | (((long) Float.floatToRawIntBits(this.A)) & 4294967295L);
            this.e = 1;
            Object objA = c2.a(r2Var, jFloatToRawIntBits, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objA == aVar) {
                return aVar;
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
