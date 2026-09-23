package androidx.compose.ui.platform;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {
    public final androidx.compose.ui.semantics.n a;
    public final androidx.collection.a0 b;

    public k2(androidx.compose.ui.semantics.s sVar, androidx.collection.n nVar) {
        this.a = sVar.d;
        this.b = new androidx.collection.a0(androidx.compose.ui.semantics.s.j(4, sVar).size());
        List listJ = androidx.compose.ui.semantics.s.j(4, sVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.s sVar2 = (androidx.compose.ui.semantics.s) listJ.get(i);
            if (nVar.a(sVar2.g)) {
                this.b.a(sVar2.g);
            }
        }
    }
}
