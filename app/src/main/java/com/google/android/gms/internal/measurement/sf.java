package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class sf extends androidx.room.t {
    public final /* synthetic */ int j;

    public /* synthetic */ sf(int i) {
        this.j = i;
    }

    @Override // androidx.room.t
    public final long A() {
        switch (this.j) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
