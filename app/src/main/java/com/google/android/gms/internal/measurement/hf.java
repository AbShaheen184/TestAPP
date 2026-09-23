package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class hf extends ze {
    public static final hf D;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        D = new hf("<skip trace>", uuidRandomUUID, we.a(uuidRandomUUID), lf.e, bf.c());
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final qf T(String str, mf mfVar, pf pfVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final mf i() {
        return lf.e;
    }
}
