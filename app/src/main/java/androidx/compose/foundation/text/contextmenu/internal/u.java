package androidx.compose.foundation.text.contextmenu.internal;

import android.app.RemoteAction;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements kotlin.jvm.functions.q {
    public final /* synthetic */ RemoteAction e;

    public u(RemoteAction remoteAction) {
        this.e = remoteAction;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((androidx.compose.ui.graphics.t) obj).a;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            v.a.e(this.e.getIcon(), sVar, 48);
        } else {
            sVar.W();
        }
        return y.a;
    }
}
