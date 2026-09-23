package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class b0 {
    public static final Object i = new Object();
    public final Object a;
    public final androidx.arch.core.internal.f b;
    public volatile Object c;
    public volatile Object d;
    public int e;
    public boolean f;
    public boolean g;
    public final z h;

    public b0(int i2) {
        androidx.work.e0 e0Var = androidx.work.a0.c;
        this.a = new Object();
        this.b = new androidx.arch.core.internal.f();
        this.d = i;
        this.h = new z(this);
        this.c = e0Var;
        this.e = 0;
    }

    public final void a(a0 a0Var) {
        a0Var.getClass();
    }

    public final void b(androidx.room.t tVar) {
        boolean z;
        synchronized (this.a) {
            z = this.d == i;
            this.d = tVar;
        }
        if (z) {
            androidx.arch.core.executor.b bVarG0 = androidx.arch.core.executor.b.g0();
            z zVar = this.h;
            androidx.arch.core.executor.e eVar = bVarG0.m;
            if (eVar.o == null) {
                synchronized (eVar.m) {
                    try {
                        if (eVar.o == null) {
                            eVar.o = androidx.arch.core.executor.e.g0(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            eVar.o.post(zVar);
        }
    }

    public final void c(Object obj) {
        androidx.arch.core.executor.b.g0().m.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            kotlinx.coroutines.future.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.r("Cannot invoke ", "setValue", " on a background thread"));
        }
        this.e++;
        this.c = obj;
        if (this.f) {
            this.g = true;
            return;
        }
        this.f = true;
        do {
            this.g = false;
            androidx.arch.core.internal.f fVar = this.b;
            fVar.getClass();
            androidx.arch.core.internal.d dVar = new androidx.arch.core.internal.d(fVar);
            fVar.z.put(dVar, Boolean.FALSE);
            while (dVar.hasNext()) {
                a((a0) ((Map.Entry) dVar.next()).getValue());
                if (this.g) {
                    break;
                }
            }
        } while (this.g);
        this.f = false;
    }

    public b0() {
        this.a = new Object();
        this.b = new androidx.arch.core.internal.f();
        Object obj = i;
        this.d = obj;
        this.h = new z(this);
        this.c = obj;
        this.e = -1;
    }
}
