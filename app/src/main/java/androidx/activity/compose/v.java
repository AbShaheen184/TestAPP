package androidx.activity.compose;

import androidx.compose.ui.graphics.k0;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ v(q qVar, boolean z) {
        this.z = qVar;
        this.y = z;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                q qVar = (q) this.z;
                qVar.j(this.y);
                return new j((androidx.lifecycle.compose.b) obj, qVar, 1);
            default:
                ((k0) obj).c(this.y ? 1.0f : ((Number) ((kotlin.jvm.functions.a) this.z).invoke()).floatValue());
                return y.a;
        }
    }

    public /* synthetic */ v(kotlin.jvm.functions.a aVar, boolean z) {
        this.y = z;
        this.z = aVar;
    }
}
