package androidx.compose.foundation.gestures;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends l0 {
    public androidx.compose.foundation.text.input.internal.o f0;
    public o1 g0;
    public boolean h0;
    public kotlin.jvm.functions.q i0;
    public kotlin.jvm.functions.q j0;

    @Override // androidx.compose.foundation.gestures.l0
    public final Object T0(k0 k0Var, k0 k0Var2) {
        androidx.compose.foundation.text.input.internal.o oVar = this.f0;
        Object objA = ((androidx.compose.material3.internal.p) oVar.z).a(androidx.compose.foundation.j1.y, new androidx.compose.material3.internal.n(oVar, new androidx.compose.animation.b0(k0Var, this, (kotlin.coroutines.d) null, 6), (kotlin.coroutines.d) null), k0Var2);
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objA != aVar) {
            objA = yVar;
        }
        return objA == aVar ? objA : yVar;
    }

    @Override // androidx.compose.foundation.gestures.l0
    public final void Y0(long j) {
        if (!this.K || kotlin.jvm.internal.l.a(this.i0, o0.a)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(A0(), null, CoroutineStart.UNDISPATCHED, new p0(this, j, (kotlin.coroutines.d) null), 1, null);
    }

    @Override // androidx.compose.foundation.gestures.l0
    public final void Z0(w wVar) {
        if (!this.K || kotlin.jvm.internal.l.a(this.j0, o0.b)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(A0(), null, CoroutineStart.UNDISPATCHED, new androidx.compose.animation.b0(this, wVar, (kotlin.coroutines.d) null, 7), 1, null);
    }

    @Override // androidx.compose.foundation.gestures.l0
    public final boolean e1() {
        return this.h0;
    }
}
