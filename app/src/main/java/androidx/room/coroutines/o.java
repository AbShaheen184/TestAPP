package androidx.room.coroutines;

import android.database.SQLException;
import androidx.compose.material3.k6;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements androidx.room.a0, b0 {
    public final kotlin.jvm.internal.j a;
    public final androidx.sqlite.a b;
    public final AtomicInteger c;
    public androidx.room.z d;

    /* JADX WARN: Multi-variable type inference failed */
    public o(kotlin.jvm.functions.p pVar, androidx.sqlite.a aVar) {
        aVar.getClass();
        this.a = (kotlin.jvm.internal.j) pVar;
        this.b = aVar;
        this.c = new AtomicInteger(0);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.p, kotlin.jvm.internal.j] */
    @Override // androidx.room.a0
    public final Object a(androidx.room.z zVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.i iVar) {
        return this.a.invoke(new k6(this, zVar, pVar, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.p, kotlin.jvm.internal.j] */
    @Override // androidx.room.m
    public final Object b(String str, kotlin.jvm.functions.l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i = mVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.B = i - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objC = mVar.z;
        int i2 = mVar.B;
        Object obj = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(objC);
            mVar.e = str;
            mVar.y = lVar;
            mVar.B = 1;
            objC = c(mVar);
            if (objC != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.a.e(objC);
                return objC;
            }
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lVar = mVar.y;
        str = mVar.e;
        kotlin.a.e(objC);
        if (((Boolean) objC).booleanValue()) {
            n nVar = new n(this, str, lVar, null);
            mVar.e = null;
            mVar.y = null;
            mVar.B = 2;
            Object objInvoke = this.a.invoke(nVar, mVar);
            return objInvoke == obj ? obj : objInvoke;
        }
        androidx.sqlite.c cVarU = this.b.U(str);
        try {
            Object objInvoke2 = lVar.invoke(cVarU);
            kotlin.collections.q.e(cVarU, null);
            return objInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.collections.q.e(cVarU, th);
                throw th2;
            }
        }
    }

    @Override // androidx.room.a0
    public final Boolean c(kotlin.coroutines.d dVar) {
        return Boolean.valueOf(this.d != null || this.b.H());
    }

    @Override // androidx.room.coroutines.b0
    public final androidx.sqlite.a d() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(androidx.room.z zVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i = lVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.A = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objInvoke = lVar.y;
        int i2 = lVar.A;
        AtomicInteger atomicInteger = this.c;
        int i3 = 1;
        androidx.sqlite.a aVar = this.b;
        try {
            if (i2 == 0) {
                kotlin.a.e(objInvoke);
                int iOrdinal = zVar.ordinal();
                if (iOrdinal == 0) {
                    t1.t(aVar, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    t1.t(aVar, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        coil3.g.a();
                        return null;
                    }
                    t1.t(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.d = zVar;
                }
                Object kVar = new k(this, 0);
                lVar.e = 1;
                lVar.A = 1;
                objInvoke = pVar.invoke(kVar, lVar);
                Object obj = kotlin.coroutines.intrinsics.a.e;
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = lVar.e;
                kotlin.a.e(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.d = null;
            }
            if (i3 != 0) {
                t1.t(aVar, "END TRANSACTION");
                return objInvoke;
            }
            t1.t(aVar, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    t1.t(aVar, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    kotlin.a.a(th, e);
                }
                throw th2;
            }
        }
    }
}
