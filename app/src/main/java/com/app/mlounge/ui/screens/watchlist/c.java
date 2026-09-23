package com.app.mlounge.ui.screens.watchlist;

import android.content.Context;
import androidx.compose.foundation.lazy.grid.j;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.w2;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.o;
import com.app.mlounge.R;
import com.app.mlounge.data.local.entity.f;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.components.r0;
import com.app.mlounge.ui.viewmodel.d2;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.k;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r {
    public final /* synthetic */ l A;
    public final /* synthetic */ q B;
    public final /* synthetic */ l C;
    public final /* synthetic */ l D;
    public final /* synthetic */ l E;
    public final /* synthetic */ l F;
    public final /* synthetic */ List G;
    public final /* synthetic */ kotlin.jvm.functions.a H;
    public final /* synthetic */ d2 I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ w2 K;
    public final /* synthetic */ w2 L;
    public final /* synthetic */ w2 M;
    public final /* synthetic */ w2 N;
    public final /* synthetic */ a1 O;
    public final /* synthetic */ List e;
    public final /* synthetic */ Map y;
    public final /* synthetic */ l z;

    public c(List list, Map map, l lVar, l lVar2, q qVar, l lVar3, l lVar4, l lVar5, l lVar6, List list2, kotlin.jvm.functions.a aVar, d2 d2Var, Context context, w2 w2Var, w2 w2Var2, w2 w2Var3, w2 w2Var4, a1 a1Var) {
        this.e = list;
        this.y = map;
        this.z = lVar;
        this.A = lVar2;
        this.B = qVar;
        this.C = lVar3;
        this.D = lVar4;
        this.E = lVar5;
        this.F = lVar6;
        this.G = list2;
        this.H = aVar;
        this.I = d2Var;
        this.J = context;
        this.K = w2Var;
        this.L = w2Var2;
        this.M = w2Var3;
        this.N = w2Var4;
        this.O = a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x024e A[PHI: r5
  0x024e: PHI (r5v21 boolean) = (r5v12 boolean), (r5v23 boolean), (r5v25 boolean), (r5v28 boolean) binds: [B:102:0x024c, B:98:0x0233, B:94:0x0218, B:87:0x01f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0182  */
    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        int i;
        int i2;
        Integer numW;
        k kVar;
        int iIntValue;
        boolean z;
        androidx.compose.ui.graphics.painter.b bVarS;
        String str;
        String str2;
        Double d;
        boolean z2;
        boolean zContains;
        j jVar = (j) obj;
        int iIntValue2 = ((Number) obj2).intValue();
        s sVar = (s) obj3;
        int iIntValue3 = ((Number) obj4).intValue();
        if ((iIntValue3 & 6) == 0) {
            i = (sVar.f(jVar) ? 4 : 2) | iIntValue3;
        } else {
            i = iIntValue3;
        }
        if ((iIntValue3 & 48) == 0) {
            i |= sVar.d(iIntValue2) ? 32 : 16;
        }
        if (sVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
            f fVar = (f) this.e.get(iIntValue2);
            sVar.b0(520132119);
            String str3 = fVar.a;
            String str4 = fVar.b;
            boolean zF = sVar.f(str3);
            Object objQ = sVar.Q();
            androidx.compose.runtime.f fVar2 = n.a;
            if (zF || objQ == fVar2) {
                objQ = new y();
                sVar.l0(objQ);
            }
            y yVar = (y) objQ;
            Map map = this.y;
            boolean zH = sVar.h(map) | sVar.f(fVar) | sVar.f(yVar);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == fVar2) {
                objQ2 = new r0(6, map, fVar, yVar);
                sVar.l0(objQ2);
            }
            l0.e((kotlin.jvm.functions.a) objQ2, sVar);
            boolean zA = kotlin.jvm.internal.l.a(str4, "movie");
            w2 w2Var = this.K;
            float fFloatValue = 0.0f;
            if (zA) {
                Integer numW2 = kotlin.text.r.w(kotlin.text.k.P(str3, "movie_"));
                if (numW2 != null) {
                    int iIntValue4 = numW2.intValue();
                    i2 = i;
                    Float f = (Float) ((Map) w2Var.getValue()).get("movie:" + iIntValue4);
                    if (f != null) {
                        fFloatValue = f.floatValue();
                    }
                } else {
                    i2 = i;
                }
            } else {
                i2 = i;
                if (kotlin.jvm.internal.l.a(str4, "tv") && (numW = kotlin.text.r.w(kotlin.text.k.P(str3, "tv_"))) != null) {
                    int iIntValue5 = numW.intValue();
                    Float f2 = (Float) ((Map) w2Var.getValue()).get("movie:" + iIntValue5);
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    }
                }
            }
            float f3 = fFloatValue;
            if (kotlin.jvm.internal.l.a(str4, "movie")) {
                Integer numW3 = kotlin.text.r.w(kotlin.text.k.P(str3, "movie_"));
                if (numW3 != null) {
                    int iIntValue6 = numW3.intValue();
                    zContains = ((Set) this.L.getValue()).contains("movie:" + iIntValue6);
                } else {
                    zContains = false;
                }
                kVar = new k(Boolean.valueOf(zContains), Boolean.FALSE);
            } else if (kotlin.jvm.internal.l.a(str4, "tv")) {
                Integer numW4 = kotlin.text.r.w(kotlin.text.k.P(str3, "tv_"));
                if (numW4 != null) {
                    Integer num = (Integer) ((Map) this.M.getValue()).get(Integer.valueOf(numW4.intValue()));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = 0;
                }
                Integer num2 = numW4 != null ? (Integer) ((Map) this.N.getValue()).get(Integer.valueOf(numW4.intValue())) : null;
                boolean z3 = num2 != null && num2.intValue() > 0 && iIntValue >= num2.intValue();
                kVar = new k(Boolean.valueOf(z3), Boolean.valueOf(iIntValue > 0 && !z3));
            } else {
                Boolean bool = Boolean.FALSE;
                kVar = new k(bool, bool);
            }
            boolean zBooleanValue = ((Boolean) kVar.e).booleanValue();
            boolean zBooleanValue2 = ((Boolean) kVar.y).booleanValue();
            int iHashCode = str4.hashCode();
            if (iHashCode == 3714) {
                z = false;
                if (str4.equals("tv")) {
                    sVar.b0(709563062);
                    bVarS = com.google.firebase.b.S(R.drawable.ic_tv_placeholder, sVar);
                    sVar.p(false);
                } else {
                    sVar.b0(709573081);
                    bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar);
                    sVar.p(z);
                }
            } else if (iHashCode == 92676538) {
                z = false;
                if (str4.equals("adult")) {
                    sVar.b0(709568118);
                    bVarS = com.google.firebase.b.S(R.drawable.ic_menu_adult_xxx, sVar);
                    sVar.p(false);
                } else {
                    sVar.b0(709573081);
                    bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar);
                    sVar.p(z);
                }
            } else if (iHashCode == 92962932) {
                z = false;
                if (str4.equals("anime")) {
                    sVar.b0(709565650);
                    bVarS = com.google.firebase.b.S(R.drawable.ic_menu_anime, sVar);
                    sVar.p(false);
                } else {
                    sVar.b0(709573081);
                    bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar);
                    sVar.p(z);
                }
            } else if (iHashCode == 98120385 && str4.equals("games")) {
                sVar.b0(709570706);
                bVarS = com.google.firebase.b.S(R.drawable.ic_menu_games, sVar);
                z = false;
                sVar.p(false);
            } else {
                z = false;
                sVar.b0(709573081);
                bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar);
                sVar.p(z);
            }
            androidx.compose.ui.graphics.painter.b bVar = bVarS;
            androidx.compose.ui.r rVarK = d.k(o.b, yVar);
            String str5 = fVar.c;
            String strConcat = fVar.d;
            if (strConcat != null) {
                if (!kotlin.text.r.u(strConcat, "http", z)) {
                    strConcat = "https://image.tmdb.org/t/p/w342".concat(strConcat);
                }
                str = strConcat;
            } else {
                str = null;
            }
            Double d2 = fVar.f;
            String str6 = fVar.g;
            String strE0 = str6 != null ? kotlin.text.k.e0(4, str6) : null;
            h hVar = str4.equals("live_tv") ? i.b : i.a;
            boolean zF2 = sVar.f(fVar) | sVar.f(this.z) | sVar.f(this.A) | sVar.f(this.B) | sVar.f(this.C) | sVar.f(this.D) | sVar.f(this.E) | sVar.f(this.F);
            Object objQ3 = sVar.Q();
            if (zF2 || objQ3 == fVar2) {
                b bVar2 = new b(fVar, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
                sVar.l0(bVar2);
                objQ3 = bVar2;
            }
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ3;
            boolean z4 = (((i2 & Token.ASSIGN_MOD) ^ 48) > 32 && sVar.d(iIntValue2)) || (i2 & 48) == 32;
            List list = this.G;
            boolean zH2 = z4 | sVar.h(list) | sVar.f(this.H);
            d2 d2Var = this.I;
            boolean zH3 = zH2 | sVar.h(d2Var) | sVar.f(fVar) | sVar.h(this.J);
            Object objQ4 = sVar.Q();
            if (zH3 || objQ4 == fVar2) {
                str2 = str5;
                d = d2;
                z2 = false;
                com.app.mlounge.ui.screens.history.d dVar = new com.app.mlounge.ui.screens.history.d(iIntValue2, list, this.H, d2Var, fVar, this.J, this.O);
                sVar.l0(dVar);
                objQ4 = dVar;
            } else {
                str2 = str5;
                d = d2;
                z2 = false;
            }
            b0.h(str2, str, aVar, rVarK, d, strE0, (kotlin.jvm.functions.a) objQ4, hVar, bVar, f3, zBooleanValue, zBooleanValue2, 0.0f, null, sVar, 134217728, 0, 12288);
            sVar.p(z2);
        } else {
            sVar.W();
        }
        return kotlin.y.a;
    }
}
