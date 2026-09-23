package com.google.android.gms.common.api;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends UnsupportedOperationException {
    public final com.google.android.gms.common.d e;

    public k(com.google.android.gms.common.d dVar) {
        this.e = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.e));
    }
}
