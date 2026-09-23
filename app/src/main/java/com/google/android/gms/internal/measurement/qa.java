package com.google.android.gms.internal.measurement;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa implements com.google.common.base.q {
    public final /* synthetic */ int e;
    public final /* synthetic */ com.google.common.base.q y;

    public /* synthetic */ qa(com.google.common.base.q qVar, int i) {
        this.e = i;
        this.y = qVar;
    }

    @Override // com.google.common.base.q
    public final Object get() {
        int i = this.e;
        com.google.common.base.q qVar = this.y;
        switch (i) {
            case 0:
                Object obj = na.j;
                return (dd) ((com.google.common.base.f) qVar.get()).c();
            default:
                com.google.common.util.concurrent.v0 v0Var = (com.google.common.util.concurrent.v0) qVar.get();
                v0Var.getClass();
                com.google.common.util.concurrent.z0 z0Var = new com.google.common.util.concurrent.z0(u6.c);
                return new com.google.common.util.concurrent.t0(z0Var, v0Var.y.schedule(z0Var, 10000L, TimeUnit.MILLISECONDS));
        }
    }
}
