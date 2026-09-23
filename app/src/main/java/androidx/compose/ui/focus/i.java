package androidx.compose.ui.focus;

import androidx.collection.j0;
import androidx.collection.p0;
import androidx.collection.x0;
import androidx.compose.foundation.s0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final p a;
    public final androidx.compose.ui.platform.u b;
    public final p0 c;
    public final p0 d;
    public boolean e;

    public i(p pVar, androidx.compose.ui.platform.u uVar) {
        this.a = pVar;
        this.b = uVar;
        p0 p0Var = x0.a;
        this.c = new p0();
        this.d = new p0();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        s0 s0Var = new s0(0, this, i.class, "invalidateNodes", "invalidateNodes()V", 0, 2);
        j0 j0Var = this.b.U0;
        if (j0Var.g(s0Var) < 0) {
            j0Var.a(s0Var);
        }
        this.e = true;
    }
}
