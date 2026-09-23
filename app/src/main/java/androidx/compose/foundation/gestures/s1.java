package androidx.compose.foundation.gestures;

import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements p1, androidx.compose.ui.unit.c {
    public final Mutex A = MutexKt.Mutex(false);
    public final /* synthetic */ androidx.compose.ui.unit.c e;
    public boolean y;
    public boolean z;

    public s1(androidx.compose.ui.unit.c cVar) {
        this.e = cVar;
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

    @Override // androidx.compose.ui.unit.c
    public final float W(float f) {
        return this.e.W(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e.a();
    }

    public final void b() {
        this.y = true;
        Mutex mutex = this.A;
        if (mutex.isLocked()) {
            Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(kotlin.coroutines.jvm.internal.c cVar) {
        q1 q1Var;
        if (cVar instanceof q1) {
            q1Var = (q1) cVar;
            int i = q1Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                q1Var.z = i - Integer.MIN_VALUE;
            } else {
                q1Var = new q1(this, cVar);
            }
        } else {
            q1Var = new q1(this, cVar);
        }
        Object obj = q1Var.e;
        int i2 = q1Var.z;
        if (i2 == 0) {
            kotlin.a.e(obj);
            q1Var.z = 1;
            Object objLock$default = Mutex.DefaultImpls.lock$default(this.A, null, q1Var, 1, null);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objLock$default == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        this.y = false;
        this.z = false;
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(kotlin.coroutines.jvm.internal.c cVar) {
        r1 r1Var;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i = r1Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                r1Var.z = i - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, cVar);
            }
        } else {
            r1Var = new r1(this, cVar);
        }
        Object obj = r1Var.e;
        int i2 = r1Var.z;
        Mutex mutex = this.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            if (!this.y && !this.z) {
                r1Var.z = 1;
                Object objLock$default = Mutex.DefaultImpls.lock$default(mutex, null, r1Var, 1, null);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objLock$default == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(this.y);
        }
        if (i2 != 1) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
        return Boolean.valueOf(this.y);
    }

    @Override // androidx.compose.ui.unit.c
    public final int f0(long j) {
        return this.e.f0(j);
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
