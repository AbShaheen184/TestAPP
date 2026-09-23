package com.google.firebase.messaging.reporting;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public enum b implements com.google.firebase.encoders.proto.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    public final int e;

    b(int i) {
        this.e = i;
    }

    @Override // com.google.firebase.encoders.proto.c
    public final int getNumber() {
        return this.e;
    }
}
