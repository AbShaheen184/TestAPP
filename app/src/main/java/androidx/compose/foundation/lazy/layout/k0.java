package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ m0 c;

    public k0(m0 m0Var, int i) {
        this.c = m0Var;
        this.a = i;
    }

    public final void a(int i) {
        m0 m0Var = this.c;
        b1 b1Var = m0Var.c;
        if (b1Var == null) {
            return;
        }
        this.b.add(new a1(b1Var, i, m0Var.b, null));
    }
}
