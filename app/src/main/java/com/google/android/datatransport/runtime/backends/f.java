package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.scheduling.persistence.i;
import com.google.android.gms.common.internal.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final /* synthetic */ int a;
    public final javax.inject.a b;
    public final javax.inject.a c;

    public /* synthetic */ f(javax.inject.a aVar, javax.inject.a aVar2, int i) {
        this.a = i;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new e((Context) ((d) this.b).b, (j) ((d) this.c).get());
            default:
                return new com.google.android.datatransport.runtime.scheduling.persistence.g(new com.google.android.material.shape.f(20), new k(20), com.google.android.datatransport.runtime.scheduling.persistence.a.f, (i) this.b.get(), this.c);
        }
    }
}
