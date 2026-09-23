package com.google.firebase.concurrent;

import com.google.android.gms.tasks.q;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements f {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ TimeUnit C;
    public final /* synthetic */ int e;
    public final /* synthetic */ e y;
    public final /* synthetic */ Runnable z;

    public /* synthetic */ c(e eVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.e = i;
        this.y = eVar;
        this.z = runnable;
        this.A = j;
        this.B = j2;
        this.C = timeUnit;
    }

    @Override // com.google.firebase.concurrent.f
    public final ScheduledFuture a(q qVar) {
        switch (this.e) {
            case 0:
                e eVar = this.y;
                return eVar.y.scheduleAtFixedRate(new d(eVar, this.z, qVar, 0), this.A, this.B, this.C);
            default:
                e eVar2 = this.y;
                return eVar2.y.scheduleWithFixedDelay(new d(eVar2, this.z, qVar, 2), this.A, this.B, this.C);
        }
    }
}
