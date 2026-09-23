package androidx.compose.foundation.lazy;

import com.app.mlounge.ui.screens.settings.e0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ k(Object obj, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                l lVar = (l) this.z;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.appcompat.widget.x xVar = lVar.b.b;
                    int i = this.y;
                    androidx.compose.foundation.lazy.layout.j jVarI = xVar.i(i);
                    ((h) jVarI.c).c.invoke(lVar.c, Integer.valueOf(i - jVarI.a), sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                androidx.compose.foundation.lazy.grid.i iVar = (androidx.compose.foundation.lazy.grid.i) this.z;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.appcompat.widget.x xVar2 = iVar.b.c;
                    int i2 = this.y;
                    androidx.compose.foundation.lazy.layout.j jVarI2 = xVar2.i(i2);
                    ((androidx.compose.foundation.lazy.grid.f) jVarI2.c).d.invoke(androidx.compose.foundation.lazy.grid.j.a, Integer.valueOf(i2 - jVarI2.a), sVar2, 6);
                } else {
                    sVar2.W();
                }
                break;
            default:
                ((Integer) obj2).intValue();
                e0.e((com.app.mlounge.ui.viewmodel.k) this.z, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y | 1));
                break;
        }
        return kotlin.y.a;
    }
}
