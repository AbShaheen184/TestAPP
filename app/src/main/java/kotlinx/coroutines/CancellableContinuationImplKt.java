package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class CancellableContinuationImplKt {
    private static final int DECISION_SHIFT = 29;
    private static final int INDEX_MASK = 536870911;
    private static final int NO_INDEX = 536870911;
    private static final int RESUMED = 2;
    public static final Symbol RESUME_TOKEN = new Symbol("RESUME_TOKEN");
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    private static final int decisionAndIndex(int i, int i2) {
        return (i << 29) + i2;
    }

    private static final int getDecision(int i) {
        return i >> 29;
    }

    private static final int getIndex(int i) {
        return i & 536870911;
    }
}
