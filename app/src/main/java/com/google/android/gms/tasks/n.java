package com.google.android.gms.tasks;

import androidx.appcompat.widget.z0;
import com.google.common.util.concurrent.k0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements p, f, e, c {
    public final Object A;
    public final /* synthetic */ int e;
    public final Executor y;
    public final Object z;

    public n(Executor executor, c cVar) {
        this.e = 0;
        this.z = new Object();
        this.y = executor;
        this.A = cVar;
    }

    @Override // com.google.android.gms.tasks.e
    public void F(Exception exc) {
        ((s) this.A).m(exc);
    }

    @Override // com.google.android.gms.tasks.p
    public final void a(i iVar) {
        switch (this.e) {
            case 0:
                if (((s) iVar).d) {
                    synchronized (this.z) {
                        try {
                            if (((c) this.A) != null) {
                                this.y.execute(new z0(this, 26));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.z) {
                    break;
                }
                this.y.execute(new k0(28, this, iVar, false));
                return;
            case 2:
                if (iVar.h() || ((s) iVar).d) {
                    return;
                }
                synchronized (this.z) {
                    try {
                        if (((e) this.A) != null) {
                            this.y.execute(new k0(29, this, iVar, false));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 3:
                if (iVar.h()) {
                    synchronized (this.z) {
                        try {
                            if (((f) this.A) != null) {
                                this.y.execute(new o(this, iVar, 0));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
                return;
            default:
                this.y.execute(new o(this, iVar, 1));
                return;
        }
    }

    @Override // com.google.android.gms.tasks.f
    public void b(Object obj) {
        ((s) this.A).k(obj);
    }

    @Override // com.google.android.gms.tasks.c
    public void x() {
        ((s) this.A).n();
    }

    public n(Executor executor, d dVar) {
        this.e = 1;
        this.z = new Object();
        this.y = executor;
        this.A = dVar;
    }

    public n(Executor executor, e eVar) {
        this.e = 2;
        this.z = new Object();
        this.y = executor;
        this.A = eVar;
    }

    public n(Executor executor, f fVar) {
        this.e = 3;
        this.z = new Object();
        this.y = executor;
        this.A = fVar;
    }

    public n(Executor executor, h hVar, s sVar) {
        this.e = 4;
        this.y = executor;
        this.z = hVar;
        this.A = sVar;
    }
}
