package androidx.core.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public m(Runnable runnable) {
        this.a = runnable;
    }

    public final boolean a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.f) ((n) it.next())).a.r()) {
                return true;
            }
        }
        return false;
    }

    public final void b(n nVar) {
        this.b.remove(nVar);
        l lVar = (l) this.c.remove(nVar);
        if (lVar != null) {
            lVar.a.b(lVar.b);
            lVar.b = null;
        }
        this.a.run();
    }
}
