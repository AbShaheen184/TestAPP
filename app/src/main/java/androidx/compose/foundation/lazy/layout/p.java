package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.o1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends androidx.compose.ui.q implements androidx.compose.ui.node.w {
    public static final n O = new n();
    public q L;
    public com.google.firebase.platforminfo.d M;
    public o1 N;

    public final boolean M0(k kVar, int i) {
        if (i == 5 || i == 6) {
            if (this.N == o1.y) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.N == o1.e) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            kotlinx.coroutines.future.a.u("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (N0(i)) {
            if (kVar.b >= this.L.a() - 1) {
                return false;
            }
        } else if (kVar.a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean N0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = androidx.compose.ui.node.l.v(this).X.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            coil3.g.a();
            return false;
        }
        if (i != 4) {
            kotlinx.coroutines.future.a.u("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = androidx.compose.ui.node.l.v(this).X.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        coil3.g.a();
        return false;
    }

    @Override // androidx.compose.ui.node.w
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        androidx.compose.ui.layout.d1 d1VarF = p0Var.F(j);
        return s0Var.q(d1VarF.e, d1VarF.y, kotlin.collections.x.e, new androidx.compose.foundation.layout.j(d1VarF, 6));
    }
}
