package coil3.network;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements AutoCloseable {
    public final okio.h e;

    public /* synthetic */ r(okio.h hVar) {
        this.e = hVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.e.equals(((r) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.e + ")";
    }
}
