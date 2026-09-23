package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d0;
import androidx.compose.runtime.s;
import androidx.lifecycle.m0;
import androidx.lifecycle.y0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final d0 a = new d0(new c0(7));

    public static y0 a(s sVar) {
        y0 y0VarE = (y0) sVar.j(a);
        if (y0VarE == null) {
            sVar.b0(1260197608);
            y0VarE = m0.e((View) sVar.j(androidx.compose.ui.platform.m0.f));
        } else {
            sVar.b0(1260196492);
        }
        sVar.p(false);
        return y0VarE;
    }
}
