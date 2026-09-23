package androidx.work.impl.workers;

import androidx.datastore.core.n;

/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public int y;
    public final /* synthetic */ n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.z = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
