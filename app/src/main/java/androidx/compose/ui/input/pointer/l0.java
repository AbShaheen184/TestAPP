package androidx.compose.ui.input.pointer;

import androidx.compose.animation.core.c1;
import androidx.compose.ui.node.r1;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends androidx.compose.ui.q implements y, androidx.compose.ui.unit.c, r1 {
    public Object L;
    public Object M;
    public PointerInputEventHandler N;
    public Job O;
    public m P = h0.a;
    public final androidx.compose.runtime.collection.b Q;
    public final androidx.compose.runtime.collection.b R;
    public final androidx.compose.runtime.collection.b S;
    public m T;
    public long U;

    public l0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.L = obj;
        this.M = obj2;
        this.N = pointerInputEventHandler;
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new k0[16]);
        this.Q = bVar;
        this.R = bVar;
        this.S = new androidx.compose.runtime.collection.b(new k0[16]);
        this.U = 0L;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.ui.node.r1
    public final void D(m mVar, n nVar, long j) {
        this.U = j;
        if (nVar == n.e) {
            this.P = mVar;
        }
        kotlin.coroutines.d dVar = null;
        if (this.O == null) {
            this.O = BuildersKt__Builders_commonKt.launch$default(A0(), null, CoroutineStart.UNDISPATCHED, new c1(this, dVar, 15), 1, null);
        }
        N0(mVar, nVar);
        ?? r8 = mVar.a;
        int size = r8.size();
        for (int i = 0; i < size; i++) {
            if (!u.d((v) r8.get(i))) {
                this.T = mVar;
            }
        }
        mVar = null;
        this.T = mVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.ui.node.r1
    public final void E() {
        m mVar = this.T;
        if (mVar == null) {
            return;
        }
        ?? r1 = mVar.a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            if (((v) r1.get(i)).d) {
                ArrayList arrayList = new ArrayList(r1.size());
                int size2 = r1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    v vVar = (v) r1.get(i2);
                    long j = vVar.a;
                    long j2 = vVar.c;
                    long j3 = vVar.b;
                    float f = vVar.e;
                    boolean z = vVar.d;
                    arrayList.add(new v(j, j3, j2, false, f, j3, j2, z, z, vVar.i, 0L));
                }
                m mVar2 = new m(arrayList, null);
                this.P = mVar2;
                N0(mVar2, n.e);
                N0(mVar2, n.y);
                N0(mVar2, n.z);
                this.T = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        O0();
    }

    public final Object M0(kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.h.f(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        k0 k0Var = new k0(this, cancellableContinuationImpl);
        synchronized (this.R) {
            this.Q.b(k0Var);
            new kotlin.coroutines.l(kotlin.coroutines.intrinsics.h.f(kotlin.coroutines.intrinsics.h.d(pVar, k0Var, k0Var))).resumeWith(kotlin.y.a);
        }
        cancellableContinuationImpl.invokeOnCancellation(new androidx.compose.animation.e(k0Var, 9));
        return cancellableContinuationImpl.getResult();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004e A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0022, B:17:0x0025, B:20:0x0031, B:22:0x0039, B:24:0x003d, B:25:0x0042, B:26:0x0045, B:28:0x004e, B:30:0x0056, B:32:0x005a), top: B:41:0x000d }] */
    public final void N0(m mVar, n nVar) {
        Object[] objArr;
        int i;
        int i2;
        k0 k0Var;
        CancellableContinuationImpl cancellableContinuationImpl;
        CancellableContinuationImpl cancellableContinuationImpl2;
        synchronized (this.R) {
            androidx.compose.runtime.collection.b bVar = this.S;
            bVar.c(bVar.z, this.Q);
        }
        try {
            int iOrdinal = nVar.ordinal();
            if (iOrdinal == 0) {
                androidx.compose.runtime.collection.b bVar2 = this.S;
                objArr = bVar2.e;
                i = bVar2.z;
                for (i2 = 0; i2 < i; i2++) {
                    k0Var = (k0) objArr[i2];
                    if (nVar != k0Var.A && (cancellableContinuationImpl = k0Var.z) != null) {
                        k0Var.z = null;
                        cancellableContinuationImpl.resumeWith(mVar);
                    }
                }
            } else if (iOrdinal == 1) {
                androidx.compose.runtime.collection.b bVar3 = this.S;
                int i3 = bVar3.z - 1;
                Object[] objArr2 = bVar3.e;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        k0 k0Var2 = (k0) objArr2[i3];
                        if (nVar == k0Var2.A && (cancellableContinuationImpl2 = k0Var2.z) != null) {
                            k0Var2.z = null;
                            cancellableContinuationImpl2.resumeWith(mVar);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new androidx.compose.ui.res.e(11);
                }
                androidx.compose.runtime.collection.b bVar4 = this.S;
                objArr = bVar4.e;
                i = bVar4.z;
                while (i2 < i) {
                    k0Var = (k0) objArr[i2];
                    if (nVar != k0Var.A) {
                    }
                }
            }
            this.S.g();
        } catch (Throwable th) {
            this.S.g();
            throw th;
        }
    }

    public final void O0() {
        Job job = this.O;
        if (job != null) {
            job.cancel((CancellationException) new androidx.compose.ui.s("Pointer input was reset", 2));
            this.O = null;
        }
    }

    @Override // androidx.compose.ui.unit.c
    public final float U() {
        return androidx.compose.ui.node.l.v(this).W.U();
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return androidx.compose.ui.node.l.v(this).W.a();
    }

    @Override // androidx.compose.ui.node.j, androidx.compose.ui.node.r1
    public final void b() {
        O0();
    }

    @Override // androidx.compose.ui.node.r1
    public final void q0() {
        O0();
    }
}
