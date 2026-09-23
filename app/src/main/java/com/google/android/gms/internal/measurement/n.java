package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends r {
    public static final n b = new n(s.a);
    public final AtomicReference a;

    public n(r rVar) {
        this.a = new AtomicReference(rVar);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a(String str, Level level, boolean z) {
        ((r) this.a.get()).a(str, level, z);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final x b() {
        return ((r) this.a.get()).b();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final ka c() {
        return ((r) this.a.get()).c();
    }
}
