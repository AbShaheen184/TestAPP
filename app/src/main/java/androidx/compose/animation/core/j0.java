package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public /* synthetic */ float e;

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        j0 j0Var = new j0(2, dVar);
        j0Var.e = ((Number) obj).floatValue();
        return j0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create(Float.valueOf(((Number) obj).floatValue()), (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.a.e(obj);
        return Boolean.valueOf(this.e > 0.0f);
    }
}
