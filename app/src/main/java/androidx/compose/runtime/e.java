package androidx.compose.runtime;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements kotlin.coroutines.h {
    public final /* synthetic */ int e;
    public final Object y;
    public final Object z;

    public e(e eVar) {
        this.e = 1;
        this.y = eVar;
        this.z = new androidx.compose.foundation.lazy.layout.b1(1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    public final Object a(kotlin.jvm.functions.l lVar, kotlin.coroutines.d dVar) {
        k1 k1Var;
        boolean z;
        Object result;
        switch (this.e) {
            case 0:
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.h.f(dVar), 1);
                cancellableContinuationImpl.initCancellability();
                androidx.compose.runtime.internal.c cVar = (androidx.compose.runtime.internal.c) this.z;
                d dVar2 = new d();
                dVar2.a = cancellableContinuationImpl;
                dVar2.b = lVar;
                cancellableContinuationImpl.invokeOnCancellation(new androidx.compose.foundation.text.z0(cVar.m(dVar2, (t1) this.y), 1));
                return cancellableContinuationImpl.getResult();
            case 1:
                if (dVar instanceof k1) {
                    k1Var = (k1) dVar;
                    int i = k1Var.A;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        k1Var.A = i - Integer.MIN_VALUE;
                    } else {
                        k1Var = new k1(this, dVar);
                    }
                } else {
                    k1Var = new k1(this, dVar);
                }
                Object obj = k1Var.y;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i2 = k1Var.A;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.foundation.lazy.layout.b1 b1Var = (androidx.compose.foundation.lazy.layout.b1) this.z;
                    k1Var.e = lVar;
                    k1Var.A = 1;
                    synchronized (b1Var.y) {
                        z = b1Var.e;
                    }
                    if (z) {
                        result = kotlin.y.a;
                    } else {
                        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.h.f(k1Var), 1);
                        cancellableContinuationImpl2.initCancellability();
                        synchronized (b1Var.y) {
                            ((ArrayList) b1Var.z).add(cancellableContinuationImpl2);
                        }
                        cancellableContinuationImpl2.invokeOnCancellation(new androidx.compose.foundation.text.c0(3, b1Var, cancellableContinuationImpl2));
                        result = cancellableContinuationImpl2.getResult();
                        if (result != aVar) {
                            result = kotlin.y.a;
                        }
                    }
                    if (result != aVar) {
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lVar = k1Var.e;
                kotlin.a.e(obj);
                e eVar = (e) this.y;
                k1Var.e = null;
                k1Var.A = 2;
                Object objA = eVar.a(lVar, k1Var);
                if (objA != aVar) {
                    return objA;
                }
                return aVar;
            default:
                androidx.compose.ui.platform.s0 s0Var = (androidx.compose.ui.platform.s0) this.z;
                CancellableContinuationImpl cancellableContinuationImpl3 = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.h.f(dVar), 1);
                cancellableContinuationImpl3.initCancellability();
                androidx.compose.ui.platform.t0 t0Var = new androidx.compose.ui.platform.t0(cancellableContinuationImpl3, this, lVar);
                if (kotlin.jvm.internal.l.a(s0Var.e, (Choreographer) this.y)) {
                    synchronized (s0Var.z) {
                        s0Var.B.add(t0Var);
                        if (!s0Var.E) {
                            s0Var.E = true;
                            s0Var.e.postFrameCallback(s0Var.F);
                        }
                        break;
                    }
                    cancellableContinuationImpl3.invokeOnCancellation(new androidx.compose.animation.c(8, s0Var, t0Var));
                } else {
                    ((Choreographer) this.y).postFrameCallback(t0Var);
                    cancellableContinuationImpl3.invokeOnCancellation(new androidx.compose.animation.c(9, this, t0Var));
                }
                return cancellableContinuationImpl3.getResult();
        }
    }

    @Override // kotlin.coroutines.j
    public final Object fold(Object obj, kotlin.jvm.functions.p pVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return kotlin.coroutines.g.f(this, obj, pVar);
    }

    @Override // kotlin.coroutines.j
    public final kotlin.coroutines.h get(kotlin.coroutines.i iVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return kotlin.coroutines.g.g(this, iVar);
    }

    @Override // kotlin.coroutines.h
    public kotlin.coroutines.i getKey() {
        return f.z;
    }

    @Override // kotlin.coroutines.j
    public final kotlin.coroutines.j minusKey(kotlin.coroutines.i iVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return kotlin.coroutines.g.l(this, iVar);
    }

    @Override // kotlin.coroutines.j
    public final kotlin.coroutines.j plus(kotlin.coroutines.j jVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return kotlin.coroutines.g.o(jVar, this);
    }

    public e(Choreographer choreographer, androidx.compose.ui.platform.s0 s0Var) {
        this.e = 2;
        this.y = choreographer;
        this.z = s0Var;
    }

    public e(t1 t1Var) {
        this.e = 0;
        this.y = t1Var;
        this.z = new androidx.compose.runtime.internal.c();
    }
}
