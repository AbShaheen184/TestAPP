package com.app.mlounge.ui;

import android.os.Bundle;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import androidx.lifecycle.y0;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.ui.viewmodel.j0;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.r {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ m(kotlin.jvm.functions.p pVar, a1 a1Var, w2 w2Var) {
        this.e = 2;
        this.y = pVar;
        this.A = a1Var;
        this.z = w2Var;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        String string;
        switch (this.e) {
            case 0:
                androidx.navigation.y yVar = (androidx.navigation.y) this.y;
                kotlin.jvm.functions.r rVar = (kotlin.jvm.functions.r) this.z;
                a1 a1Var = (a1) this.A;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                ((androidx.navigation.i) obj2).getClass();
                boolean zH = sVar.h(yVar);
                Object objQ = sVar.Q();
                androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                if (zH || objQ == fVar) {
                    objQ = new b(yVar, a1Var, 27);
                    sVar.l0(objQ);
                }
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ;
                boolean zH2 = sVar.h(yVar);
                Object objQ2 = sVar.Q();
                if (zH2 || objQ2 == fVar) {
                    objQ2 = new b(yVar, a1Var, 28);
                    sVar.l0(objQ2);
                }
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ2;
                boolean zH3 = sVar.h(yVar);
                Object objQ3 = sVar.Q();
                if (zH3 || objQ3 == fVar) {
                    objQ3 = new b(yVar, a1Var, 0);
                    sVar.l0(objQ3);
                }
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) objQ3;
                boolean zH4 = sVar.h(yVar);
                Object objQ4 = sVar.Q();
                if (zH4 || objQ4 == fVar) {
                    objQ4 = new c(yVar, a1Var, 0);
                    sVar.l0(objQ4);
                }
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) objQ4;
                boolean zF = sVar.f(rVar);
                Object objQ5 = sVar.Q();
                if (zF || objQ5 == fVar) {
                    objQ5 = new d(0, rVar);
                    sVar.l0(objQ5);
                }
                kotlin.jvm.functions.q qVar = (kotlin.jvm.functions.q) objQ5;
                boolean zH5 = sVar.h(yVar);
                Object objQ6 = sVar.Q();
                if (zH5 || objQ6 == fVar) {
                    objQ6 = new b(yVar, a1Var, 1);
                    sVar.l0(objQ6);
                }
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) objQ6;
                boolean zH6 = sVar.h(yVar);
                Object objQ7 = sVar.Q();
                if (zH6 || objQ7 == fVar) {
                    objQ7 = new b(yVar, a1Var, 2);
                    sVar.l0(objQ7);
                }
                kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) objQ7;
                boolean zH7 = sVar.h(yVar);
                Object objQ8 = sVar.Q();
                if (zH7 || objQ8 == fVar) {
                    objQ8 = new b(yVar, a1Var, 3);
                    sVar.l0(objQ8);
                }
                com.app.mlounge.ui.screens.search.a.a(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, (kotlin.jvm.functions.l) objQ8, null, sVar, 0);
                return kotlin.y.a;
            case 1:
                androidx.navigation.y yVar2 = (androidx.navigation.y) this.y;
                CoroutineScope coroutineScope = (CoroutineScope) this.z;
                kotlin.jvm.functions.w wVar = (kotlin.jvm.functions.w) this.A;
                androidx.navigation.i iVar = (androidx.navigation.i) obj2;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                iVar.getClass();
                Bundle bundleA = iVar.E.a();
                if (bundleA != null && (string = bundleA.getString("albumUrl")) != null) {
                    y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar2);
                    if (y0VarA == null) {
                        kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    j0 j0Var = (j0) _COROUTINE.b.J(kotlin.jvm.internal.a0.a(j0.class), y0VarA, org.jsoup.helper.n.n(y0VarA, sVar2), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar2);
                    boolean zH8 = sVar2.h(yVar2);
                    Object objQ9 = sVar2.Q();
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                    if (zH8 || objQ9 == fVar2) {
                        objQ9 = new androidx.navigation.k(yVar2, 6);
                        sVar2.l0(objQ9);
                    }
                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ9;
                    boolean zH9 = sVar2.h(coroutineScope) | sVar2.h(j0Var) | sVar2.f(wVar);
                    Object objQ10 = sVar2.Q();
                    if (zH9 || objQ10 == fVar2) {
                        objQ10 = new androidx.compose.animation.core.a(19, coroutineScope, j0Var, wVar);
                        sVar2.l0(objQ10);
                    }
                    com.app.mlounge.ui.screens.music.b.a(string, aVar, (kotlin.jvm.functions.l) objQ10, null, sVar2, 0);
                }
                return kotlin.y.a;
            default:
                kotlin.jvm.functions.p pVar2 = (kotlin.jvm.functions.p) this.y;
                a1 a1Var2 = (a1) this.A;
                w2 w2Var = (w2) this.z;
                int iIntValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= sVar3.d(iIntValue) ? 32 : 16;
                }
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                    Game game = (Game) ((List) w2Var.getValue()).get(iIntValue);
                    String strA = game.a();
                    if (strA == null) {
                        strA = "Unknown";
                    }
                    String strB = game.b();
                    String strD = game.d();
                    String strE0 = strD != null ? kotlin.text.k.e0(4, strD) : null;
                    androidx.compose.ui.graphics.painter.b bVarS = com.google.firebase.b.S(R.drawable.ic_menu_games, sVar3);
                    boolean zF2 = sVar3.f(pVar2) | sVar3.f(a1Var2) | sVar3.f(game);
                    Object objQ11 = sVar3.Q();
                    if (zF2 || objQ11 == androidx.compose.runtime.n.a) {
                        objQ11 = new androidx.compose.foundation.gestures.g(14, pVar2, game, a1Var2);
                        sVar3.l0(objQ11);
                    }
                    com.app.mlounge.ui.components.b0.h(strA, strB, (kotlin.jvm.functions.a) objQ11, null, null, strE0, null, null, bVarS, 0.0f, false, false, 0.0f, null, sVar3, 134217728, 0, 16088);
                } else {
                    sVar3.W();
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ m(androidx.navigation.y yVar, Object obj, Object obj2, int i) {
        this.e = i;
        this.y = yVar;
        this.z = obj;
        this.A = obj2;
    }
}
