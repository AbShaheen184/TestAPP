package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i, int i2, kotlin.coroutines.d dVar) {
        super(i, dVar);
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                long j = ((androidx.compose.ui.geometry.b) obj2).a;
                n0 n0Var = new n0(3, 0, (kotlin.coroutines.d) obj3);
                kotlin.y yVar = kotlin.y.a;
                n0Var.invokeSuspend(yVar);
                return yVar;
            case 1:
                ((Number) obj2).floatValue();
                n0 n0Var2 = new n0(3, 1, (kotlin.coroutines.d) obj3);
                kotlin.y yVar2 = kotlin.y.a;
                n0Var2.invokeSuspend(yVar2);
                return yVar2;
            default:
                long j2 = ((androidx.compose.ui.geometry.b) obj2).a;
                n0 n0Var3 = new n0(3, 2, (kotlin.coroutines.d) obj3);
                kotlin.y yVar3 = kotlin.y.a;
                n0Var3.invokeSuspend(yVar3);
                return yVar3;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                break;
            case 1:
                kotlin.a.e(obj);
                break;
            default:
                kotlin.a.e(obj);
                break;
        }
        return yVar;
    }
}
