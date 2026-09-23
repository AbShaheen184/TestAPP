package androidx.compose.runtime;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements a1, CoroutineScope {
    public final /* synthetic */ a1 e;
    public final kotlin.coroutines.j y;

    public q1(a1 a1Var, kotlin.coroutines.j jVar) {
        this.e = a1Var;
        this.y = jVar;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.j getCoroutineContext() {
        return this.y;
    }

    @Override // androidx.compose.runtime.w2
    public final Object getValue() {
        return this.e.getValue();
    }

    @Override // androidx.compose.runtime.a1
    public final void setValue(Object obj) {
        this.e.setValue(obj);
    }
}
