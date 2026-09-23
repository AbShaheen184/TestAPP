package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class xf extends og {
    public static final /* synthetic */ int d = 0;
    public final AtomicLong c = new AtomicLong(-1);

    static {
        new uf(1);
    }

    @Override // com.google.android.gms.internal.measurement.og
    public final void a() {
        AtomicLong atomicLong = this.c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
