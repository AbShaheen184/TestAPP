package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.c1;
import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.j1;
import androidx.compose.foundation.lazy.layout.q0;
import androidx.compose.foundation.lazy.layout.u0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements q0 {
    public final /* synthetic */ x a;

    public a0(x xVar) {
        this.a = xVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final int a() {
        x xVar = this.a;
        return (int) (xVar.h().q == o1.e ? xVar.h().g() & 4294967295L : xVar.h().g() >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final float b() {
        x xVar = this.a;
        return (xVar.g() * 500) + xVar.d.c.g();
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final int c() {
        x xVar = this.a;
        return (-xVar.h().n) + xVar.h().r;
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final float d() {
        x xVar = this.a;
        int iG = xVar.g();
        int iG2 = xVar.d.c.g();
        return xVar.d() ? (iG * 500) + iG2 + 100 : (iG * 500) + iG2;
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final Object e(int i, u0 u0Var) {
        androidx.compose.foundation.text.input.internal.o oVar = x.w;
        x xVar = this.a;
        xVar.getClass();
        Object objC = xVar.c(j1.e, new c1(xVar, i, null, 7), u0Var);
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objC != aVar) {
            objC = yVar;
        }
        return objC == aVar ? objC : yVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final androidx.compose.ui.semantics.d f() {
        return new androidx.compose.ui.semantics.d(-1, -1);
    }
}
