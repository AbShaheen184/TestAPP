package retrofit2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends okhttp3.j0 {
    public final okio.b0 A;
    public IOException B;
    public final okhttp3.j0 z;

    public x(okhttp3.j0 j0Var) {
        this.z = j0Var;
        this.A = new okio.b0(new coil3.decode.b(this, j0Var.P()));
    }

    @Override // okhttp3.j0
    public final okio.h P() {
        return this.A;
    }

    @Override // okhttp3.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.z.close();
    }

    @Override // okhttp3.j0
    public final long n() {
        return this.z.n();
    }

    @Override // okhttp3.j0
    public final okhttp3.u x() {
        return this.z.x();
    }
}
