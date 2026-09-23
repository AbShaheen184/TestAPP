package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class OnDemandAllocatingPoolKt {
    private static final int IS_CLOSED_MASK = Integer.MIN_VALUE;

    private static final Void loop(kotlin.jvm.functions.a aVar) {
        while (true) {
            aVar.invoke();
        }
    }
}
