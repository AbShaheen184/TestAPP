package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Executor {
    public Runnable A;
    public final Object B;
    public final /* synthetic */ int e;
    public final ArrayDeque y;
    public final Executor z;

    public y(Executor executor, int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.z = executor;
                this.y = new ArrayDeque();
                this.B = new Object();
                break;
            default:
                executor.getClass();
                this.z = executor;
                this.y = new ArrayDeque();
                this.B = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.e) {
            case 0:
                synchronized (this.B) {
                    Object objPoll = this.y.poll();
                    Runnable runnable = (Runnable) objPoll;
                    this.A = runnable;
                    if (objPoll != null) {
                        this.z.execute(runnable);
                    }
                    break;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.y.poll();
                this.A = runnable2;
                if (runnable2 != null) {
                    this.z.execute(runnable2);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                runnable.getClass();
                synchronized (this.B) {
                    this.y.offer(new androidx.media3.ui.c0(1, runnable, this));
                    if (this.A == null) {
                        a();
                    }
                    break;
                }
                return;
            default:
                synchronized (this.B) {
                    try {
                        this.y.add(new com.google.common.util.concurrent.k0(6, this, runnable));
                        if (this.A == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
