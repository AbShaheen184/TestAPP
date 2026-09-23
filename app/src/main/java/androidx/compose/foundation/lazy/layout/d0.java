package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.n1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements androidx.compose.ui.layout.s0 {
    public final androidx.collection.z A;
    public final x e;
    public final n1 y;
    public final y z;

    public d0(x xVar, n1 n1Var) {
        this.e = xVar;
        this.y = n1Var;
        this.z = (y) xVar.b.invoke();
        androidx.collection.o.a();
        this.A = new androidx.collection.z();
    }

    @Override // androidx.compose.ui.unit.c
    public final long H(float f) {
        return this.y.H(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float M(int i) {
        return this.y.M(i);
    }

    @Override // androidx.compose.ui.unit.c
    public final float P(float f) {
        return this.y.P(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float U() {
        return this.y.U();
    }

    @Override // androidx.compose.ui.layout.s
    public final boolean V() {
        return this.y.V();
    }

    @Override // androidx.compose.ui.unit.c
    public final float W(float f) {
        return this.y.W(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.y.a();
    }

    @Override // androidx.compose.ui.unit.c
    public final int f0(long j) {
        return this.y.f0(j);
    }

    @Override // androidx.compose.ui.layout.s
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return this.y.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.s0
    public final androidx.compose.ui.layout.r0 h0(int i, int i2, Map map, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        return this.y.h0(i, i2, map, lVar, lVar2);
    }

    @Override // androidx.compose.ui.unit.c
    public final int i0(float f) {
        return this.y.i0(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final long m0(long j) {
        return this.y.m0(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final long n(float f) {
        return this.y.n(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final long o(long j) {
        return this.y.o(j);
    }

    @Override // androidx.compose.ui.layout.s0
    public final androidx.compose.ui.layout.r0 q(int i, int i2, Map map, kotlin.jvm.functions.l lVar) {
        return this.y.q(i, i2, map, lVar);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t(long j) {
        return this.y.t(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t0(long j) {
        return this.y.t0(j);
    }
}
