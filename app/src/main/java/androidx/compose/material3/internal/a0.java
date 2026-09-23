package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.o1;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends androidx.compose.ui.q implements androidx.compose.ui.node.w {
    public p L;
    public kotlin.jvm.functions.p M;
    public o1 N;
    public boolean O;

    @Override // androidx.compose.ui.q
    public final void F0() {
        this.O = false;
    }

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(j);
        boolean z = true;
        if (!s0Var.V() || !this.O) {
            kotlin.k kVar = (kotlin.k) this.M.invoke(new androidx.compose.ui.unit.l((((long) d1VarF.e) << 32) | (((long) d1VarF.y) & 4294967295L)), new androidx.compose.ui.unit.a(j));
            p pVar = this.L;
            h0 h0Var = (h0) kVar.e;
            Object obj = kVar.y;
            if (!kotlin.jvm.internal.l.a(pVar.d(), h0Var)) {
                pVar.m.setValue(h0Var);
                Mutex mutex = pVar.e.b;
                boolean zTryLock$default = Mutex.DefaultImpls.tryLock$default(mutex, null, 1, null);
                if (zTryLock$default) {
                    try {
                        m mVar = pVar.n;
                        float fD = pVar.d().d(obj);
                        if (!Float.isNaN(fD)) {
                            m.a(mVar, fD);
                            pVar.h(null);
                        }
                        pVar.g(obj);
                        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                    } catch (Throwable th) {
                        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                        throw th;
                    }
                }
                if (!zTryLock$default) {
                    pVar.h(obj);
                }
            }
        }
        if (!s0Var.V() && !this.O) {
            z = false;
        }
        this.O = z;
        return s0Var.q(d1VarF.e, d1VarF.y, kotlin.collections.x.e, new androidx.compose.animation.core.a(13, s0Var, this, d1VarF));
    }
}
