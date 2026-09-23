package androidx.compose.ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.compose.ui.node.o1;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int y;
    public final /* synthetic */ w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(w wVar, int i) {
        super(0);
        this.y = i;
        this.z = wVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.y) {
            case 0:
                this.z.getLayoutNode().C();
                return y.a;
            case 1:
                w wVar = this.z;
                if (wVar.B && wVar.isAttachedToWindow() && wVar.getView().getParent() == wVar) {
                    o1 snapshotObserver = wVar.getSnapshotObserver();
                    snapshotObserver.a.d(wVar, b.z, wVar.getUpdate());
                }
                return y.a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.z.a0.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                w wVar2 = this.z;
                wVar2.getReleaseBlock().invoke(wVar2.a0);
                w.n(wVar2);
                return y.a;
            case 4:
                w wVar3 = this.z;
                wVar3.getResetBlock().invoke(wVar3.a0);
                return y.a;
            default:
                w wVar4 = this.z;
                wVar4.getUpdateBlock().invoke(wVar4.a0);
                return y.a;
        }
    }
}
