package kotlinx.coroutines;

import com.google.firebase.platforminfo.b;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.h;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.time.g;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class DelayKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.DelayKt$awaitCancellation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    @e(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation")
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DelayKt.awaitCancellation(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitCancellation(d<?> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            anonymousClass1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(h.f(anonymousClass1), 1);
            cancellableContinuationImpl.initCancellability();
            Object result = cancellableContinuationImpl.getResult();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (result == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        b.b();
        return null;
    }

    public static final Object delay(long j, d<? super y> dVar) {
        y yVar = y.a;
        if (j <= 0) {
            return yVar;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(h.f(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        if (j < Long.MAX_VALUE) {
            getDelay(cancellableContinuationImpl.getContext()).mo87scheduleResumeAfterDelay(j, cancellableContinuationImpl);
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == kotlin.coroutines.intrinsics.a.e ? result : yVar;
    }

    /* JADX INFO: renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final Object m17delayVtjQ1oo(long j, d<? super y> dVar) {
        Object objDelay = delay(m18toDelayMillisLRDsOJo(j), dVar);
        return objDelay == kotlin.coroutines.intrinsics.a.e ? objDelay : y.a;
    }

    public static final Delay getDelay(j jVar) {
        kotlin.coroutines.h hVar = jVar.get(kotlin.coroutines.e.e);
        Delay delay = hVar instanceof Delay ? (Delay) hVar : null;
        return delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
    }

    /* JADX INFO: renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m18toDelayMillisLRDsOJo(long j) {
        g gVar = kotlin.time.a.y;
        boolean z = j > 0;
        if (z) {
            return kotlin.time.a.f(kotlin.time.a.i(j, dagger.hilt.android.internal.a.i(999999L, kotlin.time.c.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        coil3.g.a();
        return 0L;
    }
}
