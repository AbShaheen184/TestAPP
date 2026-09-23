package androidx.compose.foundation.text;

import android.os.Trace;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ j(androidx.work.a0 a0Var, String str, kotlin.jvm.functions.a aVar, androidx.lifecycle.b0 b0Var, androidx.concurrent.futures.i iVar) {
        this.e = 1;
        this.z = a0Var;
        this.y = str;
        this.A = aVar;
        this.B = b0Var;
        this.C = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.compose.runtime.snapshots.b bVarC;
        int i = this.e;
        Object obj = this.C;
        Object obj2 = this.B;
        Object obj3 = this.y;
        Object obj4 = this.A;
        Object obj5 = this.z;
        switch (i) {
            case 0:
                androidx.compose.ui.text.m0 m0Var = (androidx.compose.ui.text.m0) obj5;
                androidx.compose.ui.unit.m mVar = (androidx.compose.ui.unit.m) obj4;
                String str = (String) obj3;
                androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) obj2;
                androidx.compose.ui.text.font.d dVar = (androidx.compose.ui.text.font.d) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
                    androidx.compose.runtime.snapshots.b bVar = fVarJ instanceof androidx.compose.runtime.snapshots.b ? (androidx.compose.runtime.snapshots.b) fVarJ : null;
                    if (bVar == null || (bVarC = bVar.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        androidx.compose.runtime.snapshots.f fVarJ2 = bVarC.j();
                        try {
                            androidx.compose.ui.text.m0 m0VarH = androidx.compose.ui.text.d0.h(m0Var, mVar);
                            kotlin.collections.w wVar = kotlin.collections.w.e;
                            new androidx.compose.ui.text.platform.d(str, m0VarH, wVar, wVar, dVar, cVar).c();
                            androidx.compose.runtime.snapshots.f.q(fVarJ2);
                            bVarC.w().d();
                            bVarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            androidx.compose.runtime.snapshots.f.q(fVarJ2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            bVarC.c();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            case 1:
                String str2 = (String) obj3;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj4;
                androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) obj2;
                androidx.concurrent.futures.i iVar = (androidx.concurrent.futures.i) obj;
                ((androidx.work.a0) obj5).getClass();
                boolean zW = kotlin.math.a.w();
                if (zW) {
                    try {
                        Trace.beginSection(kotlin.math.a.S(str2));
                    } catch (Throwable th5) {
                        if (zW) {
                            Trace.endSection();
                        }
                        throw th5;
                    }
                }
                try {
                    aVar.invoke();
                    androidx.work.e0 e0Var = androidx.work.a0.b;
                    b0Var.b(e0Var);
                    iVar.a(e0Var);
                    break;
                } catch (Throwable th6) {
                    b0Var.b(new androidx.work.d0(th6));
                    iVar.b(th6);
                    break;
                }
                if (zW) {
                    Trace.endSection();
                    return;
                }
                return;
            default:
                com.google.common.util.concurrent.z0 z0Var = (com.google.common.util.concurrent.z0) obj5;
                com.google.common.util.concurrent.x0 x0Var = (com.google.common.util.concurrent.x0) obj4;
                ListenableFuture listenableFuture = (ListenableFuture) obj3;
                ListenableFuture listenableFuture2 = (ListenableFuture) obj2;
                com.google.common.util.concurrent.f0 f0Var = (com.google.common.util.concurrent.f0) obj;
                if (z0Var.isDone()) {
                    x0Var.n(listenableFuture);
                    return;
                } else {
                    if (listenableFuture2.isCancelled()) {
                        int i2 = com.google.common.util.concurrent.f0.B;
                        if (f0Var.compareAndSet(com.google.common.util.concurrent.e0.e, com.google.common.util.concurrent.e0.y)) {
                            z0Var.cancel(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.y = obj3;
        this.B = obj4;
        this.C = obj5;
    }
}
