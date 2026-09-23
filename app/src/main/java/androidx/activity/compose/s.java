package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.e0;
import androidx.compose.runtime.d0;
import androidx.compose.ui.platform.m0;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final d0 a = new d0(new b(3));

    public static e0 a(androidx.compose.runtime.s sVar) {
        e0 e0Var = (e0) sVar.j(a);
        Object obj = null;
        if (e0Var == null) {
            sVar.b0(1208426157);
            View view = (View) sVar.j(m0.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    e0Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                e0 e0Var2 = tag instanceof e0 ? (e0) tag : null;
                if (e0Var2 != null) {
                    e0Var = e0Var2;
                    break;
                }
                Object objP = android.support.v4.media.session.b.p(view);
                view = objP instanceof View ? (View) objP : null;
            }
        } else {
            sVar.b0(1208423708);
        }
        sVar.p(false);
        if (e0Var != null) {
            sVar.b0(1208423789);
            sVar.p(false);
            return e0Var;
        }
        sVar.b0(1208428160);
        for (Context baseContext = (Context) sVar.j(m0.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof e0) {
                obj = baseContext;
                break;
            }
        }
        e0 e0Var3 = (e0) obj;
        sVar.p(false);
        return e0Var3;
    }
}
