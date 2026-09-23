package kotlinx.coroutines;

import com.app.mlounge.ui.viewmodel.q0;
import com.google.firebase.platforminfo.b;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.a implements f {
    public static final Key Key = new Key(null);

    public CoroutineDispatcher() {
        super(e.e);
    }

    public static /* synthetic */ CoroutineDispatcher limitedParallelism$default(CoroutineDispatcher coroutineDispatcher, int i, String str, int i2, Object obj) {
        if (obj != null) {
            b.n("Super calls with default arguments not supported in this target, function: limitedParallelism");
            return null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return coroutineDispatcher.limitedParallelism(i, str);
    }

    /* JADX INFO: renamed from: dispatch */
    public abstract void mo86dispatch(j jVar, Runnable runnable);

    @InternalCoroutinesApi
    public void dispatchYield(j jVar, Runnable runnable) {
        DispatchedContinuationKt.safeDispatch(this, jVar, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.j
    public <E extends h> E get(i iVar) {
        E e;
        iVar.getClass();
        if (!(iVar instanceof kotlin.coroutines.b)) {
            if (e.e == iVar) {
                return this;
            }
            return null;
        }
        kotlin.coroutines.b bVar = (kotlin.coroutines.b) iVar;
        if (!bVar.isSubKey$kotlin_stdlib(getKey()) || (e = (E) bVar.tryCast$kotlin_stdlib(this)) == null) {
            return null;
        }
        return e;
    }

    @Override // kotlin.coroutines.f
    public final <T> d<T> interceptContinuation(d<? super T> dVar) {
        return new DispatchedContinuation(this, dVar);
    }

    public boolean isDispatchNeeded(j jVar) {
        return true;
    }

    public CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return new LimitedDispatcher(this, i, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (kotlin.coroutines.e.e == r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        return kotlin.coroutines.k.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r2.tryCast$kotlin_stdlib(r1) != null) goto L11;
     */
    @Override // kotlin.coroutines.a, kotlin.coroutines.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlin.coroutines.j minusKey(kotlin.coroutines.i r2) {
        /*
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof kotlin.coroutines.b
            if (r0 == 0) goto L1a
            kotlin.coroutines.b r2 = (kotlin.coroutines.b) r2
            kotlin.coroutines.i r0 = r1.getKey()
            boolean r0 = r2.isSubKey$kotlin_stdlib(r0)
            if (r0 == 0) goto L21
            kotlin.coroutines.h r2 = r2.tryCast$kotlin_stdlib(r1)
            if (r2 == 0) goto L21
            goto L1e
        L1a:
            kotlin.coroutines.e r0 = kotlin.coroutines.e.e
            if (r0 != r2) goto L21
        L1e:
            kotlin.coroutines.k r2 = kotlin.coroutines.k.e
            return r2
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CoroutineDispatcher.minusKey(kotlin.coroutines.i):kotlin.coroutines.j");
    }

    @Override // kotlin.coroutines.f
    public final void releaseInterceptedContinuation(d<?> dVar) {
        dVar.getClass();
        ((DispatchedContinuation) dVar).release$kotlinx_coroutines_core();
    }

    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this);
    }

    @c
    public /* synthetic */ CoroutineDispatcher limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class Key extends kotlin.coroutines.b {
        private Key() {
            super(e.e, new q0(13));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CoroutineDispatcher _init_$lambda$0(h hVar) {
            if (hVar instanceof CoroutineDispatcher) {
                return (CoroutineDispatcher) hVar;
            }
            return null;
        }

        public /* synthetic */ Key(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    @c
    public final CoroutineDispatcher plus(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }
}
