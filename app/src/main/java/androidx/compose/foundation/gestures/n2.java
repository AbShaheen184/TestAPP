package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public kotlin.jvm.internal.y e;
    public /* synthetic */ Object y;
    public final /* synthetic */ r2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(r2 r2Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = r2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(0L, this);
    }
}
