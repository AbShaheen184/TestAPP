package androidx.room;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ k0 D;
    public int E;
    public m e;
    public String y;
    public String[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.D = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return k0.d(this.D, null, 0, this);
    }
}
