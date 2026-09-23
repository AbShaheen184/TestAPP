package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.appsalt.internal.k0;
import com.google.android.datatransport.runtime.t;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final javax.inject.a a;
    public final javax.inject.a b;
    public final javax.inject.a c;
    public final t d;
    public final javax.inject.a e;
    public final javax.inject.a f;
    public final javax.inject.a g;

    public i(javax.inject.a aVar, javax.inject.a aVar2, javax.inject.a aVar3, t tVar, javax.inject.a aVar4, javax.inject.a aVar5, javax.inject.a aVar6) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = tVar;
        this.e = aVar4;
        this.f = aVar5;
        this.g = aVar6;
    }

    @Override // javax.inject.a
    public final Object get() {
        Context context = (Context) this.a.get();
        com.google.android.datatransport.runtime.backends.e eVar = (com.google.android.datatransport.runtime.backends.e) this.b.get();
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.c.get();
        com.google.android.datatransport.runtime.j jVar = (com.google.android.datatransport.runtime.j) this.d.get();
        Executor executor = (Executor) this.e.get();
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar2 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.f.get();
        com.google.android.material.shape.f fVar = new com.google.android.material.shape.f(20);
        com.google.android.gms.common.internal.k kVar = new com.google.android.gms.common.internal.k(20);
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar3 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.g.get();
        k0 k0Var = new k0();
        k0Var.a = context;
        k0Var.b = eVar;
        k0Var.c = gVar;
        k0Var.d = jVar;
        k0Var.e = executor;
        k0Var.f = gVar2;
        k0Var.g = fVar;
        k0Var.h = kVar;
        k0Var.i = gVar3;
        return k0Var;
    }
}
