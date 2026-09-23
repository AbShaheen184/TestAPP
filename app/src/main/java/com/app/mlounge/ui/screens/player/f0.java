package com.app.mlounge.ui.screens.player;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Map E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ a1 e;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a1 a1Var, String str, String str2, boolean z, int i, int i2, int i3, Map map, String str3, String str4, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = a1Var;
        this.y = str;
        this.z = str2;
        this.A = z;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = map;
        this.F = str3;
        this.G = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new f0(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
        kotlin.y yVar = kotlin.y.a;
        f0Var.invokeSuspend(yVar);
        return yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        androidx.media3.exoplayer.g gVar;
        Object value2;
        kotlin.a.e(obj);
        a1 a1Var = this.e;
        String str = this.y;
        String str2 = this.z;
        boolean z2 = this.A;
        int i = this.B;
        int i2 = this.C;
        int i3 = this.D;
        Map map = this.E;
        String str3 = this.F;
        String str4 = this.G;
        MutableStateFlow mutableStateFlow = a1Var.g;
        if (a1Var.i == null) {
            a1Var.n = str;
            a1Var.o = str2;
            a1Var.p = str3;
            a1Var.s = str4;
            a1Var.t = false;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -536870913, 7)));
            if (kotlin.text.k.J(str)) {
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, p0.a((p0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, "No playable link found.", null, false, false, null, null, false, false, false, 0, 0L, -8388609, 7)));
            } else {
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "Playing url=" + str + " headers=" + map);
                com.app.mlounge.util.a.h("play_type", str3);
                com.app.mlounge.util.a.h("play_url", com.app.mlounge.util.a.i(str));
                com.app.mlounge.util.a.f("play " + str3 + " " + com.app.mlounge.util.a.i(str));
                com.app.mlounge.util.a.g("CinemaHQ-Player", "play-start");
                if (z2) {
                    HashMap map2 = new HashMap();
                    z = true;
                    map2.put(androidx.media3.exoplayer.analytics.k.c.a, 144179200);
                    _COROUTINE.a.A(!false);
                    androidx.media3.exoplayer.g.a("bufferForPlaybackMs", 3000, "0", 0);
                    androidx.media3.exoplayer.g.a("bufferForPlaybackAfterRebufferMs", 5000, "0", 0);
                    androidx.media3.exoplayer.g.a("minBufferMs", 15000, "bufferForPlaybackMs", 3000);
                    androidx.media3.exoplayer.g.a("minBufferMs", 15000, "bufferForPlaybackAfterRebufferMs", 5000);
                    androidx.media3.exoplayer.g.a("maxBufferMs", 50000, "minBufferMs", 15000);
                    _COROUTINE.a.A(!false);
                    _COROUTINE.a.A(!false);
                    gVar = new androidx.media3.exoplayer.g(new androidx.media3.exoplayer.upstream.d(), 15000, 15000, 50000, 50000, 3000, 3000, 5000, 5000, -1, true, true, map2);
                } else {
                    z = true;
                    HashMap map3 = new HashMap();
                    map3.put(androidx.media3.exoplayer.analytics.k.c.a, 144179200);
                    _COROUTINE.a.A(!false);
                    androidx.media3.exoplayer.g.a("bufferForPlaybackMs", 500, "0", 0);
                    androidx.media3.exoplayer.g.a("bufferForPlaybackAfterRebufferMs", 2000, "0", 0);
                    androidx.media3.exoplayer.g.a("minBufferMs", 8000, "bufferForPlaybackMs", 500);
                    androidx.media3.exoplayer.g.a("minBufferMs", 8000, "bufferForPlaybackAfterRebufferMs", 2000);
                    androidx.media3.exoplayer.g.a("maxBufferMs", 30000, "minBufferMs", 8000);
                    _COROUTINE.a.A(!false);
                    _COROUTINE.a.A(!false);
                    gVar = new androidx.media3.exoplayer.g(new androidx.media3.exoplayer.upstream.d(), 8000, 8000, 30000, 30000, 500, 500, 2000, 2000, -1, true, true, map3);
                }
                Context context2 = a1Var.f;
                context2.getClass();
                androidx.media3.exoplayer.k kVar = new androidx.media3.exoplayer.k(context2, new androidx.work.impl.k(context2, 9));
                _COROUTINE.a.A(!kVar.z);
                kVar.f = new androidx.activity.y(gVar, 4);
                long j = a1Var.r;
                _COROUTINE.a.o(j > 0 ? z : false);
                _COROUTINE.a.A(!kVar.z);
                kVar.o = j;
                long j2 = a1Var.r;
                _COROUTINE.a.o(j2 > 0 ? z : false);
                _COROUTINE.a.A(!kVar.z);
                kVar.p = j2;
                _COROUTINE.a.A(!kVar.z);
                boolean z3 = z;
                kVar.z = z3;
                androidx.media3.exoplayer.c0 c0Var = new androidx.media3.exoplayer.c0(kVar);
                androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) c0Var.t();
                jVar.getClass();
                androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVar);
                int i4 = 3;
                iVar.i(3, z3);
                c0Var.O(iVar.a());
                a1Var.i = c0Var;
                c0Var.m.a(new z0(a1Var));
                kotlin.coroutines.d dVar = null;
                if (!kotlin.text.k.J(str2)) {
                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a1Var), Dispatchers.getIO(), null, new androidx.room.s(a1Var, str2, dVar, 15), 2, null);
                }
                Job job = a1Var.j;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                a1Var.j = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(a1Var), null, null, new x0(a1Var, dVar, i4), 3, null);
                a1Var.f(str, map, str3, i, i2, i3);
            }
        }
        return kotlin.y.a;
    }
}
