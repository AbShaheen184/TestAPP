package com.google.firebase.crashlytics.internal.model;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.SQLException;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.foundation.lazy.grid.h;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.p5;
import androidx.compose.material3.z5;
import androidx.compose.runtime.internal.f;
import androidx.compose.runtime.x2;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.u0;
import com.app.mlounge.ui.screens.tvshows.n;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.y;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {
    public static androidx.compose.ui.graphics.vector.f a;
    public static androidx.compose.ui.graphics.vector.f b;
    public static androidx.compose.ui.graphics.vector.f c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static androidx.compose.ui.graphics.vector.f h;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;

    public static void A(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static final void B(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i2);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final void C(androidx.compose.ui.semantics.s sVar, int i2, androidx.compose.ui.scrollcapture.g gVar) {
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.semantics.s[16]);
        List listI = sVar.i(false, false);
        while (true) {
            bVar.d(bVar.z, listI);
            while (true) {
                int i3 = bVar.z;
                if (i3 == 0) {
                    return;
                }
                androidx.compose.ui.semantics.s sVar2 = (androidx.compose.ui.semantics.s) bVar.k(i3 - 1);
                boolean zE = androidx.compose.ui.semantics.v.e(sVar2);
                androidx.compose.ui.semantics.n nVar = sVar2.d;
                androidx.collection.o0 o0Var = nVar.e;
                if (!zE && !o0Var.c(androidx.compose.ui.semantics.w.i)) {
                    androidx.compose.ui.node.d1 d1VarD = sVar2.d();
                    if (d1VarD == null) {
                        throw androidx.compose.runtime.j.a("Expected semantics node to have a coordinator.");
                    }
                    androidx.compose.ui.unit.k kVarM = androidx.work.impl.v.M(androidx.compose.ui.layout.a0.e(d1VarD, true));
                    if (kVarM.a < kVarM.c && kVarM.b < kVarM.d) {
                        Object objG = nVar.e.g(androidx.compose.ui.semantics.m.e);
                        if (objG == null) {
                            objG = null;
                        }
                        kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) objG;
                        Object objG2 = o0Var.g(androidx.compose.ui.semantics.w.v);
                        androidx.compose.ui.semantics.k kVar = (androidx.compose.ui.semantics.k) (objG2 != null ? objG2 : null);
                        if (pVar == null || kVar == null || ((Number) kVar.b.invoke()).floatValue() <= 0.0f) {
                            listI = sVar2.i(false, false);
                        } else {
                            int i4 = 1 + i2;
                            gVar.invoke(new androidx.compose.ui.scrollcapture.i(sVar2, i4, kVarM, d1VarD));
                            C(sVar2, i4, gVar);
                        }
                    }
                }
            }
        }
    }

    public static int D(int i2) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0100  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void a(kotlin.jvm.functions.a aVar, androidx.compose.ui.window.w wVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i2, int i3) {
        int i4;
        androidx.compose.ui.window.w wVar2;
        int i5;
        boolean z;
        boolean z2;
        androidx.compose.ui.window.w wVar3;
        androidx.compose.runtime.s1 s1VarT;
        View view;
        androidx.compose.ui.unit.c cVar;
        androidx.compose.ui.unit.m mVar;
        androidx.compose.runtime.q qVarU;
        androidx.compose.runtime.a1 a1VarV;
        Object objQ;
        Object obj;
        UUID uuid;
        boolean zF;
        Object objQ2;
        androidx.compose.ui.window.x xVar;
        boolean zH;
        Object objQ3;
        boolean z3;
        boolean zD;
        Object objQ4;
        int i6;
        sVar.c0(826668973);
        if ((i2 & 6) == 0) {
            i4 = (sVar.h(aVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                wVar2 = wVar;
                i4 |= sVar.f(wVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (sVar.h(fVar)) {
                    i6 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i5 = i4;
            z = false;
            if ((i5 & Token.EXPR_VOID) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (sVar.T(i5 & 1, z2)) {
                if (i7 != 0) {
                    wVar3 = new androidx.compose.ui.window.w(7, z, z);
                } else {
                    wVar3 = wVar2;
                }
                view = (View) sVar.j(androidx.compose.ui.platform.m0.f);
                cVar = (androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h);
                mVar = (androidx.compose.ui.unit.m) sVar.j(androidx.compose.ui.platform.l1.n);
                qVarU = androidx.compose.runtime.t.u(sVar);
                a1VarV = androidx.compose.runtime.t.v(fVar, sVar);
                Object[] objArr = new Object[0];
                objQ = sVar.Q();
                obj = androidx.compose.runtime.n.a;
                if (objQ == obj) {
                    objQ = androidx.compose.ui.window.e.z;
                    sVar.l0(objQ);
                }
                uuid = (UUID) androidx.compose.runtime.saveable.l.e(objArr, (kotlin.jvm.functions.a) objQ, sVar);
                zF = sVar.f(view) | sVar.f(cVar);
                objQ2 = sVar.Q();
                if (zF || objQ2 == obj) {
                    androidx.compose.ui.window.x xVar2 = new androidx.compose.ui.window.x(aVar, wVar3, view, mVar, cVar, uuid);
                    androidx.compose.runtime.internal.f fVar2 = new androidx.compose.runtime.internal.f(true, 346960332, new androidx.compose.animation.f(a1VarV, 5));
                    androidx.compose.ui.window.v vVar = xVar2.E;
                    vVar.setParentCompositionContext(qVarU);
                    vVar.G.setValue(fVar2);
                    vVar.K = true;
                    vVar.c();
                    sVar.l0(xVar2);
                    objQ2 = xVar2;
                }
                xVar = (androidx.compose.ui.window.x) objQ2;
                zH = sVar.h(xVar);
                objQ3 = sVar.Q();
                if (zH || objQ3 == obj) {
                    objQ3 = new androidx.compose.ui.window.a(xVar, 0);
                    sVar.l0(objQ3);
                }
                androidx.compose.runtime.l0.b(xVar, (kotlin.jvm.functions.l) objQ3, sVar);
                boolean zH2 = sVar.h(xVar);
                if ((i5 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zD = zH2 | z3 | ((i5 & Token.ASSIGN_MOD) == 32) | sVar.d(mVar.ordinal());
                objQ4 = sVar.Q();
                if (zD || objQ4 == obj) {
                    objQ4 = new androidx.compose.ui.window.b(xVar, aVar, wVar3, mVar);
                    sVar.l0(objQ4);
                }
                androidx.compose.runtime.l0.e((kotlin.jvm.functions.a) objQ4, sVar);
            } else {
                sVar.W();
                wVar3 = wVar2;
            }
            s1VarT = sVar.t();
            if (s1VarT != null) {
                s1VarT.d = new androidx.compose.ui.window.c(aVar, wVar3, fVar, i2, i3);
            }
        }
        i4 |= 48;
        wVar2 = wVar;
        if ((i2 & 384) == 0) {
            if (sVar.h(fVar)) {
                i6 = LibretroCore.SCREEN_WIDTH;
            } else {
                i6 = 128;
            }
            i4 |= i6;
        }
        i5 = i4;
        z = false;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sVar.T(i5 & 1, z2)) {
            if (i7 != 0) {
                wVar3 = new androidx.compose.ui.window.w(7, z, z);
            } else {
                wVar3 = wVar2;
            }
            view = (View) sVar.j(androidx.compose.ui.platform.m0.f);
            cVar = (androidx.compose.ui.unit.c) sVar.j(androidx.compose.ui.platform.l1.h);
            mVar = (androidx.compose.ui.unit.m) sVar.j(androidx.compose.ui.platform.l1.n);
            qVarU = androidx.compose.runtime.t.u(sVar);
            a1VarV = androidx.compose.runtime.t.v(fVar, sVar);
            Object[] objArr2 = new Object[0];
            objQ = sVar.Q();
            obj = androidx.compose.runtime.n.a;
            if (objQ == obj) {
                objQ = androidx.compose.ui.window.e.z;
                sVar.l0(objQ);
            }
            uuid = (UUID) androidx.compose.runtime.saveable.l.e(objArr2, (kotlin.jvm.functions.a) objQ, sVar);
            zF = sVar.f(view) | sVar.f(cVar);
            objQ2 = sVar.Q();
            if (zF) {
                androidx.compose.ui.window.x xVar3 = new androidx.compose.ui.window.x(aVar, wVar3, view, mVar, cVar, uuid);
                androidx.compose.runtime.internal.f fVar3 = new androidx.compose.runtime.internal.f(true, 346960332, new androidx.compose.animation.f(a1VarV, 5));
                androidx.compose.ui.window.v vVar2 = xVar3.E;
                vVar2.setParentCompositionContext(qVarU);
                vVar2.G.setValue(fVar3);
                vVar2.K = true;
                vVar2.c();
                sVar.l0(xVar3);
                objQ2 = xVar3;
            } else {
                androidx.compose.ui.window.x xVar4 = new androidx.compose.ui.window.x(aVar, wVar3, view, mVar, cVar, uuid);
                androidx.compose.runtime.internal.f fVar4 = new androidx.compose.runtime.internal.f(true, 346960332, new androidx.compose.animation.f(a1VarV, 5));
                androidx.compose.ui.window.v vVar3 = xVar4.E;
                vVar3.setParentCompositionContext(qVarU);
                vVar3.G.setValue(fVar4);
                vVar3.K = true;
                vVar3.c();
                sVar.l0(xVar4);
                objQ2 = xVar4;
            }
            xVar = (androidx.compose.ui.window.x) objQ2;
            zH = sVar.h(xVar);
            objQ3 = sVar.Q();
            if (zH) {
                objQ3 = new androidx.compose.ui.window.a(xVar, 0);
                sVar.l0(objQ3);
            } else {
                objQ3 = new androidx.compose.ui.window.a(xVar, 0);
                sVar.l0(objQ3);
            }
            androidx.compose.runtime.l0.b(xVar, (kotlin.jvm.functions.l) objQ3, sVar);
            boolean zH3 = sVar.h(xVar);
            if ((i5 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            zD = zH3 | z3 | ((i5 & Token.ASSIGN_MOD) == 32) | sVar.d(mVar.ordinal());
            objQ4 = sVar.Q();
            if (zD) {
                objQ4 = new androidx.compose.ui.window.b(xVar, aVar, wVar3, mVar);
                sVar.l0(objQ4);
            } else {
                objQ4 = new androidx.compose.ui.window.b(xVar, aVar, wVar3, mVar);
                sVar.l0(objQ4);
            }
            androidx.compose.runtime.l0.e((kotlin.jvm.functions.a) objQ4, sVar);
        } else {
            sVar.W();
            wVar3 = wVar2;
        }
        s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.ui.window.c(aVar, wVar3, fVar, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r18v8, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r5v34, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r71v0, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v37, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r9v38, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r9v39, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r9v43, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r9v44, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v53, types: [androidx.compose.runtime.s] */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final void b(final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.l lVar2, final kotlin.jvm.functions.l lVar3, final kotlin.jvm.functions.l lVar4, final kotlin.jvm.functions.l lVar5, final kotlin.jvm.functions.q qVar, final kotlin.jvm.functions.l lVar6, boolean z, final kotlin.jvm.functions.a aVar, com.app.mlounge.ui.viewmodel.d2 d2Var, androidx.compose.runtime.s sVar, int i2) {
        com.app.mlounge.ui.viewmodel.d2 d2Var2;
        ?? r9;
        com.app.mlounge.ui.viewmodel.d2 d2Var3;
        int i3;
        ?? arrayList;
        ArrayList arrayList2;
        boolean z2;
        ?? r10;
        com.app.mlounge.ui.viewmodel.d2 d2Var4;
        com.app.mlounge.ui.viewmodel.d2 d2Var5;
        boolean z3;
        ?? r11;
        String str;
        String str2;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        sVar.c0(942234431);
        int i4 = i2 | (sVar.h(lVar) ? 4 : 2) | (sVar.h(lVar2) ? 32 : 16) | (sVar.h(lVar3) ? LibretroCore.SCREEN_WIDTH : 128) | (sVar.h(lVar4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (sVar.h(lVar5) ? 16384 : 8192) | (sVar.h(qVar) ? 131072 : Parser.ARGC_LIMIT) | (sVar.h(lVar6) ? 1048576 : 524288) | (sVar.g(z) ? 8388608 : 4194304) | 268435456;
        if (sVar.T(i4 & 1, (i4 & 306783379) != 306783378)) {
            sVar.Y();
            if ((i2 & 1) == 0 || sVar.C()) {
                androidx.lifecycle.y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar);
                if (y0VarA == null) {
                    kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    d2Var3 = (com.app.mlounge.ui.viewmodel.d2) _COROUTINE.b.J(kotlin.jvm.internal.a0.a(com.app.mlounge.ui.viewmodel.d2.class), y0VarA, org.jsoup.helper.n.n(y0VarA, sVar), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar);
                    i3 = i4 & (-1879048193);
                }
            } else {
                sVar.W();
                i3 = i4 & (-1879048193);
                d2Var3 = d2Var;
            }
            sVar.q();
            StateFlow stateFlow = d2Var3.p;
            androidx.compose.runtime.g1 g1Var = d2Var3.j;
            androidx.compose.runtime.a1 a1VarG = androidx.compose.runtime.t.g(stateFlow, sVar);
            final androidx.compose.runtime.a1 a1VarG2 = androidx.compose.runtime.t.g(d2Var3.d, sVar);
            final androidx.compose.runtime.a1 a1VarG3 = androidx.compose.runtime.t.g(d2Var3.e, sVar);
            final androidx.compose.runtime.a1 a1VarG4 = androidx.compose.runtime.t.g(d2Var3.g, sVar);
            final androidx.compose.runtime.a1 a1VarG5 = androidx.compose.runtime.t.g(d2Var3.i, sVar);
            androidx.compose.runtime.a1 a1VarG6 = androidx.compose.runtime.t.g(d2Var3.o, sVar);
            final Context context = (Context) sVar.j(androidx.compose.ui.platform.m0.b);
            androidx.compose.foundation.lazy.grid.x xVarA = androidx.compose.foundation.lazy.grid.z.a(d2Var3.k.g(), d2Var3.l.g(), sVar, 0);
            boolean zF = sVar.f(xVarA) | sVar.h(d2Var3);
            Object objQ = sVar.Q();
            Object obj = androidx.compose.runtime.n.a;
            kotlin.coroutines.d dVar = null;
            if (zF || objQ == obj) {
                objQ = new androidx.room.s(xVarA, d2Var3, dVar, 23);
                sVar.l0(objQ);
            }
            androidx.compose.runtime.l0.c(sVar, xVarA, (kotlin.jvm.functions.p) objQ);
            Object objQ2 = sVar.Q();
            if (objQ2 == obj) {
                objQ2 = new LinkedHashMap();
                sVar.l0(objQ2);
            }
            final Map map = (Map) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == obj) {
                objQ3 = androidx.compose.runtime.t.r(null);
                sVar.l0(objQ3);
            }
            final androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objQ3;
            List listK = z ? kotlin.collections.q.k("All", "Movies", "TV Shows", "Live TV", "Anime", "Music", "Adult") : kotlin.collections.q.k("All", "Movies", "TV Shows", "Live TV", "Anime", "Music");
            if (z) {
                arrayList = (List) a1VarG.getValue();
            } else {
                List list = (List) a1VarG.getValue();
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.f) obj2).b, "adult")) {
                        arrayList.add(obj2);
                    }
                }
            }
            boolean zD = sVar.d(g1Var.g()) | sVar.f(arrayList) | ((29360128 & i3) == 8388608);
            Object objQ4 = sVar.Q();
            ?? r12 = objQ4;
            if (zD || objQ4 == obj) {
                ?? r6 = arrayList;
                r6 = arrayList;
                switch (g1Var.g()) {
                    case 1:
                        arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.f) obj3).b, "movie")) {
                                arrayList2.add(obj3);
                            }
                        }
                        r6 = arrayList2;
                        break;
                    case 2:
                        arrayList2 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.f) obj4).b, "tv")) {
                                arrayList2.add(obj4);
                            }
                        }
                        r6 = arrayList2;
                        break;
                    case 3:
                        arrayList2 = new ArrayList();
                        for (Object obj5 : arrayList) {
                            if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.f) obj5).b, "live_tv")) {
                                arrayList2.add(obj5);
                            }
                        }
                        r6 = arrayList2;
                        break;
                    case 4:
                        arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Iterator it2 = it;
                            if (kotlin.text.r.u(((com.app.mlounge.data.local.entity.f) next).b, "anime", false)) {
                                arrayList2.add(next);
                            }
                            it = it2;
                        }
                        r6 = arrayList2;
                        break;
                    case 5:
                        arrayList2 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            Iterator it4 = it3;
                            if (kotlin.text.r.u(((com.app.mlounge.data.local.entity.f) next2).b, "music", false)) {
                                arrayList2.add(next2);
                            }
                            it3 = it4;
                        }
                        r6 = arrayList2;
                        break;
                    case 6:
                        if (z) {
                            arrayList2 = new ArrayList();
                            for (Object obj6 : arrayList) {
                                if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.f) obj6).b, "adult")) {
                                    arrayList2.add(obj6);
                                }
                            }
                            r6 = arrayList2;
                        }
                        break;
                }
                sVar.l0(r6);
                r12 = r6;
            }
            final List list2 = (List) r12;
            boolean zH = sVar.h(map);
            Object objQ5 = sVar.Q();
            if (zH || objQ5 == obj) {
                objQ5 = new com.app.mlounge.ui.screens.history.c(map, a1Var, null, 1);
                sVar.l0(objQ5);
            }
            androidx.compose.runtime.l0.c(sVar, list2, (kotlin.jvm.functions.p) objQ5);
            androidx.compose.foundation.layout.e0 e0Var = androidx.compose.foundation.layout.i1.c;
            androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
            List list3 = listK;
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, e0Var);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
            androidx.compose.runtime.t.x(sVar, wVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
            androidx.compose.runtime.t.x(sVar, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
            androidx.compose.runtime.t.p(sVar, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
            androidx.compose.runtime.t.t(sVar, dVar2);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
            androidx.compose.runtime.t.x(sVar, rVarC, eVar4);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 16;
            int i5 = i3;
            androidx.compose.ui.r rVarT = androidx.compose.foundation.layout.b.t(androidx.compose.foundation.layout.i1.e(oVar, 1.0f), f2, f2, f2, 4);
            androidx.compose.foundation.layout.d dVar3 = androidx.compose.foundation.layout.h.e;
            androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
            androidx.compose.foundation.layout.f1 f1VarA = androidx.compose.foundation.layout.d1.a(dVar3, iVar, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL2 = sVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar, rVarT);
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, f1VarA, eVar);
            androidx.compose.runtime.t.x(sVar, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar, eVar3, sVar, dVar2);
            androidx.compose.runtime.t.x(sVar, rVarC2, eVar4);
            x2 x2Var = n6.a;
            com.app.mlounge.ui.viewmodel.d2 d2Var6 = d2Var3;
            Object obj7 = obj;
            z5.b("My Favourites", null, com.app.mlounge.ui.theme.b.k, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar.j(x2Var)).e, sVar, 390, 0, 131066);
            ?? r13 = sVar;
            if (((List) a1VarG.getValue()).isEmpty()) {
                z2 = false;
                r13.b0(1669433181);
                r13.p(false);
                r10 = r13;
            } else {
                r13.b0(1669235742);
                z5.b(androidx.compose.runtime.j.d(((List) a1VarG.getValue()).size(), " items"), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) r13.j(x2Var)).k, sVar, 384, 0, 131066);
                ?? r14 = sVar;
                z2 = false;
                r14.p(false);
                r10 = r14;
            }
            r10.p(true);
            float f3 = 8;
            androidx.compose.foundation.layout.b.e(r10, androidx.compose.foundation.layout.i1.g(oVar, f3));
            float f4 = 12;
            androidx.compose.ui.r rVarU = androidx.compose.foundation.layout.b.u(androidx.compose.foundation.s.q(androidx.compose.foundation.layout.i1.e(oVar, 1.0f), androidx.compose.foundation.s.p(r10), z2), f4, 0.0f, f4, f3, 2);
            androidx.compose.foundation.layout.f1 f1VarA2 = androidx.compose.foundation.layout.d1.a(androidx.compose.foundation.layout.h.g(f3), iVar, r10, 54);
            int iHashCode3 = Long.hashCode(r10.T);
            androidx.compose.runtime.internal.j jVarL3 = r10.l();
            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(r10, rVarU);
            r10.e0();
            if (r10.S) {
                r10.k(fVar);
            } else {
                r10.o0();
            }
            androidx.compose.runtime.t.x(r10, f1VarA2, eVar);
            androidx.compose.runtime.t.x(r10, jVarL3, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, r10, eVar3, r10, dVar2);
            androidx.compose.runtime.t.x(r10, rVarC3, eVar4);
            r10.b0(497347839);
            int i6 = 0;
            ?? r15 = r10;
            for (Object obj8 : list3) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    kotlin.collections.q.o();
                    throw null;
                }
                String str3 = (String) obj8;
                Object objQ6 = r15.Q();
                Object obj9 = obj7;
                if (objQ6 == obj9) {
                    objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.i(r15);
                }
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ6;
                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f3)), 2, ((Boolean) _COROUTINE.a.B(kVar, r15, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f3));
                com.app.mlounge.ui.viewmodel.d2 d2Var7 = d2Var6;
                boolean zH2 = r15.h(d2Var7) | r15.d(i6);
                Object objQ7 = r15.Q();
                if (zH2 || objQ7 == obj9) {
                    objQ7 = new androidx.compose.foundation.text.selection.b0(d2Var7, i6, 3);
                    r15.l0(objQ7);
                }
                ?? r18 = r15;
                p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ7, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f3), g1Var.g() == i6 ? androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-253074515, new androidx.compose.animation.core.v1(d2Var7, i6, str3, 13), r15), r18, 12582912, 120);
                f4 = f4;
                d2Var6 = d2Var7;
                obj7 = obj9;
                r15 = r18;
                i6 = i7;
            }
            float f5 = f4;
            com.app.mlounge.ui.viewmodel.d2 d2Var8 = d2Var6;
            Object obj10 = obj7;
            r15.p(false);
            com.app.mlounge.ui.viewmodel.c2 c2Var = (com.app.mlounge.ui.viewmodel.c2) a1VarG6.getValue();
            boolean zH3 = r15.h(d2Var8);
            Object objQ8 = r15.Q();
            if (zH3 || objQ8 == obj10) {
                objQ8 = new androidx.compose.foundation.c(1, d2Var8, com.app.mlounge.ui.viewmodel.d2.class, "setSortBy", "setSortBy(Lcom/app/mlounge/ui/viewmodel/WatchlistSortOption;)V", 0, 26);
                d2Var4 = d2Var8;
                r15.l0(objQ8);
            } else {
                d2Var4 = d2Var8;
            }
            c(c2Var, (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ8), r15, 0);
            r15.p(true);
            if (list2.isEmpty()) {
                r15.b0(796582648);
                androidx.compose.foundation.layout.e0 e0Var2 = androidx.compose.foundation.layout.i1.c;
                androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                int iHashCode4 = Long.hashCode(r15.T);
                androidx.compose.runtime.internal.j jVarL4 = r15.l();
                androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(r15, e0Var2);
                androidx.compose.ui.node.h.b.getClass();
                androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
                r15.e0();
                if (r15.S) {
                    r15.k(fVar2);
                } else {
                    r15.o0();
                }
                androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.g.f;
                androidx.compose.runtime.t.x(r15, q0VarD, eVar5);
                androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.g.e;
                androidx.compose.runtime.t.x(r15, jVarL4, eVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.g.g;
                androidx.compose.runtime.t.p(r15, numValueOf2, eVar7);
                androidx.compose.ui.node.d dVar4 = androidx.compose.ui.node.g.h;
                androidx.compose.runtime.t.t(r15, dVar4);
                androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.g.d;
                androidx.compose.runtime.t.x(r15, rVarC4, eVar8);
                androidx.compose.foundation.layout.w wVarA2 = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, r15, 48);
                int iHashCode5 = Long.hashCode(r15.T);
                androidx.compose.runtime.internal.j jVarL5 = r15.l();
                androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(r15, oVar);
                r15.e0();
                if (r15.S) {
                    r15.k(fVar2);
                } else {
                    r15.o0();
                }
                androidx.compose.runtime.t.x(r15, wVarA2, eVar5);
                androidx.compose.runtime.t.x(r15, jVarL5, eVar6);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, r15, eVar7, r15, dVar4);
                androidx.compose.runtime.t.x(r15, rVarC5, eVar8);
                androidx.compose.ui.graphics.vector.f fVarL = okhttp3.internal.platform.android.g.l();
                long j2 = com.app.mlounge.ui.theme.b.m;
                ?? r5 = r15;
                androidx.compose.material3.q1.b(fVarL, null, androidx.compose.foundation.layout.i1.m(oVar, 64), j2, r5, 3504, 0);
                androidx.compose.foundation.layout.b.e(r5, androidx.compose.foundation.layout.i1.g(oVar, f2));
                if (g1Var.g() == 0) {
                    str = "Your favourites is empty";
                } else {
                    String lowerCase = ((String) list3.get(g1Var.g())).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    str = "No " + lowerCase + " in your favourites";
                }
                x2 x2Var2 = n6.a;
                z5.b(str, null, com.app.mlounge.ui.theme.b.k, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) r5.j(x2Var2)).g, r5, 384, 0, 131066);
                androidx.compose.foundation.layout.b.e(r5, androidx.compose.foundation.layout.i1.g(oVar, f3));
                if (g1Var.g() == 0) {
                    str2 = "Add movies and TV shows to your favourites\nfrom their detail pages";
                } else {
                    String lowerCase2 = ((String) list3.get(g1Var.g())).toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    str2 = "Add " + lowerCase2 + " to your favourites\nfrom their detail pages";
                }
                z5.b(str2, null, j2, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((m6) r5.j(x2Var2)).k, r5, 384, 0, 130042);
                androidx.room.b0.g(r5, true, true, false);
                z3 = true;
                r11 = r5;
                d2Var5 = d2Var4;
            } else {
                ?? r3 = r15;
                r3.b0(798233212);
                androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) r3.j(com.app.mlounge.ui.theme.g.a)).y);
                androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f3);
                androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f3);
                androidx.compose.foundation.layout.z0 z0Var = new androidx.compose.foundation.layout.z0(f5, f5, f5, f5);
                androidx.compose.foundation.layout.e0 e0Var3 = androidx.compose.foundation.layout.i1.c;
                boolean zH4 = ((i5 & 14) == 4) | r3.h(list2) | r3.h(map) | r3.f(a1VarG2) | r3.f(a1VarG3) | r3.f(a1VarG4) | r3.f(a1VarG5) | ((i5 & Token.ASSIGN_MOD) == 32) | ((i5 & 458752) == 131072) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | ((57344 & i5) == 16384) | ((3670016 & i5) == 1048576) | r3.h(d2Var4) | r3.h(context);
                Object objQ9 = r3.Q();
                if (zH4 || objQ9 == obj10) {
                    final com.app.mlounge.ui.viewmodel.d2 d2Var9 = d2Var4;
                    kotlin.jvm.functions.l lVar7 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.watchlist.a
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj11) {
                            h hVar = (h) obj11;
                            hVar.getClass();
                            com.app.mlounge.ui.screens.sources.b bVar = new com.app.mlounge.ui.screens.sources.b(5);
                            List list4 = list2;
                            hVar.q(list4.size(), new n(bVar, list4, 4), new u0(26, list4), new f(true, -1942245546, new c(list4, map, lVar, lVar2, qVar, lVar3, lVar4, lVar5, lVar6, list4, aVar, d2Var9, context, a1VarG2, a1VarG3, a1VarG4, a1VarG5, a1Var)));
                            return y.a;
                        }
                    };
                    d2Var5 = d2Var9;
                    r3.l0(lVar7);
                    objQ9 = lVar7;
                } else {
                    d2Var5 = d2Var4;
                }
                androidx.work.impl.v.b(aVar2, e0Var3, null, z0Var, fVarG2, fVarG, null, false, null, (kotlin.jvm.functions.l) objQ9, r3, 1772592, 916);
                ?? r16 = r3;
                r16.p(false);
                z3 = true;
                r11 = r16;
            }
            r11.p(z3);
            d2Var2 = d2Var5;
            r9 = r11;
        } else {
            ?? r17 = sVar;
            r17.W();
            d2Var2 = d2Var;
            r9 = r17;
        }
        androidx.compose.runtime.s1 s1VarT = r9.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.components.n(lVar, lVar2, lVar3, lVar4, lVar5, qVar, lVar6, z, aVar, d2Var2, i2);
        }
    }

    public static final void c(com.app.mlounge.ui.viewmodel.c2 c2Var, kotlin.jvm.functions.l lVar, androidx.compose.runtime.s sVar, int i2) {
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.c0(-1330068317);
        int i3 = i2 | (sVar2.d(c2Var.ordinal()) ? 4 : 2) | (sVar2.h(lVar) ? 32 : 16);
        if (sVar2.T(i3 & 1, (i3 & 19) != 18)) {
            Object objQ = sVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.t.r(Boolean.FALSE);
                sVar2.l0(objQ);
            }
            androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == fVar) {
                objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ2;
            androidx.compose.runtime.a1 a1VarB = _COROUTINE.a.B(kVar, sVar2, 6);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.internal.j jVarL = sVar2.l();
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar2, oVar);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar2 = androidx.compose.ui.node.g.b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.o0();
            }
            androidx.compose.runtime.t.x(sVar2, q0VarD, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar2, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar2, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar2, rVarC, androidx.compose.ui.node.g.d);
            float f2 = 8;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2)), 2, ((Boolean) a1VarB.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
            Object objQ3 = sVar2.Q();
            if (objQ3 == fVar) {
                objQ3 = new com.app.mlounge.ui.screens.settings.q(a1Var, 20);
                sVar2.l0(objQ3);
            }
            p5.a(androidx.compose.foundation.s.n(androidx.compose.foundation.s.j(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f2), androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(128661252, new androidx.compose.animation.core.g0(c2Var, 28), sVar2), sVar2, 12583296, 120);
            boolean zBooleanValue = ((Boolean) a1Var.getValue()).booleanValue();
            Object objQ4 = sVar2.Q();
            if (objQ4 == fVar) {
                objQ4 = new com.app.mlounge.ui.screens.settings.q(a1Var, 21);
                sVar2.l0(objQ4);
            }
            androidx.compose.ui.r rVarI = androidx.compose.foundation.layout.i1.i(androidx.compose.foundation.s.f(oVar, com.app.mlounge.ui.theme.b.b, androidx.compose.ui.graphics.a0.b), 0.0f, 300, 1);
            androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-494387570, new com.app.mlounge.ui.components.e0(8, lVar, c2Var, a1Var), sVar2);
            sVar2 = sVar;
            androidx.compose.material3.p.a(zBooleanValue, (kotlin.jvm.functions.a) objQ4, rVarI, 0L, null, null, null, 0L, 0.0f, 0.0f, fVarC, sVar2, 432, 2040);
            sVar2.p(true);
        } else {
            sVar2.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar2.t();
        if (s1VarT != null) {
            s1VarT.d = new com.app.mlounge.ui.screens.tvshows.r(c2Var, lVar, i2);
        }
    }

    public static final void d(androidx.compose.ui.r rVar, kotlin.jvm.functions.p pVar, androidx.compose.runtime.s sVar, int i2) {
        int i3;
        sVar.c0(1090521195);
        if ((i2 & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.h(pVar) ? 32 : 16;
        }
        if (sVar.T(i3 & 1, (i3 & 19) != 18)) {
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.compose.ui.window.f.b;
                sVar.l0(objQ);
            }
            androidx.compose.ui.layout.q0 q0Var = (androidx.compose.ui.layout.q0) objQ;
            int i4 = ((i3 << 3) & Token.ASSIGN_MOD) | ((i3 >> 3) & 14) | 384;
            int iHashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.internal.j jVarL = sVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar, rVar);
            androidx.compose.ui.node.h.b.getClass();
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
            int i5 = ((i4 << 6) & 896) | 6;
            sVar.e0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.o0();
            }
            androidx.compose.runtime.t.x(sVar, q0Var, androidx.compose.ui.node.g.f);
            androidx.compose.runtime.t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
            androidx.compose.runtime.t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
            androidx.compose.runtime.t.t(sVar, androidx.compose.ui.node.g.h);
            androidx.compose.runtime.t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
            pVar.invoke(sVar, Integer.valueOf((i5 >> 6) & 14));
            sVar.p(true);
        } else {
            sVar.W();
        }
        androidx.compose.runtime.s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new androidx.compose.ui.window.g(rVar, pVar, i2);
        }
    }

    public static final boolean e(androidx.compose.ui.draganddrop.g gVar, long j2) {
        if (!gVar.e.K) {
            return false;
        }
        androidx.compose.ui.node.s sVar = (androidx.compose.ui.node.s) androidx.compose.ui.node.l.v(gVar).d0.d;
        if (!sVar.o0.K) {
            return false;
        }
        long jX = sVar.X(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jX >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jX & 4294967295L));
        long j3 = gVar.N;
        float f2 = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0064->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0081 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0084 -> B:25:0x0064). Please report as a decompilation issue!!! */
    public static final Object f(List list, androidx.datastore.core.i iVar, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        androidx.datastore.core.d dVar;
        List list2;
        kotlin.jvm.internal.z zVar;
        Iterator it;
        Throwable th;
        kotlin.jvm.functions.l lVar;
        if (cVar instanceof androidx.datastore.core.d) {
            dVar = (androidx.datastore.core.d) cVar;
            int i2 = dVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.A = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new androidx.datastore.core.d(cVar);
            }
        } else {
            dVar = new androidx.datastore.core.d(cVar);
        }
        Object obj = dVar.z;
        int i3 = dVar.A;
        Object obj2 = kotlin.coroutines.intrinsics.a.e;
        if (i3 != 0) {
            if (i3 == 1) {
                list2 = (List) dVar.e;
                kotlin.a.e(obj);
            } else {
                if (i3 != 2) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = dVar.y;
                zVar = (kotlin.jvm.internal.z) dVar.e;
                try {
                    kotlin.a.e(obj);
                } catch (Throwable th2) {
                    Object obj3 = zVar.e;
                    if (obj3 == null) {
                        zVar.e = th2;
                    } else {
                        kotlin.a.a((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                lVar = (kotlin.jvm.functions.l) it.next();
                dVar.e = zVar;
                dVar.y = it;
                dVar.A = 2;
                if (lVar.invoke(dVar) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) zVar.e;
            if (th == null) {
                return kotlin.y.a;
            }
            throw th;
        }
        kotlin.a.e(obj);
        ArrayList arrayList = new ArrayList();
        androidx.compose.animation.core.g gVar = new androidx.compose.animation.core.g(list, arrayList, null);
        dVar.e = arrayList;
        dVar.A = 1;
        if (iVar.a(gVar, dVar) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        zVar = new kotlin.jvm.internal.z();
        it = list2.iterator();
        while (it.hasNext()) {
            lVar = (kotlin.jvm.functions.l) it.next();
            dVar.e = zVar;
            dVar.y = it;
            dVar.A = 2;
            if (lVar.invoke(dVar) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) zVar.e;
        if (th == null) {
            return kotlin.y.a;
        }
        throw th;
    }

    public static void g(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:22:0x0066->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[EDGE_INSN: B:31:0x004e->B:18:0x004e BREAK  A[LOOP:0: B:22:0x0066->B:26:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.k0 r7, androidx.compose.ui.input.pointer.n r8, kotlin.coroutines.jvm.internal.a r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.r0
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.r0 r0 = (androidx.compose.foundation.gestures.r0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.r0 r0 = new androidx.compose.foundation.gestures.r0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.z
            int r1 = r0.A
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            androidx.compose.ui.input.pointer.n r7 = r0.y
            androidx.compose.ui.input.pointer.k0 r8 = r0.e
            kotlin.a.e(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r7)
            r7 = 0
            return r7
        L34:
            kotlin.a.e(r9)
            androidx.compose.ui.input.pointer.l0 r9 = r7.C
            androidx.compose.ui.input.pointer.m r9 = r9.P
            java.lang.Object r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.v r5 = (androidx.compose.ui.input.pointer.v) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L76
        L4e:
            r0.e = r7
            r0.y = r8
            r0.A = r3
            java.lang.Object r9 = r7.b(r8, r0)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r9 != r1) goto L5d
            return r1
        L5d:
            androidx.compose.ui.input.pointer.m r9 = (androidx.compose.ui.input.pointer.m) r9
            java.lang.Object r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.v r5 = (androidx.compose.ui.input.pointer.v) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            kotlin.y r7 = kotlin.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.t1.h(androidx.compose.ui.input.pointer.k0, androidx.compose.ui.input.pointer.n, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    public static final Object i(androidx.compose.ui.input.pointer.y yVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        Object objM0 = ((androidx.compose.ui.input.pointer.l0) yVar).M0(new androidx.compose.foundation.gestures.s0(dVar.getContext(), pVar, (kotlin.coroutines.d) null), dVar);
        return objM0 == kotlin.coroutines.intrinsics.a.e ? objM0 : kotlin.y.a;
    }

    public static androidx.media3.datasource.l j(androidx.media3.exoplayer.dash.manifest.m mVar, String str, androidx.media3.exoplayer.dash.manifest.j jVar, int i2) {
        Map map = Collections.EMPTY_MAP;
        Uri uriR = androidx.media3.common.util.b.r(str, jVar.c);
        long j2 = jVar.a;
        long j3 = jVar.b;
        String strB = mVar.b();
        if (strB == null) {
            strB = androidx.media3.common.util.b.r(((androidx.media3.exoplayer.dash.manifest.b) mVar.y.get(0)).a, jVar.c).toString();
        }
        String str2 = strB;
        _COROUTINE.a.v(uriR, "The uri must be set.");
        return new androidx.media3.datasource.l(uriR, 0L, 1, null, com.google.common.collect.f1.D, j2, j3, str2, i2);
    }

    public static void k(String str, boolean z) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.q(str);
    }

    public static void l(int i2) {
        if (i2 >= 0) {
            return;
        }
        kotlinx.coroutines.future.a.r();
    }

    public static void m(String str, long j2) {
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j2 + ") must be >= 0");
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        com.google.firebase.platforminfo.b.h(str);
    }

    public static void o(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void p(androidx.navigation.w wVar, String str, List list, androidx.compose.runtime.internal.f fVar, int i2) {
        if ((i2 & 2) != 0) {
            list = kotlin.collections.w.e;
        }
        androidx.navigation.l0 l0Var = wVar.f;
        l0Var.getClass();
        androidx.navigation.compose.j jVar = new androidx.navigation.compose.j((androidx.navigation.compose.i) l0Var.b(androidx.navigation.f.d(androidx.navigation.compose.i.class)), str, fVar);
        for (androidx.navigation.e eVar : list) {
            ((LinkedHashMap) jVar.c).put(eVar.a, eVar.b);
        }
        wVar.h.add(jVar.a());
    }

    public static ImageView.ScaleType q(int i2) {
        if (i2 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i2 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i2 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i2 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i2 != 5) {
            return i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static final long r() {
        return Thread.currentThread().getId();
    }

    public static String s(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void t(androidx.sqlite.a aVar, String str) {
        aVar.getClass();
        androidx.sqlite.c cVarU = aVar.U(str);
        try {
            cVarU.Q();
            kotlin.collections.q.e(cVarU, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.collections.q.e(cVarU, th);
                throw th2;
            }
        }
    }

    public static final long u(long j2, boolean z, int i2, float f2) {
        int iH = ((z || i2 == 2 || i2 == 4 || i2 == 5) && androidx.compose.ui.unit.a.d(j2)) ? androidx.compose.ui.unit.a.h(j2) : Integer.MAX_VALUE;
        if (androidx.compose.ui.unit.a.j(j2) != iH) {
            iH = kotlin.collections.i0.d(androidx.compose.foundation.text.n0.j(f2), androidx.compose.ui.unit.a.j(j2), iH);
        }
        return _COROUTINE.a.J(0, iH, 0, androidx.compose.ui.unit.a.g(j2));
    }

    public static final androidx.compose.ui.graphics.vector.f v() {
        androidx.compose.ui.graphics.vector.f fVar = a;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(19.0f, 13.0f);
        gVar.s(-6.0f);
        gVar.A(6.0f);
        gVar.s(-2.0f);
        gVar.A(-6.0f);
        gVar.r(5.0f);
        gVar.A(-2.0f);
        gVar.s(6.0f);
        gVar.z(5.0f);
        gVar.s(2.0f);
        gVar.A(6.0f);
        gVar.s(6.0f);
        gVar.A(2.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        a = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f w() {
        androidx.compose.ui.graphics.vector.f fVar = b;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.v(19.0f, 6.41f);
        gVar.t(17.59f, 5.0f);
        gVar.t(12.0f, 10.59f);
        gVar.t(6.41f, 5.0f);
        gVar.t(5.0f, 6.41f);
        gVar.t(10.59f, 12.0f);
        gVar.t(5.0f, 17.59f);
        gVar.t(6.41f, 19.0f);
        gVar.t(12.0f, 13.41f);
        gVar.t(17.59f, 19.0f);
        gVar.t(19.0f, 17.59f);
        gVar.t(13.41f, 12.0f);
        gVar.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        b = fVarB;
        return fVarB;
    }

    public static Set x() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final androidx.compose.ui.graphics.vector.f y() {
        androidx.compose.ui.graphics.vector.f fVar = f;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(19.14f, 12.94f);
        gVarJ.n(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        gVarJ.n(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        gVarJ.u(2.03f, -1.58f);
        gVarJ.n(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        gVarJ.u(-1.92f, -3.32f);
        gVarJ.n(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        gVarJ.u(-2.39f, 0.96f);
        gVarJ.n(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        gVarJ.t(14.4f, 2.81f);
        gVarJ.n(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        gVarJ.s(-3.84f);
        gVarJ.n(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        gVarJ.t(9.25f, 5.35f);
        gVarJ.m(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        gVarJ.t(5.24f, 5.33f);
        gVarJ.n(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        gVarJ.t(2.74f, 8.87f);
        gVarJ.m(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        gVarJ.u(2.03f, 1.58f);
        gVarJ.m(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        gVarJ.x(0.02f, 0.64f, 0.07f, 0.94f);
        gVarJ.u(-2.03f, 1.58f);
        gVarJ.n(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        gVarJ.u(1.92f, 3.32f);
        gVarJ.n(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        gVarJ.u(2.39f, -0.96f);
        gVarJ.n(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        gVarJ.u(0.36f, 2.54f);
        gVarJ.n(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        gVarJ.s(3.84f);
        gVarJ.n(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        gVarJ.u(0.36f, -2.54f);
        gVarJ.n(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        gVarJ.u(2.39f, 0.96f);
        gVarJ.n(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        gVarJ.u(1.92f, -3.32f);
        gVarJ.n(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        gVarJ.t(19.14f, 12.94f);
        gVarJ.l();
        gVarJ.v(12.0f, 15.6f);
        gVarJ.n(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        gVarJ.x(1.62f, -3.6f, 3.6f, -3.6f);
        gVarJ.x(3.6f, 1.62f, 3.6f, 3.6f);
        gVarJ.w(13.98f, 15.6f, 12.0f, 15.6f);
        gVarJ.l();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        f = fVarB;
        return fVarB;
    }

    public static void z(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }
}
