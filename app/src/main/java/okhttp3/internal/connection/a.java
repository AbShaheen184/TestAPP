package okhttp3.internal.connection;

import androidx.compose.foundation.lazy.grid.u;
import androidx.compose.foundation.lazy.layout.b1;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.g0;
import okhttp3.t;
import okhttp3.y;
import okio.b0;
import okio.j0;
import okio.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements t {
    public static final a a = new a();

    @Override // okhttp3.t
    public final g0 a(u uVar) throws IOException {
        okhttp3.internal.http.e fVar;
        m mVar = (m) uVar.g;
        synchronized (mVar) {
            if (!mVar.M) {
                throw new IllegalStateException("released");
            }
            if (mVar.J || mVar.I || mVar.L || mVar.K) {
                throw new IllegalStateException("Check failed.");
            }
        }
        g gVar = mVar.E;
        gVar.getClass();
        n nVarA = gVar.a();
        y yVar = mVar.e;
        nVarA.getClass();
        yVar.getClass();
        int i = uVar.d;
        com.google.android.datatransport.runtime.j jVar = nVarA.h;
        okhttp3.internal.http2.p pVar = nVarA.j;
        if (pVar != null) {
            fVar = new okhttp3.internal.http2.q(yVar, nVarA, uVar, pVar);
        } else {
            nVarA.e.setSoTimeout(i);
            j0 j0VarE = ((b0) jVar.z).e.e();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j0VarE.g(j, timeUnit);
            ((z) jVar.A).e.e().g(uVar.e, timeUnit);
            fVar = new okhttp3.internal.http1.f(yVar, nVarA, jVar);
        }
        b1 b1Var = new b1(mVar, gVar, fVar);
        mVar.H = b1Var;
        mVar.O = b1Var;
        synchronized (mVar) {
            mVar.I = true;
            mVar.J = true;
        }
        if (!mVar.N) {
            return u.a(uVar, 0, b1Var, null, 61).f((okhttp3.b0) uVar.i);
        }
        kotlinx.coroutines.future.a.w("Canceled");
        return null;
    }
}
