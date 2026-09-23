package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class Concurrent_commonKt {
    public static final <T> T getValue(AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void loop(AtomicReference<T> atomicReference, p pVar) {
        while (true) {
            pVar.invoke(atomicReference, getValue(atomicReference));
        }
    }

    public static final <T> void setValue(AtomicReference<T> atomicReference, T t) {
        atomicReference.set(t);
    }

    public static /* synthetic */ void getValue$annotations(AtomicReference atomicReference) {
    }
}
