package com.google.android.gms.common.util.concurrent;

import com.google.android.datatransport.runtime.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {
    public final /* synthetic */ int a;
    public final String b;
    public final Object c;

    public a(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = new AtomicInteger(1);
                this.b = str;
                break;
            default:
                this.c = Executors.defaultThreadFactory();
                this.b = str;
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) this.c).newThread(new q(1, runnable));
                threadNewThread.setName(this.b);
                return threadNewThread;
            default:
                Thread thread = new Thread(runnable, this.b + "-" + ((AtomicInteger) this.c).getAndIncrement());
                thread.setDaemon(true);
                return thread;
        }
    }
}
