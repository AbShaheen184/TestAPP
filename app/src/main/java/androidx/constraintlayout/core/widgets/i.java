package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.n;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends d {
    public d[] p0 = new d[4];
    public int q0 = 0;

    public final void M(int i, n nVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.q0; i2++) {
            d dVar = this.p0[i2];
            ArrayList arrayList2 = nVar.a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i3 = 0; i3 < this.q0; i3++) {
            androidx.constraintlayout.core.widgets.analyzer.h.b(this.p0[i3], i, arrayList, nVar);
        }
    }

    public void N() {
    }
}
