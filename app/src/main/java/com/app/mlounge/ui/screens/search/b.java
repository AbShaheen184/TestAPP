package com.app.mlounge.ui.screens.search;

import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.s;
import androidx.compose.ui.o;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ String z;

    public /* synthetic */ b(int i, String str, a1 a1Var, int i2) {
        this.e = i2;
        this.y = i;
        this.z = str;
        this.A = a1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z5.b(this.z, androidx.compose.foundation.layout.b.r(o.b, 12, 8), ((Number) this.A.getValue()).intValue() == this.y ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(n6.a)).n, sVar, 48, 0, 131064);
                } else {
                    sVar.W();
                }
                break;
            default:
                s sVar2 = (s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z5.b(this.z, androidx.compose.foundation.layout.b.r(o.b, 10, 6), ((Number) this.A.getValue()).intValue() == this.y ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).o, sVar2, 48, 0, 131064);
                } else {
                    sVar2.W();
                }
                break;
        }
        return y.a;
    }
}
