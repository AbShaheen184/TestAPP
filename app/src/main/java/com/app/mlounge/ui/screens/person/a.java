package com.app.mlounge.ui.screens.person;

import androidx.compose.animation.core.c1;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.z0;
import androidx.compose.material3.d;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.internal.f;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t;
import androidx.lifecycle.j;
import androidx.lifecycle.y0;
import androidx.navigation.compose.q;
import androidx.work.impl.v;
import com.app.mlounge.data.remote.model.TmdbMultiResult;
import com.app.mlounge.data.remote.model.TmdbPersonDetail;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.theme.g;
import com.app.mlounge.ui.viewmodel.k0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.helper.n;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final f a = new f(false, 626004942, new com.app.mlounge.ui.screens.music.a(2));

    public static final void a(int i, kotlin.jvm.functions.a aVar, l lVar, l lVar2, k0 k0Var, s sVar, int i2) {
        k0 k0Var2;
        int i3;
        k0 k0Var3;
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        sVar.c0(208632801);
        int i4 = i2 | (sVar.d(i) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | (sVar.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(lVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | 8192;
        if (sVar.T(i4 & 1, (i4 & 9363) != 9362)) {
            sVar.Y();
            if ((i2 & 1) == 0 || sVar.C()) {
                y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    k0 k0Var4 = (k0) _COROUTINE.b.J(a0.a(k0.class), y0VarA, n.n(y0VarA, sVar), y0VarA instanceof j ? ((j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar);
                    i3 = i4 & (-57345);
                    k0Var3 = k0Var4;
                }
            } else {
                sVar.W();
                i3 = i4 & (-57345);
                k0Var3 = k0Var;
            }
            sVar.q();
            a1 a1VarG = t.g(k0Var3.d, sVar);
            a1 a1VarG2 = t.g(k0Var3.f, sVar);
            a1 a1VarG3 = t.g(k0Var3.h, sVar);
            a1 a1VarG4 = t.g(k0Var3.j, sVar);
            Integer numValueOf = Integer.valueOf(i);
            int i5 = i3 & 14;
            boolean zH = sVar.h(k0Var3) | (i5 == 4);
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            if (zH || objQ == obj) {
                objQ = new c1(k0Var3, i, null, 23);
                sVar.l0(objQ);
            }
            l0.c(sVar, numValueOf, (p) objQ);
            if (((Boolean) a1VarG3.getValue()).booleanValue()) {
                sVar.b0(-1367325357);
                b0.n(null, sVar, 0);
                sVar.p(false);
            } else if (((String) a1VarG4.getValue()) != null) {
                sVar.b0(-1367323890);
                String str = (String) a1VarG4.getValue();
                str.getClass();
                boolean zH2 = sVar.h(k0Var3) | (i5 == 4);
                Object objQ2 = sVar.Q();
                if (zH2 || objQ2 == obj) {
                    objQ2 = new androidx.compose.foundation.text.selection.b0(k0Var3, i, 2);
                    sVar.l0(objQ2);
                }
                b0.i(str, null, (kotlin.jvm.functions.a) objQ2, sVar, 0);
                sVar.p(false);
            } else {
                if (((TmdbPersonDetail) a1VarG.getValue()) == null) {
                    sVar.b0(-1367320621);
                    b0.n(null, sVar, 0);
                    sVar.p(false);
                } else {
                    sVar.b0(562907466);
                    TmdbPersonDetail tmdbPersonDetail = (TmdbPersonDetail) a1VarG.getValue();
                    tmdbPersonDetail.getClass();
                    List list = (List) a1VarG2.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (kotlin.jvm.internal.l.a(((TmdbMultiResult) obj2).c(), "movie")) {
                            arrayList.add(obj2);
                        }
                    }
                    List list2 = (List) a1VarG2.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (kotlin.jvm.internal.l.a(((TmdbMultiResult) obj3).c(), "tv")) {
                            arrayList2.add(obj3);
                        }
                    }
                    androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) sVar.j(g.a)).y);
                    float f = 12;
                    z0 z0Var = new z0(f, f, f, f);
                    float f2 = 8;
                    androidx.compose.foundation.layout.f fVarG = h.g(f2);
                    androidx.compose.foundation.layout.f fVarG2 = h.g(f2);
                    boolean zF = ((i3 & 896) == 256) | ((i3 & Token.ASSIGN_MOD) == 32) | sVar.f(tmdbPersonDetail) | sVar.f(a1VarG2) | sVar.h(arrayList) | sVar.h(arrayList2) | ((i3 & 7168) == 2048);
                    Object objQ3 = sVar.Q();
                    if (zF || objQ3 == obj) {
                        objQ3 = new q(arrayList, arrayList2, tmdbPersonDetail, aVar, a1VarG2, lVar, lVar2);
                        sVar.l0(objQ3);
                    }
                    v.b(aVar2, null, null, z0Var, fVarG2, fVarG, null, false, null, (l) objQ3, sVar, 1772544, 918);
                    sVar.p(false);
                }
                k0Var2 = k0Var3;
            }
            k0Var2 = k0Var3;
        } else {
            sVar.W();
            k0Var2 = k0Var;
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new d(i, aVar, lVar, lVar2, k0Var2, i2);
        }
    }
}
