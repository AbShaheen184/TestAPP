package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public kotlin.jvm.functions.l e;
    public /* synthetic */ Object y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(e eVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.z = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
