package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Closeable, Flushable {
    public final okhttp3.internal.cache.h e;

    public f(File file) {
        okio.t tVar = okio.k.e;
        String str = okio.x.y;
        okio.x xVarE = com.google.android.gms.measurement.internal.b0.e(file);
        tVar.getClass();
        okhttp3.internal.concurrent.d dVar = okhttp3.internal.concurrent.d.l;
        dVar.getClass();
        this.e = new okhttp3.internal.cache.h(tVar, xVarE, dVar);
    }

    public final void a() {
        okhttp3.internal.cache.h hVar = this.e;
        synchronized (hVar) {
            try {
                hVar.A();
                Collection collectionValues = hVar.F.values();
                collectionValues.getClass();
                for (okhttp3.internal.cache.d dVar : (okhttp3.internal.cache.d[]) collectionValues.toArray(new okhttp3.internal.cache.d[0])) {
                    dVar.getClass();
                    hVar.a0(dVar);
                }
                hVar.L = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.e.flush();
    }

    public final void g(b0 b0Var) {
        b0Var.getClass();
        okhttp3.internal.cache.h hVar = this.e;
        String strC = kotlin.enums.b.c(b0Var.a);
        synchronized (hVar) {
            strC.getClass();
            hVar.A();
            hVar.a();
            okhttp3.internal.cache.h.c0(strC);
            okhttp3.internal.cache.d dVar = (okhttp3.internal.cache.d) hVar.F.get(strC);
            if (dVar == null) {
                return;
            }
            hVar.a0(dVar);
            if (hVar.D <= hVar.z) {
                hVar.L = false;
            }
        }
    }
}
