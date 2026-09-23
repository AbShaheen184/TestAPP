package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends n5 implements m0 {
    public final /* synthetic */ AtomicReference d;
    public final /* synthetic */ m3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(m3 m3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.d = atomicReference;
        this.e = m3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        d4 d4Var = (d4) o5.a(parcel, d4.CREATOR);
        o5.d(parcel);
        y(d4Var);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.m0
    public final void y(d4 d4Var) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            u0 u0Var = ((p1) this.e.e).C;
            p1.m(u0Var);
            u0Var.K.b(Integer.valueOf(d4Var.e.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(d4Var);
            atomicReference.notifyAll();
        }
    }
}
