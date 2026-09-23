package kotlinx.coroutines;

import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@DelicateCoroutinesApi
@ExperimentalCoroutinesApi
public interface CopyableThreadContextElement<S> extends ThreadContextElement<S> {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        public static <S, R> R fold(CopyableThreadContextElement<S> copyableThreadContextElement, R r, p pVar) {
            return (R) ThreadContextElement.DefaultImpls.fold(copyableThreadContextElement, r, pVar);
        }

        public static <S, E extends h> E get(CopyableThreadContextElement<S> copyableThreadContextElement, i iVar) {
            return (E) ThreadContextElement.DefaultImpls.get(copyableThreadContextElement, iVar);
        }

        public static <S> j minusKey(CopyableThreadContextElement<S> copyableThreadContextElement, i iVar) {
            return ThreadContextElement.DefaultImpls.minusKey(copyableThreadContextElement, iVar);
        }

        public static <S> j plus(CopyableThreadContextElement<S> copyableThreadContextElement, j jVar) {
            return ThreadContextElement.DefaultImpls.plus(copyableThreadContextElement, jVar);
        }
    }

    CopyableThreadContextElement<S> copyForChild();

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.j
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.j
    /* synthetic */ h get(i iVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.h
    /* synthetic */ i getKey();

    j mergeForChild(h hVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.j
    /* synthetic */ j minusKey(i iVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.j
    /* synthetic */ j plus(j jVar);
}
