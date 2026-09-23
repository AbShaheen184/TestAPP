package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends org.jsoup.helper.n {
    @Override // org.jsoup.helper.n
    public final void H(q qVar, q qVar2) {
        qVar.b = qVar2;
    }

    @Override // org.jsoup.helper.n
    public final void I(q qVar, Thread thread) {
        qVar.a = thread;
    }

    @Override // org.jsoup.helper.n
    public final boolean i(r rVar, f fVar, f fVar2) {
        synchronized (rVar) {
            try {
                if (rVar.y != fVar) {
                    return false;
                }
                rVar.y = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.jsoup.helper.n
    public final boolean j(r rVar, Object obj, Object obj2) {
        synchronized (rVar) {
            try {
                if (rVar.e != obj) {
                    return false;
                }
                rVar.e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.jsoup.helper.n
    public final boolean k(r rVar, q qVar, q qVar2) {
        synchronized (rVar) {
            try {
                if (rVar.z != qVar) {
                    return false;
                }
                rVar.z = qVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.jsoup.helper.n
    public final f p(r rVar) {
        f fVar;
        f fVar2 = f.d;
        synchronized (rVar) {
            try {
                fVar = rVar.y;
                if (fVar != fVar2) {
                    rVar.y = fVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Override // org.jsoup.helper.n
    public final q q(r rVar) {
        q qVar;
        q qVar2 = q.c;
        synchronized (rVar) {
            try {
                qVar = rVar.z;
                if (qVar != qVar2) {
                    rVar.z = qVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }
}
