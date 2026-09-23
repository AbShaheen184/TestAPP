package com.app.mlounge.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.t0;
import androidx.compose.material3.u0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.s2;
import androidx.compose.runtime.w2;
import androidx.compose.runtime.x2;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.platform.m0;
import androidx.core.content.FileProvider;
import androidx.lifecycle.y0;
import androidx.navigation.k0;
import com.app.mlounge.data.anime.AnimeSubtitleStore;
import com.app.mlounge.data.remote.model.HiAnimeTrack;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.viewmodel.p1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {
    /* JADX WARN: Code duplicated, block: B:140:0x0448  */
    /* JADX WARN: Code duplicated, block: B:144:0x046c  */
    /* JADX WARN: Code duplicated, block: B:147:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:152:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:155:0x0522  */
    /* JADX WARN: Code duplicated, block: B:156:0x0526  */
    /* JADX WARN: Code duplicated, block: B:161:0x057a  */
    /* JADX WARN: Code duplicated, block: B:163:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:164:0x05a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:170:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:171:0x05da  */
    /* JADX WARN: Code duplicated, block: B:174:0x0630  */
    /* JADX WARN: Code duplicated, block: B:177:0x0637  */
    /* JADX WARN: Code duplicated, block: B:178:0x0639  */
    /* JADX WARN: Code duplicated, block: B:182:0x0676 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x0696  */
    /* JADX WARN: Code duplicated, block: B:188:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:190:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:192:0x070c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0724  */
    /* JADX WARN: Code duplicated, block: B:197:0x0738  */
    /* JADX WARN: Code duplicated, block: B:199:0x0750  */
    public static final void a(androidx.compose.ui.r rVar, androidx.compose.runtime.s sVar, int i) {
        Object next;
        boolean z;
        List list;
        a1 a1Var;
        String str;
        String str2;
        androidx.navigation.y yVar;
        final a1 a1Var2;
        a1 a1Var3;
        Context context;
        androidx.navigation.y yVar2;
        final kotlin.jvm.functions.w wVar;
        a1 a1Var4;
        Object obj;
        final kotlin.jvm.functions.s sVar2;
        final a1 a1Var5;
        CoroutineScope coroutineScope;
        androidx.navigation.y yVar3;
        a1 a1Var6;
        CoroutineScope coroutineScope2;
        boolean z2;
        Context context2;
        Object objQ;
        boolean zBooleanValue;
        boolean zH;
        Object objQ2;
        kotlin.jvm.functions.l lVar;
        androidx.compose.foundation.layout.e0 e0Var;
        androidx.navigation.y yVar4;
        String str3;
        androidx.compose.ui.node.f fVar;
        androidx.compose.ui.node.e eVar;
        double d;
        androidx.compose.ui.node.e eVar2;
        kotlin.jvm.functions.l lVar2;
        String str4;
        androidx.compose.ui.node.f fVar2;
        androidx.compose.ui.focus.y yVar5;
        androidx.compose.ui.focus.y yVar6;
        androidx.compose.ui.r t0Var;
        boolean zH2;
        Object objQ3;
        androidx.compose.runtime.f fVar3;
        androidx.navigation.y yVar7;
        boolean z3;
        boolean z4;
        Object objQ4;
        Object objQ5;
        androidx.navigation.t tVar;
        androidx.compose.runtime.s sVar3 = sVar;
        sVar3.c0(-1832585396);
        if (sVar3.T(i & 1, (i & 3) != 2)) {
            x2 x2Var = m0.b;
            Context context3 = (Context) sVar3.j(x2Var);
            Object[] objArrCopyOf = Arrays.copyOf(new k0[0], 0);
            androidx.compose.foundation.text.input.internal.o oVar = new androidx.compose.foundation.text.input.internal.o(14, new androidx.compose.ui.text.x(22), new s2(context3, 8));
            boolean zH3 = sVar3.h(context3);
            Object objQ6 = sVar3.Q();
            androidx.compose.runtime.f fVar4 = androidx.compose.runtime.n.a;
            if (zH3 || objQ6 == fVar4) {
                objQ6 = new androidx.navigation.compose.o(context3, 0);
                sVar3.l0(objQ6);
            }
            androidx.navigation.y yVar8 = (androidx.navigation.y) androidx.compose.runtime.saveable.l.d(objArrCopyOf, oVar, (kotlin.jvm.functions.a) objQ6, sVar3, 0, 4);
            androidx.navigation.i iVar = (androidx.navigation.i) androidx.compose.runtime.t.f(FlowKt.asSharedFlow(yVar8.b.A), null, null, sVar, 48, 2).getValue();
            kotlin.coroutines.d dVar = null;
            String str5 = (iVar == null || (tVar = iVar.y) == null) ? null : (String) tVar.y.e;
            y0 y0VarA = androidx.lifecycle.viewmodel.compose.a.a(sVar);
            if (y0VarA == null) {
                kotlinx.coroutines.future.a.u("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            p1 p1Var = (p1) _COROUTINE.b.J(kotlin.jvm.internal.a0.a(p1.class), y0VarA, org.jsoup.helper.n.n(y0VarA, sVar), y0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) y0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, sVar);
            final a1 a1VarF = androidx.compose.runtime.t.f(p1Var.s, null, null, sVar, 48, 2);
            Flow flow = p1Var.d;
            Boolean bool = Boolean.FALSE;
            a1 a1VarF2 = androidx.compose.runtime.t.f(flow, bool, null, sVar, 48, 2);
            a1 a1VarF3 = androidx.compose.runtime.t.f(p1Var.f, kotlin.collections.y.e, null, sVar, 48, 2);
            androidx.compose.runtime.s sVar4 = sVar;
            a1 a1VarF4 = androidx.compose.runtime.t.f(p1Var.L, kotlin.collections.w.e, null, sVar4, 48, 2);
            a1 a1VarF5 = androidx.compose.runtime.t.f(p1Var.q, bool, null, sVar4, 48, 2);
            a1 a1VarF6 = androidx.compose.runtime.t.f(p1Var.r, bool, null, sVar4, 48, 2);
            final a1 a1VarF7 = androidx.compose.runtime.t.f(p1Var.i, bool, null, sVar4, 48, 2);
            final Context context4 = (Context) sVar4.j(x2Var);
            Object objQ7 = sVar4.Q();
            if (objQ7 == fVar4) {
                objQ7 = l0.f(sVar4);
                sVar4.l0(objQ7);
            }
            final CoroutineScope coroutineScope3 = (CoroutineScope) objQ7;
            Object objQ8 = sVar4.Q();
            if (objQ8 == fVar4) {
                Context applicationContext = context4.getApplicationContext();
                applicationContext.getClass();
                objQ8 = (com.app.mlounge.data.remote.ntv.q) ((com.app.mlounge.h) ((h0) org.jsoup.helper.n.r(dagger.hilt.android.internal.a.c(applicationContext.getApplicationContext()), h0.class))).H.get();
                sVar4.l0(objQ8);
            }
            final com.app.mlounge.data.remote.ntv.q qVar = (com.app.mlounge.data.remote.ntv.q) objQ8;
            Object objQ9 = sVar4.Q();
            if (objQ9 == fVar4) {
                objQ9 = androidx.compose.runtime.t.r(null);
                sVar4.l0(objQ9);
            }
            a1 a1Var7 = (a1) objQ9;
            Object objQ10 = sVar4.Q();
            if (objQ10 == fVar4) {
                objQ10 = androidx.compose.runtime.t.r(bool);
                sVar4.l0(objQ10);
            }
            final a1 a1Var8 = (a1) objQ10;
            Object objQ11 = sVar4.Q();
            if (objQ11 == fVar4) {
                objQ11 = androidx.compose.runtime.t.r("");
                sVar4.l0(objQ11);
            }
            final a1 a1Var9 = (a1) objQ11;
            Object objQ12 = sVar4.Q();
            if (objQ12 == fVar4) {
                objQ12 = androidx.compose.runtime.t.r(null);
                sVar4.l0(objQ12);
            }
            final a1 a1Var10 = (a1) objQ12;
            Object objQ13 = sVar4.Q();
            if (objQ13 == fVar4) {
                objQ13 = androidx.compose.runtime.t.r(bool);
                sVar4.l0(objQ13);
            }
            a1 a1Var11 = (a1) objQ13;
            androidx.navigation.i iVar2 = (androidx.navigation.i) androidx.compose.runtime.t.f(FlowKt.asSharedFlow(yVar8.b.A), null, null, sVar4, 48, 2).getValue();
            Object objQ14 = sVar4.Q();
            if (objQ14 == fVar4) {
                objQ14 = new androidx.compose.foundation.text.selection.q(a1Var11, dVar, 6);
                sVar4.l0(objQ14);
            }
            l0.c(sVar4, iVar2, (kotlin.jvm.functions.p) objQ14);
            Object objQ15 = sVar4.Q();
            if (objQ15 == fVar4) {
                objQ15 = androidx.compose.runtime.t.k(new androidx.compose.foundation.gestures.g(10, a1VarF4, a1VarF2, a1VarF3));
                sVar4.l0(objQ15);
            }
            w2 w2Var = (w2) objQ15;
            Iterator it = ((List) w2Var.getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (kotlin.jvm.internal.l.a((com.app.mlounge.ui.navigation.w) next, com.app.mlounge.ui.navigation.p.g));
            com.app.mlounge.ui.navigation.w wVar2 = (com.app.mlounge.ui.navigation.w) next;
            if (wVar2 == null) {
                wVar2 = (com.app.mlounge.ui.navigation.w) kotlin.collections.p.D((List) w2Var.getValue());
            }
            String str6 = wVar2 != null ? wVar2.a : com.app.mlounge.ui.navigation.k.g.a;
            boolean zF = sVar4.f((List) w2Var.getValue()) | sVar4.f(str5);
            Object objQ16 = sVar4.Q();
            if (zF || objQ16 == fVar4) {
                if (str5 != null && ((list = com.app.mlounge.ui.navigation.w.f) == null || !list.isEmpty())) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((com.app.mlounge.ui.navigation.w) it2.next()).a.equals(str5)) {
                                List list2 = (List) w2Var.getValue();
                                if (list2 == null || !list2.isEmpty()) {
                                    Iterator it3 = list2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (((com.app.mlounge.ui.navigation.w) it3.next()).a.equals(str5)) {
                                            }
                                        }
                                    }
                                }
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        break;
                    }
                }
                z = false;
                break;
                objQ16 = Boolean.valueOf(z);
                sVar4.l0(objQ16);
            }
            Boolean bool2 = (Boolean) objQ16;
            boolean zBooleanValue2 = bool2.booleanValue();
            boolean zG = sVar4.g(zBooleanValue2) | sVar4.f(str5) | sVar4.f(str6) | sVar4.h(yVar8);
            Object objQ17 = sVar4.Q();
            if (zG || objQ17 == fVar4) {
                String str7 = str5;
                a1Var = a1VarF2;
                b0 b0Var = new b0(zBooleanValue2, str7, str6, yVar8, a1Var11, null);
                str = str7;
                str2 = str6;
                yVar = yVar8;
                a1Var2 = a1Var11;
                sVar4.l0(b0Var);
                objQ17 = b0Var;
            } else {
                str = str5;
                a1Var2 = a1Var11;
                a1Var = a1VarF2;
                str2 = str6;
                yVar = yVar8;
            }
            l0.d(bool2, str2, (kotlin.jvm.functions.p) objQ17, sVar4);
            boolean zF2 = sVar4.f(str);
            Object objQ18 = sVar4.Q();
            if (zF2 || objQ18 == fVar4) {
                objQ18 = new com.app.mlounge.data.music.f(3, str, dVar);
                sVar4.l0(objQ18);
            }
            l0.c(sVar4, str, (kotlin.jvm.functions.p) objQ18);
            boolean zF3 = sVar4.f(a1VarF) | sVar4.h(coroutineScope3) | sVar4.h(context4) | sVar4.h(yVar);
            Object objQ19 = sVar4.Q();
            if (zF3 || objQ19 == fVar4) {
                final androidx.navigation.y yVar9 = yVar;
                final a1 a1Var12 = a1Var2;
                kotlin.jvm.functions.w wVar3 = new kotlin.jvm.functions.w() { // from class: com.app.mlounge.ui.r
                    @Override // kotlin.jvm.functions.w
                    public final Object c(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                        String str8 = (String) obj2;
                        String str9 = (String) obj3;
                        Map map = (Map) obj4;
                        String str10 = (String) obj5;
                        String str11 = (String) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        int iIntValue2 = ((Integer) obj8).intValue();
                        int iIntValue3 = ((Integer) obj9).intValue();
                        String str12 = (String) obj10;
                        str8.getClass();
                        str9.getClass();
                        str10.getClass();
                        str12.getClass();
                        a1 a1Var13 = a1Var12;
                        if (!f0.b(a1Var13)) {
                            a1Var13.setValue(Boolean.TRUE);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new com.app.mlounge.data.download.d((String) a1VarF.getValue(), context4, str12, str8, str9, map, yVar9, str10, str11, iIntValue, iIntValue2, iIntValue3, a1Var13, (kotlin.coroutines.d) null), 3, null);
                        }
                        return kotlin.y.a;
                    }
                };
                a1Var3 = a1VarF;
                context = context4;
                yVar2 = yVar9;
                sVar4.l0(wVar3);
                objQ19 = wVar3;
            } else {
                androidx.navigation.y yVar10 = yVar;
                a1Var3 = a1VarF;
                yVar2 = yVar10;
                context = context4;
            }
            kotlin.jvm.functions.w wVar4 = (kotlin.jvm.functions.w) objQ19;
            boolean zF4 = sVar4.f(a1VarF7) | sVar4.h(coroutineScope3) | sVar4.h(context) | sVar4.f(wVar4);
            Object objQ20 = sVar4.Q();
            if (zF4 || objQ20 == fVar4) {
                final Context context5 = context;
                wVar = wVar4;
                objQ20 = new kotlin.jvm.functions.w() { // from class: com.app.mlounge.ui.s
                    @Override // kotlin.jvm.functions.w
                    public final Object c(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                        String str8 = (String) obj2;
                        String str9 = (String) obj3;
                        Map map = (Map) obj4;
                        String str10 = (String) obj5;
                        String str11 = (String) obj6;
                        Integer num = (Integer) obj7;
                        int iIntValue = num.intValue();
                        Integer num2 = (Integer) obj8;
                        int iIntValue2 = num2.intValue();
                        Integer num3 = (Integer) obj9;
                        int iIntValue3 = num3.intValue();
                        String str12 = (String) obj10;
                        str8.getClass();
                        str9.getClass();
                        str10.getClass();
                        str12.getClass();
                        if (!f0.b(a1Var2)) {
                            a1 a1Var13 = a1Var8;
                            if (!((Boolean) a1Var13.getValue()).booleanValue()) {
                                boolean zJ = kotlin.text.k.J(str8);
                                kotlin.jvm.functions.w wVar5 = wVar;
                                if (zJ && ((Boolean) a1VarF7.getValue()).booleanValue()) {
                                    a1Var13.setValue(Boolean.TRUE);
                                    a1 a1Var14 = a1Var9;
                                    a1Var14.setValue("Starting search...");
                                    a1 a1Var15 = a1Var10;
                                    Job job = (Job) a1Var15.getValue();
                                    if (job != null) {
                                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                    }
                                    a1Var15.setValue(BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new e0(context5, iIntValue, str12, str10, iIntValue2, iIntValue3, str9, wVar5, a1Var14, a1Var13, null), 3, null));
                                } else {
                                    wVar5.c(str8, str9, map, str10, str11, num, num2, num3, str12);
                                }
                            }
                        }
                        return kotlin.y.a;
                    }
                };
                a1Var4 = a1VarF7;
                sVar4.l0(objQ20);
            } else {
                a1Var4 = a1VarF7;
                wVar = wVar4;
            }
            kotlin.jvm.functions.w wVar5 = (kotlin.jvm.functions.w) objQ20;
            boolean zF5 = sVar4.f(a1Var3) | sVar4.h(context) | sVar4.h(yVar2);
            Object objQ21 = sVar4.Q();
            if (zF5 || objQ21 == fVar4) {
                objQ21 = new i(context, yVar2, a1Var2, a1Var3);
                sVar4.l0(objQ21);
            }
            kotlin.jvm.functions.s sVar5 = (kotlin.jvm.functions.s) objQ21;
            boolean zH4 = sVar4.h(coroutineScope3) | sVar4.h(qVar) | sVar4.h(context) | sVar4.f(a1Var3) | sVar4.h(yVar2) | sVar4.f(sVar5);
            final androidx.navigation.y yVar11 = yVar2;
            Object objQ22 = sVar4.Q();
            if (zH4 || objQ22 == fVar4) {
                final a1 a1Var13 = a1Var3;
                sVar2 = sVar5;
                final a1 a1Var14 = a1Var2;
                a1Var5 = a1Var7;
                final Context context6 = context;
                obj = new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.w
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String str8 = (String) obj2;
                        String str9 = (String) obj3;
                        Map map = (Map) obj4;
                        str8.getClass();
                        str9.getClass();
                        if (kotlin.text.r.u(str8, "ntv://", false)) {
                            Object obj6 = com.app.mlounge.data.remote.ntv.q.b;
                            com.app.mlounge.data.remote.ntv.e eVarI = coil3.svg.internal.a.I(str8);
                            if (eVarI != null) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new c0(eVarI, qVar, context6, yVar11, str8, a1Var5, a1Var14, a1Var13, (kotlin.coroutines.d) null), 3, null);
                            }
                        } else {
                            sVar2.d(str8, str9, map, null, kotlin.text.r.u(str8, "ntv://", false) ? str8 : null);
                        }
                        return kotlin.y.a;
                    }
                };
                coroutineScope = coroutineScope3;
                yVar3 = yVar11;
                a1Var6 = a1Var14;
                sVar4.l0(obj);
            } else {
                obj = objQ22;
                sVar2 = sVar5;
                a1Var6 = a1Var2;
                yVar3 = yVar11;
                a1Var5 = a1Var7;
                coroutineScope = coroutineScope3;
            }
            kotlin.jvm.functions.r rVar2 = (kotlin.jvm.functions.r) obj;
            Object objQ23 = sVar4.Q();
            if (objQ23 == fVar4) {
                objQ23 = new androidx.compose.ui.focus.y();
                sVar4.l0(objQ23);
            }
            androidx.compose.ui.focus.y yVar12 = (androidx.compose.ui.focus.y) objQ23;
            Object objQ24 = sVar4.Q();
            if (objQ24 == fVar4) {
                objQ24 = new androidx.compose.ui.focus.y();
                sVar4.l0(objQ24);
            }
            androidx.compose.ui.focus.y yVar13 = (androidx.compose.ui.focus.y) objQ24;
            if (str != null) {
                coroutineScope2 = coroutineScope;
                z2 = kotlin.text.r.u(str, "player", false);
                context2 = (Context) sVar4.j(m0.b);
                objQ = sVar4.Q();
                if (objQ == fVar4) {
                    Context applicationContext2 = context2.getApplicationContext();
                    applicationContext2.getClass();
                    objQ = Boolean.valueOf(_COROUTINE.a.X(applicationContext2));
                    sVar4.l0(objQ);
                }
                zBooleanValue = ((Boolean) objQ).booleanValue();
                zH = sVar4.h(yVar3);
                objQ2 = sVar4.Q();
                if (zH || objQ2 == fVar4) {
                    objQ2 = new b(yVar3, a1Var6, 17);
                    sVar4.l0(objQ2);
                }
                lVar = (kotlin.jvm.functions.l) objQ2;
                e0Var = i1.c;
                yVar4 = yVar3;
                androidx.compose.ui.r rVarD = rVar.d(e0Var);
                a1 a1Var15 = a1Var6;
                str3 = str;
                androidx.compose.foundation.layout.w wVarA = androidx.compose.foundation.layout.u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar4, 0);
                int iHashCode = Long.hashCode(sVar4.T);
                androidx.compose.runtime.internal.j jVarL = sVar4.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar4, rVarD);
                androidx.compose.ui.node.h.b.getClass();
                kotlin.jvm.functions.w wVar6 = wVar;
                fVar = androidx.compose.ui.node.g.b;
                sVar4.e0();
                if (sVar4.S) {
                    sVar4.k(fVar);
                } else {
                    sVar4.o0();
                }
                androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.f;
                androidx.compose.runtime.t.x(sVar4, wVarA, eVar3);
                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.e;
                androidx.compose.runtime.t.x(sVar4, jVarL, eVar4);
                Integer numValueOf = Integer.valueOf(iHashCode);
                eVar = androidx.compose.ui.node.g.g;
                androidx.compose.runtime.t.p(sVar4, numValueOf, eVar);
                androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.g.h;
                androidx.compose.runtime.t.t(sVar4, dVar2);
                String str8 = str2;
                androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.g.d;
                androidx.compose.runtime.t.x(sVar4, rVarC, eVar5);
                androidx.compose.ui.r rVarE = i1.e(androidx.compose.ui.o.b, 1.0f);
                a1 a1Var16 = a1Var4;
                a1 a1Var17 = a1Var;
                d = 1.0f;
                if (d <= 0.0d) {
                    androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                }
                androidx.compose.ui.r rVarD2 = rVarE.d(new t0(1.0f, true));
                f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.G, sVar4, 0);
                int iHashCode2 = Long.hashCode(sVar4.T);
                androidx.compose.runtime.internal.j jVarL2 = sVar4.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(sVar4, rVarD2);
                sVar4.e0();
                if (sVar4.S) {
                    sVar4.k(fVar);
                } else {
                    sVar4.o0();
                }
                androidx.compose.runtime.t.x(sVar4, f1VarA, eVar3);
                androidx.compose.runtime.t.x(sVar4, jVarL2, eVar4);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar4, eVar, sVar4, dVar2);
                androidx.compose.runtime.t.x(sVar4, rVarC2, eVar5);
                if (zBooleanValue || z2) {
                    eVar2 = eVar;
                    lVar2 = lVar;
                    str4 = str3;
                    fVar2 = fVar;
                    yVar5 = yVar13;
                    yVar6 = yVar12;
                    sVar4.b0(-1587829008);
                    sVar4.p(false);
                } else {
                    sVar4.b0(-1588146138);
                    List list3 = (List) w2Var.getValue();
                    eVar2 = eVar;
                    fVar2 = fVar;
                    yVar5 = yVar13;
                    com.app.mlounge.ui.components.b0.r(str3, list3, lVar, yVar12, yVar5, null, sVar4, 27648);
                    str4 = str3;
                    lVar2 = lVar;
                    yVar6 = yVar12;
                    sVar4.p(false);
                }
                if (z2) {
                    sVar4 = sVar4;
                    t0Var = e0Var;
                } else {
                    if (d <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    t0Var = new t0(1.0f, true);
                }
                androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(t0Var, yVar5);
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                int iHashCode3 = Long.hashCode(sVar4.T);
                androidx.compose.runtime.internal.j jVarL3 = sVar4.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(sVar4, rVarK);
                sVar4.e0();
                if (sVar4.S) {
                    sVar4.k(fVar2);
                } else {
                    sVar4.o0();
                }
                androidx.compose.runtime.t.x(sVar4, q0VarD, eVar3);
                androidx.compose.runtime.t.x(sVar4, jVarL3, eVar4);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar4, eVar2, sVar4, dVar2);
                androidx.compose.runtime.t.x(sVar4, rVarC3, eVar5);
                kotlin.jvm.functions.s sVar6 = sVar2;
                CoroutineScope coroutineScope4 = coroutineScope2;
                zH2 = sVar4.h(yVar4) | sVar4.f(rVar2) | sVar4.f(wVar5) | sVar4.f(a1Var16) | sVar4.f(sVar6) | sVar4.h(coroutineScope4) | sVar4.f(wVar6) | sVar4.f(a1Var17) | sVar4.f(a1VarF5) | sVar4.f(a1VarF6);
                objQ3 = sVar4.Q();
                if (zH2) {
                    fVar3 = fVar4;
                } else {
                    fVar3 = fVar4;
                    if (objQ3 == fVar3) {
                        yVar7 = yVar4;
                    }
                    kotlin.math.a.c(yVar7, str8, null, null, null, null, null, null, (kotlin.jvm.functions.l) objQ3, sVar, 0);
                    sVar3 = sVar;
                    sVar3.p(true);
                    sVar3.p(true);
                    if (!zBooleanValue || z2) {
                        z3 = false;
                        sVar3.b0(1545107916);
                        sVar3.p(false);
                    } else {
                        sVar3.b0(1544922443);
                        com.app.mlounge.ui.components.b0.o(0, sVar3, null, str4, (List) w2Var.getValue(), lVar2);
                        sVar3 = sVar3;
                        z3 = false;
                        sVar3.p(false);
                    }
                    sVar3.p(true);
                    if (((String) a1Var5.getValue()) != null) {
                        sVar3.b0(-1189610579);
                        objQ5 = sVar3.Q();
                        if (objQ5 == fVar3) {
                            objQ5 = new androidx.activity.compose.b(1);
                            sVar3.l0(objQ5);
                        }
                        androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-900279458, new androidx.compose.material3.m(a1Var5, 1), sVar3);
                        long j = com.app.mlounge.ui.theme.b.b;
                        x2 x2Var2 = u0.a;
                        z4 = z3;
                        androidx.compose.material3.q.a((kotlin.jvm.functions.a) objQ5, a.c, null, null, a.d, fVarC, null, j, 0L, ((androidx.compose.material3.t0) sVar3.j(x2Var2)).q, ((androidx.compose.material3.t0) sVar3.j(x2Var2)).s, 0.0f, null, sVar, 1769526, 0, 12956);
                        sVar3 = sVar;
                        sVar3.p(z4);
                    } else {
                        z4 = z3;
                        sVar3.b0(-1188925386);
                        sVar3.p(z4);
                    }
                    if (((Boolean) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v2 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1910
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.f0.a(androidx.compose.ui.r, androidx.compose.runtime.s, int):void");
                }

                public static final boolean b(a1 a1Var) {
                    return ((Boolean) a1Var.getValue()).booleanValue();
                }

                public static final void c(a1 a1Var, boolean z) {
                    a1Var.setValue(Boolean.valueOf(z));
                }

                public static final void d(String str, kotlin.jvm.functions.a aVar, androidx.compose.runtime.s sVar, int i) {
                    kotlin.jvm.functions.a aVar2;
                    androidx.compose.runtime.s sVar2;
                    str.getClass();
                    aVar.getClass();
                    sVar.c0(-1789708697);
                    int i2 = (sVar.f(str) ? 4 : 2) | i;
                    if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
                        aVar2 = aVar;
                        sVar2 = sVar;
                        t1.a(aVar2, null, androidx.compose.runtime.internal.k.c(1573244030, new f(str, aVar, 0), sVar), sVar2, 390, 2);
                    } else {
                        aVar2 = aVar;
                        sVar2 = sVar;
                        sVar2.W();
                    }
                    s1 s1VarT = sVar2.t();
                    if (s1VarT != null) {
                        s1VarT.d = new f(str, aVar2, i, 1);
                    }
                }

                public static final void e(Context context, String str, String str2, Map map, String str3, long j) {
                    List<HiAnimeTrack> listConsume = AnimeSubtitleStore.INSTANCE.consume();
                    Uri uriD = Uri.parse(str);
                    if (kotlin.jvm.internal.l.a(uriD.getScheme(), "file")) {
                        try {
                            String str4 = context.getPackageName() + ".provider";
                            String path = uriD.getPath();
                            path.getClass();
                            uriD = FileProvider.d(context, str4, new File(path));
                        } catch (Exception e) {
                            Context context2 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.d("CinemaHQ", "FileProvider conversion failed for " + uriD.getPath(), e);
                        }
                    }
                    Uri uri = uriD;
                    try {
                        context.startActivity(f(str, str3, uri, str2, map, listConsume, j, true));
                    } catch (Exception e2) {
                        Context context3 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("E", "CinemaHQ", androidx.room.b0.e("External player launch failed for ", str3, ": ", e2.getMessage()));
                        try {
                            context.startActivity(f(str, str3, uri, str2, map, listConsume, j, false));
                        } catch (Exception unused) {
                            Toast.makeText(context, "No compatible player found", 0).show();
                        }
                    }
                }

                public static final Intent f(String str, String str2, Uri uri, String str3, Map map, List list, long j, boolean z) {
                    Object obj;
                    String strA;
                    String strB;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String lowerCase = kotlin.text.k.Y(str, ".", "").toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String str4 = "video/*";
                    String str5 = (lowerCase.equals("m3u8") || kotlin.text.k.z(str, "m3u8", false) || kotlin.text.k.z(str, ".mpd", false) || kotlin.text.k.z(str, "playlist", false) || kotlin.text.k.z(str, "master", false)) ? kotlin.text.k.z(str, ".mpd", false) ? "application/dash+xml" : "application/vnd.apple.mpegurl" : "video/*";
                    if (!kotlin.jvm.internal.l.a(str2, "com.player.bear") && !kotlin.jvm.internal.l.a(str2, "com.brouken.player")) {
                        str4 = str5;
                    }
                    intent.setDataAndType(uri, str4);
                    if (z) {
                        intent.setPackage(str2);
                    }
                    intent.putExtra("title", str3);
                    if (map != null && !map.isEmpty()) {
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry : map.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        intent.putExtra("android.media.intent.extra.HTTP_HEADERS", bundle);
                        String str6 = (String) map.get("User-Agent");
                        if (str6 != null) {
                            intent.putExtra("android.intent.extra.user_agent", str6);
                        }
                        if (kotlin.jvm.internal.l.a(str2, "org.videolan.vlc")) {
                            intent.putExtra("headers", bundle);
                        } else if (kotlin.text.k.z(str2, "videoplayer", false) || kotlin.text.k.z(str2, "hbplayer", false)) {
                            ArrayList arrayList = new ArrayList();
                            for (Map.Entry entry2 : map.entrySet()) {
                                String str7 = (String) entry2.getKey();
                                String str8 = (String) entry2.getValue();
                                arrayList.add(str7);
                                arrayList.add(str8);
                            }
                            intent.putExtra("headers", (String[]) arrayList.toArray(new String[0]));
                        }
                        ArrayList arrayList2 = new ArrayList(map.size());
                        for (Map.Entry entry3 : map.entrySet()) {
                            arrayList2.add(entry3.getKey() + ": " + entry3.getValue());
                        }
                        intent.putExtra("extra_headers", (String[]) arrayList2.toArray(new String[0]));
                    }
                    if (!list.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = list.iterator();
                        while (true) {
                            obj = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            String strA2 = ((HiAnimeTrack) it.next()).a();
                            obj = strA2 != null ? Uri.parse(strA2) : null;
                            if (obj != null) {
                                arrayList3.add(obj);
                            }
                        }
                        Uri[] uriArr = (Uri[]) arrayList3.toArray(new Uri[0]);
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String strB2 = ((HiAnimeTrack) it2.next()).b();
                            if (strB2 != null) {
                                arrayList4.add(strB2);
                            }
                        }
                        String[] strArr = (String[]) arrayList4.toArray(new String[0]);
                        if (uriArr.length != 0) {
                            Uri[] uriArr2 = uriArr;
                            intent.putExtra("subs", uriArr2);
                            intent.putExtra("subs.name", strArr);
                            intent.putExtra("subs.filename", strArr);
                            intent.putExtra("subs.enable", uriArr2);
                        }
                        for (Object obj2 : list) {
                            HiAnimeTrack hiAnimeTrack = (HiAnimeTrack) obj2;
                            if (kotlin.jvm.internal.l.a(hiAnimeTrack.c(), Boolean.TRUE) || ((strB = hiAnimeTrack.b()) != null && kotlin.text.k.z(strB, "English", true))) {
                                obj = obj2;
                                break;
                            }
                        }
                        HiAnimeTrack hiAnimeTrack2 = (HiAnimeTrack) obj;
                        if (hiAnimeTrack2 != null && (strA = hiAnimeTrack2.a()) != null) {
                            intent.putExtra("subtitles_location", strA);
                        }
                    }
                    if (kotlin.text.k.z(str2, "videoplayer", false) || kotlin.text.k.z(str2, "hbplayer", false)) {
                        intent.putExtra("decode_mode", 4);
                    }
                    if (j > 0) {
                        intent.putExtra("position", (int) j);
                        intent.putExtra("return_result", true);
                    }
                    intent.addFlags(1);
                    return intent;
                }

                public static void g(androidx.navigation.y yVar, String str, String str2, Map map, String str3, String str4, int i, int i2, int i3, String str5, String str6, int i4) {
                    Set setEntrySet;
                    Map map2 = (i4 & 8) != 0 ? null : map;
                    String str7 = (i4 & 32) == 0 ? str4 : null;
                    int i5 = (i4 & 128) != 0 ? 0 : i2;
                    int i6 = (i4 & LibretroCore.SCREEN_WIDTH) != 0 ? 0 : i3;
                    String str8 = (i4 & 512) != 0 ? "" : str5;
                    String str9 = (i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? "" : str6;
                    String strI = (map2 == null || (setEntrySet = map2.entrySet()) == null) ? "" : kotlin.collections.p.I(setEntrySet, "\n", null, null, new com.app.mlounge.data.local.dao.g(11), 30);
                    String strEncode = Uri.encode(str);
                    String strEncode2 = Uri.encode(str2);
                    String strEncode3 = Uri.encode(strI);
                    if (str7 == null) {
                        str7 = "";
                    }
                    String strEncode4 = Uri.encode(str7);
                    String strEncode5 = Uri.encode(str8);
                    String strEncode6 = Uri.encode(str9);
                    yVar.getClass();
                    androidx.navigation.internal.f fVar = yVar.b;
                    fVar.getClass();
                    if (fVar.o("player?url={url}&title={title}&headers={headers}&contentType={contentType}&streamType={streamType}&tmdbId={tmdbId}&season={season}&episode={episode}&contentKey={contentKey}&fallbackUrl={fallbackUrl}", true, false)) {
                        fVar.b();
                    }
                    StringBuilder sbQ = androidx.compose.runtime.j.q("player?url=", strEncode, "&title=", strEncode2, "&headers=");
                    androidx.room.b0.i(sbQ, strEncode3, "&contentType=", str3, "&streamType=");
                    sbQ.append(strEncode4);
                    sbQ.append("&tmdbId=");
                    sbQ.append(i);
                    sbQ.append("&season=");
                    sbQ.append(i5);
                    sbQ.append("&episode=");
                    sbQ.append(i6);
                    sbQ.append("&contentKey=");
                    sbQ.append(strEncode5);
                    sbQ.append("&fallbackUrl=");
                    sbQ.append(strEncode6);
                    androidx.navigation.y.b(yVar, sbQ.toString());
                }
            }
