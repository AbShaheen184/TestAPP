package okhttp3.internal.cache;

import java.io.IOException;
import okio.h0;
import okio.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n {
    public final /* synthetic */ d A;
    public boolean y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h0 h0Var, h hVar, d dVar) {
        super(h0Var);
        this.z = hVar;
        this.A = dVar;
    }

    @Override // okio.n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.y) {
            return;
        }
        this.y = true;
        h hVar = this.z;
        d dVar = this.A;
        synchronized (hVar) {
            int i = dVar.h - 1;
            dVar.h = i;
            if (i == 0 && dVar.f) {
                hVar.a0(dVar);
            }
        }
    }
}
