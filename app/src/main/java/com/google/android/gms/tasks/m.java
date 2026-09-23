package com.google.android.gms.tasks;

import com.google.common.util.concurrent.k0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements p, f, e, c {
    public final s A;
    public final /* synthetic */ int e;
    public final Executor y;
    public final b z;

    public /* synthetic */ m(Executor executor, b bVar, s sVar, int i) {
        this.e = i;
        this.y = executor;
        this.z = bVar;
        this.A = sVar;
    }

    @Override // com.google.android.gms.tasks.e
    public void F(Exception exc) {
        this.A.m(exc);
    }

    @Override // com.google.android.gms.tasks.p
    public final void a(i iVar) {
        switch (this.e) {
            case 0:
                this.y.execute(new k0(26, this, iVar, false));
                break;
            default:
                this.y.execute(new k0(27, this, iVar, false));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.f
    public void b(Object obj) {
        this.A.k(obj);
    }

    @Override // com.google.android.gms.tasks.c
    public void x() {
        this.A.n();
    }
}
