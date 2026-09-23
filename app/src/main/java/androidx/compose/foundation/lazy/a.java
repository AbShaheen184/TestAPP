package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.o1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int a(s sVar, boolean z) {
        return z ? ((t) kotlin.collections.p.J(sVar.k)).a + 1 : ((t) kotlin.collections.p.B(sVar.k)).a - 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    public static int b(androidx.compose.foundation.lazy.grid.n nVar, boolean z) {
        o1 o1Var = o1.e;
        if (z) {
            androidx.compose.foundation.lazy.grid.o oVar = (androidx.compose.foundation.lazy.grid.o) kotlin.collections.p.J(nVar.m);
            return (nVar.q == o1Var ? oVar.p : oVar.q) + 1;
        }
        androidx.compose.foundation.lazy.grid.o oVar2 = (androidx.compose.foundation.lazy.grid.o) kotlin.collections.p.B(nVar.m);
        return (nVar.q == o1Var ? oVar2.p : oVar2.q) - 1;
    }
}
