package com.app.mlounge.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.i1;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.g1;
import com.app.mlounge.data.remote.model.MusicGenre;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ l0(Context context, androidx.activity.compose.t tVar, androidx.activity.compose.t tVar2, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, g1 g1Var) {
        this.y = context;
        this.z = tVar;
        this.A = tVar2;
        this.B = a1Var;
        this.C = a1Var2;
        this.D = g1Var;
        this.E = a1Var3;
        this.F = a1Var4;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                b0.p((String) this.y, (kotlin.jvm.functions.l) this.A, (MusicGenre) this.D, (kotlin.jvm.functions.l) this.B, (String) this.z, (List) this.E, (kotlin.jvm.functions.l) this.C, (androidx.compose.ui.r) this.F, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(1));
                break;
            case 1:
                final Context context = (Context) this.y;
                final androidx.activity.compose.t tVar = (androidx.activity.compose.t) this.z;
                final androidx.activity.compose.t tVar2 = (androidx.activity.compose.t) this.A;
                final a1 a1Var = (a1) this.B;
                final a1 a1Var2 = (a1) this.C;
                final g1 g1Var = (g1) this.D;
                final a1 a1Var3 = (a1) this.E;
                final a1 a1Var4 = (a1) this.F;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zH = sVar.h(context) | sVar.h(tVar) | sVar.h(tVar2);
                    Object objQ = sVar.Q();
                    if (zH || objQ == androidx.compose.runtime.n.a) {
                        kotlin.jvm.functions.a aVar = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.g
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() throws Exception {
                                e0.b(context, tVar, tVar2, a1Var, a1Var2, a1Var3, a1Var4, g1Var);
                                return kotlin.y.a;
                            }
                        };
                        sVar.l0(aVar);
                        objQ = aVar;
                    }
                    androidx.compose.material3.q.i((kotlin.jvm.functions.a) objQ, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.w, sVar, 805306368, 510);
                } else {
                    sVar.W();
                }
                break;
            default:
                String str = (String) this.y;
                List list = (List) this.E;
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) this.z;
                a1 a1Var5 = (a1) this.B;
                a1 a1Var6 = (a1) this.C;
                a1 a1Var7 = (a1) this.D;
                a1 a1Var8 = (a1) this.F;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.A;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.material3.q.c(i1.c(i1.e(androidx.compose.ui.o.b, 0.9f), 0.75f), androidx.compose.foundation.shape.e.a(16), androidx.compose.material3.q.j(com.app.mlounge.ui.theme.b.b, sVar2, 0), null, androidx.compose.runtime.internal.k.c(485764076, new com.app.mlounge.ui.screens.settings.h(str, list, aVar2, a1Var5, a1Var6, a1Var7, a1Var8, lVar, 0), sVar2), sVar2, 196614, 24);
                } else {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ l0(String str, List list, kotlin.jvm.functions.a aVar, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, kotlin.jvm.functions.l lVar) {
        this.y = str;
        this.E = list;
        this.z = aVar;
        this.B = a1Var;
        this.C = a1Var2;
        this.D = a1Var3;
        this.F = a1Var4;
        this.A = lVar;
    }

    public /* synthetic */ l0(String str, kotlin.jvm.functions.l lVar, MusicGenre musicGenre, kotlin.jvm.functions.l lVar2, String str2, List list, kotlin.jvm.functions.l lVar3, androidx.compose.ui.r rVar, int i) {
        this.y = str;
        this.A = lVar;
        this.D = musicGenre;
        this.B = lVar2;
        this.z = str2;
        this.E = list;
        this.C = lVar3;
        this.F = rVar;
    }
}
