package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends Exception {
    public final com.google.android.gms.common.b e;

    public y(com.google.android.gms.common.b bVar) {
        x.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.y == 0 || bVar.z == null) ? false : true);
        this.e = bVar;
    }
}
