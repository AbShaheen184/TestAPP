package androidx.compose.foundation.layout;

import androidx.compose.runtime.w2;
import com.app.mlounge.ui.viewmodel.b2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ v(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.e = i2;
        this.z = obj;
        this.A = obj2;
        this.y = i;
        this.B = obj3;
        this.C = obj4;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.d1[] d1VarArr = (androidx.compose.ui.layout.d1[]) this.z;
                w wVar = (w) this.A;
                androidx.compose.ui.layout.s0 s0Var = (androidx.compose.ui.layout.s0) this.B;
                int[] iArr = (int[]) this.C;
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
                int length = d1VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    androidx.compose.ui.layout.d1 d1Var = d1VarArr[i];
                    int i3 = i2 + 1;
                    d1Var.getClass();
                    Object objL = d1Var.L();
                    c1 c1Var2 = objL instanceof c1 ? (c1) objL : null;
                    androidx.compose.ui.unit.m layoutDirection = s0Var.getLayoutDirection();
                    b bVar = c1Var2 != null ? c1Var2.c : null;
                    int i4 = this.y;
                    androidx.compose.ui.layout.c1.i(c1Var, d1Var, bVar != null ? bVar.f(i4, d1Var.e, layoutDirection) : wVar.b.a(d1Var.e, i4, layoutDirection), iArr[i2]);
                    i++;
                    i2 = i3;
                }
                break;
            default:
                b2 b2Var = (b2) this.A;
                androidx.compose.ui.focus.y yVar = (androidx.compose.ui.focus.y) this.B;
                w2 w2Var = (w2) this.C;
                androidx.compose.foundation.lazy.j jVar = (androidx.compose.foundation.lazy.j) obj;
                jVar.getClass();
                com.app.mlounge.ui.screens.sources.b bVar2 = new com.app.mlounge.ui.screens.sources.b(2);
                ?? r2 = this.z;
                jVar.q(r2.size(), new com.app.mlounge.ui.screens.tvshows.n(bVar2, r2, 2), new androidx.compose.foundation.text.z0(r2, 4), new androidx.compose.runtime.internal.f(true, 2039820996, new com.app.mlounge.ui.screens.tvshows.q(r2, b2Var, this.y, yVar, w2Var)));
                break;
        }
        return kotlin.y.a;
    }
}
