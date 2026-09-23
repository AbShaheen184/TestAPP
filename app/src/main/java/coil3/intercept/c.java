package coil3.intercept;

import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {
    public z A;
    public z B;
    public z C;
    public z D;
    public /* synthetic */ Object E;
    public final /* synthetic */ f F;
    public int G;
    public coil3.request.g e;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.F = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return f.b(this.F, null, null, null, null, this);
    }
}
