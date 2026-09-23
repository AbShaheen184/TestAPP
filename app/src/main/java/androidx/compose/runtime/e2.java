package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements CoroutineScope, b2 {
    public static final h A = new h();
    public final kotlin.coroutines.j e;
    public final e2 y = this;
    public volatile kotlin.coroutines.j z;

    public e2(kotlin.coroutines.j jVar) {
        this.e = jVar;
    }

    @Override // androidx.compose.runtime.b2
    public final void a() {
        d();
    }

    @Override // androidx.compose.runtime.b2
    public final void b() {
        d();
    }

    public final void d() {
        synchronized (this.y) {
            try {
                kotlin.coroutines.j jVar = this.z;
                if (jVar == null) {
                    this.z = A;
                } else {
                    JobKt.cancel(jVar, (CancellationException) new m0(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.j getCoroutineContext() {
        kotlin.coroutines.j jVarPlus;
        kotlin.coroutines.j jVar = this.z;
        if (jVar == null || jVar == A) {
            androidx.compose.runtime.tooling.d dVar = (androidx.compose.runtime.tooling.d) this.e.get(androidx.compose.runtime.tooling.d.y);
            kotlin.coroutines.j d2Var = dVar != null ? new d2(CoroutineExceptionHandler.Key, dVar, this) : kotlin.coroutines.k.e;
            synchronized (this.y) {
                try {
                    jVarPlus = this.z;
                    if (jVarPlus == null) {
                        kotlin.coroutines.j jVar2 = this.e;
                        jVarPlus = jVar2.plus(JobKt.Job((Job) jVar2.get(Job.Key))).plus(kotlin.coroutines.k.e).plus(d2Var);
                    } else if (jVarPlus == A) {
                        kotlin.coroutines.j jVar3 = this.e;
                        CompletableJob completableJobJob = JobKt.Job((Job) jVar3.get(Job.Key));
                        completableJobJob.cancel((CancellationException) new m0(0));
                        jVarPlus = jVar3.plus(completableJobJob).plus(kotlin.coroutines.k.e).plus(d2Var);
                    }
                    this.z = jVarPlus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            jVar = jVarPlus;
        }
        jVar.getClass();
        return jVar;
    }

    @Override // androidx.compose.runtime.b2
    public final void c() {
    }
}
