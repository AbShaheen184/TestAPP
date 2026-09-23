package okhttp3;

import androidx.compose.foundation.lazy.layout.b1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public b0 a;
    public z b;
    public String d;
    public q e;
    public okio.g0 h;
    public g0 i;
    public g0 j;
    public g0 k;
    public long l;
    public long m;
    public b1 n;
    public int c = -1;
    public j0 g = j0.y;
    public m0 o = m0.w;
    public androidx.compose.ui.graphics.vector.g f = new androidx.compose.ui.graphics.vector.g(4);

    public static void b(String str, g0 g0Var) {
        if (g0Var != null) {
            if (g0Var.F != null) {
                kotlinx.coroutines.future.a.s(str.concat(".networkResponse != null"));
            } else if (g0Var.G != null) {
                kotlinx.coroutines.future.a.s(str.concat(".cacheResponse != null"));
            } else {
                if (g0Var.H == null) {
                    return;
                }
                kotlinx.coroutines.future.a.s(str.concat(".priorResponse != null"));
            }
        }
    }

    public final g0 a() {
        int i = this.c;
        if (i < 0) {
            kotlinx.coroutines.future.a.b(this.c, "code < 0: ");
            return null;
        }
        b0 b0Var = this.a;
        if (b0Var == null) {
            kotlinx.coroutines.future.a.u("request == null");
            return null;
        }
        z zVar = this.b;
        if (zVar == null) {
            kotlinx.coroutines.future.a.u("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new g0(b0Var, zVar, str, i, this.e, this.f.k(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        kotlinx.coroutines.future.a.u("message == null");
        return null;
    }
}
