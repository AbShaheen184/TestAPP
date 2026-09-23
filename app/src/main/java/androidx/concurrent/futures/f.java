package androidx.concurrent.futures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.imsdk.a {
    @Override // com.imsdk.a
    public final boolean c(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.y != dVar) {
                    return false;
                }
                hVar.y = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.imsdk.a
    public final boolean d(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.e != obj) {
                    return false;
                }
                hVar.e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.imsdk.a
    public final boolean e(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.z != gVar) {
                    return false;
                }
                hVar.z = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.imsdk.a
    public final void w(g gVar, g gVar2) {
        gVar.b = gVar2;
    }

    @Override // com.imsdk.a
    public final void x(g gVar, Thread thread) {
        gVar.a = thread;
    }
}
