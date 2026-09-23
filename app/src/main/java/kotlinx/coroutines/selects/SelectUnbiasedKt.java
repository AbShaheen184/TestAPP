package kotlinx.coroutines.selects;

import kotlin.coroutines.d;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class SelectUnbiasedKt {
    public static final <R> Object selectUnbiased(l lVar, d<? super R> dVar) {
        UnbiasedSelectImplementation unbiasedSelectImplementation = new UnbiasedSelectImplementation(dVar.getContext());
        lVar.invoke(unbiasedSelectImplementation);
        return unbiasedSelectImplementation.doSelect(dVar);
    }

    private static final <R> Object selectUnbiased$$forInline(l lVar, d<? super R> dVar) {
        throw null;
    }
}
