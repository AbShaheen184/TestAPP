package com.google.android.datatransport.runtime;

import android.content.Context;
import com.appsalt.internal.k0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final /* synthetic */ int a;
    public final javax.inject.a b;
    public final javax.inject.a c;
    public final com.google.android.datatransport.runtime.dagger.internal.b d;

    public /* synthetic */ t(javax.inject.a aVar, javax.inject.a aVar2, com.google.android.datatransport.runtime.dagger.internal.b bVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = aVar2;
        this.d = bVar;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new s(new com.google.android.material.shape.f(20), new com.google.android.gms.common.internal.k(20), (com.google.android.datatransport.runtime.scheduling.a) ((com.google.android.datatransport.runtime.scheduling.b) this.b).get(), (k0) ((com.google.android.datatransport.runtime.scheduling.jobscheduling.i) this.c).get(), (com.google.firebase.messaging.n) ((com.google.android.datatransport.runtime.scheduling.jobscheduling.k) this.d).get());
            default:
                return new j(2, (Context) this.b.get(), (com.google.android.datatransport.runtime.scheduling.persistence.g) this.c.get(), (com.google.android.datatransport.runtime.scheduling.jobscheduling.a) ((o) this.d).get());
        }
    }
}
