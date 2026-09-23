package androidx.compose.foundation.lazy.layout;

import android.os.Bundle;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.node.z1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.internal.z y;

    public /* synthetic */ y0(int i, kotlin.jvm.internal.z zVar) {
        this.e = i;
        this.y = zVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                z1 z1Var = (z1) obj;
                z1Var.getClass();
                m0 m0Var = ((i1) z1Var).L;
                kotlin.jvm.internal.z zVar = this.y;
                List listL = (List) zVar.e;
                if (listL != null) {
                    listL.add(m0Var);
                } else {
                    listL = kotlin.collections.q.l(m0Var);
                }
                zVar.e = listL;
                return y1.y;
            default:
                String str = (String) obj;
                str.getClass();
                Object obj2 = this.y.e;
                return Boolean.valueOf(obj2 == null || !((Bundle) obj2).containsKey(str));
        }
    }
}
