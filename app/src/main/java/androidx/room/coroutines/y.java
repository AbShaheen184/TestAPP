package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ a0 B;
    public int C;
    public Object e;
    public Throwable y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.g(null, null, this);
    }
}
