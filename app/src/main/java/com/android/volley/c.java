package com.android.volley;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Thread {
    public final BlockingQueue e;
    public volatile boolean y = false;

    public c(PriorityBlockingQueue priorityBlockingQueue, com.google.firebase.heartbeatinfo.e eVar, androidx.compose.ui.input.pointer.util.b bVar, com.google.android.material.shape.f fVar) {
        this.e = priorityBlockingQueue;
    }

    private void a() {
        if (this.e.take() != null) {
            throw new ClassCastException();
        }
        SystemClock.elapsedRealtime();
        throw null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.y) {
                    Thread.currentThread().interrupt();
                    return;
                }
                Log.e("Volley", g.a("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]));
            }
        }
    }
}
