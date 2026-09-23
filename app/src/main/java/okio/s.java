package okio;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Closeable {
    public final RandomAccessFile A;
    public boolean e;
    public int y;
    public final ReentrantLock z = new ReentrantLock();

    public s(RandomAccessFile randomAccessFile) {
        this.A = randomAccessFile;
    }

    public final j a(long j) {
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            this.y++;
            reentrantLock.unlock();
            return new j(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            if (this.e) {
                reentrantLock.unlock();
                return;
            }
            this.e = true;
            if (this.y != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.A.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.z;
        reentrantLock.lock();
        try {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.A.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
