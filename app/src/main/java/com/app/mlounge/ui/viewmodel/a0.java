package com.app.mlounge.ui.viewmodel;

import android.content.Context;
import com.app.mlounge.data.remote.api.ChqNtvApi;
import com.app.mlounge.data.remote.api.NtvApi;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.NtvChannel;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.data.remote.model.SportsMatchResponse;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends androidx.lifecycle.s0 {
    public final MutableSharedFlow A;
    public final SharedFlow B;
    public final MutableStateFlow C;
    public final StateFlow D;
    public final MutableStateFlow E;
    public final StateFlow F;
    public final MutableStateFlow G;
    public final StateFlow H;
    public final MutableStateFlow I;
    public final StateFlow J;
    public final MutableStateFlow K;
    public final StateFlow L;
    public final MutableStateFlow M;
    public final StateFlow N;
    public final List O;
    public final List P;
    public final MutableStateFlow Q;
    public final StateFlow R;
    public final List S;
    public final LinkedHashSet T;
    public final Context b;
    public final com.app.mlounge.data.repository.x c;
    public final NtvApi d;
    public final ChqNtvApi e;
    public final com.app.mlounge.data.remote.ntv.q f;
    public final com.app.mlounge.data.iptv.c0 g;
    public final com.app.mlounge.data.iptv.l h;
    public final com.app.mlounge.data.local.dao.i i;
    public final com.app.mlounge.data.local.prefs.y1 j;
    public final MutableStateFlow k;
    public final StateFlow l;
    public final MutableStateFlow m;
    public final MutableStateFlow n;
    public final StateFlow o;
    public final MutableStateFlow p;
    public final StateFlow q;
    public final MutableStateFlow r;
    public final StateFlow s;
    public final MutableStateFlow t;
    public final StateFlow u;
    public final MutableStateFlow v;
    public final StateFlow w;
    public final Set x;
    public final MutableStateFlow y;
    public final StateFlow z;

    public a0(Context context, com.app.mlounge.data.repository.r rVar, com.app.mlounge.data.repository.x xVar, NtvApi ntvApi, ChqNtvApi chqNtvApi, com.app.mlounge.data.remote.ntv.q qVar, com.app.mlounge.data.iptv.c0 c0Var, com.app.mlounge.data.iptv.l lVar, com.app.mlounge.data.local.dao.i iVar, com.app.mlounge.data.local.prefs.y1 y1Var) {
        rVar.getClass();
        xVar.getClass();
        ntvApi.getClass();
        chqNtvApi.getClass();
        qVar.getClass();
        c0Var.getClass();
        lVar.getClass();
        y1Var.getClass();
        this.b = context;
        this.c = xVar;
        this.d = ntvApi;
        this.e = chqNtvApi;
        this.f = qVar;
        this.g = c0Var;
        this.h = lVar;
        this.i = iVar;
        this.j = y1Var;
        kotlin.collections.w wVar = kotlin.collections.w.e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(wVar);
        this.k = MutableStateFlow;
        this.l = FlowKt.asStateFlow(MutableStateFlow);
        this.m = StateFlowKt.MutableStateFlow(wVar);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(wVar);
        this.n = MutableStateFlow2;
        this.o = FlowKt.asStateFlow(MutableStateFlow2);
        kotlin.coroutines.d dVar = null;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.p = MutableStateFlow3;
        this.q = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.r = MutableStateFlow4;
        this.s = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.t = MutableStateFlow5;
        this.u = FlowKt.asStateFlow(MutableStateFlow5);
        List list = com.app.mlounge.data.repository.r.M;
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(((kotlin.k) kotlin.collections.p.B(list)).e);
        this.v = MutableStateFlow6;
        this.w = FlowKt.asStateFlow(MutableStateFlow6);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((kotlin.k) it.next()).e);
        }
        this.x = kotlin.collections.p.f0(arrayList);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow("");
        this.y = MutableStateFlow7;
        this.z = FlowKt.asStateFlow(MutableStateFlow7);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.A = mutableSharedFlowMutableSharedFlow$default;
        this.B = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this.C = MutableStateFlow8;
        this.D = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(kotlin.collections.x.e);
        this.E = MutableStateFlow9;
        this.F = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.G = MutableStateFlow10;
        this.H = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow MutableStateFlow11 = StateFlowKt.MutableStateFlow(wVar);
        this.I = MutableStateFlow11;
        this.J = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow MutableStateFlow12 = StateFlowKt.MutableStateFlow(null);
        this.K = MutableStateFlow12;
        this.L = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow MutableStateFlow13 = StateFlowKt.MutableStateFlow(null);
        this.M = MutableStateFlow13;
        this.N = FlowKt.asStateFlow(MutableStateFlow13);
        this.O = kotlin.collections.q.k("Kobra", "Raptor");
        this.P = kotlin.collections.q.k("dlhd", "cdnlive");
        MutableStateFlow MutableStateFlow14 = StateFlowKt.MutableStateFlow(null);
        this.Q = MutableStateFlow14;
        this.R = FlowKt.asStateFlow(MutableStateFlow14);
        this.S = com.app.mlounge.data.repository.r.M;
        com.app.mlounge.data.iptv.c0.Companion.getClass();
        this.T = kotlin.collections.g0.i(kotlin.collections.g0.i(com.app.mlounge.data.iptv.c0.PROVIDER_SOURCES.keySet(), "plutotv"), "earthcam");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), null, null, new t(this, dVar, 0), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r9 == r8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r9 == r8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        if (r9 == r8) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(com.app.mlounge.ui.viewmodel.a0 r9, kotlin.coroutines.jvm.internal.c r10) {
        /*
            com.app.mlounge.data.local.prefs.y1 r0 = r9.j
            boolean r1 = r10 instanceof com.app.mlounge.ui.viewmodel.v
            if (r1 == 0) goto L15
            r1 = r10
            com.app.mlounge.ui.viewmodel.v r1 = (com.app.mlounge.ui.viewmodel.v) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.z = r2
            goto L1a
        L15:
            com.app.mlounge.ui.viewmodel.v r1 = new com.app.mlounge.ui.viewmodel.v
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r9 = r1.e
            int r10 = r1.z
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            kotlin.coroutines.intrinsics.a r8 = kotlin.coroutines.intrinsics.a.e
            if (r10 == 0) goto L4e
            if (r10 == r7) goto L4a
            if (r10 == r5) goto L46
            if (r10 == r4) goto L42
            if (r10 == r3) goto L3e
            if (r10 != r2) goto L37
            kotlin.a.e(r9)
            goto Lb5
        L37:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r9)
            r9 = 0
            return r9
        L3e:
            kotlin.a.e(r9)
            goto La1
        L42:
            kotlin.a.e(r9)
            goto L84
        L46:
            kotlin.a.e(r9)
            goto L71
        L4a:
            kotlin.a.e(r9)
            goto L5c
        L4e:
            kotlin.a.e(r9)
            kotlinx.coroutines.flow.Flow r9 = r0.W
            r1.z = r7
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r9, r1)
            if (r9 != r8) goto L5c
            goto Lb4
        L5c:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "xtream"
            boolean r10 = kotlin.jvm.internal.l.a(r9, r10)
            if (r10 == 0) goto L8e
            kotlinx.coroutines.flow.Flow r9 = r0.Z
            r1.z = r5
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r9, r1)
            if (r9 != r8) goto L71
            goto Lb4
        L71:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = kotlin.text.k.J(r9)
            if (r9 != 0) goto Lbe
            kotlinx.coroutines.flow.Flow r9 = r0.b0
            r1.z = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r9, r1)
            if (r9 != r8) goto L84
            goto Lb4
        L84:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = kotlin.text.k.J(r9)
            if (r9 != 0) goto Lbe
        L8c:
            r6 = r7
            goto Lbe
        L8e:
            java.lang.String r10 = "local"
            boolean r9 = kotlin.jvm.internal.l.a(r9, r10)
            if (r9 == 0) goto Laa
            kotlinx.coroutines.flow.Flow r9 = r0.g0
            r1.z = r3
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r9, r1)
            if (r9 != r8) goto La1
            goto Lb4
        La1:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = kotlin.text.k.J(r9)
            if (r9 != 0) goto Lbe
            goto L8c
        Laa:
            kotlinx.coroutines.flow.Flow r9 = r0.X
            r1.z = r2
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r9, r1)
            if (r9 != r8) goto Lb5
        Lb4:
            return r8
        Lb5:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = kotlin.text.k.J(r9)
            if (r9 != 0) goto Lbe
            goto L8c
        Lbe:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.a0.e(com.app.mlounge.ui.viewmodel.a0, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public static final void f(a0 a0Var) {
        Iterable iterable = (Iterable) a0Var.k.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String strE = ((IptvChannel) it.next()).e();
            if (strE != null) {
                arrayList.add(strE);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!kotlin.text.k.J((String) obj)) {
                arrayList2.add(obj);
            }
        }
        Set setF0 = kotlin.collections.p.f0(arrayList2);
        if (setF0.isEmpty() || !a0Var.h.l()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a0Var), Dispatchers.getIO(), null, new androidx.compose.foundation.text.input.internal.k(a0Var, setF0, null, 15), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r13 == r10) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        if (r13 == r10) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(com.app.mlounge.ui.viewmodel.a0 r11, java.lang.String r12, kotlin.coroutines.jvm.internal.c r13) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.a0.g(com.app.mlounge.ui.viewmodel.a0, java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(a0 a0Var, kotlin.coroutines.jvm.internal.c cVar) throws UnsupportedEncodingException {
        x xVar;
        String string;
        IptvChannel iptvChannel;
        String strE;
        String strE2;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i = xVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                xVar.z = i - Integer.MIN_VALUE;
            } else {
                xVar = new x(a0Var, cVar);
            }
        } else {
            xVar = new x(a0Var, cVar);
        }
        Object objCoroutineScope = xVar.e;
        int i2 = xVar.z;
        kotlin.coroutines.d dVar = null;
        if (i2 == 0) {
            kotlin.a.e(objCoroutineScope);
            String str = (String) a0Var.Q.getValue();
            androidx.room.coroutines.c0 c0Var = new androidx.room.coroutines.c0(str != null ? kotlin.collections.q.j(str) : a0Var.P, a0Var, dVar, 25);
            xVar.z = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(c0Var, xVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCoroutineScope == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objCoroutineScope);
        }
        List<NtvChannel> list = (List) objCoroutineScope;
        String lowerCase = ((String) a0Var.y.getValue()).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!kotlin.text.k.J(lowerCase)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String strD = ((NtvChannel) obj).d();
                if (strD != null && kotlin.text.k.z(strD, lowerCase, true)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (NtvChannel ntvChannel : list) {
            String strF = ntvChannel.f();
            if (strF == null) {
                strF = "cdnlive";
            }
            String str2 = strF;
            if (!str2.equals("hesgoales") || ((strE2 = ntvChannel.e()) != null && kotlin.text.k.z(strE2, "livelive24.com", false))) {
                if (str2.equals("hesgoales") || ((strE = ntvChannel.e()) != null && kotlin.text.k.z(strE, "livelive24.com", false))) {
                    String strE3 = ntvChannel.e();
                    if (strE3 == null) {
                        strE3 = "";
                    }
                    String strEncode = URLEncoder.encode(strE3, "UTF-8");
                    String strD2 = ntvChannel.d();
                    if (strD2 == null) {
                        strD2 = "Unknown";
                    }
                    String strA = ntvChannel.a();
                    if (strA == null) {
                        strA = "";
                    }
                    String strB = ntvChannel.b();
                    String str3 = strB != null ? strB : "";
                    StringBuilder sbQ = androidx.compose.runtime.j.q("ntv://", strD2, "|", strA, "|");
                    androidx.room.b0.i(sbQ, str2, "|", str3, "|");
                    sbQ.append(strEncode);
                    string = sbQ.toString();
                } else {
                    String strD3 = ntvChannel.d();
                    if (strD3 == null) {
                        strD3 = "Unknown";
                    }
                    String strA2 = ntvChannel.a();
                    if (strA2 == null) {
                        strA2 = "";
                    }
                    String strB2 = ntvChannel.b();
                    string = androidx.compose.runtime.j.m(androidx.compose.runtime.j.q("ntv://", strD3, "|", strA2, "|"), str2, "|", strB2 != null ? strB2 : "");
                }
                String strD4 = ntvChannel.d();
                if (strD4 == null) {
                    strD4 = "Unknown";
                }
                String strC = ntvChannel.c();
                iptvChannel = new IptvChannel(strD4, string, strC != null ? kotlin.text.r.s(strC, "dlhd.link", "dlhd.st", false) : null, str2, "ntv", ntvChannel.b());
            } else {
                iptvChannel = null;
            }
            if (iptvChannel != null) {
                arrayList2.add(iptvChannel);
            }
        }
        a0Var.p(arrayList2, false);
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[LOOP:0: B:26:0x0072->B:28:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[LOOP:1: B:32:0x0092->B:34:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object i(a0 a0Var, kotlin.coroutines.jvm.internal.c cVar) {
        y yVar;
        SportsMatchResponse sportsMatchResponse;
        ArrayList arrayList;
        List listB;
        List listA;
        Iterator it;
        Iterator it2;
        NtvApi ntvApi = a0Var.d;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i = yVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                yVar.A = i - Integer.MIN_VALUE;
            } else {
                yVar = new y(a0Var, cVar);
            }
        } else {
            yVar = new y(a0Var, cVar);
        }
        Object matches = yVar.y;
        int i2 = yVar.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(matches);
            a0Var.K.setValue(null);
            yVar.A = 1;
            matches = ntvApi.getMatches("kobra", "both", yVar);
            if (matches != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            kotlin.a.e(matches);
        } else {
            if (i2 != 2) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sportsMatchResponse = yVar.e;
            kotlin.a.e(matches);
        }
        SportsMatchResponse sportsMatchResponse2 = (SportsMatchResponse) matches;
        arrayList = new ArrayList();
        listB = sportsMatchResponse.b();
        if (listB != null) {
            it2 = listB.iterator();
            while (it2.hasNext()) {
                arrayList.add(SportsMatch.a((SportsMatch) it2.next(), "Kobra"));
            }
        }
        listA = sportsMatchResponse2.a();
        if (listA != null) {
            it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(SportsMatch.a((SportsMatch) it.next(), "Raptor"));
            }
        }
        a0Var.I.setValue(kotlin.collections.p.W(arrayList, new androidx.constraintlayout.core.e(18)));
        MutableStateFlow mutableStateFlow = a0Var.k;
        kotlin.collections.w wVar = kotlin.collections.w.e;
        mutableStateFlow.setValue(wVar);
        a0Var.n.setValue(wVar);
        return kotlin.y.a;
        SportsMatchResponse sportsMatchResponse3 = (SportsMatchResponse) matches;
        yVar.e = sportsMatchResponse3;
        yVar.A = 2;
        Object matches2 = ntvApi.getMatches("raptor", "both", yVar);
        if (matches2 != aVar) {
            sportsMatchResponse = sportsMatchResponse3;
            matches = matches2;
            SportsMatchResponse sportsMatchResponse4 = (SportsMatchResponse) matches;
            arrayList = new ArrayList();
            listB = sportsMatchResponse.b();
            if (listB != null) {
                it2 = listB.iterator();
                while (it2.hasNext()) {
                    arrayList.add(SportsMatch.a((SportsMatch) it2.next(), "Kobra"));
                }
            }
            listA = sportsMatchResponse4.a();
            if (listA != null) {
                it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(SportsMatch.a((SportsMatch) it.next(), "Raptor"));
                }
            }
            a0Var.I.setValue(kotlin.collections.p.W(arrayList, new androidx.constraintlayout.core.e(18)));
            MutableStateFlow mutableStateFlow2 = a0Var.k;
            kotlin.collections.w wVar2 = kotlin.collections.w.e;
            mutableStateFlow2.setValue(wVar2);
            a0Var.n.setValue(wVar2);
            return kotlin.y.a;
        }
        return aVar;
    }

    public static List k(String str) {
        if (str == null) {
            return kotlin.collections.w.e;
        }
        List listU = kotlin.text.k.U(str, new String[]{";"}, 6);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.p(listU, 10));
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.text.k.g0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static String l(String str) {
        String string;
        if (str == null || (string = kotlin.text.k.g0(kotlin.text.k.b0(str, " - ")).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    public static IptvChannel o(com.app.mlounge.data.local.entity.d dVar) {
        return new IptvChannel(dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g);
    }

    public final void j() {
        List list;
        List list2;
        String str = (String) this.p.getValue();
        String str2 = (String) this.v.getValue();
        boolean zA = kotlin.jvm.internal.l.a(str2, "ntv");
        MutableStateFlow mutableStateFlow = this.m;
        MutableStateFlow mutableStateFlow2 = this.k;
        if (zA || kotlin.jvm.internal.l.a(str2, "sports")) {
            Object value = mutableStateFlow.getValue();
            if (str == null) {
                list = (List) value;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : (Iterable) value) {
                    if (kotlin.jvm.internal.l.a(((IptvChannel) obj).a(), str)) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            mutableStateFlow2.setValue(list);
            return;
        }
        if (!kotlin.jvm.internal.l.a(str2, "plutotv") && !kotlin.jvm.internal.l.a(str2, "iptvorg")) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), null, null, new androidx.room.coroutines.c0(this, str2, str, (kotlin.coroutines.d) null, 23), 3, null);
            return;
        }
        if (str == null) {
            list2 = (List) mutableStateFlow.getValue();
        } else {
            Iterable iterable = (Iterable) mutableStateFlow.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : iterable) {
                IptvChannel iptvChannel = (IptvChannel) obj2;
                if (kotlin.jvm.internal.l.a(str2, "plutotv") ? kotlin.jvm.internal.l.a(l(iptvChannel.a()), str) : k(iptvChannel.a()).contains(str)) {
                    arrayList2.add(obj2);
                }
            }
            list2 = arrayList2;
        }
        mutableStateFlow2.setValue(list2);
    }

    public final void m(SportsMatch sportsMatch, String str, String str2, kotlin.jvm.functions.q qVar) {
        String lowerCase;
        sportsMatch.getClass();
        str.getClass();
        String strE = sportsMatch.e();
        if (strE != null) {
            lowerCase = strE.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        String str3 = "kobra";
        if (!kotlin.jvm.internal.l.a(lowerCase, "kobra")) {
            str3 = "raptor";
            if (!kotlin.jvm.internal.l.a(lowerCase, "raptor")) {
                return;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), null, null, new androidx.compose.animation.core.g(this, sportsMatch, str3, str, str2, qVar, null), 3, null);
    }

    public final void n() {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), null, null, new t(this, null, 1), 3, null);
    }

    public final void p(ArrayList arrayList, boolean z) {
        String upperCase;
        String str;
        List listK = kotlin.collections.q.k("18+", "XXX", "ADULT", "PORN", "EROTIC", "SEX");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            IptvChannel iptvChannel = (IptvChannel) obj;
            String strC = iptvChannel.c();
            Locale locale = Locale.ROOT;
            String upperCase2 = strC.toUpperCase(locale);
            upperCase2.getClass();
            String strA = iptvChannel.a();
            if (strA != null) {
                upperCase = strA.toUpperCase(locale);
                upperCase.getClass();
            } else {
                upperCase = "";
            }
            if (!listK.isEmpty()) {
                Iterator it = listK.iterator();
                do {
                    if (it.hasNext()) {
                        str = (String) it.next();
                        if (!kotlin.text.k.z(upperCase2, str, false)) {
                        }
                    }
                } while (!kotlin.text.k.z(upperCase, str, false));
            }
            arrayList2.add(obj);
        }
        this.m.setValue(arrayList2);
        this.k.setValue(arrayList2);
        if (z) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String strA2 = ((IptvChannel) it2.next()).a();
            if (strA2 != null) {
                arrayList3.add(strA2);
            }
        }
        List listV = kotlin.collections.p.V(kotlin.collections.p.b0(kotlin.collections.p.e0(arrayList3)));
        if (listV.size() <= 1) {
            listV = kotlin.collections.w.e;
        }
        this.n.setValue(listV);
    }
}
