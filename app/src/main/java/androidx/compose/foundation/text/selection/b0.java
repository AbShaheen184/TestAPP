package androidx.compose.foundation.text.selection;

import com.app.mlounge.ui.viewmodel.d2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b0(int i, androidx.compose.runtime.g1 g1Var) {
        this.e = 1;
        this.y = i;
        this.z = g1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Integer.valueOf(((androidx.compose.ui.text.j0) ((w) this.z).e).b.d(this.y));
            case 1:
                ((androidx.compose.runtime.g1) this.z).h(this.y);
                return kotlin.y.a;
            case 2:
                com.app.mlounge.ui.viewmodel.k0 k0Var = (com.app.mlounge.ui.viewmodel.k0) this.z;
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(k0Var), null, null, new com.app.mlounge.ui.screens.player.t0(k0Var, this.y, (kotlin.coroutines.d) null, 2), 3, null);
                return kotlin.y.a;
            default:
                d2 d2Var = (d2) this.z;
                d2Var.j.h(this.y);
                return kotlin.y.a;
        }
    }

    public /* synthetic */ b0(Object obj, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
    }
}
