package kotlinx.coroutines;

import kotlin.coroutines.i;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class YieldContext extends kotlin.coroutines.a {
    public static final Key Key = new Key(null);
    public boolean dispatcherWasUnconfined;

    public YieldContext() {
        super(Key);
    }

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class Key implements i {
        public /* synthetic */ Key(f fVar) {
            this();
        }

        private Key() {
        }
    }
}
