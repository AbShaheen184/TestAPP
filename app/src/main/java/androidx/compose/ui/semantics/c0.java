package androidx.compose.ui.semantics;

import androidx.compose.ui.node.f0;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Comparator {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Comparator y;

    public c0(c0 c0Var) {
        this.y = c0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                int iCompare = this.y.compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return f0.r0.compare(((s) obj).c, ((s) obj2).c);
            default:
                int iCompare2 = ((c0) this.y).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : kotlin.comparisons.a.d(Integer.valueOf(((s) obj).g), Integer.valueOf(((s) obj2).g));
        }
    }

    public c0(Comparator comparator) {
        this.y = comparator;
    }
}
