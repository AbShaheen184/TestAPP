package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {
    private final j _context;
    private transient kotlin.coroutines.d<Object> intercepted;

    public c(kotlin.coroutines.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    @Override // kotlin.coroutines.d
    public j getContext() {
        j jVar = this._context;
        jVar.getClass();
        return jVar;
    }

    public final kotlin.coroutines.d<Object> intercepted() {
        kotlin.coroutines.d dVarInterceptContinuation = this.intercepted;
        if (dVarInterceptContinuation == null) {
            kotlin.coroutines.f fVar = (kotlin.coroutines.f) getContext().get(kotlin.coroutines.e.e);
            if (fVar == null || (dVarInterceptContinuation = fVar.interceptContinuation(this)) == null) {
                dVarInterceptContinuation = this;
            }
            this.intercepted = dVarInterceptContinuation;
        }
        return dVarInterceptContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        kotlin.coroutines.d<Object> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            kotlin.coroutines.h hVar = getContext().get(kotlin.coroutines.e.e);
            hVar.getClass();
            ((kotlin.coroutines.f) hVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = b.e;
    }

    public c(kotlin.coroutines.d dVar, j jVar) {
        super(dVar);
        this._context = jVar;
    }
}
