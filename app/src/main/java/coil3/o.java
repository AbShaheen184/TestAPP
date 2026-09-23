package coil3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.coroutines.jvm.internal.c {
    public j A;
    public /* synthetic */ Object B;
    public final /* synthetic */ p C;
    public int D;
    public coil3.request.o e;
    public coil3.request.g y;
    public f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.C = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, 0, this);
    }
}
