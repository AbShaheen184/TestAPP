package retrofit2;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ z0 d;

    public /* synthetic */ a0(z0 z0Var, int i) {
        this.c = i;
        this.d = z0Var;
    }

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) {
        switch (this.c) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.d.a(o0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.d.a(o0Var, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
