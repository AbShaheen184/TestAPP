package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.lazy.layout.q0;
import androidx.compose.foundation.lazy.layout.u0;
import androidx.compose.runtime.g0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements q0 {
    public final g0 a;
    public final /* synthetic */ y b;
    public final /* synthetic */ boolean c;

    public f(y yVar, boolean z) {
        this.b = yVar;
        this.c = z;
        this.a = androidx.compose.runtime.t.k(new e(yVar, 0));
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final int a() {
        y yVar = this.b;
        return (int) (yVar.i().o == o1.e ? yVar.i().g() & 4294967295L : yVar.i().g() >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final float b() {
        y yVar = this.b;
        return (yVar.g() * 500) + yVar.h();
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final int c() {
        y yVar = this.b;
        return (-yVar.i().l) + yVar.i().p;
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final float d() {
        y yVar = this.b;
        int iG = yVar.g();
        int iH = yVar.h();
        return yVar.d() ? (iG * 500) + iH + 100 : (iG * 500) + iH;
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final Object e(int i, u0 u0Var) {
        Object objK = y.k(this.b, i, u0Var);
        return objK == kotlin.coroutines.intrinsics.a.e ? objK : kotlin.y.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final androidx.compose.ui.semantics.d f() {
        boolean z = this.c;
        g0 g0Var = this.a;
        return z ? new androidx.compose.ui.semantics.d(((Number) g0Var.getValue()).intValue(), 1) : new androidx.compose.ui.semantics.d(1, ((Number) g0Var.getValue()).intValue());
    }
}
