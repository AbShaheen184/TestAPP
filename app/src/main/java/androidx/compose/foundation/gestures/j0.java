package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public w e;
    public /* synthetic */ Object y;
    public final /* synthetic */ l0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return l0.R0(this.z, null, this);
    }
}
