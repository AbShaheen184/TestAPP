package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.node.m1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ androidx.compose.ui.viewinterop.w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(androidx.compose.ui.viewinterop.w wVar, int i) {
        super(1);
        this.y = i;
        this.z = wVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.y) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                androidx.compose.ui.viewinterop.w wVar = this.z;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = wVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = wVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            case 1:
                m1 m1Var = (m1) obj;
                androidx.compose.ui.platform.u uVar = m1Var instanceof androidx.compose.ui.platform.u ? (androidx.compose.ui.platform.u) m1Var : null;
                androidx.compose.ui.viewinterop.w wVar2 = this.z;
                if (uVar != null) {
                    uVar.getAndroidViewsHandler$ui().removeViewInLayout(wVar2);
                    kotlin.jvm.internal.c0.b(uVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(uVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(wVar2));
                    wVar2.setImportantForAccessibility(0);
                }
                wVar2.removeAllViewsInLayout();
                return kotlin.y.a;
            default:
                this.z.N = (kotlin.jvm.functions.l) obj;
                return kotlin.y.a;
        }
    }
}
