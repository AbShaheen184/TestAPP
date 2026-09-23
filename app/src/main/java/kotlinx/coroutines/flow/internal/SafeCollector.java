package kotlinx.coroutines.flow.internal;

import com.app.mlounge.ui.screens.sources.b;
import kotlin.coroutines.d;
import kotlin.coroutines.h;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.k;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.l;
import kotlin.m;
import kotlin.y;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class SafeCollector<T> extends c implements FlowCollector<T> {
    public final j collectContext;
    public final int collectContextSize;
    public final FlowCollector<T> collector;
    private d<? super y> completion_;
    private j lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(FlowCollector<? super T> flowCollector, j jVar) {
        super(NoOpContinuation.INSTANCE, k.e);
        this.collector = flowCollector;
        this.collectContext = jVar;
        this.collectContextSize = ((Number) jVar.fold(0, new b(12))).intValue();
    }

    private final void checkContext(j jVar, j jVar2, T t) {
        if (jVar2 instanceof DownstreamExceptionContext) {
            exceptionTransparencyViolated((DownstreamExceptionContext) jVar2, t);
        }
        SafeCollector_commonKt.checkContext(this, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int collectContextSize$lambda$0(int i, h hVar) {
        return i + 1;
    }

    private final Object emit(d<? super y> dVar, T t) {
        j context = dVar.getContext();
        JobKt.ensureActive(context);
        j jVar = this.lastEmissionContext;
        if (jVar != context) {
            checkContext(context, jVar, t);
            this.lastEmissionContext = context;
        }
        this.completion_ = dVar;
        q qVar = SafeCollectorKt.emitFun;
        FlowCollector<T> flowCollector = this.collector;
        flowCollector.getClass();
        Object objInvoke = qVar.invoke(flowCollector, t, this);
        if (!l.a(objInvoke, kotlin.coroutines.intrinsics.a.e)) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    private final void exceptionTransparencyViolated(DownstreamExceptionContext downstreamExceptionContext, Object obj) {
        throw new IllegalStateException(kotlin.text.l.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + downstreamExceptionContext.e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.d
    public kotlin.coroutines.jvm.internal.d getCallerFrame() {
        d<? super y> dVar = this.completion_;
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            return (kotlin.coroutines.jvm.internal.d) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.c, kotlin.coroutines.d
    public j getContext() {
        j jVar = this.lastEmissionContext;
        return jVar == null ? k.e : jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.d
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Throwable thA = m.a(obj);
        if (thA != null) {
            this.lastEmissionContext = new DownstreamExceptionContext(thA, getContext());
        }
        d<? super y> dVar = this.completion_;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return kotlin.coroutines.intrinsics.a.e;
    }

    @Override // kotlin.coroutines.jvm.internal.c, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, d<? super y> dVar) {
        try {
            Object objEmit = emit(dVar, t);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objEmit == aVar) {
                dVar.getClass();
            }
            return objEmit == aVar ? objEmit : y.a;
        } catch (Throwable th) {
            this.lastEmissionContext = new DownstreamExceptionContext(th, dVar.getContext());
            throw th;
        }
    }
}
