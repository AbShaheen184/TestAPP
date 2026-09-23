package okio;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface f0 extends Closeable, Flushable {
    void E(f fVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    j0 e();

    void flush();
}
