package androidx.compose.runtime.saveable;

import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.app.mlounge.ui.screens.services.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ p y;

    public /* synthetic */ a(int i, p pVar) {
        this.e = 2;
        this.y = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        g gVar;
        switch (this.e) {
            case 0:
                c cVar = (c) obj;
                List list = (List) this.y.invoke(cVar, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && (gVar = cVar.y) != null && !gVar.a(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 1:
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.y.invoke(sVar, 0);
                } else {
                    sVar.W();
                }
                return y.a;
            default:
                ((Integer) obj2).getClass();
                n.o(this.y, (s) obj, t.A(1));
                return y.a;
        }
    }

    public /* synthetic */ a(p pVar, int i, byte b) {
        this.e = i;
        this.y = pVar;
    }
}
