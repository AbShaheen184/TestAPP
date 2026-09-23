package androidx.datastore.core;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ e1 A;
    public int B;
    public Object e;
    public Mutex y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = e1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.d(null, this);
    }
}
