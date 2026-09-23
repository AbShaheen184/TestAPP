package androidx.core.provider;

import androidx.collection.y0;
import androidx.compose.foundation.text.input.internal.o;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.core.util.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.core.util.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((o) this.b).p(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.c) {
                    try {
                        y0 y0Var = h.d;
                        ArrayList arrayList = (ArrayList) y0Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        y0Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((androidx.core.util.a) arrayList.get(i)).accept(gVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
