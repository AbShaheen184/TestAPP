package kotlinx.coroutines.flow;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ThrowingCollector implements FlowCollector<Object> {
    public final Throwable e;

    public ThrowingCollector(Throwable th) {
        this.e = th;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, kotlin.coroutines.d<? super y> dVar) throws Throwable {
        throw this.e;
    }
}
