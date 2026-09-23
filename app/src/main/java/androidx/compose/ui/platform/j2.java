package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements androidx.compose.ui.node.n1 {
    public final int e;
    public final List y;
    public Float z = null;
    public Float A = null;
    public androidx.compose.ui.semantics.k B = null;
    public androidx.compose.ui.semantics.k C = null;

    public j2(int i, ArrayList arrayList) {
        this.e = i;
        this.y = arrayList;
    }

    @Override // androidx.compose.ui.node.n1
    public final boolean p() {
        return this.y.contains(this);
    }
}
