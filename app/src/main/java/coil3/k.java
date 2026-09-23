package coil3;

import androidx.compose.runtime.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;

    public /* synthetic */ k(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Dispatchers.getMain().getImmediate();
            case 1:
                return (coil3.disk.g) coil3.disk.h.a.getValue();
            case 2:
                List listW = kotlin.collections.p.W((List) coil3.util.j.a.getValue(), new androidx.constraintlayout.core.e(7));
                ArrayList arrayList = new ArrayList();
                int size = listW.size();
                for (int i = 0; i < size; i++) {
                    ((coil3.network.okhttp.internal.f) listW.get(i)).getClass();
                    arrayList.add(new kotlin.k(new coil3.network.j(new c0(22)), a0.a(v.class)));
                }
                return arrayList;
            default:
                List listW2 = kotlin.collections.p.W((List) coil3.util.j.b.getValue(), new androidx.constraintlayout.core.e(8));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listW2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((coil3.svg.internal.b) listW2.get(i2)).getClass();
                    arrayList2.add(new coil3.svg.e());
                }
                return arrayList2;
        }
    }
}
