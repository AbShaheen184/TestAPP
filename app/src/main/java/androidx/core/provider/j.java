package androidx.core.provider;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Thread {
    public final int e;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.e = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.e);
        super.run();
    }
}
