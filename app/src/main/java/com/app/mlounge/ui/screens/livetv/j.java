package com.app.mlounge.ui.screens.livetv;

import androidx.compose.material3.a2;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.material3.u1;
import androidx.compose.material3.v1;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.internal.k;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.o;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.ui.components.r0;
import com.app.mlounge.ui.components.s0;
import com.app.mlounge.ui.navigation.w;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.b0;
import java.util.List;
import java.util.Locale;
import kotlin.collections.p;
import kotlin.jvm.functions.r;
import kotlin.jvm.internal.l;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements r {
    public final /* synthetic */ kotlin.d A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ Object z;

    public /* synthetic */ j(List list, Object obj, kotlin.d dVar, a1 a1Var, int i) {
        this.e = i;
        this.y = list;
        this.z = obj;
        this.A = dVar;
        this.B = a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02a8 A[PHI: r2
  0x02a8: PHI (r2v11 java.lang.String) = (r2v4 java.lang.String), (r2v12 java.lang.String) binds: [B:127:0x02d8, B:116:0x02a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String strA;
        ?? r4;
        Object obj5;
        int i = this.e;
        a1 a1Var = this.B;
        y yVar = y.a;
        androidx.compose.runtime.f fVar = n.a;
        Object obj6 = this.z;
        List list = this.y;
        kotlin.d dVar = this.A;
        int i2 = 1;
        switch (i) {
            case 0:
                androidx.compose.foundation.lazy.grid.j jVar = (androidx.compose.foundation.lazy.grid.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                s sVar = (s) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                kotlin.jvm.functions.s sVar2 = (kotlin.jvm.functions.s) dVar;
                a0 a0Var = (a0) obj6;
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (sVar.f(jVar) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= sVar.d(iIntValue) ? 32 : 16;
                }
                if (!sVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    sVar.W();
                } else {
                    IptvChannel iptvChannel = (IptvChannel) list.get(iIntValue);
                    sVar.b0(800715413);
                    String strC = iptvChannel.c();
                    String strB = iptvChannel.b();
                    String str = (String) a1Var.getValue();
                    String strA2 = "";
                    if (l.a(str, "plutotv")) {
                        strA = iptvChannel.a();
                        String strL = a0.l(strA);
                        if (strL != null) {
                            ?? r2 = b0.a;
                            String upperCase = strL.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            strA2 = (String) r2.get(upperCase);
                            if (strA2 == null) {
                                strA2 = strL;
                            }
                        } else if (strA != null) {
                            strA2 = strA;
                        }
                    } else if (l.a(str, "iptvorg")) {
                        strA = iptvChannel.a();
                        List listK = a0.k(strA);
                        if (!listK.isEmpty()) {
                            strA2 = p.I(listK, ", ", null, null, null, 62);
                        } else if (strA != null) {
                            strA2 = strA;
                        }
                    } else {
                        strA2 = iptvChannel.a();
                    }
                    String str2 = strA2;
                    String strD = iptvChannel.d();
                    boolean zH = sVar.h(a0Var) | sVar.f(iptvChannel) | sVar.f(sVar2);
                    Object objQ = sVar.Q();
                    Object obj7 = objQ;
                    if (zH || objQ == fVar) {
                        r0 r0Var = new r0(3, a0Var, iptvChannel, sVar2);
                        sVar.l0(r0Var);
                        obj7 = r0Var;
                    }
                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj7;
                    boolean zH2 = sVar.h(a0Var) | sVar.f(iptvChannel);
                    Object objQ2 = sVar.Q();
                    Object obj8 = objQ2;
                    if (zH2 || objQ2 == fVar) {
                        com.app.mlounge.ui.screens.downloads.e eVar = new com.app.mlounge.ui.screens.downloads.e(i2, a0Var, iptvChannel);
                        sVar.l0(eVar);
                        obj8 = eVar;
                    }
                    com.app.mlounge.ui.components.b0.f(strC, strB, aVar, null, str2, strD, (kotlin.jvm.functions.a) obj8, sVar, 0, 8);
                    sVar.p(false);
                }
                break;
            case 1:
                androidx.compose.foundation.lazy.d dVar2 = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                s sVar3 = (s) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                kotlin.jvm.functions.s sVar4 = (kotlin.jvm.functions.s) dVar;
                a0 a0Var2 = (a0) obj6;
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (sVar3.f(dVar2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= sVar3.d(iIntValue3) ? 32 : 16;
                }
                if (!sVar3.T(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    sVar3.W();
                } else {
                    SportsMatch sportsMatch = (SportsMatch) list.get(iIntValue3);
                    sVar3.b0(-695003525);
                    boolean zH3 = sVar3.h(sportsMatch) | sVar3.h(a0Var2) | sVar3.f(sVar4);
                    Object objQ3 = sVar3.Q();
                    if (zH3 || objQ3 == fVar) {
                        objQ3 = new com.app.mlounge.ui.screens.downloads.d(sportsMatch, a0Var2, sVar4, this.B, 1);
                        sVar3.l0(objQ3);
                    }
                    a.f(sportsMatch, (kotlin.jvm.functions.a) objQ3, sVar3, SportsMatch.$stable);
                    sVar3.p(false);
                }
                break;
            default:
                androidx.compose.foundation.lazy.d dVar3 = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                s sVar5 = (s) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) dVar;
                int i5 = (iIntValue6 & 6) == 0 ? iIntValue6 | (sVar5.f(dVar3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i5 |= sVar5.d(iIntValue5) ? 32 : 16;
                }
                if (!sVar5.T(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    sVar5.W();
                } else {
                    w wVar = (w) list.get(iIntValue5);
                    sVar5.b0(-1269858040);
                    boolean zV = com.app.mlounge.ui.components.b0.v((String) obj6, wVar);
                    float f = v1.a;
                    long j = t.h;
                    long j2 = t.i;
                    t0 t0Var = (t0) sVar5.j(u0.a);
                    u1 u1Var = t0Var.c0;
                    if (u1Var == null) {
                        u1 u1Var2 = new u1(u0.c(t0Var, androidx.compose.material3.tokens.n.a), u0.c(t0Var, androidx.compose.material3.tokens.n.j), u0.c(t0Var, androidx.compose.material3.tokens.n.l), u0.c(t0Var, androidx.compose.material3.tokens.n.n), u0.c(t0Var, androidx.compose.material3.tokens.n.o), u0.c(t0Var, androidx.compose.material3.tokens.n.q), t.b(androidx.compose.material3.tokens.n.e, u0.c(t0Var, androidx.compose.material3.tokens.n.d)), t.b(androidx.compose.material3.tokens.n.g, u0.c(t0Var, androidx.compose.material3.tokens.n.f)), t.b(androidx.compose.material3.tokens.n.i, u0.c(t0Var, androidx.compose.material3.tokens.n.h)));
                        t0Var.c0 = u1Var2;
                        u1Var = u1Var2;
                    }
                    if (j == 16) {
                        j = u1Var.a;
                    }
                    long j3 = j;
                    long j4 = j2 != 16 ? j2 : u1Var.b;
                    long j5 = j2 != 16 ? j2 : u1Var.c;
                    long j6 = j2 != 16 ? j2 : u1Var.d;
                    long j7 = j2 != 16 ? j2 : u1Var.e;
                    long j8 = j2 != 16 ? j2 : u1Var.f;
                    long j9 = j2 != 16 ? j2 : u1Var.g;
                    long j10 = j2 != 16 ? j2 : u1Var.h;
                    if (j2 == 16) {
                        j2 = u1Var.i;
                    }
                    u1 u1Var3 = new u1(j3, j4, j5, j6, j7, j8, j9, j10, j2);
                    boolean zF = sVar5.f(lVar) | sVar5.f(wVar);
                    Object objQ4 = sVar5.Q();
                    if (zF || objQ4 == fVar) {
                        r4 = 0;
                        r0 r0Var2 = new r0(false ? 1 : 0, lVar, wVar, a1Var);
                        sVar5.l0(r0Var2);
                        obj5 = r0Var2;
                    } else {
                        r4 = 0;
                        obj5 = objQ4;
                    }
                    a2.a(k.c(446496566, new s0(zV, r4, wVar), sVar5), androidx.compose.foundation.s.k(o.b, r4, null, (kotlin.jvm.functions.a) obj5, 15), k.c(649236538, new s0(zV, wVar), sVar5), k.c(699921531, new com.app.mlounge.ui.components.t0(zV), sVar5), u1Var3, 0.0f, 0.0f, sVar5, 221190);
                    sVar5.p(false);
                }
                break;
        }
        return yVar;
    }
}
