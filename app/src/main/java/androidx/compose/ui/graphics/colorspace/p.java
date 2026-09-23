package androidx.compose.ui.graphics.colorspace;

import kotlin.collections.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(1);
        this.y = i;
        this.z = qVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                q qVar = this.z;
                return Double.valueOf(qVar.n.a(i0.b(dDoubleValue, qVar.e, qVar.f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                q qVar2 = this.z;
                return Double.valueOf(i0.b(qVar2.k.a(dDoubleValue2), qVar2.e, qVar2.f));
        }
    }
}
