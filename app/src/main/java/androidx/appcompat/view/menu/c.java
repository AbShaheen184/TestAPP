package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.r1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ l y;

    public /* synthetic */ c(l lVar, int i) {
        this.e = i;
        this.y = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.e) {
            case 0:
                g gVar = (g) this.y;
                ArrayList arrayList = gVar.E;
                if (gVar.d() && arrayList.size() > 0 && !((f) arrayList.get(0)).a.R) {
                    View view = gVar.L;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((f) it.next()).a.f();
                        }
                    } else {
                        gVar.dismiss();
                    }
                    break;
                }
                break;
            default:
                s sVar = (s) this.y;
                r1 r1Var = sVar.E;
                if (sVar.d() && !r1Var.R) {
                    View view2 = sVar.J;
                    if (view2 != null && view2.isShown()) {
                        r1Var.f();
                    } else {
                        sVar.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
