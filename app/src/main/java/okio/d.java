package okio;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f0 {
    @Override // okio.f0
    public final void E(f fVar, long j) throws EOFException {
        fVar.skip(j);
    }

    @Override // okio.f0
    public final j0 e() {
        return j0.d;
    }

    @Override // okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.f0, java.io.Flushable
    public final void flush() {
    }
}
