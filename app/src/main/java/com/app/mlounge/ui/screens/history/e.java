package com.app.mlounge.ui.screens.history;

import android.content.Context;
import androidx.compose.foundation.lazy.grid.j;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.w2;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.o;
import com.app.mlounge.R;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.components.r0;
import com.app.mlounge.ui.viewmodel.s;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.text.k;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements r {
    public final /* synthetic */ l A;
    public final /* synthetic */ r B;
    public final /* synthetic */ l C;
    public final /* synthetic */ l D;
    public final /* synthetic */ List E;
    public final /* synthetic */ kotlin.jvm.functions.a F;
    public final /* synthetic */ s G;
    public final /* synthetic */ Context H;
    public final /* synthetic */ w2 I;
    public final /* synthetic */ a1 J;
    public final /* synthetic */ List e;
    public final /* synthetic */ Map y;
    public final /* synthetic */ l z;

    public e(List list, Map map, l lVar, l lVar2, r rVar, l lVar3, l lVar4, List list2, kotlin.jvm.functions.a aVar, s sVar, Context context, w2 w2Var, a1 a1Var) {
        this.e = list;
        this.y = map;
        this.z = lVar;
        this.A = lVar2;
        this.B = rVar;
        this.C = lVar3;
        this.D = lVar4;
        this.E = list2;
        this.F = aVar;
        this.G = sVar;
        this.H = context;
        this.I = w2Var;
        this.J = a1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:102:0x0205  */
    /* JADX WARN: Code duplicated, block: B:105:0x020c  */
    /* JADX WARN: Code duplicated, block: B:106:0x020e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0214  */
    /* JADX WARN: Code duplicated, block: B:113:0x0244  */
    /* JADX WARN: Code duplicated, block: B:116:0x024e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0257  */
    /* JADX WARN: Code duplicated, block: B:121:0x0262  */
    /* JADX WARN: Code duplicated, block: B:123:0x0267  */
    /* JADX WARN: Code duplicated, block: B:135:0x02af  */
    /* JADX WARN: Code duplicated, block: B:150:0x0314  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:81:0x018f A[PHI: r16
  0x018f: PHI (r16v4 java.lang.String) = (r16v3 java.lang.String), (r16v7 java.lang.String) binds: [B:79:0x018c, B:76:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0193  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01db  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x01af. Please report as an issue. */
    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        String str;
        String strE0;
        int iHashCode;
        w2 w2Var;
        float fFloatValue;
        String str2;
        String str3;
        Float f;
        androidx.compose.ui.graphics.painter.b bVarS;
        boolean z;
        androidx.compose.ui.graphics.painter.b bVar;
        boolean z2;
        androidx.compose.ui.graphics.painter.b bVarS2;
        String strConcat;
        String str4;
        Double d;
        h hVar;
        int i;
        boolean zF;
        Object objQ;
        Double d2;
        int i2;
        com.app.mlounge.data.local.entity.c cVar;
        int i3;
        int i4;
        List list;
        s sVar;
        boolean zH;
        Object objQ2;
        Integer numW;
        int iIntValue;
        int iIntValue2;
        Float f2;
        Integer numW2;
        Float f3;
        j jVar = (j) obj;
        int iIntValue3 = ((Number) obj2).intValue();
        androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj3;
        int iIntValue4 = ((Number) obj4).intValue();
        int i5 = (iIntValue4 & 6) == 0 ? (sVar2.f(jVar) ? 4 : 2) | iIntValue4 : iIntValue4;
        if ((iIntValue4 & 48) == 0) {
            i5 |= sVar2.d(iIntValue3) ? 32 : 16;
        }
        if (sVar2.T(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
            com.app.mlounge.data.local.entity.c cVar2 = (com.app.mlounge.data.local.entity.c) this.e.get(iIntValue3);
            sVar2.b0(858894835);
            String str5 = cVar2.a;
            Integer num = cVar2.n;
            Integer num2 = cVar2.m;
            String str6 = cVar2.b;
            boolean zF2 = sVar2.f(str5);
            Object objQ3 = sVar2.Q();
            f fVar = n.a;
            if (zF2 || objQ3 == fVar) {
                objQ3 = new y();
                sVar2.l0(objQ3);
            }
            y yVar = (y) objQ3;
            Map map = this.y;
            boolean zH2 = sVar2.h(map) | sVar2.f(cVar2) | sVar2.f(yVar);
            Object objQ4 = sVar2.Q();
            if (zH2 || objQ4 == fVar) {
                objQ4 = new r0(2, map, cVar2, yVar);
                sVar2.l0(objQ4);
            }
            l0.e((kotlin.jvm.functions.a) objQ4, sVar2);
            if (num2 != null) {
                strE0 = "S" + num2 + "E" + (num != null ? num.intValue() : 0);
            } else {
                String str7 = cVar2.g;
                if (str7 != null) {
                    strE0 = k.e0(4, str7);
                } else {
                    str = null;
                }
                iHashCode = str6.hashCode();
                int i6 = i5;
                w2Var = this.I;
                fFloatValue = 0.0f;
                if (iHashCode != -795103699) {
                    str2 = str;
                    if (str6.equals("anime_tv")) {
                        str3 = cVar2.l;
                        if (str3 != null) {
                            fFloatValue = f.floatValue();
                        }
                    }
                } else if (iHashCode != -196215899) {
                    if (iHashCode != 3714) {
                        if (iHashCode == 104087344 && str6.equals("movie") && (numW2 = kotlin.text.r.w(k.P(str5, "movie_"))) != null) {
                            f3 = (Float) ((Map) w2Var.getValue()).get("movie:" + numW2.intValue());
                            if (f3 != null) {
                                fFloatValue = f3.floatValue();
                            }
                        }
                    } else if (str6.equals("tv") && (numW = kotlin.text.r.w(k.P(str5, "tv_"))) != null) {
                        int iIntValue5 = numW.intValue();
                        Map map2 = (Map) w2Var.getValue();
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        str2 = str;
                        StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("tv:", ":", iIntValue5, ":", iIntValue);
                        sbW.append(iIntValue2);
                        f2 = (Float) map2.get(sbW.toString());
                        if (f2 != null) {
                            fFloatValue = f2.floatValue();
                        }
                    }
                    str2 = str;
                } else {
                    str2 = str;
                    if (str6.equals("anime_movie")) {
                        str3 = cVar2.l;
                        if (str3 != null && (f = (Float) ((Map) w2Var.getValue()).get("anime:".concat(str3))) != null) {
                            fFloatValue = f.floatValue();
                        }
                    }
                }
                switch (str6.hashCode()) {
                    case -795103699:
                        if (str6.equals("anime_tv")) {
                            z = false;
                            sVar2.b0(-942090666);
                            bVarS = com.google.firebase.b.S(R.drawable.ic_menu_anime, sVar2);
                            sVar2.p(false);
                        } else {
                            sVar2.b0(-942083235);
                            bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                            z = false;
                            sVar2.p(false);
                        }
                        bVar = bVarS;
                        break;
                    case -196215899:
                        if (str6.equals("anime_movie")) {
                            z = false;
                            sVar2.b0(-942090666);
                            bVarS = com.google.firebase.b.S(R.drawable.ic_menu_anime, sVar2);
                            sVar2.p(false);
                        } else {
                            sVar2.b0(-942083235);
                            bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                            z = false;
                            sVar2.p(false);
                        }
                        bVar = bVarS;
                        break;
                    case 3714:
                        z2 = false;
                        if (str6.equals("tv")) {
                            sVar2.b0(-942093830);
                            bVarS2 = com.google.firebase.b.S(R.drawable.ic_tv_placeholder, sVar2);
                            sVar2.p(false);
                            bVar = bVarS2;
                            z = z2;
                        }
                        sVar2.b0(-942083235);
                        bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                        z = false;
                        sVar2.p(false);
                        bVar = bVarS;
                        break;
                    case 92676538:
                        z2 = false;
                        if (str6.equals("adult")) {
                            sVar2.b0(-942088198);
                            bVarS2 = com.google.firebase.b.S(R.drawable.ic_menu_adult_xxx, sVar2);
                            sVar2.p(false);
                            bVar = bVarS2;
                            z = z2;
                        }
                        sVar2.b0(-942083235);
                        bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                        z = false;
                        sVar2.p(false);
                        bVar = bVarS;
                        break;
                    case 98120385:
                        if (str6.equals("games")) {
                            sVar2.b0(-942085610);
                            bVarS2 = com.google.firebase.b.S(R.drawable.ic_menu_games, sVar2);
                            z2 = false;
                            sVar2.p(false);
                            bVar = bVarS2;
                            z = z2;
                        }
                        sVar2.b0(-942083235);
                        bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                        z = false;
                        sVar2.p(false);
                        bVar = bVarS;
                        break;
                    default:
                        sVar2.b0(-942083235);
                        bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                        z = false;
                        sVar2.p(false);
                        bVar = bVarS;
                        break;
                }
                androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(o.b, yVar);
                String str8 = cVar2.c;
                strConcat = cVar2.d;
                if (strConcat != null) {
                    if (!kotlin.text.r.u(strConcat, "http", z)) {
                        strConcat = "https://image.tmdb.org/t/p/w342".concat(strConcat);
                    }
                    str4 = strConcat;
                } else {
                    str4 = null;
                }
                d = cVar2.f;
                if (str6.equals("live_tv")) {
                    hVar = i.b;
                } else {
                    hVar = i.a;
                }
                h hVar2 = hVar;
                boolean zF3 = sVar2.f(cVar2);
                i = (i6 & Token.ASSIGN_MOD) ^ 48;
                zF = zF3 | (((i > 32 || !sVar2.d(iIntValue3)) && (i6 & 48) != 32) ? z : true) | sVar2.f(this.z) | sVar2.f(this.A) | sVar2.f(this.B) | sVar2.f(this.C) | sVar2.f(this.D);
                objQ = sVar2.Q();
                if (!zF || objQ == fVar) {
                    d2 = d;
                    i2 = iIntValue3;
                    cVar = cVar2;
                    i3 = i;
                    d dVar = new d(cVar, i2, this.z, this.A, this.B, this.C, this.D);
                    sVar2.l0(dVar);
                    objQ = dVar;
                } else {
                    d2 = d;
                    i2 = iIntValue3;
                    i3 = i;
                    cVar = cVar2;
                }
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
                boolean z3 = (i3 <= 32 && sVar2.d(i2)) || (i6 & 48) == 32;
                i4 = i2;
                list = this.E;
                boolean zH3 = z3 | sVar2.h(list) | sVar2.f(this.F);
                sVar = this.G;
                zH = zH3 | sVar2.h(sVar) | sVar2.f(cVar) | sVar2.h(this.H);
                objQ2 = sVar2.Q();
                if (zH || objQ2 == fVar) {
                    d dVar2 = new d(i4, list, this.F, sVar, cVar, this.H, this.J);
                    sVar2.l0(dVar2);
                    objQ2 = dVar2;
                }
                b0.h(str8, str4, aVar, rVarK, d2, str2, (kotlin.jvm.functions.a) objQ2, hVar2, bVar, fFloatValue, false, false, 0.0f, "HistoryCard", sVar2, 134217728, 3072, 7168);
                sVar2.p(false);
            }
            str = strE0;
            iHashCode = str6.hashCode();
            int i7 = i5;
            w2Var = this.I;
            fFloatValue = 0.0f;
            if (iHashCode != -795103699) {
                str2 = str;
                if (str6.equals("anime_tv")) {
                    str3 = cVar2.l;
                    if (str3 != null) {
                        fFloatValue = f.floatValue();
                    }
                }
            } else if (iHashCode != -196215899) {
                if (iHashCode != 3714) {
                    if (iHashCode == 104087344) {
                        f3 = (Float) ((Map) w2Var.getValue()).get("movie:" + numW2.intValue());
                        if (f3 != null) {
                            fFloatValue = f3.floatValue();
                        }
                    }
                } else if (str6.equals("tv")) {
                    int iIntValue6 = numW.intValue();
                    Map map3 = (Map) w2Var.getValue();
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    str2 = str;
                    StringBuilder sbW2 = androidx.privacysandbox.ads.adservices.java.internal.a.w("tv:", ":", iIntValue6, ":", iIntValue);
                    sbW2.append(iIntValue2);
                    f2 = (Float) map3.get(sbW2.toString());
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    }
                }
                str2 = str;
            } else {
                str2 = str;
                if (str6.equals("anime_movie")) {
                    str3 = cVar2.l;
                    if (str3 != null) {
                        fFloatValue = f.floatValue();
                    }
                }
            }
            switch (str6.hashCode()) {
                case -795103699:
                    if (str6.equals("anime_tv")) {
                        sVar2.b0(-942083235);
                        bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                        z = false;
                        sVar2.p(false);
                    } else {
                        z = false;
                        sVar2.b0(-942090666);
                        bVarS = com.google.firebase.b.S(R.drawable.ic_menu_anime, sVar2);
                        sVar2.p(false);
                    }
                    bVar = bVarS;
                    break;
                case -196215899:
                    if (str6.equals("anime_movie")) {
                        sVar2.b0(-942083235);
                        bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                        z = false;
                        sVar2.p(false);
                    } else {
                        z = false;
                        sVar2.b0(-942090666);
                        bVarS = com.google.firebase.b.S(R.drawable.ic_menu_anime, sVar2);
                        sVar2.p(false);
                    }
                    bVar = bVarS;
                    break;
                case 3714:
                    z2 = false;
                    if (str6.equals("tv")) {
                        sVar2.b0(-942093830);
                        bVarS2 = com.google.firebase.b.S(R.drawable.ic_tv_placeholder, sVar2);
                        sVar2.p(false);
                        bVar = bVarS2;
                        z = z2;
                    }
                    sVar2.b0(-942083235);
                    bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                    z = false;
                    sVar2.p(false);
                    bVar = bVarS;
                    break;
                case 92676538:
                    z2 = false;
                    if (str6.equals("adult")) {
                        sVar2.b0(-942088198);
                        bVarS2 = com.google.firebase.b.S(R.drawable.ic_menu_adult_xxx, sVar2);
                        sVar2.p(false);
                        bVar = bVarS2;
                        z = z2;
                    }
                    sVar2.b0(-942083235);
                    bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                    z = false;
                    sVar2.p(false);
                    bVar = bVarS;
                    break;
                case 98120385:
                    if (str6.equals("games")) {
                        sVar2.b0(-942085610);
                        bVarS2 = com.google.firebase.b.S(R.drawable.ic_menu_games, sVar2);
                        z2 = false;
                        sVar2.p(false);
                        bVar = bVarS2;
                        z = z2;
                    }
                    sVar2.b0(-942083235);
                    bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                    z = false;
                    sVar2.p(false);
                    bVar = bVarS;
                    break;
                default:
                    sVar2.b0(-942083235);
                    bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                    z = false;
                    sVar2.p(false);
                    bVar = bVarS;
                    break;
            }
            androidx.compose.ui.r rVarK2 = androidx.compose.ui.focus.d.k(o.b, yVar);
            String str9 = cVar2.c;
            strConcat = cVar2.d;
            if (strConcat != null) {
                if (!kotlin.text.r.u(strConcat, "http", z)) {
                    strConcat = "https://image.tmdb.org/t/p/w342".concat(strConcat);
                }
                str4 = strConcat;
            } else {
                str4 = null;
            }
            d = cVar2.f;
            if (str6.equals("live_tv")) {
                hVar = i.b;
            } else {
                hVar = i.a;
            }
            h hVar3 = hVar;
            boolean zF4 = sVar2.f(cVar2);
            i = (i7 & Token.ASSIGN_MOD) ^ 48;
            zF = zF4 | (((i > 32 || !sVar2.d(iIntValue3)) && (i7 & 48) != 32) ? z : true) | sVar2.f(this.z) | sVar2.f(this.A) | sVar2.f(this.B) | sVar2.f(this.C) | sVar2.f(this.D);
            objQ = sVar2.Q();
            if (zF) {
                d2 = d;
                i2 = iIntValue3;
                cVar = cVar2;
                i3 = i;
                d dVar3 = new d(cVar, i2, this.z, this.A, this.B, this.C, this.D);
                sVar2.l0(dVar3);
                objQ = dVar3;
            } else {
                d2 = d;
                i2 = iIntValue3;
                cVar = cVar2;
                i3 = i;
                d dVar4 = new d(cVar, i2, this.z, this.A, this.B, this.C, this.D);
                sVar2.l0(dVar4);
                objQ = dVar4;
            }
            kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ;
            if (i3 <= 32) {
            }
            i4 = i2;
            list = this.E;
            boolean zH4 = z3 | sVar2.h(list) | sVar2.f(this.F);
            sVar = this.G;
            zH = zH4 | sVar2.h(sVar) | sVar2.f(cVar) | sVar2.h(this.H);
            objQ2 = sVar2.Q();
            if (zH) {
                d dVar5 = new d(i4, list, this.F, sVar, cVar, this.H, this.J);
                sVar2.l0(dVar5);
                objQ2 = dVar5;
            } else {
                d dVar6 = new d(i4, list, this.F, sVar, cVar, this.H, this.J);
                sVar2.l0(dVar6);
                objQ2 = dVar6;
            }
            b0.h(str9, str4, aVar2, rVarK2, d2, str2, (kotlin.jvm.functions.a) objQ2, hVar3, bVar, fFloatValue, false, false, 0.0f, "HistoryCard", sVar2, 134217728, 3072, 7168);
            sVar2.p(false);
        } else {
            sVar2.W();
        }
        return kotlin.y.a;
    }
}
