package androidx.navigation;

import androidx.lifecycle.s0;
import androidx.lifecycle.x0;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends s0 {
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // androidx.lifecycle.s0
    public final void d() {
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((x0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        kotlin.comparisons.a.c(16);
        sb.append(kotlin.a.g(16, ((long) iIdentityHashCode) & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
