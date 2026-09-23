package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final Object f = new Object();
    public final String a;
    public final w b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ e0(String str, Object obj, w wVar) {
        this.a = str;
        this.c = obj;
        this.b = wVar;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (d2.n == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (androidx.work.impl.model.f.v()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (e0 e0Var : f0.a) {
                        if (androidx.work.impl.model.f.v()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objA = null;
                        try {
                            w wVar = e0Var.b;
                            if (wVar != null) {
                                objA = wVar.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            e0Var.e = objA;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                w wVar2 = this.b;
                if (wVar2 != null) {
                    try {
                        return wVar2.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
