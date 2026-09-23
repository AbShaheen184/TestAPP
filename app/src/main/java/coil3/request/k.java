package coil3.request;

import androidx.lifecycle.v;
import java.util.concurrent.CancellationException;
import kotlin.y;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements o, androidx.lifecycle.f {
    public final androidx.lifecycle.p e;
    public final Job y;

    public k(androidx.lifecycle.p pVar, Job job) {
        this.e = pVar;
        this.y = job;
    }

    @Override // coil3.request.o
    public final Object b(coil3.o oVar) throws Throwable {
        Object objD = coil3.network.g.d(this.e, oVar);
        return objD == kotlin.coroutines.intrinsics.a.e ? objD : y.a;
    }

    @Override // coil3.request.o
    public final void complete() {
        this.e.b(this);
    }

    @Override // coil3.request.o
    public final void start() {
        this.e.a(this);
    }

    @Override // androidx.lifecycle.f
    public final void x(v vVar) {
        Job.DefaultImpls.cancel$default(this.y, (CancellationException) null, 1, (Object) null);
    }
}
