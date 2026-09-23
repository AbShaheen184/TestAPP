package kotlinx.coroutines;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface CancelHandler extends NotCompleted {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class UserSupplied implements CancelHandler {
        private final l handler;

        public UserSupplied(l lVar) {
            this.handler = lVar;
        }

        @Override // kotlinx.coroutines.CancelHandler
        public void invoke(Throwable th) {
            this.handler.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + DebugStringsKt.getClassSimpleName(this.handler) + '@' + DebugStringsKt.getHexAddress(this) + ']';
        }
    }

    void invoke(Throwable th);
}
