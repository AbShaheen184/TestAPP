package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.scheduling.persistence.g;
import com.google.android.datatransport.runtime.t;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final javax.inject.a a;
    public final javax.inject.a b;
    public final t c;
    public final javax.inject.a d;
    public final javax.inject.a e;

    public b(javax.inject.a aVar, javax.inject.a aVar2, t tVar, javax.inject.a aVar3, javax.inject.a aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = tVar;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new a((Executor) this.a.get(), (e) this.b.get(), (j) this.c.get(), (g) this.d.get(), (g) this.e.get());
    }
}
