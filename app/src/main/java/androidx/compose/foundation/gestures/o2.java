package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements t1 {
    public final /* synthetic */ r2 a;
    public final /* synthetic */ q2 b;

    public o2(r2 r2Var, q2 q2Var) {
        this.a = r2Var;
        this.b = q2Var;
    }

    @Override // androidx.compose.foundation.gestures.t1
    public final float a(float f) {
        float fAbs = Math.abs(f);
        r2 r2Var = this.a;
        if (fAbs != 0.0f && !((Boolean) r2Var.h.invoke()).booleanValue()) {
            throw new androidx.compose.foundation.k1("The fling animation was cancelled", 0);
        }
        return r2Var.d(r2Var.g(this.b.a(2, r2Var.e(r2Var.h(f)))));
    }
}
