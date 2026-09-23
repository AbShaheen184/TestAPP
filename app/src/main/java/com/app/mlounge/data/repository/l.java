package com.app.mlounge.data.repository;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public ProducerScope A;
    public int B;
    public int C;
    public int D;
    public final /* synthetic */ r E;
    public final /* synthetic */ com.app.mlounge.data.providers.l0 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ ProducerScope J;
    public Semaphore e;
    public com.app.mlounge.data.providers.l0 y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, com.app.mlounge.data.providers.l0 l0Var, String str, int i, int i2, ProducerScope producerScope, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.E = rVar;
        this.F = l0Var;
        this.G = str;
        this.H = i;
        this.I = i2;
        this.J = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new l(this.E, this.F, this.G, this.H, this.I, this.J, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x0137 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #5 {all -> 0x002b, blocks: (B:8:0x0026, B:46:0x0133, B:48:0x0137, B:51:0x016c), top: B:56:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x016c A[Catch: all -> 0x002b, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x002b, blocks: (B:8:0x0026, B:46:0x0133, B:48:0x0137, B:51:0x016c), top: B:56:0x0026 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0137, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.app.mlounge.data.providers.l0 l0Var;
        String str;
        int i;
        ProducerScope producerScope;
        Semaphore semaphore;
        int i2;
        com.app.mlounge.data.providers.l0 l0Var2;
        com.app.mlounge.data.providers.l0 l0Var3;
        Semaphore semaphore2;
        ProducerScope producerScope2;
        Integer num;
        String str2;
        Integer num2;
        Object objA;
        com.app.mlounge.data.providers.l0 l0Var4;
        int i3;
        int i4;
        b0 b0Var;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i5 = this.D;
        try {
            try {
                try {
                    if (i5 == 0) {
                        kotlin.a.e(obj);
                        Semaphore semaphore3 = this.E.o;
                        l0Var = this.F;
                        str = this.G;
                        i = this.H;
                        int i6 = this.I;
                        producerScope = this.J;
                        this.e = semaphore3;
                        this.y = l0Var;
                        this.z = str;
                        this.A = producerScope;
                        this.B = i;
                        this.C = i6;
                        this.D = 1;
                        if (semaphore3.acquire(this) != aVar) {
                            semaphore = semaphore3;
                            i2 = i6;
                        }
                        return aVar;
                    }
                    if (i5 == 1) {
                        i2 = this.C;
                        i = this.B;
                        ProducerScope producerScope3 = this.A;
                        str = (String) this.z;
                        l0Var = this.y;
                        Semaphore semaphore4 = this.e;
                        kotlin.a.e(obj);
                        semaphore = semaphore4;
                        producerScope = producerScope3;
                    } else if (i5 == 2) {
                        int i7 = this.C;
                        int i8 = this.B;
                        ProducerScope producerScope4 = (ProducerScope) this.z;
                        l0Var4 = this.y;
                        Semaphore semaphore5 = this.e;
                        try {
                            kotlin.a.e(obj);
                            i3 = i7;
                            producerScope2 = producerScope4;
                            semaphore = semaphore5;
                            i4 = i8;
                            objA = obj;
                            try {
                                List list = (List) objA;
                                Context context = com.app.mlounge.util.a.a;
                                com.app.mlounge.util.a.a("D", "ChqRepo", "Provider " + l0Var4.getName() + " done: " + list.size() + " streams");
                                b0Var = new b0(l0Var4.getName(), list, null, true);
                                this.e = semaphore;
                                this.y = l0Var4;
                                this.z = producerScope2;
                                this.A = null;
                                this.B = i4;
                                this.C = i3;
                                this.D = 3;
                                if (producerScope2.send(b0Var, this) != aVar) {
                                    semaphore2 = semaphore;
                                }
                                return aVar;
                            } catch (Exception e) {
                                e = e;
                                l0Var3 = l0Var4;
                                semaphore2 = semaphore;
                                if (!(e instanceof CancellationException)) {
                                    throw e;
                                }
                                Context context2 = com.app.mlounge.util.a.a;
                                com.app.mlounge.util.a.d("ChqRepo", "Provider " + l0Var3.getName() + " failed: " + e.getMessage(), e);
                                producerScope2.mo28trySendJP2dKIU(new b0(l0Var3.getName(), kotlin.collections.w.e, null, false));
                            }
                        } catch (Exception e2) {
                            e = e2;
                            producerScope2 = producerScope4;
                            l0Var3 = l0Var4;
                            semaphore2 = semaphore5;
                            if (!(e instanceof CancellationException)) {
                                throw e;
                            }
                            Context context3 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.d("ChqRepo", "Provider " + l0Var3.getName() + " failed: " + e.getMessage(), e);
                            producerScope2.mo28trySendJP2dKIU(new b0(l0Var3.getName(), kotlin.collections.w.e, null, false));
                            semaphore2.release();
                            return kotlin.y.a;
                        } catch (Throwable th) {
                            th = th;
                            semaphore2 = semaphore5;
                            semaphore2.release();
                            throw th;
                        }
                    } else {
                        if (i5 != 3) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        producerScope2 = (ProducerScope) this.z;
                        l0Var3 = this.y;
                        semaphore2 = this.e;
                        try {
                            try {
                                kotlin.a.e(obj);
                            } catch (Throwable th2) {
                                th = th2;
                                semaphore2.release();
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            if (!(e instanceof CancellationException)) {
                                throw e;
                            }
                            Context context4 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.d("ChqRepo", "Provider " + l0Var3.getName() + " failed: " + e.getMessage(), e);
                            producerScope2.mo28trySendJP2dKIU(new b0(l0Var3.getName(), kotlin.collections.w.e, null, false));
                        }
                    }
                    semaphore2.release();
                    return kotlin.y.a;
                    objA = l0Var2.a(str2, "tv", num, num2, this);
                    if (objA != aVar) {
                        l0Var4 = l0Var2;
                        i3 = 0;
                        i4 = 0;
                        producerScope2 = producerScope;
                        List list2 = (List) objA;
                        Context context5 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("D", "ChqRepo", "Provider " + l0Var4.getName() + " done: " + list2.size() + " streams");
                        b0Var = new b0(l0Var4.getName(), list2, null, true);
                        this.e = semaphore;
                        this.y = l0Var4;
                        this.z = producerScope2;
                        this.A = null;
                        this.B = i4;
                        this.C = i3;
                        this.D = 3;
                        if (producerScope2.send(b0Var, this) != aVar) {
                            semaphore2 = semaphore;
                            semaphore2.release();
                            return kotlin.y.a;
                        }
                    }
                    return aVar;
                } catch (Exception e4) {
                    e = e4;
                    l0Var3 = l0Var2;
                    semaphore2 = semaphore;
                    producerScope2 = producerScope;
                    if (!(e instanceof CancellationException)) {
                        throw e;
                    }
                    Context context6 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("ChqRepo", "Provider " + l0Var3.getName() + " failed: " + e.getMessage(), e);
                    producerScope2.mo28trySendJP2dKIU(new b0(l0Var3.getName(), kotlin.collections.w.e, null, false));
                    semaphore2.release();
                    return kotlin.y.a;
                }
                Context context7 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "ChqRepo", "Provider " + l0Var.getName() + " started (tv)");
                num = new Integer(i);
                str2 = str;
                num2 = new Integer(i2);
                this.e = semaphore;
                this.y = l0Var;
                this.z = producerScope;
                this.A = null;
                this.B = 0;
                this.C = 0;
                this.D = 2;
                l0Var2 = l0Var;
            } catch (Throwable th3) {
                th = th3;
                semaphore2 = semaphore;
                semaphore2.release();
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            l0Var2 = l0Var;
        }
    }
}
