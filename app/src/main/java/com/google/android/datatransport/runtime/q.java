package com.google.android.datatransport.runtime;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {
    public final /* synthetic */ int e;
    public final Runnable y;

    public /* synthetic */ q(int i, Runnable runnable) {
        this.e = i;
        this.y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                try {
                    this.y.run();
                } catch (Exception e) {
                    androidx.room.t.p("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            case 1:
                Process.setThreadPriority(0);
                this.y.run();
                break;
            case 2:
                this.y.run();
                break;
            default:
                this.y.run();
                break;
        }
    }

    public String toString() {
        switch (this.e) {
            case 2:
                return this.y.toString();
            case 3:
                return this.y.toString();
            default:
                return super.toString();
        }
    }
}
