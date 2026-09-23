package androidx.compose.ui.platform;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a0 a0Var, int i) {
        super(1);
        this.y = i;
        this.z = a0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                View view = this.z.A;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                j2 j2Var = (j2) obj;
                if (j2Var.y.contains(j2Var)) {
                    a0 a0Var = this.z;
                    androidx.compose.ui.node.o1 snapshotObserver = a0Var.A.getSnapshotObserver();
                    snapshotObserver.a.d(j2Var, a0Var.k0, new androidx.compose.ui.draw.b(6, j2Var, a0Var));
                }
                return kotlin.y.a;
        }
    }
}
