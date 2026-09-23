package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements androidx.compose.ui.input.nestedscroll.a {
    public final r2 e;
    public boolean y;

    public e2(r2 r2Var, boolean z) {
        this.e = r2Var;
        this.y = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    public final Object m(long j, long j2, kotlin.coroutines.d dVar) throws Throwable {
        d2 d2Var;
        long jD;
        if (dVar instanceof d2) {
            d2Var = (d2) dVar;
            int i = d2Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                d2Var.A = i - Integer.MIN_VALUE;
            } else {
                d2Var = new d2(this, (kotlin.coroutines.jvm.internal.c) dVar);
            }
        } else {
            d2Var = new d2(this, (kotlin.coroutines.jvm.internal.c) dVar);
        }
        Object objA = d2Var.y;
        int i2 = d2Var.A;
        if (i2 == 0) {
            kotlin.a.e(objA);
            jD = 0;
            if (this.y) {
                r2 r2Var = this.e;
                if (!r2Var.i) {
                    d2Var.e = j2;
                    d2Var.A = 1;
                    objA = r2Var.a(j2, d2Var);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objA == aVar) {
                        return aVar;
                    }
                }
                jD = androidx.compose.ui.unit.q.d(j2, jD);
            }
            return new androidx.compose.ui.unit.q(jD);
        }
        if (i2 != 1) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = d2Var.e;
        kotlin.a.e(objA);
        jD = ((androidx.compose.ui.unit.q) objA).a;
        jD = androidx.compose.ui.unit.q.d(j2, jD);
        return new androidx.compose.ui.unit.q(jD);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long p0(long j, long j2, int i) {
        if (!this.y) {
            return 0L;
        }
        r2 r2Var = this.e;
        if (r2Var.a.a()) {
            return 0L;
        }
        return r2Var.h(r2Var.d(r2Var.a.e(r2Var.d(r2Var.g(j2)))));
    }
}
