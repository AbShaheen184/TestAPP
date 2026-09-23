package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final androidx.compose.foundation.layout.z0 a;
    public static final androidx.compose.foundation.layout.z0 b;
    public static final float c;
    public static final float d;

    static {
        float f = androidx.compose.material3.tokens.a.a;
        float f2 = androidx.compose.material3.tokens.a.b;
        float f3 = 16;
        float f4 = androidx.compose.material3.tokens.b.a;
        float f5 = 8;
        a = new androidx.compose.foundation.layout.z0(f, f5, f2, f5);
        androidx.compose.foundation.layout.b.c(f3, f5, f2, f5);
        float f6 = 12;
        b = new androidx.compose.foundation.layout.z0(f6, f5, f6, f5);
        androidx.compose.foundation.layout.b.c(f6, f5, f3, f5);
        c = 58;
        d = androidx.compose.material3.tokens.b.a;
    }

    public static w a(long j, long j2, androidx.compose.runtime.s sVar) {
        w wVar;
        long j3 = androidx.compose.ui.graphics.t.i;
        t0 t0Var = (t0) sVar.j(u0.a);
        w wVar2 = t0Var.X;
        if (wVar2 == null) {
            long j4 = androidx.compose.ui.graphics.t.h;
            w wVar3 = new w(j4, u0.c(t0Var, androidx.compose.material3.tokens.t.c), j4, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.t.b, u0.c(t0Var, androidx.compose.material3.tokens.t.a)));
            t0Var.X = wVar3;
            wVar = wVar3;
        } else {
            wVar = wVar2;
        }
        return wVar.a(j, j2, j3, j3);
    }
}
