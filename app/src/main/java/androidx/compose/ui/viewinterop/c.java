package androidx.compose.ui.viewinterop;

import android.view.WindowInsets;
import androidx.compose.ui.layout.x;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.m1;
import androidx.core.view.s0;
import androidx.core.view.z1;
import java.util.HashMap;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ f0 A;
    public final /* synthetic */ int y;
    public final /* synthetic */ w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(w wVar, f0 f0Var, int i) {
        super(1);
        this.y = i;
        this.z = wVar;
        this.A = f0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsC;
        switch (this.y) {
            case 0:
                m1 m1Var = (m1) obj;
                androidx.compose.ui.platform.u uVar = m1Var instanceof androidx.compose.ui.platform.u ? (androidx.compose.ui.platform.u) m1Var : null;
                w wVar = this.z;
                if (uVar != null) {
                    HashMap<h, f0> holderToLayoutNode = uVar.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    f0 f0Var = this.A;
                    holderToLayoutNode.put(wVar, f0Var);
                    uVar.getAndroidViewsHandler$ui().addView(wVar);
                    uVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(f0Var, wVar);
                    wVar.setImportantForAccessibility(1);
                    s0.m(wVar, new androidx.compose.ui.platform.m(uVar, f0Var, uVar));
                }
                if (wVar.getView().getParent() != wVar) {
                    wVar.addView(wVar.getView());
                }
                break;
            case 1:
                j.d(this.z, this.A);
                break;
            default:
                f0 f0Var2 = this.A;
                w wVar2 = this.z;
                j.d(wVar2, f0Var2);
                ((androidx.compose.ui.platform.u) wVar2.z).g0 = true;
                int[] iArr = wVar2.K;
                int i = iArr[0];
                int i2 = iArr[1];
                wVar2.getView().getLocationOnScreen(iArr);
                long j = wVar2.L;
                long jU = ((x) obj).u();
                wVar2.L = jU;
                z1 z1Var = wVar2.M;
                if (z1Var != null && ((i != iArr[0] || i2 != iArr[1] || !androidx.compose.ui.unit.l.a(j, jU)) && (windowInsetsC = wVar2.m(z1Var).c()) != null)) {
                    wVar2.getView().dispatchApplyWindowInsets(windowInsetsC);
                }
                break;
        }
        return y.a;
    }
}
