package androidx.compose.ui.layout;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements s0, s {
    public final /* synthetic */ s e;
    public final androidx.compose.ui.unit.m y;

    public w(s sVar, androidx.compose.ui.unit.m mVar) {
        this.e = sVar;
        this.y = mVar;
    }

    @Override // androidx.compose.ui.unit.c
    public final long H(float f) {
        return this.e.H(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float M(int i) {
        return this.e.M(i);
    }

    @Override // androidx.compose.ui.unit.c
    public final float P(float f) {
        return this.e.P(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float U() {
        return this.e.U();
    }

    @Override // androidx.compose.ui.layout.s
    public final boolean V() {
        return this.e.V();
    }

    @Override // androidx.compose.ui.unit.c
    public final float W(float f) {
        return this.e.W(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e.a();
    }

    @Override // androidx.compose.ui.unit.c
    public final int f0(long j) {
        return this.e.f0(j);
    }

    @Override // androidx.compose.ui.layout.s
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return this.y;
    }

    @Override // androidx.compose.ui.layout.s0
    public final r0 h0(int i, int i2, Map map, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            androidx.compose.ui.internal.a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new v(i, i2, map, lVar);
    }

    @Override // androidx.compose.ui.unit.c
    public final int i0(float f) {
        return this.e.i0(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final long m0(long j) {
        return this.e.m0(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final long n(float f) {
        return this.e.n(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final long o(long j) {
        return this.e.o(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t(long j) {
        return this.e.t(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t0(long j) {
        return this.e.t0(j);
    }
}
