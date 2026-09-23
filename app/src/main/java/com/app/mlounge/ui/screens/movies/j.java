package com.app.mlounge.ui.screens.movies;

import androidx.compose.foundation.layout.i1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.ui.o;
import com.app.mlounge.data.remote.model.TmdbCastMember;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.viewmodel.f0;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements r {
    public final /* synthetic */ l A;
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ f0 z;

    public /* synthetic */ j(List list, f0 f0Var, l lVar, int i) {
        this.e = i;
        this.y = list;
        this.z = f0Var;
        this.A = lVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                s sVar = (s) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (sVar.f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= sVar.d(iIntValue) ? 32 : 16;
                }
                if (sVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    TmdbCastMember tmdbCastMember = (TmdbCastMember) this.y.get(iIntValue);
                    sVar.b0(1722668403);
                    String strC = tmdbCastMember.c();
                    if (strC == null) {
                        strC = "";
                    }
                    String strA = tmdbCastMember.a();
                    if (strA == null) {
                        strA = "";
                    }
                    String strD = tmdbCastMember.d();
                    this.z.b.getClass();
                    String strB = j0.b(strD, "w185");
                    l lVar = this.A;
                    boolean zF = sVar.f(lVar) | sVar.f(tmdbCastMember);
                    Object objQ = sVar.Q();
                    if (zF || objQ == n.a) {
                        objQ = new h(lVar, tmdbCastMember, 0);
                        sVar.l0(objQ);
                    }
                    a.a(strC, strA, strB, (kotlin.jvm.functions.a) objQ, sVar, 0);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            default:
                androidx.compose.foundation.lazy.d dVar2 = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                s sVar2 = (s) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (sVar2.f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= sVar2.d(iIntValue3) ? 32 : 16;
                }
                if (sVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    TmdbMovie tmdbMovie = (TmdbMovie) this.y.get(iIntValue3);
                    sVar2.b0(439583142);
                    String strE = tmdbMovie.e();
                    if (strE == null) {
                        strE = "";
                    }
                    String strC2 = tmdbMovie.c();
                    this.z.b.getClass();
                    String strB2 = j0.b(strC2, "w500");
                    Double dF = tmdbMovie.f();
                    androidx.compose.ui.r rVarQ = i1.q(o.b, 130);
                    l lVar2 = this.A;
                    boolean zF2 = sVar2.f(lVar2) | sVar2.h(tmdbMovie);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == n.a) {
                        objQ2 = new i(lVar2, tmdbMovie, 0);
                        sVar2.l0(objQ2);
                    }
                    b0.h(strE, strB2, (kotlin.jvm.functions.a) objQ2, rVarQ, dF, null, null, null, null, 0.0f, false, false, 0.0f, null, sVar2, 3072, 0, 16352);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
        }
        return y.a;
    }
}
