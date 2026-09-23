package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public /* synthetic */ float e;
    public final /* synthetic */ kotlin.jvm.functions.l y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(kotlin.jvm.functions.l lVar, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.y = lVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        e3 e3Var = new e3(this.y, (kotlin.coroutines.d) obj3);
        e3Var.e = fFloatValue;
        kotlin.y yVar = kotlin.y.a;
        e3Var.invokeSuspend(yVar);
        return yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.a.e(obj);
        this.y.invoke(new Float(this.e));
        return kotlin.y.a;
    }
}
