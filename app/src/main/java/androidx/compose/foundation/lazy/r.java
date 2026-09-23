package androidx.compose.foundation.lazy;

import androidx.compose.runtime.a1;
import androidx.compose.ui.layout.c1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ a1 y;
    public final /* synthetic */ ArrayList z;

    public /* synthetic */ r(a1 a1Var, ArrayList arrayList, List list, boolean z, int i) {
        this.e = i;
        this.y = a1Var;
        this.z = arrayList;
        this.A = list;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        c1 c1Var = (c1) obj;
        switch (this.e) {
            case 0:
                c1Var.e = true;
                ArrayList arrayList = this.z;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((t) arrayList.get(i)).j(c1Var);
                }
                ?? r0 = this.A;
                int size2 = r0.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((t) r0.get(i2)).j(c1Var);
                }
                c1Var.e = false;
                this.y.getValue();
                break;
            default:
                c1Var.e = true;
                ArrayList arrayList2 = this.z;
                int size3 = arrayList2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((androidx.compose.foundation.lazy.grid.o) arrayList2.get(i3)).j(c1Var);
                }
                ?? r1 = this.A;
                int size4 = r1.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((androidx.compose.foundation.lazy.grid.o) r1.get(i4)).j(c1Var);
                }
                c1Var.e = false;
                this.y.getValue();
                break;
        }
        return kotlin.y.a;
    }
}
