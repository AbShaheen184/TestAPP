package com.app.mlounge.ui.screens.history;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.j;
import androidx.lifecycle.m0;
import androidx.room.b0;
import com.app.mlounge.data.local.entity.f;
import com.app.mlounge.ui.viewmodel.d2;
import com.app.mlounge.ui.viewmodel.g0;
import com.app.mlounge.ui.viewmodel.s;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.text.k;
import kotlin.text.r;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public d(int i, List list, kotlin.jvm.functions.a aVar, s sVar, com.app.mlounge.data.local.entity.c cVar, Context context, a1 a1Var) {
        this.y = i;
        this.A = list;
        this.B = aVar;
        this.C = sVar;
        this.z = cVar;
        this.D = context;
        this.E = a1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x01c1  */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.data.local.entity.c cVar = (com.app.mlounge.data.local.entity.c) this.z;
                String str = cVar.c;
                String str2 = cVar.b;
                String str3 = cVar.a;
                String strP = cVar.l;
                int i = this.y;
                StringBuilder sbQ = j.q("onClick title=", str, " type=", str2, " contentId=");
                b0.i(sbQ, str3, " externalId=", strP, " index=");
                sbQ.append(i);
                com.app.mlounge.util.a.a("D", "HistoryClick", sbQ.toString());
                switch (str2) {
                    case "anime_tv":
                    case "anime_movie":
                        if (strP == null) {
                            strP = k.P(k.P(str3, "anime_movie_"), "anime_tv_");
                        }
                    case "tv":
                        Integer numW = r.w(k.b0(k.P(str3, "tv_"), "_"));
                        if (numW == null) {
                            com.app.mlounge.util.a.a("W", "HistoryClick", "tv id null for contentId=".concat(str3));
                        } else {
                            ((l) this.B).invoke(numW);
                        }
                        break;
                    case "adult":
                        if (strP == null) {
                            strP = k.P(str3, "adult_");
                        }
                    case "movie":
                        Integer numW2 = r.w(k.P(str3, "movie_"));
                        if (numW2 == null) {
                            com.app.mlounge.util.a.a("W", "HistoryClick", "movie id null for contentId=".concat(str3));
                        } else {
                            ((l) this.A).invoke(numW2);
                        }
                        break;
                    case "live_tv":
                        String strY = k.Y(str3, "_", "");
                        if (strP == null) {
                            com.app.mlounge.util.a.a("W", "HistoryClick", "live_tv url null for contentId=".concat(str3));
                        } else {
                            ((kotlin.jvm.functions.r) this.E).invoke(strP, str, null, strY);
                        }
                        break;
                    default:
                        com.app.mlounge.util.a.a("W", "HistoryClick", b0.e("UNHANDLED contentType=", str2, " contentId=", str3));
                        break;
                }
                break;
            case 1:
                com.app.mlounge.data.local.entity.c cVar2 = (com.app.mlounge.data.local.entity.c) this.z;
                int i2 = this.y;
                List list = (List) this.A;
                if (i2 == list.size() - 1) {
                    ((kotlin.jvm.functions.a) this.B).invoke();
                } else {
                    ((a1) this.E).setValue(((com.app.mlounge.data.local.entity.c) list.get(i2 + 1)).a);
                }
                s sVar = (s) this.C;
                String str4 = cVar2.a;
                str4.getClass();
                BuildersKt__Builders_commonKt.launch$default(m0.g(sVar), null, null, new androidx.room.s(sVar, str4, null, 28), 3, null);
                Toast.makeText((Context) this.D, cVar2.c + " removed from history", 0).show();
                break;
            default:
                f fVar = (f) this.C;
                int i3 = this.y;
                List list2 = (List) this.z;
                if (i3 == list2.size() - 1) {
                    ((kotlin.jvm.functions.a) this.A).invoke();
                } else {
                    ((a1) this.E).setValue(((f) list2.get(i3 + 1)).a);
                }
                d2 d2Var = (d2) this.B;
                String str5 = fVar.a;
                str5.getClass();
                BuildersKt__Builders_commonKt.launch$default(m0.g(d2Var), null, null, new g0(d2Var, str5, (kotlin.coroutines.d) null, 6), 3, null);
                Toast.makeText((Context) this.D, fVar.c + " removed from favourites", 0).show();
                break;
        }
        return y.a;
    }

    public d(int i, List list, kotlin.jvm.functions.a aVar, d2 d2Var, f fVar, Context context, a1 a1Var) {
        this.y = i;
        this.z = list;
        this.A = aVar;
        this.B = d2Var;
        this.C = fVar;
        this.D = context;
        this.E = a1Var;
    }

    public d(com.app.mlounge.data.local.entity.c cVar, int i, l lVar, l lVar2, kotlin.jvm.functions.r rVar, l lVar3, l lVar4) {
        this.z = cVar;
        this.y = i;
        this.A = lVar;
        this.B = lVar2;
        this.E = rVar;
        this.C = lVar3;
        this.D = lVar4;
    }
}
