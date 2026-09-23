package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ b1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(b1 b1Var, kotlin.coroutines.d dVar, int i) {
        super(1, dVar);
        this.e = i;
        this.y = b1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new v0(this.y, dVar, 0);
            case 1:
                return new v0(this.y, dVar, 1);
            case 2:
                return new v0(this.y, dVar, 2);
            default:
                return new v0(this.y, dVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj;
        switch (this.e) {
            case 0:
                v0 v0Var = (v0) create(dVar);
                kotlin.y yVar = kotlin.y.a;
                v0Var.invokeSuspend(yVar);
                return yVar;
            case 1:
                v0 v0Var2 = (v0) create(dVar);
                kotlin.y yVar2 = kotlin.y.a;
                v0Var2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                v0 v0Var3 = (v0) create(dVar);
                kotlin.y yVar3 = kotlin.y.a;
                v0Var3.invokeSuspend(yVar3);
                return yVar3;
            default:
                v0 v0Var4 = (v0) create(dVar);
                kotlin.y yVar4 = kotlin.y.a;
                v0Var4.invokeSuspend(yVar4);
                return yVar4;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                this.y.B = false;
                break;
            case 1:
                kotlin.a.e(obj);
                this.y.f();
                break;
            case 2:
                kotlin.a.e(obj);
                b1 b1Var = this.y;
                b1Var.d(b1Var.B);
                break;
            default:
                kotlin.a.e(obj);
                this.y.p();
                break;
        }
        return kotlin.y.a;
    }
}
