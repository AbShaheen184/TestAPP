package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d5 {
    public static final androidx.compose.runtime.x2 a = new androidx.compose.runtime.x2(new androidx.activity.compose.b(26));

    public static final androidx.compose.ui.graphics.n0 a(androidx.compose.material3.tokens.w wVar, androidx.compose.runtime.s sVar) {
        c5 c5Var = (c5) sVar.j(a);
        switch (wVar.ordinal()) {
            case 0:
                return c5Var.h;
            case 1:
                return c5Var.e;
            case 2:
                return c5Var.g;
            case 3:
                return b(c5Var.e);
            case 4:
                return c5Var.a;
            case 5:
                return b(c5Var.a);
            case 6:
                return androidx.compose.foundation.shape.e.a;
            case 7:
                return c5Var.d;
            case 8:
                androidx.compose.foundation.shape.d dVar = c5Var.d;
                androidx.compose.foundation.shape.b bVar = b5.i;
                return androidx.compose.foundation.shape.d.b(dVar, bVar, null, null, bVar, 6);
            case 9:
                return c5Var.f;
            case 10:
                androidx.compose.foundation.shape.d dVar2 = c5Var.d;
                androidx.compose.foundation.shape.b bVar2 = b5.i;
                return androidx.compose.foundation.shape.d.b(dVar2, null, bVar2, bVar2, null, 9);
            case 11:
                return b(c5Var.d);
            case 12:
                return c5Var.c;
            case 13:
                return androidx.compose.ui.graphics.a0.b;
            case 14:
                return c5Var.b;
            default:
                coil3.g.a();
                return null;
        }
    }

    public static androidx.compose.foundation.shape.d b(androidx.compose.foundation.shape.d dVar) {
        androidx.compose.foundation.shape.b bVar = b5.i;
        return androidx.compose.foundation.shape.d.b(dVar, null, null, bVar, bVar, 3);
    }
}
