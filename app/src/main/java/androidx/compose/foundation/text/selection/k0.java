package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.w2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ w2 y;

    public /* synthetic */ k0(w2 w2Var, int i) {
        this.e = i;
        this.y = w2Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        float fFloatValue;
        int i = this.e;
        w2 w2Var = this.y;
        switch (i) {
            case 0:
                return new androidx.compose.ui.geometry.b(((androidx.compose.ui.geometry.b) w2Var.getValue()).a);
            case 1:
                androidx.compose.animation.core.p pVar = m0.a;
                return new androidx.compose.ui.geometry.b(((androidx.compose.ui.geometry.b) w2Var.getValue()).a);
            case 2:
                fFloatValue = ((Number) w2Var.getValue()).floatValue();
                break;
            case 3:
                fFloatValue = ((Number) w2Var.getValue()).floatValue();
                break;
            case 4:
                return Boolean.valueOf(((Number) w2Var.getValue()).floatValue() > 0.0f);
            case 5:
                return Boolean.valueOf(((Number) w2Var.getValue()).floatValue() > 0.0f);
            case 6:
                List list = (List) w2Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (kotlin.jvm.internal.l.a(((androidx.navigation.i) obj).y.e, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                fFloatValue = ((Number) w2Var.getValue()).floatValue();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
