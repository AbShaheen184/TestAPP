package com.google.firebase.concurrent;

import com.google.android.gms.tasks.q;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.concurrent.futures.h implements ScheduledFuture {
    public final ScheduledFuture E;

    public g(f fVar) {
        this.E = fVar.a(new q(this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.E.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.h
    public final void e() {
        ScheduledFuture scheduledFuture = this.E;
        Object obj = this.e;
        scheduledFuture.cancel((obj instanceof androidx.concurrent.futures.a) && ((androidx.concurrent.futures.a) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.E.getDelay(timeUnit);
    }
}
