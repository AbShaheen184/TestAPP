package androidx.work.impl.utils.taskexecutor;

import android.os.Looper;
import com.google.android.datatransport.runtime.q;
import com.google.android.gms.internal.base.g;
import com.google.android.gms.measurement.internal.m1;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.s2;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor {
    public final /* synthetic */ int e;
    public final Object y;

    public b() {
        this.e = 4;
        g gVar = new g(Looper.getMainLooper());
        Looper.getMainLooper();
        this.y = gVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                ((c) this.y).c.post(runnable);
                break;
            case 1:
                ((Executor) this.y).execute(new q(0, runnable));
                break;
            case 2:
                ((g) this.y).post(runnable);
                break;
            case 3:
                m1 m1Var = ((p1) ((s2) this.y).e).D;
                p1.m(m1Var);
                m1Var.E(runnable);
                break;
            default:
                ((g) this.y).post(runnable);
                break;
        }
    }

    public /* synthetic */ b(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    public b(Looper looper) {
        this.e = 2;
        this.y = new g(looper, 2);
    }
}
