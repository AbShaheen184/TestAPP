package coil3;

import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import androidx.compose.animation.core.z0;
import androidx.room.coroutines.c0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final /* synthetic */ int f = 0;
    public final n a;
    public final CoroutineScope b;
    public final androidx.work.impl.k c;
    public final d d;
    public volatile /* synthetic */ int e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(p.class, "e");
    }

    public p(n nVar) {
        this.a = nVar;
        androidx.media3.exoplayer.hls.c cVar = nVar.g;
        this.b = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(new q(CoroutineExceptionHandler.Key, cVar)));
        androidx.compose.material.ripple.g gVar = new androidx.compose.material.ripple.g();
        gVar.b = new WeakReference(this);
        gVar.c = new coil3.util.a(gVar, this);
        gVar.d = new coil3.util.b(gVar);
        androidx.work.impl.k kVar = new androidx.work.impl.k(this, cVar);
        this.c = kVar;
        androidx.compose.runtime.internal.c cVar2 = new androidx.compose.runtime.internal.c(nVar.f);
        ArrayList arrayList = (ArrayList) cVar2.e;
        ArrayList arrayList2 = (ArrayList) cVar2.A;
        ArrayList arrayList3 = (ArrayList) cVar2.z;
        ArrayList arrayList4 = (ArrayList) cVar2.B;
        coil3.request.e eVar = nVar.b;
        Object obj = eVar.n.a.get(l.a);
        int i = 3;
        int i2 = 2;
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList2.add(new k(i2));
            arrayList4.add(new k(i));
        }
        int i3 = 0;
        cVar2.j(new coil3.map.a(i3), a0.a(Uri.class));
        cVar2.j(new coil3.map.a(i), a0.a(Integer.class));
        arrayList3.add(new kotlin.k(new coil3.key.a(0), a0.a(v.class)));
        cVar2.i(new coil3.fetch.a(i3), a0.a(v.class));
        cVar2.i(new coil3.fetch.a(4), a0.a(v.class));
        cVar2.i(new coil3.fetch.a(9), a0.a(v.class));
        cVar2.i(new coil3.fetch.a(6), a0.a(Drawable.class));
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e eVar2 = m.a;
        Object obj2 = eVar.n.a.get(m.a);
        Semaphore semaphoreSemaphore$default = SemaphoreKt.Semaphore$default(((Number) (obj2 == null ? 4 : obj2)).intValue(), 0, 2, null);
        int i4 = Build.VERSION.SDK_INT;
        Object obj3 = coil3.decode.n.a;
        if (i4 >= 29) {
            Object obj4 = eVar.n.a.get(m.c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = eVar.n.a.get(m.b);
                if (((coil3.decode.n) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    arrayList4.add(new c(new coil3.decode.u(semaphoreSemaphore$default), i3));
                }
            }
        }
        Object obj6 = eVar.n.a.get(m.b);
        arrayList4.add(new c(new coil3.decode.c(semaphoreSemaphore$default, (coil3.decode.n) (obj6 != null ? obj6 : obj3)), i3));
        cVar2.j(new coil3.map.a(1), a0.a(File.class));
        cVar2.i(new coil3.fetch.a(8), a0.a(v.class));
        cVar2.i(new coil3.fetch.a(3), a0.a(ByteBuffer.class));
        cVar2.j(new coil3.map.a(4), a0.a(String.class));
        int i5 = 2;
        cVar2.j(new coil3.map.a(i5), a0.a(x.class));
        arrayList3.add(new kotlin.k(new coil3.key.a(1), a0.a(v.class)));
        arrayList3.add(new kotlin.k(new coil3.key.a(2), a0.a(v.class)));
        cVar2.i(new coil3.fetch.a(7), a0.a(v.class));
        cVar2.i(new coil3.fetch.a(i5), a0.a(byte[].class));
        cVar2.i(new coil3.fetch.a(5), a0.a(v.class));
        cVar2.i(new coil3.fetch.a(1), a0.a(Bitmap.class));
        arrayList.add(new coil3.intercept.f(this, gVar, kVar, cVar));
        this.d = new d(android.support.v4.media.session.b.I(arrayList), android.support.v4.media.session.b.I((ArrayList) cVar2.y), android.support.v4.media.session.b.I(arrayList3), android.support.v4.media.session.b.I(arrayList2), android.support.v4.media.session.b.I(arrayList4));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a0 A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #4 {all -> 0x003a, blocks: (B:15:0x0035, B:94:0x0181, B:96:0x0187, B:97:0x0190, B:99:0x0194, B:102:0x01a0, B:103:0x01a7, B:22:0x004c), top: B:127:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01bb A[Catch: all -> 0x01c8, TRY_LEAVE, TryCatch #3 {all -> 0x01c8, blocks: (B:110:0x01b7, B:112:0x01bb, B:117:0x01ca, B:118:0x01cd), top: B:126:0x01b7 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01ca A[Catch: all -> 0x01c8, TRY_ENTER, TryCatch #3 {all -> 0x01c8, blocks: (B:110:0x01b7, B:112:0x01bb, B:117:0x01ca, B:118:0x01cd), top: B:126:0x01b7 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x017d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0187 A[Catch: all -> 0x003a, TryCatch #4 {all -> 0x003a, blocks: (B:15:0x0035, B:94:0x0181, B:96:0x0187, B:97:0x0190, B:99:0x0194, B:102:0x01a0, B:103:0x01a7, B:22:0x004c), top: B:127:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0190 A[Catch: all -> 0x003a, TryCatch #4 {all -> 0x003a, blocks: (B:15:0x0035, B:94:0x0181, B:96:0x0187, B:97:0x0190, B:99:0x0194, B:102:0x01a0, B:103:0x01a7, B:22:0x004c), top: B:127:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0194 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:15:0x0035, B:94:0x0181, B:96:0x0187, B:97:0x0190, B:99:0x0194, B:102:0x01a0, B:103:0x01a7, B:22:0x004c), top: B:127:0x0027 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [coil3.request.o] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r14v0, types: [coil3.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v20, types: [coil3.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [coil3.f] */
    /* JADX WARN: Type inference failed for: r3v29, types: [coil3.f] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v4, types: [coil3.f] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [coil3.request.g] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [coil3.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [coil3.request.o] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [coil3.request.o] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6, types: [coil3.request.o] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object a(coil3.request.g gVar, int i, kotlin.coroutines.jvm.internal.c cVar) {
        o oVar;
        coil3.size.i iVar;
        coil3.request.g gVarA;
        coil3.request.o oVar2;
        ?? r3;
        coil3.request.g gVar2;
        ?? r4;
        ?? r12;
        j jVar;
        coil3.request.g gVar3;
        Object objWithContext;
        ?? r5;
        ?? r6;
        coil3.request.g gVar4;
        coil3.request.j jVar2;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i2 = oVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.D = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        o oVar3 = oVar;
        Object obj = oVar3.B;
        ?? r7 = oVar3.D;
        ?? r8 = 2;
        ?? r9 = 1;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            try {
                if (r7 == 0) {
                    kotlin.a.e(obj);
                    Job job = JobKt.getJob(oVar3.getContext());
                    boolean z = i == 0;
                    androidx.work.impl.k kVar = this.c;
                    kVar.getClass();
                    coil3.target.a aVar2 = gVar.c;
                    androidx.lifecycle.p lifecycle = (androidx.lifecycle.p) l.d(gVar, coil3.request.i.e);
                    if (lifecycle == null) {
                        if (!z) {
                            lifecycle = null;
                            break;
                        }
                        Object baseContext = gVar.a;
                        while (true) {
                            if (baseContext instanceof androidx.lifecycle.v) {
                                lifecycle = ((androidx.lifecycle.v) baseContext).getLifecycle();
                                break;
                            }
                            if (!(baseContext instanceof ContextWrapper)) {
                                lifecycle = null;
                                break;
                            }
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                    coil3.request.o kVar2 = lifecycle != null ? new coil3.request.k(lifecycle, job) : new coil3.request.a(job);
                    coil3.request.d dVarA = coil3.request.g.a(gVar);
                    dVarA.b = ((p) kVar.y).a.b;
                    coil3.request.f fVar = gVar.s;
                    coil3.size.i iVar2 = fVar.g;
                    if (iVar2 == null) {
                        iVar = coil3.size.i.a;
                        dVarA.l = iVar;
                    } else {
                        iVar = iVar2;
                    }
                    if (fVar.h == null) {
                        dVarA.m = gVar.p;
                    }
                    if (fVar.i == null) {
                        dVarA.n = (iVar2 == null && kotlin.jvm.internal.l.a(iVar, coil3.size.i.a)) ? coil3.size.d.y : coil3.size.d.e;
                    }
                    gVarA = dVarA.a();
                    f fVar2 = f.a;
                    try {
                        if (gVarA.b.equals(coil3.request.l.a)) {
                            throw new coil3.request.m("The request's data is null.");
                        }
                        kVar2.start();
                        if (i == 0) {
                            oVar3.e = kVar2;
                            oVar3.y = gVarA;
                            oVar3.z = fVar2;
                            oVar3.D = 1;
                            if (kVar2.b(oVar3) != aVar) {
                                oVar2 = kVar2;
                                r3 = fVar2;
                                gVar2 = gVarA;
                                gVarA = gVar2;
                                r9 = oVar2;
                                r7 = r3;
                            }
                        } else {
                            r9 = kVar2;
                            r7 = fVar2;
                        }
                        return aVar;
                    } catch (Throwable th) {
                        th = th;
                        r8 = gVarA;
                        r9 = kVar2;
                        r7 = fVar2;
                        if (!(th instanceof CancellationException)) {
                            d(r8, r7);
                            throw th;
                        }
                        coil3.request.c cVarA = coil3.util.l.a(r8, th);
                        e(cVarA, r8.c, r7);
                        r9.complete();
                        return cVarA;
                    }
                }
                if (r7 == 1) {
                    r7 = oVar3.z;
                    gVar2 = oVar3.y;
                    oVar2 = oVar3.e;
                    try {
                        kotlin.a.e(obj);
                        r3 = r7;
                        gVarA = gVar2;
                        r9 = oVar2;
                        r7 = r3;
                    } catch (Throwable th2) {
                        th = th2;
                        r8 = gVar2;
                        r9 = oVar2;
                        if (!(th instanceof CancellationException)) {
                            d(r8, r7);
                            throw th;
                        }
                        coil3.request.c cVarA2 = coil3.util.l.a(r8, th);
                        e(cVarA2, r8.c, r7);
                        r9.complete();
                        return cVarA2;
                    }
                } else if (r7 == 2) {
                    j jVar3 = oVar3.A;
                    f fVar3 = oVar3.z;
                    coil3.request.g gVar5 = oVar3.y;
                    coil3.request.o oVar4 = oVar3.e;
                    kotlin.a.e(obj);
                    r4 = fVar3;
                    gVar3 = gVar5;
                    r12 = oVar4;
                    jVar = jVar3;
                    try {
                        coil3.size.h hVar = (coil3.size.h) obj;
                        r4.getClass();
                        kotlin.coroutines.j jVar4 = gVar3.f;
                        gVarA = gVar3;
                        try {
                            z0 z0Var = new z0(gVarA, this, hVar, r4, jVar, null, 7);
                            oVar3.e = r12;
                            oVar3.y = gVarA;
                            oVar3.z = r4;
                            oVar3.A = null;
                            oVar3.D = 3;
                            objWithContext = BuildersKt.withContext(jVar4, z0Var, oVar3);
                            if (objWithContext != aVar) {
                                r5 = r4;
                                r6 = r12;
                                gVar4 = gVarA;
                                obj = objWithContext;
                            }
                            return aVar;
                        } catch (Throwable th3) {
                            th = th3;
                            r7 = r4;
                            r9 = r12;
                            r8 = gVarA;
                            try {
                                if (!(th instanceof CancellationException)) {
                                    d(r8, r7);
                                    throw th;
                                }
                                coil3.request.c cVarA3 = coil3.util.l.a(r8, th);
                                e(cVarA3, r8.c, r7);
                                r9.complete();
                                return cVarA3;
                            } catch (Throwable th4) {
                                r9.complete();
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        gVarA = gVar3;
                    }
                } else {
                    if (r7 != 3) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f fVar4 = oVar3.z;
                    gVar4 = oVar3.y;
                    coil3.request.o oVar5 = oVar3.e;
                    kotlin.a.e(obj);
                    r5 = fVar4;
                    r6 = oVar5;
                }
                jVar2 = (coil3.request.j) obj;
                if (jVar2 instanceof coil3.request.p) {
                    f((coil3.request.p) jVar2, gVar4.c, r5);
                } else {
                    if (jVar2 instanceof coil3.request.c) {
                        throw new androidx.compose.ui.res.e(11);
                    }
                    e((coil3.request.c) jVar2, gVar4.c, r5);
                }
                r6.complete();
                return jVar2;
                gVarA.getClass();
                coil3.target.a aVar3 = gVarA.c;
                if (aVar3 != null) {
                    j jVar5 = (j) gVarA.l.invoke(gVarA);
                    if (jVar5 == null) {
                        jVar5 = (j) gVarA.t.h.invoke(gVarA);
                    }
                    aVar3.e(jVar5);
                }
                r7.getClass();
                coil3.size.i iVar3 = gVarA.o;
                oVar3.e = r9;
                oVar3.y = gVarA;
                oVar3.z = r7;
                oVar3.A = null;
                oVar3.D = 2;
                Object objE = iVar3.e(oVar3);
                if (objE != aVar) {
                    r4 = r7;
                    r12 = r9;
                    jVar = null;
                    gVar3 = gVarA;
                    obj = objE;
                    coil3.size.h hVar2 = (coil3.size.h) obj;
                    r4.getClass();
                    kotlin.coroutines.j jVar6 = gVar3.f;
                    gVarA = gVar3;
                    z0 z0Var2 = new z0(gVarA, this, hVar2, r4, jVar, null, 7);
                    oVar3.e = r12;
                    oVar3.y = gVarA;
                    oVar3.z = r4;
                    oVar3.A = null;
                    oVar3.D = 3;
                    objWithContext = BuildersKt.withContext(jVar6, z0Var2, oVar3);
                    if (objWithContext != aVar) {
                        r5 = r4;
                        r6 = r12;
                        gVar4 = gVarA;
                        obj = objWithContext;
                        jVar2 = (coil3.request.j) obj;
                        if (jVar2 instanceof coil3.request.p) {
                            f((coil3.request.p) jVar2, gVar4.c, r5);
                        } else {
                            if (jVar2 instanceof coil3.request.c) {
                                throw new androidx.compose.ui.res.e(11);
                            }
                            e((coil3.request.c) jVar2, gVar4.c, r5);
                        }
                        r6.complete();
                        return jVar2;
                    }
                }
                return aVar;
            } catch (Throwable th6) {
                th = th6;
                r8 = gVarA;
                if (!(th instanceof CancellationException)) {
                    d(r8, r7);
                    throw th;
                }
                coil3.request.c cVarA4 = coil3.util.l.a(r8, th);
                e(cVarA4, r8.c, r7);
                r9.complete();
                return cVarA4;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final Object b(coil3.request.g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        coil3.target.a aVar = gVar.c;
        return ((gVar.o instanceof coil3.size.f) || ((androidx.lifecycle.p) l.d(gVar, coil3.request.i.e)) != null) ? CoroutineScopeKt.coroutineScope(new c0(this, gVar, null, 4), cVar) : a(gVar, 1, cVar);
    }

    public final coil3.memory.c c() {
        return (coil3.memory.c) this.a.d.getValue();
    }

    public final void d(coil3.request.g gVar, f fVar) {
        androidx.media3.exoplayer.hls.c cVar = this.a.g;
        if (cVar != null) {
            coil3.util.h hVar = (coil3.util.h) cVar.y;
            coil3.util.h hVar2 = coil3.util.h.z;
            if (hVar.compareTo(hVar2) <= 0) {
                androidx.media3.exoplayer.hls.c.E("RealImageLoader", hVar2, "🏗 Cancelled - " + gVar.b, null);
            }
        }
        fVar.getClass();
        gVar.getClass();
    }

    public final void e(coil3.request.c cVar, coil3.target.a aVar, f fVar) {
        coil3.request.g gVar = cVar.b;
        androidx.media3.exoplayer.hls.c cVar2 = this.a.g;
        if (cVar2 != null) {
            Throwable th = cVar.c;
            coil3.util.h hVar = (coil3.util.h) cVar2.y;
            coil3.util.h hVar2 = coil3.util.h.B;
            if (hVar.compareTo(hVar2) <= 0) {
                androidx.media3.exoplayer.hls.c.E("RealImageLoader", hVar2, "🚨 Failed - " + gVar.b, th);
            }
        }
        if (aVar instanceof coil3.compose.j) {
            coil3.transition.g gVarA = ((coil3.transition.f) l.d(gVar, coil3.request.i.a)).a((coil3.compose.j) aVar, cVar);
            if (!(gVarA instanceof coil3.transition.e)) {
                fVar.getClass();
                gVarA.a();
            }
        }
        fVar.getClass();
        gVar.getClass();
    }

    public final void f(coil3.request.p pVar, coil3.target.a aVar, f fVar) {
        String str;
        coil3.request.g gVar = pVar.b;
        coil3.decode.h hVar = pVar.c;
        androidx.media3.exoplayer.hls.c cVar = this.a.g;
        if (cVar != null) {
            coil3.util.h hVar2 = (coil3.util.h) cVar.y;
            coil3.util.h hVar3 = coil3.util.h.z;
            if (hVar2.compareTo(hVar3) <= 0) {
                int iOrdinal = hVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    str = "🧠";
                } else if (iOrdinal == 2) {
                    str = "💾";
                } else {
                    if (iOrdinal != 3) {
                        g.a();
                        return;
                    }
                    str = "☁️";
                }
                androidx.media3.exoplayer.hls.c.E("RealImageLoader", hVar3, str + " Successful (" + hVar.name() + ") - " + gVar.b, null);
            }
        }
        if (aVar instanceof coil3.compose.j) {
            coil3.transition.g gVarA = ((coil3.transition.f) l.d(gVar, coil3.request.i.a)).a((coil3.compose.j) aVar, pVar);
            if (!(gVarA instanceof coil3.transition.e)) {
                fVar.getClass();
                gVarA.a();
            }
        }
        fVar.getClass();
        gVar.getClass();
    }
}
