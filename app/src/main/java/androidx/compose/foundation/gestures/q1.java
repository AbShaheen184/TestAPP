package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public final /* synthetic */ s1 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.y = s1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.c(this);
    }
}
