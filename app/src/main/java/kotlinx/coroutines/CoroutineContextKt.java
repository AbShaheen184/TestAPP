package kotlinx.coroutines;

import androidx.activity.compose.i;
import com.app.mlounge.ui.screens.sources.b;
import kotlin.coroutines.e;
import kotlin.coroutines.h;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.k;
import kotlin.jvm.internal.z;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineContextKt {
    private static final String DEBUG_THREAD_NAME_SEPARATOR = " @";

    private static final j foldCopies(j jVar, j jVar2, boolean z) {
        boolean zHasCopyableElements = hasCopyableElements(jVar);
        boolean zHasCopyableElements2 = hasCopyableElements(jVar2);
        if (!zHasCopyableElements && !zHasCopyableElements2) {
            return jVar.plus(jVar2);
        }
        z zVar = new z();
        zVar.e = jVar2;
        i iVar = new i(zVar, z, 6);
        k kVar = k.e;
        j jVar3 = (j) jVar.fold(kVar, iVar);
        if (zHasCopyableElements2) {
            zVar.e = ((j) zVar.e).fold(kVar, new b(9));
        }
        return jVar3.plus((j) zVar.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j foldCopies$lambda$1(z zVar, boolean z, j jVar, h hVar) {
        if (!(hVar instanceof CopyableThreadContextElement)) {
            return jVar.plus(hVar);
        }
        h hVar2 = ((j) zVar.e).get(hVar.getKey());
        if (hVar2 == null) {
            return jVar.plus(z ? ((CopyableThreadContextElement) hVar).copyForChild() : (CopyableThreadContextElement) hVar);
        }
        zVar.e = ((j) zVar.e).minusKey(hVar.getKey());
        return jVar.plus(((CopyableThreadContextElement) hVar).mergeForChild(hVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j foldCopies$lambda$2(j jVar, h hVar) {
        return hVar instanceof CopyableThreadContextElement ? jVar.plus(((CopyableThreadContextElement) hVar).copyForChild()) : jVar.plus(hVar);
    }

    public static final String getCoroutineName(j jVar) {
        return null;
    }

    private static final boolean hasCopyableElements(j jVar) {
        return ((Boolean) jVar.fold(Boolean.FALSE, new b(8))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasCopyableElements$lambda$0(boolean z, h hVar) {
        return z || (hVar instanceof CopyableThreadContextElement);
    }

    @ExperimentalCoroutinesApi
    public static final j newCoroutineContext(CoroutineScope coroutineScope, j jVar) {
        j jVarFoldCopies = foldCopies(coroutineScope.getCoroutineContext(), jVar, true);
        return (jVarFoldCopies == Dispatchers.getDefault() || jVarFoldCopies.get(e.e) != null) ? jVarFoldCopies : jVarFoldCopies.plus(Dispatchers.getDefault());
    }

    public static final UndispatchedCoroutine<?> undispatchedCompletion(d dVar) {
        while (!(dVar instanceof DispatchedCoroutine) && (dVar = dVar.getCallerFrame()) != null) {
            if (dVar instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) dVar;
            }
        }
        return null;
    }

    public static final UndispatchedCoroutine<?> updateUndispatchedCompletion(kotlin.coroutines.d<?> dVar, j jVar, Object obj) {
        if (!(dVar instanceof d) || jVar.get(UndispatchedMarker.INSTANCE) == null) {
            return null;
        }
        UndispatchedCoroutine<?> undispatchedCoroutineUndispatchedCompletion = undispatchedCompletion((d) dVar);
        if (undispatchedCoroutineUndispatchedCompletion != null) {
            undispatchedCoroutineUndispatchedCompletion.saveThreadContext(jVar, obj);
        }
        return undispatchedCoroutineUndispatchedCompletion;
    }

    public static final <T> T withContinuationContext(kotlin.coroutines.d<?> dVar, Object obj, kotlin.jvm.functions.a aVar) {
        boolean zClearThreadContext;
        j context = dVar.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? updateUndispatchedCompletion(dVar, context, objUpdateThreadContext) : null;
        try {
            T t = (T) aVar.invoke();
            if (undispatchedCoroutineUpdateUndispatchedCompletion != null) {
                if (!zClearThreadContext) {
                    return t;
                }
            }
            return t;
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public static final <T> T withCoroutineContext(j jVar, Object obj, kotlin.jvm.functions.a aVar) {
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(jVar, obj);
        try {
            return (T) aVar.invoke();
        } finally {
            ThreadContextKt.restoreThreadContext(jVar, objUpdateThreadContext);
        }
    }

    @InternalCoroutinesApi
    public static final j newCoroutineContext(j jVar, j jVar2) {
        return !hasCopyableElements(jVar2) ? jVar.plus(jVar2) : foldCopies(jVar, jVar2, false);
    }
}
