package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class db implements com.google.common.util.concurrent.z {
    public static final /* synthetic */ db b = new db(0);
    public static final /* synthetic */ db c = new db(2);
    public final /* synthetic */ int a;

    public /* synthetic */ db(int i) {
        this.a = i;
    }

    @Override // com.google.common.util.concurrent.z
    public final ListenableFuture apply(Object obj) {
        switch (this.a) {
            case 0:
                com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) obj;
                throw new cb(dVar.e.e, dVar.getMessage(), dVar);
            case 1:
                throw null;
            default:
                return com.google.common.util.concurrent.m0.d("");
        }
    }
}
