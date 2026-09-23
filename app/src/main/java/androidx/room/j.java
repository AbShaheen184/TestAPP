package androidx.room;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public volatile boolean f;
    public final ReentrantLock a = new ReentrantLock();
    public final ReentrantLock e = new ReentrantLock();

    public j(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }
}
