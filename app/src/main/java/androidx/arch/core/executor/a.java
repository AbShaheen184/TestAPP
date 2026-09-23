package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {
    public final /* synthetic */ int e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                b.g0().m.n.execute(runnable);
                break;
            case 1:
                break;
            default:
                runnable.run();
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
