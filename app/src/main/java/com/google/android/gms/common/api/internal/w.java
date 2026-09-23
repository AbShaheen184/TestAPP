package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.compose.foundation.text.selection.q0;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends p {
    public final q0 b;
    public final com.google.android.gms.tasks.j c;
    public final a d;

    public w(int i, q0 q0Var, com.google.android.gms.tasks.j jVar, a aVar) {
        super(i);
        this.c = jVar;
        this.b = q0Var;
        this.d = aVar;
        if (i == 2 && q0Var.y) {
            kotlinx.coroutines.future.a.q("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final boolean a(k kVar) {
        return this.b.y;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final com.google.android.gms.common.d[] b(k kVar) {
        return (com.google.android.gms.common.d[]) this.b.z;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void c(Status status) {
        this.d.getClass();
        this.c.c(status.z != null ? new com.google.android.gms.common.api.j(status) : new com.google.android.gms.common.api.d(status));
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void d(Exception exc) {
        this.c.c(exc);
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void e(k kVar) throws DeadObjectException {
        com.google.android.gms.tasks.j jVar = this.c;
        try {
            q0 q0Var = this.b;
            ((h) ((q0) q0Var.A).z).accept(kVar.e, jVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(p.g(e2));
        } catch (RuntimeException e3) {
            jVar.c(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void f(androidx.work.impl.k kVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) kVar.z;
        com.google.android.gms.tasks.j jVar = this.c;
        map.put(jVar, boolValueOf);
        com.google.android.gms.tasks.s sVar = jVar.a;
        androidx.work.impl.k kVar2 = new androidx.work.impl.k(20, kVar, jVar, false);
        sVar.getClass();
        sVar.b.h(new com.google.android.gms.tasks.n(com.google.android.gms.tasks.k.a, kVar2));
        sVar.p();
    }
}
