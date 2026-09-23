package androidx.datastore.core;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.coroutines.jvm.internal.c {
    public Serializable A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ z D;
    public int E;
    public boolean e;
    public Object y;
    public kotlin.jvm.internal.z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.D = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return z.h(this.D, false, this);
    }
}
