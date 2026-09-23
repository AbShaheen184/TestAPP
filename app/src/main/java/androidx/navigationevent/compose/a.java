package androidx.navigationevent.compose;

import android.support.v4.media.session.b;
import android.view.View;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d0;
import androidx.compose.runtime.s;
import androidx.compose.ui.platform.m0;
import androidx.navigationevent.d;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final d0 a = new d0(new c0(10));

    public static d a(s sVar) {
        d dVar;
        d dVar2 = (d) sVar.j(a);
        if (dVar2 != null) {
            sVar.b0(950834231);
            sVar.p(false);
            return dVar2;
        }
        sVar.b0(950836184);
        View view = (View) sVar.j(m0.f);
        view.getClass();
        while (true) {
            dVar = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            d dVar3 = tag instanceof d ? (d) tag : null;
            if (dVar3 != null) {
                dVar = dVar3;
                break;
            }
            Object objP = b.p(view);
            view = objP instanceof View ? (View) objP : null;
        }
        sVar.p(false);
        return dVar;
    }
}
