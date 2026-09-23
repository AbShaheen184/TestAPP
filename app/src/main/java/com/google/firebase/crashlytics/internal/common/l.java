package com.google.firebase.crashlytics.internal.common;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ m b;

    public l(m mVar, long j) {
        this.b = mVar;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.k.k(bundle);
        return null;
    }
}
