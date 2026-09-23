package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.j;
import com.google.android.gms.common.internal.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new j(1, (Context) ((d) this.b).b, new com.google.android.material.shape.f(20), new k(20));
            default:
                return this.b;
        }
    }
}
