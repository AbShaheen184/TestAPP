package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements l2 {
    public final kotlin.jvm.functions.l a;
    public final m b = new m(this);
    public final androidx.compose.foundation.o1 c = new androidx.compose.foundation.o1();
    public final androidx.compose.runtime.j1 d;
    public final androidx.compose.runtime.j1 e;
    public final androidx.compose.runtime.j1 f;

    public n(kotlin.jvm.functions.l lVar) {
        this.a = lVar;
        Boolean bool = Boolean.FALSE;
        this.d = androidx.compose.runtime.t.r(bool);
        this.e = androidx.compose.runtime.t.r(bool);
        this.f = androidx.compose.runtime.t.r(bool);
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final Object c(androidx.compose.foundation.j1 j1Var, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new androidx.compose.animation.b0(this, j1Var, pVar, null, 5), cVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : kotlin.y.a;
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
