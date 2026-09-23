package com.google.android.gms.dynamite;

import android.os.Process;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import com.google.android.gms.measurement.internal.z;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Thread {
    public final /* synthetic */ int e = 1;

    public /* synthetic */ f(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
                return;
        }
        while (true) {
            try {
                l lVar = okio.c.h;
                ReentrantLock reentrantLock = okio.c.j;
                reentrantLock.lock();
                try {
                    okio.c cVarH = z.h();
                    if (cVarH == okio.c.i) {
                        okio.c.i = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (cVarH != null) {
                            cVarH.l();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ f(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }

    public f(com.app.mlounge.ui.theme.f fVar) {
    }
}
