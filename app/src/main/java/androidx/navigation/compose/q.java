package androidx.navigation.compose;

import androidx.collection.e0;
import androidx.compose.animation.f1;
import androidx.compose.animation.l0;
import androidx.compose.animation.x0;
import androidx.compose.animation.y0;
import androidx.compose.foundation.text.c0;
import androidx.compose.material3.s3;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import com.app.mlounge.data.remote.model.TmdbPersonDetail;
import com.app.mlounge.ui.viewmodel.b2;
import java.util.ArrayList;
import java.util.List;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ w2 y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ q(e0 e0Var, i iVar, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, w2 w2Var, a1 a1Var) {
        this.B = e0Var;
        this.C = iVar;
        this.z = lVar;
        this.A = lVar2;
        this.D = lVar3;
        this.E = w2Var;
        this.y = a1Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.e;
        kotlin.jvm.functions.l lVar = this.z;
        y yVar = y.a;
        w2 w2Var = this.y;
        Object obj2 = this.D;
        Object obj3 = this.A;
        Object obj4 = this.C;
        Object obj5 = this.B;
        Object obj6 = this.E;
        int i2 = 1;
        switch (i) {
            case 0:
                e0 e0Var = (e0) obj5;
                i iVar = (i) obj4;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) obj3;
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) obj2;
                a1 a1Var = (a1) w2Var;
                androidx.compose.animation.v vVar = (androidx.compose.animation.v) obj;
                float f = 0.0f;
                if (!((List) ((w2) obj6).getValue()).contains(vVar.b())) {
                    x0 x0Var = x0.b;
                    y0 y0Var = y0.b;
                    int i3 = androidx.compose.animation.m.b;
                    return new l0(x0Var, y0Var, 0.0f, new f1(androidx.compose.animation.l.z));
                }
                String str = ((androidx.navigation.i) vVar.b()).C;
                int iB = e0Var.b(str);
                if (iB >= 0) {
                    f = e0Var.c[iB];
                } else {
                    e0Var.d(str, 0.0f);
                }
                if (!kotlin.jvm.internal.l.a(((androidx.navigation.i) vVar.c()).C, ((androidx.navigation.i) vVar.b()).C)) {
                    f = (((Boolean) iVar.c.getValue()).booleanValue() || ((Boolean) a1Var.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                }
                e0Var.d(((androidx.navigation.i) vVar.c()).C, f);
                return new l0((x0) lVar.invoke(vVar), (y0) lVar2.invoke(vVar), f, (f1) lVar3.invoke(vVar));
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar.getClass();
                androidx.compose.foundation.lazy.grid.h.p(5, hVar, new androidx.compose.runtime.internal.f(true, 1160055476, new com.app.mlounge.ui.components.e0(i2, (TmdbPersonDetail) obj2, (kotlin.jvm.functions.a) obj6, (a1) w2Var)), new com.app.mlounge.ui.t(16));
                hVar.q(arrayList.size(), new c0(18, new com.app.mlounge.ui.t(17), arrayList), new com.app.mlounge.ui.screens.anime.k(1, arrayList), new androidx.compose.runtime.internal.f(true, -1117249557, new com.app.mlounge.ui.screens.person.c(arrayList, lVar, i2)));
                hVar.q(arrayList2.size(), new c0(19, new com.app.mlounge.ui.t(18), arrayList2), new com.app.mlounge.ui.screens.anime.k(2, arrayList2), new androidx.compose.runtime.internal.f(true, -1117249557, new com.app.mlounge.ui.screens.person.c(arrayList2, (kotlin.jvm.functions.l) obj3, 0)));
                return yVar;
            default:
                w2 w2Var2 = (w2) obj6;
                androidx.compose.foundation.lazy.grid.h hVar2 = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar2.getClass();
                hVar2.q(((List) w2Var2.getValue()).size(), new s3(w2Var2, 5), androidx.compose.foundation.lazy.grid.q.e, new androidx.compose.runtime.internal.f(true, 1665863341, new com.app.mlounge.ui.q((b2) obj5, this.z, w2Var2, (w2) obj4, (w2) obj3, (w2) obj2)));
                if (((Boolean) w2Var.getValue()).booleanValue()) {
                    androidx.compose.foundation.lazy.grid.h.p(7, hVar2, com.app.mlounge.ui.screens.tvshows.a.c, null);
                }
                return yVar;
        }
    }

    public /* synthetic */ q(a1 a1Var, b2 b2Var, kotlin.jvm.functions.l lVar, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5) {
        this.E = a1Var;
        this.B = b2Var;
        this.z = lVar;
        this.C = a1Var2;
        this.A = a1Var3;
        this.D = a1Var4;
        this.y = a1Var5;
    }

    public /* synthetic */ q(ArrayList arrayList, ArrayList arrayList2, TmdbPersonDetail tmdbPersonDetail, kotlin.jvm.functions.a aVar, a1 a1Var, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        this.B = arrayList;
        this.C = arrayList2;
        this.D = tmdbPersonDetail;
        this.E = aVar;
        this.y = a1Var;
        this.z = lVar;
        this.A = lVar2;
    }
}
