package com.app.mlounge.ui.screens.player;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import androidx.compose.foundation.gestures.p2;
import com.app.mlounge.data.local.prefs.y1;
import java.io.File;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends androidx.lifecycle.a {
    public final com.app.mlounge.data.local.dao.k b;
    public final com.app.mlounge.data.repository.r c;
    public final com.app.mlounge.data.remote.ntv.q d;
    public final okhttp3.y e;
    public final Context f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public androidx.media3.exoplayer.c0 i;
    public Job j;
    public Job k;
    public Job l;
    public final ArrayList m;
    public String n;
    public String o;
    public String p;
    public long q;
    public long r;
    public String s;
    public boolean t;
    public com.app.mlounge.data.remote.ntv.d u;
    public androidx.localbroadcastmanager.content.b v;
    public androidx.media3.extractor.q w;
    public okhttp3.y x;

    public a1(com.app.mlounge.data.local.dao.k kVar, com.app.mlounge.data.repository.r rVar, y1 y1Var, com.app.mlounge.data.remote.ntv.q qVar, okhttp3.y yVar, Application application) {
        rVar.getClass();
        y1Var.getClass();
        qVar.getClass();
        yVar.getClass();
        this.b = kVar;
        this.c = rVar;
        this.d = qVar;
        this.e = yVar;
        this.f = application.getApplicationContext();
        int iArgb = Color.argb(128, 0, 0, 0);
        kotlin.collections.w wVar = kotlin.collections.w.e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new p0(true, true, true, false, false, false, false, false, 0L, 0L, 0L, wVar, wVar, null, false, 16.0f, -1, iArgb, 0L, null, false, false, null, null, null, true, false, false, null, null, true, false, false, 0, 30000L));
        this.g = MutableStateFlow;
        this.h = FlowKt.asStateFlow(MutableStateFlow);
        this.m = new ArrayList();
        this.n = "";
        this.o = "";
        this.p = "tv";
        this.q = 30000L;
        this.r = 30000L;
        this.s = "";
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), null, null, new x0(this, null, 0), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object e(a1 a1Var, c1 c1Var, String str, long j, kotlin.coroutines.jvm.internal.c cVar) {
        q0 q0Var;
        Context context;
        kotlin.y yVar;
        boolean z;
        String strS;
        String str2;
        long j2;
        androidx.localbroadcastmanager.content.b bVar;
        c1 c1Var2;
        File file;
        Iterator it;
        kotlin.y yVar2;
        Exception e;
        String str3;
        MutableStateFlow mutableStateFlow = a1Var.g;
        Context context2 = a1Var.f;
        kotlin.y yVar3 = kotlin.y.a;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i = q0Var.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                q0Var.E = i - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(a1Var, cVar);
            }
        } else {
            q0Var = new q0(a1Var, cVar);
        }
        q0 q0Var2 = q0Var;
        Object obj = q0Var2.C;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = q0Var2.E;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.localbroadcastmanager.content.b bVar2 = a1Var.v;
            if (bVar2 == null || str == null) {
                return yVar3;
            }
            Context context3 = com.app.mlounge.util.a.a;
            int length = str.length();
            String str4 = c1Var.c;
            String str5 = c1Var.b;
            context = context2;
            com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "applySubtitleInternal: content length=" + length + ", lang=" + str4);
            kotlin.sequences.g gVar = new kotlin.sequences.g(new kotlin.collections.u(str, 3), true, new com.app.mlounge.ui.t(21));
            Iterator it2 = (gVar instanceof kotlin.sequences.d ? ((kotlin.sequences.d) gVar).take() : new kotlin.sequences.m(gVar)).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    yVar = yVar3;
                    z = true;
                    if (!kotlin.text.k.z(str5, ".vtt", true)) {
                        strS = str;
                        break;
                    }
                    strS = kotlin.text.r.s(str, "\ufeff", "", false);
                    if (!kotlin.text.r.u(kotlin.text.k.i0(strS).toString(), "WEBVTT", true)) {
                        strS = "WEBVTT\n\n".concat(strS);
                        break;
                    }
                    break;
                }
                String str6 = (String) it2.next();
                Pattern patternCompile = Pattern.compile("\\{\\d+\\}\\{\\d+\\}.*");
                patternCompile.getClass();
                String string = kotlin.text.k.g0(str6).toString();
                string.getClass();
                if (patternCompile.matcher(string).matches()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it3 = kotlin.text.k.M(str).iterator();
                    int i3 = 1;
                    while (it3.hasNext()) {
                        String string2 = kotlin.text.k.g0((String) it3.next()).toString();
                        if (string2.length() == 0) {
                            it = it3;
                            yVar2 = yVar3;
                        } else {
                            it = it3;
                            yVar2 = yVar3;
                            kotlin.text.g gVarS = androidx.compose.runtime.j.s("\\{(\\d+)\\}\\{(\\d+)\\}(.*)", 0, string2, string2);
                            if (gVarS != null) {
                                long j3 = Long.parseLong((String) ((kotlin.collections.d0) gVarS.a()).get(1));
                                long j4 = Long.parseLong((String) ((kotlin.collections.d0) gVarS.a()).get(2));
                                String strS2 = kotlin.text.r.s(kotlin.text.k.g0((String) ((kotlin.collections.d0) gVarS.a()).get(3)).toString(), "|", "\n", false);
                                int i4 = i3 + 1;
                                sb.append(i3);
                                sb.append('\n');
                                sb.append(o0.c(j3) + " --> " + o0.c(j4));
                                sb.append('\n');
                                sb.append(strS2);
                                sb.append("\n\n");
                                i3 = i4;
                            }
                        }
                        it3 = it;
                        yVar3 = yVar2;
                    }
                    yVar = yVar3;
                    strS = sb.toString();
                    z = true;
                    break;
                }
            }
            if (kotlin.text.k.z(str5, ".vtt", z)) {
                str2 = "vtt";
            } else {
                str2 = (kotlin.text.k.z(str5, ".ass", z) || kotlin.text.k.z(str5, ".ssa", z)) ? "ass" : "srt";
            }
            File file2 = new File(context.getCacheDir(), "active_sub.".concat(str2));
            try {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                androidx.compose.foundation.text.input.internal.k kVar = new androidx.compose.foundation.text.input.internal.k(file2, strS, null, 10);
                q0Var2.e = c1Var;
                q0Var2.y = bVar2;
                q0Var2.z = str2;
                q0Var2.A = file2;
                j2 = j;
                q0Var2.B = j2;
                q0Var2.E = 1;
                if (BuildersKt.withContext(io2, kVar, q0Var2) != aVar) {
                    bVar = bVar2;
                    c1Var2 = c1Var;
                    file = file2;
                }
            } catch (Exception e2) {
                e = e2;
                Context context4 = com.app.mlounge.util.a.a;
                androidx.room.b0.h("Failed to write subtitle file: ", e.getMessage(), "E", "CinemaHQ-Player");
                return yVar;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.a.e(obj);
                return obj;
            }
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = q0Var2.B;
        File file3 = q0Var2.A;
        str2 = q0Var2.z;
        androidx.localbroadcastmanager.content.b bVar3 = q0Var2.y;
        c1 c1Var3 = q0Var2.e;
        try {
            kotlin.a.e(obj);
            c1Var2 = c1Var3;
            context = context2;
            yVar = yVar3;
            bVar = bVar3;
            file = file3;
        } catch (Exception e3) {
            e = e3;
            yVar = yVar3;
            Context context5 = com.app.mlounge.util.a.a;
            androidx.room.b0.h("Failed to write subtitle file: ", e.getMessage(), "E", "CinemaHQ-Player");
            return yVar;
        }
        Context context6 = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "Wrote subtitle to " + file.getAbsolutePath());
        Uri uriFromFile = Uri.fromFile(file);
        androidx.fragment.app.h hVar = new androidx.fragment.app.h(1);
        hVar.z = uriFromFile;
        if (kotlin.jvm.internal.l.a(str2, "vtt")) {
            str3 = "text/vtt";
        } else {
            str3 = kotlin.jvm.internal.l.a(str2, "ass") ? "text/x-ssa" : "application/x-subrip";
        }
        hVar.A = androidx.media3.common.i0.p(str3);
        hVar.B = c1Var2.c;
        hVar.C = c1Var2.a;
        hVar.y = c1Var2.f ? 1 : 0;
        androidx.media3.common.b0 b0Var = new androidx.media3.common.b0(hVar);
        com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "Applying media source with sidecar subtitle");
        context.getClass();
        androidx.media3.exoplayer.source.a aVarA = o0.a(context, a1Var.n, ((p0) mutableStateFlow.getValue()).v, bVar, b0Var, ((p0) mutableStateFlow.getValue()).w, a1Var.w);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        long j5 = j2;
        p2 p2Var = new p2(a1Var, aVarA, c1Var2, j5, null);
        q0Var2.e = null;
        q0Var2.y = null;
        q0Var2.z = null;
        q0Var2.A = null;
        q0Var2.B = j5;
        q0Var2.E = 2;
        Object objWithContext = BuildersKt.withContext(main, p2Var, q0Var2);
        return objWithContext == aVar ? aVar : objWithContext;
    }

    public static void l(a1 a1Var, Float f, Integer num, Integer num2, int i) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a1Var), null, null, new androidx.compose.animation.core.f(a1Var, (i & 1) != 0 ? null : f, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, null, 18), 3, null);
    }

    @Override // androidx.lifecycle.s0
    public final void d() {
        String str;
        boolean zB;
        androidx.media3.exoplayer.c0 c0Var = this.i;
        kotlin.coroutines.d dVar = null;
        if (c0Var != null) {
            long j = c0Var.j();
            long jO = c0Var.o();
            if (jO < 0) {
                jO = 0;
            }
            if (!kotlin.text.k.J(this.o) && j > 0 && jO > 0) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new androidx.room.s(this, new com.app.mlounge.data.local.entity.e(j, jO, this.o), dVar, 17), 2, null);
            }
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(c0Var)));
            sb.append(" [AndroidXMedia3/1.10.1] [");
            sb.append(androidx.media3.common.util.i0.a);
            sb.append("] [");
            HashSet hashSet = androidx.media3.common.d0.a;
            synchronized (androidx.media3.common.d0.class) {
                str = androidx.media3.common.d0.b;
            }
            sb.append(str);
            sb.append("]");
            androidx.media3.common.util.b.k("ExoPlayerImpl", sb.toString());
            c0Var.V();
            c0Var.x.o();
            c0Var.y.b(false);
            c0Var.z.b(false);
            androidx.media3.exoplayer.b0 b0Var = c0Var.D;
            if (b0Var != null && Build.VERSION.SDK_INT >= 34) {
                androidx.media3.exoplayer.b0.a(b0Var);
            }
            androidx.compose.ui.node.a1 a1Var = c0Var.C;
            ((androidx.media3.common.util.f0) a1Var.g).a.removeCallbacksAndMessages(null);
            ((androidx.media3.exoplayer.c0) a1Var.b).D((androidx.media3.common.util.x) a1Var.c);
            androidx.media3.exoplayer.k0 k0Var = c0Var.l;
            if (k0Var.g0 || !k0Var.G.getThread().isAlive()) {
                zB = true;
            } else {
                k0Var.g0 = true;
                androidx.media3.common.util.g gVar = new androidx.media3.common.util.g(k0Var.M);
                k0Var.E.b(7, gVar).b();
                zB = gVar.b(k0Var.R);
            }
            if (!zB) {
                c0Var.m.e(10, new androidx.core.graphics.b());
            }
            c0Var.m.d();
            c0Var.j.a.removeCallbacksAndMessages(null);
            androidx.media3.exoplayer.upstream.f fVar = c0Var.t;
            androidx.media3.exoplayer.analytics.g gVar2 = c0Var.r;
            CopyOnWriteArrayList<androidx.media3.exoplayer.upstream.c> copyOnWriteArrayList = (CopyOnWriteArrayList) fVar.c.y;
            for (androidx.media3.exoplayer.upstream.c cVar : copyOnWriteArrayList) {
                if (cVar.b == gVar2) {
                    cVar.c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            androidx.media3.exoplayer.c1 c1Var = c0Var.n0;
            if (c1Var.p) {
                c0Var.n0 = c1Var.a();
            }
            androidx.media3.exoplayer.c1 c1VarY = androidx.media3.exoplayer.c0.y(c0Var.n0, 1);
            c0Var.n0 = c1VarY;
            androidx.media3.exoplayer.c1 c1VarC = c1VarY.c(c1VarY.b);
            c0Var.n0 = c1VarC;
            c1VarC.q = c1VarC.s;
            c0Var.n0.r = 0L;
            androidx.media3.exoplayer.analytics.g gVar3 = c0Var.r;
            androidx.media3.common.util.f0 f0Var = gVar3.E;
            f0Var.getClass();
            f0Var.d(new androidx.activity.l(gVar3, 16));
            c0Var.E();
            Surface surface = c0Var.U;
            if (surface != null) {
                surface.release();
                c0Var.U = null;
            }
            c0Var.d0 = androidx.media3.common.text.c.c;
            c0Var.h0 = true;
        }
        com.app.mlounge.data.remote.ntv.d dVar2 = this.u;
        if (dVar2 != null) {
            try {
                ServerSocket serverSocket = dVar2.f;
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (Exception unused) {
            }
            dVar2.f = null;
            dVar2.g.shutdownNow();
        }
        this.u = null;
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            kotlin.io.j.g((File) it.next());
        }
    }

    public final void f(String str, Map map, String str2, int i, int i2, int i3) {
        String str3;
        com.app.mlounge.data.remote.ntv.d dVar = this.u;
        kotlin.coroutines.d dVar2 = null;
        if (dVar != null) {
            try {
                ServerSocket serverSocket = dVar.f;
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (Exception unused) {
            }
            dVar.f = null;
            dVar.g.shutdownNow();
        }
        this.u = null;
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        zVar.e = str;
        kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
        zVar2.e = map;
        if (kotlin.jvm.internal.l.a(str2, "live") && kotlin.text.r.u(this.s, "ntv://", false)) {
            com.app.mlounge.data.remote.ntv.d dVar3 = new com.app.mlounge.data.remote.ntv.d(this.e, str, map == null ? kotlin.collections.x.e : map, new androidx.compose.foundation.text.selection.u0(this, dVar2, 4));
            try {
                ServerSocket serverSocket2 = new ServerSocket(0, 5, InetAddress.getByName("127.0.0.1"));
                dVar3.f = serverSocket2;
                Thread thread = new Thread(new androidx.media3.ui.c0(6, serverSocket2, dVar3), "LoopbackHlsProxy-accept");
                thread.setDaemon(true);
                thread.start();
                str3 = "http://127.0.0.1:" + serverSocket2.getLocalPort() + "/watch.m3u8";
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "LoopbackHlsProxy", "serving " + dVar3.c + " via " + str3);
            } catch (Exception e) {
                Context context2 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.d("LoopbackHlsProxy", "Failed to start loopback proxy", e);
                str3 = null;
            }
            if (str3 != null) {
                this.u = dVar3;
                zVar.e = str3;
                zVar2.e = null;
                Context context3 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "Playing via loopback proxy: ".concat(str3));
            } else {
                Context context4 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "Loopback proxy failed to start, playing direct");
            }
        }
        this.n = (String) zVar.e;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), null, null, new v0(this, str2, zVar, zVar2, i, i2, i3, null), 3, null);
    }

    public final void g() {
        long j;
        androidx.media3.exoplayer.c0 c0Var = this.i;
        if (c0Var != null) {
            long jO = c0Var.o();
            if (jO < 0) {
                jO = 0;
            }
            j = jO;
        } else {
            j = 0;
        }
        if (kotlin.text.k.J(this.o) || j <= 0) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), Dispatchers.getIO(), null, new y0(this, j, j, null, 0), 2, null);
    }

    public final void h() {
        Job job = this.k;
        kotlin.coroutines.d dVar = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.k = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), null, null, new x0(this, dVar, 2), 3, null);
    }

    public final void i(c1 c1Var) {
        a1 a1Var = this;
        c1Var.getClass();
        if (!c1Var.e) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a1Var), null, null, new androidx.compose.foundation.gestures.p0(a1Var, c1Var, (kotlin.coroutines.d) null), 3, null);
            return;
        }
        while (true) {
            MutableStateFlow mutableStateFlow = a1Var.g;
            Object value = mutableStateFlow.getValue();
            if (mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, c1Var, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -270337, 7))) {
                break;
            } else {
                a1Var = this;
            }
        }
        androidx.media3.exoplayer.c0 c0Var = this.i;
        if (c0Var != null) {
            androidx.media3.common.x0 x0Var = new androidx.media3.common.x0(((androidx.media3.common.b1) c0Var.m().a.get(c1Var.g)).b, c1Var.h);
            androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) c0Var.t();
            jVar.getClass();
            androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVar);
            iVar.i(3, false);
            iVar.e(x0Var);
            c0Var.O(iVar.a());
        }
    }

    public final void j() {
        Object value;
        MutableStateFlow mutableStateFlow = this.g;
        boolean z = ((p0) mutableStateFlow.getValue()).c;
        boolean z2 = !z;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, z2, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -5, 7)));
        if (z) {
            return;
        }
        h();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void k(String str, boolean z) {
        MutableStateFlow mutableStateFlow;
        Object value;
        p0 p0VarA;
        str.getClass();
        do {
            mutableStateFlow = this.g;
            value = mutableStateFlow.getValue();
            p0VarA = (p0) value;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals("subtitle")) {
                        p0VarA = p0.a(p0VarA, false, false, false, false, false, z, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -33, 7);
                    }
                    break;
                case -799113323:
                    if (str.equals("recovery")) {
                        p0VarA = p0.a(p0VarA, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, z, false, null, null, false, false, false, 0, 0L, -67108865, 7);
                    }
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        p0VarA = p0.a(p0VarA, false, false, false, false, z, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -17, 7);
                    }
                    break;
                case 1434631203:
                    if (str.equals("settings")) {
                        p0VarA = p0.a(p0VarA, false, false, false, false, false, false, z, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -65, 7);
                    }
                    break;
            }
        } while (!mutableStateFlow.compareAndSet(value, p0VarA));
    }
}
