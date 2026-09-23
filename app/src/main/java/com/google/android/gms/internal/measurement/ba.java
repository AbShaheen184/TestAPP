package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ba extends com.google.android.gms.common.internal.h {
    @Override // com.google.android.gms.common.internal.e, com.google.android.gms.common.api.c
    public final int i() {
        return 9410000;
    }

    @Override // com.google.android.gms.common.internal.e
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof aa ? (aa) iInterfaceQueryLocalInterface : new aa(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 2);
    }

    @Override // com.google.android.gms.common.internal.e
    public final com.google.android.gms.common.d[] q() {
        return h.d;
    }

    @Override // com.google.android.gms.common.internal.e
    public final String u() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // com.google.android.gms.common.internal.e
    public final String v() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
