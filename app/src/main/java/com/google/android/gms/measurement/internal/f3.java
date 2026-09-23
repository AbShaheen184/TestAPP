package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends n5 implements k0 {
    public final /* synthetic */ AtomicReference d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(m3 m3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.d = atomicReference;
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void A(List list) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(y3.CREATOR);
        o5.d(parcel);
        A(arrayListCreateTypedArrayList);
        return true;
    }
}
