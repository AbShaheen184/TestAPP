package com.appsalt.internal;

import java.security.Security;
import java.util.ArrayList;
import java.util.UUID;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.selects.SelectImplementation;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements s0 {
    public final g4 a;
    public final androidx.work.impl.k b;
    public final o0 c;
    public final androidx.compose.runtime.internal.c d;
    public final g5 e;
    public final androidx.work.impl.k f;
    public final c g;
    public final androidx.media3.exoplayer.hls.c h;
    public final CoroutineDispatcher i;
    public final CoroutineScope j;
    public CoroutineScope k;
    public String l;
    public boolean m;

    static {
        Security.addProvider(new q());
    }

    public t0(c cVar, g4 g4Var) {
        androidx.work.impl.k kVar = a0.a;
        String[] strArr = m3.a;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new n0(str, 5000));
        }
        String[] strArr2 = m3.b;
        ArrayList arrayList2 = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            arrayList2.add(new n0(str2, 5000));
        }
        o0 o0Var = new o0(arrayList, arrayList2, new p0(g4Var, (byte) 0), 5000);
        androidx.compose.runtime.internal.c cVar2 = new androidx.compose.runtime.internal.c(o0Var, new androidx.work.impl.k(g4Var), kVar);
        x2 x2Var = b0.d;
        androidx.work.impl.k kVar2 = new androidx.work.impl.k(11, kVar, new p0(g4Var, (byte) 0));
        androidx.media3.exoplayer.hls.c cVar3 = new androidx.media3.exoplayer.hls.c(g4Var, 17);
        CoroutineDispatcher coroutineDispatcherLimitedParallelism = Dispatchers.getIO().limitedParallelism(Context.VERSION_ES6);
        this.a = g4Var;
        this.b = kVar;
        this.c = o0Var;
        this.d = cVar2;
        this.e = x2Var;
        this.f = kVar2;
        this.g = cVar;
        this.h = cVar3;
        this.i = coroutineDispatcherLimitedParallelism;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcherLimitedParallelism);
        this.j = CoroutineScope;
        this.k = CoroutineScopeKt.plus(CoroutineScope, JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:38:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:42:0x020f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0216  */
    /* JADX WARN: Code duplicated, block: B:47:0x021b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0228  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public static final Enum d(t0 t0Var, kotlin.coroutines.jvm.internal.c cVar) {
        r rVar;
        kotlin.coroutines.intrinsics.a aVar;
        kotlin.coroutines.d dVar;
        int i;
        Deferred deferredAsync$default;
        Deferred deferred;
        Deferred deferred2;
        Deferred deferred3;
        t0 t0Var2;
        Object obj;
        Deferred deferred4;
        Deferred deferred5;
        Deferred deferred6;
        Deferred deferred7;
        t0 t0Var3;
        t0 t0Var4;
        g4 g4Var;
        t0 t0Var5 = t0Var;
        androidx.work.impl.k kVar = t0Var5.b;
        g4 g4Var2 = t0Var5.a;
        CoroutineDispatcher coroutineDispatcher = t0Var5.i;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i2 = rVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.E = i2 - Integer.MIN_VALUE;
            } else {
                rVar = new r(t0Var5, cVar);
            }
        } else {
            rVar = new r(t0Var5, cVar);
        }
        r rVar2 = rVar;
        Object obj2 = rVar2.C;
        int i3 = rVar2.E;
        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
        if (i3 == 0) {
            kotlin.a.e(obj2);
            Channel channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            Channel channelChannel$default2 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            Channel channelChannel$default3 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            Channel channelChannel$default4 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            aVar = aVar2;
            dVar = null;
            i = 2;
            f fVar = new f(channelChannel$default, channelChannel$default4, t0Var5.e, t0Var5.f, new p0(g4Var2, 2), kVar, t0Var5.c, coroutineDispatcher);
            f fVar2 = new f(channelChannel$default2, channelChannel$default3, t0Var5.e, t0Var5.f, new p0(g4Var2, 2), kVar, t0Var5.c, coroutineDispatcher);
            x4 x4Var = new x4(t0Var5.d, channelChannel$default3, channelChannel$default, t0Var5.a, coroutineDispatcher);
            x4 x4Var2 = new x4(t0Var5.d, channelChannel$default4, channelChannel$default2, t0Var5.a, coroutineDispatcher);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(rVar2.getContext()), null, null, new v(x4Var, dVar, 0), 3, null);
            int i4 = 1;
            Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(rVar2.getContext()), null, null, new v(x4Var2, dVar, i4), 3, null);
            Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new d0(fVar, t0Var5, dVar, 0), 3, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new d0(fVar2, t0Var5, dVar, i4), 3, null);
            SelectImplementation selectImplementation = new SelectImplementation(rVar2.getContext());
            selectImplementation.invoke(deferredAsync$default.getOnAwait(), new androidx.compose.runtime.v1(i, 3, dVar));
            selectImplementation.invoke(deferredAsync$default4.getOnAwait(), new androidx.compose.runtime.v1(i, 4, dVar));
            selectImplementation.invoke(deferredAsync$default3.getOnAwait(), new androidx.compose.runtime.v1(i, 5, dVar));
            selectImplementation.invoke(deferredAsync$default2.getOnAwait(), new androidx.compose.runtime.v1(i, 6, dVar));
            rVar2.e = t0Var5;
            rVar2.y = deferredAsync$default2;
            rVar2.z = deferredAsync$default3;
            rVar2.A = deferredAsync$default4;
            rVar2.B = deferredAsync$default;
            rVar2.E = 1;
            Object objDoSelect = selectImplementation.doSelect(rVar2);
            if (objDoSelect != aVar) {
                deferred = deferredAsync$default4;
                obj2 = objDoSelect;
                deferred2 = deferredAsync$default3;
                deferred3 = deferredAsync$default2;
            }
            return aVar;
        }
        if (i3 == 1) {
            Deferred deferred8 = (Deferred) rVar2.B;
            deferred = (Deferred) rVar2.A;
            Deferred deferred9 = (Deferred) rVar2.z;
            Deferred deferred10 = (Deferred) rVar2.y;
            t0 t0Var6 = rVar2.e;
            kotlin.a.e(obj2);
            i = 2;
            dVar = null;
            aVar = aVar2;
            deferred2 = deferred9;
            deferred3 = deferred10;
            deferredAsync$default = deferred8;
            t0Var5 = t0Var6;
        } else {
            if (i3 == 2) {
                obj = rVar2.B;
                deferred = (Deferred) rVar2.A;
                deferred5 = (Deferred) rVar2.z;
                Deferred deferred11 = (Deferred) rVar2.y;
                t0 t0Var7 = rVar2.e;
                kotlin.a.e(obj2);
                dVar = null;
                aVar = aVar2;
                deferred4 = deferred11;
                t0Var2 = t0Var7;
                rVar2.e = t0Var2;
                rVar2.y = deferred4;
                rVar2.z = deferred5;
                rVar2.A = obj;
                rVar2.B = dVar;
                rVar2.E = 3;
                if (JobKt.cancelAndJoin(deferred, rVar2) != aVar) {
                    deferred6 = deferred5;
                    rVar2.e = t0Var2;
                    rVar2.y = deferred4;
                    rVar2.z = obj;
                    rVar2.A = dVar;
                    rVar2.E = 4;
                    if (JobKt.cancelAndJoin(deferred6, rVar2) != aVar) {
                        deferred7 = deferred4;
                        t0Var3 = t0Var2;
                        rVar2.e = t0Var3;
                        rVar2.y = obj;
                        rVar2.z = dVar;
                        rVar2.E = 5;
                        if (JobKt.cancelAndJoin(deferred7, rVar2) != aVar) {
                            t0Var4 = t0Var3;
                        }
                    }
                }
                return aVar;
            }
            if (i3 == 3) {
                obj = rVar2.A;
                deferred6 = (Deferred) rVar2.z;
                Deferred deferred12 = (Deferred) rVar2.y;
                t0Var2 = rVar2.e;
                kotlin.a.e(obj2);
                deferred4 = deferred12;
                dVar = null;
                aVar = aVar2;
                rVar2.e = t0Var2;
                rVar2.y = deferred4;
                rVar2.z = obj;
                rVar2.A = dVar;
                rVar2.E = 4;
                if (JobKt.cancelAndJoin(deferred6, rVar2) != aVar) {
                    deferred7 = deferred4;
                    t0Var3 = t0Var2;
                    rVar2.e = t0Var3;
                    rVar2.y = obj;
                    rVar2.z = dVar;
                    rVar2.E = 5;
                    if (JobKt.cancelAndJoin(deferred7, rVar2) != aVar) {
                        t0Var4 = t0Var3;
                    }
                }
                return aVar;
            }
            if (i3 == 4) {
                obj = rVar2.z;
                deferred7 = (Deferred) rVar2.y;
                t0Var3 = rVar2.e;
                kotlin.a.e(obj2);
                dVar = null;
                aVar = aVar2;
                rVar2.e = t0Var3;
                rVar2.y = obj;
                rVar2.z = dVar;
                rVar2.E = 5;
                if (JobKt.cancelAndJoin(deferred7, rVar2) != aVar) {
                    t0Var4 = t0Var3;
                }
                return aVar;
            }
            if (i3 != 5) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = rVar2.y;
            t0Var4 = rVar2.e;
            kotlin.a.e(obj2);
        }
        if (kotlin.m.a(obj) == null) {
            return o1.y;
        }
        g4Var = (g4) t0Var4.h.y;
        g4Var.getClass();
        if (g4.b) {
            g4Var.a(3, "Session is restarting");
        }
        androidx.media3.exoplayer.hls.c cVar2 = t0Var4.h;
        cVar2.getClass();
        ((g4) cVar2.y).getClass();
        return o1.e;
        Object obj3 = ((kotlin.m) obj2).e;
        rVar2.e = t0Var5;
        rVar2.y = deferred3;
        rVar2.z = deferred2;
        rVar2.A = deferred;
        rVar2.B = obj3;
        rVar2.E = i;
        if (JobKt.cancelAndJoin(deferredAsync$default, rVar2) != aVar) {
            Deferred deferred13 = deferred3;
            t0Var2 = t0Var5;
            obj = obj3;
            deferred4 = deferred13;
            deferred5 = deferred2;
            rVar2.e = t0Var2;
            rVar2.y = deferred4;
            rVar2.z = deferred5;
            rVar2.A = obj;
            rVar2.B = dVar;
            rVar2.E = 3;
            if (JobKt.cancelAndJoin(deferred, rVar2) != aVar) {
                deferred6 = deferred5;
                rVar2.e = t0Var2;
                rVar2.y = deferred4;
                rVar2.z = obj;
                rVar2.A = dVar;
                rVar2.E = 4;
                if (JobKt.cancelAndJoin(deferred6, rVar2) != aVar) {
                    deferred7 = deferred4;
                    t0Var3 = t0Var2;
                    rVar2.e = t0Var3;
                    rVar2.y = obj;
                    rVar2.z = dVar;
                    rVar2.E = 5;
                    if (JobKt.cancelAndJoin(deferred7, rVar2) != aVar) {
                        t0Var4 = t0Var3;
                        if (kotlin.m.a(obj) == null) {
                            return o1.y;
                        }
                        g4Var = (g4) t0Var4.h.y;
                        g4Var.getClass();
                        if (g4.b) {
                            g4Var.a(3, "Session is restarting");
                        }
                        androidx.media3.exoplayer.hls.c cVar3 = t0Var4.h;
                        cVar3.getClass();
                        ((g4) cVar3.y).getClass();
                        return o1.e;
                    }
                }
            }
        }
        return aVar;
    }

    @Override // com.appsalt.internal.s0
    public final void a() {
        BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new l(this, null, 0), 3, null);
    }

    @Override // com.appsalt.internal.s0
    public final void b(boolean z) {
        if (this.m) {
            if (!z) {
                g4 g4Var = (g4) this.h.y;
                g4Var.getClass();
                if (g4.b) {
                    g4Var.a(3, "Session stopped");
                }
            }
            try {
                CoroutineScopeKt.cancel$default(this.k, null, 1, null);
            } catch (Throwable unused) {
            }
            this.m = false;
        }
    }

    @Override // com.appsalt.internal.s0
    public final void c(String str, boolean z) {
        x2 x2Var = (x2) this.e;
        x2Var.getClass();
        if (!kotlin.text.k.J(str)) {
            x2Var.a.o(str);
            x2Var.b.b = str;
        }
        if (this.m) {
            return;
        }
        String string = UUID.randomUUID().toString();
        this.l = string;
        if (!z) {
            if (string == null) {
                string = null;
            }
            g4 g4Var = (g4) this.h.y;
            g4Var.getClass();
            if (g4.b) {
                g4Var.a(3, "Session started " + string);
            }
        }
        try {
            CoroutineScopeKt.cancel$default(this.k, null, 1, null);
        } catch (Throwable unused) {
        }
        CoroutineScope coroutineScopePlus = CoroutineScopeKt.plus(this.j, JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
        this.k = coroutineScopePlus;
        BuildersKt__Builders_commonKt.launch$default(coroutineScopePlus, null, null, new l(this, null, 1), 3, null);
        this.m = true;
    }
}
