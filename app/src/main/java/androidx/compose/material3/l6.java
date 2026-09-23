package androidx.compose.material3;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l6 implements j6 {
    public final androidx.compose.foundation.o1 a;
    public final androidx.compose.animation.core.p0 b = new androidx.compose.animation.core.p0(Boolean.FALSE);
    public CancellableContinuationImpl c;

    public l6(androidx.compose.foundation.o1 o1Var) {
        this.a = o1Var;
    }

    public final void a() {
        this.b.z.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        androidx.compose.animation.core.p0 p0Var = this.b;
        return ((Boolean) p0Var.y.getValue()).booleanValue() || ((Boolean) p0Var.z.getValue()).booleanValue();
    }

    public final Object c(androidx.compose.foundation.j1 j1Var, kotlin.coroutines.jvm.internal.i iVar) {
        kotlin.coroutines.d dVar = null;
        k6 k6Var = new k6(this, new androidx.compose.foundation.text.selection.u0(this, dVar, 1), j1Var, dVar, 0);
        androidx.compose.foundation.o1 o1Var = this.a;
        o1Var.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.m1(j1Var, o1Var, k6Var, null), iVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : kotlin.y.a;
    }
}
