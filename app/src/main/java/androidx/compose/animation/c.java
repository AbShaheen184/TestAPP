package androidx.compose.animation;

import android.content.Context;
import android.view.Choreographer;
import android.view.MotionEvent;
import androidx.compose.ui.node.b2;
import androidx.compose.ui.platform.e3;
import androidx.compose.ui.platform.f3;
import androidx.compose.ui.platform.w1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj, Object obj2) {
        super(1);
        this.y = i;
        this.z = obj;
        this.A = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.foundation.text.input.internal.x xVar;
        switch (this.y) {
            case 0:
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
                androidx.compose.ui.layout.d1 d1Var = (androidx.compose.ui.layout.d1) this.z;
                float fG = ((l0) this.A).c.g();
                c1Var.getClass();
                long j = 0;
                androidx.compose.ui.layout.c1.b(c1Var, d1Var);
                d1Var.l0(androidx.compose.ui.unit.j.c((j & 4294967295L) | (j << 32), d1Var.B), fG, null);
                return kotlin.y.a;
            case 1:
                androidx.compose.ui.layout.c1.p((androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.d1) this.z, ((androidx.compose.ui.graphics.o) this.A).L);
                return kotlin.y.a;
            case 2:
                androidx.compose.ui.layout.c1.p((androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.d1) this.z, ((androidx.compose.ui.graphics.o0) this.A).W);
                return kotlin.y.a;
            case 3:
                MotionEvent motionEvent = (MotionEvent) obj;
                androidx.compose.ui.input.pointer.a0 a0Var = (androidx.compose.ui.input.pointer.a0) this.A;
                if (motionEvent.getActionMasked() == 0) {
                    ((com.google.firebase.messaging.n) this.z).z = ((Boolean) ((androidx.compose.ui.input.pointer.b0) a0Var.e()).invoke(motionEvent)).booleanValue() ? androidx.compose.ui.input.pointer.z.y : androidx.compose.ui.input.pointer.z.z;
                } else {
                    ((androidx.compose.ui.input.pointer.b0) a0Var.e()).invoke(motionEvent);
                }
                return kotlin.y.a;
            case 4:
                Context context = (Context) this.z;
                Context applicationContext = context.getApplicationContext();
                androidx.compose.ui.platform.k0 k0Var = (androidx.compose.ui.platform.k0) this.A;
                applicationContext.registerComponentCallbacks(k0Var);
                return new androidx.activity.compose.k(9, context, k0Var);
            case 5:
                Context context2 = (Context) this.z;
                Context applicationContext2 = context2.getApplicationContext();
                androidx.compose.ui.platform.l0 l0Var = (androidx.compose.ui.platform.l0) this.A;
                applicationContext2.registerComponentCallbacks(l0Var);
                return new androidx.activity.compose.k(10, context2, l0Var);
            case 6:
                return new w1((androidx.compose.foundation.text.input.internal.w) this.z, new z((androidx.compose.ui.platform.o0) this.A, 8));
            case 7:
                w1 w1Var = (w1) this.z;
                synchronized (w1Var.c) {
                    try {
                        w1Var.e = true;
                        androidx.compose.runtime.collection.b bVar = w1Var.d;
                        Object[] objArr = bVar.e;
                        int i = bVar.z;
                        for (int i2 = 0; i2 < i; i2++) {
                            androidx.compose.ui.text.input.m mVar = (androidx.compose.ui.text.input.m) ((b2) objArr[i2]).get();
                            if (mVar != null && (xVar = mVar.b) != null) {
                                xVar.closeConnection();
                                mVar.b = null;
                            }
                        }
                        w1Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                androidx.compose.ui.text.input.y yVar = ((androidx.compose.ui.platform.o0) this.A).y;
                yVar.b.set(null);
                yVar.a.d();
                return kotlin.y.a;
            case 8:
                androidx.compose.ui.platform.s0 s0Var = (androidx.compose.ui.platform.s0) this.z;
                androidx.compose.ui.platform.t0 t0Var = (androidx.compose.ui.platform.t0) this.A;
                synchronized (s0Var.z) {
                    s0Var.B.remove(t0Var);
                }
                return kotlin.y.a;
            case 9:
                ((Choreographer) ((androidx.compose.runtime.e) this.z).y).removeFrameCallback((androidx.compose.ui.platform.t0) this.A);
                return kotlin.y.a;
            case 10:
                androidx.compose.ui.platform.l lVar = (androidx.compose.ui.platform.l) obj;
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.A;
                f3 f3Var = (f3) this.z;
                if (!f3Var.z) {
                    androidx.lifecycle.p lifecycle = lVar.a.getLifecycle();
                    f3Var.B = pVar;
                    if (f3Var.A == null) {
                        f3Var.A = lifecycle;
                        lifecycle.a(f3Var);
                    } else if (((androidx.lifecycle.x) lifecycle).d.compareTo(androidx.lifecycle.o.z) >= 0) {
                        f3Var.y.B(new androidx.compose.runtime.internal.f(true, 1330788943, new e3(f3Var, pVar, 1)));
                    }
                }
                return kotlin.y.a;
            case 11:
                ((androidx.compose.ui.node.f0) this.z).f0(((androidx.compose.ui.r) obj).d((androidx.compose.ui.r) this.A));
                return kotlin.y.a;
            case 12:
                androidx.compose.ui.window.z zVar = (androidx.compose.ui.window.z) this.z;
                zVar.setPositionProvider((androidx.compose.ui.window.c0) this.A);
                zVar.o();
                return new androidx.compose.ui.window.j();
            default:
                Throwable th2 = (Throwable) obj;
                androidx.concurrent.futures.i iVar = (androidx.concurrent.futures.i) this.z;
                if (th2 == null) {
                    iVar.a(((Deferred) this.A).getCompleted());
                } else if (th2 instanceof CancellationException) {
                    iVar.d = true;
                    androidx.concurrent.futures.l lVar2 = iVar.b;
                    if (lVar2 != null && lVar2.y.cancel(true)) {
                        iVar.a = null;
                        iVar.b = null;
                        iVar.c = null;
                    }
                } else {
                    iVar.b(th2);
                }
                return kotlin.y.a;
        }
    }
}
