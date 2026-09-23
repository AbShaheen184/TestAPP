package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f5 implements androidx.compose.ui.input.nestedscroll.a {
    public final /* synthetic */ j5 e;
    public final /* synthetic */ kotlin.jvm.functions.l y;

    public f5(j5 j5Var, kotlin.jvm.functions.l lVar) {
        this.e = j5Var;
        this.y = lVar;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long J(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        androidx.compose.material3.internal.p pVar = this.e.c;
        float fE = pVar.e(fIntBitsToFloat);
        androidx.compose.runtime.f1 f1Var = pVar.j;
        float fG = Float.isNaN(f1Var.g()) ? 0.0f : f1Var.g();
        f1Var.h(fE);
        return a(fE - fG);
    }

    public final long a(float f) {
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final Object d0(long j, kotlin.coroutines.d dVar) {
        float fC = androidx.compose.ui.unit.q.c(j);
        j5 j5Var = this.e;
        float f = j5Var.c.f();
        float fC2 = j5Var.c.d().c();
        if (fC >= 0.0f || f <= fC2) {
            j = 0;
        } else {
            this.y.invoke(new Float(fC));
        }
        return new androidx.compose.ui.unit.q(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final Object m(long j, long j2, kotlin.coroutines.d dVar) {
        this.y.invoke(new Float(androidx.compose.ui.unit.q.c(j2)));
        return new androidx.compose.ui.unit.q(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long p0(long j, long j2, int i) {
        if (i != 1) {
            return 0L;
        }
        androidx.compose.material3.internal.p pVar = this.e.c;
        float fE = pVar.e(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        androidx.compose.runtime.f1 f1Var = pVar.j;
        float fG = Float.isNaN(f1Var.g()) ? 0.0f : f1Var.g();
        f1Var.h(fE);
        return a(fE - fG);
    }
}
