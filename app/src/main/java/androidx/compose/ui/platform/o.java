package androidx.compose.ui.platform;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public static final o A;
    public static final o B;
    public static final o C;
    public static final o z;
    public final /* synthetic */ int y;

    static {
        int i = 1;
        z = new o(i, 0);
        A = new o(i, 1);
        B = new o(i, 2);
        C = new o(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                return Boolean.TRUE;
            case 1:
                androidx.compose.ui.semantics.n nVarK = ((androidx.compose.ui.semantics.s) obj).k();
                return Boolean.valueOf(nVarK.e.c(androidx.compose.ui.semantics.w.A));
            case 2:
                androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) obj;
                androidx.compose.runtime.d0 d0Var = m0.a;
                jVar.getClass();
                androidx.compose.runtime.t.s(jVar, d0Var);
                return ((Context) androidx.compose.runtime.t.s(jVar, m0.b)).getResources();
            default:
                return Boolean.valueOf(i0.e(obj));
        }
    }
}
