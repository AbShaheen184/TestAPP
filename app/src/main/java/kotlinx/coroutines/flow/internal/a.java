package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.h;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.future.FutureKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ a(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return Integer.valueOf(SafeCollector_commonKt.checkContext$lambda$0((SafeCollector) this.y, ((Integer) obj).intValue(), (h) obj2));
            default:
                return FutureKt.asDeferred$lambda$5((CompletableDeferred) this.y, obj, (Throwable) obj2);
        }
    }
}
