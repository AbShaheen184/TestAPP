package androidx.compose.runtime;

import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.compose.runtime.internal.b {
    public CancellableContinuationImpl a;
    public kotlin.jvm.functions.l b;

    @Override // androidx.compose.runtime.internal.b
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // androidx.compose.runtime.internal.b
    public final void b(Throwable th) {
        CancellableContinuationImpl cancellableContinuationImpl = this.a;
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.resumeWith(kotlin.a.b(th));
        }
    }
}
