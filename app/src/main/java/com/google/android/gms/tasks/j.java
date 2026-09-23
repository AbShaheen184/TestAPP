package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final s a = new s();

    public j(androidx.media3.exoplayer.hls.c cVar) {
        q qVar = new q(this);
        cVar.getClass();
        ((s) cVar.y).c(k.a, new androidx.media3.exoplayer.hls.c(cVar, qVar));
    }

    public final void a(Exception exc) {
        this.a.m(exc);
    }

    public final void b(Object obj) {
        this.a.k(obj);
    }

    public final boolean c(Exception exc) {
        s sVar = this.a;
        sVar.getClass();
        x.h(exc, "Exception must not be null");
        synchronized (sVar.a) {
            try {
                if (sVar.c) {
                    return false;
                }
                sVar.c = true;
                sVar.f = exc;
                sVar.b.i(sVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.a.l(obj);
    }

    public j() {
    }
}
