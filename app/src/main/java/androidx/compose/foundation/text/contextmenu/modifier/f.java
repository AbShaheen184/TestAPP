package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.layout.x;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.compose.foundation.text.contextmenu.provider.e {
    public final long e;
    public final /* synthetic */ g y;

    public f(g gVar, long j) {
        this.y = gVar;
        this.e = j;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final androidx.compose.foundation.text.contextmenu.data.c N() {
        return h.b(this.y);
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final androidx.compose.ui.geometry.c j0(x xVar) {
        return n.b(o0(xVar), 0L);
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.e
    public final long o0(x xVar) {
        x xVar2 = (x) this.y.O.getValue();
        if (xVar2 != null) {
            return xVar.i(xVar2, this.e);
        }
        androidx.compose.foundation.internal.b.d("Tried to open context menu before the anchor was placed.");
        com.google.firebase.platforminfo.b.b();
        return 0L;
    }
}
