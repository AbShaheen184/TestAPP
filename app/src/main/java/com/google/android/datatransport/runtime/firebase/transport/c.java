package com.google.android.datatransport.runtime.firebase.transport;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public enum c implements com.google.firebase.encoders.proto.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int e;

    c(int i) {
        this.e = i;
    }

    @Override // com.google.firebase.encoders.proto.c
    public final int getNumber() {
        return this.e;
    }
}
