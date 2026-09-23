package kotlinx.coroutines;

import kotlin.c;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
@c
public interface ChildHandle extends DisposableHandle {
    @InternalCoroutinesApi
    boolean childCancelled(Throwable th);

    Job getParent();

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
        @InternalCoroutinesApi
        public static /* synthetic */ void getParent$annotations() {
        }
    }
}
