package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public final /* synthetic */ o0 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.y = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.z |= Integer.MIN_VALUE;
        this.y.a(null, this);
        return kotlin.coroutines.intrinsics.a.e;
    }
}
