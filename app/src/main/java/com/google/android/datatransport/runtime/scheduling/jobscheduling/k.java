package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.t;
import com.google.firebase.messaging.n;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final javax.inject.a a;
    public final javax.inject.a b;
    public final t c;
    public final javax.inject.a d;

    public k(javax.inject.a aVar, javax.inject.a aVar2, t tVar, javax.inject.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = tVar;
        this.d = aVar3;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new n((Executor) this.a.get(), (com.google.android.datatransport.runtime.scheduling.persistence.g) this.b.get(), (com.google.android.datatransport.runtime.j) this.c.get(), (com.google.android.datatransport.runtime.scheduling.persistence.g) this.d.get(), 21);
    }
}
