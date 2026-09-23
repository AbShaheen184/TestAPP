package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.api.NtvApi;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.HiAnimeResponse;
import com.app.mlounge.data.remote.model.HiAnimeSearchData;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.MusicSearchResponse;
import com.app.mlounge.data.remote.model.NtvChannelsResponse;
import com.app.mlounge.data.remote.model.TmdbPagedResponse;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends androidx.lifecycle.s0 {
    public final StateFlow A;
    public final MutableStateFlow B;
    public final StateFlow C;
    public final MutableStateFlow D;
    public final StateFlow E;
    public final MutableStateFlow F;
    public final StateFlow G;
    public final MutableStateFlow H;
    public final StateFlow I;
    public final MutableStateFlow J;
    public final StateFlow K;
    public final MutableStateFlow L;
    public final StateFlow M;
    public final Flow N;
    public Job O;
    public List P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public final com.app.mlounge.data.repository.j0 b;
    public int b0;
    public final com.app.mlounge.data.repository.r c;
    public int c0;
    public final com.app.mlounge.data.repository.a0 d;
    public int d0;
    public final com.app.mlounge.data.local.dao.i e;
    public Object e0;
    public final NtvApi f;
    public boolean f0;
    public final com.app.mlounge.data.local.prefs.y1 g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final MutableStateFlow l;
    public final StateFlow m;
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
    public final MutableStateFlow x;
    public final StateFlow y;
    public final MutableStateFlow z;

    public b1(com.app.mlounge.data.repository.j0 j0Var, com.app.mlounge.data.repository.r rVar, com.app.mlounge.data.repository.a0 a0Var, com.app.mlounge.data.iptv.c0 c0Var, com.app.mlounge.data.iptv.l lVar, com.app.mlounge.data.local.dao.i iVar, NtvApi ntvApi, com.app.mlounge.data.local.prefs.y1 y1Var) {
        j0Var.getClass();
        rVar.getClass();
        a0Var.getClass();
        c0Var.getClass();
        lVar.getClass();
        ntvApi.getClass();
        y1Var.getClass();
        this.b = j0Var;
        this.c = rVar;
        this.d = a0Var;
        this.e = iVar;
        this.f = ntvApi;
        this.g = y1Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
        kotlin.collections.w wVar = kotlin.collections.w.e;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(wVar);
        this.j = MutableStateFlow2;
        this.k = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(wVar);
        this.l = MutableStateFlow3;
        this.m = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(wVar);
        this.n = MutableStateFlow4;
        this.o = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(wVar);
        this.p = MutableStateFlow5;
        this.q = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(wVar);
        this.r = MutableStateFlow6;
        this.s = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(wVar);
        this.t = MutableStateFlow7;
        this.u = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(wVar);
        this.v = MutableStateFlow8;
        this.w = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(wVar);
        this.x = MutableStateFlow9;
        this.y = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(wVar);
        this.z = MutableStateFlow10;
        this.A = FlowKt.asStateFlow(MutableStateFlow10);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow11 = StateFlowKt.MutableStateFlow(bool);
        this.B = MutableStateFlow11;
        this.C = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow MutableStateFlow12 = StateFlowKt.MutableStateFlow(bool);
        this.D = MutableStateFlow12;
        this.E = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow MutableStateFlow13 = StateFlowKt.MutableStateFlow(0);
        this.F = MutableStateFlow13;
        this.G = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow MutableStateFlow14 = StateFlowKt.MutableStateFlow(0);
        this.H = MutableStateFlow14;
        this.I = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow MutableStateFlow15 = StateFlowKt.MutableStateFlow("MusicMp3");
        this.J = MutableStateFlow15;
        this.K = FlowKt.asStateFlow(MutableStateFlow15);
        MutableStateFlow MutableStateFlow16 = StateFlowKt.MutableStateFlow(com.app.mlounge.data.repository.a.e);
        this.L = MutableStateFlow16;
        this.M = FlowKt.asStateFlow(MutableStateFlow16);
        this.N = FlowKt.flowCombine(y1Var.c, y1Var.e, new e(3, 2, null));
        this.Q = 1;
        this.R = 1;
        this.S = 1;
        this.T = 1;
        this.U = 1;
        this.W = 1;
        this.X = 1;
        this.Y = 1;
        this.Z = 1;
        this.a0 = 1;
        this.b0 = 1;
        this.c0 = 1;
        this.d0 = 1;
        this.f0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if (r5.j(r6, r1) == r2) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(com.app.mlounge.ui.viewmodel.b1 r5, java.lang.String r6, kotlin.coroutines.jvm.internal.c r7) {
        /*
            kotlinx.coroutines.flow.MutableStateFlow r0 = r5.B
            boolean r1 = r7 instanceof com.app.mlounge.ui.viewmodel.s0
            if (r1 == 0) goto L15
            r1 = r7
            com.app.mlounge.ui.viewmodel.s0 r1 = (com.app.mlounge.ui.viewmodel.s0) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.z = r2
            goto L1a
        L15:
            com.app.mlounge.ui.viewmodel.s0 r1 = new com.app.mlounge.ui.viewmodel.s0
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.e
            int r2 = r1.z
            switch(r2) {
                case 0: goto L2f;
                case 1: goto L28;
                case 2: goto L28;
                case 3: goto L28;
                case 4: goto L28;
                case 5: goto L28;
                case 6: goto L28;
                case 7: goto L28;
                default: goto L21;
            }
        L21:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r5)
            r5 = 0
            return r5
        L28:
            kotlin.a.e(r7)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            goto L8f
        L2c:
            r5 = move-exception
            goto L95
        L2f:
            kotlin.a.e(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0.setValue(r7)
            kotlinx.coroutines.flow.MutableStateFlow r7 = r5.F
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            kotlin.coroutines.intrinsics.a r2 = kotlin.coroutines.intrinsics.a.e
            switch(r7) {
                case 0: goto L85;
                case 1: goto L7b;
                case 2: goto L71;
                case 3: goto L67;
                case 4: goto L5d;
                case 5: goto L53;
                case 6: goto L49;
                default: goto L48;
            }
        L48:
            goto L8f
        L49:
            r7 = 7
            r1.z = r7     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            java.lang.Object r5 = r5.f(r6, r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            if (r5 != r2) goto L8f
            goto L8e
        L53:
            r7 = 6
            r1.z = r7     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            java.lang.Object r5 = r5.k(r6, r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            if (r5 != r2) goto L8f
            goto L8e
        L5d:
            r7 = 5
            r1.z = r7     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            java.lang.Object r5 = r5.i(r6, r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            if (r5 != r2) goto L8f
            goto L8e
        L67:
            r7 = 4
            r1.z = r7     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            java.lang.Object r5 = r5.h(r6, r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            if (r5 != r2) goto L8f
            goto L8e
        L71:
            r7 = 3
            r1.z = r7     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            java.lang.Object r5 = r5.g(r6, r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            if (r5 != r2) goto L8f
            goto L8e
        L7b:
            r7 = 2
            r1.z = r7     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            java.lang.Object r5 = r5.l(r6, r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            if (r5 != r2) goto L8f
            goto L8e
        L85:
            r7 = 1
            r1.z = r7     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            java.lang.Object r5 = r5.j(r6, r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8f
            if (r5 != r2) goto L8f
        L8e:
            return r2
        L8f:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0.setValue(r5)
            goto L9b
        L95:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r0.setValue(r6)
            throw r5
        L9b:
            kotlin.y r5 = kotlin.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.b1.e(com.app.mlounge.ui.viewmodel.b1, java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079 A[PHI: r10
  0x0079: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v5 java.lang.String) binds: [B:28:0x0060, B:33:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x007c A[Catch: Exception -> 0x00c3, TryCatch #0 {Exception -> 0x00c3, blocks: (B:13:0x002f, B:40:0x0092, B:42:0x0096, B:46:0x009e, B:48:0x00a3, B:50:0x00a9, B:52:0x00af, B:54:0x00b3, B:56:0x00b9, B:57:0x00bd, B:18:0x003c, B:32:0x006f, B:37:0x007c, B:58:0x00c0, B:21:0x0042, B:27:0x005a, B:29:0x0062, B:24:0x004d), top: B:62:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0 A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c3, blocks: (B:13:0x002f, B:40:0x0092, B:42:0x0096, B:46:0x009e, B:48:0x00a3, B:50:0x00a9, B:52:0x00af, B:54:0x00b3, B:56:0x00b9, B:57:0x00bd, B:18:0x003c, B:32:0x006f, B:37:0x007c, B:58:0x00c0, B:21:0x0042, B:27:0x005a, B:29:0x0062, B:24:0x004d), top: B:62:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        if (r11 == r8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.String r10, kotlin.coroutines.jvm.internal.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.app.mlounge.ui.viewmodel.t0
            if (r0 == 0) goto L13
            r0 = r11
            com.app.mlounge.ui.viewmodel.t0 r0 = (com.app.mlounge.ui.viewmodel.t0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            com.app.mlounge.ui.viewmodel.t0 r0 = new com.app.mlounge.ui.viewmodel.t0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.y
            int r1 = r0.A
            kotlin.collections.w r2 = kotlin.collections.w.e
            kotlinx.coroutines.flow.MutableStateFlow r3 = r9.t
            com.app.mlounge.data.local.prefs.y1 r4 = r9.g
            r5 = 3
            r6 = 2
            r7 = 1
            kotlin.coroutines.intrinsics.a r8 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L46
            if (r1 == r7) goto L40
            if (r1 == r6) goto L3a
            if (r1 != r5) goto L33
            kotlin.a.e(r11)     // Catch: java.lang.Exception -> Lc3
            goto L92
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r10)
            r10 = 0
            return r10
        L3a:
            java.lang.String r10 = r0.e
            kotlin.a.e(r11)     // Catch: java.lang.Exception -> Lc3
            goto L6f
        L40:
            java.lang.String r10 = r0.e
            kotlin.a.e(r11)     // Catch: java.lang.Exception -> Lc3
            goto L5a
        L46:
            kotlin.a.e(r11)
            r9.W = r7
            r9.X = r7
            kotlinx.coroutines.flow.Flow r11 = r4.c     // Catch: java.lang.Exception -> Lc3
            r0.e = r10     // Catch: java.lang.Exception -> Lc3
            r0.A = r7     // Catch: java.lang.Exception -> Lc3
            java.lang.Object r11 = kotlinx.coroutines.flow.FlowKt.first(r11, r0)     // Catch: java.lang.Exception -> Lc3
            if (r11 != r8) goto L5a
            goto L91
        L5a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Exception -> Lc3
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Exception -> Lc3
            if (r11 == 0) goto L79
            kotlinx.coroutines.flow.Flow r11 = r4.e     // Catch: java.lang.Exception -> Lc3
            r0.e = r10     // Catch: java.lang.Exception -> Lc3
            r0.A = r6     // Catch: java.lang.Exception -> Lc3
            java.lang.Object r11 = kotlinx.coroutines.flow.FlowKt.first(r11, r0)     // Catch: java.lang.Exception -> Lc3
            if (r11 != r8) goto L6f
            goto L91
        L6f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Exception -> Lc3
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Exception -> Lc3
            if (r11 == 0) goto L79
            r11 = r7
            goto L7a
        L79:
            r11 = 0
        L7a:
            if (r11 == 0) goto Lc0
            com.app.mlounge.data.repository.r r11 = r9.c     // Catch: java.lang.Exception -> Lc3
            kotlinx.coroutines.flow.MutableStateFlow r1 = r9.L     // Catch: java.lang.Exception -> Lc3
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> Lc3
            com.app.mlounge.data.repository.a r1 = (com.app.mlounge.data.repository.a) r1     // Catch: java.lang.Exception -> Lc3
            r4 = 0
            r0.e = r4     // Catch: java.lang.Exception -> Lc3
            r0.A = r5     // Catch: java.lang.Exception -> Lc3
            java.lang.Object r11 = com.app.mlounge.data.repository.r.d(r11, r1, r10, r7, r0)     // Catch: java.lang.Exception -> Lc3
            if (r11 != r8) goto L92
        L91:
            return r8
        L92:
            com.app.mlounge.data.remote.model.EpornerSearchDetails r11 = (com.app.mlounge.data.remote.model.EpornerSearchDetails) r11     // Catch: java.lang.Exception -> Lc3
            if (r11 == 0) goto L9e
            java.util.List r10 = r11.c()     // Catch: java.lang.Exception -> Lc3
            if (r10 != 0) goto L9d
            goto L9e
        L9d:
            r2 = r10
        L9e:
            r3.setValue(r2)     // Catch: java.lang.Exception -> Lc3
            if (r11 == 0) goto Lae
            java.lang.Integer r10 = r11.a()     // Catch: java.lang.Exception -> Lc3
            if (r10 == 0) goto Lae
            int r10 = r10.intValue()     // Catch: java.lang.Exception -> Lc3
            goto Laf
        Lae:
            r10 = r7
        Laf:
            r9.W = r10     // Catch: java.lang.Exception -> Lc3
            if (r11 == 0) goto Lbd
            java.lang.Integer r10 = r11.b()     // Catch: java.lang.Exception -> Lc3
            if (r10 == 0) goto Lbd
            int r7 = r10.intValue()     // Catch: java.lang.Exception -> Lc3
        Lbd:
            r9.X = r7     // Catch: java.lang.Exception -> Lc3
            goto Lc3
        Lc0:
            r3.setValue(r2)     // Catch: java.lang.Exception -> Lc3
        Lc3:
            kotlin.y r10 = kotlin.y.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.b1.f(java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, kotlin.coroutines.jvm.internal.c cVar) {
        u0 u0Var;
        List listA;
        Integer numB;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i = u0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                u0Var.z = i - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar);
            }
        } else {
            u0Var = new u0(this, cVar);
        }
        Object objE = u0Var.e;
        int i2 = u0Var.z;
        int iIntValue = 1;
        try {
            if (i2 == 0) {
                kotlin.a.e(objE);
                this.U = 1;
                this.V = false;
                com.app.mlounge.data.repository.r rVar = this.c;
                u0Var.z = 1;
                objE = com.app.mlounge.data.repository.r.e(rVar, str, 1, u0Var);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(objE);
            }
            HiAnimeResponse hiAnimeResponse = (HiAnimeResponse) objE;
            MutableStateFlow mutableStateFlow = this.n;
            HiAnimeSearchData hiAnimeSearchData = (HiAnimeSearchData) hiAnimeResponse.a();
            if (hiAnimeSearchData == null || (listA = hiAnimeSearchData.a()) == null) {
                listA = kotlin.collections.w.e;
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (hashSet.add(((HiAnimeItem) obj).b())) {
                    arrayList.add(obj);
                }
            }
            mutableStateFlow.setValue(arrayList);
            HiAnimeSearchData hiAnimeSearchData2 = (HiAnimeSearchData) hiAnimeResponse.a();
            if (hiAnimeSearchData2 != null && (numB = hiAnimeSearchData2.b()) != null) {
                iIntValue = numB.intValue();
            }
            this.U = iIntValue;
            HiAnimeSearchData hiAnimeSearchData3 = (HiAnimeSearchData) hiAnimeResponse.a();
            this.V = hiAnimeSearchData3 != null ? kotlin.jvm.internal.l.a(hiAnimeSearchData3.c(), Boolean.TRUE) : false;
        } catch (Exception unused) {
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r9 == r6) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r8, kotlin.coroutines.jvm.internal.c r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.b1.h(java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[Catch: Exception -> 0x00e0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e0, blocks: (B:13:0x0033, B:35:0x00ac, B:37:0x00b4), top: B:77:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9 A[Catch: Exception -> 0x019c, TryCatch #2 {Exception -> 0x019c, blocks: (B:47:0x00e1, B:48:0x00f3, B:50:0x00f9, B:52:0x0122, B:53:0x0126, B:54:0x0145, B:56:0x014b, B:58:0x0165, B:60:0x016f, B:71:0x0195, B:63:0x0177, B:64:0x017b, B:66:0x0181, B:68:0x018e, B:72:0x0199, B:18:0x0041, B:24:0x0060, B:25:0x0071, B:27:0x0077, B:21:0x0048), top: B:81:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[Catch: Exception -> 0x019c, TryCatch #2 {Exception -> 0x019c, blocks: (B:47:0x00e1, B:48:0x00f3, B:50:0x00f9, B:52:0x0122, B:53:0x0126, B:54:0x0145, B:56:0x014b, B:58:0x0165, B:60:0x016f, B:71:0x0195, B:63:0x0177, B:64:0x017b, B:66:0x0181, B:68:0x018e, B:72:0x0199, B:18:0x0041, B:24:0x0060, B:25:0x0071, B:27:0x0077, B:21:0x0048), top: B:81:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0165 A[Catch: Exception -> 0x019c, TryCatch #2 {Exception -> 0x019c, blocks: (B:47:0x00e1, B:48:0x00f3, B:50:0x00f9, B:52:0x0122, B:53:0x0126, B:54:0x0145, B:56:0x014b, B:58:0x0165, B:60:0x016f, B:71:0x0195, B:63:0x0177, B:64:0x017b, B:66:0x0181, B:68:0x018e, B:72:0x0199, B:18:0x0041, B:24:0x0060, B:25:0x0071, B:27:0x0077, B:21:0x0048), top: B:81:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x016d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177 A[Catch: Exception -> 0x019c, TryCatch #2 {Exception -> 0x019c, blocks: (B:47:0x00e1, B:48:0x00f3, B:50:0x00f9, B:52:0x0122, B:53:0x0126, B:54:0x0145, B:56:0x014b, B:58:0x0165, B:60:0x016f, B:71:0x0195, B:63:0x0177, B:64:0x017b, B:66:0x0181, B:68:0x018e, B:72:0x0199, B:18:0x0041, B:24:0x0060, B:25:0x0071, B:27:0x0077, B:21:0x0048), top: B:81:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0181 A[Catch: Exception -> 0x019c, TryCatch #2 {Exception -> 0x019c, blocks: (B:47:0x00e1, B:48:0x00f3, B:50:0x00f9, B:52:0x0122, B:53:0x0126, B:54:0x0145, B:56:0x014b, B:58:0x0165, B:60:0x016f, B:71:0x0195, B:63:0x0177, B:64:0x017b, B:66:0x0181, B:68:0x018e, B:72:0x0199, B:18:0x0041, B:24:0x0060, B:25:0x0071, B:27:0x0077, B:21:0x0048), top: B:81:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00f9, please report this as an issue */
    public final Object i(String str, kotlin.coroutines.jvm.internal.c cVar) {
        w0 w0Var;
        ArrayList arrayList;
        List listA;
        String str2;
        ArrayList arrayList2;
        HashSet hashSet;
        ArrayList arrayList3;
        List listK;
        ArrayList arrayList4;
        Locale locale;
        String upperCase;
        String strA;
        String upperCase2;
        Iterator it;
        String str3;
        IptvChannel iptvChannel;
        String str4 = str;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i = w0Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                w0Var.B = i - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        Object objU = w0Var.z;
        int i2 = w0Var.B;
        List listO = kotlin.collections.w.e;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            try {
                if (i2 == 0) {
                    kotlin.a.e(objU);
                    com.app.mlounge.data.local.dao.i iVar = this.e;
                    w0Var.e = str4;
                    w0Var.B = 1;
                    objU = okhttp3.internal.platform.android.g.u(((com.app.mlounge.data.local.dao.j) iVar).a, true, false, new androidx.compose.material3.r(str4, 27), w0Var);
                    if (objU == aVar) {
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList2 = w0Var.y;
                    str2 = w0Var.e;
                    try {
                        kotlin.a.e(objU);
                        listA = ((NtvChannelsResponse) objU).a();
                        if (listA != null) {
                            this.P = listA;
                        } else {
                            listA = null;
                        }
                        arrayList = arrayList2;
                        str4 = str2;
                        if (listA == null) {
                            listA = listO;
                        }
                        listO = kotlin.sequences.k.O(kotlin.sequences.k.N(new kotlin.sequences.g(new kotlin.collections.u(listA, 0), true, new com.app.mlounge.data.local.dao.l(str4, 5)), new q0(0)));
                    } catch (Exception unused) {
                        arrayList = arrayList2;
                    }
                    ArrayList arrayListO = kotlin.collections.p.O(listO, arrayList);
                    hashSet = new HashSet();
                    arrayList3 = new ArrayList();
                    for (Object obj : arrayListO) {
                        iptvChannel = (IptvChannel) obj;
                        if (hashSet.add(iptvChannel.c() + "_" + iptvChannel.d())) {
                            arrayList3.add(obj);
                        }
                    }
                    listK = kotlin.collections.q.k("18+", "XXX", "ADULT", "PORN", "EROTIC", "SEX");
                    MutableStateFlow mutableStateFlow = this.p;
                    arrayList4 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        IptvChannel iptvChannel2 = (IptvChannel) obj2;
                        String strC = iptvChannel2.c();
                        locale = Locale.ROOT;
                        upperCase = strC.toUpperCase(locale);
                        upperCase.getClass();
                        strA = iptvChannel2.a();
                        if (strA != null) {
                            upperCase2 = strA.toUpperCase(locale);
                            upperCase2.getClass();
                        } else {
                            upperCase2 = "";
                        }
                        if (listK.isEmpty()) {
                            it = listK.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    str3 = (String) it.next();
                                    if (kotlin.text.k.z(upperCase, str3, false) && !kotlin.text.k.z(upperCase2, str3, false)) {
                                    }
                                }
                            }
                        }
                        arrayList4.add(obj2);
                    }
                    mutableStateFlow.setValue(arrayList4);
                    return kotlin.y.a;
                }
                str4 = w0Var.e;
                kotlin.a.e(objU);
                listA = this.P;
                if (listA == null) {
                    NtvApi ntvApi = this.f;
                    w0Var.e = str4;
                    w0Var.y = arrayList;
                    w0Var.B = 2;
                    objU = ntvApi.getChannels(w0Var);
                    if (objU != aVar) {
                        str2 = str4;
                        arrayList2 = arrayList;
                        listA = ((NtvChannelsResponse) objU).a();
                        if (listA != null) {
                            this.P = listA;
                        } else {
                            listA = null;
                        }
                        arrayList = arrayList2;
                        str4 = str2;
                        if (listA == null) {
                            listA = listO;
                        }
                    }
                    return aVar;
                }
                listO = kotlin.sequences.k.O(kotlin.sequences.k.N(new kotlin.sequences.g(new kotlin.collections.u(listA, 0), true, new com.app.mlounge.data.local.dao.l(str4, 5)), new q0(0)));
            } catch (Exception unused2) {
                arrayList2 = arrayList;
                arrayList = arrayList2;
            }
            Iterable<com.app.mlounge.data.local.entity.d> iterable = (Iterable) objU;
            arrayList = new ArrayList(kotlin.collections.r.p(iterable, 10));
            for (com.app.mlounge.data.local.entity.d dVar : iterable) {
                arrayList.add(new IptvChannel(dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g));
            }
            ArrayList arrayListO2 = kotlin.collections.p.O(listO, arrayList);
            hashSet = new HashSet();
            arrayList3 = new ArrayList();
            while (r1.hasNext()) {
                iptvChannel = (IptvChannel) obj;
                if (hashSet.add(iptvChannel.c() + "_" + iptvChannel.d())) {
                    arrayList3.add(obj);
                }
            }
            listK = kotlin.collections.q.k("18+", "XXX", "ADULT", "PORN", "EROTIC", "SEX");
            MutableStateFlow mutableStateFlow2 = this.p;
            arrayList4 = new ArrayList();
            while (r3.hasNext()) {
                IptvChannel iptvChannel3 = (IptvChannel) obj2;
                String strC2 = iptvChannel3.c();
                locale = Locale.ROOT;
                upperCase = strC2.toUpperCase(locale);
                upperCase.getClass();
                strA = iptvChannel3.a();
                if (strA != null) {
                    upperCase2 = strA.toUpperCase(locale);
                    upperCase2.getClass();
                } else {
                    upperCase2 = "";
                }
                if (listK.isEmpty()) {
                    it = listK.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            str3 = (String) it.next();
                            if (kotlin.text.k.z(upperCase, str3, false)) {
                            }
                        }
                    }
                }
                arrayList4.add(obj2);
            }
            mutableStateFlow2.setValue(arrayList4);
        } catch (Exception unused3) {
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075 A[PHI: r8
  0x0075: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:28:0x005c, B:33:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r9 == r6) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.String r8, kotlin.coroutines.jvm.internal.c r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.b1.j(java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, kotlin.coroutines.jvm.internal.c cVar) {
        y0 y0Var;
        String str2;
        MusicSearchResponse musicSearchResponse;
        MusicSearchResponse musicSearchResponse2;
        Object objA;
        MusicSearchResponse musicSearchResponse3;
        MusicSearchResponse musicSearchResponse4;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i = y0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                y0Var.C = i - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        Object objA2 = y0Var.A;
        int i2 = y0Var.C;
        com.app.mlounge.data.repository.a0 a0Var = this.d;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                kotlin.a.e(objA2);
                this.e0 = null;
                this.f0 = false;
                y0Var.e = str;
                y0Var.C = 1;
                objA2 = a0Var.a(str, "songs", null, y0Var);
                if (objA2 == aVar) {
                }
                return aVar;
            }
            if (i2 == 1) {
                str = y0Var.e;
                kotlin.a.e(objA2);
            } else {
                if (i2 == 2) {
                    musicSearchResponse = y0Var.y;
                    str2 = y0Var.e;
                    kotlin.a.e(objA2);
                    musicSearchResponse2 = (MusicSearchResponse) objA2;
                    y0Var.e = null;
                    y0Var.y = musicSearchResponse;
                    y0Var.z = musicSearchResponse2;
                    y0Var.C = 3;
                    objA = a0Var.a(str2, "artists", null, y0Var);
                    if (objA != aVar) {
                        musicSearchResponse3 = musicSearchResponse;
                        musicSearchResponse4 = musicSearchResponse2;
                        objA2 = objA;
                    }
                    return aVar;
                }
                if (i2 != 3) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                musicSearchResponse4 = y0Var.z;
                musicSearchResponse3 = y0Var.y;
                kotlin.a.e(objA2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(((MusicSearchResponse) objA2).b());
            arrayList.addAll(musicSearchResponse4.a());
            arrayList.addAll(musicSearchResponse3.d());
            this.r.setValue(arrayList);
            this.e0 = musicSearchResponse4.c();
            this.f0 = musicSearchResponse4.c() != null;
            return kotlin.y.a;
            MusicSearchResponse musicSearchResponse5 = (MusicSearchResponse) objA2;
            y0Var.e = str;
            y0Var.y = musicSearchResponse5;
            y0Var.C = 2;
            Object objA3 = a0Var.a(str, "albums", null, y0Var);
            if (objA3 != aVar) {
                str2 = str;
                musicSearchResponse = musicSearchResponse5;
                objA2 = objA3;
                musicSearchResponse2 = (MusicSearchResponse) objA2;
                y0Var.e = null;
                y0Var.y = musicSearchResponse;
                y0Var.z = musicSearchResponse2;
                y0Var.C = 3;
                objA = a0Var.a(str2, "artists", null, y0Var);
                if (objA != aVar) {
                    musicSearchResponse3 = musicSearchResponse;
                    musicSearchResponse4 = musicSearchResponse2;
                    objA2 = objA;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(((MusicSearchResponse) objA2).b());
                    arrayList2.addAll(musicSearchResponse4.a());
                    arrayList2.addAll(musicSearchResponse3.d());
                    this.r.setValue(arrayList2);
                    this.e0 = musicSearchResponse4.c();
                    this.f0 = musicSearchResponse4.c() != null;
                    return kotlin.y.a;
                }
            }
            return aVar;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, kotlin.coroutines.jvm.internal.c cVar) {
        z0 z0Var;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i = z0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                z0Var.z = i - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        Object objSearchTvShows = z0Var.e;
        int i2 = z0Var.z;
        try {
            if (i2 == 0) {
                kotlin.a.e(objSearchTvShows);
                this.S = 1;
                this.T = 1;
                com.app.mlounge.data.repository.j0 j0Var = this.b;
                z0Var.z = 1;
                objSearchTvShows = j0Var.a.searchTvShows(str, 1, z0Var);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objSearchTvShows == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(objSearchTvShows);
            }
            TmdbPagedResponse tmdbPagedResponse = (TmdbPagedResponse) objSearchTvShows;
            MutableStateFlow mutableStateFlow = this.l;
            List listB = tmdbPagedResponse.b();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB) {
                if (hashSet.add(new Integer(((TmdbTvShow) obj).b()))) {
                    arrayList.add(obj);
                }
            }
            mutableStateFlow.setValue(arrayList);
            this.S = tmdbPagedResponse.a();
            this.T = tmdbPagedResponse.c();
        } catch (Exception unused) {
        }
        return kotlin.y.a;
    }

    public final void m(String str) {
        str.getClass();
        this.h.setValue(str);
        Job job = this.O;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (str.length() >= 2) {
            this.O = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), null, null, new a1(this, str, null, 3), 3, null);
            return;
        }
        MutableStateFlow mutableStateFlow = this.j;
        kotlin.collections.w wVar = kotlin.collections.w.e;
        mutableStateFlow.setValue(wVar);
        this.l.setValue(wVar);
        this.n.setValue(wVar);
        this.p.setValue(wVar);
        this.t.setValue(wVar);
        this.v.setValue(wVar);
        this.x.setValue(wVar);
        this.z.setValue(wVar);
        this.r.setValue(wVar);
    }
}
