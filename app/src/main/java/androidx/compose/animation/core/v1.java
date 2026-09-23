package androidx.compose.animation.core;

import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;
import com.app.mlounge.data.remote.model.SportsMatch;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ v1(int i, String str, androidx.compose.runtime.g1 g1Var) {
        this.e = 10;
        this.y = i;
        this.z = str;
        this.A = g1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).intValue();
                ((e2) this.z).a(this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.s.b((androidx.compose.ui.r) this.z, (kotlin.jvm.functions.l) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((androidx.compose.foundation.lazy.l) this.z).d(this.y, this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((androidx.compose.foundation.lazy.grid.i) this.z).d(this.y, this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            case 4:
                androidx.compose.foundation.lazy.layout.y yVar = (androidx.compose.foundation.lazy.layout.y) this.z;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yVar.d(this.y, this.A, sVar, 0);
                } else {
                    sVar.W();
                }
                return kotlin.y.a;
            case 5:
                ((Integer) obj2).getClass();
                z5.a((androidx.compose.ui.text.m0) this.z, (androidx.compose.runtime.internal.f) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                androidx.compose.runtime.t.a((androidx.appcompat.widget.r) this.z, (kotlin.jvm.functions.p) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                androidx.compose.runtime.t.b((androidx.appcompat.widget.r[]) this.z, (kotlin.jvm.functions.p) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((androidx.compose.runtime.internal.f) this.z).f(this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y) | 1);
                break;
            case 9:
                androidx.navigation.y yVar2 = (androidx.navigation.y) this.z;
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) this.A;
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                if (!com.app.mlounge.ui.f0.b(a1Var)) {
                    a1Var.setValue(Boolean.TRUE);
                    com.app.mlounge.ui.f0.g(yVar2, str, str2, null, "movie", null, this.y, 0, 0, null, null, 1960);
                }
                return kotlin.y.a;
            case 10:
                String str3 = (String) this.z;
                androidx.compose.runtime.g1 g1Var = (androidx.compose.runtime.g1) this.A;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z5.b(str3, androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 12, 8), g1Var.g() == this.y ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(n6.a)).n, sVar2, 48, 0, 131064);
                } else {
                    sVar2.W();
                }
                return kotlin.y.a;
            case 11:
                ((Integer) obj2).intValue();
                com.app.mlounge.ui.screens.livetv.a.f((SportsMatch) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.player.k0.f((androidx.compose.ui.graphics.vector.f) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.y | 1));
                break;
            default:
                com.app.mlounge.ui.viewmodel.d2 d2Var = (com.app.mlounge.ui.viewmodel.d2) this.z;
                String str4 = (String) this.A;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z5.b(str4, androidx.compose.foundation.layout.b.r(androidx.compose.ui.o.b, 12, 8), d2Var.j.g() == this.y ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(n6.a)).n, sVar3, 48, 0, 131064);
                } else {
                    sVar3.W();
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ v1(androidx.compose.foundation.lazy.layout.y yVar, int i, Object obj, int i2, int i3) {
        this.e = i3;
        this.z = yVar;
        this.y = i;
        this.A = obj;
    }

    public /* synthetic */ v1(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
        this.A = obj2;
    }

    public /* synthetic */ v1(Object obj, Object obj2, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.A = obj2;
        this.y = i;
    }
}
