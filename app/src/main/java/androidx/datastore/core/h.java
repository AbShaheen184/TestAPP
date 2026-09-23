package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.coroutines.jvm.internal.c {
    public kotlin.jvm.internal.z A;
    public z B;
    public /* synthetic */ Object C;
    public final /* synthetic */ i D;
    public int E;
    public Object e;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.D = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, this);
    }
}
