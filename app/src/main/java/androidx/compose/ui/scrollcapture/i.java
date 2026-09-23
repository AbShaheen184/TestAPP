package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.node.d1;
import androidx.compose.ui.semantics.s;
import androidx.compose.ui.unit.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final s a;
    public final int b;
    public final k c;
    public final d1 d;

    public i(s sVar, int i, k kVar, d1 d1Var) {
        this.a = sVar;
        this.b = i;
        this.c = kVar;
        this.d = d1Var;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.a + ", depth=" + this.b + ", viewportBoundsInWindow=" + this.c + ", coordinates=" + this.d + ')';
    }
}
