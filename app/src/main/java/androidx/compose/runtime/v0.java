package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements b2, CoroutineExceptionHandler {
    public Job A;
    public final kotlin.coroutines.j e;
    public final kotlin.jvm.functions.p y;
    public final CoroutineScope z;

    public v0(kotlin.coroutines.j jVar, kotlin.jvm.functions.p pVar) {
        this.e = jVar;
        this.y = pVar;
        this.z = CoroutineScopeKt.CoroutineScope(jVar.plus(this));
    }

    @Override // androidx.compose.runtime.b2
    public final void a() {
        Job job = this.A;
        if (job != null) {
            job.cancel((CancellationException) new m0(1));
        }
        this.A = null;
    }

    @Override // androidx.compose.runtime.b2
    public final void b() {
        Job job = this.A;
        if (job != null) {
            job.cancel((CancellationException) new m0(1));
        }
        this.A = null;
    }

    @Override // androidx.compose.runtime.b2
    public final void c() {
        Job job = this.A;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, "Old job was still running!", null, 2, null);
        }
        this.A = BuildersKt__Builders_commonKt.launch$default(this.z, null, null, this.y, 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.j
    public final /* bridge */ Object fold(Object obj, kotlin.jvm.functions.p pVar) {
        return CoroutineExceptionHandler.DefaultImpls.fold(this, obj, pVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.j
    public final /* bridge */ kotlin.coroutines.h get(kotlin.coroutines.i iVar) {
        return CoroutineExceptionHandler.DefaultImpls.get(this, iVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.h
    public final kotlin.coroutines.i getKey() {
        return CoroutineExceptionHandler.Key;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.j jVar, Throwable th) throws Throwable {
        androidx.compose.runtime.tooling.d dVar = (androidx.compose.runtime.tooling.d) jVar.get(androidx.compose.runtime.tooling.d.y);
        if (dVar != null) {
            coil3.network.g.G(th, new androidx.activity.compose.f(18, dVar, this));
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.e.get(CoroutineExceptionHandler.Key);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(jVar, th);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.j
    public final /* bridge */ kotlin.coroutines.j minusKey(kotlin.coroutines.i iVar) {
        return CoroutineExceptionHandler.DefaultImpls.minusKey(this, iVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.j
    public final /* bridge */ kotlin.coroutines.j plus(kotlin.coroutines.j jVar) {
        return CoroutineExceptionHandler.DefaultImpls.plus(this, jVar);
    }
}
