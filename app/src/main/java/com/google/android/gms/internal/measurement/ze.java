package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ze extends we {
    public final mf C;

    public ze(String str, we weVar, mf mfVar, pf pfVar) {
        super(str, weVar, pfVar);
        _COROUTINE.a.o(mfVar.c);
        this.C = mfVar;
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final mf c() {
        return mf.a(this.C, i());
    }

    public ze(String str, UUID uuid, String str2, mf mfVar, pf pfVar) {
        super(str, uuid, str2, pfVar);
        _COROUTINE.a.o(mfVar.c);
        this.C = mfVar;
    }
}
