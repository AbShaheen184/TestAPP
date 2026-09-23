package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ z A;
    public int B;
    public boolean e;
    public f1 y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.A = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return z.g(this.A, false, this);
    }
}
