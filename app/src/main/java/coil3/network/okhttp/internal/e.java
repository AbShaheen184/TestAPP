package coil3.network.okhttp.internal;

import java.io.IOException;
import kotlin.jvm.internal.a0;
import kotlin.l;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.b0;
import okhttp3.g0;
import okhttp3.h;
import okhttp3.internal.connection.m;
import retrofit2.g;
import retrofit2.q;
import retrofit2.r0;
import retrofit2.u;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h, g {
    public final /* synthetic */ int e;
    public final /* synthetic */ CancellableContinuationImpl y;

    public /* synthetic */ e(CancellableContinuationImpl cancellableContinuationImpl, int i) {
        this.e = i;
        this.y = cancellableContinuationImpl;
    }

    @Override // okhttp3.h
    public void d(m mVar, g0 g0Var) {
        this.y.resume(g0Var, d.e);
    }

    @Override // retrofit2.g
    public void e(retrofit2.d dVar, Throwable th) {
        switch (this.e) {
            case 1:
                this.y.resumeWith(new l(th));
                break;
            default:
                this.y.resumeWith(new l(th));
                break;
        }
    }

    @Override // okhttp3.h
    public void h(m mVar, IOException iOException) {
        this.y.resumeWith(new l(iOException));
    }

    @Override // retrofit2.g
    public void i(retrofit2.d dVar, r0 r0Var) {
        switch (this.e) {
            case 1:
                boolean z = r0Var.a.N;
                CancellableContinuationImpl cancellableContinuationImpl = this.y;
                if (!z) {
                    cancellableContinuationImpl.resumeWith(new l(new q(r0Var)));
                } else {
                    Object obj = r0Var.b;
                    if (obj != null) {
                        cancellableContinuationImpl.resumeWith(obj);
                    } else {
                        b0 b0VarN = dVar.N();
                        b0VarN.getClass();
                        kotlin.jvm.internal.e eVarA = a0.a(u.class);
                        Class clsA = eVarA.a();
                        clsA.getClass();
                        Object objCast = clsA.cast(b0VarN.e.d(eVarA));
                        objCast.getClass();
                        u uVar = (u) objCast;
                        cancellableContinuationImpl.resumeWith(new l(new kotlin.f("Response from " + uVar.a.getName() + '.' + uVar.c.getName() + " was null but response body type was declared as non-null")));
                    }
                }
                break;
            default:
                this.y.resumeWith(r0Var);
                break;
        }
    }
}
