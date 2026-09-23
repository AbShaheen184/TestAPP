package androidx.room.coroutines;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ androidx.compose.animation.a0 A;
    public /* synthetic */ Object e;
    public int y;
    public FlowCollector z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.compose.animation.a0 a0Var, kotlin.coroutines.d dVar) {
        super(dVar);
        this.A = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.y |= Integer.MIN_VALUE;
        return this.A.emit(null, this);
    }
}
