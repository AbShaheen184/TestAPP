package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements k0 {
    public final Mutex a = MutexKt.Mutex$default(false, 1, null);
    public final com.google.firebase.platforminfo.d b = new com.google.firebase.platforminfo.d(22);
    public final Flow c = FlowKt.flow(new androidx.activity.compose.n(2, 2, null));

    public e1(String str) {
    }

    @Override // androidx.datastore.core.k0
    public final Object a(y yVar) {
        return new Integer(((AtomicInteger) this.b.e).incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.k0
    public final Object b(kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        d1 d1Var;
        Mutex mutex;
        Throwable th;
        boolean z;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i = d1Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                d1Var.B = i - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(this, cVar);
            }
        } else {
            d1Var = new d1(this, cVar);
        }
        Object obj = d1Var.z;
        int i2 = d1Var.B;
        if (i2 != 0) {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = d1Var.y;
            mutex = d1Var.e;
            try {
                kotlin.a.e(obj);
                if (z) {
                    mutex.unlock(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    mutex.unlock(null);
                }
                throw th;
            }
        }
        kotlin.a.e(obj);
        Mutex mutex2 = this.a;
        boolean zTryLock = mutex2.tryLock(null);
        try {
            Object objValueOf = Boolean.valueOf(zTryLock);
            d1Var.e = mutex2;
            d1Var.y = zTryLock;
            d1Var.B = 1;
            Object objInvoke = pVar.invoke(objValueOf, d1Var);
            Object obj2 = kotlin.coroutines.intrinsics.a.e;
            if (objInvoke == obj2) {
                return obj2;
            }
            mutex = mutex2;
            obj = objInvoke;
            z = zTryLock;
            if (z) {
                mutex.unlock(null);
            }
            return obj;
        } catch (Throwable th3) {
            mutex = mutex2;
            th = th3;
            z = zTryLock;
            if (z) {
                mutex.unlock(null);
            }
            throw th;
        }
    }

    @Override // androidx.datastore.core.k0
    public final Object c(kotlin.coroutines.jvm.internal.c cVar) {
        return new Integer(((AtomicInteger) this.b.e).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.k0
    public final Object d(kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        c1 c1Var;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i = c1Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1Var.B = i - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(this, cVar);
            }
        } else {
            c1Var = new c1(this, cVar);
        }
        Object obj = c1Var.z;
        int i2 = c1Var.B;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                c1Var.e = lVar;
                mutex = this.a;
                c1Var.y = mutex;
                c1Var.B = 1;
                if (mutex.lock(null, c1Var) != aVar) {
                }
                return aVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = (Mutex) c1Var.e;
                try {
                    kotlin.a.e(obj);
                    mutex2.unlock(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = c1Var.y;
            kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) c1Var.e;
            kotlin.a.e(obj);
            mutex = mutex3;
            lVar = lVar2;
            c1Var.e = mutex;
            c1Var.y = null;
            c1Var.B = 2;
            Object objInvoke = lVar.invoke(c1Var);
            if (objInvoke != aVar) {
                Mutex mutex4 = mutex;
                obj = objInvoke;
                mutex2 = mutex4;
                mutex2.unlock(null);
                return obj;
            }
            return aVar;
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
    }

    @Override // androidx.datastore.core.k0
    public final Flow e() {
        return this.c;
    }
}
