package androidx.compose.foundation.interaction;

import kotlin.y;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements j {
    public final MutableSharedFlow a = SharedFlowKt.MutableSharedFlow$default(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.j
    public final Flow a() {
        return this.a;
    }

    public final Object b(i iVar, kotlin.coroutines.d dVar) {
        Object objEmit = this.a.emit(iVar, dVar);
        return objEmit == kotlin.coroutines.intrinsics.a.e ? objEmit : y.a;
    }

    public final void c(i iVar) {
        this.a.tryEmit(iVar);
    }
}
