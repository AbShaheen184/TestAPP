package coil3.network.okhttp.internal;

import androidx.compose.foundation.text.z0;
import coil3.network.p;
import coil3.network.q;
import java.io.Closeable;
import kotlin.coroutines.intrinsics.h;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.b0;
import okhttp3.g0;
import okhttp3.internal.connection.m;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final y a;

    public /* synthetic */ b(y yVar) {
        this.a = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(y yVar, p pVar, kotlin.jvm.functions.p pVar2, kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        kotlin.jvm.functions.p pVar3;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i = aVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.A = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar);
            }
        } else {
            aVar = new a(cVar);
        }
        Object objG = aVar.z;
        int i2 = aVar.A;
        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(objG);
            aVar.e = pVar2;
            aVar.y = yVar;
            aVar.A = 1;
            objG = _COROUTINE.a.g(pVar, aVar);
            if (objG != aVar2) {
            }
            return aVar2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) aVar.e;
                try {
                    kotlin.a.e(objG);
                    dagger.internal.d.b(closeable2, null);
                    return objG;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        dagger.internal.d.b(closeable2, th);
                        throw th3;
                    }
                }
            }
            pVar3 = (kotlin.jvm.functions.p) aVar.e;
            kotlin.a.e(objG);
            closeable = (Closeable) objG;
            try {
                q qVarF = _COROUTINE.a.f((g0) closeable);
                aVar.e = closeable;
                aVar.A = 3;
                objG = pVar3.invoke(qVarF, aVar);
                if (objG != aVar2) {
                    closeable2 = closeable;
                    dagger.internal.d.b(closeable2, null);
                    return objG;
                }
                return aVar2;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        yVar = aVar.y;
        pVar2 = (kotlin.jvm.functions.p) aVar.e;
        kotlin.a.e(objG);
        b0 b0Var = (b0) objG;
        yVar.getClass();
        b0Var.getClass();
        m mVar = new m(yVar, b0Var, false);
        aVar.e = pVar2;
        aVar.y = null;
        aVar.A = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(h.f(aVar), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new z0(mVar, 3));
        mVar.d(new e(cancellableContinuationImpl, 0));
        objG = cancellableContinuationImpl.getResult();
        if (objG != aVar2) {
            pVar3 = pVar2;
            closeable = (Closeable) objG;
            q qVarF2 = _COROUTINE.a.f((g0) closeable);
            aVar.e = closeable;
            aVar.A = 3;
            objG = pVar3.invoke(qVarF2, aVar);
            if (objG != aVar2) {
                closeable2 = closeable;
                dagger.internal.d.b(closeable2, null);
                return objG;
            }
        }
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.a(this.a, ((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ")";
    }
}
