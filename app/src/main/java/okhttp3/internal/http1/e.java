package okhttp3.internal.http1;

import androidx.compose.runtime.j;
import java.io.IOException;
import okhttp3.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    public boolean B;

    @Override // okhttp3.internal.http1.a, okio.h0
    public final long K(okio.f fVar, long j) throws IOException {
        fVar.getClass();
        if (j < 0) {
            kotlinx.coroutines.future.a.s(j.h("byteCount < 0: ", j));
            return 0L;
        }
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
            return 0L;
        }
        if (this.B) {
            return -1L;
        }
        long jK = super.K(fVar, j);
        if (jK != -1) {
            return jK;
        }
        this.B = true;
        a(r.y);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.z) {
            return;
        }
        if (!this.B) {
            a(f.f);
        }
        this.z = true;
    }
}
