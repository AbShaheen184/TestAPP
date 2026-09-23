package coil3.decode;

import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements q {
    public boolean A;
    public final okio.h B;
    public final okio.k e;
    public final t1 y;
    public final Object z = new Object();

    public s(okio.h hVar, okio.k kVar, t1 t1Var) {
        this.e = kVar;
        this.y = t1Var;
        this.B = hVar;
    }

    @Override // coil3.decode.q
    public final okio.x I() {
        synchronized (this.z) {
            if (this.A) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // coil3.decode.q
    public final okio.h P() {
        okio.h hVar;
        synchronized (this.z) {
            try {
                if (this.A) {
                    throw new IllegalStateException("closed");
                }
                hVar = this.B;
                if (hVar == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.z) {
            try {
                this.A = true;
                okio.h hVar = this.B;
                if (hVar != null) {
                    try {
                        hVar.close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // coil3.decode.q
    public final okio.k getFileSystem() {
        return this.e;
    }

    @Override // coil3.decode.q
    public final t1 r() {
        return this.y;
    }
}
