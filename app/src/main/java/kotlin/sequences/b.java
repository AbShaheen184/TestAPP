package kotlin.sequences;

import com.app.mlounge.ui.t;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.collections.b {
    public final t A;
    public final HashSet B;
    public final Iterator z;

    public b(Iterator it, t tVar) {
        it.getClass();
        this.z = it;
        this.A = tVar;
        this.B = new HashSet();
    }

    @Override // kotlin.collections.b
    public final void b() {
        Object next;
        do {
            Iterator it = this.z;
            if (!it.hasNext()) {
                this.e = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.B.add(this.A.invoke(next)));
        this.y = next;
        this.e = 1;
    }
}
