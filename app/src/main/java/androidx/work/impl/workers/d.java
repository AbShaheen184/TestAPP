package androidx.work.impl.workers;

import androidx.work.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public x e;
    public /* synthetic */ Object y;
    public final /* synthetic */ ConstraintTrackingWorker z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConstraintTrackingWorker constraintTrackingWorker, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = constraintTrackingWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.c(this.z, this);
    }
}
