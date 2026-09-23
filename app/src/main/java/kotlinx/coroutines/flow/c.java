package kotlinx.coroutines.flow;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements l {
    public final /* synthetic */ int e;

    public /* synthetic */ c(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                return FlowKt__DistinctKt.defaultKeySelector$lambda$0$FlowKt__DistinctKt(obj);
            default:
                return Boolean.valueOf(FlowKt__MigrationKt.onErrorReturn$lambda$0$FlowKt__MigrationKt((Throwable) obj));
        }
    }
}
