package androidx.compose.ui.input.nestedscroll;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ i A;
    public int B;
    public long e;
    public long y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.m(0L, 0L, this);
    }
}
