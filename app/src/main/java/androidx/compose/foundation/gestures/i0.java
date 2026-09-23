package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ l0 A;
    public int B;
    public v e;
    public androidx.compose.foundation.interaction.b y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return l0.Q0(this.A, null, this);
    }
}
