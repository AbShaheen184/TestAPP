package androidx.compose.runtime;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ q1 y;

    public /* synthetic */ r2(q1 q1Var, int i) {
        this.e = i;
        this.y = q1Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                this.y.setValue(obj);
                break;
            default:
                this.y.setValue(obj);
                break;
        }
        return kotlin.y.a;
    }
}
