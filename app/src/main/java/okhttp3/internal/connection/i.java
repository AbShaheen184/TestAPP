package okhttp3.internal.connection;

import com.google.android.gms.measurement.internal.c1;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends okhttp3.internal.concurrent.a {
    public final /* synthetic */ r e;
    public final /* synthetic */ c1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, r rVar, c1 c1Var) {
        super(str, true);
        this.e = rVar;
        this.f = c1Var;
    }

    @Override // okhttp3.internal.concurrent.a
    public final long a() throws InterruptedException {
        q qVar;
        r rVar = this.e;
        try {
            qVar = rVar.e();
        } catch (Throwable th) {
            qVar = new q(rVar, th, 2);
        }
        c1 c1Var = this.f;
        if (!((CopyOnWriteArrayList) c1Var.A).contains(rVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) c1Var.B).put(qVar);
        return -1L;
    }
}
