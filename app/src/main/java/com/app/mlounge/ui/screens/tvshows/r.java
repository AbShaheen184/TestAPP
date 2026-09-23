package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.material3.g2;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.app.mlounge.ui.viewmodel.b2;
import com.app.mlounge.ui.viewmodel.c2;
import com.google.firebase.crashlytics.internal.model.t1;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ r(c2 c2Var, kotlin.jvm.functions.l lVar, int i) {
        this.e = 2;
        this.z = c2Var;
        this.y = lVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                a.d((kotlin.jvm.functions.l) this.y, (b2) this.z, (s) obj, t.A(1));
                break;
            case 1:
                c2 c2Var = (c2) this.y;
                c2 c2Var2 = (c2) this.z;
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z5.b(c2Var.e, null, c2Var == c2Var2 ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 262138);
                } else {
                    sVar.W();
                }
                return y.a;
            case 2:
                ((Integer) obj2).getClass();
                t1.c((c2) this.z, (kotlin.jvm.functions.l) this.y, (s) obj, t.A(1));
                break;
            default:
                com.app.mlounge.ui.theme.c cVar = (com.app.mlounge.ui.theme.c) this.y;
                androidx.compose.runtime.internal.f fVar = (androidx.compose.runtime.internal.f) this.z;
                s sVar2 = (s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g2.b(com.app.mlounge.ui.theme.d.a, null, com.app.mlounge.ui.theme.e.a(cVar.y), fVar, sVar2, 6);
                } else {
                    sVar2.W();
                }
                return y.a;
        }
        return y.a;
    }

    public /* synthetic */ r(Enum r1, Object obj, int i) {
        this.e = i;
        this.y = r1;
        this.z = obj;
    }

    public /* synthetic */ r(kotlin.jvm.functions.l lVar, b2 b2Var, int i) {
        this.e = 0;
        this.y = lVar;
        this.z = b2Var;
    }
}
