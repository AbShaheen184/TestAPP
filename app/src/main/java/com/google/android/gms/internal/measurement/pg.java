package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class pg extends og {
    public static final uf d = new uf(3);
    public static final androidx.compose.ui.platform.q0 e = new androidx.compose.ui.platform.q0(4);
    public final AtomicInteger c = new AtomicInteger();

    @Override // com.google.android.gms.internal.measurement.og
    public final void a() {
        this.c.decrementAndGet();
    }
}
