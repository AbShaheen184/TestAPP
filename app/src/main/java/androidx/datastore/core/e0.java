package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ g0 A;
    public int B;
    public boolean e;
    public c0 y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, this);
    }
}
