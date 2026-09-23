package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ n1 B;
    public int C;
    public r2 e;
    public kotlin.jvm.internal.w y;
    public float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(n1 n1Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = n1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return n1.a(this.B, null, null, 0.0f, 0.0f, this);
    }
}
