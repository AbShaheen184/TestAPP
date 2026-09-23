package com.app.mlounge.data.repository;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public ProducerScope A;
    public int B;
    public int C;
    public int D;
    public final /* synthetic */ r E;
    public final /* synthetic */ com.app.mlounge.data.providers.l0 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ ProducerScope H;
    public Semaphore e;
    public com.app.mlounge.data.providers.l0 y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, com.app.mlounge.data.providers.l0 l0Var, String str, ProducerScope producerScope, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.E = rVar;
        this.F = l0Var;
        this.G = str;
        this.H = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new h(this.E, this.F, this.G, this.H, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x012a A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #3 {all -> 0x002b, blocks: (B:8:0x0026, B:52:0x0126, B:54:0x012a, B:57:0x0160), top: B:60:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0160 A[Catch: all -> 0x002b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x002b, blocks: (B:8:0x0026, B:52:0x0126, B:54:0x012a, B:57:0x0160), top: B:60:0x0026 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x012a, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Semaphore semaphore;
        com.app.mlounge.data.providers.l0 l0Var;
        String str;
        ProducerScope producerScope;
        int i;
        ProducerScope producerScope2;
        Semaphore semaphore2;
        com.app.mlounge.data.providers.l0 l0Var2;
        Semaphore semaphore3;
        com.app.mlounge.data.providers.l0 l0Var3;
        ProducerScope producerScope3;
        Object objA;
        com.app.mlounge.data.providers.l0 l0Var4;
        int i2;
        Semaphore semaphore4;
        b0 b0Var;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i3 = this.D;
        try {
            try {
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    semaphore = this.E.o;
                    l0Var = this.F;
                    str = this.G;
                    producerScope = this.H;
                    this.e = semaphore;
                    this.y = l0Var;
                    this.z = str;
                    this.A = producerScope;
                    this.B = 0;
                    this.D = 1;
                    if (semaphore.acquire(this) != aVar) {
                        i = 0;
                    }
                    return aVar;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = this.C;
                        int i5 = this.B;
                        ProducerScope producerScope4 = (ProducerScope) this.z;
                        l0Var4 = this.y;
                        semaphore4 = this.e;
                        try {
                            try {
                                kotlin.a.e(obj);
                                i2 = i4;
                                producerScope3 = producerScope4;
                                i = i5;
                                objA = obj;
                                try {
                                    List list = (List) objA;
                                    Context context = com.app.mlounge.util.a.a;
                                    com.app.mlounge.util.a.a("D", "ChqRepo", "Provider " + l0Var4.getName() + " done: " + list.size() + " streams");
                                    b0Var = new b0(l0Var4.getName(), list, null, true);
                                    this.e = semaphore4;
                                    this.y = l0Var4;
                                    this.z = producerScope3;
                                    this.A = null;
                                    this.B = i;
                                    this.C = i2;
                                    this.D = 3;
                                    if (producerScope3.send(b0Var, this) != aVar) {
                                        semaphore3 = semaphore4;
                                    }
                                    return aVar;
                                } catch (Exception e) {
                                    e = e;
                                    l0Var3 = l0Var4;
                                    semaphore3 = semaphore4;
                                    if (!(e instanceof CancellationException)) {
                                        throw e;
                                    }
                                    Context context2 = com.app.mlounge.util.a.a;
                                    com.app.mlounge.util.a.d("ChqRepo", "Provider " + l0Var3.getName() + " failed: " + e.getMessage(), e);
                                    producerScope3.mo28trySendJP2dKIU(new b0(l0Var3.getName(), kotlin.collections.w.e, null, false));
                                }
                            } catch (Throwable th) {
                                th = th;
                                semaphore3 = semaphore4;
                                semaphore3.release();
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            producerScope3 = producerScope4;
                            l0Var3 = l0Var4;
                            semaphore3 = semaphore4;
                            if (!(e instanceof CancellationException)) {
                                throw e;
                            }
                            Context context3 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.d("ChqRepo", "Provider " + l0Var3.getName() + " failed: " + e.getMessage(), e);
                            producerScope3.mo28trySendJP2dKIU(new b0(l0Var3.getName(), kotlin.collections.w.e, null, false));
                            semaphore3.release();
                            return kotlin.y.a;
                        }
                    } else {
                        if (i3 != 3) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        producerScope3 = (ProducerScope) this.z;
                        l0Var3 = this.y;
                        semaphore3 = this.e;
                        try {
                            try {
                                kotlin.a.e(obj);
                            } catch (Throwable th2) {
                                th = th2;
                                semaphore3.release();
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            if (!(e instanceof CancellationException)) {
                                throw e;
                            }
                            Context context4 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.d("ChqRepo", "Provider " + l0Var3.getName() + " failed: " + e.getMessage(), e);
                            producerScope3.mo28trySendJP2dKIU(new b0(l0Var3.getName(), kotlin.collections.w.e, null, false));
                        }
                    }
                    semaphore3.release();
                    return kotlin.y.a;
                }
                int i6 = this.B;
                producerScope = this.A;
                str = (String) this.z;
                l0Var = this.y;
                Semaphore semaphore5 = this.e;
                kotlin.a.e(obj);
                i = i6;
                semaphore = semaphore5;
                objA = l0Var2.a(str, "movie", null, null, this);
                if (objA != aVar) {
                    l0Var4 = l0Var2;
                    i2 = 0;
                    semaphore4 = semaphore2;
                    producerScope3 = producerScope2;
                    List list2 = (List) objA;
                    Context context5 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", "ChqRepo", "Provider " + l0Var4.getName() + " done: " + list2.size() + " streams");
                    b0Var = new b0(l0Var4.getName(), list2, null, true);
                    this.e = semaphore4;
                    this.y = l0Var4;
                    this.z = producerScope3;
                    this.A = null;
                    this.B = i;
                    this.C = i2;
                    this.D = 3;
                    if (producerScope3.send(b0Var, this) != aVar) {
                        semaphore3 = semaphore4;
                        semaphore3.release();
                        return kotlin.y.a;
                    }
                }
                return aVar;
            } catch (Exception e4) {
                e = e4;
                l0Var3 = l0Var2;
                semaphore3 = semaphore2;
                producerScope3 = producerScope2;
                if (!(e instanceof CancellationException)) {
                    throw e;
                }
                Context context6 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.d("ChqRepo", "Provider " + l0Var3.getName() + " failed: " + e.getMessage(), e);
                producerScope3.mo28trySendJP2dKIU(new b0(l0Var3.getName(), kotlin.collections.w.e, null, false));
            } catch (Throwable th3) {
                th = th3;
                semaphore3 = semaphore2;
                semaphore3.release();
                throw th;
            }
            Context context7 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "ChqRepo", "Provider " + l0Var.getName() + " started (movie)");
            this.e = semaphore;
            this.y = l0Var;
            this.z = producerScope2;
            this.A = null;
            this.B = i;
            this.C = 0;
            this.D = 2;
            Semaphore semaphore6 = semaphore;
            l0Var2 = l0Var;
            semaphore2 = semaphore6;
        } catch (Exception e5) {
            e = e5;
            semaphore2 = semaphore;
            l0Var2 = l0Var;
        } catch (Throwable th4) {
            th = th4;
            semaphore2 = semaphore;
        }
        producerScope2 = producerScope;
    }
}
