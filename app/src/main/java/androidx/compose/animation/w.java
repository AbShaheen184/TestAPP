package androidx.compose.animation;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, ArrayList arrayList) {
        super(1);
        this.y = i;
        this.z = arrayList;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
                ArrayList arrayList = this.z;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    androidx.compose.ui.layout.c1.i(c1Var, (androidx.compose.ui.layout.d1) arrayList.get(i), 0, 0);
                }
                break;
            case 1:
                androidx.compose.ui.layout.c1 c1Var2 = (androidx.compose.ui.layout.c1) obj;
                ArrayList arrayList2 = this.z;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    androidx.compose.ui.layout.c1.m(c1Var2, (androidx.compose.ui.layout.d1) arrayList2.get(i2), 0, 0);
                }
                break;
            case 2:
                androidx.compose.ui.layout.c1 c1Var3 = (androidx.compose.ui.layout.c1) obj;
                ArrayList arrayList3 = this.z;
                int size3 = arrayList3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    androidx.compose.ui.layout.c1.l(c1Var3, (androidx.compose.ui.layout.d1) arrayList3.get(i3), 0, 0);
                }
                break;
            default:
                androidx.compose.ui.layout.c1 c1Var4 = (androidx.compose.ui.layout.c1) obj;
                ArrayList arrayList4 = this.z;
                int size4 = arrayList4.size() - 1;
                if (size4 >= 0) {
                    int i4 = 0;
                    while (true) {
                        androidx.compose.ui.layout.c1.l(c1Var4, (androidx.compose.ui.layout.d1) arrayList4.get(i4), 0, 0);
                        if (i4 != size4) {
                            i4++;
                        }
                    }
                }
                break;
        }
        return kotlin.y.a;
    }
}
