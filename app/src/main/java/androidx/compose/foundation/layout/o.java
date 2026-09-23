package androidx.compose.foundation.layout;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements androidx.compose.ui.layout.q0 {
    public static final o b = new o(0);
    public static final o c = new o(1);
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i) {
        this.a = i;
    }

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        switch (this.a) {
            case 0:
                return s0Var.q(androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.i(j), kotlin.collections.x.e, new androidx.compose.animation.core.n1(23));
            default:
                return s0Var.q(androidx.compose.ui.unit.a.f(j) ? androidx.compose.ui.unit.a.h(j) : 0, androidx.compose.ui.unit.a.e(j) ? androidx.compose.ui.unit.a.g(j) : 0, kotlin.collections.x.e, new androidx.compose.animation.core.n1(23));
        }
    }
}
