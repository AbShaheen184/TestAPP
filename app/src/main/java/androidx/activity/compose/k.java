package androidx.activity.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.core.a2;
import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.h0;
import androidx.compose.animation.core.k0;
import androidx.compose.animation.core.w1;
import androidx.compose.animation.core.x1;
import androidx.compose.foundation.layout.v1;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.i0;
import androidx.compose.runtime.w2;
import androidx.compose.ui.platform.l0;
import androidx.core.view.s0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.runtime.i0
    public final void dispose() throws Exception {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((androidx.activity.compose.internal.c) obj2).b((m) obj);
                break;
            case 1:
                ((androidx.activity.compose.internal.c) obj2).b((q) obj);
                break;
            case 2:
                ((k0) obj2).a.j((h0) obj);
                break;
            case 3:
                ((e2) obj2).j.remove((e2) obj);
                break;
            case 4:
                e2 e2Var = (e2) obj2;
                e2Var.getClass();
                w1 w1Var = (w1) ((x1) obj).b.getValue();
                if (w1Var != null) {
                    e2Var.i.remove(w1Var.e);
                }
                break;
            case 5:
                ((e2) obj2).i.remove((a2) obj);
                break;
            case 6:
                v1 v1Var = (v1) obj2;
                View view = (View) obj;
                int i2 = v1Var.u - 1;
                v1Var.u = i2;
                if (i2 == 0) {
                    Field field = s0.a;
                    androidx.core.view.k0.c(view, null);
                    s0.o(view, null);
                    view.removeOnAttachStateChangeListener(v1Var.v);
                }
                break;
            case 7:
                ((w0) obj2).z.k(obj);
                break;
            case 8:
                a1 a1Var = (a1) obj2;
                androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) a1Var.getValue();
                if (mVar != null) {
                    androidx.compose.foundation.interaction.l lVar = new androidx.compose.foundation.interaction.l(mVar);
                    androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) obj;
                    if (kVar != null) {
                        kVar.c(lVar);
                    }
                    a1Var.setValue(null);
                }
                break;
            case 9:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((androidx.compose.ui.platform.k0) obj);
                break;
            case 10:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((l0) obj);
                break;
            case 11:
                ((androidx.navigation.i) obj2).E.j.b((androidx.navigation.compose.l) obj);
                break;
            default:
                Iterator it = ((List) ((w2) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((androidx.navigation.compose.i) obj).b().c((androidx.navigation.i) it.next());
                }
                break;
        }
    }
}
