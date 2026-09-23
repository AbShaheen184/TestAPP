package androidx.room.coroutines;

import com.google.firebase.crashlytics.internal.model.t1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ThreadContextElementKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b {
    public final ThreadLocal A;
    public volatile boolean B;
    public final long C;
    public final int D;
    public final t e;
    public final t y;
    public final com.google.android.material.shape.f z;

    public e(final androidx.localbroadcastmanager.content.b bVar, final String str, int i) {
        str.getClass();
        this.z = new com.google.android.material.shape.f(17);
        this.A = new ThreadLocal();
        kotlin.time.g gVar = kotlin.time.a.y;
        this.C = dagger.hilt.android.internal.a.h(30, kotlin.time.c.SECONDS);
        this.D = 2;
        if (i <= 0) {
            kotlinx.coroutines.future.a.q("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i2 = 0;
        this.e = new t(i, new kotlin.jvm.functions.a() { // from class: androidx.room.coroutines.c
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        androidx.sqlite.a aVarH = bVar.h(str);
                        t1.t(aVarH, "PRAGMA query_only = 1");
                        return aVarH;
                    default:
                        return bVar.h(str);
                }
            }
        });
        final int i3 = 1;
        this.y = new t(1, new kotlin.jvm.functions.a() { // from class: androidx.room.coroutines.c
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        androidx.sqlite.a aVarH = bVar.h(str);
                        t1.t(aVarH, "PRAGMA query_only = 1");
                        return aVarH;
                    default:
                        return bVar.h(str);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145 A[Catch: all -> 0x019f, TRY_LEAVE, TryCatch #4 {all -> 0x019f, blocks: (B:64:0x011e, B:69:0x013a, B:71:0x0145, B:86:0x01a3, B:87:0x01aa), top: B:115:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:77:0x017f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3 A[Catch: all -> 0x019f, TRY_ENTER, TryCatch #4 {all -> 0x019f, blocks: (B:64:0x011e, B:69:0x013a, B:71:0x0145, B:86:0x01a3, B:87:0x01aa), top: B:115:0x011e }] */
    @Override // androidx.room.coroutines.b
    public final Object D(boolean z, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        kotlin.jvm.internal.z zVar;
        Throwable th;
        t tVar;
        kotlin.jvm.functions.p pVar2;
        kotlin.coroutines.j jVar;
        com.google.android.material.shape.f fVar;
        t tVar2;
        kotlin.jvm.internal.z zVar2;
        boolean z2;
        Object obj;
        kotlin.jvm.internal.z zVar3;
        a0 a0Var;
        boolean z3 = z;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.G;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.G = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objWithContext = dVar.E;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = dVar.G;
        kotlin.coroutines.d dVar2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.a.e(objWithContext);
                return objWithContext;
            }
            if (i2 == 2) {
                kotlin.a.e(objWithContext);
                return objWithContext;
            }
            if (i2 == 3) {
                z3 = dVar.e;
                fVar = dVar.D;
                kotlin.jvm.internal.z zVar4 = dVar.C;
                jVar = dVar.B;
                kotlin.jvm.internal.z zVar5 = dVar.A;
                tVar2 = (t) dVar.z;
                pVar2 = (kotlin.jvm.functions.p) dVar.y;
                try {
                    kotlin.a.e(objWithContext);
                    zVar2 = zVar4;
                    zVar = zVar5;
                    try {
                        h hVar = (h) objWithContext;
                        hVar.getClass();
                        jVar.getClass();
                        hVar.z = jVar;
                        hVar.A = new Throwable();
                        if (this.e == this.y && z3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zVar2.e = new a0(fVar, hVar, z2);
                        obj = zVar.e;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        a0 a0Var2 = (a0) obj;
                        a aVar2 = new a(this.z, a0Var2);
                        ThreadLocal threadLocal = this.A;
                        threadLocal.getClass();
                        kotlin.coroutines.j jVarO = kotlin.coroutines.g.o(ThreadContextElementKt.asContextElement(threadLocal, a0Var2), aVar2);
                        androidx.room.s sVar = new androidx.room.s(pVar2, zVar, dVar2, 3);
                        dVar.y = tVar2;
                        dVar.z = zVar;
                        dVar.A = null;
                        dVar.B = null;
                        dVar.C = null;
                        dVar.D = null;
                        dVar.G = 4;
                        objWithContext = BuildersKt.withContext(jVarO, sVar, dVar);
                        if (objWithContext != aVar) {
                            zVar3 = zVar;
                            tVar = tVar2;
                        }
                        return aVar;
                    } catch (Throwable th2) {
                        th = th2;
                        tVar = tVar2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    zVar = zVar5;
                    tVar = tVar2;
                    throw th;
                }
            }
            if (i2 != 4) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar3 = (kotlin.jvm.internal.z) dVar.z;
            tVar = (t) dVar.y;
            try {
                kotlin.a.e(objWithContext);
            } catch (Throwable th4) {
                zVar = zVar3;
                th = th4;
            }
            a0Var = (a0) zVar3.e;
            if (a0Var != null) {
                if (!a0Var.e) {
                    a0Var.e = true;
                    if (a0Var.b.e.H()) {
                        t1.t(a0Var.b, "ROLLBACK TRANSACTION");
                    }
                }
                h hVar2 = a0Var.b;
                hVar2.z = null;
                hVar2.A = null;
                tVar.e(hVar2);
            }
            return objWithContext;
        }
        kotlin.a.e(objWithContext);
        if (this.B) {
            t1.B(21, "Connection pool is closed");
            throw null;
        }
        a0 a0Var3 = (a0) this.A.get();
        if (a0Var3 == null) {
            a aVar3 = (a) dVar.getContext().get(this.z);
            a0Var3 = aVar3 != null ? aVar3.y : null;
        }
        if (a0Var3 == null) {
            t tVar3 = z3 ? this.e : this.y;
            zVar = new kotlin.jvm.internal.z();
            try {
                kotlin.coroutines.j context = dVar.getContext();
                com.google.android.material.shape.f fVar2 = this.z;
                long j = this.C;
                androidx.compose.foundation.text.r rVar = new androidx.compose.foundation.text.r(z3, 1, this);
                dVar.y = pVar;
                dVar.z = tVar3;
                dVar.A = zVar;
                dVar.B = context;
                dVar.C = zVar;
                dVar.D = fVar2;
                dVar.e = z3;
                dVar.G = 3;
                Object objB = tVar3.b(j, rVar, dVar);
                if (objB != aVar) {
                    pVar2 = pVar;
                    jVar = context;
                    fVar = fVar2;
                    tVar2 = tVar3;
                    objWithContext = objB;
                    zVar2 = zVar;
                    h hVar3 = (h) objWithContext;
                    hVar3.getClass();
                    jVar.getClass();
                    hVar3.z = jVar;
                    hVar3.A = new Throwable();
                    if (this.e == this.y) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    zVar2.e = new a0(fVar, hVar3, z2);
                    obj = zVar.e;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    a0 a0Var4 = (a0) obj;
                    a aVar4 = new a(this.z, a0Var4);
                    ThreadLocal threadLocal2 = this.A;
                    threadLocal2.getClass();
                    kotlin.coroutines.j jVarO2 = kotlin.coroutines.g.o(ThreadContextElementKt.asContextElement(threadLocal2, a0Var4), aVar4);
                    androidx.room.s sVar2 = new androidx.room.s(pVar2, zVar, dVar2, 3);
                    dVar.y = tVar2;
                    dVar.z = zVar;
                    dVar.A = null;
                    dVar.B = null;
                    dVar.C = null;
                    dVar.D = null;
                    dVar.G = 4;
                    objWithContext = BuildersKt.withContext(jVarO2, sVar2, dVar);
                    if (objWithContext != aVar) {
                        zVar3 = zVar;
                        tVar = tVar2;
                        a0Var = (a0) zVar3.e;
                        if (a0Var != null) {
                            if (!a0Var.e) {
                                a0Var.e = true;
                                if (a0Var.b.e.H()) {
                                    t1.t(a0Var.b, "ROLLBACK TRANSACTION");
                                }
                            }
                            h hVar4 = a0Var.b;
                            hVar4.z = null;
                            hVar4.A = null;
                            tVar.e(hVar4);
                        }
                        return objWithContext;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                tVar = tVar3;
            }
        } else {
            if (!z3 && a0Var3.c) {
                t1.B(1, "Cannot upgrade connection from reader to writer");
                throw null;
            }
            if (dVar.getContext().get(this.z) == null) {
                a aVar5 = new a(this.z, a0Var3);
                ThreadLocal threadLocal3 = this.A;
                threadLocal3.getClass();
                kotlin.coroutines.j jVarO3 = kotlin.coroutines.g.o(ThreadContextElementKt.asContextElement(threadLocal3, a0Var3), aVar5);
                androidx.room.s sVar3 = new androidx.room.s(pVar, a0Var3, dVar2, 2);
                dVar.G = 1;
                Object objWithContext2 = BuildersKt.withContext(jVarO3, sVar3, dVar);
                if (objWithContext2 != aVar) {
                    return objWithContext2;
                }
            } else {
                dVar.G = 2;
                Object objInvoke = pVar.invoke(a0Var3, dVar);
                if (objInvoke != aVar) {
                    return objInvoke;
                }
            }
        }
        return aVar;
        try {
            throw th;
        } catch (Throwable th6) {
            try {
                a0 a0Var5 = (a0) zVar.e;
                if (a0Var5 == null) {
                    throw th6;
                }
                if (!a0Var5.e) {
                    a0Var5.e = true;
                    if (a0Var5.b.e.H()) {
                        t1.t(a0Var5.b, "ROLLBACK TRANSACTION");
                    }
                }
                h hVar5 = a0Var5.b;
                hVar5.z = null;
                hVar5.A = null;
                tVar.e(hVar5);
                throw th6;
            } catch (Throwable th7) {
                kotlin.a.a(th, th7);
                throw th6;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.B) {
            return;
        }
        this.B = true;
        this.e.c();
        this.y.c();
    }

    public e(androidx.localbroadcastmanager.content.b bVar) {
        this.z = new com.google.android.material.shape.f(17);
        this.A = new ThreadLocal();
        kotlin.time.g gVar = kotlin.time.a.y;
        this.C = dagger.hilt.android.internal.a.h(30, kotlin.time.c.SECONDS);
        this.D = 2;
        t tVar = new t(1, new androidx.navigation.internal.h(bVar, 4));
        this.e = tVar;
        this.y = tVar;
    }
}
